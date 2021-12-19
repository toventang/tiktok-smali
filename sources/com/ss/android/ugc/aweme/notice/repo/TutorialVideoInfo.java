package com.ss.android.ugc.aweme.notice.repo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class TutorialVideoInfo {
    @c(a = "button_caption")
    private final String button;
    @c(a = "deep_link")
    private final String deepLink;
    @c(a = "desc")
    private final String desc;
    @c(a = "icon")
    private final String icon;
    @c(a = "msg_id")
    private final String msgId;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(72499);
    }

    public TutorialVideoInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TutorialVideoInfo copy$default(TutorialVideoInfo tutorialVideoInfo, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tutorialVideoInfo.msgId;
        }
        if ((i2 & 2) != 0) {
            str2 = tutorialVideoInfo.icon;
        }
        if ((i2 & 4) != 0) {
            str3 = tutorialVideoInfo.title;
        }
        if ((i2 & 8) != 0) {
            str4 = tutorialVideoInfo.desc;
        }
        if ((i2 & 16) != 0) {
            str5 = tutorialVideoInfo.button;
        }
        if ((i2 & 32) != 0) {
            str6 = tutorialVideoInfo.deepLink;
        }
        return tutorialVideoInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.msgId;
    }

    public final String component2() {
        return this.icon;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.desc;
    }

    public final String component5() {
        return this.button;
    }

    public final String component6() {
        return this.deepLink;
    }

    public final TutorialVideoInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        return new TutorialVideoInfo(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TutorialVideoInfo)) {
            return false;
        }
        TutorialVideoInfo tutorialVideoInfo = (TutorialVideoInfo) obj;
        return l.a(this.msgId, tutorialVideoInfo.msgId) && l.a(this.icon, tutorialVideoInfo.icon) && l.a(this.title, tutorialVideoInfo.title) && l.a(this.desc, tutorialVideoInfo.desc) && l.a(this.button, tutorialVideoInfo.button) && l.a(this.deepLink, tutorialVideoInfo.deepLink);
    }

    public final int hashCode() {
        String str = this.msgId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.desc;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.button;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.deepLink;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "TutorialVideoInfo(msgId=" + this.msgId + ", icon=" + this.icon + ", title=" + this.title + ", desc=" + this.desc + ", button=" + this.button + ", deepLink=" + this.deepLink + ")";
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getTitle() {
        return this.title;
    }

    public TutorialVideoInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.msgId = str;
        this.icon = str2;
        this.title = str3;
        this.desc = str4;
        this.button = str5;
        this.deepLink = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TutorialVideoInfo(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, h.f.b.g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0 = r14 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r6
        L_0x000c:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r6 = r13
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
