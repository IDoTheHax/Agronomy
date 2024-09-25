package net.idothehax.agronomy.seed.potato;

import net.idothehax.agronomy.seed.SeedData;

import java.util.Arrays;

public class ModPotatoVariants {
    // First Earlies
    public static final SeedData SWIFT;
    public static final SeedData PENTLAND_JAVELIN;
    public static final SeedData ROCKET;
    public static final SeedData CASABLANCA;
    public static final SeedData ARRAN_PILOT;
    public static final SeedData DUKE_OF_YORK;
    public static final SeedData RED_DUKE_OF_YORK;
    public static final SeedData EPICURE;
    public static final SeedData FOREMOST;
    public static final SeedData HOME_GUARD;
    public static final SeedData LADY_CHRISTL;
    public static final SeedData ORLA;
    public static final SeedData PREMIERE;
    public static final SeedData PURITAN;
    public static final SeedData SHARPES_EXPRESS;

    // Second Earlies
    public static final SeedData MARIS_PEER;
    public static final SeedData CHARLOTTE;
    public static final SeedData NICOLA;
    public static final SeedData ANYA;
    public static final SeedData BONNIE;
    public static final SeedData BRITISH_QUEEN;
    public static final SeedData CATRIONA;
    public static final SeedData DUNLUCE;
    public static final SeedData ESTIMA;
    public static final SeedData KESTREL;
    public static final SeedData NADINE;
    public static final SeedData RATTE;
    public static final SeedData WILJA;

    // Maincrop
    public static final SeedData KING_EDWARD;
    public static final SeedData MARIS_PIPER;
    public static final SeedData PICASSO;
    public static final SeedData DESIREE;
    public static final SeedData PINK_FIR_APPLE;
    public static final SeedData SARPO_MIRA;
    public static final SeedData CARA;
    public static final SeedData KERRS_PINK;
    public static final SeedData MAJESTIC;
    public static final SeedData RECORD;
    public static final SeedData ROMANO;
    public static final SeedData ROOSTER;
    public static final SeedData SANTE;
    public static final SeedData SAXON;
    public static final SeedData VALOR;

    // Specialty Varieties
    public static final SeedData ELBA;
    public static final SeedData KENNEBEC;
    public static final SeedData RED_GOLD;
    public static final SeedData MASQUERADE;
    public static final SeedData PURPLE_MAJESTY;
    public static final SeedData RUSSIAN_BANANA_FINGERLING;
    public static final SeedData RED_NORLAND;
    public static final SeedData KIFLI;
    public static final SeedData LADY_BALFOUR;
    public static final SeedData VIVALDI;
    public static final SeedData ACCORD;
    public static final SeedData CONGO;
    public static final SeedData MAYAN_GOLD;

    // New Additions
    public static final SeedData ULSTER_PRINCE;
    public static final SeedData JERSEY_ROYAL;
    public static final SeedData MARFONA;

