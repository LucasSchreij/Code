

public abstract class BasisContainer{


    private int ID;

    public BasisContainer(int ID){
        this.ID = ID;

    }

    public int getID(){
        return ID;
    }

}

class Container extends BasisContainer {
    public Container(int ID){
        super(ID);
    }
    
}

class KoelContainer extends BasisContainer {
    public KoelContainer(int ID){
        super(ID);
    }
}

class WarmContainer extends BasisContainer {
    public WarmContainer(int ID){
        super(ID);
    }
}
