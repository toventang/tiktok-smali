package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import h.f.b.l;
import java.util.List;

public final class MediaMixList extends BaseResponse {
    @c(a = "cursor")
    public final long cursor;
    @c(a = "has_more")
    public final int hasMore;
    @c(a = "mix_infos")
    public final List<MixStruct> mixInfos;

    static {
        Covode.recordClassIndex(75241);
    }

    public static int com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.profile.model.MediaMixList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaMixList copy$default(MediaMixList mediaMixList, List list, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = mediaMixList.mixInfos;
        }
        if ((i3 & 2) != 0) {
            j2 = mediaMixList.cursor;
        }
        if ((i3 & 4) != 0) {
            i2 = mediaMixList.hasMore;
        }
        return mediaMixList.copy(list, j2, i2);
    }

    public final MediaMixList copy(List<? extends MixStruct> list, long j2, int i2) {
        return new MediaMixList(list, j2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMixList)) {
            return false;
        }
        MediaMixList mediaMixList = (MediaMixList) obj;
        return l.a(this.mixInfos, mediaMixList.mixInfos) && this.cursor == mediaMixList.cursor && this.hasMore == mediaMixList.hasMore;
    }

    public final int hashCode() {
        List<MixStruct> list = this.mixInfos;
        return ((((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31) + com_ss_android_ugc_aweme_profile_model_MediaMixList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MediaMixList(mixInfos=" + this.mixInfos + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.MixStruct> */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaMixList(List<? extends MixStruct> list, long j2, int i2) {
        this.mixInfos = list;
        this.cursor = j2;
        this.hasMore = i2;
    }
}
