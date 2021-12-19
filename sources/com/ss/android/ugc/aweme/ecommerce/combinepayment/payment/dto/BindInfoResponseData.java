package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class BindInfoResponseData {
    @c(a = "bind_info_list")
    private final List<BindInfoItem> bindInfoList;

    static {
        Covode.recordClassIndex(53371);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoResponseData copy$default(BindInfoResponseData bindInfoResponseData, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bindInfoResponseData.bindInfoList;
        }
        return bindInfoResponseData.copy(list);
    }

    public final List<BindInfoItem> component1() {
        return this.bindInfoList;
    }

    public final BindInfoResponseData copy(List<BindInfoItem> list) {
        return new BindInfoResponseData(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoResponseData) && l.a(this.bindInfoList, ((BindInfoResponseData) obj).bindInfoList);
        }
        return true;
    }

    public final int hashCode() {
        List<BindInfoItem> list = this.bindInfoList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoResponseData(bindInfoList=" + this.bindInfoList + ")";
    }

    public final List<BindInfoItem> getBindInfoList() {
        return this.bindInfoList;
    }

    public BindInfoResponseData(List<BindInfoItem> list) {
        this.bindInfoList = list;
    }
}
