package com.ss.android.ugc.aweme.im.sdk.chat.data;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    private final String enterFrom;

    static {
        Covode.recordClassIndex(63896);
    }

    public b() {
        this(null, 1, null);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.enterFrom;
        }
        return bVar.copy(str);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final b copy(String str) {
        l.d(str, "");
        return new b(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.enterFrom, ((b) obj).enterFrom);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StatisticParams(enterFrom=" + this.enterFrom + ")";
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public b(String str) {
        l.d(str, "");
        this.enterFrom = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "chat" : str);
    }
}
