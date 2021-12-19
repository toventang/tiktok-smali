package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.v;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.da;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.z;
import h.m.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class PdpBodyWidget extends JediBaseWidget implements au, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: k  reason: collision with root package name */
    public static final b f86869k = new b((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public final float f86870h = (((float) com.ss.android.ugc.aweme.ecommerce.util.h.f87568b) - com.ss.android.ugc.aweme.ecommerce.util.h.a());

    /* renamed from: i  reason: collision with root package name */
    public final float f86871i = com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.g.a(), 44.0f);

    /* renamed from: j  reason: collision with root package name */
    public final Fragment f86872j;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f86873l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f86874m = h.i.a((h.f.a.a) new c(this));
    private final ViewTreeObserver.OnGlobalLayoutListener n = new n(this);

    static {
        Covode.recordClassIndex(54428);
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return R.layout.pj;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(354, new org.greenrobot.eventbus.g(PdpBodyWidget.class, "onRefreshPdp", v.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final PdpViewModel l() {
        return (PdpViewModel) this.f86873l.getValue();
    }

    public final com.ss.android.ugc.aweme.ecommerce.pdp.a.b m() {
        return (com.ss.android.ugc.aweme.ecommerce.pdp.a.b) this.f86874m.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54430);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.pdp.a.b> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PdpBodyWidget pdpBodyWidget) {
            super(0);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.a.b invoke() {
            com.ss.android.ugc.aweme.ecommerce.pdp.a.b bVar = new com.ss.android.ugc.aweme.ecommerce.pdp.a.b(this.this$0.f86872j);
            bVar.d(false);
            return bVar;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void e() {
        super.e();
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = l().s;
        if (kVar != null) {
            kVar.f86387f = SystemClock.elapsedRealtime();
            kVar.f86383b = SystemClock.elapsedRealtime();
        }
    }

    public final void n() {
        FixedRecyclerView fixedRecyclerView;
        ViewTreeObserver viewTreeObserver;
        int i2 = Build.VERSION.SDK_INT;
        View view = this.f46127e;
        if (view != null && (fixedRecyclerView = (FixedRecyclerView) view.findViewById(R.id.djj)) != null && (viewTreeObserver = fixedRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.n);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void h() {
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar;
        super.h();
        if (ActivityStack.isAppBackGround() && (kVar = l().s) != null) {
            kVar.a("close");
        }
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = l().s;
        long j2 = 0;
        if (kVar2 != null) {
            long j3 = kVar2.f86383b;
            if (j3 != 0) {
                j2 = SystemClock.elapsedRealtime() - j3;
            }
        }
        com.ss.android.ugc.aweme.base.m.f68150a.execute(new o(this, j2));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpBodyWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void i() {
        String str;
        String str2;
        int i2;
        super.i();
        Activity k2 = k();
        com.ss.android.ugc.aweme.ecommerce.pdp.c.a aVar = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.f86435e.get(k2);
        if (aVar != null) {
            aVar.f86436f--;
            if (aVar.f86436f == 0) {
                com.ss.android.ugc.aweme.ecommerce.pdp.c.a.f86435e.remove(k2);
            }
        }
        l();
        ProductPackStruct productPackStruct = l().f86303d;
        if (productPackStruct == null || (str = productPackStruct.f86638b) == null) {
            str = "";
        }
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.review.repo.b remove = com.ss.android.ugc.aweme.ecommerce.review.repo.b.f87037e.remove(str);
        if (remove != null) {
            remove.f87039b.c();
            remove.f87041d = null;
        }
        n();
        cg.b(this);
        com.ss.android.ugc.aweme.ecommerce.coupon.a.a.f85753a.clear();
        ProductPackStruct productPackStruct2 = l().f86303d;
        if (productPackStruct2 == null || (str2 = productPackStruct2.f86638b) == null) {
            str2 = "";
        }
        boolean z = l().f86302c;
        h.f.b.l.d(str2, "");
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.b(str2, 4, Integer.valueOf(i2)));
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpBodyWidget f86884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f86885b;

        static {
            Covode.recordClassIndex(54451);
        }

        o(PdpBodyWidget pdpBodyWidget, long j2) {
            this.f86884a = pdpBodyWidget;
            this.f86885b = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (r1 != null) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
            if (r1 == null) goto L_0x0052;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.o.run():void");
        }
    }

    static final class n implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpBodyWidget f86883a;

        static {
            Covode.recordClassIndex(54450);
        }

        n(PdpBodyWidget pdpBodyWidget) {
            this.f86883a = pdpBodyWidget;
        }

        public final void onGlobalLayout() {
            FixedRecyclerView fixedRecyclerView;
            String str;
            int i2;
            long j2;
            boolean z;
            VoucherInfo voucherInfo;
            List<Voucher> vouchers;
            View view = this.f86883a.f46127e;
            if (view != null && (fixedRecyclerView = (FixedRecyclerView) view.findViewById(R.id.djj)) != null && fixedRecyclerView.getChildCount() > 0) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86883a.l().s;
                if (kVar != null) {
                    PdpViewModel l2 = this.f86883a.l();
                    h.f.b.l.d(l2, "");
                    kVar.v = true;
                    kVar.t = SystemClock.elapsedRealtime();
                    boolean z2 = l2.f86301b;
                    int i3 = l2.r;
                    int i4 = l2.f86308l;
                    long j3 = kVar.f86382a.get("click_product_start_time");
                    if (j3 == null) {
                        j3 = -1L;
                    }
                    h.f.b.l.b(j3, "");
                    k.i iVar = new k.i(j3);
                    long j4 = kVar.t - kVar.q;
                    long j5 = kVar.s - kVar.r;
                    boolean z3 = kVar.u;
                    Object obj = kVar.B.getRequestParams().get("template");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str2 = (String) obj;
                    if (str2 == null) {
                        str2 = "tt_pdp_full";
                    }
                    long longValue = ((Number) iVar.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
                    long j6 = kVar.x;
                    if (j6 != -1) {
                        j2 = SystemClock.elapsedRealtime() - j6;
                    } else {
                        j2 = -1;
                    }
                    new com.ss.android.ugc.aweme.ecommerce.pdp.b.f(z2, j4, j5, z3, i3, str2, i4, longValue, j2, kVar.w).c(kVar.f86382a);
                    ProductPackStruct productPackStruct = l2.f86303d;
                    if (productPackStruct == null || (voucherInfo = productPackStruct.f86648l) == null || (vouchers = voucherInfo.getVouchers()) == null || vouchers.size() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z4 = l2.f86301b;
                    long j7 = kVar.f86382a.get("click_product_start_time");
                    if (j7 == null) {
                        j7 = -1L;
                    }
                    h.f.b.l.b(j7, "");
                    if (kVar.v) {
                        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_product_detail", new k.o(kVar, z4, j7, z));
                    }
                    kVar.c(l2.f86301b);
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("ViewContent", new k.c(kVar));
                }
                ProductPackStruct productPackStruct2 = this.f86883a.l().f86303d;
                if (productPackStruct2 == null || (str = productPackStruct2.f86638b) == null) {
                    str = "";
                }
                boolean z5 = this.f86883a.l().f86301b;
                h.f.b.l.d(str, "");
                if (z5) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.b(str, 1, Integer.valueOf(i2)));
                int i5 = Build.VERSION.SDK_INT;
                this.f86883a.n();
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        Context context;
        FixedRecyclerView fixedRecyclerView;
        View view;
        TuxStatusView tuxStatusView;
        Context context2;
        View view2;
        TuxStatusView tuxStatusView2;
        FixedRecyclerView fixedRecyclerView2;
        float f2;
        super.c();
        View view3 = this.f46127e;
        if (!(view3 == null || (context = view3.getContext()) == null)) {
            View view4 = this.f46127e;
            if (!(view4 == null || (fixedRecyclerView2 = (FixedRecyclerView) view4.findViewById(R.id.djj)) == null)) {
                fixedRecyclerView2.setAdapter(m());
                float b2 = com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.g.a(), 84.0f) + ((float) l().b());
                ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
                scrollTopLinearLayoutManager.f87551a = ((int) b2) + 1;
                fixedRecyclerView2.setLayoutManager(scrollTopLinearLayoutManager);
                fixedRecyclerView2.a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(context, R.color.b6), (int) com.bytedance.common.utility.n.b(context, 0.5f), com.bytedance.common.utility.n.b(context, 16.0f)));
                float f3 = (float) com.ss.android.ugc.aweme.ecommerce.util.h.f87568b;
                IPdpStarter.PdpEnterParam pdpEnterParam = l().f86300a;
                if (pdpEnterParam != null) {
                    f2 = pdpEnterParam.getExpandHeight();
                } else {
                    f2 = 0.0f;
                }
                fixedRecyclerView2.a(new d(this, (f3 - f2) + b2));
                fixedRecyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(this.n);
                da.a.a("tiktokec_anchor_product_detail").a(fixedRecyclerView2);
            }
            View view5 = this.f46127e;
            if (!(view5 == null || (fixedRecyclerView = (FixedRecyclerView) view5.findViewById(R.id.djj)) == null)) {
                z.a aVar = new z.a();
                aVar.element = true;
                f.a.b.b unused = selectSubscribe(l(), a.f86918a, new ah(), new j(this, aVar, fixedRecyclerView));
                f.a.b.b unused2 = selectSubscribe(l(), e.f86922a, f.f86923a, new ah(), new k(this));
                f.a.b.b unused3 = selectSubscribe(l(), g.f86924a, h.f86925a, new ah(), new l(this, fixedRecyclerView));
                View view6 = this.f46127e;
                if (view6 != null) {
                    view = view6.findViewById(R.id.aez);
                } else {
                    view = null;
                }
                f.a.b.b unused4 = selectSubscribe(l(), i.f86926a, new ah(), new e(view));
                l().g(new f(this));
                if (!(l().f86301b || (view2 = this.f46127e) == null || (tuxStatusView2 = (TuxStatusView) view2.findViewById(R.id.e_c)) == null)) {
                    com.bytedance.tux.h.i.a((View) tuxStatusView2, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) this.f86870h), false, 23);
                }
                View view7 = this.f46127e;
                if (!(view7 == null || (tuxStatusView = (TuxStatusView) view7.findViewById(R.id.e_c)) == null)) {
                    View view8 = this.f46127e;
                    if (view8 != null) {
                        context2 = view8.getContext();
                    } else {
                        context2 = null;
                    }
                    View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(context2, R.layout.pl, null, false);
                    h.f.b.l.b(a2, "");
                    tuxStatusView.a(a2);
                }
                f.a.b.b unused5 = selectSubscribe(l(), b.f86919a, new ah(), new g(this));
                f.a.b.b unused6 = selectSubscribe(l(), c.f86920a, new ah(), new h(this));
                f.a.b.b unused7 = selectSubscribe(l(), d.f86921a, new ah(), new i(this));
                cg.a(this);
            }
        }
        View view9 = this.f46127e;
        if (view9 != null) {
            CardView cardView = (CardView) view9.findViewById(R.id.eo8);
            h.f.b.l.b(cardView, "");
            cardView.setVisibility(8);
            ((CardView) view9.findViewById(R.id.eo8)).setOnClickListener(new m(view9, this));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Float, h.z> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PdpBodyWidget pdpBodyWidget) {
            super(1);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Float f2) {
            TuxStatusView tuxStatusView;
            float floatValue = f2.floatValue();
            View view = this.this$0.f46127e;
            if (!(view == null || (tuxStatusView = (TuxStatusView) view.findViewById(R.id.e_c)) == null)) {
                com.bytedance.tux.h.i.a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) (this.this$0.f86870h * (1.0f - floatValue))), false, 23);
            }
            return h.z.f158842a;
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f86881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpBodyWidget f86882b;

        static {
            Covode.recordClassIndex(54449);
        }

        m(View view, PdpBodyWidget pdpBodyWidget) {
            this.f86881a = view;
            this.f86882b = pdpBodyWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86882b.l().s;
            if (kVar != null) {
                kVar.b("to_top", (HashMap<String, Object>) null);
            }
            ((RecyclerView) this.f86881a.findViewById(R.id.djj)).d(0);
        }
    }

    @r
    public final void onRefreshPdp(v vVar) {
        String str;
        h.f.b.l.d(vVar, "");
        String str2 = vVar.f86417a;
        ProductPackStruct productPackStruct = l().f86303d;
        if (productPackStruct != null) {
            str = productPackStruct.f86638b;
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) str2, (Object) str)) {
            l().a(false, true);
        }
    }

    public PdpBodyWidget(Fragment fragment) {
        h.f.b.l.d(fragment, "");
        this.f86872j = fragment;
        h.k.c a2 = h.f.b.ab.a(PdpViewModel.class);
        this.f86873l = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public final void a(RecyclerView recyclerView) {
        int i2;
        Float f2;
        String str;
        com.ss.android.ugc.aweme.ecommerce.pdp.d.d dVar;
        com.ss.android.ugc.aweme.ecommerce.pdp.d.d dVar2;
        Price price;
        com.ss.android.ugc.aweme.ecommerce.pdp.d.d dVar3;
        Price price2;
        String priceVal;
        Context context = recyclerView.getContext();
        h.f.b.l.b(context, "");
        float dimension = context.getResources().getDimension(R.dimen.ff);
        int[] iArr = new int[2];
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int k2 = linearLayoutManager.k();
        int m2 = linearLayoutManager.m();
        if (k2 <= m2) {
            while (true) {
                View c2 = linearLayoutManager.c(k2);
                if (c2 != null) {
                    h.f.b.l.b(c2, "");
                    String str2 = null;
                    Object tag = c2.getTag(R.id.abh);
                    if (!(tag instanceof com.ss.android.ugc.aweme.ecommerce.pdp.vh.i)) {
                        tag = null;
                    }
                    com.ss.android.ugc.aweme.ecommerce.pdp.vh.i iVar = (com.ss.android.ugc.aweme.ecommerce.pdp.vh.i) tag;
                    if (iVar != null) {
                        c2.getLocationInWindow(iArr);
                        int i3 = iArr[1];
                        View view = this.f46127e;
                        if (view != null) {
                            i2 = view.getHeight();
                        } else {
                            i2 = 0;
                        }
                        int i4 = (int) (((float) i2) - dimension);
                        if (i3 >= i4 || i3 <= 0) {
                            if (iVar.f86789b) {
                                iVar.f86789b = false;
                            }
                        } else if (!iVar.f86789b) {
                            iVar.f86789b = true;
                            if (iVar.f86788a instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.h) {
                                Object obj = iVar.f86788a;
                                if (!(obj instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.j)) {
                                    obj = null;
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.d.j jVar = (com.ss.android.ugc.aweme.ecommerce.pdp.d.j) obj;
                                if (jVar == null || (dVar3 = jVar.f86474a) == null || (price2 = dVar3.f86449a) == null || (priceVal = price2.getPriceVal()) == null) {
                                    f2 = null;
                                } else {
                                    f2 = p.c(priceVal);
                                }
                                Object obj2 = iVar.f86788a;
                                if (!(obj2 instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.j)) {
                                    obj2 = null;
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.d.j jVar2 = (com.ss.android.ugc.aweme.ecommerce.pdp.d.j) obj2;
                                if (jVar2 == null || (dVar2 = jVar2.f86474a) == null || (price = dVar2.f86449a) == null) {
                                    str = null;
                                } else {
                                    str = price.getCurrency();
                                }
                                Object obj3 = iVar.f86788a;
                                if (!(obj3 instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.j)) {
                                    obj3 = null;
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.d.j jVar3 = (com.ss.android.ugc.aweme.ecommerce.pdp.d.j) obj3;
                                if (!(jVar3 == null || (dVar = jVar3.f86474a) == null)) {
                                    str2 = dVar.f86457i;
                                }
                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = l().s;
                                if (kVar != null) {
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a(kVar, ((com.ss.android.ugc.aweme.ecommerce.pdp.d.h) iVar.f86788a).a(), l().f86301b, f2, str, str2, 16);
                                }
                            } else if (!(iVar.f86788a instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.m) || !h.f.b.l.a((Object) ((com.ss.android.ugc.aweme.ecommerce.pdp.d.m) iVar.f86788a).f86478b, (Object) "title")) {
                                if (iVar.f86788a instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.o) {
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = l().s;
                                    if (kVar2 != null) {
                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a(kVar2, "showcase_detail", l().f86301b, null, null, null, 60);
                                    }
                                } else if (iVar.f86788a instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.g) {
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar3 = l().s;
                                    if (kVar3 != null) {
                                        kVar3.a((com.ss.android.ugc.aweme.ecommerce.pdp.d.g) iVar.f86788a);
                                    }
                                } else if ((iVar.f86788a instanceof ProductDetailReview) || (iVar.f86788a instanceof ReviewItemStruct)) {
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar4 = l().s;
                                    if (kVar4 != null) {
                                        kVar4.a();
                                    }
                                    if (iVar.f86788a instanceof ReviewItemStruct) {
                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar5 = l().s;
                                        if (kVar5 != null) {
                                            kVar5.a((ReviewItemStruct) iVar.f86788a);
                                        }
                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar6 = l().s;
                                        if (kVar6 != null) {
                                            kVar6.b((ReviewItemStruct) iVar.f86788a);
                                        }
                                    }
                                }
                            } else if (i3 < i4 / 2) {
                                iVar.f86789b = true;
                            }
                        }
                    }
                    if (k2 != m2) {
                        k2++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f86875a;

        /* renamed from: b  reason: collision with root package name */
        public int f86876b;

        /* renamed from: c  reason: collision with root package name */
        public int f86877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PdpBodyWidget f86878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f86879e;

        static {
            Covode.recordClassIndex(54432);
        }

        d(PdpBodyWidget pdpBodyWidget, float f2) {
            this.f86878d = pdpBodyWidget;
            this.f86879e = f2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 != this.f86876b && i2 == 0 && this.f86875a) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.f86878d.l().s;
                if (kVar != null) {
                    kVar.c("fulltodetail");
                }
                this.f86875a = false;
            }
            this.f86876b = i2;
            if (i2 == 0) {
                this.f86878d.l().a(recyclerView, (int) this.f86879e, true);
            } else if (i2 != 1) {
                return;
            }
            this.f86878d.l().x = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            this.f86875a = true;
            this.f86877c += i3;
            this.f86878d.l().c(new PdpViewModel.aa(this.f86877c));
            this.f86878d.l().a(recyclerView, (int) this.f86879e, false);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Float, h.z> {
        final /* synthetic */ View $controlBar;

        static {
            Covode.recordClassIndex(54433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(2);
            this.$controlBar = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Float f2) {
            float floatValue = f2.floatValue();
            h.f.b.l.d(iVar, "");
            View view = this.$controlBar;
            if (view != null) {
                view.setAlpha(1.0f - floatValue);
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ z.a $firstSubmit;
        final /* synthetic */ FixedRecyclerView $recyclerView;
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PdpBodyWidget pdpBodyWidget, z.a aVar, FixedRecyclerView fixedRecyclerView) {
            super(2);
            this.this$0 = pdpBodyWidget;
            this.$firstSubmit = aVar;
            this.$recyclerView = fixedRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            if (!list2.isEmpty()) {
                this.this$0.m().a(list2, new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.j.AnonymousClass1 */
                    final /* synthetic */ j this$0;

                    static {
                        Covode.recordClassIndex(54445);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        View view;
                        if (this.this$0.$firstSubmit.element && (view = this.this$0.this$0.f46127e) != null) {
                            view.post(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.j.AnonymousClass1.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f86880a;

                                static {
                                    Covode.recordClassIndex(54446);
                                }

                                {
                                    this.f86880a = r1;
                                }

                                public final void run() {
                                    this.f86880a.this$0.this$0.a((RecyclerView) this.f86880a.this$0.$recyclerView);
                                }
                            });
                        }
                        return h.z.f158842a;
                    }
                });
                this.$firstSubmit.element = false;
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.pdp.d, h.z> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.pdp.d dVar) {
            RecyclerView recyclerView;
            com.bytedance.jedi.arch.i iVar2 = iVar;
            com.ss.android.ugc.aweme.ecommerce.pdp.d dVar2 = dVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(dVar2, "");
            if (dVar2.f86444b) {
                int i2 = dVar2.f86443a;
                if (i2 == 0) {
                    View view = this.this$0.f46127e;
                    if (!(view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.djj)) == null)) {
                        recyclerView.d(0);
                    }
                } else if (i2 == 1) {
                    iVar2.withState(this.this$0.l(), new h.f.a.b<PdpMainState, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.h.AnonymousClass1 */
                        final /* synthetic */ h this$0;

                        static {
                            Covode.recordClassIndex(54439);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(PdpMainState pdpMainState) {
                            View view;
                            RecyclerView recyclerView;
                            PdpMainState pdpMainState2 = pdpMainState;
                            h.f.b.l.d(pdpMainState2, "");
                            Iterator<Object> it = pdpMainState2.getContentList().iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!(it.next() instanceof ProductDetailReview)) {
                                    i2++;
                                } else if (i2 >= 0 && (view = this.this$0.this$0.f46127e) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.djj)) != null) {
                                    recyclerView.d(i2);
                                }
                            }
                            return h.z.f158842a;
                        }
                    });
                } else if (i2 == 2) {
                    iVar2.withState(this.this$0.l(), new h.f.a.b<PdpMainState, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.h.AnonymousClass2 */
                        final /* synthetic */ h this$0;

                        static {
                            Covode.recordClassIndex(54440);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(PdpMainState pdpMainState) {
                            View view;
                            RecyclerView recyclerView;
                            PdpMainState pdpMainState2 = pdpMainState;
                            h.f.b.l.d(pdpMainState2, "");
                            Iterator<Object> it = pdpMainState2.getContentList().iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!(it.next() instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.m)) {
                                    i2++;
                                } else if (i2 >= 0 && (view = this.this$0.this$0.f46127e) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.djj)) != null) {
                                    recyclerView.d(i2);
                                }
                            }
                            return h.z.f158842a;
                        }
                    });
                }
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            Integer num2 = num;
            h.f.b.l.d(iVar, "");
            if (num2 != null && num2.intValue() == 3) {
                androidx.fragment.app.e b2 = com.bytedance.jedi.ext.adapter.b.b(this.this$0);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.lifecycle.i lifecycle = b2.getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a() == i.b.RESUMED) {
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(com.bytedance.jedi.ext.adapter.b.b(this.this$0)).a(R.string.bie).b(R.string.bid), new h.f.a.b<com.bytedance.tux.dialog.b.b, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.i.AnonymousClass1 */
                        final /* synthetic */ i this$0;

                        static {
                            Covode.recordClassIndex(54442);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                            com.bytedance.tux.dialog.b.b bVar2 = bVar;
                            h.f.b.l.d(bVar2, "");
                            bVar2.a(R.string.fy8, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                                /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.i.AnonymousClass1.AnonymousClass1 */
                                final /* synthetic */ AnonymousClass1 this$0;

                                static {
                                    Covode.recordClassIndex(54443);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                    h.f.b.l.d(aVar, "");
                                    if (this.this$0.this$0.this$0.l().s != null) {
                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k.b((Map<String, ? extends Object>) null);
                                    }
                                    return h.z.f158842a;
                                }
                            });
                            return h.z.f158842a;
                        }
                    }).a().b().show();
                    if (this.this$0.l().s != null) {
                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a((Map<String, ? extends Object>) null);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PdpBodyWidget pdpBodyWidget) {
            super(2);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            TuxStatusView tuxStatusView;
            TuxStatusView tuxStatusView2;
            TuxStatusView tuxStatusView3;
            TuxStatusView tuxStatusView4;
            TuxStatusView tuxStatusView5;
            TuxStatusView tuxStatusView6;
            TuxStatusView tuxStatusView7;
            TuxStatusView tuxStatusView8;
            TuxStatusView tuxStatusView9;
            TuxStatusView tuxStatusView10;
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            View view = this.this$0.f46127e;
            if (!(view == null || (tuxStatusView10 = (TuxStatusView) view.findViewById(R.id.e_c)) == null)) {
                com.bytedance.tux.h.i.a((View) tuxStatusView10, (Integer) null, Integer.valueOf((int) this.this$0.f86871i), (Integer) null, (Integer) null, false, 29);
            }
            if (intValue == -1) {
                View view2 = this.this$0.f46127e;
                if (!(view2 == null || (tuxStatusView = (TuxStatusView) view2.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView.setVisibility(8);
                }
            } else if (intValue == 0) {
                View view3 = this.this$0.f46127e;
                if (!(view3 == null || (tuxStatusView3 = (TuxStatusView) view3.findViewById(R.id.e_c)) == null)) {
                    com.bytedance.tux.h.i.a((View) tuxStatusView3, (Integer) null, (Integer) 0, (Integer) null, (Integer) null, false, 29);
                }
                View view4 = this.this$0.f46127e;
                if (!(view4 == null || (tuxStatusView2 = (TuxStatusView) view4.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView2.a();
                }
            } else if (intValue == 2) {
                View view5 = this.this$0.f46127e;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                View view6 = this.this$0.f46127e;
                if (!(view6 == null || (tuxStatusView4 = (TuxStatusView) view6.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView4.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.a(true, new h.f.a.a<h.z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.g.AnonymousClass1 */
                        final /* synthetic */ g this$0;

                        static {
                            Covode.recordClassIndex(54436);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            this.this$0.this$0.l().g();
                            return h.z.f158842a;
                        }
                    }));
                }
            } else if (intValue == 3) {
                View view7 = this.this$0.f46127e;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
                View view8 = this.this$0.f46127e;
                if (!(view8 == null || (tuxStatusView5 = (TuxStatusView) view8.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView5.setStatus(com.ss.android.ugc.aweme.ecommerce.util.j.b(true, new h.f.a.a<h.z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget.g.AnonymousClass2 */
                        final /* synthetic */ g this$0;

                        static {
                            Covode.recordClassIndex(54437);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            this.this$0.this$0.l().g();
                            return h.z.f158842a;
                        }
                    }));
                }
            } else if (intValue == 4) {
                View view9 = this.this$0.f46127e;
                if (!(view9 == null || (tuxStatusView7 = (TuxStatusView) view9.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView7.setVisibility(0);
                }
                View view10 = this.this$0.f46127e;
                if (!(view10 == null || (tuxStatusView6 = (TuxStatusView) view10.findViewById(R.id.e_c)) == null)) {
                    TuxStatusView.c cVar = new TuxStatusView.c();
                    String string = com.bytedance.jedi.ext.adapter.b.b(this.this$0).getString(R.string.bhd);
                    h.f.b.l.b(string, "");
                    cVar.a(string);
                    String string2 = com.bytedance.jedi.ext.adapter.b.b(this.this$0).getString(R.string.bhc);
                    h.f.b.l.b(string2, "");
                    cVar.a((CharSequence) string2);
                    cVar.a(0, R.drawable.yx);
                    tuxStatusView6.setStatus(cVar);
                }
            } else if (intValue == 5) {
                View view11 = this.this$0.f46127e;
                if (!(view11 == null || (tuxStatusView9 = (TuxStatusView) view11.findViewById(R.id.e_c)) == null)) {
                    tuxStatusView9.setVisibility(0);
                }
                View view12 = this.this$0.f46127e;
                if (!(view12 == null || (tuxStatusView8 = (TuxStatusView) view12.findViewById(R.id.e_c)) == null)) {
                    TuxStatusView.c cVar2 = new TuxStatusView.c();
                    String string3 = com.bytedance.jedi.ext.adapter.b.b(this.this$0).getString(R.string.bhf);
                    h.f.b.l.b(string3, "");
                    cVar2.a(string3);
                    String string4 = com.bytedance.jedi.ext.adapter.b.b(this.this$0).getString(R.string.bhe);
                    h.f.b.l.b(string4, "");
                    cVar2.a((CharSequence) string4);
                    cVar2.a(0, R.drawable.z6);
                    tuxStatusView8.setStatus(cVar2);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Float, Integer, h.z> {
        final /* synthetic */ FixedRecyclerView $recyclerView;
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PdpBodyWidget pdpBodyWidget, FixedRecyclerView fixedRecyclerView) {
            super(3);
            this.this$0 = pdpBodyWidget;
            this.$recyclerView = fixedRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Float f2, Integer num) {
            f2.floatValue();
            num.intValue();
            h.f.b.l.d(iVar, "");
            this.this$0.a((RecyclerView) this.$recyclerView);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Integer, ProductDetailReview, h.z> {
        final /* synthetic */ PdpBodyWidget this$0;

        static {
            Covode.recordClassIndex(54447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PdpBodyWidget pdpBodyWidget) {
            super(3);
            this.this$0 = pdpBodyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num, ProductDetailReview productDetailReview) {
            CardView cardView;
            CardView cardView2;
            List<ReviewItemStruct> list;
            CardView cardView3;
            int intValue = num.intValue();
            ProductDetailReview productDetailReview2 = productDetailReview;
            h.f.b.l.d(iVar, "");
            if (productDetailReview2 != null && (list = productDetailReview2.f86632c) != null && (!list.isEmpty())) {
                View view = this.this$0.f46127e;
                if (!(view == null || (cardView3 = (CardView) view.findViewById(R.id.eo8)) == null)) {
                    cardView3.setVisibility(8);
                }
            } else if (intValue < com.ss.android.ugc.aweme.ecommerce.util.h.f87568b) {
                View view2 = this.this$0.f46127e;
                if (!(view2 == null || (cardView2 = (CardView) view2.findViewById(R.id.eo8)) == null)) {
                    cardView2.setVisibility(8);
                }
            } else {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.l().s;
                if (kVar != null) {
                    kVar.a("to_top", (HashMap<String, Object>) null);
                }
                View view3 = this.this$0.f46127e;
                if (!(view3 == null || (cardView = (CardView) view3.findViewById(R.id.eo8)) == null)) {
                    cardView.setVisibility(0);
                }
            }
            return h.z.f158842a;
        }
    }
}
