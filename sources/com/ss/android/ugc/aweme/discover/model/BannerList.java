package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class BannerList extends BaseResponse implements d {
    @c(a = "banner")
    public final List<Banner> items;
    @c(a = "log_pb")
    public final LogPbBean logPb;
    public String requestId;

    static {
        Covode.recordClassIndex(50871);
    }

    public BannerList() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.BannerList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerList copy$default(BannerList bannerList, List list, LogPbBean logPbBean, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bannerList.items;
        }
        if ((i2 & 2) != 0) {
            logPbBean = bannerList.logPb;
        }
        if ((i2 & 4) != 0) {
            str = bannerList.requestId;
        }
        return bannerList.copy(list, logPbBean, str);
    }

    public final BannerList copy(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        l.d(list, "");
        l.d(str, "");
        return new BannerList(list, logPbBean, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerList)) {
            return false;
        }
        BannerList bannerList = (BannerList) obj;
        return l.a(this.items, bannerList.items) && l.a(this.logPb, bannerList.logPb) && l.a(this.requestId, bannerList.requestId);
    }

    public final int hashCode() {
        List<Banner> list = this.items;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode2 = (hashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        String str = this.requestId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "BannerList(items=" + this.items + ", logPb=" + this.logPb + ", requestId=" + this.requestId + ")";
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        l.d(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerList(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        l.d(list, "");
        l.d(str, "");
        this.items = list;
        this.logPb = logPbBean;
        this.requestId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BannerList(List list, LogPbBean logPbBean, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? null : logPbBean, (i2 & 4) != 0 ? "" : str);
    }
}
