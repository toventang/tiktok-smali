package com.ss.android.ugc.aweme.ecommerce.delivery.vm;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.api.DeliveryApi;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class DeliveryPanelViewModel extends JediViewModel<DeliveryPanelState> {

    /* renamed from: a  reason: collision with root package name */
    public Parcelable f85934a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<z> f85935b = h.f85943a;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<Boolean> f85936c = g.f85942a;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a f85937d;

    static {
        Covode.recordClassIndex(53801);
    }

    static final class h extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f85943a = new h();

        static {
            Covode.recordClassIndex(53811);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f85942a = new g();

        static {
            Covode.recordClassIndex(53810);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ DeliveryPanelState d() {
        return new DeliveryPanelState(null, false, null, null, null, 0, null, null, 255, null);
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeliveryPanelViewModel f85941a;

        static {
            Covode.recordClassIndex(53807);
        }

        d(DeliveryPanelViewModel deliveryPanelViewModel) {
            this.f85941a = deliveryPanelViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f85941a.a(3);
        }
    }

    public final void a(h.f.a.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f85936c = aVar;
    }

    public static final class a extends m implements h.f.a.b<DeliveryPanelState, z> {
        final /* synthetic */ DeliveryPanelViewModel this$0;

        static {
            Covode.recordClassIndex(53802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DeliveryPanelViewModel deliveryPanelViewModel) {
            super(1);
            this.this$0 = deliveryPanelViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$a$a  reason: collision with other inner class name */
        static final class C2063a extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2063a f85938a = new C2063a();

            static {
                Covode.recordClassIndex(53803);
            }

            C2063a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                l.d(deliveryPanelState2, "");
                return DeliveryPanelState.copy$default(deliveryPanelState2, null, true, null, null, null, 0, null, null, 253, null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            if (deliveryPanelState2.getSelectedLogistic() != null) {
                this.this$0.c(C2063a.f85938a);
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {
        final /* synthetic */ a $changePage;

        static {
            Covode.recordClassIndex(53804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.$changePage = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, new b(this.$changePage), false, null, null, null, 0, null, null, 254, null);
        }
    }

    public static final class i extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {
        final /* synthetic */ LogisticDTO $logistic;

        static {
            Covode.recordClassIndex(53812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(LogisticDTO logisticDTO) {
            super(1);
            this.$logistic = logisticDTO;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, null, false, this.$logistic, null, null, 0, null, null, 251, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(53814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, null, false, null, null, null, this.$status, null, null, 223, null);
        }
    }

    public final void a(int i2) {
        c(new k(i2));
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeliveryPanelViewModel f85939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeliveryPanelStarter.EnterParamForProductDetailPage f85940b;

        static {
            Covode.recordClassIndex(53805);
        }

        c(DeliveryPanelViewModel deliveryPanelViewModel, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage) {
            this.f85939a = deliveryPanelViewModel;
            this.f85940b = enterParamForProductDetailPage;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            final T t = aVar.data;
            if (!aVar.isCodeOK() || t == null) {
                this.f85939a.a(3);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(t.f85915a);
            this.f85939a.f85937d = t;
            this.f85939a.c(new h.f.a.b<DeliveryPanelState, DeliveryPanelState>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(53806);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
                    if (r3 == null) goto L_0x0049;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
                    if (r6 != null) goto L_0x004b;
                 */
                @Override // h.f.a.b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState invoke(com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState r19) {
                    /*
                    // Method dump skipped, instructions count: 238
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.c.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    static final class j extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {
        final /* synthetic */ Object $info;

        static {
            Covode.recordClassIndex(53813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(Object obj) {
            super(1);
            this.$info = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, new b(a.BACK_TO_LOGISTIC), false, null, new com.ss.android.ugc.aweme.ecommerce.delivery.b.a(this.$info), null, 0, null, null, 246, null);
        }
    }

    public final void a(Context context) {
        Parcelable parcelable = this.f85934a;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            b_(new e(this, context, parcelable));
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            c(new f(parcelable));
        } else {
            a(3);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<DeliveryPanelState, DeliveryPanelState> {
        final /* synthetic */ Parcelable $enterParam;

        static {
            Covode.recordClassIndex(53809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Parcelable parcelable) {
            super(1);
            this.$enterParam = parcelable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            if (r7 == null) goto L_0x0035;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState invoke(com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState r16) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<DeliveryPanelState, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Parcelable $enterParam;
        final /* synthetic */ DeliveryPanelViewModel this$0;

        static {
            Covode.recordClassIndex(53808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DeliveryPanelViewModel deliveryPanelViewModel, Context context, Parcelable parcelable) {
            super(1);
            this.this$0 = deliveryPanelViewModel;
            this.$context = context;
            this.$enterParam = parcelable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            Object obj;
            Object obj2;
            List<Region> list;
            Address address;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            l.d(deliveryPanelState2, "");
            DeliveryPanelViewModel deliveryPanelViewModel = this.this$0;
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) this.$enterParam;
            com.ss.android.ugc.aweme.ecommerce.delivery.b.a selectedShipToInfo = deliveryPanelState2.getSelectedShipToInfo();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = DeliveryPanelViewModel.a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                deliveryPanelViewModel.a(2);
            } else {
                deliveryPanelViewModel.a(0);
                String str = null;
                try {
                    obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(enterParamForProductDetailPage.f85805g, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                String str2 = enterParamForProductDetailPage.f85802d;
                String str3 = enterParamForProductDetailPage.f85803e;
                Integer valueOf = Integer.valueOf(enterParamForProductDetailPage.f85804f);
                Integer valueOf2 = Integer.valueOf(IPdpStarter.a.a(hashMap));
                if (hashMap != null) {
                    obj2 = hashMap.get("author_id");
                } else {
                    obj2 = null;
                }
                List a2 = n.a(new OrderSKUDTO(str2, str3, valueOf, null, valueOf2, null, null, null, (String) obj2, 232));
                if (selectedShipToInfo.f85830a != null) {
                    com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d a3 = selectedShipToInfo.a();
                    if (!(a3 == null || (address = a3.f85925b) == null)) {
                        str = address.f84298a;
                    }
                } else {
                    str = enterParamForProductDetailPage.f85800b;
                }
                if (selectedShipToInfo.f85830a != null) {
                    list = selectedShipToInfo.b();
                } else {
                    list = enterParamForProductDetailPage.f85801c;
                }
                l.d(a2, "");
                DeliveryApi deliveryApi = (DeliveryApi) DeliveryApi.a.f85887a.a(DeliveryApi.class);
                if (list == null) {
                    list = h.a.z.INSTANCE;
                }
                deliveryApi.getLogistics(new com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.b(a2, str, list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(deliveryPanelViewModel, enterParamForProductDetailPage), new d(deliveryPanelViewModel));
            }
            return z.f158842a;
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        c(new b(aVar));
    }

    public final void a(Context context, Object obj) {
        c(new j(obj));
        a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r5 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO a(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a r5, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO r6, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParamForProductDetailPage r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.a(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForProductDetailPage):com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO");
    }
}
