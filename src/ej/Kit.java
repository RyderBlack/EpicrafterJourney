package ej;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {

    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> blocKeywords = new LinkedHashSet<String>();

    public Kit() {

        blocs.add(new Wall(3, 2, 2, true));
        blocs.add(new Wall(3, 2, 2, true));
        blocs.add(new Wall(2, 1, 2, false));
        blocs.add(new Wall(2, 1, 2, false));
        blocs.add(new Door(1, 2, 2, true));

        blocKeywords.add("Cabane");
        blocKeywords.add("Bougie");
    }

    public void displayKit() {
        System.out.println("Nombre de blocs dans le kit : " + blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        for(String blocKeys : blocKeywords) {
            System.out.print(blocKeys + " ");
        }
    }

}