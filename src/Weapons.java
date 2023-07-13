import java.util.Scanner;

public class Weapons {

    public static void DisplayWeapons(){
        System.out.print("Type danger level of weapon: ");
        Scanner dangerLevel = new Scanner(System.in);
        String level = dangerLevel.nextLine();

        switch (level){
            case "Zayin", "zayin" -> System.out.println("Penitence, Soda, Wingbeat");

            case "Teth", "teth" -> System.out.println("In Development");

            case "He", "he" -> System.out.println("In Development");

            case "Waw", "waw" -> System.out.println("In Development");

            case "Aleph", "aleph" -> System.out.println("In Development");

            default -> {
                System.out.println("Input not recognized");
                DisplayWeapons();
            }
        }

    }

    public static void PrintDetailsSelection(String weapon){
        switch (weapon){
            case "Penitence" -> PrintArray(Penitence);
            case "Soda" -> PrintArray(Soda);
            case "Tough" -> PrintArray(Tough);

        }
    }

    public static void PrintArray(String[] selected){
        System.out.printf("Weapon Name: %s\nWeapon Level: %s\nDamage Type: %s\n", selected[0], selected[1], selected[2]);
        System.out.printf("Min Damage: %s\nMax Damage: %s\nHits: %s\nSpeed: %s\n", selected[3], selected[4], selected[5], selected[6]);
    }


    public static void PrintDetails(String weapon) {

    }
    //ZAYIN
    public static String[] Penitence = { "Penitence", "ZAYIN", "White", "5", "7", "1", "0.5" };

    public static String[] Soda = { "Soda", "ZAYIN", "Red", "1", "2", "1", "1.5" };

    public static String[] Tough =  { "Tough", "ZAYIN", "White", "2", "4", "1", "1.5" };

    public static String[] Wingbeat = { "Wingbeat", "ZAYIN", "Red", "5", "7", "1", "0.5" };

    public static String[] Pink = { "Pink", "ALEPH", "White", "20", "24", "1", "0.5" }; //+15% min max with full suit

    //TETH
    public static String[] TrainingStandardEGO = { "Training Standard EGO", "TETH", "White", "5", "7", "1", "0.5" };

    public static String[] FourthMatchFlame = { "Fourth Match Flame", "TETH", "Red", "20", "30", "1", "0.2" };

    public static String[] Loneliness = { "Loneliness", "TETH", "White", "7", "14", "1", "1.5" };

    public static String[] ScreamingWedge = { "Screaming Wedge", "HE", "White", "5", "7", "1", "0.75" };

    public static String[] RedEyes = { "Red Eyes", "TETH", "Red", "7", "9", "1", "0.5" };

    public static String[] Horn = { "Horn", "TETH", "Red", "5", "7", "1", "0.67" };

    public static String[] WristCutter = { "Wrist Cutter", "TETH", "White", "2", "3", "1", "1.75" };

    public static String[] Regret = { "Regret", "TETH", "Red", "10", "15", "1", "0.33" };

    public static String[] Beak = { "Beak", "TETH", "Red", "2", "3", "1", "1.5" };

    public static String[] SomewhereSpear = { "Somewhere Spear", "TETH", "Black", "5", "9", "1", "0.67" };

    public static String[] LifefortheDaredevil = { "Life for the Daredevil", "HE", "Pale", "7", "9", "1", "0.67" };

    public static String[] Lantern = { "Lantern", "TETH", "Black", "12", "18", "1", "0.33" };

    public static String[] TodaysExpression = { "Today's Expression", "TETH", "Black", "2", "3", "1", "1.5" };

    public static String[] RapturousDream = { "Rapturous Dream", "TETH", "White", "1", "2", "1", "1.5" };

    public static String[] CherryBlossom = { "Cherry Blossom", "TETH", "White", "1", "2", "3", "1.0" };

    public static String[] CUTE = { "CUTE!!!", "TETH", "Red", "4", "6", "2", "1.0" };

    //HE
    public static String[] BearPaw = { "Bear Paw", "HE", "Red", "6", "7", "2", "1.0" };

    public static String[] BloodyDesire = { "Bloody Desire", "HE", "Red", "4", "7", "1", "1.0" }; //+4 damage with temp 1-2

    public static String[] Crier = { "Crier", "HE", "White", "3", "3", "1", "1.5" };

    public static String[] Harmony = { "Harmony", "HE", "White", "30", "50", "1", "0.2" };

    public static String[] Logging = { "Logging", "HE", "Red", "15", "21", "1", "0.33" };

