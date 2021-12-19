package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;

public class LocalFilterModel {
    private int coverResId;
    private String filterFilePath;
    private String id;
    private String name;

    static {
        Covode.recordClassIndex(5057);
    }

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i2) {
        this.coverResId = i2;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i2, String str2, String str3) {
        this.id = str;
        this.coverResId = i2;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
