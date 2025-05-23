package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {
    private List<Valuable> assets;

    public Portfolio() {
        this.assets = new ArrayList<>();
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()){
            return null;
        }

        return Collections.max(assets, (a, b) -> Double.compare(a.getValue(), b.getValue()));

    }




    public Valuable getLeastValuable() {
        if (assets.isEmpty()){
            return null;
        }

        return  Collections.min(assets, (a, b) -> Double.compare(a.getValue(), b.getValue()));

    }
}