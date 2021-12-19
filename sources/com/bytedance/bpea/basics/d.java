package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface d {
    static {
        Covode.recordClassIndex(15663);
    }

    String certToken();

    JSONObject toJSON();

    void validate(f fVar);
}
