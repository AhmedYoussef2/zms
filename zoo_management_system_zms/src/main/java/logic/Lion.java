package logic;

public class Lion extends Animal{
    
    public Lion() {
    }

    public Lion(String info, String specie ,int cageno ,String name) {
        super(info, specie, cageno,name);
    }

    @Override
    public void setInfo(String info) {
        this.info=info;
         }

    @Override
    public String getInfo() {
        return "The info : \n"+
                "he lion (Panthera leo) is a large cat of the genus Panthera native to Africa \n"
                + "and India. It has a muscular, broad-chested body; short, rounded head; round ears; \n"
                + "and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are largers \n";
    }

    @Override
    public void setSpecie(String specie) {
       this.specie=specie;
    }

    @Override
    public String getSpecie() {
        return "The specie of lions is : Felidae family \n"; 
    }

    @Override 
    public void setCageno(int cageno){
        this.cageno=cageno;
    }

    @Override 
    public int getCageno(){
        return 1;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        
        return "lion";
    }
    
    
}
