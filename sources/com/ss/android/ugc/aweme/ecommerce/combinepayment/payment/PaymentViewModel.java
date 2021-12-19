package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.s;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.ag;
import h.a.z;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.am;

public final class PaymentViewModel extends JediViewModel<PaymentState> implements IEventCenter.b {

    /* renamed from: m  reason: collision with root package name */
    public static List<? extends Object> f85206m = z.INSTANCE;
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> f85207a = g.f85220a;

    /* renamed from: b  reason: collision with root package name */
    public Address f85208b;

    /* renamed from: c  reason: collision with root package name */
    public List<s> f85209c;

    /* renamed from: d  reason: collision with root package name */
    public t f85210d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f85211e = true;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Map<String, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>>> f85212f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public List<? extends Object> f85213g;

    /* renamed from: k  reason: collision with root package name */
    public final List<BindInfoItem> f85214k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public String f85215l;

    public static final class a {
        static {
            Covode.recordClassIndex(53323);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(List<? extends Object> list) {
            h.f.b.l.d(list, "");
            PaymentViewModel.f85206m = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$a$a  reason: collision with other inner class name */
        public static final class C2039a extends h.f.b.m implements h.f.a.b<Object, Boolean> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $curPaymentMethod$inlined;

            static {
                Covode.recordClassIndex(53324);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2039a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
                super(1);
                this.$curPaymentMethod$inlined = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
                if (r4 == false) goto L_0x0034;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if ((!h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) false)) == false) goto L_0x002e;
             */
            @Override // h.f.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r6, r0)
                    boolean r4 = r6 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b
                    r3 = 0
                    r2 = 1
                    if (r4 == 0) goto L_0x002e
                    r0 = r6
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e r0 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e) r0
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r1 = r0.f85251c
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r5.$curPaymentMethod$inlined
                    boolean r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(r1, r0)
                    if (r0 != 0) goto L_0x0034
                    r0 = r6
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e r0 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e) r0
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r0.f85251c
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a r0 = r0.t
                    if (r0 == 0) goto L_0x003a
                    java.lang.Boolean r1 = r0.f85272a
                L_0x0023:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    boolean r0 = h.f.b.l.a(r1, r0)
                    r0 = r0 ^ r2
                    if (r0 != 0) goto L_0x0034
                L_0x002e:
                    boolean r0 = r6 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e
                    if (r0 == 0) goto L_0x0035
                    if (r4 != 0) goto L_0x0035
                L_0x0034:
                    r3 = 1
                L_0x0035:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                L_0x003a:
                    r1 = 0
                    goto L_0x0023
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.a.C2039a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        public static void a(List<Object> list, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
            h.f.b.l.d(list, "");
            h.a.n.a((List) list, (h.f.a.b) new C2039a(oVar));
        }