    static {
        // First Earlies
        SWIFT = new SeedData("Swift", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Swift", 3, 4, 2, "buttery")
        ));
        PENTLAND_JAVELIN = new SeedData("Pentland Javelin", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Pentland Javelin", 3, 3, 2, "earthy")
        ));
        ROCKET = new SeedData("Rocket", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Rocket", 3, 4, 2, "mild")
        ));
        CASABLANCA = new SeedData("Casablanca", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Casablanca", 3, 4, 3, "fluffy")
        ));
        ARRAN_PILOT = new SeedData("Arran Pilot", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Arran Pilot", 3, 3, 2, "creamy")
        ));
        DUKE_OF_YORK = new SeedData("Duke of York", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Duke of York", 3, 4, 2, "buttery")
        ));
        RED_DUKE_OF_YORK = new SeedData("Red Duke of York", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Red Duke of York", 3, 4, 2, "fluffy")
        ));
        EPICURE = new SeedData("Epicure", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Epicure", 3, 4, 3, "nutty")
        ));
        FOREMOST = new SeedData("Foremost", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Foremost", 3, 4, 3, "earthy")
        ));
        HOME_GUARD = new SeedData("Home Guard", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Home Guard", 3, 4, 3, "mild")
        ));
        LADY_CHRISTL = new SeedData("Lady Christl", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Lady Christl", 3, 4, 3, "creamy")
        ));
        ORLA = new SeedData("Orla", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Orla", 3, 4, 3, "nutty")
        ));
        PREMIERE = new SeedData("Premiere", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Premiere", 3, 4, 3, "buttery")
        ));
        PURITAN = new SeedData("Puritan", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Puritan", 3, 4, 2, "earthy")
        ));
        SHARPES_EXPRESS = new SeedData("Sharpe's Express", PotatoCategory.FIRST_EARLIES, Arrays.asList(
                new PotatoTrait("Sharpe's Express", 3, 4, 2, "fluffy")
        ));

        // Second Earlies
        MARIS_PEER = new SeedData("Maris Peer", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Maris Peer", 2, 4, 3, "creamy")
        ));
        CHARLOTTE = new SeedData("Charlotte", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Charlotte", 2, 4, 3, "buttery")
        ));
        NICOLA = new SeedData("Nicola", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Nicola", 2, 4, 3, "nutty")
        ));
        ANYA = new SeedData("Anya", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Anya", 2, 4, 3, "earthy")
        ));
        BONNIE = new SeedData("Bonnie", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Bonnie", 2, 4, 3, "fluffy")
        ));
        BRITISH_QUEEN = new SeedData("British Queen", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("British Queen", 2, 4, 3, "mild")
        ));
        CATRIONA = new SeedData("Catriona", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Catriona", 2, 4, 3, "creamy")
        ));
        DUNLUCE = new SeedData("Dunluce", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Dunluce", 2, 4, 3, "nutty")
        ));
        ESTIMA = new SeedData("Estima", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Estima", 2, 4, 3, "buttery")
        ));
        KESTREL = new SeedData("Kestrel", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Kestrel", 2, 4, 3, "earthy")
        ));
        NADINE = new SeedData("Nadine", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Nadine", 2, 4, 3, "fluffy")
        ));
        RATTE = new SeedData("Ratte", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Ratte", 2, 4, 3, "creamy")
        ));
        WILJA = new SeedData("Wilja", PotatoCategory.SECOND_EARLIES, Arrays.asList(
                new PotatoTrait("Wilja", 2, 4, 3, "creamy")
        ));

        // Maincrop
        KING_EDWARD = new SeedData("King Edward", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("King Edward", 1, 4, 3, "fluffy")
        ));
        MARIS_PIPER = new SeedData("Maris Piper", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Maris Piper", 1, 4, 3, "buttery")
        ));
        PICASSO = new SeedData("Picasso", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Picasso", 1, 4, 3, "earthy")
        ));
        DESIREE = new SeedData("Desiree", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Desiree", 1, 4, 3, "creamy")
        ));
        PINK_FIR_APPLE = new SeedData("Pink Fir Apple", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Pink Fir Apple", 1, 4, 3, "nutty")
        ));
        SARPO_MIRA = new SeedData("Sarpomira", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Sarpomira", 1, 4, 3, "buttery")
        ));
        CARA = new SeedData("Cara", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Cara", 1, 4, 3, "fluffy")
        ));
        KERRS_PINK = new SeedData("Kerr's Pink", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Kerr's Pink", 1, 4, 3, "creamy")
        ));
        MAJESTIC = new SeedData("Majestic", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Majestic", 1, 4, 3, "mild")
        ));
        RECORD = new SeedData("Record", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Record", 1, 4, 3, "earthy")
        ));
        ROMANO = new SeedData("Romano", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Romano", 1, 4, 3, "buttery")
        ));
        ROOSTER = new SeedData("Rooster", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Rooster", 1, 4, 3, "fluffy")
        ));
        SANTE = new SeedData("Sante", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Sante", 1, 4, 3, "nutty")
        ));
        SAXON = new SeedData("Saxon", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Saxon", 1, 4, 3, "creamy")
        ));
        VALOR = new SeedData("Valor", PotatoCategory.MAINCROP, Arrays.asList(
                new PotatoTrait("Valor", 1, 4, 3, "buttery")
        ));

        // Specialty Varieties
        ELBA = new SeedData("Elba", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Elba", 1, 4, 3, "earthy")
        ));
        KENNEBEC = new SeedData("Kennebec", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Kennebec", 1, 4, 3, "creamy")
        ));
        RED_GOLD = new SeedData("Red Gold", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Red Gold", 1, 4, 3, "fluffy")
        ));
        MASQUERADE = new SeedData("Masquerade", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Masquerade", 1, 4, 3, "buttery")
        ));
        PURPLE_MAJESTY = new SeedData("Purple Majesty", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Purple Majesty", 1, 4, 3, "earthy")
        ));
        RUSSIAN_BANANA_FINGERLING = new SeedData("Russian Banana Fingerling", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Russian Banana Fingerling", 1, 4, 3, "nutty")
        ));
        RED_NORLAND = new SeedData("Red Norland", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Red Norland", 1, 4, 3, "fluffy")
        ));
        KIFLI = new SeedData("Kifli", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Kifli", 1, 4, 3, "creamy")
        ));
        LADY_BALFOUR = new SeedData("Lady Balfour", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Lady Balfour", 1, 4, 3, "buttery")
        ));
        VIVALDI = new SeedData("Vivaldi", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Vivaldi", 1, 4, 3, "earthy")
        ));
        ACCORD = new SeedData("Accord", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Accord", 1, 4, 3, "nutty")
        ));
        CONGO = new SeedData("Congo", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Congo", 1, 4, 3, "fluffy")
        ));
        MAYAN_GOLD = new SeedData("Mayan Gold", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Mayan Gold", 1, 4, 3, "creamy")
        ));

        // New Additions
        ULSTER_PRINCE = new SeedData("Ulster Prince", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Ulster Prince", 1, 4, 3, "earthy")
        ));
        JERSEY_ROYAL = new SeedData("Jersey Royal", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Jersey Royal", 1, 4, 3, "fluffy")
        ));
        MARFONA = new SeedData("Marfona", PotatoCategory.SPECIALTY_VARIETIES, Arrays.asList(
                new PotatoTrait("Marfona", 1, 4, 3, "creamy")
        ));
    }
}