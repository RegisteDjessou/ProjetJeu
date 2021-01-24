import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Enregistrement du pseudo
    
	System.out.print("Veuillez entrer votre pseudo:");
	Scanner sc = new Scanner(System.in);
    String pseudo = sc.nextLine();
    int i =0;
    Joueur joueur = new Joueur(pseudo);
    
    Partie partie = new Partie(joueur);

	System.out.println("Bienvenue " + joueur.getPseudo());
	
	//Menu
	System.out.println("Veuillez selectionner un chiffre");
	System.out.println("1-Commencer la partie");  
	System.out.println("2-Customiser une voiture");  
	System.out.println("3-Quitter");  
    int choix;
    choix = sc.nextInt();
    
    switch(choix) {
        case 1:
            //Affichage des voiture du joueur
            System.out.println("Bienvenue dans votre garage, voici la liste de vos voitures:");
            for(Voiture elem: joueur.getGarage().getVoiture())
            {   i++;
                System.out.print(i+"-");
                System.out.println(elem);
                
            }
            
            //tableau 2D pour l'avancement des joueurs
            char grille[][] = new char[20][20];            
            int x=0;
            int y=0;
            
            System.out.println("Nous sommes sur la ligne de départ, nous allons bientot commencer la course:");
            boolean result = true;
            boolean winner = false;
                partie.genererObstacle(grille);
                while(result==true && winner==false){
                    //recuperation du choix du joueur
                    Scanner move = new Scanner(System.in);
                    String deplacement = move.nextLine();
                    
                    switch(deplacement){
                        case "h": y += 1; break;
                        case "d": x += 1; break;
                        case "g": x -= 1; break;

                    }

                    
                    // affichage de la position du joueur avec X. C pour les bonus et P pour les policiers
                    result = joueur.afficherPositionJoueur(grille, y, x);
                    System.out.println("=====================");
                    System.out.println("Entrez une touche entre h/g/d pour vous déplacer");
                    System.out.println(y);
                    System.out.println(grille.length);

                    partie.aGagne(grille, y);

                
                }
                
                System.out.println(partie);

    		break;
        case 2:
            // affichage des pieces que possede le joueur
            System.out.println("Bienvenue dans votre garage, voici la liste de vos pieces:");
            for(Piece elem: joueur.getGarage().getPiece())
            {   i++;
                System.out.print(i+"-");
                System.out.println(elem);
                
            }

            System.out.println("Ajoutez des pieces a votre garage. Assurez vous d'avoir le nombre de pieces necessaires:");
            System.out.println("1-Nitro 100 ");
            System.out.println("2-Armotisseur 150 ");
            System.out.println("3-Pneu 50 ");
            System.out.println("4-Frein 200 ");

            //choix de la piece à changer
            Scanner choice = new Scanner(System.in);
            int custom = choice.nextInt();

            switch(custom){
                case 1:
                    if(joueur.getCoins()>=100){
                        joueur.getGarage().addPiece(new Nitro());
                        joueur.setCoins(-100);
                        System.out.println("Nitro ajouté");
                        System.out.println(joueur);
                    }
                    else
                        System.out.println("Vous ne possedez pas assez de coins");
                    break;
                case 2:
                    if(joueur.getCoins()>=150){
                        joueur.getGarage().addPiece(new Armortisseur());
                        joueur.setCoins(-150);
                        System.out.println("Armortisseur ajouté");
                        System.out.println(joueur);
                    }
                    else
                        System.out.println("Vous ne possedez pas assez de coins");
                    break;
                case 3:
                    if(joueur.getCoins()>=50){
                        joueur.getGarage().addPiece(new Pneu());
                        joueur.setCoins(-50);
                        System.out.println("Pneu ajouté");
                        System.out.println(joueur);
                    }
                    else
                        System.out.println("Vous ne possedez pas assez de coins");
                    break;
                case 4:
                    if(joueur.getCoins()>=200){
                        joueur.getGarage().addPiece(new Frein());
                        joueur.setCoins(-200);
                        System.out.println("Frein ajouté");
                        System.out.println(joueur);
                    }
                    else
                        System.out.println("Vous ne possedez pas assez de coins");
                    break;
                default:
                    System.out.println("Selectionnez un chiffre valide");
                    break;
            }
            System.out.println(partie);
    		break;
        case 3:
            System.out.println(partie);
            break;
        default:
            System.out.println(partie);
            System.out.println("Selectionnez un chiffre valide");
            break;
    }
        
}
	
	
}
