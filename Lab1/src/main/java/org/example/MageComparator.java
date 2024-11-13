package org.example;

import java.util.Comparator;

public class MageComparator implements Comparator<Mage> {
    @Override
    public int compare(Mage mage1, Mage mage2) {
        if (mage1.getLevel() == mage2.getLevel()) {
            if (mage1.getName().equals(mage2.getName())) {
                return Double.compare(mage1.getPower(), mage2.getPower());
            } else {
                return mage1.getName().compareTo(mage2.getName());
            }
        } else {
            return Integer.compare(mage2.getLevel(), mage1.getLevel());
        }
    }
}