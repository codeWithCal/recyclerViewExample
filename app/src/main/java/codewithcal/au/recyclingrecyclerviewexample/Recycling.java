package codewithcal.au.recyclingrecyclerviewexample;

public class Recycling
{
    private String id;
    private String name;
    private int image;
    private String type;

    public Recycling(String id, String name, int image, String type)
    {
        this.id = id;
        this.name = name;
        this.image = image;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
