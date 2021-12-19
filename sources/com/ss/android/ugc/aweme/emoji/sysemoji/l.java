package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class l implements Serializable {
    @c(a = "create_time")
    private final int createTime;
    @c(a = "id")
    private final int id;
    @c(a = "md5")
    private final String md5;
    @c(a = "resource_url")
    private final String resourceUrl;
    @c(a = "update_time")
    private final int updateTime;

    static {
        Covode.recordClassIndex(56177);
    }

    public static int com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ l copy$default(l lVar, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = lVar.id;
        }
        if ((i5 & 2) != 0) {
            i3 = lVar.createTime;
        }
        if ((i5 & 4) != 0) {
            i4 = lVar.updateTime;
        }
        if ((i5 & 8) != 0) {
            str = lVar.md5;
        }
        if ((i5 & 16) != 0) {
            str2 = lVar.resourceUrl;
        }
        return lVar.copy(i2, i3, i4, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.createTime;
    }

    public final int component3() {
        return this.updateTime;
    }

    public final String component4() {
        return this.md5;
    }

    public final String component5() {
        return this.resourceUrl;
    }

    public final l copy(int i2, int i3, int i4, String str, String str2) {
        return new l(i2, i3, i4, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.id == lVar.id && this.createTime == lVar.createTime && this.updateTime == lVar.updateTime && h.f.b.l.a(this.md5, lVar.md5) && h.f.b.l.a(this.resourceUrl, lVar.resourceUrl);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31) + com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.createTime)) * 31) + com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.updateTime)) * 31;
        String str = this.md5;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.resourceUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ImSystemEmojiRes(id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", md5=" + this.md5 + ", resourceUrl=" + this.resourceUrl + ")";
    }

    public final int getCreateTime() {
        return this.createTime;
    }

    public final int getId() {
        return this.id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final int getUpdateTime() {
        return this.updateTime;
    }

    public l(int i2, int i3, int i4, String str, String str2) {
        this.id = i2;
        this.createTime = i3;
        this.updateTime = i4;
        this.md5 = str;
        this.resourceUrl = str2;
    }
}
