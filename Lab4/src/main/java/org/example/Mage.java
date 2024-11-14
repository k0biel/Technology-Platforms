package org.example;

import javax.persistence.*;

@Entity
public class Mage {
    @Id
    private String name;
    private int level;

    @ManyToOne
    private Tower tower;

    public Mage() {
    }

    public Mage(String name, int level, Tower tower) {
        this.name = name;
        this.level = level;
        this.tower = tower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    @Override
    public String toString() {
        return "name = " + name + ", level = " + level + ", tower = " + (tower != null ? tower.getName() : "No tower");
    }
}

