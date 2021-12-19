package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class SpeedPredictorResultCollection {
    private ArrayList<SpeedPredictorResult> resultCollection = new ArrayList<>();

    static {
        Covode.recordClassIndex(28052);
    }

    public ArrayList<SpeedPredictorResult> getResultCollection() {
        return this.resultCollection;
    }

    public int size() {
        return this.resultCollection.size();
    }

    public void add(SpeedPredictorResult speedPredictorResult) {
        this.resultCollection.add(speedPredictorResult);
    }

    public SpeedPredictorResult get(int i2) {
        return this.resultCollection.get(i2);
    }
}
