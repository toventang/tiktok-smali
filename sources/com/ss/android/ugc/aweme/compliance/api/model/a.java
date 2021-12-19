package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class a extends BaseResponse implements Serializable {
    @c(a = "ban_infos")
    private final List<b> banInfos;

    static {
        Covode.recordClassIndex(47345);
    }

    public a() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aVar.banInfos;
        }
        return aVar.copy(list);
    }

    public final List<b> component1() {
        return this.banInfos;
    }

    public final a copy(List<b> list) {
        return new a(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.banInfos, ((a) obj).banInfos);
        }
        return true;
    }

    public final int hashCode() {
        List<b> list = this.banInfos;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AccountBannedDetail(banInfos=" + this.banInfos + ")";
    }

    public final List<b> getBanInfos() {
        return this.banInfos;
    }

    public a(List<b> list) {
        this.banInfos = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list);
    }
}
