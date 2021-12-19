package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class AggregationSdk implements Serializable {
    @c(a = "common_data")
    private Object commonData;

    static {
        Covode.recordClassIndex(59293);
    }

    public JSONObject getCommonData() {
        try {
            return new JSONObject(new f().b(this.commonData));
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
