package com.bytedance.ies.im.core.api.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "im_token")
    private final String imToken;
    @c(a = "is_active_x")
    private final boolean isActiveX;

    static {
        Covode.recordClassIndex(20222);
    }

    public d() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ d copy$default(d dVar, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dVar.isActiveX;
        }
        if ((i2 & 2) != 0) {
            str = dVar.imToken;
        }
        return dVar.copy(z, str);
    }

    public final boolean component1() {
        return this.isActiveX;
    }

    public final String component2() {
        return this.imToken;
    }

    public final d copy(boolean z, String str) {
        return new d(z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.isActiveX == dVar.isActiveX && l.a(this.imToken, dVar.imToken);
    }

    public final int hashCode() {
        boolean z = this.isActiveX;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.imToken;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RebootMiscModel(isActiveX=" + this.isActiveX + ", imToken=" + this.imToken + ")";
    }

    public final String getImToken() {
        return this.imToken;
    }

    public final boolean isActiveX() {
        return this.isActiveX;
    }

    public d(boolean z, String str) {
        this.isActiveX = z;
        this.imToken = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str);
    }
}
