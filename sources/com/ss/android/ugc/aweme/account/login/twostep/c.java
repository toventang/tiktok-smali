package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "data")
    private final u data;
    @com.google.gson.a.c(a = "message")
    private final String message;

    static {
        Covode.recordClassIndex(39372);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, u uVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.message;
        }
        if ((i2 & 2) != 0) {
            uVar = cVar.data;
        }
        return cVar.copy(str, uVar);
    }

    public final String component1() {
        return this.message;
    }

    public final u component2() {
        return this.data;
    }

    public final c copy(String str, u uVar) {
        return new c(str, uVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.message, cVar.message) && l.a(this.data, cVar.data);
    }

    public final int hashCode() {
        String str = this.message;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        u uVar = this.data;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AvailableWaysResponse(message=" + this.message + ", data=" + this.data + ")";
    }

    public final u getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public c(String str, u uVar) {
        this.message = str;
        this.data = uVar;
    }
}
