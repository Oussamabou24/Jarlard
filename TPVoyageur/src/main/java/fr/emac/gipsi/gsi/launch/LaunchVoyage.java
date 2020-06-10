package fr.emac.gipsi.gsi.launch;

import java.util.ArrayList;

import fr.emac.gipsi.gsi.screen.Screen;
import fr.emac.gipsi.gsi.voyage.Planete;
import fr.emac.gipsi.gsi.voyage.Voyage;
import fr.emac.gipsi.gsi.voyageur.AbstractVoyageur;
import fr.emac.gipsi.gsi.voyageur.VoyageurSimuler;

public class LaunchVoyage {

    public static void main(String[] args) {
        ArrayList<Planete> listPlanete = new ArrayList<>();

        Planete p1 = new Planete();
        p1.setColorName("DarkSalmon");
        p1.setEchantillonRoche(new Screen());
        p1.setEchantillonSol(new Screen());
        p1.setRayon(0);
        p1.getPos().setX(2);
        p1.getPos().setY(2);
        listPlanete.add(p1);

        Planete p2 = new Planete();
        p2.setColorName("DeepPink");
        p2.setEchantillonRoche(new Screen());
        p2.setRayon(0);
        p2.getPos().setX(5);
        p2.getPos().setY(5);
        listPlanete.add(p2);

        Planete p3 = new Planete();
        p3.setColorName("DeepPink");
        p3.setEchantillonRoche(new Screen());
        p3.setRayon(0);
        p3.getPos().setX(6);
        p3.getPos().setY(7);
        listPlanete.add(p3);

        p2.getListAccessibilite().add(p1);
        p1.getListAccessibilite().add(p2);
        p2.getListAccessibilite().add(p3);
        p3.getListAccessibilite().add(p2);
        
        AbstractVoyageur simulatedVoyageur = new VoyageurSimuler(); // voyageur qui va faire le parcours
        
        simulatedVoyageur.getPosTete().setX(listPlanete.get(0).getPos().getX());
        simulatedVoyageur.getPosTete().setY(listPlanete.get(0).getPos().getY());
        simulatedVoyageur.getPosBody().setX(listPlanete.get(0).getPos().getX());
        simulatedVoyageur.getPosBody().setY(listPlanete.get(0).getPos().getY()-1);
        simulatedVoyageur.setDirection("E");
        
        Voyage voyage = new Voyage(listPlanete, simulatedVoyageur);

        voyage.lancementSimuler();
        
        double distance12X = Math.max(p1.getPos().getX()-p2.getPos().getX(),p2.getPos().getX()-p1.getPos().getX());
        double distance12Y = Math.max(p1.getPos().getY()-p2.getPos().getY(),p2.getPos().getY()-p1.getPos().getY());
        double distance13X = Math.max(p1.getPos().getX()-p3.getPos().getX(),p3.getPos().getX()-p1.getPos().getX());
		double distance13Y = Math.max(p1.getPos().getY()-p3.getPos().getY(),p3.getPos().getY()-p1.getPos().getY());
		
		double distance12 = distance12X + distance12Y;
		double distance13 = distance13X + distance13Y;
		
		double distance = Math.min(distance12,distance13);
		
		double coord_distX;
		double coord_distY;
		if(distance == distance12)
        {		
			coord_distX = p2.getPos().getX();
			coord_distY = p2.getPos().getY();
        }
		else
		{
			coord_distX = p3.getPos().getX();
			coord_distY = p3.getPos().getY();
		}
		
		while (simulatedVoyageur.getPosBody().getY() < coord_distY )
		{
			simulatedVoyageur.goForward();
			voyage.afficheEcran();
			voyage.wait(500);
		}	
		simulatedVoyageur.turnLeft();

		voyage.afficheEcran();
		while (simulatedVoyageur.getPosBody().getX() < coord_distX )
		{
			simulatedVoyageur.goForward();
			voyage.afficheEcran();
			voyage.wait(500);
		}
		"clara la bg"


    }

    }

