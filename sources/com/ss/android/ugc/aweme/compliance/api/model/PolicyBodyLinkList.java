package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class PolicyBodyLinkList {
    @c(a = "approve")
    private final Boolean approve;
    @c(a = "dismiss")
    private final Boolean dismiss;
    @c(a = "extra")
    private final String extra;
    @c(a = "link")
    private final String link;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "operation")
    private final Integer operation;

    static {
        Covode.recordClassIndex(47339);
    }

    public PolicyBodyLinkList() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PolicyBodyLinkList copy$default(PolicyBodyLinkList policyBodyLinkList, String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = policyBodyLinkList.name;
        }
        if ((i2 & 2) != 0) {
            str2 = policyBodyLinkList.link;
        }
        if ((i2 & 4) != 0) {
            bool = policyBodyLinkList.approve;
        }
        if ((i2 & 8) != 0) {
            num = policyBodyLinkList.operation;
        }
        if ((i2 & 16) != 0) {
            bool2 = policyBodyLinkList.dismiss;
        }
        if ((i2 & 32) != 0) {
            str3 = policyBodyLinkList.extra;
        }
        return policyBodyLinkList.copy(str, str2, bool, num, bool2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.link;
    }

    public final Boolean component3() {
        return this.approve;
    }

    public final Integer component4() {
        return this.operation;
    }

    public final Boolean component5() {
        return this.dismiss;
    }

    public final String component6() {
        return this.extra;
    }

    public final PolicyBodyLinkList copy(String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3) {
        l.d(str3, "");
        return new PolicyBodyLinkList(str, str2, bool, num, bool2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyBodyLinkList)) {
            return false;
        }
        PolicyBodyLinkList policyBodyLinkList = (PolicyBodyLinkList) obj;
        return l.a(this.name, policyBodyLinkList.name) && l.a(this.link, policyBodyLinkList.link) && l.a(this.approve, policyBodyLinkList.approve) && l.a(this.operation, policyBodyLinkList.operation) && l.a(this.dismiss, policyBodyLinkList.dismiss) && l.a(this.extra, policyBodyLinkList.extra);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.approve;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.operation;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.dismiss;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str3 = this.extra;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "PolicyBodyLinkList(name=" + this.name + ", link=" + this.link + ", approve=" + this.approve + ", operation=" + this.operation + ", dismiss=" + this.dismiss + ", extra=" + this.extra + ")";
    }

    public final Boolean getApprove() {
        return this.approve;
    }

    public final Boolean getDismiss() {
        return this.dismiss;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOperation() {
        return this.operation;
    }

    public PolicyBodyLinkList(String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3) {
        l.d(str3, "");
        this.name = str;
        this.link = str2;
        this.approve = bool;
        this.operation = num;
        this.dismiss = bool2;
        this.extra = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PolicyBodyLinkList(java.lang.String r9, java.lang.String r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.Boolean r13, java.lang.String r14, int r15, h.f.b.g r16) {
        /*
            r8 = this;
            r6 = r13
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r15 & 1
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x000c
            r2 = r7
        L_0x000c:
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0011
            r3 = r7
        L_0x0011:
            r0 = r15 & 4
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L_0x001a:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001f
            r5 = 0
        L_0x001f:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0027
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x0027:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0030
        L_0x002b:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            r7 = r14
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.String, int, h.f.b.g):void");
    }
}
