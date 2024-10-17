class Boss extends GameEntity {
    private Weapen weapen;
    public Boss(int health, String name, int ultimate, Weapen weapen) {
        super(health, name, ultimate);
        this.weapen = weapen;
    }

    public Weapen getWeapen() {
        return weapen;
    }

    public void setWeapen(Weapen weapen) {
        this.weapen = weapen;
    }

    public void printInfo() {
        System.out.println("Boss name: " + getName());
        System.out.println("Boss health: " + getHealth());
        System.out.println("Boss damage: " + getDamage());
        System.out.println("Boss weapon: " + getWeapen().getName());

    }
}


