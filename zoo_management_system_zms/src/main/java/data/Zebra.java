package data;

import javafx.scene.image.Image;

public class Zebra extends Animal {
    
    public Zebra() {
    }
        
    public Zebra(String info, String specie ,int cageNo,String name,Image anImage) {
        super(info, specie,cageNo,name,anImage);
    }

    @Override
    public void setInfo(String info) {
        this.info=info;
    }

    @Override
    public String getInfo() {
        return"The info : \n" +
                "  are African equines with distinctive black-and-white striped coats. \n"
                + "There are three living species: the Grévy's zebra (Equus grevyi), plains zebra \n"
                + "(E. quagga), and the mountain zebra (E. zebra). Zebras share the genus Equus with horses and asses.\n ";
    }

    @Override
    public void setSpecie(String specie) {
      this.specie=specie;  
    }

    @Override
    public String getSpecie() {
        return "The specie of Zebras is : Equid\n";
    }
    @Override 
    public void setCageNo(int cageNo){
        this.cageNo=cageNo;
    }

    @Override 
    public int getCageNo(){
        return 4;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        
        return "Zebra";
    }
    @Override
    public void setImage(Image anImage) {
        this.anImage=anImage;
    }

    @Override
    public Image getAnImage() {
        Image clasImage=new Image(getClass().getResourceAsStream("/com/zebra.jpg"));
        return clasImage;
    }
    
}