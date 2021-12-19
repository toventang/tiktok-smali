package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopOrder;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.v;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import org.json.JSONObject;

public final class OrderSubmitViewModel extends JediViewModel<OrderSubmitState> implements IEventCenter.b {
    public static final a P = new a((byte) 0);
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public HashMap<String, Object> F;
    public HashMap<String, Object> G = new HashMap<>();
    boolean H;
    public String I = "default_repo_id";
    public com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a J;
    public List<String> K = h.a.z.INSTANCE;
    public List<String> L;
    public List<String> M;
    public String N;
    public int O;
    private Boolean Q;
    private boolean R;
    private Voucher S;

    /* renamed from: a  reason: collision with root package name */
    public int f84728a;

    /* renamed from: b  reason: collision with root package name */
    public String f84729b;

    /* renamed from: c  reason: collision with root package name */
    public List<OrderShopDigest> f84730c;

    /* renamed from: d  reason: collision with root package name */
    public List<Region> f84731d;

    /* renamed from: e  reason: collision with root package name */
    public String f84732e;

    /* renamed from: f  reason: collision with root package name */
    public OrderSubmitRequestParam f84733f;

    /* renamed from: g  reason: collision with root package name */
    public ShippingAddress f84734g;

    /* renamed from: k  reason: collision with root package name */
    public BillInfoData f84735k;

    /* renamed from: l  reason: collision with root package name */
    public ExceptionUX f84736l;

    /* renamed from: m  reason: collision with root package name */
    public String f84737m = "";
    public com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n n;
    public com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o o;
    public boolean p;
    public boolean q;
    public String r = "";
    public boolean s;
    public String t;
    public boolean u;
    public String v = "";
    public long w;
    public Keva x;
    public boolean y;
    public boolean z;

