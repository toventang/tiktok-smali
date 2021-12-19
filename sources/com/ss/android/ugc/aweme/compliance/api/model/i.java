package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class i implements Serializable {
    @c(a = "actions")
    private final List<j> actions;
    @c(a = "body")
    private final String body;
    @c(a = "business")
    private final String business;
    @c(a = "first_button_highlight")
    private final Boolean firstButtonHighlight;
    @c(a = "icon_url")
    private final String icon_url;
    @c(a = "sub_pop_up")
    private final Boolean isSubPopUp;
    @c(a = "body_link_list")
    private final List<PolicyBodyLinkList> policyLinkList;
    @c(a = "policy_version")
    private final String policyVersion;
    @c(a = "style")
    private final String style;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47353);
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.i */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i copy$default(i iVar, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iVar.business;
        }
        if ((i2 & 2) != 0) {
            str2 = iVar.policyVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = iVar.style;
        }
        if ((i2 & 8) != 0) {
            str4 = iVar.title;
        }
        if ((i2 & 16) != 0) {
            str5 = iVar.body;
        }
        if ((i2 & 32) != 0) {
            list = iVar.actions;
        }
        if ((i2 & 64) != 0) {
            str6 = iVar.icon_url;
        }
        if ((i2 & 128) != 0) {
            list2 = iVar.policyLinkList;
        }
        if ((i2 & 256) != 0) {
            bool = iVar.isSubPopUp;
        }
        if ((i2 & 512) != 0) {
            bool2 = iVar.firstButtonHighlight;
        }
        return iVar.copy(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final String component1() {
        return this.business;
    }

    public final Boolean component10() {
        return this.firstButtonHighlight;
    }

    public final String component2() {
        return this.policyVersion;
    }

    public final String component3() {
        return this.style;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.body;
    }

    public final List<j> component6() {
        return this.actions;
    }

    public final String component7() {
        return this.icon_url;
    }

    public final List<PolicyBodyLinkList> component8() {
        return this.policyLinkList;
    }

    public final Boolean component9() {
        return this.isSubPopUp;
    }

    public final i copy(String str, String str2, String str3, String str4, String str5, List<j> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(str6, "");
        return new i(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.business, iVar.business) && l.a(this.policyVersion, iVar.policyVersion) && l.a(this.style, iVar.style) && l.a(this.title, iVar.title) && l.a(this.body, iVar.body) && l.a(this.actions, iVar.actions) && l.a(this.icon_url, iVar.icon_url) && l.a(this.policyLinkList, iVar.policyLinkList) && l.a(this.isSubPopUp, iVar.isSubPopUp) && l.a(this.firstButtonHighlight, iVar.firstButtonHighlight);
    }

    public final int hashCode() {
        String str = this.business;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.policyVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.style;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.body;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<j> list = this.actions;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.icon_url;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<PolicyBodyLinkList> list2 = this.policyLinkList;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.isSubPopUp;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.firstButtonHighlight;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "PolicyNotice(business=" + this.business + ", policyVersion=" + this.policyVersion + ", style=" + this.style + ", title=" + this.title + ", body=" + this.body + ", actions=" + this.actions + ", icon_url=" + this.icon_url + ", policyLinkList=" + this.policyLinkList + ", isSubPopUp=" + this.isSubPopUp + ", firstButtonHighlight=" + this.firstButtonHighlight + ")";
    }

    public final List<j> getActions() {
        return this.actions;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getBusiness() {
        return this.business;
    }

    public final Boolean getFirstButtonHighlight() {
        return this.firstButtonHighlight;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final List<PolicyBodyLinkList> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final String getPolicyVersion() {
        return this.policyVersion;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isSubPopUp() {
        return this.isSubPopUp;
    }

    public i(String str, String str2, String str3, String str4, String str5, List<j> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(list, "");
        l.d(str6, "");
        this.business = str;
        this.policyVersion = str2;
        this.style = str3;
        this.title = str4;
        this.body = str5;
        this.actions = list;
        this.icon_url = str6;
        this.policyLinkList = list2;
        this.isSubPopUp = bool;
        this.firstButtonHighlight = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.lang.String r20, java.util.List r21, java.lang.Boolean r22, java.lang.Boolean r23, int r24, h.f.b.g r25) {
        /*
            r13 = this;
            r12 = r23
            r11 = r22
            r8 = r19
            r7 = r18
            r3 = r14
            r10 = r21
            r4 = r15
            r5 = r16
            r2 = r24
            r6 = r17
            r0 = r2 & 1
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0019
            r3 = r9
        L_0x0019:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x001e
            r4 = r9
        L_0x001e:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0023
            r5 = r9
        L_0x0023:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0028
            r6 = r9
        L_0x0028:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x002d
            r7 = r9
        L_0x002d:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0033
            h.a.z r8 = h.a.z.INSTANCE
        L_0x0033:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0053
        L_0x0037:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            h.a.z r10 = h.a.z.INSTANCE
        L_0x003d:
            r0 = r2 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x0046:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
        L_0x004e:
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0053:
            r9 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.i.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, int, h.f.b.g):void");
    }
}
