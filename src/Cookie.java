public class Cookie extends Pastry {
    private boolean cookieHasChocolateChips;
    private String cookieTexture;

    public Cookie(String cookieName, double cookieWeight, boolean cookieHasChocolateChips, String cookieTexture) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
        this.cookieTexture = cookieTexture;
    }

    public Cookie() {
        this.cookieHasChocolateChips = false;
        this.cookieTexture = "None";
    }

    public void print() {
        System.out.println("Cookie -  Texture: " + this.cookieTexture + " Are Chocolate Chip: " + this.cookieHasChocolateChips);
    }

    public boolean isCookieHasChocolateChips() {
        return cookieHasChocolateChips;
    }

    public void setCookieHasChocolateChips(boolean cookieHasChocolateChips) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
    }

    public String getCookieTexture() {
        return cookieTexture;
    }

    public void setCookieTexture(String cookieTexture) {
        this.cookieTexture = cookieTexture;
    }
}