    public static String[] FrostShard = { "Frost Shard", "HE", "White", "6", "12", "1", "0.67" };

    public static String[] GrinderMk4 = { "Grinder Mk4", "HE", "Red", "1", "3", "6", "0.67" };

    public static String[] Christmas = { "Christmas", "HE", "White", "11", "13", "1", "0.5" };

    public static String[] Galaxy = { "Galaxy", "HE", "Black", "9", "15", "1", "0.5" };

    public static String[] Laetitia = { "Laetitia", "HE", "Black", "5", "6", "1", "1" };

    //public readonly static String[] SolemnVow = new string[7] { //2 GUUUUUUUUUUNS :D };

    public static String[] MagicBullet = { "Magic Bullet", "WAW", "Black", "20", "22", "1", "0.5" };

    public static String[] Gaze = { "Gaze", "HE", "Red", "1", "4", "10", "0.33" };

    public static String[] Pleasure = { "Pleasure", "HE", "Black", "1", "4", "1", "1.75" };

    public static String[] Harvest = { "Harvest", "HE", "Black", "6", "12", "1", "0.67" };

    //WAW
    public static String[] Justitia = { "Justitia", "ALEPH", "Pale", "2", "4", "5", "0.5" };

    public static String[] GreenStem = { "Green Stem", "WAW", "Black", "8", "16", "1", "0.67" };

    public static String[] Lamp = { "Lamp", "WAW", "Black", "22", "28", "1", "0.37" };

    public static String[] BlueScar = { "Blue Scar", "WAW", "Red", "12", "17", "1", "0.5" };

    public static String[] CrimsonScar = { "Crimson Scar", "WAW", "Red", "11", "13", "1", "0.75" };

    public static String[] BlackSwan = { "Black Swan", "WAW", "Black", "5", "7", "1", "0.5" };

    public static String[] GoldRush = { "Gold Rush", "ALEPH", "Red", "4", "5", "3", "1" };

    public static String[] Ecstasy = { "Ecstasy", "WAW", "White", "2", "4", "1", "1.5" };

    public static String[] Diffraction = { "Diffraction", "WAW", "White", "15", "17", "1", "0.5" };

    public static String[] Amita = { "Amita", "WAW", "Red", "3", "4", "3", "0.67" };

    public static String[] ASwordSharpenedByTears = { "A Sword Sharpened By Tears", "WAW", "White", "9", "12", "1", "1" };

    public static String[] Heaven = { "Heaven", "WAW", "Red", "8", "16", "1", "0.67" };

    public static String[] Hornet = { "Hornet", "WAW", "Red", "7", "8", "1", "1" };

    public static String[] Hypocrisy = { "Hypocrisy", "WAW", "Red", "10", "20", "1", "0.75" };

    public static String[] Reverberation = { "Reverberation", "WAW", "White", "10", "20", "1", "0.75" };

    //public readonly static String[] InTheNameOfLoveAndHate = new string[7] //{ //Her voice, it's so soothing :) };

    public static String[] ShedSkin = { "ShedSkin", "WAW", "Red", "35", "50", "1", "0.2" };

    public static String[] Discord = { "Discord", "WAW", "Black", "8", "13", "1", "0.67" };

    public static String[] FeatherOfHonor = { "Feather Of Honor", "WAW", "White", "4", "5", "1", "2" };

    public static String[] Spore = { "Spore", "WAW", "White", "8", "16", "1", "0.67" };

    public static String[] Moonlight = { "Moonlight", "WAW", "White", "8", "10", "1", "0.5" };

    //ALEPH
    public static String[] Mimicry = { "Mimicry", "ALEPH", "Red", "10", "14", "1", "1" };

    public static String[] SoundOfAStar = { "Sound Of A Star", "ALEPH", "White", "8", "12", "3", "0.2" };

    public static String[] CENSORED = { "CENSORED", "ALEPH", "Black", "15", "30", "2", "0.33" };

    public static String[] TheSmile = { "The Smile", "ALEPH", "Black", "12", "18", "1", "1" };

    public static String[] DaCapo = { "Da Capo", "ALEPH", "White", "5", "6", "4", "1" };

    public static String[] Adoration = { "Adoration", "ALEPH", "Black", "22", "44", "1", "0.33" }; //On hit, "additional black damage is dealt over 5 seconds", how much is not specified

    //TWILIGHT GOES HERE WAS SKIPPED BC ITS FUCKING BROKEN AND WEIRD

    public static String[] ParadiseLost = { "Paradise Lost", "ALEPH", "Pale", "22", "28", "1", "0.5" };


}



