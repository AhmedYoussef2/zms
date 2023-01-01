package logic;

public class Giraffe extends Animal {
    
    public Giraffe() {
    }
    
    public Giraffe(String info, String specie ,int cageno,String name) {
        super(info, specie,cageno,name);
    }

    @Override
    public void setInfo(String info) {
        this.info=info;
    }

    @Override
    public String getInfo() {
        return "The info : \n"+
                "is a large African hoofed mammal belonging to the genus Giraffa. It is the \n"+
                "tallest living terrestrial animal and the largest ruminant on Earth. Traditionally,\n" +
                "giraffes were thought to be one species, Giraffa camelopardalis, with nine subspecies. \n";
    }

    @Override
    public void setSpecie(String specie) {
      this.specie=specie;  
    }

    @Override
    public String getSpecie() {
        return "The specie of Giraffes is : giraffes\n";
    }
    @Override 
    public void setCageno(int cageno){
        this.cageno=cageno;
    }

    @Override 
    public int getCageno(){
        return 5;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        
        return "Giraffe";
    }
    
    
}
