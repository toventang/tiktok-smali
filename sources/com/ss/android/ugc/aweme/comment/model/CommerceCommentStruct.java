package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CommerceCommentStruct implements Serializable {
    @c(a = "ad_avatar_url")
    private String avartalUrl;
    @c(a = "ad_nickname")
    private String nickName;

    static {
        Covode.recordClassIndex(44311);
    }

    public CommerceCommentStruct() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CommerceCommentStruct copy$default(CommerceCommentStruct commerceCommentStruct, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = commerceCommentStruct.nickName;
        }
        if ((i2 & 2) != 0) {
            str2 = commerceCommentStruct.avartalUrl;
        }
        return commerceCommentStruct.copy(str, str2);
    }

    public final String component1() {
        return this.nickName;
    }

    public final String component2() {
        return this.avartalUrl;
    }

    public final CommerceCommentStruct copy(String str, String str2) {
        return new CommerceCommentStruct(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceCommentStruct)) {
            return false;
        }
        CommerceCommentStruct commerceCommentStruct = (CommerceCommentStruct) obj;
        return l.a(this.nickName, commerceCommentStruct.nickName) && l.a(this.avartalUrl, commerceCommentStruct.avartalUrl);
    }

    public final int hashCode() {
        String str = this.nickName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avartalUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommerceCommentStruct(nickName=" + this.nickName + ", avartalUrl=" + this.avartalUrl + ")";
    }

    public final String getAvartalUrl() {
        return this.avartalUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final void setAvartalUrl(String str) {
        this.avartalUrl = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public CommerceCommentStruct(String str, String str2) {
        this.nickName = str;
        this.avartalUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommerceCommentStruct(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
