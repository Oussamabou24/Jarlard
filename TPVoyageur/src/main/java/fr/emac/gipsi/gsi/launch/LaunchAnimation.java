/**
 *
 */
package fr.emac.gipsi.gsi.launch;

import fr.emac.gipsi.gsi.animation.AbstractAnimation;
import fr.emac.gipsi.gsi.animation.AnimationByColumn;
import fr.emac.gipsi.gsi.animation.AnimationFlash;
import fr.emac.gipsi.gsi.ecran.ListScreen;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class LaunchAnimation {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	for (int i=1;i<=20; i++) {

        AbstractAnimation aa = new AnimationFlash();
        aa.setEcranDeb(ListScreen.nyancat1());
        aa.setEcranFin(ListScreen.nyancatqueueenbas());

        aa.runAnimation();

        aa.wait(200);}


    }

}