package br.com.mentorama.cadastrodeproduto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.com.mentorama.cadastrodeproduto.db.EstoqueDB;
import br.com.mentorama.cadastrodeproduto.db.PedidoVendaDB;
import br.com.mentorama.cadastrodeproduto.db.ProdutosDB;
import br.com.mentorama.cadastrodeproduto.db.UsuarioDB;
import br.com.mentorama.cadastrodeproduto.models.*;


public class StartProgram {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuarioDB  usuariosDB = new UsuarioDB();
    static EstoqueDB  estoquesDB = new EstoqueDB();
    static PedidoVendaDB pedidoVendaDB = new PedidoVendaDB();


	public static void main(String[] args) throws Exception {
		
		String option;

		do {
			System.out.println(" <-----PEDIDO DE VENDAS----->");
			System.out.println(" 1 - Cadastrar produto");
			System.out.println(" 2 - Listar produtos do estoque");
			System.out.println(" 3 - Cadastrar usuario ADMINISTRADOR");
			System.out.println(" 4 - Cadastrar usuario CLIENTE");
			System.out.println(" 5 - Listar todos usuarios do sistemas");
			System.out.println(" 6 - Cadastrar um estoque de produto");
			System.out.println(" 7 - Listar estoques cadastrados");
			System.out.println(" 8 - Criar pedido de Venda");
			System.out.println(" 9 - Listar pedidos de venda");
			System.out.println(" 0 - Sair do sistema");

			System.out.print(" Qual operacao deseja realizar? : ");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			option = input.readLine();
			process(option);

		} while (!option.equals("0"));

	}

