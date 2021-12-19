package com.ss.android.ugc.aweme.common;

import android.text.TextUtils;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class MobClick {
    private static final f.c<MobClick> pool = new f.c<>(5);
    private String category;
    private String eventName;
    private JSONObject ext_json;
    private long ext_value_long;
    private String ext_value_str;
    private String labelName;
    private String value;

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExtJson() {
        return this.ext_json;
    }

    public long getExtValueLong() {
        return this.ext_value_long;
    }

    public String getExtValueStr() {
        return this.ext_value_str;
    }

    public String getLabelName() {
        return this.labelName;
    }

    static {
        Covode.recordClassIndex(47113);
    }

    public String getValue() {
        if (TextUtils.isEmpty(this.value)) {
            this.value = "0";
        }
        return this.value;
    }

    public void recycle() {
        clearState();
        pool.release(this);
    }

    public static MobClick obtain() {
        MobClick acquire = pool.acquire();
        if (acquire != null) {
            return acquire;
        }
        return new MobClick();
    }

    public void clearState() {
        this.eventName = null;
        this.labelName = null;
        this.value = null;
        this.ext_value_str = null;
        this.ext_value_long = 0;
        this.category = null;
        this.ext_json = null;
    }

    public String toString() {
        return "MobClick{eventName='" + this.eventName + '\'' + ", labelName='" + this.labelName + '\'' + ", value='" + this.value + '\'' + ", ext_value_str='" + this.ext_value_str + '\'' + ", ext_value_long=" + this.ext_value_long + ", category='" + this.category + '\'' + ", ext_json=" + this.ext_json + '}';
    }

    public MobClick setCategory(String str) {
        this.category = str;
        return this;
    }

    public MobClick setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public MobClick setExtValueLong(long j2) {
        this.ext_value_long = j2;
        return this;
    }

    public MobClick setExtValueString(String str) {
        this.ext_value_str = str;
        return this;
    }

    public MobClick setJsonObject(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public MobClick setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public MobClick setValue(String str) {
        this.value = str;
        return this;
    }
}
