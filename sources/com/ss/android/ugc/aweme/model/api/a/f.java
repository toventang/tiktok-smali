package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class f implements Serializable {
    @c(a = "starter_navi_id")
    private String id;
    @c(a = "staticImage")
    private g image;

    static {
        Covode.recordClassIndex(71042);
    }

    public static /* synthetic */ f copy$default(f fVar, String str, g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.id;
        }
        if ((i2 & 2) != 0) {
            gVar = fVar.image;
        }
        return fVar.copy(str, gVar);
    }

    public final String component1() {
        return this.id;
    }

    public final g component2() {
        return this.image;
    }

    public final f copy(String str, g gVar) {
        return new f(str, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.id, fVar.id) && l.a(this.image, fVar.image);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        g gVar = this.image;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileNaviInitialDataModel(id=" + this.id + ", image=" + this.image + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final g getImage() {
        return this.image;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImage(g gVar) {
        this.image = gVar;
    }

    public f(String str, g gVar) {
        this.id = str;
        this.image = gVar;
    }
}
