package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class LegalEntityChangeInfo implements Serializable {
    @c(a = "body")
    private final String body;
    @c(a = "content_link_list")
    private final List<PolicyBodyLinkList> bodyLinkList;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(47336);
    }

    public LegalEntityChangeInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalEntityChangeInfo copy$default(LegalEntityChangeInfo legalEntityChangeInfo, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = legalEntityChangeInfo.title;
        }
        if ((i2 & 2) != 0) {
            str2 = legalEntityChangeInfo.body;
        }
        if ((i2 & 4) != 0) {
            list = legalEntityChangeInfo.bodyLinkList;
        }
        return legalEntityChangeInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final List<PolicyBodyLinkList> component3() {
        return this.bodyLinkList;
    }

    public final LegalEntityChangeInfo copy(String str, String str2, List<PolicyBodyLinkList> list) {
        return new LegalEntityChangeInfo(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalEntityChangeInfo)) {
            return false;
        }
        LegalEntityChangeInfo legalEntityChangeInfo = (LegalEntityChangeInfo) obj;
        return l.a(this.title, legalEntityChangeInfo.title) && l.a(this.body, legalEntityChangeInfo.body) && l.a(this.bodyLinkList, legalEntityChangeInfo.bodyLinkList);
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<PolicyBodyLinkList> list = this.bodyLinkList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LegalEntityChangeInfo(title=" + this.title + ", body=" + this.body + ", bodyLinkList=" + this.bodyLinkList + ")";
    }

    public final String getBody() {
        return this.body;
    }

    public final List<PolicyBodyLinkList> getBodyLinkList() {
        return this.bodyLinkList;
    }

    public final String getTitle() {
        return this.title;
    }

    public LegalEntityChangeInfo(String str, String str2, List<PolicyBodyLinkList> list) {
        this.title = str;
        this.body = str2;
        this.bodyLinkList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LegalEntityChangeInfo(String str, String str2, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? z.INSTANCE : list);
    }
}
