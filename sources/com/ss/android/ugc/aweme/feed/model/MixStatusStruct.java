package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class MixStatusStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "is_collected")
    public int isCollected;
    @c(a = "status")
    public int status;
    @c(a = "viewed_in_mix")
    public int viewedInMix;

    static {
        Covode.recordClassIndex(59421);
    }

    public MixStatusStruct() {
        this(0, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_MixStatusStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ MixStatusStruct copy$default(MixStatusStruct mixStatusStruct, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = mixStatusStruct.status;
        }
        if ((i5 & 2) != 0) {
            i3 = mixStatusStruct.isCollected;
        }
        if ((i5 & 4) != 0) {
            i4 = mixStatusStruct.viewedInMix;
        }
        return mixStatusStruct.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.isCollected;
    }

    public final int component3() {
        return this.viewedInMix;
    }

    public final MixStatusStruct copy(int i2, int i3, int i4) {
        return new MixStatusStruct(i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStatusStruct)) {
            return false;
        }
        MixStatusStruct mixStatusStruct = (MixStatusStruct) obj;
        return this.status == mixStatusStruct.status && this.isCollected == mixStatusStruct.isCollected && this.viewedInMix == mixStatusStruct.viewedInMix;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_feed_model_MixStatusStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status) * 31) + com_ss_android_ugc_aweme_feed_model_MixStatusStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.isCollected)) * 31) + com_ss_android_ugc_aweme_feed_model_MixStatusStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewedInMix);
    }

    public final String toString() {
        return "MixStatusStruct(status=" + this.status + ", isCollected=" + this.isCollected + ", viewedInMix=" + this.viewedInMix + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59422);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getViewedInMix() {
        return this.viewedInMix;
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final void setCollected(int i2) {
        this.isCollected = i2;
    }

    public final void setStatus(int i2) {
        this.status = i2;
    }

    public final void setViewedInMix(int i2) {
        this.viewedInMix = i2;
    }

    public MixStatusStruct(int i2, int i3, int i4) {
        this.status = i2;
        this.isCollected = i3;
        this.viewedInMix = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MixStatusStruct(int i2, int i3, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
    }
}
