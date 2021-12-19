package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class RankResponse {
    @c(a = "pages")
    private final List<RankPage> pages;
    @c(a = "show_index")
    private final int showIndex;

    static {
        Covode.recordClassIndex(12192);
    }

    public RankResponse() {
        this(null, 0, 3, null);
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_RankResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.rank.impl.api.model.RankResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankResponse copy$default(RankResponse rankResponse, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = rankResponse.pages;
        }
        if ((i3 & 2) != 0) {
            i2 = rankResponse.showIndex;
        }
        return rankResponse.copy(list, i2);
    }

    public final List<RankPage> component1() {
        return this.pages;
    }

    public final int component2() {
        return this.showIndex;
    }

    public final RankResponse copy(List<RankPage> list, int i2) {
        l.d(list, "");
        return new RankResponse(list, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankResponse)) {
            return false;
        }
        RankResponse rankResponse = (RankResponse) obj;
        return l.a(this.pages, rankResponse.pages) && this.showIndex == rankResponse.showIndex;
    }

    public final int hashCode() {
        List<RankPage> list = this.pages;
        return ((list != null ? list.hashCode() : 0) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_RankResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showIndex);
    }

    public final String toString() {
        return "RankResponse(pages=" + this.pages + ", showIndex=" + this.showIndex + ")";
    }

    public final List<RankPage> getPages() {
        return this.pages;
    }

    public final int getShowIndex() {
        return this.showIndex;
    }

    public RankResponse(List<RankPage> list, int i2) {
        l.d(list, "");
        this.pages = list;
        this.showIndex = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RankResponse(List list, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? 0 : i2);
    }
}
