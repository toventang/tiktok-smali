package com.ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.u;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ab.o;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.p;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class SemiPdpViewModel extends JediViewModel<SemiPdpState> {

    /* renamed from: a  reason: collision with root package name */
    public ProductPackStruct f87246a;

    /* renamed from: b  reason: collision with root package name */
    public SemiPdpStarter.SemiPdpEnterParams f87247b;

    /* renamed from: c  reason: collision with root package name */
    Keva f87248c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f87249d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f87250e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f87251f;

    /* renamed from: g  reason: collision with root package name */
    public String f87252g = "return";

    /* renamed from: k  reason: collision with root package name */
    public boolean f87253k;

    /* renamed from: l  reason: collision with root package name */
    public int f87254l = 4;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet<Image> f87255m = new HashSet<>();
    public j n;

    static {
        Covode.recordClassIndex(54747);
    }

    private static boolean i() {
        if (!o.a()) {
            return true;
        }
        return false;
    }

    public final j a() {
        j jVar = this.n;
        if (jVar == null) {
            l.a("logger");
        }
        return jVar;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ SemiPdpState d() {
        return new SemiPdpState(false, null, false, 0, null, 0, null, 127, null);
    }

    public final void b() {
        HashMap<String, Object> requestParams;
        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87247b;
        if (semiPdpEnterParams != null && (requestParams = semiPdpEnterParams.getRequestParams()) != null) {
            b(0);
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams2 = this.f87247b;
            if (semiPdpEnterParams2 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(semiPdpEnterParams2, 0).f87323a.a(new b(requestParams, this), new c(requestParams, this));
        }
    }

    public final boolean g() {
        String str;
        ThirdParty thirdParty;
        try {
            Keva repo = Keva.getRepo("ecom_keva_store");
            this.f87248c = repo;
            if (repo != null) {
                StringBuilder sb = new StringBuilder("notice_sheet_");
                ProductPackStruct productPackStruct = this.f87246a;
                if (productPackStruct == null || (thirdParty = productPackStruct.p) == null) {
                    str = null;
                } else {
                    str = thirdParty.f86669a;
                }
                if (repo.getBoolean(sb.append(str).toString(), false)) {
                    return false;
                }
            }
        } catch (Throwable unused) {
            com.bytedance.services.apm.api.a.a("Keva Get Notice Sheet Shown Fail");
        }
        return true;
    }

    public final HashMap<String, Object> h() {
        int i2;
        String str;
        ProductBase productBase;
        ProductPrice productPrice;
        String str2;
        ProductBase productBase2;
        ProductPrice productPrice2;
        Integer num;
        HashMap<String, Object> hashMap = new HashMap<>();
        ProductPackStruct productPackStruct = this.f87246a;
        if (productPackStruct == null || (num = productPackStruct.f86639c) == null) {
            i2 = 1;
        } else {
            i2 = num.intValue();
        }
        hashMap.put("product_type", Integer.valueOf(i2));
        ProductPackStruct productPackStruct2 = this.f87246a;
        String str3 = "";
        if (productPackStruct2 == null || (productBase2 = productPackStruct2.f86641e) == null || (productPrice2 = productBase2.f86629g) == null || (str = productPrice2.f86650a) == null) {
            str = str3;
        }
        hashMap.put("original_price", str);
        ProductPackStruct productPackStruct3 = this.f87246a;
        if (!(productPackStruct3 == null || (productBase = productPackStruct3.f86641e) == null || (productPrice = productBase.f86629g) == null || (str2 = productPrice.f86651b) == null)) {
            str3 = str2;
        }
        hashMap.put("sale_price", str3);
        return hashMap;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f87252g = str;
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f87259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SemiPdpViewModel f87260b;

        static {
            Covode.recordClassIndex(54750);
        }

        c(HashMap hashMap, SemiPdpViewModel semiPdpViewModel) {
            this.f87259a = hashMap;
            this.f87260b = semiPdpViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f87260b.b(3);
            com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(this.f87259a);
        }
    }

    public final void b(int i2) {
        c(new f(i2));
    }

    static final class a extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87256a = new a();

        static {
            Covode.recordClassIndex(54748);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            l.d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, true, null, false, 0, null, 0, null, 126, null);
        }
    }

    static final class e extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {
        final /* synthetic */ boolean $full;

        static {
            Covode.recordClassIndex(54752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$full = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            l.d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, this.$full, 0, null, 0, null, 123, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {
        final /* synthetic */ int $state;

        static {
            Covode.recordClassIndex(54753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.$state = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            l.d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, 0, Integer.valueOf(this.$state), 0, null, 111, null);
        }
    }

    static final class h extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {
        final /* synthetic */ int $dy;

        static {
            Covode.recordClassIndex(54755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(int i2) {
            super(1);
            this.$dy = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            l.d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, this.$dy, null, 0, null, 119, null);
        }
    }

    public static void b(Context context) {
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null) {
            new com.bytedance.tux.g.b(eVar).e(R.string.bgb).a(3000L).b();
        }
    }

    public final void a(int i2) {
        c(new g(this, i2));
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {
        final /* synthetic */ int $resCode;
        final /* synthetic */ SemiPdpViewModel this$0;

        static {
            Covode.recordClassIndex(54754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SemiPdpViewModel semiPdpViewModel, int i2) {
            super(1);
            this.this$0 = semiPdpViewModel;
            this.$resCode = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            l.d(semiPdpState2, "");
            int i2 = this.$resCode;
            int i3 = 3;
            if (i2 != 0) {
                if (i2 == 23002002) {
                    i3 = 4;
                } else if (i2 == 23002102) {
                    i3 = 5;
                }
            } else if (this.this$0.f87246a != null) {
                i3 = -1;
            }
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, 0, Integer.valueOf(i3), 0, null, 111, null);
        }
    }

    public final void a(boolean z) {
        c(new e(z));
        this.f87249d = z;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f87257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SemiPdpViewModel f87258b;

        static {
            Covode.recordClassIndex(54749);
        }

        b(HashMap hashMap, SemiPdpViewModel semiPdpViewModel) {
            this.f87257a = hashMap;
            this.f87258b = semiPdpViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            SemiPdpViewModel semiPdpViewModel;
            int i2;
            T t;
            List<ProductPackStruct> list;
            T t2 = ((u) obj).f42630b;
            if (!t2.isCodeOK() || (t = t2.data) == null || (list = t.f86678a) == null || n.h((List) list) == null) {
                semiPdpViewModel = this.f87258b;
                if (t2.isCodeOK()) {
                    i2 = -99999;
                } else {
                    i2 = t2.code;
                }
            } else {
                this.f87258b.a((ProductPackStruct) n.g((List) t2.data.f86678a));
                semiPdpViewModel = this.f87258b;
                i2 = 0;
            }
            semiPdpViewModel.a(i2);
            com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(this.f87257a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<SemiPdpState, SemiPdpState> {
        final /* synthetic */ ProductPackStruct $pi;
        final /* synthetic */ SemiPdpViewModel this$0;

        static {
            Covode.recordClassIndex(54751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SemiPdpViewModel semiPdpViewModel, ProductPackStruct productPackStruct) {
            super(1);
            this.this$0 = semiPdpViewModel;
            this.$pi = productPackStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            String str;
            String str2;
            String str3;
            int i2;
            String str4;
            ProductPrice productPrice;
            ProductPrice productPrice2;
            SemiPdpState semiPdpState2 = semiPdpState;
            String str5 = "";
            l.d(semiPdpState2, str5);
            ProductPackStruct productPackStruct = this.$pi;
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.ss.android.ugc.aweme.ecommerce.pdp.d.c.a(productPackStruct));
            ThirdParty thirdParty = productPackStruct.p;
            if (thirdParty != null) {
                str = thirdParty.f86673e;
            } else {
                str = null;
            }
            l.d(productPackStruct, str5);
            ProductBase productBase = productPackStruct.f86641e;
            if (productBase == null || (productPrice2 = productBase.f86629g) == null || (str2 = productPrice2.f86651b) == null) {
                str2 = str5;
            }
            ProductBase productBase2 = productPackStruct.f86641e;
            if (productBase2 == null || (productPrice = productBase2.f86629g) == null || (str3 = productPrice.f86650a) == null) {
                str3 = str5;
            }
            ProductBase productBase3 = productPackStruct.f86641e;
            if (!(productBase3 == null || (str4 = productBase3.f86623a) == null)) {
                str5 = str4;
            }
            arrayList.add(new com.ss.android.ugc.aweme.ecommerce.semipdp.b.a(str2, str3, str5, str));
            if (productPackStruct.f86640d != null) {
                arrayList.add(p.a(productPackStruct));
            }
            arrayList.addAll(com.ss.android.ugc.aweme.ecommerce.pdp.d.e.a(productPackStruct, false));
            Integer num = this.$pi.f86639c;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            return SemiPdpState.copy$default(semiPdpState2, false, arrayList, false, 0, null, i2, this.$pi.r, 29, null);
        }
    }

    public final void a(Context context) {
        String str;
        ProductPackStruct productPackStruct;
        ThirdParty thirdParty;
        ThirdParty thirdParty2;
        String str2;
        ThirdParty thirdParty3;
        ThirdParty thirdParty4;
        if (context != null) {
            ProductPackStruct productPackStruct2 = this.f87246a;
            String str3 = null;
            if (productPackStruct2 == null || (thirdParty4 = productPackStruct2.p) == null) {
                str = null;
            } else {
                str = thirdParty4.f86669a;
            }
            ProductPackStruct productPackStruct3 = this.f87246a;
            if (!(productPackStruct3 == null || (thirdParty3 = productPackStruct3.p) == null)) {
                str3 = thirdParty3.f86670b;
            }
            if (str == null || (productPackStruct = this.f87246a) == null || (thirdParty = productPackStruct.p) == null || thirdParty.f86670b == null) {
                b(context);
                return;
            }
            this.f87252g = "next";
            if (i()) {
                j jVar = this.n;
                if (jVar == null) {
                    l.a("logger");
                } else {
                    jVar.a("h5", h());
                }
                SmartRouter.buildRoute(context, str3).open();
                return;
            }
            ProductPackStruct productPackStruct4 = this.f87246a;
            if (productPackStruct4 != null && (thirdParty2 = productPackStruct4.p) != null && (str2 = thirdParty2.f86671c) != null) {
                if (com.ss.android.ugc.aweme.ecommerce.util.m.a(context, str, str2)) {
                    j jVar2 = this.n;
                    if (jVar2 == null) {
                        l.a("logger");
                    } else {
                        jVar2.a("app", h());
                    }
                } else {
                    j jVar3 = this.n;
                    if (jVar3 == null) {
                        l.a("logger");
                    } else {
                        jVar3.a("h5", h());
                    }
                    SmartRouter.buildRoute(context, str3).open();
                }
            }
        }
    }

    public final void a(ProductPackStruct productPackStruct) {
        HashMap<String, Object> trackParams;
        String str;
        l.d(productPackStruct, "");
        this.f87246a = productPackStruct;
        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87247b;
        if (!(semiPdpEnterParams == null || (trackParams = semiPdpEnterParams.getTrackParams()) == null)) {
            Boolean bool = productPackStruct.y;
            String str2 = "1";
            if (bool != null) {
                if (bool.booleanValue()) {
                    str = str2;
                } else {
                    str = "0";
                }
                trackParams.put("is_have_address", str);
            }
            Boolean bool2 = productPackStruct.z;
            if (bool2 != null) {
                if (!bool2.booleanValue()) {
                    str2 = "0";
                }
                trackParams.put("is_have_payment_method", str2);
            }
        }
        j jVar = this.n;
        if (jVar == null) {
            l.a("logger");
        } else {
            jVar.a(productPackStruct);
        }
        c(new d(this, productPackStruct));
    }

    public final void a(Context context, String str) {
        HashMap<String, Object> trackParams;
        l.d(context, "");
        l.d(str, "");
        if (str.length() != 0) {
            h.p[] pVarArr = new h.p[2];
            pVarArr[0] = new h.p("enter_from", "semi_product_detail");
            HashMap hashMap = new HashMap();
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87247b;
            if (!(semiPdpEnterParams == null || (trackParams = semiPdpEnterParams.getTrackParams()) == null)) {
                hashMap.putAll(trackParams);
            }
            hashMap.put("previous_page", "semi_product_detail");
            pVarArr[1] = new h.p("trackParams", dg.a().b(hashMap));
            String uri = j.a(str, ag.c(pVarArr)).build().toString();
            l.b(uri, "");
            this.f87252g = "next";
            SmartRouter.buildRoute(context, uri).open();
        }
    }
}
