package com.ss.android.ml.process;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface c extends b {
    static {
        Covode.recordClassIndex(37029);
    }

    String getFeature();

    List<String> getLabels();

    int getLength();

    String getType();

    int getVectorLength();

    int getVectorNum();
}
