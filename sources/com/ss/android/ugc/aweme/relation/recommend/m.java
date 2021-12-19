package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class m implements Serializable {
    private final String buttonText;
    private final int socialRecType;
    private final String subTitle;
    private final String title;
    private final String toast;

    static {
        Covode.recordClassIndex(78395);
    }

    public m() {
        this(0, null, null, null, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ m copy$default(m mVar, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mVar.socialRecType;
        }
        if ((i3 & 2) != 0) {
            str = mVar.title;
        }
        if ((i3 & 4) != 0) {
            str2 = mVar.subTitle;
        }
        if ((i3 & 8) != 0) {
            str3 = mVar.buttonText;
        }
        if ((i3 & 16) != 0) {
            str4 = mVar.toast;
        }
        return mVar.copy(i2, str, str2, str3, str4);
    }

    public final int component1() {
        return this.socialRecType;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final String component4() {
        return this.buttonText;
    }

    public final String component5() {
        return this.toast;
    }

    public final m copy(int i2, String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new m(i2, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.socialRecType == mVar.socialRecType && l.a(this.title, mVar.title) && l.a(this.subTitle, mVar.subTitle) && l.a(this.buttonText, mVar.buttonText) && l.a(this.toast, mVar.toast);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.socialRecType) * 31;
        String str = this.title;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buttonText;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.toast;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "SocialRecommendFriendsConfig(socialRecType=" + this.socialRecType + ", title=" + this.title + ", subTitle=" + this.subTitle + ", buttonText=" + this.buttonText + ", toast=" + this.toast + ")";
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getSocialRecType() {
        return this.socialRecType;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToast() {
        return this.toast;
    }

    public m(int i2, String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.socialRecType = i2;
        this.title = str;
        this.subTitle = str2;
        this.buttonText = str3;
        this.toast = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0009
            r1 = 0
        L_0x0009:
            r0 = r12 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recommend.m.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
