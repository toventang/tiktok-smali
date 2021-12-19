package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.i;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class h implements Serializable {
    @c(a = "bubble_hidden")
    private final boolean bubbleHidden;
    private d cacheState;
    @c(a = "comment_id")
    private final String commentId;
    @c(a = "create_time")
    private final long createTime;
    @c(a = "is_author_liked")
    private final boolean isAuthorLiked;
    @c(a = "item_id")
    private final String itemId;
    @c(a = "like_count")
    private int likeCount;
    @c(a = "status")
    private final int status;
    @c(a = "text")
    private String text;
    @c(a = "total")
    private final int total;
    @c(a = "upvote_label_type")
    private final int upvoteLabelType;
    @c(a = "user")
    private final User user;
    @c(a = "user_liked")
    private boolean userLiked;
    @c(a = "user_list")
    private final List<User> userList;

    static {
        Covode.recordClassIndex(92827);
    }

    public static int com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ h copy$default(h hVar, String str, String str2, String str3, long j2, int i2, int i3, User user2, boolean z, int i4, boolean z2, List list, int i5, boolean z3, d dVar, int i6, Object obj) {
        String str4 = str;
        String str5 = str3;
        String str6 = str2;
        long j3 = j2;
        int i7 = i2;
        User user3 = user2;
        int i8 = i3;
        int i9 = i4;
        boolean z4 = z;
        List list2 = list;
        boolean z5 = z2;
        boolean z6 = z3;
        int i10 = i5;
        d dVar2 = dVar;
        if ((i6 & 1) != 0) {
            str4 = hVar.commentId;
        }
        if ((i6 & 2) != 0) {
            str6 = hVar.text;
        }
        if ((i6 & 4) != 0) {
            str5 = hVar.itemId;
        }
        if ((i6 & 8) != 0) {
            j3 = hVar.createTime;
        }
        if ((i6 & 16) != 0) {
            i7 = hVar.likeCount;
        }
        if ((i6 & 32) != 0) {
            i8 = hVar.status;
        }
        if ((i6 & 64) != 0) {
            user3 = hVar.user;
        }
        if ((i6 & 128) != 0) {
            z4 = hVar.userLiked;
        }
        if ((i6 & 256) != 0) {
            i9 = hVar.upvoteLabelType;
        }
        if ((i6 & 512) != 0) {
            z5 = hVar.isAuthorLiked;
        }
        if ((i6 & 1024) != 0) {
            list2 = hVar.userList;
        }
        if ((i6 & 2048) != 0) {
            i10 = hVar.total;
        }
        if ((i6 & 4096) != 0) {
            z6 = hVar.bubbleHidden;
        }
        if ((i6 & 8192) != 0) {
            dVar2 = hVar.cacheState;
        }
        return hVar.copy(str4, str6, str5, j3, i7, i8, user3, z4, i9, z5, list2, i10, z6, dVar2);
    }

    public final String component1() {
        return this.commentId;
    }

    public final boolean component10() {
        return this.isAuthorLiked;
    }

    public final List<User> component11() {
        return this.userList;
    }

    public final int component12() {
        return this.total;
    }

    public final boolean component13() {
        return this.bubbleHidden;
    }

    public final d component14() {
        return this.cacheState;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.itemId;
    }

    public final long component4() {
        return this.createTime;
    }

    public final int component5() {
        return this.likeCount;
    }

    public final int component6() {
        return this.status;
    }

    public final User component7() {
        return this.user;
    }

    public final boolean component8() {
        return this.userLiked;
    }

    public final int component9() {
        return this.upvoteLabelType;
    }

    public final h copy(String str, String str2, String str3, long j2, int i2, int i3, User user2, boolean z, int i4, boolean z2, List<? extends User> list, int i5, boolean z3, d dVar) {
        l.d(str, "");
        l.d(str3, "");
        l.d(list, "");
        return new h(str, str2, str3, j2, i2, i3, user2, z, i4, z2, list, i5, z3, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.commentId, hVar.commentId) && l.a(this.text, hVar.text) && l.a(this.itemId, hVar.itemId) && this.createTime == hVar.createTime && this.likeCount == hVar.likeCount && this.status == hVar.status && l.a(this.user, hVar.user) && this.userLiked == hVar.userLiked && this.upvoteLabelType == hVar.upvoteLabelType && this.isAuthorLiked == hVar.isAuthorLiked && l.a(this.userList, hVar.userList) && this.total == hVar.total && this.bubbleHidden == hVar.bubbleHidden && l.a(this.cacheState, hVar.cacheState);
    }

    public final int hashCode() {
        String str = this.commentId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.itemId;
        int hashCode3 = (((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.createTime)) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.likeCount)) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status)) * 31;
        User user2 = this.user;
        int hashCode4 = (hashCode3 + (user2 != null ? user2.hashCode() : 0)) * 31;
        boolean z = this.userLiked;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i4) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.upvoteLabelType)) * 31;
        boolean z2 = this.isAuthorLiked;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i7) * 31;
        List<User> list = this.userList;
        int hashCode5 = (((i10 + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total)) * 31;
        if (!this.bubbleHidden) {
            i3 = 0;
        }
        int i11 = (hashCode5 + i3) * 31;
        d dVar = this.cacheState;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i11 + i2;
    }

    public final String toString() {
        return "UpvoteStruct(commentId=" + this.commentId + ", text=" + this.text + ", itemId=" + this.itemId + ", createTime=" + this.createTime + ", likeCount=" + this.likeCount + ", status=" + this.status + ", user=" + this.user + ", userLiked=" + this.userLiked + ", upvoteLabelType=" + this.upvoteLabelType + ", isAuthorLiked=" + this.isAuthorLiked + ", userList=" + this.userList + ", total=" + this.total + ", bubbleHidden=" + this.bubbleHidden + ", cacheState=" + this.cacheState + ")";
    }

    public final boolean getBubbleHidden() {
        return this.bubbleHidden;
    }

    public final d getCacheState() {
        return this.cacheState;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getUpvoteLabelType() {
        return this.upvoteLabelType;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserLiked() {
        return this.userLiked;
    }

    public final List<User> getUserList() {
        return this.userList;
    }

    public final boolean isAuthorLiked() {
        return this.isAuthorLiked;
    }

    public final boolean isPublished() {
        if (this.cacheState == null) {
            return true;
        }
        return false;
    }

    public final boolean isFake() {
        return i.a(new d[]{d.PRE_PUBLISH, d.PUBLISH_FAILED}, this.cacheState);
    }

    public final boolean isOperationDisable() {
        return i.a(new d[]{d.PRE_PUBLISH, d.PRE_REMOVE}, this.cacheState);
    }

    public final void setCacheState(d dVar) {
        this.cacheState = dVar;
    }

    public final void setLikeCount(int i2) {
        this.likeCount = i2;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUserLiked(boolean z) {
        this.userLiked = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, String str2, String str3, long j2, int i2, int i3, User user2, boolean z, int i4, boolean z2, List<? extends User> list, int i5, boolean z3, d dVar) {
        l.d(str, "");
        l.d(str3, "");
        l.d(list, "");
        this.commentId = str;
        this.text = str2;
        this.itemId = str3;
        this.createTime = j2;
        this.likeCount = i2;
        this.status = i3;
        this.user = user2;
        this.userLiked = z;
        this.upvoteLabelType = i4;
        this.isAuthorLiked = z2;
        this.userList = list;
        this.total = i5;
        this.bubbleHidden = z3;
        this.cacheState = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, String str2, String str3, long j2, int i2, int i3, User user2, boolean z, int i4, boolean z2, List list, int i5, boolean z3, d dVar, int i6, g gVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? null : str2, str3, (i6 & 8) != 0 ? 0 : j2, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? null : user2, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) != 0 ? false : z2, (i6 & 1024) != 0 ? z.INSTANCE : list, (i6 & 2048) != 0 ? 0 : i5, (i6 & 4096) != 0 ? false : z3, (i6 & 8192) == 0 ? dVar : null);
    }
}
