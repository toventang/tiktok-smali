package com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.g;
import com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.z;

public final class ProductSyncViewModel extends AndroidViewModel {

    /* renamed from: g  reason: collision with root package name */
    public static final a f87812g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final am f87813b;

    /* renamed from: c  reason: collision with root package name */
    public int f87814c;

    /* renamed from: d  reason: collision with root package name */
    final h f87815d = i.a((h.f.a.a) c.f87821a);

    /* renamed from: e  reason: collision with root package name */
    public b f87816e;

    /* renamed from: f  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a>> f87817f = new t<>();

    /* renamed from: h  reason: collision with root package name */
    private final z f87818h;

    static {
        Covode.recordClassIndex(55223);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55224);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f87821a = new c();

        static {
            Covode.recordClassIndex(55226);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a invoke() {
            return new com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f87818h.a((CancellationException) null);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f87819a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final String f87820b;

        static {
            Covode.recordClassIndex(55225);
        }

        public b(String str) {
            l.d(str, "");
            this.f87820b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSyncViewModel(Application application) {
        super(application);
        l.d(application, "");
        z a2 = cu.a();
        this.f87818h = a2;
        this.f87813b = an.a(o.f159148a.plus(a2));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ List $ids;
        final /* synthetic */ String $roomId;
        int label;
        final /* synthetic */ ProductSyncViewModel this$0;

        static {
            Covode.recordClassIndex(55227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ProductSyncViewModel productSyncViewModel, String str, List list, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = productSyncViewModel;
            this.$roomId = str;
            this.$ids = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$roomId, this.$ids, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            BaseResponse<g> baseResponse;
            List<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a> list;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                String str = this.$roomId;
                List list2 = this.$ids;
                this.label = 1;
                obj = kotlinx.coroutines.i.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88026a, new a.C2121a((com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a) this.this$0.f87815d.getValue(), list2, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.ecommercelive.business.audience.api.b bVar = (com.ss.android.ugc.aweme.ecommercelive.business.audience.api.b) obj;
            if (bVar.f87781b == null && (baseResponse = bVar.f87780a) != null && baseResponse.isSuccess()) {
                this.this$0.f87814c = 2;
                g data = bVar.f87780a.getData();
                if (!(data == null || (list = data.f87777a) == null || !(!list.isEmpty()))) {
                    this.this$0.f87817f.setValue(list);
                }
            } else {
                this.this$0.f87814c = 3;
            }
            if (this.this$0.f87816e != null) {
                this.this$0.f87816e = null;
                this.this$0.a(this.$roomId, this.$ids);
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str, List<String> list) {
        l.d(str, "");
        l.d(list, "");
        String str2 = null;
        if (this.f87814c == 1) {
            b bVar = this.f87816e;
            if (bVar != null) {
                str2 = bVar.f87820b;
            }
            if (!l.a((Object) str2, (Object) str)) {
                bVar = new b(str);
            }
            l.d(list, "");
            if (bVar.f87819a.isEmpty()) {
                bVar.f87819a.addAll(list);
            } else {
                for (String str3 : list) {
                    if (!bVar.f87819a.contains(str3)) {
                        bVar.f87819a.add(str3);
                    }
                }
            }
            this.f87816e = bVar;
            return;
        }
        this.f87816e = null;
        this.f87814c = 1;
        bz unused = kotlinx.coroutines.i.a(this.f87813b, null, null, new d(this, str, list, null), 3);
    }
}
