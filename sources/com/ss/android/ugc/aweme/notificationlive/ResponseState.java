package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class ResponseState implements af {
    private final r cacheEvent;
    private final r networkEvent;
    private final int pushState;
    private final int statusCode;

    static {
        Covode.recordClassIndex(73502);
    }

    public ResponseState() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ResponseState copy$default(ResponseState responseState, int i2, int i3, r rVar, r rVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = responseState.pushState;
        }
        if ((i4 & 2) != 0) {
            i3 = responseState.statusCode;
        }
        if ((i4 & 4) != 0) {
            rVar = responseState.cacheEvent;
        }
        if ((i4 & 8) != 0) {
            rVar2 = responseState.networkEvent;
        }
        return responseState.copy(i2, i3, rVar, rVar2);
    }

    public final int component1() {
        return this.pushState;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final r component3() {
        return this.cacheEvent;
    }

    public final r component4() {
        return this.networkEvent;
    }

    public final ResponseState copy(int i2, int i3, r rVar, r rVar2) {
        return new ResponseState(i2, i3, rVar, rVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseState)) {
            return false;
        }
        ResponseState responseState = (ResponseState) obj;
        return this.pushState == responseState.pushState && this.statusCode == responseState.statusCode && l.a(this.cacheEvent, responseState.cacheEvent) && l.a(this.networkEvent, responseState.networkEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.pushState) * 31) + com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.statusCode)) * 31;
        r rVar = this.cacheEvent;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        r rVar2 = this.networkEvent;
        if (rVar2 != null) {
            i2 = rVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ResponseState(pushState=" + this.pushState + ", statusCode=" + this.statusCode + ", cacheEvent=" + this.cacheEvent + ", networkEvent=" + this.networkEvent + ")";
    }

    public final r getCacheEvent() {
        return this.cacheEvent;
    }

    public final r getNetworkEvent() {
        return this.networkEvent;
    }

    public final int getPushState() {
        return this.pushState;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public ResponseState(int i2, int i3, r rVar, r rVar2) {
        this.pushState = i2;
        this.statusCode = i3;
        this.cacheEvent = rVar;
        this.networkEvent = rVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseState(int i2, int i3, r rVar, r rVar2, int i4, g gVar) {
        this((i4 & 1) != 0 ? -1 : i2, (i4 & 2) != 0 ? -1 : i3, (i4 & 4) != 0 ? null : rVar, (i4 & 8) != 0 ? null : rVar2);
    }
}
