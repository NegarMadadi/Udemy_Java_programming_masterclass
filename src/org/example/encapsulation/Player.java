package org.example.encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weopen;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("player knocked out.");
            // reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
