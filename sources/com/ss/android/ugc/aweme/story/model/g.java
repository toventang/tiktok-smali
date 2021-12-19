package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public final class g extends BaseResponse implements Serializable {
    @c(a = "play_vv")
    private final long playVideoViewers;

    static {
        Covode.recordClassIndex(90274);
    }

    public g() {
        this(0, 1, null);
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryViewInfoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ g copy$default(g gVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = gVar.playVideoViewers;
        }
        return gVar.copy(j2);
    }

    public final long component1() {
        return this.playVideoViewers;
    }

    public final g copy(long j2) {
        return new g(j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && this.playVideoViewers == ((g) obj).playVideoViewers;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_story_model_StoryViewInfoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.playVideoViewers);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewInfoResponse(playVideoViewers=" + this.playVideoViewers + ")";
    }

    public final long getPlayVideoViewers() {
        return this.playVideoViewers;
    }

    public g(long j2) {
        this.playVideoViewers = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(long j2, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? 0 : j2);
    }
}
