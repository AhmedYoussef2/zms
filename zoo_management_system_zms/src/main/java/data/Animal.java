package data;

import javafx.scene.image.Image;

public  abstract class Animal {
        protected String info;
        protected int cageno;
        protected String specie;
        protected String name;
        protected Image anImage;
    
        public Animal() {
        }
       
    
        public Animal(String info, String specie ,int cageno,String name,Image anImage) {
            this.info = info;
            this.specie = specie;
            this.cageno=cageno;
            this.name=name;
        }
    
        public  abstract void setInfo(String info);
           
    
        public abstract String getInfo(); 
            
    
        public abstract void setSpecie(String specie);
    
        public abstract String getSpecie();
         
        public abstract void setCageno(int cageno);
    
        public abstract int getCageno();

        public abstract void setName(String name);

        public abstract String getName();
           
        public abstract void setImage(Image anImage);

        public abstract Image getAnImage();
        
    }
    
    //  public class Lion extends Animal{
    
    //     public Lion() {
    //     }
    
    //     public Lion(String info, String specie ,int cageno ,String name) {
    //         super(info, specie, cageno,name);
    //     }
    
    //     @Override
    //     public void setInfo(String info) {
    //         this.info=info;
    //          }
    
    //     @Override
    //     public String getInfo() {
    //         return "The info : \n"+
    //                 "he lion (Panthera leo) is a large cat of the genus Panthera native to Africa \n"
    //                 + "and India. It has a muscular, broad-chested body; short, rounded head; round ears; \n"
    //                 + "and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are largers \n";
    //     }
    
    //     @Override
    //     public void setSpecie(String specie) {
    //        this.specie=specie;
    //     }
    
    //     @Override
    //     public String getSpecie() {
    //         return "The specie of lions is : Felidae family \n"; 
    //     }
    
    //     @Override 
    //     public void setCageno(int cageno){
    //         this.cageno=cageno;
    //     }
    
    //     @Override 
    //     public int getCageno(){
    //         return 1;
    //     }

    //     @Override
    //     public void setName(String name) {
    //         this.name=name;
    //     }

    //     @Override
    //     public String getName() {
            
    //         return "lion";
    //     }
        
        
    // }
    
    //  class Monkey extends Animal{
    
    //     public Monkey() {
    //     }
        
    //     public Monkey(String info, String specie ,int cageno,String name) {
    //         super(info, specie,cageno ,name);
    //     }
    
    //     @Override
    //     public void setInfo(String info) {
    //         this.info=info;
    //     }
    
    //     @Override
    //     public String getInfo() {
    //         return "The info : \n"+
    //                  "is a common name that may refer to most mammals of the infraorder Simiiformes,\n" +
    //                  "also known as the simians. Traditionally, all animals in the group now known as\n" +
    //                         " simians are counted as monkeys except the apes, which constitutes an incomplete\n"; 
    //     }
    
    //     @Override
    //     public void setSpecie(String specie) {
    //       this.specie=specie;  
    //     }
    
    //     @Override
    //     public String getSpecie() {
    //         return "The specie of monkey is : Callitrichidae\n";
    //     }
    
    //     @Override 
    //     public void setCageno(int cageno){
    //         this.cageno=cageno;
    //     }
    
    //     @Override 
    //     public int getCageno(){
    //         return 2;
    //     }

    //     @Override
    //     public void setName(String name) {
    //         this.name=name;
    //     }

    //     @Override
    //     public String getName() {
            
    //         return "Monkey";
    //     }
        
        
    // }
    
    //  class Tiger extends Animal {
    
    //     public Tiger() {
    //     }
        
    //      public Tiger(String info, String specie ,int cageno ,String name) {
    //         super(info, specie ,cageno,name);
    //     }
    
    //     @Override
    //     public void setInfo(String info) {
    //         this.info=info;
    //     }
    
    //     @Override
    //     public String getInfo() {
    //         return "The info : \n"
    //                + "are African equines with distinctive black-and-white striped coats. There are \n"
    //         + "three living species: the Grévy's zebra (Equus grevyi), plains zebra (E. quagga),\n "
    //         + "and the mountain zebra (E. zebra). Zebras share the genus Equus with horses and asses\n ";
    //     }
    
    //     @Override
    //     public void setSpecie(String specie) {
    //       this.specie=specie;  
    //     }
    
    //     @Override
    //     public String getSpecie() {
    //         return "The specie of Tigers is : felines.\n";
    //     }
    //     @Override 
    //     public void setCageno(int cageno){
    //         this.cageno=cageno;
    //     }
    
    //     @Override 
    //     public int getCageno(){
    //         return 3;
    //     }
        
    //     @Override
    //     public void setName(String name) {
    //         this.name=name;
    //     }

    //     @Override
    //     public String getName() {
            
    //         return "Tiger";
    //     }
        
    // }
    
    
    
    
    //  class Zebra extends Animal {
    
    //     public Zebra() {
    //     }
            
    //     public Zebra(String info, String specie ,int cageno,String name) {
    //         super(info, specie,cageno,name);
    //     }
    
    //     @Override
    //     public void setInfo(String info) {
    //         this.info=info;
    //     }
    
    //     @Override
    //     public String getInfo() {
    //         return"The info : \n" +
    //                 "  are African equines with distinctive black-and-white striped coats. \n"
    //                 + "There are three living species: the Grévy's zebra (Equus grevyi), plains zebra \n"
    //                 + "(E. quagga), and the mountain zebra (E. zebra). Zebras share the genus Equus with horses and asses.\n ";
    //     }
    
    //     @Override
    //     public void setSpecie(String specie) {
    //       this.specie=specie;  
    //     }
    
    //     @Override
    //     public String getSpecie() {
    //         return "The specie of Zebras is : Equid\n";
    //     }
    //     @Override 
    //     public void setCageno(int cageno){
    //         this.cageno=cageno;
    //     }
    
    //     @Override 
    //     public int getCageno(){
    //         return 4;
    //     }

    //     @Override
    //     public void setName(String name) {
    //         this.name=name;
    //     }

    //     @Override
    //     public String getName() {
            
    //         return "Zebra";
    //     }
        
    // }
    
    //  class Giraffe extends Animal {
    
    //     public Giraffe() {
    //     }
        
    //     public Giraffe(String info, String specie ,int cageno,String name) {
    //         super(info, specie,cageno,name);
    //     }
    
    //     @Override
    //     public void setInfo(String info) {
    //         this.info=info;
    //     }
    
    //     @Override
    //     public String getInfo() {
    //         return "The info : \n"+
    //                 "is a large African hoofed mammal belonging to the genus Giraffa. It is the \n"+
    //                 "tallest living terrestrial animal and the largest ruminant on Earth. Traditionally,\n" +
    //                 "giraffes were thought to be one species, Giraffa camelopardalis, with nine subspecies. \n";
    //     }
    
    //     @Override
    //     public void setSpecie(String specie) {
    //       this.specie=specie;  
    //     }
    
    //     @Override
    //     public String getSpecie() {
    //         return "The specie of Giraffes is : giraffes\n";
    //     }
    //     @Override 
    //     public void setCageno(int cageno){
    //         this.cageno=cageno;
    //     }
    
    //     @Override 
    //     public int getCageno(){
    //         return 5;
    //     }

    //     @Override
    //     public void setName(String name) {
    //         this.name=name;
    //     }

    //     @Override
    //     public String getName() {
            
    //         return "Giraffe";
    //     }
        
        
    // }
