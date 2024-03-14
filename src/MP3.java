public class MP3 extends Item {
    private String duration;
    public MP3(String name, String description, String ID, float price) {
        super(name, description, ID, price);
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration + " seconds");
    }
}
