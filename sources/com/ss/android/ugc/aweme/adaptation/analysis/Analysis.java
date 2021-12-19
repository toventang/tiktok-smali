package com.ss.android.ugc.aweme.adaptation.analysis;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public class Analysis {
    private String category;
    private String eventName;
    private JSONObject ext_json;
    private long ext_value;
    private Map<String, String> extraMap;
    private String labelName;
    private long minValidStayDuration;
    private long value;

    static {
        Covode.recordClassIndex(40688);
    }

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExt_json() {
        return this.ext_json;
    }

    public long getExt_value() {
        return this.ext_value;
    }

    public Map<String, String> getExtraMap() {
        return this.extraMap;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public long getMinValidStayDuration() {
        return this.minValidStayDuration;
    }

    public long getValue() {
        return this.value;
    }

    public Analysis setCategory(String str) {
        this.category = str;
        return this;
    }

    public Analysis setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public Analysis setExt_json(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public Analysis setExt_value(long j2) {
        this.ext_value = j2;
        return this;
    }

    public Analysis setExtraMap(Map<String, String> map) {
        this.extraMap = map;
        return this;
    }

    public Analysis setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public void setMinValidStayDuration(long j2) {
        this.minValidStayDuration = j2;
    }

    public Analysis setValue(long j2) {
        this.value = j2;
        return this;
    }
}