        public static void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, List<Object> list) {
            ArrayList arrayList;
            boolean z;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c cVar;
            String str;
            h.f.b.l.d(hVar, "");
            h.f.b.l.d(oVar, "");
            h.f.b.l.d(list, "");
            int indexOf = list.indexOf(hVar) + 1;
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> a2 = oVar.a();
            if (a2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e a3 = e.a.a(it.next(), hVar.f85254a);
                    if (a3 != null) {
                        arrayList2.add(a3);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = z.INSTANCE;
            }
            List g2 = h.a.n.g(arrayList);
            String str2 = hVar.f85254a.f85346m;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                g2.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e("save_element", hVar.f85254a.f85346m, 15870), hVar.f85254a, (byte) 0));
            }
            String str3 = hVar.f85254a.s;
            if (!((str3 == null || str3.length() == 0) && ((cVar = hVar.f85254a.u) == null || (str = cVar.f85281a) == null || str.length() == 0))) {
                g2.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.b(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e("balance_element", hVar.f85254a.f85335b, 15870), hVar.f85254a, (byte) 0));
            }
            list.addAll(indexOf, g2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != -1413704395) {
            if (hashCode == 1150715295 && str.equals("ec_payment_method_activate_clicked")) {
                c(e.f85218a);
            }
        } else if (str.equals("ec_resend_pay_request")) {
            c(f.f85219a);
        }
    }

    static {
        Covode.recordClassIndex(53322);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ PaymentState d() {
        return new PaymentState(null, null, null, null, false, null, null, false, false, null, 1023, null);
    }

    public static final class c implements f.a.z<com.ss.android.ugc.aweme.ecommerce.api.model.a<BindInfoResponseData>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f85216a;

        static {
            Covode.recordClassIndex(53326);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        c(h.c.d dVar) {
            this.f85216a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.api.model.a<BindInfoResponseData> aVar) {
            h.f.b.l.d(aVar, "");
            this.f85216a.resumeWith(q.m223constructorimpl(aVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            this.f85216a.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f85220a = new g();

        static {
            Covode.recordClassIndex(53330);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar) {
            h.f.b.l.d(lVar, "");
            return h.z.f158842a;
        }
    }

    public final void a(boolean z) {
        c(new l(this, z));
    }

    public final void b(boolean z) {
        c(new k(z));
    }

    static final class d extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f85217a = new d();

        static {
            Covode.recordClassIndex(53327);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, true, null, 767, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f85218a = new e();

        static {
            Covode.recordClassIndex(53328);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, true, false, null, 895, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85219a = new f();

        static {
            Covode.recordClassIndex(53329);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, false, new Object(), 511, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(53335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, this.$visible, null, null, false, false, null, 1007, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f85222a = new n();

        static {
            Covode.recordClassIndex(53338);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, UUID.randomUUID().toString(), false, null, null, false, false, null, 1015, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f85223a = new o();

        static {
            Covode.recordClassIndex(53339);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, UUID.randomUUID().toString(), false, null, null, false, false, null, 1015, null);
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
        T t;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
        List<? extends Object> list = f85206m;
        if (list == null || list.isEmpty() || oVar == null) {
            return false;
        }
        Iterator<T> it = f85206m.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!(next instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h)) {
                t = null;
            } else {
                t = next;
            }
            T t2 = t;
            if (!(t2 == null || (oVar2 = t2.f85254a) == null)) {
                str = oVar2.f85334a;
            }
            if (h.f.b.l.a((Object) str, (Object) oVar.f85334a)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    static final class b extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $ccdcPaymentMethod;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $targetPaymentMethod;

        static {
            Covode.recordClassIndex(53325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2) {
            super(1);
            this.$ccdcPaymentMethod = oVar;
            this.$targetPaymentMethod = oVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            List list;
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            List g2 = h.a.n.g((Collection) paymentState2.getPaymentList());
            Object obj = null;
            a.a(g2, null);
            Iterator it = g2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) && com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) next).f85254a, this.$ccdcPaymentMethod)) {
                    obj = next;
                    break;
                }
            }
            int a2 = h.a.n.a(g2, obj);
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> a3 = this.$targetPaymentMethod.a();
            if (a3 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = a3.iterator();
                while (it2.hasNext()) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e a4 = e.a.a(it2.next(), this.$ccdcPaymentMethod);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                }
                list = h.a.n.g((Collection) arrayList);
            } else {
                list = new ArrayList();
            }
            if (hl.a(this.$targetPaymentMethod.f85346m)) {
                list.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.j(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e("save_element", this.$targetPaymentMethod.f85346m, 15870), this.$ccdcPaymentMethod, (byte) 0));
            }
            g2.addAll(a2 + 1, list);
            return PaymentState.copy$default(paymentState2, null, g2, null, null, false, null, null, false, false, null, 1021, null);
        }
    }

    static final class h extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ List $paymentMethodIdList;
        int label;
        final /* synthetic */ PaymentViewModel this$0;

        static {
            Covode.recordClassIndex(53331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PaymentViewModel paymentViewModel, List list, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = paymentViewModel;
            this.$paymentMethodIdList = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new h(this.this$0, this.$paymentMethodIdList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                BindInfoRequest bindInfoRequest = new BindInfoRequest(this.$paymentMethodIdList);
                this.label = 1;
                h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                h.f.b.l.d(bindInfoRequest, "");
                ((PaymentApi) PaymentApi.a.f85242a.a(PaymentApi.class)).getBindInfo(bindInfoRequest).b(f.a.h.a.b(f.a.k.a.f158006c)).b(new c(hVar));
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    h.f.b.l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar2 = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            T t = aVar2.data;
            if (!aVar2.isCodeOK() || t == null) {
                this.this$0.c(AnonymousClass1.f85221a);
                return h.z.f158842a;
            }
            PaymentViewModel paymentViewModel = this.this$0;
            paymentViewModel.f85214k.clear();
            List<BindInfoItem> bindInfoList = t.getBindInfoList();
            if (bindInfoList != null) {
                Iterator<T> it = bindInfoList.iterator();
                while (it.hasNext()) {
                    paymentViewModel.f85214k.add(it.next());
                }
            }
            paymentViewModel.c(new m(paymentViewModel));
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ aa $seeMoreVO;

        static {
            Covode.recordClassIndex(53333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(aa aaVar) {
            super(1);
            this.$seeMoreVO = aaVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            int indexOf = paymentState2.getPaymentList().indexOf(this.$seeMoreVO);
            List g2 = h.a.n.g((Collection) paymentState2.getPaymentList());
            g2.remove(indexOf);
            int i2 = indexOf - 1;
            Object obj = g2.get(i2);
            if (obj instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) {
                g2.set(i2, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h.a((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) obj));
            }
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list = this.$seeMoreVO.f85240b;
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h(it.next()));
            }
            g2.addAll(indexOf, arrayList);
            int i3 = 0;
            for (Object obj2 : g2) {
                if (obj2 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) {
                    ((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) obj2).f85256c = i3;
                    i3++;
                }
            }
            return PaymentState.copy$default(paymentState2, null, g2, null, null, false, null, null, false, false, null, 1021, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ PaymentViewModel this$0;

        static {
            Covode.recordClassIndex(53337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PaymentViewModel paymentViewModel) {
            super(1);
            this.this$0 = paymentViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            String str;
            T t;
            String paymentMethodBindUrl;
            PaymentState paymentState2 = paymentState;
            h.f.b.l.d(paymentState2, "");
            if (paymentState2.getShowLoading() && (!this.this$0.f85214k.isEmpty()) && (str = this.this$0.f85215l) != null && str.length() != 0) {
                Iterator<T> it = this.this$0.f85214k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.getPaymentMethodId(), (Object) this.this$0.f85215l)) {
                        break;
                    }
                }
                T t2 = t;
                if (!(t2 == null || (paymentMethodBindUrl = t2.getPaymentMethodBindUrl()) == null || paymentMethodBindUrl.length() <= 0)) {
                    EventCenter.a().a("ec_payment_method_activate_clicked", "{}");
                    SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), paymentMethodBindUrl).open();
                }
            }
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, false, null, 767, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $paymentMethod;
        final /* synthetic */ PaymentViewModel this$0;

        static {
            Covode.recordClassIndex(53334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PaymentViewModel paymentViewModel, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
            super(1);
            this.this$0 = paymentViewModel;
            this.$paymentMethod = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
            if (r6 == null) goto L_0x012f;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState r22) {
            /*
            // Method dump skipped, instructions count: 336
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<PaymentState, PaymentState> {
        final /* synthetic */ boolean $needVerify;
        final /* synthetic */ PaymentViewModel this$0;

        static {
            Covode.recordClassIndex(53336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PaymentViewModel paymentViewModel, boolean z) {
            super(1);
            this.this$0 = paymentViewModel;
            this.$needVerify = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
            if (r11 == null) goto L_0x00ad;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState r42) {
            /*
            // Method dump skipped, instructions count: 947
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static int a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, List<? extends Object> list) {
        T t;
        T t2;
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if ((t2 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) && com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(t2.f85254a, oVar)) {
                break;
            }
        }
        if (t2 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f85256c;
        }
        return 0;
    }

    public final List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> b(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, String str) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(str, "");
        Map<String, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>> map = this.f85212f.get(h.f.b.l.a(oVar.f85334a, (Object) oVar.p));
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list = map.get(str);
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }

    public static List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> a(List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list, Address address) {
        Collection a2;
        int i2;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m mVar;
        String str;
        String str2;
        List<Region> list2 = address.f84301d;
        int i3 = 0;
        if (list2 == null || list2.isEmpty() || address.f84300c == null) {
            return z.INSTANCE;
        }
        List g2 = h.a.n.g((Collection) address.f84301d);
        g2.add(0, address.f84300c);
        if (list == null) {
            return z.INSTANCE;
        }
        int i4 = 10;
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t : list) {
            String str3 = t.f85288a;
            if (str3 == null) {
                a2 = z.INSTANCE;
            } else {
                int hashCode = str3.hashCode();
                if (hashCode != -304863367) {
                    if (hashCode != 1981981399) {
                        if (hashCode == 2002908406 && str3.equals("eg_ccdc_global_billing_address_street_mobile")) {
                            a2 = h.a.n.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(t.f85288a, t.f85293f, address.a("address"), t.f85298k, null, 16, null));
                        }
                    } else if (str3.equals("eg_ccdc_global_billing_address")) {
                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list3 = t.f85296i;
                        if (list3 != null) {
                            i2 = list3.size();
                        } else {
                            i2 = 0;
                        }
                        List subList = g2.subList(i3, i2);
                        a2 = new ArrayList(h.a.n.a((Iterable) subList, i4));
                        int i5 = 0;
                        for (Object obj : subList) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                h.a.n.a();
                            }
                            Region region = (Region) obj;
                            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list4 = t.f85296i;
                            Boolean bool = null;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar = list4 != null ? list4.get(i5) : null;
                            if (i5 == 0) {
                                if (h.f.b.l.a((Object) (eVar != null ? eVar.f85288a : null), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                                    mVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(eVar.f85288a, eVar.f85293f, h.f.b.l.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.d.a(region.f84321b), (Object) ("," + region.f84320a + ',' + region.f84321b)), eVar.f85298k, null, 16, null);
                                    a2.add(mVar);
                                    i5 = i6;
                                }
                            }
                            if (eVar != null) {
                                str = eVar.f85288a;
                                str2 = eVar.f85293f;
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String str4 = region.f84320a;
                            if (eVar != null) {
                                bool = eVar.f85298k;
                            }
                            mVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(str, str2, str4, bool, null, 16, null);
                            a2.add(mVar);
                            i5 = i6;
                        }
                    }
                } else if (str3.equals("eg_ccdc_global_billing_address_postal_code")) {
                    a2 = h.a.n.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(t.f85288a, t.f85293f, address.a("zipcode"), t.f85298k, null, 16, null));
                }
                a2 = h.a.n.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m(t.f85288a, t.f85293f, address.a(t.f85288a), t.f85298k, null, 16, null));
            }
            arrayList.add(a2);
            i3 = 0;
            i4 = 10;
        }
        return h.a.n.b((Iterable) arrayList);
    }

    public final String a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, String str) {
        List<s> list;
        Price price;
        String priceStr;
        h.f.b.l.d(str, "");
        T t = null;
        if (oVar == null || oVar.f85334a == null || (list = this.f85209c) == null) {
            return str;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (h.f.b.l.a((Object) next.f85360a, (Object) oVar.f85334a)) {
                t = next;
                break;
            }
        }
        T t2 = t;
        return (t2 == null || (price = t2.f85361b) == null || (priceStr = price.getPriceStr()) == null) ? str : priceStr;
    }

    public final String a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e eVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(list, "");
        String a2 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.a(eVar.f85250b, oVar, list);
        if (!h.f.b.l.a((Object) a2, (Object) "system_error")) {
            return a2;
        }
        c(o.f85223a);
        return "";
    }

    public final Map<String, String> a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a aVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
        Map<String, String> d2 = ag.d(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c.b(aVar.f85250b, oVar, list));
        boolean z = false;
        for (Map.Entry<String, String> entry : d2.entrySet()) {
            if (h.f.b.l.a((Object) entry.getValue(), (Object) "system_error")) {
                d2.put(entry.getKey(), "");
                z = true;
            }
        }
        if (z) {
            c(n.f85222a);
        }
        return d2;
    }

    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, String str, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(list, "");
        Map<String, List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>> map = this.f85212f.get(h.f.b.l.a(oVar.f85334a, (Object) oVar.p));
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        this.f85212f.put(h.f.b.l.a(oVar.f85334a, (Object) oVar.p), map);
        map.put(str, list);
    }
}
