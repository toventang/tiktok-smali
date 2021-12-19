package com.ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class ReverberationData implements Serializable {
    @c(a = "id")
    private String id;
    @c(a = "index")
    private int index = -1;
    @c(a = "path")
    private String path;
    @c(a = "res_id")
    private String resId;
    @c(a = "uuid")
    private String uuid = "";

    static {
        Covode.recordClassIndex(68549);
    }

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public final void setUuid(String str) {
        l.d(str, "");
        this.uuid = str;
    }
}
