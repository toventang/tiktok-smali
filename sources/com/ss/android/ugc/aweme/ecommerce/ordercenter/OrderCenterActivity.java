package com.ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.event.Logger;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.EntranceData;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.List;
import org.json.JSONObject;

public final class OrderCenterActivity extends com.ss.android.ugc.aweme.ecommerce.common.b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f86156f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f86157a = SystemClock.uptimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public long f86158b;

    /* renamed from: c  reason: collision with root package name */
    public long f86159c;

    /* renamed from: d  reason: collision with root package name */
    public long f86160d;

    /* renamed from: e  reason: collision with root package name */
    public e f86161e;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f86162h;

    static final class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f86177e = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final Logger f86178a;

        /* renamed from: b  reason: collision with root package name */
        public OrderCenterAdapter f86179b;

        /* renamed from: c  reason: collision with root package name */
        public RtlViewPager f86180c;

        /* renamed from: d  reason: collision with root package name */
        public TuxNavBar f86181d;
        private final h.h o;
        private final h.h p;
        private final h.h q;
        private IEventCenter.b r;

        static {
            Covode.recordClassIndex(53920);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(53921);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final Logger c() {
            return this.f86178a;
        }

        static final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DmtTabLayout f86183a;

            static {
                Covode.recordClassIndex(53927);
            }

            e(DmtTabLayout dmtTabLayout) {
                this.f86183a = dmtTabLayout;
            }

            public final void run() {
                DmtTabLayout dmtTabLayout = this.f86183a;
                l.b(dmtTabLayout, "");
                com.bytedance.ies.dmt.ui.widget.tablayout.b.a(dmtTabLayout);
            }
        }

        public final OrderCenterAdapter b() {
            OrderCenterAdapter orderCenterAdapter = this.f86179b;
            if (orderCenterAdapter == null) {
                l.a("adapter");
            }
            return orderCenterAdapter;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final void e() {
            super.e();
            this.f86186f.f86157a = 0;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final x f() {
            x xVar = new x(0, false, false, 7);
            xVar.f65561g = R.color.nd;
            xVar.f65555a = true;
            return xVar;
        }

        static final class b extends m implements h.f.a.a<com.bytedance.tux.navigation.a.b> {
            final /* synthetic */ OrderCenterActivity $context;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(53922);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar, OrderCenterActivity orderCenterActivity) {
                super(0);
                this.this$0 = dVar;
                this.$context = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.bytedance.tux.navigation.a.b invoke() {
                com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr);
                a2.f45194b = true;
                return a2.a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.d.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(53923);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.$context.onBackPressed();
                        Logger logger = this.this$0.this$0.f86178a;
                        OrderCenterAdapter.c a2 = this.this$0.this$0.b().a();
                        l.d(a2, "");
                        new com.ss.android.ugc.aweme.ecommerce.ordercenter.event.d().a(logger.f86227a).b(a2.f86210b).c(a2.f86212d).d("back").d();
                        return z.f158842a;
                    }
                });
            }
        }

        static final class c extends m implements h.f.a.a<com.bytedance.tux.navigation.a.b> {
            final /* synthetic */ OrderCenterActivity $context;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(53924);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(d dVar, OrderCenterActivity orderCenterActivity) {
                super(0);
                this.this$0 = dVar;
                this.$context = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.bytedance.tux.navigation.a.b invoke() {
                com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_3_lines_horizontal_2);
                a2.f45194b = true;
                return a2.a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.d.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(53925);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        Logger logger = this.this$0.this$0.f86178a;
                        OrderCenterAdapter.c a2 = this.this$0.this$0.b().a();
                        l.d(a2, "");
                        new com.ss.android.ugc.aweme.ecommerce.ordercenter.event.d().a(logger.f86227a).b(a2.f86210b).c(a2.f86212d).d("more").d();
                        androidx.fragment.app.i supportFragmentManager = this.this$0.$context.getSupportFragmentManager();
                        l.b(supportFragmentManager, "");
                        if (!supportFragmentManager.g() && !supportFragmentManager.h()) {
                            new b().show(supportFragmentManager, "");
                        }
                        return z.f158842a;
                    }
                });
            }
        }

        static final class g extends m implements h.f.a.a<com.bytedance.tux.navigation.a.g> {
            final /* synthetic */ OrderCenterActivity $context;

            static {
                Covode.recordClassIndex(53929);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(OrderCenterActivity orderCenterActivity) {
                super(0);
                this.$context = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.bytedance.tux.navigation.a.g invoke() {
                com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
                String string = this.$context.getString(R.string.fx3);
                l.b(string, "");
                return gVar.a(string);
            }
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final int d() {
            OrderCenterAdapter orderCenterAdapter = this.f86179b;
            if (orderCenterAdapter == null) {
                l.a("adapter");
            }
            DmtTabLayout dmtTabLayout = orderCenterAdapter.f86189a;
            l.b(dmtTabLayout, "");
            return dmtTabLayout.getSelectedTabPosition();
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final void g() {
            super.g();
            RtlViewPager rtlViewPager = this.f86180c;
            if (rtlViewPager == null) {
                l.a("viewPager");
            }
            rtlViewPager.setOffscreenPageLimit(2);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final void h() {
            super.h();
            IEventCenter.b bVar = this.r;
            if (bVar != null) {
                IEventCenter a2 = EventCenter.a();
                a2.b("ec_order_list_api_duration", bVar);
                a2.b("ec_order_center_tab_change", bVar);
                this.r = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r0 == null) goto L_0x002b;
         */
        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 332
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.d.a():void");
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$d  reason: collision with other inner class name */
        static final class C2075d<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f86182a;

            static {
                Covode.recordClassIndex(53926);
            }

            C2075d(d dVar) {
                this.f86182a = dVar;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                boolean z;
                List list = (List) obj;
                d dVar = this.f86182a;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.a(!z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity);
            l.d(orderCenterActivity, "");
            androidx.lifecycle.i lifecycle = orderCenterActivity.getLifecycle();
            l.b(lifecycle, "");
            this.f86178a = new Logger(lifecycle);
            this.o = h.i.a((h.f.a.a) new b(this, orderCenterActivity));
            this.p = h.i.a((h.f.a.a) new g(orderCenterActivity));
            this.q = h.i.a((h.f.a.a) new c(this, orderCenterActivity));
            this.r = new f(this, orderCenterActivity);
        }

        public final void a(boolean z) {
            TuxNavBar tuxNavBar = this.f86181d;
            if (tuxNavBar == null) {
                l.a("titlebar");
            }
            TuxNavBar.a a2 = new TuxNavBar.a().a((com.bytedance.tux.navigation.a.b) this.o.getValue()).a((com.bytedance.tux.navigation.a.g) this.p.getValue());
            if (z) {
                a2.b((com.bytedance.tux.navigation.a.b) this.q.getValue());
            }
            tuxNavBar.setNavActions(a2);
        }

        public static final class f implements IEventCenter.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f86184a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OrderCenterActivity f86185b;

            static {
                Covode.recordClassIndex(53928);
            }

            f(d dVar, OrderCenterActivity orderCenterActivity) {
                this.f86184a = dVar;
                this.f86185b = orderCenterActivity;
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
            public final void a(String str, String str2) {
                l.d(str, "");
                l.d(str2, "");
                int hashCode = str.hashCode();
                if (hashCode != -604111672) {
                    if (hashCode == 671715954 && str.equals("ec_order_center_tab_change")) {
                        try {
                            Integer valueOf = Integer.valueOf(new JSONObject(str2).getInt("tab"));
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                RtlViewPager rtlViewPager = this.f86184a.f86180c;
                                if (rtlViewPager == null) {
                                    l.a("viewPager");
                                }
                                rtlViewPager.setCurrentItem(intValue);
                            }
                        } catch (Throwable th) {
                            com.bytedance.services.apm.api.a.a(th);
                        }
                    }
                } else if (str.equals("ec_order_list_api_duration")) {
                    if (this.f86185b.f86157a > 0) {
                        this.f86185b.f86160d = SystemClock.uptimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", this.f86185b.f86160d - this.f86185b.f86157a);
                        jSONObject.put("native_load_duration", this.f86185b.f86158b - this.f86185b.f86157a);
                        jSONObject.put("h5_load_duration", this.f86185b.f86159c - this.f86185b.f86158b);
                        try {
                            Long valueOf2 = Long.valueOf(new JSONObject(str2).getLong("duration"));
                            if (valueOf2 != null) {
                                jSONObject.put("h5_api_duration", valueOf2.longValue());
                            }
                        } catch (Throwable th2) {
                            com.bytedance.services.apm.api.a.a(th2);
                        }
                        r.a("rd_tiktokec_anchor_order_center_duration", jSONObject);
                    }
                    EventCenter.a().b("ec_order_list_api_duration", this);
                }
            }
        }
    }

    static final class i extends m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ OrderCenterActivity this$0;

        static {
            Covode.recordClassIndex(53934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(OrderCenterActivity orderCenterActivity) {
            super(1);
            this.this$0 = orderCenterActivity;
        }

        static final class a extends m implements h.f.a.a<com.bytedance.ies.foundation.base.a> {
            final /* synthetic */ x $it;

            static {
                Covode.recordClassIndex(53936);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(x xVar) {
                super(0);
                this.$it = xVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                return this.$it;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            x f2;
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f86187a);
            e eVar = this.this$0.f86161e;
            if (!(eVar == null || (f2 = eVar.f()) == null)) {
                baseActivityViewModel2.config(new a(f2));
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(53912);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f86162h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f86162h == null) {
            this.f86162h = new SparseArray();
        }
        View view = (View) this.f86162h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86162h.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53913);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.android.material.bottomsheet.b {

        /* renamed from: a  reason: collision with root package name */
        private Logger f86163a;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f86164b;

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b  reason: collision with other inner class name */
        public static final class C2073b extends RecyclerView.ViewHolder {

            /* renamed from: e  reason: collision with root package name */
            public static final a f86168e = new a((byte) 0);

            /* renamed from: a  reason: collision with root package name */
            final View f86169a;

            /* renamed from: b  reason: collision with root package name */
            final SmartImageView f86170b;

            /* renamed from: c  reason: collision with root package name */
            final TuxTextView f86171c;

            /* renamed from: d  reason: collision with root package name */
            public final a f86172d;

            static {
                Covode.recordClassIndex(53916);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b$a */
            public static final class a {
                static {
                    Covode.recordClassIndex(53917);
                }

                private a() {
                }

                public /* synthetic */ a(byte b2) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b$b  reason: collision with other inner class name */
            static final class View$OnClickListenerC2074b implements View.OnClickListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2073b f86173a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f86174b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f86175c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f86176d;

                static {
                    Covode.recordClassIndex(53918);
                }

                View$OnClickListenerC2074b(C2073b bVar, String str, String str2, String str3) {
                    this.f86173a = bVar;
                    this.f86174b = str;
                    this.f86175c = str2;
                    this.f86176d = str3;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof Activity)) {
                        context = view.getContext();
                    }
                    SmartRouter.buildRoute(context, this.f86174b).withParam("trackParams", dg.a().b(ag.c(new p("previous_page", "ecommerce_centre_page")))).open();
                    this.f86173a.f86172d.f86165a.dismiss();
                    Logger logger = this.f86173a.f86172d.f86166b;
                    if (logger != null) {
                        String str = this.f86175c;
                        String str2 = this.f86176d;
                        l.d(str, "");
                        l.d(str2, "");
                        com.ss.android.ugc.aweme.ecommerce.ordercenter.event.c a2 = new com.ss.android.ugc.aweme.ecommerce.ordercenter.event.a().a(logger.f86227a);
                        l.d(str, "");
                        a2.f87523k.put("action_sheet_for", str);
                        l.d(str2, "");
                        a2.f87523k.put("action_sheet_for_key", str2);
                        a2.d();
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2073b(a aVar, View view) {
                super(view);
                l.d(aVar, "");
                l.d(view, "");
                this.f86172d = aVar;
                View findViewById = view.findViewById(R.id.ax8);
                l.b(findViewById, "");
                this.f86169a = findViewById;
                View findViewById2 = view.findViewById(R.id.ax6);
                l.b(findViewById2, "");
                this.f86170b = (SmartImageView) findViewById2;
                View findViewById3 = view.findViewById(R.id.ax_);
                l.b(findViewById3, "");
                this.f86171c = (TuxTextView) findViewById3;
            }
        }

        static {
            Covode.recordClassIndex(53914);
        }

        private View a() {
            if (this.f86164b == null) {
                this.f86164b = new SparseArray();
            }
            View view = (View) this.f86164b.get(R.id.djs);
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(R.id.djs);
            this.f86164b.put(R.id.djs, findViewById);
            return findViewById;
        }

        public static final class a extends RecyclerView.a<C2073b> {

            /* renamed from: a  reason: collision with root package name */
            final com.google.android.material.bottomsheet.b f86165a;

            /* renamed from: b  reason: collision with root package name */
            public final Logger f86166b;

            /* renamed from: c  reason: collision with root package name */
            private final List<EntranceData> f86167c;

            static {
                Covode.recordClassIndex(53915);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ C2073b onCreateViewHolder(ViewGroup viewGroup, int i2) {
                return a(this, viewGroup, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final int getItemCount() {
                return this.f86167c.size();
            }

            public a(com.google.android.material.bottomsheet.b bVar, Logger logger) {
                l.d(bVar, "");
                this.f86165a = bVar;
                this.f86166b = logger;
                List<EntranceData> value = ((OrderTabViewModel) ae.a(bVar, (ad.b) null).a(OrderTabViewModel.class)).f86258b.getValue();
                this.f86167c = value == null ? h.a.z.INSTANCE : value;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final /* synthetic */ void onBindViewHolder(C2073b bVar, int i2) {
                Image icon;
                com.bytedance.lighten.a.a.a imageUrlModel;
                C2073b bVar2 = bVar;
                l.d(bVar2, "");
                EntranceData entranceData = this.f86167c.get(i2);
                l.d(entranceData, "");
                Icon icon2 = entranceData.getIcon();
                if (!(icon2 == null || (icon = icon2.getIcon()) == null || (imageUrlModel = icon.toImageUrlModel()) == null)) {
                    v a2 = com.bytedance.lighten.a.r.a(imageUrlModel);
                    a2.f39916l = R.drawable.z2;
                    a2.v = w.CENTER_CROP;
                    a2.F = bVar2.f86170b;
                    a2.c();
                }
                bVar2.f86171c.setText(entranceData.getText());
                View view = bVar2.f86169a;
                String schema = entranceData.getSchema();
                String text = entranceData.getText();
                String key = entranceData.getKey();
                if (view != null) {
                    view.setOnClickListener(new C2073b.View$OnClickListenerC2074b(bVar2, schema, text, key));
                }
            }

            private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
                boolean a2;
                MethodCollector.i(6160);
                l.d(viewGroup, "");
                if (aVar.f86167c.isEmpty()) {
                    aVar.f86165a.dismiss();
                }
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ox, viewGroup, false);
                l.b(a3, "");
                C2073b bVar = new C2073b(aVar, a3);
                try {
                    if (bVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(bVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = bVar.getClass().getName();
                MethodCollector.o(6160);
                return bVar;
            }
        }

        @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            SparseArray sparseArray = this.f86164b;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }

        @Override // androidx.fragment.app.d, com.google.android.material.bottomsheet.b, androidx.appcompat.app.i
        public final Dialog onCreateDialog(Bundle bundle) {
            Logger logger;
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && (activity instanceof OrderCenterActivity)) {
                e eVar = ((OrderCenterActivity) activity).f86161e;
                if (eVar != null) {
                    logger = eVar.c();
                } else {
                    logger = null;
                }
                this.f86163a = logger;
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            return new com.ss.android.ugc.aweme.ecommerce.common.a.d(activity2);
        }

        @Override // androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            Drawable drawable;
            Resources.Theme theme;
            l.d(view, "");
            super.onViewCreated(view, bundle);
            RecyclerView recyclerView = (RecyclerView) a();
            l.b(recyclerView, "");
            recyclerView.setAdapter(new a(this, this.f86163a));
            RecyclerView recyclerView2 = (RecyclerView) a();
            l.b(recyclerView2, "");
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            if (Build.VERSION.SDK_INT >= 24) {
                Resources resources = view.getResources();
                Context context = getContext();
                if (context != null) {
                    theme = context.getTheme();
                } else {
                    theme = null;
                }
                drawable = resources.getDrawable(R.drawable.yj, theme);
            } else {
                drawable = view.getResources().getDrawable(R.drawable.yj);
            }
            if (drawable != null) {
                ((RecyclerView) a()).a(new com.ss.android.ugc.aweme.ecommerce.ordercenter.view.a(drawable));
            }
            Logger logger = this.f86163a;
            if (logger != null) {
                new com.ss.android.ugc.aweme.ecommerce.ordercenter.event.b().a(logger.f86227a).d();
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            l.d(layoutInflater, "");
            return com.a.a(layoutInflater, R.layout.ow, viewGroup, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ OrderCenterActivity this$0;

        static {
            Covode.recordClassIndex(53931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.this$0 = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            OrderCenterActivity.super.onBackPressed();
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m> {
        final /* synthetic */ OrderCenterActivity this$0;

        static {
            Covode.recordClassIndex(53932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.this$0 = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
            return new d(this.this$0);
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m> {
        final /* synthetic */ OrderCenterActivity this$0;

        static {
            Covode.recordClassIndex(53933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.this$0 = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
            return new c(this.this$0);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // androidx.fragment.app.e
    public final void onLowMemory() {
        super.onLowMemory();
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.g();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.e();
        }
    }

    static final class c extends e {
        static {
            Covode.recordClassIndex(53919);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.e
        public final void a() {
            Window window;
            androidx.fragment.app.e eVar = this.f87188l;
            if (!(eVar == null || (window = eVar.getWindow()) == null)) {
                window.addFlags(67108864);
            }
            androidx.fragment.app.e eVar2 = this.f87188l;
            if (eVar2 != null) {
                eVar2.setContentView(i());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity);
            l.d(orderCenterActivity, "");
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.a(new f(this));
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class e extends com.ss.android.ugc.aweme.ecommerce.router.m {

        /* renamed from: f  reason: collision with root package name */
        public final OrderCenterActivity f86186f;

        static {
            Covode.recordClassIndex(53930);
        }

        public abstract void a();

        public Logger c() {
            return null;
        }

        public int d() {
            return 0;
        }

        public void e() {
        }

        public x f() {
            return null;
        }

        public void g() {
        }

        public void h() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity, null, 2);
            l.d(orderCenterActivity, "");
            this.f86186f = orderCenterActivity;
            this.f87186j = false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onRestoreInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.a(this, bundle);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.b(this, bundle);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onCreate", true);
        this.f86161e = (e) com.ss.android.ugc.aweme.ecommerce.router.i.a(StrategyService.b().a().a(new g(this)).b(new h(this)), getIntent().getData());
        activityConfiguration(new i(this));
        super.onCreate(bundle);
        e eVar = this.f86161e;
        if (eVar != null) {
            eVar.a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onCreate", false);
    }
}
