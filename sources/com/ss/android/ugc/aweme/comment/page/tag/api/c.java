package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "user_blocked_results")
    private ArrayList<d> tagUpdateStatus;
    @com.google.gson.a.c(a = "uid")
    private long uid;

    static {
        Covode.recordClassIndex(44518);
    }

    public c() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.page.tag.api.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, long j2, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = cVar.uid;
        }
        if ((i2 & 2) != 0) {
            arrayList = cVar.tagUpdateStatus;
        }
        return cVar.copy(j2, arrayList);
    }

    public final long component1() {
        return this.uid;
    }

    public final ArrayList<d> component2() {
        return this.tagUpdateStatus;
    }

    public final c copy(long j2, ArrayList<d> arrayList) {
        return new c(j2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.uid == cVar.uid && l.a(this.tagUpdateStatus, cVar.tagUpdateStatus);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.uid) * 31;
        ArrayList<d> arrayList = this.tagUpdateStatus;
        return com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "MentionCheckResult(uid=" + this.uid + ", tagUpdateStatus=" + this.tagUpdateStatus + ")";
    }

    public final ArrayList<d> getTagUpdateStatus() {
        return this.tagUpdateStatus;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setTagUpdateStatus(ArrayList<d> arrayList) {
        this.tagUpdateStatus = arrayList;
    }

    public final void setUid(long j2) {
        this.uid = j2;
    }

    public c(long j2, ArrayList<d> arrayList) {
        this.uid = j2;
        this.tagUpdateStatus = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(long j2, ArrayList arrayList, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? null : arrayList);
    }
}
