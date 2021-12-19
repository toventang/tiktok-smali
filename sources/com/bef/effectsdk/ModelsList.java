package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final class ModelsList {
    public static final List<String> list = Arrays.asList("model/ttfacemodel/tt_face_extra_v13.0.model", "model/ttfacemodel/tt_face_v10.0.model", "model/ttfaceattrmodel/tt_face_attribute_age_v1.1.model");

    static {
        Covode.recordClassIndex(2857);
    }
}
