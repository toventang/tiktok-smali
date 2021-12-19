package com.bytedance.ies.im.core.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "tips")
    private final String tips;

    static {
        Covode.recordClassIndex(20271);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.tips;
        }
        return aVar.copy(str);
    }

    public final String component1() {
        return this.tips;
    }

    public final a copy(String str) {
        return new a(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.tips, ((a) obj).tips);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.tips;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CheckContent(tips=" + this.tips + ")";
    }

    public final String getTips() {
        return this.tips;
    }

    public a(String str) {
        this.tips = str;
    }
}
