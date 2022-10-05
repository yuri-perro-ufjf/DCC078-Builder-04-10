import java.util.ArrayList;

public class Player {
    private Double hp;
    private Integer power;
    private Integer armor;
    private String skinName;
    private ArrayList<String> tools;
    private String guildOriginName;
    private Boolean hasExtraPower;
    private Boolean hasExtraHp;

    public Player(){
        this.hp = null;
        this.power = null;
        this.armor = null;
        this.skinName = null;
        this.tools = null;
        this.guildOriginName = null;
        this.hasExtraPower = null;
        this.hasExtraHp = null;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getSkinName() {
        return skinName;
    }

    public void setSkinName(String skinName) {
        this.skinName = skinName;
    }

    public ArrayList<String> getTools() {
        return tools;
    }

    public void setTools(ArrayList<String> tools) {
        this.tools = tools;
    }

    public String getGuildOriginName() {
        return guildOriginName;
    }

    public void setGuildOriginName(String guildOriginName) {
        this.guildOriginName = guildOriginName;
    }

    public Boolean isHasExtraPower() {
        return hasExtraPower;
    }

    public void setHasExtraPower(boolean hasExtraPower) {
        this.hasExtraPower = hasExtraPower;
    }

    public Boolean isHasExtraHp() {
        return hasExtraHp;
    }

    public void setHasExtraHp(boolean hasExtraHp) {
        this.hasExtraHp = hasExtraHp;
    }

}
