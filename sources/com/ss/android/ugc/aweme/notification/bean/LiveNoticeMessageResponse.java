package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;

public final class LiveNoticeMessageResponse extends BaseResponse {
    @c(a = "data")
    public final LiveMessage liveMessage;

    static {
        Covode.recordClassIndex(72803);
    }

    public LiveNoticeMessageResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ LiveNoticeMessageResponse copy$default(LiveNoticeMessageResponse liveNoticeMessageResponse, LiveMessage liveMessage2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveMessage2 = liveNoticeMessageResponse.liveMessage;
        }
        return liveNoticeMessageResponse.copy(liveMessage2);
    }

    public final LiveNoticeMessageResponse copy(LiveMessage liveMessage2) {
        return new LiveNoticeMessageResponse(liveMessage2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveNoticeMessageResponse) && l.a(this.liveMessage, ((LiveNoticeMessageResponse) obj).liveMessage);
        }
        return true;
    }

    public final int hashCode() {
        LiveMessage liveMessage2 = this.liveMessage;
        if (liveMessage2 != null) {
            return liveMessage2.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LiveNoticeMessageResponse(liveMessage=" + this.liveMessage + ")";
    }

    public LiveNoticeMessageResponse(LiveMessage liveMessage2) {
        this.liveMessage = liveMessage2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveNoticeMessageResponse(LiveMessage liveMessage2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : liveMessage2);
    }
}
