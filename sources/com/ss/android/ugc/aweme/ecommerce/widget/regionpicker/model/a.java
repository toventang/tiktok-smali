package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import java.util.List;

public final class a {
    @c(a = "geoname_ids")

    /* renamed from: a  reason: collision with root package name */
    public final String[] f87678a;
    @c(a = "order_skus")

    /* renamed from: b  reason: collision with root package name */
    public final List<OrderSKUDTO> f87679b;

    static {
        Covode.recordClassIndex(55147);
    }

    private /* synthetic */ a() {
        this(null, null);
    }

    public a(String[] strArr, List<OrderSKUDTO> list) {
        this.f87678a = strArr;
        this.f87679b = list;
    }
}
