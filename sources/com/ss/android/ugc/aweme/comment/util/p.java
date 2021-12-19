package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class p implements Serializable {
    @c(a = "icon_url_list")
    private final List<UrlModel> iconUrlList;

    static {
        Covode.recordClassIndex(44884);
    }

    public p() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.util.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p copy$default(p pVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = pVar.iconUrlList;
        }
        return pVar.copy(list);
    }

    public final List<UrlModel> component1() {
        return this.iconUrlList;
    }

    public final p copy(List<? extends UrlModel> list) {
        return new p(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && l.a(this.iconUrlList, ((p) obj).iconUrlList);
        }
        return true;
    }

    public final int hashCode() {
        List<UrlModel> list = this.iconUrlList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DonationStickerAnchorExtra(iconUrlList=" + this.iconUrlList + ")";
    }

    public final List<UrlModel> getIconUrlList() {
        return this.iconUrlList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends UrlModel> list) {
        this.iconUrlList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list);
    }
}
