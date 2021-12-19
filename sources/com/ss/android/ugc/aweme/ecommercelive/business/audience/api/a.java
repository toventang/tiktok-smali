package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AudienceProductListApi f87747a = ((AudienceProductListApi) com.ss.android.ugc.aweme.ecommercelive.framework.network.a.a(AudienceProductListApi.class, "https://oec-api.tiktokv.com"));

    static {
        Covode.recordClassIndex(55193);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a$a  reason: collision with other inner class name */
    public static final class C2121a extends k implements m<am, d<? super b>, Object> {
        final /* synthetic */ List $productIds;
        final /* synthetic */ String $roomId;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2121a(a aVar, List list, String str, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$productIds = list;
            this.$roomId = str;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2121a(this.this$0, this.$productIds, this.$roomId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super b> dVar) {
            return ((C2121a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            if (this.label == 0) {
                r.a(obj);
                List list = this.$productIds;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    new b(null, new RuntimeException("productIds cannot be null!!"));
                }
                StringBuilder sb = new StringBuilder();
                for (String str : this.$productIds) {
                    sb.append(str);
                    sb.append(',');
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                try {
                    AudienceProductListApi audienceProductListApi = this.this$0.f87747a;
                    String str2 = this.$roomId;
                    String sb2 = sb.toString();
                    l.b(sb2, "");
                    return new b(audienceProductListApi.getProductList(str2, sb2).execute().f42630b, null);
                } catch (Exception e2) {
                    return new b(null, e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