	// convertendo String em tipo Date
	public static LocalDate converteEmData(String data) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formato.parse(data);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Instant instante = date.toInstant();
		return instante.atZone(defaultZoneId).toLocalDate();
	}

	public static void process(String option) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		switch (option) {
			case "0" : {
				System.out.println("Saindo do sistema");
				break;
			}
			case "1": {
			    System.out.print("QUAL DESCRICAO DO PRODUTO ? ");
			    String descricao = input.readLine();
			    
			    System.out.print("QUAL O PRECO DO PRODUTO? ");
			    Double preco = Double.parseDouble(input.readLine());
			    
			    System.out.print("DATA DE VALIDADE ? ");
			    String dataString = input.readLine();

				LocalDate dataValidade = converteEmData(dataString);

			    Produto novoProduto = new Produto(descricao,preco,dataValidade);
			    produtosDB.addNovoProduto(novoProduto);

			     break;
		     }
		    case "2" :{
		    	 List<Produto> listaDeProdutos = produtosDB.getProdutosList();
		    	 System.out.println("******** LISTA DE PRODUTOS ************");
		    	 for(Produto produto : listaDeProdutos) {		    		    
					    System.out.println("---- ID: " + produto.getId());
					    System.out.println("---- DESCRICAO: " + produto.getDescricao().toUpperCase());
					    System.out.println("---- PRECO R$: " + produto.getPreco());
					    System.out.println("---- DATA DE VALIDADE: " + produto.getDataValidade());
					    System.out.println("---------------------------------------------------------");		    		 
		    	 }
		    	break;
		    }
			case "3" :{
				System.out.println(" Informe o nome do usuário Administrador: ");
				String nome = input.readLine();
				Admin novoAdmin = new Admin(nome);
				usuariosDB.addNovoUsuario(novoAdmin);
				break;
			}
			case "4":{
				System.out.println(" Informe o nome do usuário CLIENTE: ");
				String nome = input.readLine();
				Cliente novoCliente = new Cliente(nome);
				usuariosDB.addNovoUsuario(novoCliente);
				break;
			}
			case "5":{
				System.out.println("------------------------------------------");
				System.out.println("------------LISTA DE USUARIO--------------");
				System.out.println("------------------------------------------");

				for (User usuario: usuariosDB.getUsuarioList()) {
					System.out.print("ID: " + usuario.getId()+" ");
					System.out.print("NOME: " + usuario.getNome()+" ");
					System.out.print("TIPO: " + usuario.getTipoUsuario()+" ");
					System.out.println(" ");
				}
				break;
			}
			case "6":{
				System.out.println("------------------------------------------");
				System.out.println("-----CADASTRANDO ESTOQUE DE PRODUTO-------");
				System.out.println("------------------------------------------");

				System.out.println(" Qual o IDENTIFICADOR do estoque a ser cadastrado Ex:'CelEstoque'? ");
				String id = input.readLine();

				System.out.println(" Agora informe o (ID DO PRODUTO)  a ser adicionado ao estoque: ");
				Integer produtoId = Integer.parseInt(input.readLine());

				Produto produto = produtosDB.getProdutoPorId(produtoId);
				System.out.println("PRODUTO ID: " + produto.getId());
				System.out.println("PRODUTO DESCRICAO: " + produto.getDescricao());
				System.out.println("PRODUTO VALIDADE: " + produto.getDataValidade());

				System.out.println(" Quantidade de produtos a ser adicionado ao estoque:  ");
				Integer quantidade = Integer.parseInt(input.readLine());

                Estoque novoEstoque = new Estoque(id,produto,quantidade);
                estoquesDB.addNovoEstoque(novoEstoque);
				break;
			}
			case "7":{
				System.out.println("------------------------------------------");
				System.out.println("------------LISTA DE ESTOQUE--------------");
				System.out.println("------------------------------------------");

				for (Estoque estoque : estoquesDB.getEstoquesList()) {
					System.out.println("---- ID: " + estoque.getId());
					System.out.println("---- PRODUTO: " + estoque.getProoduto().getDescricao());
					System.out.println("---- QUANTIDADE : " + estoque.getQuantidade());
					System.out.println("---- PREÇO: " + estoque.getProoduto().getPreco());
					System.out.println("---------------------------------------------------------");
				}
				break;
			}
			case "8": {
				System.out.println("------------PEDIDO DE VENDA --------------");

				System.out.println("Informe o ID do cliente");
				int idCliente = Integer.parseInt(input.readLine());

				Cliente cliente = (Cliente )usuariosDB.getUserbyId(idCliente);
				System.out.println("ID: "+cliente.getId());
				System.out.println("NOME: "+cliente.getNome());
				System.out.println("TIPO: "+cliente.getTipoUsuario());
				System.out.println("TIPO: "+cliente.getTipoUsuario());
				System.out.println("----------------------------------------------");

				System.out.println("Informe o ID do produto");
				int idProduto = Integer.parseInt(input.readLine());

				Produto produto = produtosDB.getProdutoPorId(idProduto);
				System.out.println("ID: "+produto.getId());
				System.out.println("NOME: "+produto.getDescricao());
				System.out.println("VALIDADE: "+produto.getDataValidade());
				System.out.println("----------------------------------------------");

				System.out.println("Quantidade ? : ");
				int pedidoQuantidade = Integer.parseInt(input.readLine());

				PedidoVenda novoPedido = new PedidoVenda(cliente,produto,pedidoQuantidade);
				pedidoVendaDB.addNovoPedidoVenda(novoPedido);
				break;

			}
			case "9":{
				System.out.println("------------------------------------------");
				System.out.println("-------LISTANDO PEDIDO DE VENDAS ----------");
				System.out.println("-------------------------------------------");

				for (PedidoVenda pedidoVenda : pedidoVendaDB.getPedidoVendaList()) {
					System.out.println("ID: " + pedidoVenda.getId());
					System.out.println("CLIENTE: " + pedidoVenda.getCliente().getNome());
					System.out.println("PRODUTO: " + pedidoVenda.getProduto().getDescricao() );
					System.out.println("QUANTIDADE: " + pedidoVenda.getQuantidade());
					System.out.println("VALOR TOTAL: " + pedidoVenda.getValorTotal());
				}
				break;
			}
			default:{
				System.out.println("ERRO : Nenhuma opção valida DIGITE NOVAMENTE");
			}
		}
	}

}
