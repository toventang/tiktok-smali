package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class EffectInfo {
    private String category;
    private String panel;
    private int[] params;
    private String resPath;
    private int tagNums;
    private String[] tags;

    static {
        Covode.recordClassIndex(100740);
    }

    public String getCategory() {
        return this.category;
    }

    public String getPanel() {
        return this.panel;
    }

    public int[] getParams() {
        return this.params;
    }

    public String getResPath() {
        return this.resPath;
    }

    public int getTagNums() {
        return this.tagNums;
    }

    public String[] getTags() {
        return this.tags;
    }

    public String toString() {
        return "EffectInfo{resPath='" + this.resPath + '\'' + ", panel='" + this.panel + '\'' + ", category='" + this.category + '\'' + ", tagNums=" + this.tagNums + ", params=" + Arrays.toString(this.params) + ", tags=" + Arrays.toString(this.tags) + '}';
    }

    public EffectInfo(String str, String str2, String str3, int i2, int[] iArr, String[] strArr) {
        this.resPath = str;
        this.panel = str2;
        this.category = str3;
        this.tagNums = i2;
        this.params = iArr;
        this.tags = strArr;
    }
}
