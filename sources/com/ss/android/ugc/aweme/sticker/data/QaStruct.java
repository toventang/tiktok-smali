package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class QaStruct implements Serializable {
    @c(a = "user_avatar")
    public UrlModel avatarUrl;
    @c(a = "invited_users")
    public List<Long> inviteUserList;
    @c(a = "item_id")
    public long itemId;
    @c(a = "content")
    public String questionContent;
    @c(a = "question_id")
    public long questionId;
    @c(a = "sec_uid")
    public String secId;
    @c(a = "source")
    public f source;
    @c(a = "user_id")
    public long userId;
    @c(a = "username")
    public String userName;

    static {
        Covode.recordClassIndex(88105);
    }

    public QaStruct() {
        this(0, 0, 0, null, null, null, null, null, null, 511, null);
    }

    public QaStruct(long j2) {
        this(j2, 0, 0, null, null, null, null, null, null, 510, null);
    }

    public QaStruct(long j2, long j3) {
        this(j2, j3, 0, null, null, null, null, null, null, 508, null);
    }

    public QaStruct(long j2, long j3, long j4) {
        this(j2, j3, j4, null, null, null, null, null, null, 504, null);
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel) {
        this(j2, j3, j4, urlModel, null, null, null, null, null, 496, null);
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str) {
        this(j2, j3, j4, urlModel, str, null, null, null, null, 480, null);
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str, String str2) {
        this(j2, j3, j4, urlModel, str, str2, null, null, null, 448, null);
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3) {
        this(j2, j3, j4, urlModel, str, str2, str3, null, null, 384, null);
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3, List<Long> list) {
        this(j2, j3, j4, urlModel, str, str2, str3, list, null, 256, null);
    }

    public static int com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.QaStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QaStruct copy$default(QaStruct qaStruct, long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3, List list, f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = qaStruct.questionId;
        }
        if ((i2 & 2) != 0) {
            j3 = qaStruct.userId;
        }
        if ((i2 & 4) != 0) {
            j4 = qaStruct.itemId;
        }
        if ((i2 & 8) != 0) {
            urlModel = qaStruct.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            str = qaStruct.userName;
        }
        if ((i2 & 32) != 0) {
            str2 = qaStruct.questionContent;
        }
        if ((i2 & 64) != 0) {
            str3 = qaStruct.secId;
        }
        if ((i2 & 128) != 0) {
            list = qaStruct.inviteUserList;
        }
        if ((i2 & 256) != 0) {
            fVar = qaStruct.source;
        }
        return qaStruct.copy(j2, j3, j4, urlModel, str, str2, str3, list, fVar);
    }

    public final long component1() {
        return this.questionId;
    }

    public final long component2() {
        return this.userId;
    }

    public final long component3() {
        return this.itemId;
    }

    public final UrlModel component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.userName;
    }

    public final String component6() {
        return this.questionContent;
    }

    public final String component7() {
        return this.secId;
    }

    public final List<Long> component8() {
        return this.inviteUserList;
    }

    public final f component9() {
        return this.source;
    }

    public final QaStruct copy(long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3, List<Long> list, f fVar) {
        l.d(list, "");
        l.d(fVar, "");
        return new QaStruct(j2, j3, j4, urlModel, str, str2, str3, list, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QaStruct)) {
            return false;
        }
        QaStruct qaStruct = (QaStruct) obj;
        return this.questionId == qaStruct.questionId && this.userId == qaStruct.userId && this.itemId == qaStruct.itemId && l.a(this.avatarUrl, qaStruct.avatarUrl) && l.a(this.userName, qaStruct.userName) && l.a(this.questionContent, qaStruct.questionContent) && l.a(this.secId, qaStruct.secId) && l.a(this.inviteUserList, qaStruct.inviteUserList) && l.a(this.source, qaStruct.source);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.questionId) * 31) + com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.userId)) * 31) + com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.itemId)) * 31;
        UrlModel urlModel = this.avatarUrl;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_data_QaStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.userName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.questionContent;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Long> list = this.inviteUserList;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        f fVar = this.source;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "QaStruct(questionId=" + this.questionId + ", userId=" + this.userId + ", itemId=" + this.itemId + ", avatarUrl=" + this.avatarUrl + ", userName=" + this.userName + ", questionContent=" + this.questionContent + ", secId=" + this.secId + ", inviteUserList=" + this.inviteUserList + ", source=" + this.source + ")";
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final List<Long> getInviteUserList() {
        return this.inviteUserList;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getQuestionContent() {
        return this.questionContent;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getSecId() {
        return this.secId;
    }

    public final f getSource() {
        return this.source;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3, List<Long> list, f fVar) {
        l.d(list, "");
        l.d(fVar, "");
        this.questionId = j2;
        this.userId = j3;
        this.itemId = j4;
        this.avatarUrl = urlModel;
        this.userName = str;
        this.questionContent = str2;
        this.secId = str3;
        this.inviteUserList = list;
        this.source = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QaStruct(long j2, long j3, long j4, UrlModel urlModel, String str, String str2, String str3, List list, f fVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? 0 : j3, (i2 & 4) == 0 ? j4 : 0, (i2 & 8) != 0 ? null : urlModel, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) == 0 ? str3 : null, (i2 & 128) != 0 ? z.INSTANCE : list, (i2 & 256) != 0 ? f.Default : fVar);
    }

    public final void setSource(f fVar) {
        l.d(fVar, "");
        this.source = fVar;
    }
}
