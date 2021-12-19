package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.e;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CommentVideoModel implements e, Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 6067284783174034475L;
    private final String awemeId;
    private final String awemeUserId;
    private final int channelId;
    private final String commentId;
    private final String commentMsg;
    private int endTime;
    private final String enterFrom;
    private final String enterMethod;
    private final String replyId;
    private final String replyToReplyId;
    private String shootWay;
    private int startTime;
    private final Type type;
    private final UrlModel userAvatar;
    private final String userId;
    private final String userName;

    static {
        Covode.recordClassIndex(44308);
    }

    public CommentVideoModel() {
        this(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
    }

    public static int com_ss_android_ugc_aweme_comment_model_CommentVideoModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CommentVideoModel copy$default(CommentVideoModel commentVideoModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, int i3, int i4, Type type2, String str10, String str11, int i5, Object obj) {
        String str12 = str2;
        String str13 = str;
        String str14 = str4;
        String str15 = str3;
        UrlModel urlModel2 = urlModel;
        String str16 = str7;
        String str17 = str6;
        String str18 = str5;
        String str19 = str9;
        int i6 = i2;
        String str20 = str8;
        Type type3 = type2;
        int i7 = i4;
        int i8 = i3;
        String str21 = str11;
        String str22 = str10;
        if ((i5 & 1) != 0) {
            str13 = commentVideoModel.userId;
        }
        if ((i5 & 2) != 0) {
            str12 = commentVideoModel.userName;
        }
        if ((i5 & 4) != 0) {
            urlModel2 = commentVideoModel.userAvatar;
        }
        if ((i5 & 8) != 0) {
            str15 = commentVideoModel.commentMsg;
        }
        if ((i5 & 16) != 0) {
            str14 = commentVideoModel.commentId;
        }
        if ((i5 & 32) != 0) {
            str18 = commentVideoModel.awemeId;
        }
        if ((i5 & 64) != 0) {
            str17 = commentVideoModel.awemeUserId;
        }
        if ((i5 & 128) != 0) {
            str16 = commentVideoModel.replyId;
        }
        if ((i5 & 256) != 0) {
            str20 = commentVideoModel.replyToReplyId;
        }
        if ((i5 & 512) != 0) {
            i6 = commentVideoModel.channelId;
        }
        if ((i5 & 1024) != 0) {
            str19 = commentVideoModel.enterMethod;
        }
        if ((i5 & 2048) != 0) {
            i8 = commentVideoModel.startTime;
        }
        if ((i5 & 4096) != 0) {
            i7 = commentVideoModel.endTime;
        }
        if ((i5 & 8192) != 0) {
            type3 = commentVideoModel.type;
        }
        if ((i5 & 16384) != 0) {
            str22 = commentVideoModel.shootWay;
        }
        if ((i5 & 32768) != 0) {
            str21 = commentVideoModel.enterFrom;
        }
        return commentVideoModel.copy(str13, str12, urlModel2, str15, str14, str18, str17, str16, str20, i6, str19, i8, i7, type3, str22, str21);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.channelId;
    }

    public final String component11() {
        return this.enterMethod;
    }

    public final int component12() {
        return this.startTime;
    }

    public final int component13() {
        return this.endTime;
    }

    public final Type component14() {
        return this.type;
    }

    public final String component15() {
        return this.shootWay;
    }

    public final String component16() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.userName;
    }

    public final UrlModel component3() {
        return this.userAvatar;
    }

    public final String component4() {
        return this.commentMsg;
    }

    public final String component5() {
        return this.commentId;
    }

    public final String component6() {
        return this.awemeId;
    }

    public final String component7() {
        return this.awemeUserId;
    }

    public final String component8() {
        return this.replyId;
    }

    public final String component9() {
        return this.replyToReplyId;
    }

    public final CommentVideoModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, int i3, int i4, Type type2, String str10, String str11) {
        return new CommentVideoModel(str, str2, urlModel, str3, str4, str5, str6, str7, str8, i2, str9, i3, i4, type2, str10, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentVideoModel)) {
            return false;
        }
        CommentVideoModel commentVideoModel = (CommentVideoModel) obj;
        return l.a(this.userId, commentVideoModel.userId) && l.a(this.userName, commentVideoModel.userName) && l.a(this.userAvatar, commentVideoModel.userAvatar) && l.a(this.commentMsg, commentVideoModel.commentMsg) && l.a(this.commentId, commentVideoModel.commentId) && l.a(this.awemeId, commentVideoModel.awemeId) && l.a(this.awemeUserId, commentVideoModel.awemeUserId) && l.a(this.replyId, commentVideoModel.replyId) && l.a(this.replyToReplyId, commentVideoModel.replyToReplyId) && this.channelId == commentVideoModel.channelId && l.a(this.enterMethod, commentVideoModel.enterMethod) && this.startTime == commentVideoModel.startTime && this.endTime == commentVideoModel.endTime && l.a(this.type, commentVideoModel.type) && l.a(this.shootWay, commentVideoModel.shootWay) && l.a(this.enterFrom, commentVideoModel.enterFrom);
    }

    public final int hashCode() {
        String str = this.userId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.commentMsg;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.commentId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.awemeId;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.awemeUserId;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.replyId;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.replyToReplyId;
        int hashCode9 = (((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_comment_model_CommentVideoModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.channelId)) * 31;
        String str9 = this.enterMethod;
        int hashCode10 = (((((hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_comment_model_CommentVideoModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_comment_model_CommentVideoModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime)) * 31;
        Type type2 = this.type;
        int hashCode11 = (hashCode10 + (type2 != null ? type2.hashCode() : 0)) * 31;
        String str10 = this.shootWay;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.enterFrom;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "CommentVideoModel(userId=" + this.userId + ", userName=" + this.userName + ", userAvatar=" + this.userAvatar + ", commentMsg=" + this.commentMsg + ", commentId=" + this.commentId + ", awemeId=" + this.awemeId + ", awemeUserId=" + this.awemeUserId + ", replyId=" + this.replyId + ", replyToReplyId=" + this.replyToReplyId + ", channelId=" + this.channelId + ", enterMethod=" + this.enterMethod + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", shootWay=" + this.shootWay + ", enterFrom=" + this.enterFrom + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(44309);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public enum Type {
        NONE(0),
        COMMENT(1),
        QUESTION(2);
        
        private final int code;

        public final int getCode() {
            return this.code;
        }

        static {
            Covode.recordClassIndex(44310);
        }

        private Type(int i2) {
            this.code = i2;
        }
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getAwemeUserId() {
        return this.awemeUserId;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getReplyId() {
        return this.replyId;
    }

    public final String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final Type getType() {
        return this.type;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean isComment() {
        if (this.type == Type.COMMENT) {
            return true;
        }
        return false;
    }

    public final boolean isCommentFromEditPanel() {
        return l.a((Object) this.shootWay, (Object) "edit_panel");
    }

    public final boolean isQuestion() {
        if (this.type == Type.QUESTION) {
            return true;
        }
        return false;
    }

    public final boolean isCommentFromPanel() {
        if (l.a((Object) this.shootWay, (Object) "record_panel") || l.a((Object) this.shootWay, (Object) "edit_panel")) {
            return true;
        }
        return false;
    }

    public final void setEndTime(int i2) {
        this.endTime = i2;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStartTime(int i2) {
        this.startTime = i2;
    }

    public final boolean isVisibleWhen(long j2) {
        if (!hasTimeData()) {
            return true;
        }
        if (((long) this.startTime) > j2 || j2 > ((long) this.endTime)) {
            return false;
        }
        return true;
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, int i3, int i4, Type type2, String str10, String str11) {
        this.userId = str;
        this.userName = str2;
        this.userAvatar = urlModel;
        this.commentMsg = str3;
        this.commentId = str4;
        this.awemeId = str5;
        this.awemeUserId = str6;
        this.replyId = str7;
        this.replyToReplyId = str8;
        this.channelId = i2;
        this.enterMethod = str9;
        this.startTime = i3;
        this.endTime = i4;
        this.type = type2;
        this.shootWay = str10;
        this.enterFrom = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CommentVideoModel(java.lang.String r19, java.lang.String r20, com.ss.android.ugc.aweme.base.model.UrlModel r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, int r30, int r31, com.ss.android.ugc.aweme.comment.model.CommentVideoModel.Type r32, java.lang.String r33, java.lang.String r34, int r35, h.f.b.g r36) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.model.CommentVideoModel.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Type, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
