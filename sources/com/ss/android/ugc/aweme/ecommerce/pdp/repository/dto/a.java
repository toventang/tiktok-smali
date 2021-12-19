package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.pdp.PopUp;
import java.util.List;

public final class a {
    @c(a = "products")

    /* renamed from: a  reason: collision with root package name */
    public final List<ProductPackStruct> f86678a;
    @c(a = "cart_entry")

    /* renamed from: b  reason: collision with root package name */
    public final CartEntry f86679b;
    @c(a = "popup")

    /* renamed from: c  reason: collision with root package name */
    public final PopUp f86680c;
    @c(a = "has_shipping_address")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f86681d;
    @c(a = "has_pay_method")

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f86682e;
    @c(a = "schema_info")

    /* renamed from: f  reason: collision with root package name */
    public final DynamicSchema f86683f;

    static {
        Covode.recordClassIndex(54284);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a r55) {
        /*
        // Method dump skipped, instructions count: 607
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a.a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a):com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a");
    }

    private a(List<ProductPackStruct> list, CartEntry cartEntry) {
        this.f86678a = list;
        this.f86679b = cartEntry;
        this.f86680c = null;
        this.f86681d = null;
        this.f86682e = null;
        this.f86683f = null;
    }

    private /* synthetic */ a(List list, CartEntry cartEntry, byte b2) {
        this(list, cartEntry);
    }
}
