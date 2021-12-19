package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.b.g;
import h.f.b.l;

public final class MediaState implements af {
    private final MvImageChooseAdapter.MyMediaModel media;
    private final long value;

    static {
        Covode.recordClassIndex(84551);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ MediaState copy$default(MediaState mediaState, MvImageChooseAdapter.MyMediaModel myMediaModel, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            myMediaModel = mediaState.media;
        }
        if ((i2 & 2) != 0) {
            j2 = mediaState.value;
        }
        return mediaState.copy(myMediaModel, j2);
    }

    public final MvImageChooseAdapter.MyMediaModel component1() {
        return this.media;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaState copy(MvImageChooseAdapter.MyMediaModel myMediaModel, long j2) {
        return new MediaState(myMediaModel, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) obj;
        return l.a(this.media, mediaState.media) && this.value == mediaState.value;
    }

    public final int hashCode() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.media;
        return ((myMediaModel != null ? myMediaModel.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.value);
    }

    public final String toString() {
        return "MediaState(media=" + this.media + ", value=" + this.value + ")";
    }

    public final MvImageChooseAdapter.MyMediaModel getMedia() {
        return this.media;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaState(MvImageChooseAdapter.MyMediaModel myMediaModel, long j2) {
        this.media = myMediaModel;
        this.value = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaState(MvImageChooseAdapter.MyMediaModel myMediaModel, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : myMediaModel, j2);
    }
}
