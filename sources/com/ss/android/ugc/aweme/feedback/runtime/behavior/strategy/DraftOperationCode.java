package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class DraftOperationCode {
    @c(a = "code")
    private final String code;

    static {
        Covode.recordClassIndex(60425);
    }

    public DraftOperationCode() {
        this(null, 1, null);
    }

    public static /* synthetic */ DraftOperationCode copy$default(DraftOperationCode draftOperationCode, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = draftOperationCode.code;
        }
        return draftOperationCode.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final DraftOperationCode copy(String str) {
        l.d(str, "");
        return new DraftOperationCode(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DraftOperationCode) && l.a(this.code, ((DraftOperationCode) obj).code);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.code;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DraftOperationCode(code=" + this.code + ")";
    }

    public final String getCode() {
        return this.code;
    }

    public DraftOperationCode(String str) {
        l.d(str, "");
        this.code = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftOperationCode(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str);
    }
}
