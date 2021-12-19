package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import h.a.ag;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.v;
import h.z;
import java.util.Map;
import kotlinx.coroutines.am;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ProductApi f104548a = ((ProductApi) com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.a.a(ProductApi.class, "https://oec-api.tiktokv.com"));

    static {
        Covode.recordClassIndex(66978);
    }

    public static final class a extends k implements m<am, d<? super a>, Object> {
        final /* synthetic */ boolean $ifDeleteAll;
        final /* synthetic */ String $productIds;
        final /* synthetic */ String $roomId;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, boolean z, String str, String str2, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$ifDeleteAll = z;
            this.$roomId = str;
            this.$productIds = str2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, this.$ifDeleteAll, this.$roomId, this.$productIds, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super a> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Map<String, String> map;
            if (this.label == 0) {
                r.a(obj);
                try {
                    if (this.$ifDeleteAll) {
                        map = ag.a(v.a("delete_mode", "1"));
                    } else {
                        map = ag.a(v.a("room_id", this.$roomId), v.a("product_ids", this.$productIds), v.a("delete_mode", "0"));
                    }
                    return new a(this.this$0.f104548a.deleteProducts(map).execute().f42630b, this.$productIds, 4);
                } catch (Exception e2) {
                    return new a((BaseResponse<String>) null, this.$productIds, e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
