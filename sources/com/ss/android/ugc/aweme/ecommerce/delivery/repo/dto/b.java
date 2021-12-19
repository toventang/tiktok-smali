package com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import java.util.List;

public final class b {
    @c(a = "order_skus")

    /* renamed from: a  reason: collision with root package name */
    public final List<OrderSKUDTO> f85918a;
    @c(a = "buyer_addr_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f85919b;
    @c(a = "ship_to_addr")

    /* renamed from: c  reason: collision with root package name */
    public final List<Region> f85920c;

    static {
        Covode.recordClassIndex(53788);
    }

    private /* synthetic */ b() {
        this(null, null, null);
    }

    public b(List<OrderSKUDTO> list, String str, List<Region> list2) {
        this.f85918a = list;
        this.f85919b = str;
        this.f85920c = list2;
    }
}
