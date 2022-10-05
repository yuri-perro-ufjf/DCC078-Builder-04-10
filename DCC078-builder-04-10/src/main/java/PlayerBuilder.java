import java.util.ArrayList;

public class PlayerBuilder {
    private Player player;

    public PlayerBuilder(){
        player = new Player();
    }

    public Player build(){
        if(player.getHp() == null) {
            throw new IllegalArgumentException("Invalid HP value!");
        }

        if(player.getHp() <= 0) {
            throw new IllegalArgumentException("HP value cannot be zero or negative!");
        }

        if(player.getArmor() == null){
            throw new IllegalArgumentException("Invalid Armor value!");
        }

        if(player.getPower() == null){
            throw new IllegalArgumentException("Invalid Power value!");
        }

        return player;
    }

    public PlayerBuilder setHp(Double hp) {
        this.player.setHp(hp);
        return this;
    }

    public PlayerBuilder setPower(Integer power) {
        this.player.setPower(power);
        return this;
    }

    public PlayerBuilder setArmor(Integer armor) {
        this.player.setArmor(armor);
        return this;
    }

    public PlayerBuilder setSkinName(String skinName) {
        this.player.setSkinName(skinName);
        return this;
    }


    public PlayerBuilder setTools(ArrayList<String> tools) {
        this.player.setTools(tools);
        return this;
    }


    public PlayerBuilder setGuildOriginName(String guildOriginName) {
        this.player.setGuildOriginName(guildOriginName);
        return this;
    }

    public PlayerBuilder setHasExtraPower(Boolean hasExtraPower) {
        this.player.setHasExtraPower(hasExtraPower);
        return this;
    }

    public PlayerBuilder setHasExtraHp(Boolean hasExtraHp) {
        this.player.setHasExtraHp(hasExtraHp);
        return this;
    }
}
