package presentation;

import java.util.List;
import java.util.Scanner;

import entities.*;
import persistance.*;


public class Screen {

	
	public static boolean checkPassword (String a, String b) {
		
		if (a.equals(b)) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	
	public static void main(String[] args) {

//		BLOCO PARA ADICIONAR

//		User user = new User();
//		
//		user.setName("hdtgdh");
//		
//		user.setUsername("djydkyul");
//		
//		user.setPassword("nomnom");
//		
//		UserDAO userDAO = new UserDAO();
//		
//		user = userDAO.add(user);

		
//		Badge badge = new Badge();
//		
//		badge.setPointsValue(600);
//		
//		badge.setName("Watamerda");
//		
//		badge.setDescription("Bééé!");
//		
//		BadgeDAO badgeDAO = new BadgeDAO();
//		
//		badgeDAO.add(badge);

		
//		Friend friend = new Friend();
//		
//		friend.setName("Ray William Johnson");
//		
//		friend.setFpoints(420);
//		
//		friend.setPicture("C:/sua_mae/aquela_linda");
//		
//		FriendDAO friendDAO = new FriendDAO();
//		
//		friendDAO.add(friend);

		
//		Hscore60 hscore60 = new Hscore60();
//		
//		hscore60.setPlayerName("Rei Delas");
//		
//		hscore60.setPlayerScore(80085);
//		
//		hscore60.setTime(27.3);
//		
//		hscore60.setAverageCps(4.2);
//		
//		Hscore60DAO hscore60DAO = new Hscore60DAO();
//		
//		hscore60DAO.add(hscore60);

		
		
//		BLOCO PARA EDITAR
//		
//		User user = new User();
//				
//		user.setName("Jeremias Delas");
//		
//		user.setUsername("TheLegend69");
//		
//		user.setPassword("3picTr0llz!!");
//		
//		user.setIdUser(4);
//		
//		
//		UserDAO userDAO = new UserDAO();
//		
//		userDAO.edit(user);

		
//		Badge badge = new Badge();
//		
//		badge.setPointsValue(500);
//		
//		badge.setName("PekoSuja");
//		
//		badge.setDescription("Do Manogamer e de Satan");
//		
//		badge.setIdBadge(2);
//		
//		BadgeDAO badgeDAO = new BadgeDAO();
//		
//		badgeDAO.edit(badge);

		
//		Friend friend = new Friend();
//		
//		friend.setName("Ray William Johnson");
//		
//		friend.setFpoints(420);
//		
//		friend.setPicture("C:/sua_mae/aquela_safada");
//		
//		friend.setIdFriend(1);
//		
//		FriendDAO friendDAO = new FriendDAO();
//		
//		friendDAO.edit(friend);

		
//		Hscore60 hscore60 = new Hscore60();
//		
//		hscore60.setPlayerName("Rei Delas Ltda");
//		
//		hscore60.setPlayerScore(80085);
//		
//		hscore60.setTime(27.36);
//		
//		hscore60.setAverageCps(4.27);
//		
//		hscore60.setId60(1);
//		
//		Hscore60DAO hscore60DAO = new Hscore60DAO();
//		
//		hscore60DAO.edit(hscore60);

		
		
		
//		BLOCO DE EXCLUSAO
//		
//		User user = new User();
//		
//		user.setIdUser(2);
//		
//		UserDAO userDAO = new UserDAO();
//		
//		userDAO.delete(user);
//		

//		Badge badge = new Badge();
//		
//		badge.setIdBadge(2);
//		
//		BadgeDAO badgeDAO = new BadgeDAO();
//		
//		badgeDAO.delete(badge);

		
//		Friend friend = new Friend();
//		
//		friend.setIdFriend(1);
//		
//		FriendDAO friendDAO = new FriendDAO();
//		
//		friendDAO.delete(friend);

		
//		Hscore60 hscore60 = new Hscore60();
//		
//		hscore60.setId60(2);
//		
//		Hscore60DAO hscore60DAO = new Hscore60DAO();
//		
//		hscore60DAO.delete(hscore60);

		
		
		
//		BLOCO DE BUSCA POR ID
//		
//		UserDAO userDAO = new UserDAO();
//		
//		User user = userDAO.searchById(4);
//		
//		System.out.println(user.toString() + "\n");

		
//		BadgeDAO badgeDAO = new BadgeDAO();
//		
//		Badge badge = badgeDAO.searchById(3);
//		
//		System.out.println(badge.toString() + "\n");

		
//		FriendDAO friendDAO = new FriendDAO();
//		
//		Friend friend = friendDAO.searchById(6);
//		
//		System.out.println(friend.toString() + "\n");

		
//		Hscore60DAO hscore60DAO = new Hscore60DAO();
//		
//		Hscore60 hscore60 = hscore60DAO.searchById(1);
//		
//		System.out.println(hscore60.toString() + "\n");
//		
//		hscore60DAO.add(hscore60);

		
		
		
//		BLOCO DE BUSCA POR TODOS
//		
//		UserDAO userDAO = new UserDAO();
//		
//		List<User> listUser = userDAO.searchAll();
//		
//		System.out.println(listUser);

		
//		BadgeDAO badgeDAO = new BadgeDAO();
//		
//		List<Badge> listBadge = badgeDAO.searchAll();
//		
//		System.out.println(listBadge + "\n");

		
//		FriendDAO friendDAO = new FriendDAO();
//		
//		List<Friend> listFriend = friendDAO.searchAll();
//		
//		System.out.println(listFriend + "\n");

		
//		Hscore60DAO hscore60DAO = new Hscore60DAO();
//		
//		List<Hscore60> list60 = hscore60DAO.searchAll();
//		
//		System.out.println(list60 + "\n");

		
		
		Scanner input = new Scanner(System.in);

		
		// i -> controlador da janela de testes, h -> hscore selecionado
		int i = 0, h = 0;

		while (i != 13) {
			
			
			switch (i) {

			case 0:

				System.out.println(" ____________________________________________\n"
								 + "|                                            |\n"
								 + "|   Janela de testes:                        |\n"
								 + "|                                            |\n"
								 + "|      1 - Adicionar usuário                 |\n"
								 + "|      2 - Editar cadastro                   |\n"
								 + "|      3 - Excluir conta                     |\n"
								 + "|      4 - Consultar dados                   |\n"
								 + "|                                            |\n"
								 + "|      5 - Adicionar badge à sua conta       |\n"
								 + "|      6 - Consultar badges                  |\n"
								 + "|      7 - Editar badge                      |\n"
								 + "|      8 - Excluir badge                     |\n"
								 + "|                                            |\n"
								 + "|    Recordes 15s, 30s, 60s:                 |\n"
								 + "|                                            |\n"
								 + "|      9 - Adicionar/selecionar recorde      |\n"
								 + "|     10 - Editar recorde                    |\n"
								 + "|     11 - Consultar recordes                |\n"
								 + "|     12 - Excluir recordes                  |\n"
								 + "|                                            |\n"
								 + "|     13 - Sair da sessão                    |\n"
								 + "|                                            |");

				if (h == 0) {
					
					System.out.println("|     Nenhum recorde selecionado             |\n"
									 + "|____________________________________________|\n");
					
				} else {
					
					System.out.println("|     Recorde selecionado: " + h + "                |\n"
									 + "|____________________________________________|\n");

				}
				
				i = input.nextInt();
				
				break;

				
			// adicionar usuario	
			case 1 :

				User user = new User();

				
				System.out.println("Digite seu primeiro nome:");

				user.setName(input.next());

				
				System.out.println("Digite seu apelido:");

				user.setUsername(input.next());

				
				System.out.println("Digite sua senha:");

				user.setPassword(input.next());

				
				System.out.println("Aguarde...");
				
				UserDAO userDAO = new UserDAO();

				user = userDAO.add(user);

				System.out.println("Inscrição realizada!\nUsuário: " + user.toString());

				
				i = 0;

				break;
			
				
			// editar usuario	
			case 2 :
				
				int n = 1;
								
				User u = new User();
				
				UserDAO userdao = new UserDAO();
				
				
				System.out.println("Digite seu apelido para poder editar sua conta:");			
				
				u.setIdUser(userdao.searchIdByUsername(input.next()));
				
				System.out.println("\nAguarde...\n");
				
				u = userdao.searchById(u.getIdUser());
				
				while (n != 5) {
				
					System.out.println("Digite o que você deseja editar:\n"
							  	 	+ "1 - Nome\n"
							  	 	+ "2 - Apelido\n"
							  	 	+ "3 - Senha\n"
							  	 	+ "4 - Foto\n"
							  	 	+ "5 - Sair");
				
					n = input.nextInt();
				
					System.out.println("\nAcessando...\n");
					
					switch (n) {
						
					
					// alterar nome
					case 1 :
												
						
						System.out.println("Digite o novo nome:");
						
						u.setName(input.next());
						
						
						System.out.println("Aguarde...");
						
						userdao.edit(u);
						
						
						System.out.println("\nEditado com sucesso!\nUsuário: " + u.toString() + "\n");
						
						break;
				
						
					// alterar apelido	
					case 2 :
						
						
						System.out.println("Digite o novo apelido:");
						
						u.setUsername(input.next());

						
						System.out.println("Aguarde...");
						
						userdao.edit(u);
												
						System.out.println("Editado com sucesso!\nUsuário: " + u.toString() + "\n");
						
						break;
						
						
					// alterar senha
					case 3 :
						
						
						System.out.println("Digite a nova senha duas vezes:");
						
						String senhaA = input.next();
						
						
						if (checkPassword(senhaA, input.next()) == true) {
							
							u.setPassword(senhaA);
							
							System.out.println("Aguarde...");
							
							userdao.edit(u);
							
							System.out.println("Editado com sucesso!\nUsuário: " + u.toString() + "\n");
							
						} 
						
						else
							
						{
							
							System.out.println("As duas senhas são diferentes, tente novamente.");
							
						}
						
						
						break;
						
						
					// alterar foto
					case 4 :
						
						System.out.println("Digite o endereço da imagem a ser escolhida:");
						
						u.setPicture(input.next());
						
						
						System.out.println("Aguarde...");
						
						userdao.edit(u);
												
						System.out.println("Editado com sucesso!\nUsuário: " + u.toString() + "\n");
						
						break;
						
						
					// sair
					case 5:
						
							i = 0;
							
							System.out.println("Saindo...\n");
							
						break;
						
					default :
						
							System.out.println("Número inválido\n");
						
						break;
					}
				
				}
				
				break;
			
				
			// excluir conta	
			case 3 :
				
				User u2 = new User();
				
				UserDAO uDAO = new UserDAO();
				
				
				System.out.println("Digite o apelido da conta a ser excluída:\n");
				
				u2.setIdUser(uDAO.searchIdByUsername(input.next()));
				
				
				System.out.println("Aguarde...");
				
				uDAO.delete(u2);
				
				System.out.println("Excluído com sucesso!");
				
				i = 0;
				
				break;
			
				
			// consultar dados usuario
			case 4 :
				
				User u3 = new User();
				
				UserDAO uDAO2 = new UserDAO();

				
				System.out.println("Digite o apelido da conta a ser consultada:");
				
				u3.setIdUser(uDAO2.searchIdByUsername(input.next()));
				
				System.out.println("Aguarde...");
				
				u3 = uDAO2.searchById(u3.getIdUser());
				
				System.out.println("Usuário: " + u3.toString());
				
				i = 0;
				
				break;
				
				
			// adicionar badge
			case 5 :
				
				Badge b = new Badge();
				
				BadgeDAO bDAO = new BadgeDAO();
				
				
				System.out.println("Digite o apelido do usuário que possui este badge:");
				
				User u4 = new User();
				
				UserDAO uDAO3= new UserDAO();
				
				u4.setIdUser(uDAO3.searchIdByUsername(input.next()));
				
				b.setUser(u4);

				
				System.out.println("Digite o nome do badge:");
				
				b.setName(input.next());
				
				input.nextLine();
				// este nextLine serve para o próximo conseguir ler a entrada sem erros
				
				
				System.out.println("Digite a descrição do badge:");
					
				b.setDescription(input.nextLine());
					
				
				System.out.println("Digite o valor em pontos do badge:");
				
				b.setPointsValue(input.nextLong());
								
				
				System.out.println("Aguarde...");
				
				bDAO.add(b);
				
				b.setIdBadge(bDAO.searchIdByBadgeName(b.getName()));
				
				System.out.println("Adicionado com sucesso!\nBadge:" + b.toString());
				
				i = 0;
				
				break;
			
				
			// consultar badges
			case 6 :
				
				System.out.println("Digite o apelido do usuário que possui os badges:");
				
				User ub1 = new User();
				
				UserDAO ubDAO= new UserDAO();
				
				ub1.setIdUser(ubDAO.searchIdByUsername(input.next()));
				
				ub1 = ubDAO.searchById(ub1.getIdUser());
				
				BadgeDAO badgeDAO = new BadgeDAO();
				
				List<Badge> listBadge = badgeDAO.searchAllBadgesByUserId(ub1.getIdUser());
				
				System.out.println("Seus badges:\n" + listBadge + "\n");
				
				i = 0;
				
				break;
				
				
			// editar badges
			case 7 :
				
				int x = 1;
				
				Badge badge = new Badge();
				
				BadgeDAO badgedao = new BadgeDAO();
				
				
				System.out.println("Digite o nome do badge para poder editá-lo:");			
				
				badge.setIdBadge(badgedao.searchIdByBadgeName(input.next()));
				
				System.out.println("\nAguarde...\n");
				
				badge = badgedao.searchById(badge.getIdBadge());
				
				
				while (x != 5) {
				
					System.out.println("Digite o que você deseja editar:\n"
							  	 	+ "1 - Nome\n"
							  	 	+ "2 - Valor em pontos\n"
							  	 	+ "3 - Descrição\n"
							  	 	+ "4 - Dono do badge\n"
							  	 	+ "5 - Sair\n");
				
					n = input.nextInt();
				
					System.out.println("\nAcessando...\n");
					
					switch (n) {
						
					
					// alterar nome
					case 1 :
						
						
						System.out.println("Digite o novo nome:");
						
						badge.setName(input.next());
						
						
						System.out.println("Aguarde...");
						
						badgedao.edit(badge);
						
						System.out.println("\nEditado com sucesso!\nBadge: " + badge.toString() + "\n");
						
						break;
				
						
					// alterar valor	
					case 2 :
						
						
						System.out.println("Digite o novo valor:");
						
						badge.setPointsValue(input.nextLong());
						
						
						System.out.println("Aguarde...");
						
						badgedao.edit(badge);
												
						System.out.println("Editado com sucesso!\nBadge: " + badge.toString() + "\n");
						
						break;
						
						
					// alterar descricao
					case 3 :
						
						input.nextLine();
						
						System.out.println("Digite a nova descrição:");
						
						badge.setDescription(input.nextLine());
						
						
						System.out.println("Aguarde...");
						
						badgedao.edit(badge);
												
						System.out.println("Editado com sucesso!\nBadge: " + badge.toString() + "\n");

						
						break;
						
						
					// alterando dono do badge	
					case 4 :
						
						
						System.out.println("Digite o nome do dono do badge:");
						
						User ub = new User();
						
						UserDAO ubdao = new UserDAO();
						
						ub.setIdUser(ubdao.searchIdByUsername(input.next()));
						
						
						ub = ubdao.searchById(ub.getIdUser());
						
						badge.setUser(ub);
						
						System.out.println("Aguarde...");
						
						badgedao.edit(badge);
						
						System.out.println("Badge:" + badge.toString());
						
						break;
						
						
					// sair
					case 5 :
						
						i = 0;
						
						x = 5;
						
						System.out.println("Saindo...\n");
						
						break;
						
										
					default :
						
							System.out.println("Número inválido\n");
						
						break;
					}
				
				}
				
				break;

				
				
			// excluir badges 
			case 8 :
				
				Badge b1 = new Badge();
				
				BadgeDAO b1DAO = new BadgeDAO();

				
				System.out.println("Digite o nome do badge que você quer excluir:");
				
				b1.setIdBadge(b1DAO.searchIdByBadgeName(input.next()));
				
				
				b1DAO.delete(b1);

				System.out.println("Excluído com sucesso!");
				
				i = 0;
				
				break;	

			
			// escolhendo qual hscore irá usar, hscore15, hscore30 ou hscore60
			case 9 :
				
				
				System.out.println("Digite 15, 30 ou 60 para selecionar o recorde desejado.");
				
				h = input.nextInt();
				
				
				System.out.println("Recorde " + h + " selecionado, deseja voltar ao menu?(y/n)");
				
				String a = input.next();
				
				
				if (a.equalsIgnoreCase("y")) {
					
					i = 0;
					
					System.out.println("Saindo...\n");
					
				}
				
				else if (a.equalsIgnoreCase("n")) 
				
				{
					
					switch (h) {
					
					
					// adicionando hscore15
					case 15 :
						
						Hscore15 hscore15 = new Hscore15();
						
						
						System.out.println("Digite o seu apelido:");
						
						hscore15.setPlayerName(input.next());
						
						
						System.out.println("\nDigite seu recorde:");
						
						hscore15.setPlayerScore(input.nextLong());
						
						
						System.out.println("\nDigite o tempo levado:");
						
						hscore15.setTime(Double.parseDouble(input.next()));
						
						
						System.out.println("\nDigite sua média de cliques por segundo:");
						
						hscore15.setAverageCps(Double.parseDouble(input.next()));
						
						
						Hscore15DAO hscore15DAO = new Hscore15DAO();
						
						System.out.println("Aguarde...");
						
						hscore15DAO.add(hscore15);
						
						hscore15.setId15(hscore15DAO.searchIdByUsername(hscore15.getPlayerName()));
						
						System.out.println("Adicionado com sucesso!\nRecorde: " + hscore15.toString());
						
						i = 0;
						
						break;
						
						
					// adicionando hscore30	
					case 30 :
						
						Hscore30 hscore30 = new Hscore30();
						
						
						System.out.println("Digite o seu apelido:");
						
						hscore30.setPlayerName(input.next());
						
						
						System.out.println("\nDigite seu recorde:");
						
						hscore30.setPlayerScore(input.nextLong());
						
						
						System.out.println("\nDigite o tempo levado:");
						
						hscore30.setTime(Double.parseDouble(input.next()));
						
						
						System.out.println("\nDigite sua média de cliques por segundo:");
						
						hscore30.setAverageCps(Double.parseDouble(input.next()));
						
						
						Hscore30DAO hscore30DAO = new Hscore30DAO();
						
						hscore30DAO.add(hscore30);
						
						hscore30.setId30(hscore30DAO.searchIdByUsername(hscore30.getPlayerName()));

						System.out.println("Adicionado com sucesso!\nRecorde: " + hscore30.toString());
						
						i = 0;

						
						break;	
						
						
					// adicionando hscore60	
					case 60 :
						
						Hscore60 hscore60 = new Hscore60();
						
						
						System.out.println("Digite o seu apelido:");
						
						hscore60.setPlayerName(input.next());
						
						
						System.out.println("\nDigite seu recorde:");
						
						hscore60.setPlayerScore(input.nextLong());
						
						
						System.out.println("\nDigite o tempo levado:");
						
						hscore60.setTime(Double.parseDouble(input.next()));
						
						
						System.out.println("\nDigite sua média de cliques por segundo:");
						
						hscore60.setAverageCps(Double.parseDouble(input.next()));
						
						
						Hscore60DAO hscore60DAO = new Hscore60DAO();
						
						hscore60DAO.add(hscore60);
						
						hscore60.setId60(hscore60DAO.searchIdByUsername(hscore60.getPlayerName()));
						
						System.out.println("Adicionado com sucesso!\nRecorde: " + hscore60.toString());
						
						i = 0;

						
						break;
						
						
					default :
						
						System.out.println("Recorde inválido.");
						
						i = 0;
						
						break;
					}	
					
				}
				
				else 
				
				{
					
					System.out.println("Inválido.");
					
					i = 0;
					
				}
				
				
				break;	

				
			// editar hscore selecionado
			case 10 :
				
				
				switch (h) {
				
				
				// editar hscore15
				case 15 :
					
					n = 0;
					
					Hscore15 h15 = new Hscore15();
					
					Hscore15DAO h15DAO = new Hscore15DAO();
					
					
					System.out.println("Digite seu apelido que está no recorde:");
					
					h15.setId15(h15DAO.searchIdByUsername(input.next()));
					
					
					h15 = h15DAO.searchById(h15.getId15());
					
					while (n != 5) {
						
						System.out.println("Digite o que você deseja editar:\n"
								  	 	+ "1 - Apelido\n"
								  	 	+ "2 - Pontuação\n"
								  	 	+ "3 - Tempo\n"
								  	 	+ "4 - Média de cliques/segundo\n"
								  	 	+ "5 - Sair");
					
						n = input.nextInt();
					
						System.out.println("\nAcessando...\n");
						
						switch (n) {
							
						
						// alterar apelido
						case 1 :
							
							
							System.out.println("Digite o novo apelido:");
							
							h15.setPlayerName(input.next());
							
							
							System.out.println("Aguarde...");
														
							h15DAO.edit(h15);
							
							
							System.out.println("\nEditado com sucesso!\nRecorde: " + h15.toString() + "\n");
							
							break;
					
							
						// alterar pontuacao	
						case 2 :
							
							System.out.println("Digite a nova pontuação:");
							
							h15.setPlayerScore(input.nextLong());
							
							
							System.out.println("Aguarde...");
							
							h15DAO.edit(h15);
														
							System.out.println("Editado com sucesso!\nRecorde: " + h15.toString() + "\n");
							
							break;
							
							
						// alterar tempo
						case 3 :
							
							System.out.println("Digite o novo tempo:");							
							
							h15.setTime(Double.parseDouble(input.next()));
							
								
							System.out.println("Aguarde...");
								
							h15DAO.edit(h15);
															
							System.out.println("Editado com sucesso!\nRecorde: " + h15.toString() + "\n");
								
							
							break;
							
							
						// alterar cliques/s
						case 4 :
							
							System.out.println("Digite sua nova média de cliques/segundo:");
							
							h15.setAverageCps(Double.parseDouble(input.next()));
							
							
							System.out.println("Aguarde...");
							
							h15DAO.edit(h15);
														
							System.out.println("Editado com sucesso!\nRecorde: " + h15.toString() + "\n");
							
							break;
							
							
						// sair
						case 5:
							
								i = 0;
								
								System.out.println("Saindo...\n");
								
							break;
							
						default :
							
								System.out.println("Número inválido\n");
							
							break;
							
						}
						
					}

					
					break;
					
				
				// editar hscore30
				case 30 :
					
					n = 0;
					
					Hscore30 h30 = new Hscore30();
					
					Hscore30DAO h30DAO = new Hscore30DAO();
					
					
					System.out.println("Digite seu apelido que está no recorde:");
					
					h30.setId30(h30DAO.searchIdByUsername(input.next()));
					
					
					h30 = h30DAO.searchById(h30.getId30());
					
					while (n != 5) {
						
						System.out.println("Digite o que você deseja editar:\n"
								  	 	+ "1 - Apelido\n"
								  	 	+ "2 - Pontuação\n"
								  	 	+ "3 - Tempo\n"
								  	 	+ "4 - Média de cliques/segundo\n"
								  	 	+ "5 - Sair");
					
						n = input.nextInt();
					
						System.out.println("\nAcessando...\n");
						
						switch (n) {
							
						
						// alterar apelido
						case 1 :
							
							
							System.out.println("Digite o novo apelido:");
							
							h30.setPlayerName(input.next());
							
							
							System.out.println("Aguarde...");
														
							h30DAO.edit(h30);
														
							System.out.println("\nEditado com sucesso!\nRecorde: " + h30.toString() + "\n");
							
							break;
					
							
						// alterar pontuacao	
						case 2 :
							
							
							System.out.println("Digite a nova pontuação:");
							
							h30.setPlayerScore(input.nextLong());
							
							
							System.out.println("Aguarde...");
							
							h30DAO.edit(h30);
														
							System.out.println("Editado com sucesso!\nRecorde: " + h30.toString() + "\n");
							
							break;
							
							
						// alterar tempo
						case 3 :
							
							
							System.out.println("Digite o novo tempo:");							
							
							h30.setTime(Double.parseDouble(input.next()));
								
							
							System.out.println("Aguarde...");
								
							h30DAO.edit(h30);
															
							System.out.println("Editado com sucesso!\nRecorde: " + h30.toString() + "\n");
								
							
							break;
							
							
						// alterar cliques/s
						case 4 :
							
							
							System.out.println("Digite sua nova média de cliques/segundo:");
							
							h30.setAverageCps(Double.parseDouble(input.next()));
							
							
							System.out.println("Aguarde...");
							
							h30DAO.edit(h30);
							
							
							System.out.println("Editado com sucesso!\nRecorde: " + h30.toString() + "\n");
							
							break;
							
							
						// sair
						case 5:
							
								i = 0;
								
								System.out.println("Saindo...\n");
								
							break;
							
						default :
							
							i = 0;
							
							System.out.println("Número inválido\n");
							
							break;
						
						}
					
					}
					
					break;
					
					
				// editar hscore60
				case 60 :
					
					n = 0;
					
					Hscore60 h60 = new Hscore60();
					
					Hscore60DAO h60DAO = new Hscore60DAO();
					
					
					System.out.println("Digite seu apelido que está no recorde:");
					
					h60.setId60(h60DAO.searchIdByUsername(input.next()));
					
					
					h60 = h60DAO.searchById(h60.getId60());
					
					while (n != 5) {
						
						System.out.println("Digite o que você deseja editar:\n"
								  	 	+ "1 - Apelido\n"
								  	 	+ "2 - Pontuação\n"
								  	 	+ "3 - Tempo\n"
								  	 	+ "4 - Média de cliques/segundo\n"
								  	 	+ "5 - Sair");
					
						n = input.nextInt();
					
						System.out.println("\nAcessando...\n");
						
						switch (n) {
							
						
						// alterar apelido
						case 1 :
							
							
							System.out.println("Digite o novo apelido:");
							
							h60.setPlayerName(input.next());
							
							
							System.out.println("Aguarde...");
														
							h60DAO.edit(h60);
							
							System.out.println("\nEditado com sucesso!\nRecorde: " + h60.toString() + "\n");
							
							break;
					
							
						// alterar pontuacao	
						case 2 :
							
							
							System.out.println("Digite a nova pontuação:");
							
							h60.setPlayerScore(input.nextLong());
							
							
							System.out.println("Aguarde...");
							
							h60DAO.edit(h60);
														
							System.out.println("Editado com sucesso!\nRecorde: " + h60.toString() + "\n");
							
							break;
							
							
						// alterar tempo
						case 3 :
							
							
							System.out.println("Digite o novo tempo:");							
							
							h60.setTime(Double.parseDouble(input.next()));
								
							
							System.out.println("Aguarde...");
								
							h60DAO.edit(h60);
															
							System.out.println("Editado com sucesso!\nRecorde: " + h60.toString() + "\n");
								
							
							break;
							
							
						// alterar cliques/s
						case 4 :
							
							
							System.out.println("Digite sua nova média de cliques/segundo:");
							
							h60.setAverageCps(Double.parseDouble(input.next()));
							
							
							System.out.println("Aguarde...");
							
							h60DAO.edit(h60);
							
							System.out.println("Editado com sucesso!\nRecorde: " + h60.toString() + "\n");
							
							break;
							
							
						// sair
						case 5:
							
								i = 0;
								
								System.out.println("Saindo...\n");
								
							break;
							
						default :
							
								i = 0;
							
								System.out.println("Número inválido\n");
							
							break;
						
						}
					
					}

					
					break;
					
					
				default :
					
					i = 0;
					
					System.out.println("Recorde inválido");
					
					break;
				}
	
				
				break;	

				
			// consultar hscore selecionado
			case 11 :
				
				switch (h) {
				
				case 15 :
					
					Hscore15 hs15 = new Hscore15();
					
					Hscore15DAO hs15dao = new Hscore15DAO();
					
					
					System.out.println("Digite o apelido que está no seu recorde:");					
					
					hs15.setId15(hs15dao.searchIdByUsername(input.next()));
					
					
					hs15 = hs15dao.searchById(hs15.getId15());
					
					System.out.println("Recorde: " + hs15.toString());
					
					
					break;
					
					
				case 30 :
					
					Hscore30 hs30 = new Hscore30();
					
					Hscore30DAO hs30dao = new Hscore30DAO();
					
					
					System.out.println("Digite o apelido que está no seu recorde:");
					
					hs30.setId30(hs30dao.searchIdByUsername(input.next()));
					
					
					hs30 = hs30dao.searchById(hs30.getId30());
					
					System.out.println("Recorde: " + hs30.toString());
					
					
					break;
					
					
				case 60 :
					
					Hscore60 hs60 = new Hscore60();
					
					Hscore60DAO hs60dao = new Hscore60DAO();
					
					
					System.out.println("Digite o apelido que está no seu recorde:");
					
					hs60.setId60(hs60dao.searchIdByUsername(input.next()));
					
					
					hs60 = hs60dao.searchById(hs60.getId60());
					
					System.out.println("Recorde: " + hs60.toString());
					
					
					break;
				
					
				default :
					
					System.out.println("Recorde inválido");
					
					break;
				}
				
				i = 0;
				
				break;	
				
			
			// excluir hscore selecionado
			case 12 :
				
				switch (h) {
				
				case 15 : 
					
					Hscore15 hsc15 = new Hscore15();
					
					Hscore15DAO hsc15dao = new Hscore15DAO();
					
					
					System.out.println("Digite o apelido registrado no seu recorde para excluí-lo");
					
					hsc15.setId15(hsc15dao.searchIdByUsername(input.next()));
					
					
					hsc15dao.delete(hsc15);
					
					System.out.println("Deletado com sucesso!");
					
					break;
				
					
				case 30 :
				
					Hscore30 hsc30 = new Hscore30();
					
					Hscore30DAO hsc30dao = new Hscore30DAO();
					
					
					System.out.println("Digite o apelido registrado no seu recorde para excluí-lo");
					
					hsc30.setId30(hsc30dao.searchIdByUsername(input.next()));
					
					
					hsc30dao.delete(hsc30);
					
					System.out.println("Deletado com sucesso!");
					
					
					break;
					
					
				case 60 :
					
					Hscore60 hsc60 = new Hscore60();
					
					Hscore60DAO hsc60dao = new Hscore60DAO();
					
					
					System.out.println("Digite o apelido registrado no seu recorde para excluí-lo");
					
					hsc60.setId60(hsc60dao.searchIdByUsername(input.next()));
					
					
					hsc60dao.delete(hsc60);
					
					System.out.println("Deletado com sucesso!");
					
					
					break;
					
					
				default :
					
					System.out.println("Recorde inválido.");
					
					break;
					
				}
				
				i = 0;
				
				break;	

				
			// saindo da sessao	
			case 13:
				
				System.out.println("Encerrando sessão...\n");
				
				break;
				
			default:
				
				System.out.println("Número inválido, tente novamente.\n");
				
				break;
			
			}
			

		}
		
		System.out.println("Sessão encerrada.");
		
		input.close();

	}

}
