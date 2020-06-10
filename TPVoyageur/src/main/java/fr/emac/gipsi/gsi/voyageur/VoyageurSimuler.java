/**
 *
 */
package fr.emac.gipsi.gsi.voyageur;

/**
 * @author Truptil Sebastien - sebastien.truptil@gmail.com
 *
 */
public class VoyageurSimuler extends AbstractVoyageur {

    /**
     *
     */
    public VoyageurSimuler() {
        // TODO Auto-generated constructor stub
    	
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#forward()
     */
    @Override
    protected void forward() {
        // TODO Auto-generated method stub
    	String direction = getDirection(); // S
    	if (direction == "S")   {
    		getPosBody().setX(getPosBody().getX() + 1);
    		getPosTete().setX(getPosTete().getX()+1);
    		    	}
    	else if (direction == "N") {
    		getPosBody().setX(getPosBody().getX()-1);
    		getPosTete().setX(getPosTete().getX()-1);
    	}
    	else if (direction == "E") {
    		getPosBody().setY(getPosBody().getY()+1);
    		getPosTete().setY(getPosTete().getY()+1);	
    	}
    	else if (direction == "W") {
    		getPosBody().setY(getPosBody().getY()-1);
    		getPosTete().setY(getPosTete().getY()-1);
    		}

    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#backward()
     */
    @Override
    protected void backward() {
        // TODO Auto-generated method stub
    	String direction = getDirection(); // S
    	if (direction == "S")   {
    		getPosBody().setX(getPosBody().getX() - 1);
    		getPosTete().setX(getPosTete().getX()-1);
    		    	}
    	else if (direction == "N") {
    		getPosBody().setX(getPosBody().getX()+1);
    		getPosTete().setX(getPosTete().getX()+1);
    	}
    	else if (direction == "E") {
    		getPosBody().setY(getPosBody().getY()-1);
    		getPosTete().setY(getPosTete().getY()-1);	
    	}
    	else if (direction == "W") {
    		getPosBody().setY(getPosBody().getY()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    		}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#left()
     */
    @Override
    protected void left() {
        // TODO Auto-generated method stub
    	String direction = getDirection(); // S
    	if (direction == "S")   {
    		getPosTete().setX(getPosTete().getX()-1);
    		getPosTete().setY(getPosTete().getY()-1);
    		setDirection("W");
    		    	}
    	else if (direction == "N") {
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("E");
    	}
    	else if (direction == "E") {
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()-1);
    		setDirection("S");
    	}
    	else if (direction == "W") {
    		getPosTete().setX(getPosTete().getX()-1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("N");
    		}
    }

    /* (non-Javadoc)
     * @see fr.emac.gipsi.gsi.voyageur.AbstractVoyageur#right()
     */
    @Override
    protected void right() {
        // TODO Auto-generated method stub
    	String direction = getDirection(); // S
    	if (direction == "S")   {
    		getPosTete().setX(getPosTete().getX()-1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("E");
    		    	}
    	else if (direction == "N") {
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()-1);
    		setDirection("W");
    	}
    	else if (direction == "E") {
    		getPosTete().setX(getPosTete().getX()-1);
    	 	getPosTete().setY(getPosTete().getY()-1);
    	 	setDirection("N");
    	}
    	else if (direction == "W") {
    		getPosTete().setX(getPosTete().getX()+1);
    		getPosTete().setY(getPosTete().getY()+1);
    		setDirection("S");
    		}
    }
}
