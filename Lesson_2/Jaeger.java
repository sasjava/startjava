public class Jaeger {
    private String nickName;
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public void setNickName(String nickName) {
        if (nickName == "") {
            System.out.println("Имя не присвоено");
        } else {
            this.nickName = nickName;
        }
    }
    public String getNickName() {
        return nickName;
    }
    public void setModelName(String modelName) {
        if (modelName == "") {
            this.modelName = "Unknown Model";
        } else {
            this.modelName = modelName;
        }
    }
    public String getModelName() {
        return modelName;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOrigin() {
        return origin;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }
    public void move() {
        System.out.println(nickName + " moving");
    }
    public void run() {
        System.out.println(nickName + " running");
    }
    public void printCharacteristics() {
        System.out.println(nickName + " Characteristics: ");
        System.out.println("modelName: " + modelName);
        System.out.println("mark: " + mark);
        System.out.println("origin: " + origin);
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        System.out.println("strength: " + strength);
        System.out.println("armor: " + armor + "\n");
    }
    public Jaeger() {
    }
    public Jaeger(String nickName,
        String modelName,
        String mark,
        String origin,
        float height,
        float weight,
        int strength,
        int armor) {
        this.nickName = nickName;
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }
}