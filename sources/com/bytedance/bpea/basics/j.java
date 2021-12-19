package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class j implements Serializable {
    private final String id;
    private String tag;

    static {
        Covode.recordClassIndex(15669);
    }

    public static /* synthetic */ j copy$default(j jVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jVar.id;
        }
        return jVar.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final j copy(String str) {
        return new j(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.id, ((j) obj).id);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PrivacyPoint(id=" + this.id + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public j(String str) {
        this.id = str;
    }
}
