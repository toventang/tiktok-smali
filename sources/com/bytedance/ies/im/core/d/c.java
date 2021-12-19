package com.bytedance.ies.im.core.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "msg_content")
    private final a content;
    @com.google.gson.a.c(a = "msg_type")
    private final int msgType;

    static {
        Covode.recordClassIndex(20273);
    }

    public static int com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ c copy$default(c cVar, int i2, a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = cVar.msgType;
        }
        if ((i3 & 2) != 0) {
            aVar = cVar.content;
        }
        return cVar.copy(i2, aVar);
    }

    public final int component1() {
        return this.msgType;
    }

    public final a component2() {
        return this.content;
    }

    public final c copy(int i2, a aVar) {
        return new c(i2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.msgType == cVar.msgType && l.a(this.content, cVar.content);
    }

    public final int hashCode() {
        int com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.msgType) * 31;
        a aVar = this.content;
        return com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckMessage(msgType=" + this.msgType + ", content=" + this.content + ")";
    }

    public final a getContent() {
        return this.content;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public c(int i2, a aVar) {
        this.msgType = i2;
        this.content = aVar;
    }
}
