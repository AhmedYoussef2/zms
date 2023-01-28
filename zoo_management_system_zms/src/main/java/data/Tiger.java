package data;

import javafx.scene.image.Image;

public class Tiger extends Animal {

    public Tiger() {
    }

    public Tiger(String info, String specie, int cageNo, String name, Image anImage) {
        super(info, specie, cageNo, name, anImage);
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return "The info : \n"
                + "are African equines with distinctive black-and-white striped coats. There are \n"
                + "three living species: the Grévy's zebra (Equus grevyi), plains zebra (E. quagga),\n "
                + "and the mountain zebra (E. zebra). Zebras share the genus Equus with horses and asses\n ";
    }

    @Override
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String getSpecie() {
        return "The specie of Tigers is : felines.\n";
    }

    @Override
    public void setCageNo(int cageNo) {
        this.cageNo = cageNo;
    }

    @Override
    public int getCageNo() {
        return 3;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return "Tiger";
    }

    @Override
    public void setImage(Image anImage) {
        this.anImage = anImage;
    }

    @Override
    public Image getAnImage() {
        Image clasImage = new Image(getClass().getResourceAsStream("/logic/tiger.jpg"));
        return clasImage;
    }

}