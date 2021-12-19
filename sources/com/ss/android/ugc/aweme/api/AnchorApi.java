package com.ss.android.ugc.aweme.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.api.request.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.api.resp.a;
import com.ss.android.ugc.aweme.api.resp.b;
import com.ss.android.ugc.aweme.api.resp.d;
import com.ss.android.ugc.aweme.app.api.Api;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.o;
import l.b.t;

public final class AnchorApi {

    /* renamed from: a  reason: collision with root package name */
    public static final f f66431a = RetrofitFactory.a().b(Api.f66569d).d();

    /* renamed from: b  reason: collision with root package name */
    public static final AnchorApi f66432b = new AnchorApi();

    /* renamed from: c  reason: collision with root package name */
    private static final f f66433c = RetrofitFactory.a().a("https://oec-api.tiktokv.com/");

    public interface RealApi {
        static {
            Covode.recordClassIndex(40827);
        }

        @o(a = "/aweme/v1/anchor/history/delete/")
        @e
        i<a> getAnchorDeleteHistoryResponse(@c(a = "type") int i2, @c(a = "ids") String str, @c(a = "clear_all") boolean z);

        @o(a = "/api/v1/shop/item/product_info/get")
        i<d> getAnchorProductInfoResponse(@l.b.a GetItemProductInfoRequest getItemProductInfoRequest);

        @l.b.f(a = "/aweme/v1/anchor/search/")
        q<b> getAnchorSearchResponse(@t(a = "type") int i2, @t(a = "keyword") String str, @t(a = "page") int i3, @t(a = "page_size") int i4);

        @l.b.f(a = "/aweme/v1/anchor/selection/")
        q<com.ss.android.ugc.aweme.api.resp.c> getAnchorSelectionResponse(@t(a = "type") int i2, @t(a = "tab_id") int i3, @t(a = "page") int i4, @t(a = "page_size") int i5);
    }

    private AnchorApi() {
    }

    static {
        Covode.recordClassIndex(40826);
    }

    public static i<d> a(GetItemProductInfoRequest getItemProductInfoRequest) {
        l.d(getItemProductInfoRequest, "");
        return ((RealApi) f66433c.a(RealApi.class)).getAnchorProductInfoResponse(getItemProductInfoRequest);
    }
}
