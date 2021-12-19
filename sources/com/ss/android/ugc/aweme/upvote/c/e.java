package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class e implements Serializable {
    @c(a = "cursor")
    private final long cursor;
    @c(a = "has_more")
    private final boolean hasMore;
    @c(a = "item_id")
    private final String itemId;
    @c(a = "total")
    private final long total;
    @c(a = "upvotes")
    private final List<h> upvotes;

    static {
        Covode.recordClassIndex(92824);
    }

    public e() {
        this(null, 0, false, 0, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.upvote.c.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e copy$default(e eVar, List list, long j2, boolean z, long j3, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = eVar.upvotes;
        }
        if ((i2 & 2) != 0) {
            j2 = eVar.cursor;
        }
        if ((i2 & 4) != 0) {
            z = eVar.hasMore;
        }
        if ((i2 & 8) != 0) {
            j3 = eVar.total;
        }
        if ((i2 & 16) != 0) {
            str = eVar.itemId;
        }
        return eVar.copy(list, j2, z, j3, str);
    }

    public final List<h> component1() {
        return this.upvotes;
    }

    public final long component2() {
        return this.cursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final long component4() {
        return this.total;
    }

    public final String component5() {
        return this.itemId;
    }

    public final e copy(List<h> list, long j2, boolean z, long j3, String str) {
        l.d(list, "");
        l.d(str, "");
        return new e(list, j2, z, j3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.upvotes, eVar.upvotes) && this.cursor == eVar.cursor && this.hasMore == eVar.hasMore && this.total == eVar.total && l.a(this.itemId, eVar.itemId);
    }

    public final int hashCode() {
        List<h> list = this.upvotes;
        int i2 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i3) * 31) + com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total)) * 31;
        String str = this.itemId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return com_ss_android_ugc_aweme_upvote_model_UpvoteList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2;
    }

    public final String toString() {
        return "UpvoteList(upvotes=" + this.upvotes + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", total=" + this.total + ", itemId=" + this.itemId + ")";
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final List<h> getUpvotes() {
        return this.upvotes;
    }

    public e(List<h> list, long j2, boolean z, long j3, String str) {
        l.d(list, "");
        l.d(str, "");
        this.upvotes = list;
        this.cursor = j2;
        this.hasMore = z;
        this.total = j3;
        this.itemId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, long j2, boolean z, long j3, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? false : z, (i2 & 8) == 0 ? j3 : 0, (i2 & 16) != 0 ? "" : str);
    }
}
