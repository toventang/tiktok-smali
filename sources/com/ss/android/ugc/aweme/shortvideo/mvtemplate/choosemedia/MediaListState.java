package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;

public final class MediaListState implements af {
    private final ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList;
    private final long value;

    static {
        Covode.recordClassIndex(84547);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaListState copy$default(MediaListState mediaListState, ArrayList arrayList, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = mediaListState.mediaList;
        }
        if ((i2 & 2) != 0) {
            j2 = mediaListState.value;
        }
        return mediaListState.copy(arrayList, j2);
    }

    public final ArrayList<MvImageChooseAdapter.MyMediaModel> component1() {
        return this.mediaList;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaListState copy(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList, long j2) {
        l.d(arrayList, "");
        return new MediaListState(arrayList, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaListState)) {
            return false;
        }
        MediaListState mediaListState = (MediaListState) obj;
        return l.a(this.mediaList, mediaListState.mediaList) && this.value == mediaListState.value;
    }

    public final int hashCode() {
        ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList = this.mediaList;
        return ((arrayList != null ? arrayList.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_MediaListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.value);
    }

    public final String toString() {
        return "MediaListState(mediaList=" + this.mediaList + ", value=" + this.value + ")";
    }

    public final ArrayList<MvImageChooseAdapter.MyMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final long getValue() {
        return this.value;
    }

    public MediaListState(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList, long j2) {
        l.d(arrayList, "");
        this.mediaList = arrayList;
        this.value = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaListState(ArrayList arrayList, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, j2);
    }
}
