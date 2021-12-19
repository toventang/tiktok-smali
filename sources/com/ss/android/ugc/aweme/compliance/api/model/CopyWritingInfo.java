package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class CopyWritingInfo implements Serializable {
    @c(a = "check")
    private final String checkSettings;
    @c(a = "confirm")
    private final String confirm;
    @c(a = "policy_link_list")
    private final List<String> policyLinkList;
    @c(a = "policy_list")
    private final List<String> policyList;
    @c(a = "subtext")
    private final String subtext;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47332);
    }

    public CopyWritingInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyWritingInfo copy$default(CopyWritingInfo copyWritingInfo, String str, String str2, List list, List list2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = copyWritingInfo.title;
        }
        if ((i2 & 2) != 0) {
            str2 = copyWritingInfo.subtext;
        }
        if ((i2 & 4) != 0) {
            list = copyWritingInfo.policyList;
        }
        if ((i2 & 8) != 0) {
            list2 = copyWritingInfo.policyLinkList;
        }
        if ((i2 & 16) != 0) {
            str3 = copyWritingInfo.confirm;
        }
        if ((i2 & 32) != 0) {
            str4 = copyWritingInfo.checkSettings;
        }
        return copyWritingInfo.copy(str, str2, list, list2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtext;
    }

    public final List<String> component3() {
        return this.policyList;
    }

    public final List<String> component4() {
        return this.policyLinkList;
    }

    public final String component5() {
        return this.confirm;
    }

    public final String component6() {
        return this.checkSettings;
    }

    public final CopyWritingInfo copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        return new CopyWritingInfo(str, str2, list, list2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyWritingInfo)) {
            return false;
        }
        CopyWritingInfo copyWritingInfo = (CopyWritingInfo) obj;
        return l.a(this.title, copyWritingInfo.title) && l.a(this.subtext, copyWritingInfo.subtext) && l.a(this.policyList, copyWritingInfo.policyList) && l.a(this.policyLinkList, copyWritingInfo.policyLinkList) && l.a(this.confirm, copyWritingInfo.confirm) && l.a(this.checkSettings, copyWritingInfo.checkSettings);
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtext;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.policyList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.policyLinkList;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.confirm;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.checkSettings;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "CopyWritingInfo(title=" + this.title + ", subtext=" + this.subtext + ", policyList=" + this.policyList + ", policyLinkList=" + this.policyLinkList + ", confirm=" + this.confirm + ", checkSettings=" + this.checkSettings + ")";
    }

    public final String getCheckSettings() {
        return this.checkSettings;
    }

    public final String getConfirm() {
        return this.confirm;
    }

    public final List<String> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final List<String> getPolicyList() {
        return this.policyList;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getTitle() {
        return this.title;
    }

    public CopyWritingInfo(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.title = str;
        this.subtext = str2;
        this.policyList = list;
        this.policyLinkList = list2;
        this.confirm = str3;
        this.checkSettings = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CopyWritingInfo(java.lang.String r8, java.lang.String r9, java.util.List r10, java.util.List r11, java.lang.String r12, java.lang.String r13, int r14, h.f.b.g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r4 = r11
            r3 = r10
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
            if (r0 == 0) goto L_0x0017
            h.a.z r3 = h.a.z.INSTANCE
        L_0x0017:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001d
            h.a.z r4 = h.a.z.INSTANCE
        L_0x001d:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0022
            r5 = r6
        L_0x0022:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x002b
        L_0x0026:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x002b:
            r6 = r13
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
