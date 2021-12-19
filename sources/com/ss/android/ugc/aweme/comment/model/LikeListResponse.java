package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class LikeListResponse extends BaseResponse implements Serializable {
    private final long cursor;
    private final boolean hasMore;
    private final boolean isShowLimit;
    private final List<User> likeList;

    static {
        Covode.recordClassIndex(44314);
    }

    public LikeListResponse() {
        this(false, 0, null, false, 15, null);
    }

    public static int com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.model.LikeListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LikeListResponse copy$default(LikeListResponse likeListResponse, boolean z, long j2, List list, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = likeListResponse.hasMore;
        }
        if ((i2 & 2) != 0) {
            j2 = likeListResponse.cursor;
        }
        if ((i2 & 4) != 0) {
            list = likeListResponse.likeList;
        }
        if ((i2 & 8) != 0) {
            z2 = likeListResponse.isShowLimit;
        }
        return likeListResponse.copy(z, j2, list, z2);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    public final long component2() {
        return this.cursor;
    }

    public final List<User> component3() {
        return this.likeList;
    }

    public final boolean component4() {
        return this.isShowLimit;
    }

    public final LikeListResponse copy(boolean z, long j2, List<User> list, boolean z2) {
        return new LikeListResponse(z, j2, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeListResponse)) {
            return false;
        }
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        return this.hasMore == likeListResponse.hasMore && this.cursor == likeListResponse.cursor && l.a(this.likeList, likeListResponse.likeList) && this.isShowLimit == likeListResponse.isShowLimit;
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((i3 * 31) + com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        List<User> list = this.likeList;
        int hashCode = (com_ss_android_ugc_aweme_comment_model_LikeListResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        if (!this.isShowLimit) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    public final boolean isShowLimit() {
        return this.isShowLimit;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("LikeListResponse{likeList:");
        List<User> list = this.likeList;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return sb.append(num).append(", hasMore:").append(this.hasMore).append(", cursor:").append(this.cursor).append('}').toString();
    }

    public LikeListResponse(boolean z, long j2, List<User> list, boolean z2) {
        this.hasMore = z;
        this.cursor = j2;
        this.likeList = list;
        this.isShowLimit = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LikeListResponse(boolean z, long j2, List list, boolean z2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? false : z2);
    }
}