    static {
        Covode.recordClassIndex(52916);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52917);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class j extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(52946);
        }

        j() {
        }
    }

    public static final class r extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(52960);
        }

        r() {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        String buyerAddressId;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        switch (str.hashCode()) {
            case -2019832472:
                if (str.equals("ec_address_select")) {
                    c(AddressPageStarter.a.C2012a.a(str2).f84259a);
                    return;
                }
                return;
            case 1150715295:
                if (str.equals("ec_payment_method_activate_clicked")) {
                    this.H = true;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = this.n;
                    if (nVar != null) {
                        nVar.f85329b = null;
                        return;
                    }
                    return;
                }
                return;
            case 1242205757:
                if (str.equals("ec_osp_resend_order_create")) {
                    c(s.f84750a);
                    return;
                }
                return;
            case 1819520028:
                if (str.equals("ec_address_change")) {
                    AddressPageStarter.a a2 = AddressPageStarter.a.C2012a.a(str2);
                    if (a2.f84260b == 0) {
                        BillInfoData billInfoData = this.f84735k;
                        if (billInfoData == null || (buyerAddressId = billInfoData.getBuyerAddressId()) == null || buyerAddressId.length() == 0) {
                            c(AddressPageStarter.a.C2012a.a(str2).f84259a);
                            return;
                        }
                        return;
                    } else if (!h.f.b.l.a((Object) AddressPageStarter.a.C2012a.a(str2).f84259a, (Object) this.f84729b)) {
                        return;
                    } else {
                        if (a2.f84260b == 2) {
                            c((String) null);
                            return;
                        } else {
                            c(this.f84729b);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final void a(c cVar) {
        if (h.f.b.l.a((Object) (cVar != null ? cVar.f84856a : null), (Object) "order_submit_fragment")) {
            this.p = false;
        }
        c(new ad(cVar));
    }

    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
        h.f.b.l.d(nVar, "");
        this.n = nVar;
        c(new ag(nVar));
    }

    public final void a(Voucher voucher) {
        VoucherInfo voucherInfo;
        List<Voucher> vouchers;
        T t2;
        String str = null;
        String voucherID = voucher != null ? voucher.getVoucherID() : null;
        BillInfoData billInfoData = this.f84735k;
        if (!(billInfoData == null || (voucherInfo = billInfoData.getVoucherInfo()) == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            Iterator<T> it = vouchers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (h.f.b.l.a((Object) t2.getSelected(), (Object) true)) {
                    break;
                }
            }
            T t3 = t2;
            if (t3 != null) {
                str = t3.getVoucherID();
            }
        }
        if (!h.f.b.l.a((Object) voucherID, (Object) str)) {
            this.S = voucher;
            this.R = true;
            a(this, false, false, false, false, null, 63);
        }
    }

    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t tVar) {
        h.f.b.l.d(tVar, "");
        bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new aj(this, tVar, null), 2);
    }

    public final void a(BillInfoData billInfoData, BillInfoRequest billInfoRequest) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o a2;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list2;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods2;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list3;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3;
        BillInfoData billInfoData2 = billInfoData;
        String str = null;
        if (h.f.b.l.a((Object) this.Q, (Object) true)) {
            this.Q = null;
        } else if (billInfoData2 == null) {
            com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a());
            Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
            if (resources != null) {
                str = resources.getString(R.string.fy7);
            }
            aVar.a(str).a();
            m();
        } else {
            ExceptionUX exceptionUX = billInfoData2.getExceptionUX();
            this.f84736l = exceptionUX;
            if (exceptionUX != null) {
                this.v = "query_bill_info";
                b(1);
                ExceptionUX exceptionUX2 = this.f84736l;
                if (!h.f.b.l.a((Object) (exceptionUX2 != null ? exceptionUX2.getRenderPage() : null), (Object) true)) {
                    m();
                    return;
                }
            }
            BillInfoData billInfoData3 = this.f84735k;
            if (billInfoData3 != null) {
                billInfoData2 = billInfoData3.merge(billInfoData2, billInfoRequest);
            }
            this.f84735k = billInfoData2;
            this.f84734g = billInfoData2 != null ? billInfoData2.getShippingAddress() : null;
            BillInfoData billInfoData4 = this.f84735k;
            if (billInfoData4 != null) {
                a(-1);
                boolean hasAddress = billInfoData4.hasAddress();
                this.E = billInfoData4.reachableAny();
                if (billInfoRequest.getWithShippingAddress()) {
                    this.f84729b = billInfoData4.getBuyerAddressId();
                }
                this.u = billInfoData4.hasPromotion();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = this.n;
                if ((nVar != null ? nVar.f85329b : null) != null) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = this.n;
                    oVar = nVar2 != null ? nVar2.f85329b : null;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods3 = billInfoData4.getPaymentMethods();
                    if (!(paymentMethods3 == null || (list2 = paymentMethods3.f85351c) == null || list2.isEmpty() || (paymentMethods2 = billInfoData4.getPaymentMethods()) == null || (list3 = paymentMethods2.f85351c) == null)) {
                        for (T t2 : list3) {
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar3 = this.n;
                            if (h.f.b.l.a((Object) ((nVar3 == null || (oVar3 = nVar3.f85329b) == null) ? null : oVar3.f85334a), (Object) t2.f85334a)) {
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar4 = this.n;
                                if (h.f.b.l.a((Object) ((nVar4 == null || (oVar2 = nVar4.f85329b) == null) ? null : oVar2.p), (Object) t2.p)) {
                                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p pVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p(t2.f85334a, t2.p, t2.b(), null);
                                    List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list4 = t2.r;
                                    a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n(pVar, t2, null, Boolean.valueOf(list4 == null || list4.isEmpty()), null, null, 48));
                                    oVar = t2;
                                }
                            }
                        }
                    }
                } else {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods4 = billInfoData4.getPaymentMethods();
                    if (paymentMethods4 == null || (list = paymentMethods4.f85351c) == null || list.isEmpty() || (paymentMethods = billInfoData4.getPaymentMethods()) == null || (a2 = paymentMethods.a()) == null) {
                        oVar = null;
                    } else {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p pVar2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p(a2.f85334a, a2.p, a2.b(), null);
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o a3 = billInfoData4.getPaymentMethods().a();
                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list5 = a2.r;
                        a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n(pVar2, a3, null, Boolean.valueOf(list5 == null || list5.isEmpty()), null, null, 48));
                        oVar = billInfoData4.getPaymentMethods().a();
                    }
                }
                VoucherInfo voucherInfo = billInfoData4.getVoucherInfo();
                Voucher a4 = voucherInfo != null ? com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.a.a(voucherInfo) : null;
                Voucher voucher = this.S;
                String voucherID = a4 != null ? a4.getVoucherID() : null;
                String voucherID2 = voucher != null ? voucher.getVoucherID() : null;
                if (!h.f.b.l.a((Object) voucherID, (Object) voucherID2)) {
                    VoucherInfo voucherInfo2 = billInfoData4.getVoucherInfo();
                    this.S = voucherInfo2 != null ? com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.a.a(voucherInfo2) : null;
                    this.R = false;
                }
                this.L = null;
                this.f84730c = billInfoData4.getShopOrderDigestList(IPdpStarter.a.a(this.F), a(this.F), this.f84728a);
                c(new ak(hasAddress, billInfoData4, oVar, this, billInfoRequest));
                if (!this.p) {
                    this.p = true;
                    this.w = System.currentTimeMillis();
                    this.z = hasAddress;
                    this.A = oVar != null;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.c();
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(true, j(), null, null, null, g(), Integer.valueOf(this.O), 28);
                    List<Region> list6 = this.f84731d;
                    if (!(list6 == null || list6.isEmpty())) {
                        b(3);
                    }
                }
            }
        }
    }

    public final void a(boolean z2) {
        c(new ac(z2));
        this.q = z2;
    }

    public final void a(Context context, boolean z2) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list2;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.b> list3;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.q qVar;
        Integer num;
        String str;
        String str2;
        String str3;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.t tVar;
        h.f.b.l.d(context, "");
        BillInfoData billInfoData = this.f84735k;
        Address address = null;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods = billInfoData != null ? billInfoData.getPaymentMethods() : null;
        if (z2) {
            if (paymentMethods != null) {
                list = paymentMethods.f85349a;
                list2 = paymentMethods.f85351c;
                list3 = paymentMethods.f85352d;
                qVar = paymentMethods.f85353e;
                num = paymentMethods.f85354f;
                str = paymentMethods.f85355g;
                str2 = paymentMethods.f85356h;
                str3 = paymentMethods.f85357i;
                tVar = paymentMethods.f85358j;
            } else {
                list = null;
                list2 = null;
                list3 = null;
                qVar = null;
                num = null;
                str = null;
                str2 = null;
                str3 = null;
                tVar = null;
            }
            rVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r(list, list2, list3, qVar, num, str, str2, str3, tVar);
        } else {
            rVar = paymentMethods;
        }
        Integer valueOf = Integer.valueOf(c.a.CONTINUE.ordinal());
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = this.n;
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = this.F;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.putAll(j());
        ShippingAddress shippingAddress = this.f84734g;
        if (shippingAddress != null) {
            address = shippingAddress.getShippingAddress();
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c cVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c(null, null, valueOf, rVar, null, true, nVar, hashMap, null, address, 256);
        this.r = "next";
        k();
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r rVar2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r();
        rVar2.a(cVar);
        rVar2.a(new u(rVar2, cVar, this, context));
        androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) context).getSupportFragmentManager();
        h.f.b.l.b(supportFragmentManager, "");
        rVar2.show(supportFragmentManager, "payment_fragment");
    }

    private final void m() {
        c(y.f84754a);
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b $createOrderData;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d $result;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(OrderSubmitViewModel orderSubmitViewModel, Context context, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d dVar) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$context = context;
            this.$createOrderData = bVar;
            this.$result = dVar;
        }

        public static final class a implements com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f84747a;

            static {
                Covode.recordClassIndex(52957);
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.u
            public final void b() {
                this.f84747a.this$0.c(C2028a.f84748a);
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.u
            public final void a() {
                this.f84747a.this$0.a("next");
                this.f84747a.this$0.c(b.f84749a);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(q qVar) {
                this.f84747a = qVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$q$a$a  reason: collision with other inner class name */
            static final class C2028a extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

                /* renamed from: a  reason: collision with root package name */
                public static final C2028a f84748a = new C2028a();

                static {
                    Covode.recordClassIndex(52958);
                }

                C2028a() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    h.f.b.l.d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 4, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16776191, null);
                }
            }

            static final class b extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f84749a = new b();

                static {
                    Covode.recordClassIndex(52959);
                }

                b() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    h.f.b.l.d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 4, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16759807, null);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            com.google.gson.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar;
            List<String> list;
            String str;
            Boolean bool;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            if (this.$context == null) {
                com.bytedance.services.apm.api.a.a("create order context null");
            }
            if (this.$context != null) {
                final v.a aVar = new v.a(this.$context);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar = this.$createOrderData;
                String str2 = null;
                if (bVar != null) {
                    oVar = bVar.f84933c;
                } else {
                    oVar = null;
                }
                aVar.f85454g = oVar;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar2 = this.$createOrderData;
                if (bVar2 != null) {
                    fVar = bVar2.f84935e;
                } else {
                    fVar = null;
                }
                aVar.f85452e = fVar;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar3 = this.$createOrderData;
                if (bVar3 != null) {
                    list = bVar3.f84931a;
                } else {
                    list = null;
                }
                aVar.f85449b = list;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar4 = this.$createOrderData;
                if (bVar4 != null) {
                    str = bVar4.f84936f;
                } else {
                    str = null;
                }
                aVar.f85450c = str;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.b bVar5 = this.$createOrderData;
                if (bVar5 != null) {
                    bool = bVar5.f84937g;
                } else {
                    bool = null;
                }
                aVar.f85451d = bool;
                aVar.f85457j = "ordersubmit";
                aVar.f85453f = new a(this);
                aVar.f85455h = orderSubmitState2.getUserPaymentInfo();
                T t = this.$result.data;
                if (t != null) {
                    str2 = t.f84932b;
                }
                Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
                buildUpon.appendQueryParameter("source", "ordersubmit");
                buildUpon.appendQueryParameter("trackParams", dg.a().b(this.this$0.G));
                aVar.a(this.this$0.G);
                aVar.f85458k = buildUpon.toString();
                com.ss.android.ugc.aweme.base.m.f68150a.execute(new Runnable() {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.q.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(52956);
                    }

                    public final void run() {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w.a(aVar.a());
                    }
                });
            }
            EventCenter.a().a("ec_order_list_state_changed", "{}");
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ah extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.this$0 = orderSubmitViewModel;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                if (orderSubmitState2.getLoadSuccess() || orderSubmitState2.getPageLoadStatus() == 2 || orderSubmitState2.getPageLoadStatus() == 3) {
                    this.this$0.c(AnonymousClass1.f84738a);
                } else {
                    this.this$0.a(2);
                }
            } else if (orderSubmitState2.getLoadSuccess()) {
                this.this$0.c(AnonymousClass2.f84739a);
            } else {
                this.this$0.a(3);
            }
            return h.z.f158842a;
        }
    }

    public final void a() {
        b_(new k(this));
    }

    public final void h() {
        b_(new ah(this));
    }

    public final void l() {
        IEventCenter a2 = EventCenter.a();
        a2.b("ec_address_change", this);
        a2.b("ec_address_select", this);
    }

    public final void b() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            Keva keva = this.x;
            if (keva != null) {
                keva.storeString("ecom_last_quit_reason_time_stamp", valueOf);
            }
        } catch (Throwable unused) {
            com.bytedance.services.apm.api.a.a("Keva Write Quit Reason Time Fail");
        }
    }

    public final void k() {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(this.p, this.r, Boolean.valueOf(this.B), Boolean.valueOf(this.C), j(), (Long) null, (String) null, (String) null, 480);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ OrderSubmitState d() {
        return new OrderSubmitState(0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777215, null);
    }

    public final String i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> hashMap = this.F;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.putAll(j());
        return dg.a().b(linkedHashMap);
    }

    public final String g() {
        if (this.f84728a == 0) {
            return "-1";
        }
        ArrayList arrayList = new ArrayList();
        List<OrderShopDigest> list = this.f84730c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                if (orderSKUs != null) {
                    Iterator<T> it2 = orderSKUs.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().f85909d;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        l();
        if (this.J != null) {
            String str = this.I;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a aVar = com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a.f84907e.get(str);
            if (aVar != null) {
                kotlinx.coroutines.w<BillInfoResponse> wVar = aVar.f84909b;
                if (wVar != null && wVar.b()) {
                    kotlinx.coroutines.w<BillInfoResponse> wVar2 = aVar.f84909b;
                    if (wVar2 != null) {
                        wVar2.a((CancellationException) null);
                    }
                    aVar.f84909b = null;
                }
                f.a.b.b bVar = aVar.f84910c;
                if (bVar != null) {
                    bVar.dispose();
                }
                aVar.f84910c = null;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a.f84907e.remove(str);
        }
        this.Q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x0220 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.Object> j() {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.j():java.util.HashMap");
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.r = str;
    }

    public final void b(int i2) {
        c(new z(i2));
    }

    public final void c(int i2) {
        c(new aa(i2));
    }

    public static final class t extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f84751a = new t();

        static {
            Covode.recordClassIndex(52962);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("edit_address", Boolean.valueOf(orderSubmitState2.getReachableAny()), 4);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.this$0 = orderSubmitViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            if (orderSubmitState2.getLoadSuccess()) {
                this.this$0.c(AnonymousClass1.f84752a);
            } else {
                this.this$0.a(0);
            }
            return h.z.f158842a;
        }
    }

    private final void c(String str) {
        this.D = true;
        this.f84729b = str;
        a(this, false, false, false, false, null, 53);
    }

    static final class k extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.this$0 = orderSubmitViewModel;
        }

        static final class a extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
            final /* synthetic */ String $it;

            static {
                Covode.recordClassIndex(52949);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.$it = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                OrderSubmitState orderSubmitState2 = orderSubmitState;
                h.f.b.l.d(orderSubmitState2, "");
                return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, new c(this.$it), false, 0, null, null, false, 16515071, null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            String str;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            c currentPage = orderSubmitState2.getCurrentPage();
            if (currentPage == null || (str = currentPage.f84856a) == null) {
                this.this$0.c(new h.f.a.b<OrderSubmitState, OrderSubmitState>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.k.AnonymousClass1 */
                    final /* synthetic */ k this$0;

                    static {
                        Covode.recordClassIndex(52948);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        String str = "";
                        h.f.b.l.d(orderSubmitState2, str);
                        String str2 = (String) h.a.n.h((List) this.this$0.this$0.K);
                        if (str2 != null) {
                            str = str2;
                        }
                        return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, new c(str), false, 0, null, null, false, 16515071, null);
                    }
                });
            } else {
                int i2 = 0;
                Iterator<String> it = this.this$0.K.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (h.f.b.l.a((Object) it.next(), (Object) str)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                String str2 = (String) h.a.n.b((List) this.this$0.K, i2 + 1);
                if (str2 != null) {
                    this.this$0.c(new a(str2));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ int $diff;

        static {
            Covode.recordClassIndex(52918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(int i2) {
            super(1);
            this.$diff = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, this.$diff, null, null, false, false, null, 0, null, false, 0, null, null, false, 16775167, null);
        }
    }

    public static final class ab extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ String $msg;

        static {
            Covode.recordClassIndex(52919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ab(String str) {
            super(1);
            this.$msg = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, this.$msg, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777087, null);
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ boolean $opened;

        static {
            Covode.recordClassIndex(52920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(boolean z) {
            super(1);
            this.$opened = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, this.$opened, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777151, null);
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ c $op;

        static {
            Covode.recordClassIndex(52921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(c cVar) {
            super(1);
            this.$op = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, this.$op, false, 0, null, null, false, 16515071, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ae extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ int $newState;

        static {
            Covode.recordClassIndex(52922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(int i2) {
            super(1);
            this.$newState = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, this.$newState, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777214, null);
        }
    }

    static final class af extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ boolean $isShow;

        static {
            Covode.recordClassIndex(52923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(boolean z) {
            super(1);
            this.$isShow = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, this.$isShow, 8388607, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n $paymentInfo;

        static {
            Covode.recordClassIndex(52924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            super(1);
            this.$paymentInfo = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, this.$paymentInfo, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777199, null);
        }
    }

    public static final class ai extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $payType;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ai(OrderSubmitViewModel orderSubmitViewModel, Context context, String str) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$context = context;
            this.$payType = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.$context.getString(R.string.bib);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.ai.AnonymousClass1 */
                final /* synthetic */ ai this$0;

                static {
                    Covode.recordClassIndex(52929);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("balance_insufficient", "yes", (String) null, this.this$0.$payType);
                    this.this$0.this$0.a(this.this$0.$context, false);
                    return h.z.f158842a;
                }
            });
            String string2 = this.$context.getString(R.string.bic);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.ai.AnonymousClass2 */
                final /* synthetic */ ai this$0;

                static {
                    Covode.recordClassIndex(52930);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("balance_insufficient", "no", (String) null, this.this$0.$payType);
                    return h.z.f158842a;
                }
            });
            bVar2.f44820b = true;
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.this$0 = orderSubmitViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            Boolean bool;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar = userPaymentInfo.f85329b) == null || (aVar = oVar.t) == null) {
                bool = null;
            } else {
                bool = aVar.f85272a;
            }
            if (h.f.b.l.a((Object) false, (Object) bool)) {
                OrderSubmitViewModel.a(this.this$0, false, false, false, false, null, 63);
            }
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84740a = new d();

        static {
            Covode.recordClassIndex(52936);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, true, false, null, 0, null, false, 0, null, null, false, 16760831, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f84742a = new f();

        static {
            Covode.recordClassIndex(52940);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16744447, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ boolean $check;

        static {
            Covode.recordClassIndex(52942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$check = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, this.$check, 0, null, null, false, 16252927, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f84744a = new l();

        static {
            Covode.recordClassIndex(52950);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16760831, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f84745a = new n();

        static {
            Covode.recordClassIndex(52952);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16760831, null);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f84750a = new s();

        static {
            Covode.recordClassIndex(52961);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, new Object(), false, 12582911, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r $fragment;
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c $params$inlined;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r rVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c cVar, OrderSubmitViewModel orderSubmitViewModel, Context context) {
            super(1);
            this.$fragment = rVar;
            this.$params$inlined = cVar;
            this.this$0 = orderSubmitViewModel;
            this.$context$inlined = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            this.$fragment.dismissAllowingStateLoss();
            OrderSubmitViewModel orderSubmitViewModel = this.this$0;
            h.f.b.l.d(nVar2, "");
            bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new b(orderSubmitViewModel, nVar2, null), 2);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84786b = SystemClock.elapsedRealtime();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f84754a = new y();

        static {
            Covode.recordClassIndex(52970);
        }

        y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, orderSubmitState2.getRefreshCouponViewModel() + 1, null, false, 0, null, null, false, 16646143, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(52971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, this.$status, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16776191, null);
        }
    }

    public final void a(int i2) {
        c(new ae(i2));
    }

    public final void b(Context context) {
        b_(new i(this, context));
    }

    public final void c(boolean z2) {
        c(new af(z2));
    }

    static final class b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n $paymentInfo;
        int label;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OrderSubmitViewModel orderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = orderSubmitViewModel;
            this.$paymentInfo = nVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new b(this.this$0, this.$paymentInfo, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                this.this$0.D = true;
                kotlinx.coroutines.w a2 = OrderSubmitViewModel.a(this.this$0, false, false, false, false, null, 48);
                this.label = 1;
                if (a2.a((h.c.d) this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.c(new h.f.a.b<OrderSubmitState, OrderSubmitState>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(52934);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    h.f.b.l.d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, this.this$0.this$0.a(this.this$0.this$0.f84735k, orderSubmitState2.getHasAddress(), this.this$0.$paymentInfo.f85329b, true), null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777213, null);
                }
            });
            this.this$0.a(this.$paymentInfo);
            return h.z.f158842a;
        }
    }

    static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        int label;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(OrderSubmitViewModel orderSubmitViewModel, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = orderSubmitViewModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new e(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
            if (r1 == null) goto L_0x0057;
         */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ Throwable $e;
        final /* synthetic */ long $startCreateOrder;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(OrderSubmitViewModel orderSubmitViewModel, Throwable th, long j2) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$e = th;
            this.$startCreateOrder = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            String str;
            String str2;
            String message;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            String str3 = "";
            h.f.b.l.d(orderSubmitState2, str3);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar2 = userPaymentInfo.f85329b) == null || (str = oVar2.c()) == null) {
                str = str3;
            }
            OrderSubmitViewModel orderSubmitViewModel = this.this$0;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo2 == null || (oVar = userPaymentInfo2.f85329b) == null) {
                str2 = null;
            } else {
                str2 = oVar.f85334a;
            }
            boolean b2 = orderSubmitViewModel.b(str2);
            boolean z = this.this$0.B;
            boolean z2 = this.this$0.C;
            Throwable th = this.$e;
            if (!(th == null || (message = th.getMessage()) == null)) {
                str3 = message;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(z, z2, "", false, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.b(str3), this.this$0.j(), str, SystemClock.elapsedRealtime() - this.$startCreateOrder, this.this$0.g(), Boolean.valueOf(b2));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d $result;
        final /* synthetic */ long $startCreateOrder;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(OrderSubmitViewModel orderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d dVar, long j2) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$result = dVar;
            this.$startCreateOrder = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            String str;
            String str2;
            List<String> list;
            String a2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            String str3 = "";
            h.f.b.l.d(orderSubmitState2, str3);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar2 = userPaymentInfo.f85329b) == null || (str = oVar2.c()) == null) {
                str = str3;
            }
            OrderSubmitViewModel orderSubmitViewModel = this.this$0;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo2 == null || (oVar = userPaymentInfo2.f85329b) == null) {
                str2 = null;
            } else {
                str2 = oVar.f85334a;
            }
            boolean b2 = orderSubmitViewModel.b(str2);
            boolean z = this.this$0.B;
            boolean z2 = this.this$0.C;
            T t = this.$result.data;
            if (!(t == null || (list = t.f84931a) == null || (a2 = h.a.n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62)) == null)) {
                str3 = a2;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(z, z2, str3, false, String.valueOf(this.$result.code), this.this$0.j(), str, SystemClock.elapsedRealtime() - this.$startCreateOrder, this.this$0.g(), Boolean.valueOf(b2));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d $result;
        final /* synthetic */ long $startCreateOrder;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(OrderSubmitViewModel orderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d dVar, long j2) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$result = dVar;
            this.$startCreateOrder = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            String str;
            String str2;
            List<String> list;
            String a2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            String str3 = "";
            h.f.b.l.d(orderSubmitState2, str3);
            OrderSubmitViewModel orderSubmitViewModel = this.this$0;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar2 = userPaymentInfo.f85329b) == null) {
                str = null;
            } else {
                str = oVar2.f85334a;
            }
            boolean b2 = orderSubmitViewModel.b(str);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo2 == null || (oVar = userPaymentInfo2.f85329b) == null || (str2 = oVar.c()) == null) {
                str2 = str3;
            }
            boolean z = this.this$0.B;
            boolean z2 = this.this$0.C;
            T t = this.$result.data;
            if (!(t == null || (list = t.f84931a) == null || (a2 = h.a.n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62)) == null)) {
                str3 = a2;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(z, z2, str3, true, "", this.this$0.j(), str2, SystemClock.elapsedRealtime() - this.$startCreateOrder, this.this$0.g(), Boolean.valueOf(b2));
            return h.z.f158842a;
        }
    }

    private static String a(HashMap<String, Object> hashMap) {
        Map map = null;
        try {
            com.google.gson.f fVar = new com.google.gson.f();
            Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
            if (obj != null) {
                map = (Map) fVar.a((String) obj, new r().type);
                List<String> list = com.ss.android.ugc.aweme.ecommerce.ab.d.a().f84226a;
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (list.contains(entry.getKey())) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                }
                String jSONObject2 = jSONObject.toString();
                h.f.b.l.b(jSONObject2, "");
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }

    public final void b(boolean z2) {
        c(new h(z2));
    }

    static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        int label;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OrderSubmitViewModel orderSubmitViewModel, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = orderSubmitViewModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new g(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Long l2;
            String string;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar2 = null;
            if (i2 == 0) {
                h.r.a(obj);
                try {
                    int a2 = com.bytedance.ies.abmock.b.a().a(true, "ecom_quit_checkout_reason_collection_config", -1);
                    if (a2 >= 0) {
                        this.this$0.x = Keva.getRepo("ecom_keva_store");
                        Keva keva = this.this$0.x;
                        if (keva == null || (string = keva.getString("ecom_last_quit_reason_time_stamp", null)) == null) {
                            l2 = null;
                        } else {
                            l2 = h.c.b.a.b.a(Long.parseLong(string));
                        }
                        if (l2 == null) {
                            l2 = h.c.b.a.b.a(0L);
                        }
                        if ((System.currentTimeMillis() - l2.longValue()) / 86400000 >= ((long) a2)) {
                            if (this.this$0.J != null) {
                                this.label = 1;
                                h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                                ((OrderSubmitApi) OrderSubmitApi.a.f84924a.a(OrderSubmitApi.class)).getQuitReason(0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a.f(hVar));
                                obj = hVar.a();
                                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                                    h.f.b.l.d(this, "");
                                }
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            if (aVar2 != null && aVar2.isCodeOK()) {
                                this.this$0.o = aVar2.data;
                            }
                        }
                    }
                } catch (Throwable unused) {
                    com.bytedance.services.apm.api.a.a("Get quit reasons fail");
                }
                return h.z.f158842a;
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            this.this$0.o = aVar2.data;
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<OrderSubmitState, h.z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ OrderSubmitViewModel this$0;

        static {
            Covode.recordClassIndex(52943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(OrderSubmitViewModel orderSubmitViewModel, Context context) {
            super(1);
            this.this$0 = orderSubmitViewModel;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
            Boolean bool;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar4;
            final OrderSubmitState orderSubmitState2 = orderSubmitState;
            h.f.b.l.d(orderSubmitState2, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo != null) {
                bool = userPaymentInfo.f85331d;
            } else {
                bool = null;
            }
            if (!h.f.b.l.a((Object) bool, (Object) true)) {
                this.this$0.b(true);
            } else {
                this.this$0.c(AnonymousClass1.f84743a);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo2 == null || (oVar4 = userPaymentInfo2.f85329b) == null) {
                    str = null;
                } else {
                    str = oVar4.f85336c;
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo3 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo3 == null || (oVar3 = userPaymentInfo3.f85329b) == null) {
                    str2 = null;
                } else {
                    str2 = oVar3.f85337d;
                }
                if (!h.f.b.l.a((Object) str, (Object) str2)) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo4 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo4 == null || (oVar2 = userPaymentInfo4.f85329b) == null || (str4 = oVar2.c()) == null) {
                    str4 = "";
                }
                boolean z = this.this$0.B;
                boolean z2 = this.this$0.C;
                HashMap<String, Object> j2 = this.this$0.j();
                OrderSubmitViewModel orderSubmitViewModel = this.this$0;
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo5 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo5 == null || (oVar = userPaymentInfo5.f85329b) == null) {
                    str5 = null;
                } else {
                    str5 = oVar.f85334a;
                }
                Boolean valueOf = Boolean.valueOf(orderSubmitViewModel.b(str5));
                h.f.b.l.d(str4, "");
                h.f.b.l.d(j2, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a);
                linkedHashMap.put("pay_type", str4);
                linkedHashMap.put("is_edit_address", Integer.valueOf(z ? 1 : 0));
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(z2 ? 1 : 0));
                linkedHashMap.put("is_edit_pay_method", str3);
                if (valueOf != null) {
                    linkedHashMap.put("is_pay_saved", Integer.valueOf(valueOf.booleanValue() ? 1 : 0));
                }
                linkedHashMap.putAll(j2);
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_pay_order", linkedHashMap);
                bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.i.AnonymousClass2 */
                    long J$0;
                    int label;
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(52945);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        public static final class x extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ kotlinx.coroutines.w $deferred;
                            final /* synthetic */ boolean $isRetry;
                            final /* synthetic */ BillInfoRequest $request;
                            int label;
                            final /* synthetic */ OrderSubmitViewModel this$0;

                            static {
                                Covode.recordClassIndex(52967);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            x(OrderSubmitViewModel orderSubmitViewModel, BillInfoRequest billInfoRequest, boolean z, kotlinx.coroutines.w wVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = orderSubmitViewModel;
                                this.$request = billInfoRequest;
                                this.$isRetry = z;
                                this.$deferred = wVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new x(this.this$0, this.$request, this.$isRetry, this.$deferred, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((x) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
                            @Override // h.c.b.a.a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                                /*
                                // Method dump skipped, instructions count: 129
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.x.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        public final boolean b(String str) {
                            BillInfoData billInfoData;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods;
                            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list;
                            if (str != null && str.length() != 0 && (billInfoData = this.f84735k) != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (list = paymentMethods.f85351c) != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (h.f.b.l.a((Object) next.f85334a, (Object) str)) {
                                        if (next != null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                            return false;
                        }

                        static final class aj extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t $quitReason;
                            int label;
                            final /* synthetic */ OrderSubmitViewModel this$0;

                            static {
                                Covode.recordClassIndex(52931);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            aj(OrderSubmitViewModel orderSubmitViewModel, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t tVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = orderSubmitViewModel;
                                this.$quitReason = tVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new aj(this.this$0, this.$quitReason, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((aj) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                com.ss.android.ugc.aweme.ecommerce.api.model.a aVar;
                                h.c.a.a aVar2 = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    h.r.a(obj);
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        List<OrderShopDigest> list = this.this$0.f84730c;
                                        if (list != null) {
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                                                if (orderSKUs != null) {
                                                    for (T t : orderSKUs) {
                                                        arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.r(t.f85906a, t.f85907b));
                                                    }
                                                }
                                            }
                                        }
                                        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.u uVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.u(this.$quitReason.f85005a, this.$quitReason.f85006b, this.$quitReason.f85007c, dg.a().b(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.f(arrayList)));
                                        if (this.this$0.J != null) {
                                            this.label = 1;
                                            h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                                            h.f.b.l.d(uVar, "");
                                            ((OrderSubmitApi) OrderSubmitApi.a.f84924a.a(OrderSubmitApi.class)).submitQuitReason(uVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a.i(hVar));
                                            obj = hVar.a();
                                            if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                                                h.f.b.l.d(this, "");
                                            }
                                            if (obj == aVar2) {
                                                return aVar2;
                                            }
                                        } else {
                                            aVar = null;
                                            if (aVar != null || aVar.isCodeOK()) {
                                                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.bh0)).a();
                                                return h.z.f158842a;
                                            }
                                            String str = aVar.message;
                                            if (str != null) {
                                                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(str).a();
                                            }
                                            return h.z.f158842a;
                                        }
                                    } catch (Throwable unused) {
                                        com.bytedance.services.apm.api.a.a("Submit Quit Reason Fail");
                                    }
                                } else if (i2 == 1) {
                                    h.r.a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
                                if (aVar != null) {
                                }
                                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.bh0)).a();
                                return h.z.f158842a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class ak extends h.f.b.m implements h.f.a.b<OrderSubmitState, OrderSubmitState> {
                            final /* synthetic */ boolean $hasAddress;
                            final /* synthetic */ BillInfoData $it;
                            final /* synthetic */ BillInfoRequest $requestParam$inlined;
                            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $selectedPayment;
                            final /* synthetic */ OrderSubmitViewModel this$0;

                            static {
                                Covode.recordClassIndex(52932);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            ak(boolean z, BillInfoData billInfoData, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, OrderSubmitViewModel orderSubmitViewModel, BillInfoRequest billInfoRequest) {
                                super(1);
                                this.$hasAddress = z;
                                this.$it = billInfoData;
                                this.$selectedPayment = oVar;
                                this.this$0 = orderSubmitViewModel;
                                this.$requestParam$inlined = billInfoRequest;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                                boolean z;
                                ArrayList arrayList;
                                int i2;
                                List<BillItem> billItems;
                                String str;
                                Image image;
                                OrderSubmitState orderSubmitState2 = orderSubmitState;
                                h.f.b.l.d(orderSubmitState2, "");
                                boolean z2 = this.$hasAddress;
                                String total = this.$it.getTotal();
                                int totalItems = this.$it.getTotalItems();
                                boolean z3 = this.this$0.E;
                                OrderSubmitViewModel orderSubmitViewModel = this.this$0;
                                BillInfoData billInfoData = this.$it;
                                boolean z4 = this.$hasAddress;
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$selectedPayment;
                                if (oVar == null) {
                                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods = billInfoData.getPaymentMethods();
                                    oVar = paymentMethods != null ? paymentMethods.a() : null;
                                }
                                if (this.$selectedPayment != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                List<Object> a2 = orderSubmitViewModel.a(billInfoData, z4, oVar, z);
                                BillInfoData billInfoData2 = this.$it;
                                h.f.b.l.d(billInfoData2, "");
                                Summary summary = billInfoData2.getSummary();
                                if (summary == null || (billItems = summary.getBillItems()) == null) {
                                    arrayList = h.a.z.INSTANCE;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) billItems, 10));
                                    for (T t : billItems) {
                                        String itemName = t.getItemName();
                                        if (itemName == null) {
                                            itemName = "";
                                        }
                                        Price itemPrice = t.getItemPrice();
                                        if (itemPrice == null || (str = itemPrice.getPriceStr()) == null) {
                                            str = "";
                                        }
                                        Price itemPrice2 = t.getItemPrice();
                                        Integer priceTextColor = itemPrice2 != null ? itemPrice2.getPriceTextColor() : null;
                                        Icon logo = t.getLogo();
                                        String str2 = logo != null ? logo.f84632c : null;
                                        Icon logo2 = t.getLogo();
                                        arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.i(itemName, str, priceTextColor, str2, (logo2 == null || (image = logo2.f84630a) == null) ? null : image.toImageUrlModel(), t.getItemTextColor(), t.getItemType()));
                                    }
                                    arrayList = arrayList2;
                                }
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j(arrayList);
                                VoucherInfo voucherInfo = this.$it.getVoucherInfo();
                                List<ShopOrder> shopOrders = this.$it.getShopOrders();
                                if (shopOrders != null) {
                                    i2 = shopOrders.size();
                                } else {
                                    i2 = 0;
                                }
                                return OrderSubmitState.copy$default(orderSubmitState2, 0, a2, jVar, z2, null, z3, false, null, total, totalItems, 0, 0, null, null, false, true, voucherInfo, 0, null, false, i2, this.$it.getBottomNotice(), null, false, 13532369, null);
                            }
                        }

                        public static final class v extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ List $list;
                            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f $productInfo;
                            int label;
                            final /* synthetic */ OrderSubmitViewModel this$0;

                            static {
                                Covode.recordClassIndex(52964);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public v(OrderSubmitViewModel orderSubmitViewModel, Context context, List list, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = orderSubmitViewModel;
                                this.$context = context;
                                this.$list = list;
                                this.$productInfo = fVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new v(this.this$0, this.$context, this.$list, this.$productInfo, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((v) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
                            @Override // h.c.b.a.a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                                /*
                                // Method dump skipped, instructions count: 322
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.v.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.c a(OrderSubmitState orderSubmitState) {
                            Object obj;
                            List<BillItem> list;
                            Price price;
                            String str;
                            ArrayList arrayList;
                            String str2;
                            ShippingAddress shippingAddress;
                            VoucherInfo voucherInfo;
                            List<Voucher> vouchers;
                            ShippingAddress shippingAddress2;
                            Address shippingAddress3;
                            Summary summary;
                            Summary summary2;
                            List<ShopOrder> shopOrders;
                            Object obj2;
                            int i2;
                            LogisticDTO logisticDTO;
                            T t2;
                            String str3;
                            LogisticDTO logisticDTO2;
                            T t3;
                            int i3;
                            String str4;
                            String a2;
                            Object obj3;
                            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.h> list2;
                            T t4;
                            Object obj4;
                            HashMap<String, Object> hashMap = this.G;
                            HashMap<String, Object> hashMap2 = this.F;
                            if (hashMap2 != null) {
                                hashMap.putAll(hashMap2);
                            }
                            hashMap.remove("product_id");
                            hashMap.remove("author_id");
                            Object obj5 = hashMap.get("entrance_info");
                            if (!(obj5 instanceof String)) {
                                obj5 = null;
                            }
                            try {
                                obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a((String) obj5, HashMap.class);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            HashMap hashMap3 = (HashMap) obj;
                            if (hashMap3 != null) {
                                hashMap3.remove("product_id");
                                hashMap3.remove("author_id");
                            } else {
                                hashMap3 = null;
                            }
                            hashMap.put("entrance_info", dg.a().b(hashMap3));
                            HashMap<String, Object> hashMap4 = this.F;
                            if (!(hashMap4 == null || (obj4 = hashMap4.get("previous_page")) == null || !(obj4 instanceof String))) {
                                hashMap.put("previous_page", obj4);
                            }
                            hashMap.putAll(j());
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n userPaymentInfo = orderSubmitState.getUserPaymentInfo();
                            int i4 = this.f84728a;
                            String valueOf = String.valueOf(this.w);
                            ArrayList arrayList2 = new ArrayList();
                            List a3 = h.a.n.a((Iterable<?>) orderSubmitState.getAdapterList(), com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f.class);
                            BillInfoData billInfoData = this.f84735k;
                            if (!(billInfoData == null || (shopOrders = billInfoData.getShopOrders()) == null)) {
                                for (T t5 : shopOrders) {
                                    Iterator it = a3.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f) obj2;
                                        if (h.f.b.l.a((Object) fVar.f84825a, (Object) t5.getSellerId()) && h.f.b.l.a((Object) fVar.f84826b, (Object) t5.getWarehouseId())) {
                                            break;
                                        }
                                    }
                                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f fVar2 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.f) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    List<PackedSku> packedSkus = t5.getPackedSkus();
                                    if (packedSkus != null) {
                                        for (T t6 : packedSkus) {
                                            if (fVar2 == null || (list2 = fVar2.f84829e) == null) {
                                                t3 = null;
                                            } else {
                                                Iterator<T> it2 = list2.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        t4 = null;
                                                        break;
                                                    }
                                                    t4 = it2.next();
                                                    if (h.f.b.l.a((Object) t4.f84837a, (Object) t6.getSkuId())) {
                                                        break;
                                                    }
                                                }
                                                t3 = t4;
                                            }
                                            String productId = t6.getProductId();
                                            if (productId == null) {
                                                productId = "";
                                            }
                                            String skuId = t6.getSkuId();
                                            if (skuId == null) {
                                                skuId = "";
                                            }
                                            if (t3 != null) {
                                                i3 = t3.f84838b;
                                            } else {
                                                i3 = 1;
                                            }
                                            SkuPrice price2 = t6.getPrice();
                                            if (price2 == null) {
                                                price2 = new SkuPrice(null, null, null, 7, null);
                                            }
                                            if (this.f84728a == 1) {
                                                str4 = t6.getChainKey();
                                            } else {
                                                str4 = this.f84732e;
                                            }
                                            if (this.f84728a == 1) {
                                                a2 = t6.getEntranceInfo();
                                            } else {
                                                a2 = a(this.F);
                                            }
                                            String cartItemId = t6.getCartItemId();
                                            Integer valueOf2 = Integer.valueOf(IPdpStarter.a.a(this.F));
                                            String sourceInfo = t6.getSourceInfo();
                                            HashMap<String, Object> hashMap5 = this.F;
                                            if (hashMap5 != null) {
                                                obj3 = hashMap5.get("author_id");
                                            } else {
                                                obj3 = null;
                                            }
                                            arrayList3.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.e(productId, skuId, i3, price2, str4, a2, cartItemId, valueOf2, sourceInfo, String.valueOf(obj3)));
                                        }
                                    }
                                    String sellerId = t5.getSellerId();
                                    if (sellerId == null) {
                                        sellerId = "";
                                    }
                                    String warehouseId = t5.getWarehouseId();
                                    if (warehouseId == null) {
                                        warehouseId = "";
                                    }
                                    List<LogisticDTO> logistics = t5.getLogistics();
                                    if (logistics != null) {
                                        Iterator<T> it3 = logistics.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                t2 = null;
                                                break;
                                            }
                                            t2 = it3.next();
                                            String str5 = t2.f85899k;
                                            if (fVar2 == null || (logisticDTO2 = fVar2.f84831g) == null) {
                                                str3 = null;
                                            } else {
                                                str3 = logisticDTO2.f85899k;
                                            }
                                            if (h.f.b.l.a((Object) str5, (Object) str3)) {
                                                break;
                                            }
                                        }
                                        T t7 = t2;
                                        if (t7 != null) {
                                            i2 = t7.f85889a;
                                            if (fVar2 != null || (logisticDTO = fVar2.f84831g) == null || (r4 = logisticDTO.f85899k) == null) {
                                                String str6 = "";
                                            }
                                            arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.k(arrayList3, sellerId, warehouseId, i2, str6, this.t));
                                        }
                                    }
                                    i2 = 0;
                                    if (fVar2 != null) {
                                    }
                                    String str62 = "";
                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.k(arrayList3, sellerId, warehouseId, i2, str62, this.t));
                                }
                            }
                            BillInfoData billInfoData2 = this.f84735k;
                            if (billInfoData2 == null || (summary2 = billInfoData2.getSummary()) == null) {
                                list = null;
                            } else {
                                list = summary2.getBillItems();
                            }
                            BillInfoData billInfoData3 = this.f84735k;
                            if (billInfoData3 == null || (summary = billInfoData3.getSummary()) == null) {
                                price = null;
                            } else {
                                price = summary.getTotal();
                            }
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.n nVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.n(list, price);
                            BillInfoData billInfoData4 = this.f84735k;
                            if (billInfoData4 == null || (shippingAddress2 = billInfoData4.getShippingAddress()) == null || (shippingAddress3 = shippingAddress2.getShippingAddress()) == null || (str = shippingAddress3.f84302e) == null) {
                                str = "";
                            }
                            BillInfoData billInfoData5 = this.f84735k;
                            if (billInfoData5 == null || (voucherInfo = billInfoData5.getVoucherInfo()) == null || (vouchers = voucherInfo.getVouchers()) == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                for (T t8 : vouchers) {
                                    if (h.f.b.l.a((Object) t8.getSelected(), (Object) true)) {
                                        arrayList4.add(t8);
                                    }
                                }
                                ArrayList<Voucher> arrayList5 = arrayList4;
                                ArrayList arrayList6 = new ArrayList(h.a.n.a((Iterable) arrayList5, 10));
                                for (Voucher voucher : arrayList5) {
                                    String voucherID = voucher.getVoucherID();
                                    if (voucherID == null) {
                                        voucherID = "";
                                    }
                                    arrayList6.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.v(voucherID, voucher.getVoucherTypeID()));
                                }
                                arrayList = arrayList6;
                            }
                            BillInfoData billInfoData6 = this.f84735k;
                            if (billInfoData6 != null) {
                                str2 = billInfoData6.getOrderSecret();
                            } else {
                                str2 = null;
                            }
                            List<String> list3 = this.M;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p a4 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.d.a(userPaymentInfo);
                            Address address = null;
                            String a5 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w.a(null, null, "ordersubmit", userPaymentInfo, this.G);
                            String a6 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w.a("ordersubmit", userPaymentInfo, this.G);
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.m a7 = e.a.a();
                            BillInfoData billInfoData7 = this.f84735k;
                            if (!(billInfoData7 == null || (shippingAddress = billInfoData7.getShippingAddress()) == null)) {
                                address = shippingAddress.getShippingAddress();
                            }
                            return new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.c(valueOf, arrayList2, nVar, str, arrayList, str2, true, a4, a5, a6, null, list3, i4, a7, address, 1024);
                        }

                        public final void a(Context context) {
                            String str;
                            DynamicSchema schemaInfo;
                            this.r = "next";
                            this.y = true;
                            List<Region> list = this.f84731d;
                            String i2 = i();
                            BillInfoData billInfoData = this.f84735k;
                            if (billInfoData == null || (schemaInfo = billInfoData.getSchemaInfo()) == null) {
                                str = null;
                            } else {
                                str = schemaInfo.getAddressEditSchema();
                            }
                            AddressPageStarter.a(context, null, list, "order_submit", false, i2, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("top");
                            this.B = true;
                        }

                        public final List<Object> a(BillInfoData billInfoData, boolean z2, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, boolean z3) {
                            Address address;
                            String str;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            Boolean bool;
                            Boolean bool2;
                            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list;
                            List<String> list2;
                            String str8;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.t tVar;
                            VoucherInfo voucherInfo;
                            List<Voucher> vouchers;
                            ArrayList arrayList = new ArrayList();
                            if (billInfoData != null) {
                                List<Announcement> announcement = billInfoData.getAnnouncement();
                                if (announcement != null) {
                                    for (T t2 : announcement) {
                                        h.f.b.l.d(t2, "");
                                        String announcementId = t2.getAnnouncementId();
                                        if (announcementId == null) {
                                            announcementId = "";
                                        }
                                        String text = t2.getText();
                                        if (text == null) {
                                            text = "";
                                        }
                                        Image icon = t2.getIcon();
                                        String link = t2.getLink();
                                        if (link == null) {
                                            link = "";
                                        }
                                        arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.b(announcementId, text, icon, link, t2.getBackground()));
                                    }
                                }
                                if (billInfoData.getAnnouncement() != null && (!billInfoData.getAnnouncement().isEmpty())) {
                                    arrayList.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(8.0f, false, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.az), 4));
                                }
                                h.f.b.l.d(billInfoData, "");
                                ShippingAddress shippingAddress = billInfoData.getShippingAddress();
                                if (shippingAddress != null) {
                                    address = shippingAddress.getShippingAddress();
                                } else {
                                    address = null;
                                }
                                if (address != null) {
                                    str = address.a(StringSet.name);
                                    str2 = address.a("phone");
                                    str3 = Address.a(address);
                                    str4 = address.b();
                                    str5 = address.a("zipcode");
                                    str6 = address.a("email");
                                } else {
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                    str4 = null;
                                    str5 = null;
                                    str6 = null;
                                }
                                ShippingAddress shippingAddress2 = billInfoData.getShippingAddress();
                                if (shippingAddress2 != null) {
                                    str7 = shippingAddress2.getInvalidHintMessage();
                                } else {
                                    str7 = null;
                                }
                                ShippingAddress shippingAddress3 = billInfoData.getShippingAddress();
                                if (shippingAddress3 != null) {
                                    bool = shippingAddress3.getAddressReachable();
                                } else {
                                    bool = null;
                                }
                                ShippingAddress shippingAddress4 = billInfoData.getShippingAddress();
                                if (shippingAddress4 != null) {
                                    bool2 = shippingAddress4.getAddressValid();
                                } else {
                                    bool2 = null;
                                }
                                arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a(str, str2, str3, str4, str5, z2, str6, str7, bool, bool2));
                                List<ShopOrder> shopOrders = billInfoData.getShopOrders();
                                if (shopOrders != null) {
                                    Iterator<T> it = shopOrders.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.g.a(it.next(), z2, billInfoData.getVoucherInfo()));
                                    }
                                }
                                if (this.E && (voucherInfo = billInfoData.getVoucherInfo()) != null && (vouchers = voucherInfo.getVouchers()) != null && (!vouchers.isEmpty())) {
                                    h.f.b.l.d(billInfoData, "");
                                    arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.d(billInfoData.getVoucherInfo()));
                                }
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods = billInfoData.getPaymentMethods();
                                if (paymentMethods != null) {
                                    list = paymentMethods.f85349a;
                                } else {
                                    list = null;
                                }
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods2 = billInfoData.getPaymentMethods();
                                if (paymentMethods2 == null || (tVar = paymentMethods2.f85358j) == null) {
                                    list2 = null;
                                } else {
                                    list2 = tVar.f85362a;
                                }
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r paymentMethods3 = billInfoData.getPaymentMethods();
                                if (paymentMethods3 != null) {
                                    str8 = paymentMethods3.f85357i;
                                } else {
                                    str8 = null;
                                }
                                arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.c(oVar, list, list2, str8, z3, this.E));
                                if (this.E) {
                                    arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.d(com.ss.android.ugc.aweme.ecommerce.util.h.f87571e, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.b7)));
                                }
                                arrayList.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.e(this.E));
                            }
                            return arrayList;
                        }

                        public final void a(Context context, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.d dVar, Throwable th, long j2) {
                            ExceptionUX exceptionUX;
                            Integer num;
                            String str;
                            if (dVar == null) {
                                c(l.f84744a);
                                h();
                                b_(new m(this, th, j2));
                                return;
                            }
                            T t2 = dVar.data;
                            this.f84737m = String.valueOf(dVar.code);
                            if (!dVar.isCodeOK()) {
                                c(n.f84745a);
                                Boolean bool = null;
                                if (t2 != null) {
                                    exceptionUX = t2.f84934d;
                                } else {
                                    exceptionUX = null;
                                }
                                this.f84736l = exceptionUX;
                                if (exceptionUX != null) {
                                    num = exceptionUX.getExceptionUXType();
                                } else {
                                    num = null;
                                }
                                if (num == null || num.intValue() != 2) {
                                    ExceptionUX exceptionUX2 = this.f84736l;
                                    if (exceptionUX2 != null) {
                                        bool = exceptionUX2.getRenderPage();
                                    }
                                    if (!h.f.b.l.a((Object) bool, (Object) true)) {
                                        str = "create_order";
                                        this.v = str;
                                        b(1);
                                        b_(new o(this, dVar, j2));
                                        return;
                                    }
                                }
                                str = "query_bill_info";
                                this.v = str;
                                b(1);
                                b_(new o(this, dVar, j2));
                                return;
                            }
                            b_(new p(this, dVar, j2));
                            b_(new q(this, context, t2, dVar));
                        }

                        private kotlinx.coroutines.w<h.z> a(boolean z2, boolean z3, boolean z4, boolean z5, List<OrderShopDigest> list) {
                            List list2;
                            String promotionID;
                            List<OrderShopDigest> list3 = list;
                            kotlinx.coroutines.w<h.z> a2 = kotlinx.coroutines.y.a();
                            b_(new w(this));
                            String str = this.f84729b;
                            if (list3 == null) {
                                list3 = this.f84730c;
                            }
                            int i2 = this.f84728a;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p a3 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.d.a(this.n, false);
                            Voucher voucher = this.S;
                            if (voucher == null || (promotionID = voucher.getPromotionID()) == null || (list2 = h.a.n.a(promotionID)) == null) {
                                list2 = h.a.z.INSTANCE;
                            }
                            bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new x(this, new BillInfoRequest(str, i2, list3, z2, z3, z4, z5, list2, Boolean.valueOf(this.R), this.L, false, a3, null, this.N, this.M, 5120, null), false, a2, null), 2);
                            return a2;
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel */
                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ kotlinx.coroutines.w a(OrderSubmitViewModel orderSubmitViewModel, boolean z2, boolean z3, boolean z4, boolean z5, List list, int i2) {
                            if ((i2 & 1) != 0) {
                                z2 = true;
                            }
                            if ((i2 & 2) != 0) {
                                z3 = true;
                            }
                            if ((i2 & 4) != 0) {
                                z4 = true;
                            }
                            if ((i2 & 8) != 0) {
                                z5 = true;
                            }
                            if ((i2 & 16) != 0) {
                                list = null;
                            }
                            return orderSubmitViewModel.a(z2, z3, z4, z5, list);
                        }
                    }
