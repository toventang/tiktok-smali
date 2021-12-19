package com.ss.android.ugc.aweme.im.sdk.common.controller.k;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "action")
    private final int action;

    static {
        Covode.recordClassIndex(65490);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_common_controller_websocket_IMBusinessWsPayload_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ b copy$default(b bVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = bVar.action;
        }
        return bVar.copy(i2);
    }

    public final int component1() {
        return this.action;
    }

    public final b copy(int i2) {
        return new b(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.action == ((b) obj).action;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_im_sdk_common_controller_websocket_IMBusinessWsPayload_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.action);
    }

    public final String toString() {
        return "IMBusinessWsPayload(action=" + this.action + ")";
    }

    public final int getAction() {
        return this.action;
    }

    public b(int i2) {
        this.action = i2;
    }
}
