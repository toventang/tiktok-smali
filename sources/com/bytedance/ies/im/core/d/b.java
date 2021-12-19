package com.bytedance.ies.im.core.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "status_code")
    private final int checkCode;
    @c(a = "status_msg")
    private final c checkMsg;

    static {
        Covode.recordClassIndex(20272);
    }

    public static int com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ b copy$default(b bVar, int i2, c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = bVar.checkCode;
        }
        if ((i3 & 2) != 0) {
            cVar = bVar.checkMsg;
        }
        return bVar.copy(i2, cVar);
    }

    public final int component1() {
        return this.checkCode;
    }

    public final c component2() {
        return this.checkMsg;
    }

    public final b copy(int i2, c cVar) {
        return new b(i2, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.checkCode == bVar.checkCode && l.a(this.checkMsg, bVar.checkMsg);
    }

    public final int hashCode() {
        int com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.checkCode) * 31;
        c cVar = this.checkMsg;
        return com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckExtra(checkCode=" + this.checkCode + ", checkMsg=" + this.checkMsg + ")";
    }

    public final int getCheckCode() {
        return this.checkCode;
    }

    public final c getCheckMsg() {
        return this.checkMsg;
    }

    public b(int i2, c cVar) {
        this.checkCode = i2;
        this.checkMsg = cVar;
    }
}
