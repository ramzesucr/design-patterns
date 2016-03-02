package pt.kirill.designpatterns;

/**
 * Created by kirillryabin on 05/02/16.
 */
public class Player {

    private PlayerParams playerParams;

    private Player(PlayerParams playerParams) {
        this.playerParams = playerParams;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(playerParams.race)
                .append(" with ")
                .append(playerParams.hairColor)
                .append(" hair color and ")
                .append(playerParams.gender)
                .append(" gender");

        return stringBuilder.toString();

    }

    private static class PlayerParams {

        String hairColor;
        String race;
        String gender;

    }

    public static class Builder {
        private PlayerParams playerParams = new PlayerParams();

        public Builder setHairColor(String color) {
            playerParams.hairColor = color;

            return this;
        }

        public Builder setRace(String race) {
            playerParams.race = race;

            return this;
        }

        public Builder setGender(String gender) {
            playerParams.gender = gender;

            return this;
        }

        public Player build() {
            return new Player(playerParams);
        }
    }

}
