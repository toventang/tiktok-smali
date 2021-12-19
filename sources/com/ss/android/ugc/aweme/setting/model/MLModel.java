package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

public class MLModel {
    @c(a = "disable")
    public boolean disable;
    @c(a = "package")
    public String packageUrl;
    @c(a = "params")
    public int[] params;
    @c(a = "scene")
    public String scene;
    @c(a = StringSet.type)
    public int type = 3;

    static {
        Covode.recordClassIndex(80202);
    }

    public String toString() {
        return "MLModel{scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", disable=" + this.disable + '}';
    }
}
