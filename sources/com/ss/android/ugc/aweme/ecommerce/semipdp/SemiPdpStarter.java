package com.ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class SemiPdpStarter {

    /* renamed from: a  reason: collision with root package name */
    public static final SemiPdpStarter f87242a = new SemiPdpStarter();

    public static final class SemiPdpEnterParams implements Serializable {
        private final boolean fullScreen;
        private final HashMap<String, Object> requestParams;
        private final HashMap<String, Object> trackParams;

        static {
            Covode.recordClassIndex(54741);
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public final HashMap<String, Object> getRequestParams() {
            return this.requestParams;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public SemiPdpEnterParams(HashMap<String, Object> hashMap, boolean z, HashMap<String, Object> hashMap2) {
            l.d(hashMap, "");
            this.requestParams = hashMap;
            this.fullScreen = z;
            this.trackParams = hashMap2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SemiPdpEnterParams(HashMap hashMap, boolean z, HashMap hashMap2, int i2, g gVar) {
            this(hashMap, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : hashMap2);
        }
    }

    private SemiPdpStarter() {
    }

    public static final class a extends m implements h.f.a.m<ProductPackStruct, Integer, z> {
        final /* synthetic */ e $context;
        final /* synthetic */ SemiPdpEnterParams $enterParams;

        static {
            Covode.recordClassIndex(54742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, SemiPdpEnterParams semiPdpEnterParams) {
            super(2);
            this.$context = eVar;
            this.$enterParams = semiPdpEnterParams;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        private static boolean b() {
            if (j.f107226e && j.b() && !j.c()) {
                return j.f107226e;
            }
            boolean a2 = a();
            j.f107226e = a2;
            return a2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ProductPackStruct productPackStruct, Integer num) {
            a(productPackStruct, num);
            return z.f158842a;
        }

        public final void a(ProductPackStruct productPackStruct, Integer num) {
            if (!b()) {
                new com.bytedance.tux.g.b(this.$context).a(this.$context.getString(R.string.h2y)).b();
            } else if (!this.$enterParams.getFullScreen()) {
                SemiPdpStarter.a(this.$context, this.$enterParams, productPackStruct, num);
            } else {
                SemiPdpStarter.b(this.$context, this.$enterParams, productPackStruct, num);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f87243a;

                static {
                    Covode.recordClassIndex(54743);
                }

                {
                    this.f87243a = r1;
                }

                public final void run() {
                    com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(this.f87243a.$enterParams.getRequestParams());
                }
            }, 450);
        }
    }

    static {
        Covode.recordClassIndex(54740);
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87245a;

        static {
            Covode.recordClassIndex(54745);
        }

        public c(a aVar) {
            this.f87245a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f87245a.a(null, null);
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87244a;

        static {
            Covode.recordClassIndex(54744);
        }

        public b(a aVar) {
            this.f87244a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct;
            T t;
            List<ProductPackStruct> list;
            T t2 = ((u) obj).f42630b;
            if (t2 == null || (t = t2.data) == null || (list = t.f86678a) == null) {
                productPackStruct = null;
            } else {
                productPackStruct = (ProductPackStruct) n.h((List) list);
            }
            this.f87244a.a(productPackStruct, Integer.valueOf(t2.code));
        }
    }

    public static void b(Context context, SemiPdpEnterParams semiPdpEnterParams, ProductPackStruct productPackStruct, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ENTER_PARAMS", semiPdpEnterParams);
        if (productPackStruct != null) {
            linkedHashMap.put("product_info", productPackStruct);
        }
        if (num != null) {
            linkedHashMap.put("ERROR_CODE", Integer.valueOf(num.intValue()));
        }
        com.ss.android.ugc.aweme.ecommerce.router.j.a(context, "aweme://ec/semi_pdp_activity", linkedHashMap, false).open();
    }

    public static void a(Context context, SemiPdpEnterParams semiPdpEnterParams, ProductPackStruct productPackStruct, Integer num) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ENTER_PARAMS", semiPdpEnterParams);
        if (productPackStruct != null) {
            bundle.putParcelable("product_info", productPackStruct);
        }
        if (num != null) {
            bundle.putInt("ERROR_CODE", num.intValue());
        }
        aVar.setArguments(bundle);
        com.bytedance.tux.sheet.sheet.a aVar2 = new a.C1112a().a(3).a(aVar).b(false).c().f45299a;
        if (!(context instanceof e)) {
            context = null;
        }
        e eVar = (e) context;
        if (eVar != null) {
            aVar2.show(eVar.getSupportFragmentManager(), "SemiPdpFragment");
        }
    }
}
