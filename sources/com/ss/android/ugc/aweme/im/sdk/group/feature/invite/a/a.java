package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "avatar_url")
    private String avatarUrl;
    @c(a = "conversation_id")
    private String conversationId;
    @c(a = "conversation_short_id")
    private String conversationShortId;
    @c(a = "group_size")
    private Integer groupSize;
    @c(a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(65738);
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.conversationId;
        }
        if ((i2 & 2) != 0) {
            str2 = aVar.conversationShortId;
        }
        if ((i2 & 4) != 0) {
            str3 = aVar.name;
        }
        if ((i2 & 8) != 0) {
            str4 = aVar.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            num = aVar.groupSize;
        }
        return aVar.copy(str, str2, str3, str4, num);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final String component2() {
        return this.conversationShortId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final Integer component5() {
        return this.groupSize;
    }

    public final a copy(String str, String str2, String str3, String str4, Integer num) {
        return new a(str, str2, str3, str4, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.conversationId, aVar.conversationId) && l.a(this.conversationShortId, aVar.conversationShortId) && l.a(this.name, aVar.name) && l.a(this.avatarUrl, aVar.avatarUrl) && l.a(this.groupSize, aVar.groupSize);
    }

    public final int hashCode() {
        String str = this.conversationId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.conversationShortId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.groupSize;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "GroupInfo(conversationId=" + this.conversationId + ", conversationShortId=" + this.conversationShortId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", groupSize=" + this.groupSize + ")";
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    public final Integer getGroupSize() {
        return this.groupSize;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(String str) {
        this.conversationShortId = str;
    }

    public final void setGroupSize(Integer num) {
        this.groupSize = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public a(String str, String str2, String str3, String str4, Integer num) {
        this.conversationId = str;
        this.conversationShortId = str2;
        this.name = str3;
        this.avatarUrl = str4;
        this.groupSize = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, String str3, String str4, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) == 0 ? num : null);
    }
}
