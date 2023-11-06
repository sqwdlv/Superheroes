import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Superheroes superhero = new Superheroes();
        Villain villain = new Villain();
        Batman batman = new Batman();
        Superman superman = new Superman();
        WonderWoman wonder_woman = new WonderWoman();
        Electro electro = new Electro();


        boolean game_time = true;
        int game_tries = 0;

        System.out.println("ELECTRO HAS TAKEN OVER THE CITY, HELP US DEFEAT HIM! You've got a squad of 3 members, choose your attacks wisely to win in 3 or less moves! ");

        while (game_time) {
            System.out.println("Choose your character! To choose type: Batman or Superman or Wonder Woman! Type EXIT - to close game");
            System.out.println("____________________________________________________________________________________________________");
            System.out.println("This is round: " + game_tries + " out of 3. Electro has: " + villain.villain_health + " health points left! Your health points: " + superhero.hero_health + "!");
            String user_input_hero = sc.nextLine();

            if (user_input_hero.equals("EXIT")) {
                game_time = false;
                System.out.println("Thank you for playing, see you another time!");
            }


            switch (user_input_hero) {
                case "Batman":
                    System.out.println("Choose your move: Batarang (35 DMG), Martial Arts (45 DMG), Grappling Hook (65 DMG). Type EXIT - to close game");
                    String user_input_moves = sc.nextLine();
                    switch (user_input_moves) {
                        case "Batarang":
                            superhero.combat_move = "Batarang Attack";
                            superhero.damage_done = 35;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            batman.batarang();
                            System.out.println("____________________");
                            break;
                        case "Martial Arts":
                            superhero.combat_move = "Martial Arts";
                            superhero.damage_done = 45;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            batman.martial_arts();
                            System.out.println("____________________");
                            break;
                        case "Grappling Hook":
                            superhero.combat_move = "Grappling Hook";
                            superhero.damage_done = 65;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            batman.grappling_hook();
                            System.out.println("____________________");
                            break;
                        case "EXIT":
                            game_time = false;
                            System.out.println("Thank you for playing, see you another time!");
                            break;
                    }
                    break;
                case "Wonder Woman":
                    System.out.println("Choose your move: Lasso Throw (50 DMG), Warrior Charge (55 DMG), Submission Reflect (35 DMG). Type EXIT - to close game");
                    String user_input_moves2 = sc.nextLine();
                    switch (user_input_moves2) {
                        case "Lasso Throw":
                            superhero.combat_move = "Lasso Throw";
                            superhero.damage_done = 50;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            wonder_woman.lasso();
                            System.out.println("____________________");
                            break;
                        case "Warrior Charge":
                            superhero.combat_move = "Warrior Charge";
                            superhero.damage_done = 55;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            wonder_woman.warrior_charge();
                            System.out.println("____________________");
                            break;
                        case "Submission Reflect":
                            superhero.combat_move = "Submission Reflect";
                            superhero.damage_done = 35;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            wonder_woman.submission_reflect();
                            System.out.println("____________________");
                            break;
                        case "EXIT":
                            game_time = false;
                            System.out.println("Thank you for playing, see you another time!");
                            break;
                    }
                    break;
                case "Superman":
                    System.out.println("Choose your move: Heat Vision (75 DMG) , Super Strength (100 DMG), Freeze Breath (45 DMG). Type EXIT - to close game");
                    String user_input_moves3 = sc.nextLine();
                    switch (user_input_moves3) {
                        case "Heat Vision":
                            superhero.combat_move = "Heat Vision";
                            superhero.damage_done = 75;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            superman.heat_vision();
                            System.out.println("____________________");
                            break;
                        case "Super Strength":
                            superhero.combat_move = "Super Strength";
                            superhero.damage_done = 100;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            superman.super_strength();
                            System.out.println("____________________");
                            break;
                        case "Freeze Breath":
                            superhero.combat_move = "Freeze Breath";
                            superhero.damage_done = 45;
                            villain.vil_damage_done = 35;
                            superhero.hero_health -= villain.vil_damage_done;
                            villain.villain_health -= superhero.damage_done;
                            villain.vil_combat_move = "Lightning Bolt";
                            villain.vil_att();
                            electro.lightning_bolt();
                            superhero.att();
                            superman.freeze_breath();
                            System.out.println("____________________");
                            break;
                        case "EXIT":
                            game_time = false;
                            System.out.println("Thank you for playing, see you another time!");
                            break;
                    }
            }


            if (villain.villain_health <= 0) {
                game_time = false;
                System.out.println("YOU HAVE WON!  You had: " + superhero.hero_health + " health points left!");


            }


            game_tries++;


            if (superhero.hero_health <= 0 || game_tries > 3) {
                game_time = false;

                System.out.println("Game over! You've LOST!");
            }


        }
    }
}
