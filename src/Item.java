abstract class Item {
    public String name;
    private String description;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    protected String ID;

    float price;
    void showInfo(){

    }
    public Item(String name, String description, String ID, float price){
        this.description=description;
        this.name = name;
        this.ID=ID;
        this.price=price;
    }



}
