package com.ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.m;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.event.Logger;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderListTabInfo;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.view.TEIgnoreAbleFrameLayout;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class OrderCenterAdapter extends m implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f86188c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final DmtTabLayout f86189a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f86190b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f86191d = true;

    /* renamed from: e  reason: collision with root package name */
    private String f86192e;

    /* renamed from: f  reason: collision with root package name */
    private final e f86193f;

    /* renamed from: g  reason: collision with root package name */
    private final Logger f86194g;

    static {
        Covode.recordClassIndex(53937);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        return -2;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        }
    }

    static final class a {
        static {
            Covode.recordClassIndex(53940);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f86190b.size();
    }

    public static final class b extends com.ss.android.ugc.aweme.base.f.a {

        /* renamed from: a  reason: collision with root package name */
        int f86197a = -1;

        /* renamed from: b  reason: collision with root package name */
        public TEIgnoreAbleFrameLayout f86198b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f86199c;

        /* renamed from: d  reason: collision with root package name */
        AppCompatImageView f86200d;

        /* renamed from: e  reason: collision with root package name */
        TuxTextView f86201e;

        /* renamed from: j  reason: collision with root package name */
        TuxTextView f86202j;

        /* renamed from: k  reason: collision with root package name */
        public BulletContainerView f86203k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f86204l;

        /* renamed from: m  reason: collision with root package name */
        private BulletActivityWrapper f86205m;
        private boolean n;
        private boolean o;
        private SparseArray p;

        static {
            Covode.recordClassIndex(53941);
        }

        public final void a() {
            com.bytedance.ies.bullet.c.e.a.b providerFactory;
            BulletContainerView bulletContainerView = this.f86203k;
            if (bulletContainerView != null) {
                bulletContainerView.a();
            }
            BulletContainerView bulletContainerView2 = this.f86203k;
            if (!(bulletContainerView2 == null || (providerFactory = bulletContainerView2.getProviderFactory()) == null)) {
                providerFactory.a();
            }
            this.f86203k = null;
        }

        @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
        public final void onDestroyView() {
            super.onDestroyView();
            a();
            this.n = false;
            this.o = false;
            SparseArray sparseArray = this.p;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }

        private final void b() {
            String str;
            if (this.n && !this.o && getUserVisibleHint()) {
                this.o = true;
                BulletContainerView bulletContainerView = this.f86203k;
                if (bulletContainerView != null) {
                    Uri.Builder encodedAuthority = new Uri.Builder().scheme("bullet").encodedAuthority("bullet");
                    Bundle arguments = getArguments();
                    if (arguments == null || (str = arguments.getString("order_list_url")) == null) {
                        str = "https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_list/index.html";
                    }
                    Uri build = encodedAuthority.appendQueryParameter("url", str).build();
                    e activity = getActivity();
                    if (activity instanceof OrderCenterActivity) {
                        OrderCenterActivity orderCenterActivity = (OrderCenterActivity) activity;
                        if (orderCenterActivity.f86158b == 0) {
                            orderCenterActivity.f86158b = SystemClock.uptimeMillis();
                        }
                    }
                    l.b(build, "");
                    h.a.a(bulletContainerView, build, null, new a(this), 2);
                }
            }
        }

        public static final class a implements h.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f86206a;

            static {
                Covode.recordClassIndex(53942);
            }

            @Override // com.bytedance.ies.bullet.ui.common.h.b
            public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
                l.d(iVar, "");
                l.d(uri, "");
                l.d(qVar, "");
            }

            @Override // com.bytedance.ies.bullet.ui.common.h.b
            public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
                l.d(list, "");
                l.d(uri, "");
                l.d(iVar, "");
            }

            a(b bVar) {
                this.f86206a = bVar;
            }

            @Override // com.bytedance.ies.bullet.ui.common.h.b
            public final void a(Uri uri) {
                l.d(uri, "");
                this.f86206a.f86204l = true;
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
            @Override // com.bytedance.ies.bullet.ui.common.h.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(android.net.Uri r6, java.lang.Throwable r7) {
                /*
                // Method dump skipped, instructions count: 163
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.b.a.a(android.net.Uri, java.lang.Throwable):void");
            }

            @Override // com.bytedance.ies.bullet.ui.common.h.b
            public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
                l.d(view, "");
                l.d(uri, "");
                l.d(iVar, "");
                this.f86206a.f86204l = false;
                ViewGroup viewGroup = this.f86206a.f86199c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                TEIgnoreAbleFrameLayout tEIgnoreAbleFrameLayout = this.f86206a.f86198b;
                if (tEIgnoreAbleFrameLayout != null) {
                    tEIgnoreAbleFrameLayout.setTouchEventDisable(false);
                }
                e activity = this.f86206a.getActivity();
                if (activity instanceof OrderCenterActivity) {
                    OrderCenterActivity orderCenterActivity = (OrderCenterActivity) activity;
                    if (orderCenterActivity.f86159c == 0) {
                        orderCenterActivity.f86159c = SystemClock.uptimeMillis();
                    }
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void setUserVisibleHint(boolean z) {
            super.setUserVisibleHint(z);
            if (z) {
                b();
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f86208a;

            static {
                Covode.recordClassIndex(53944);
            }

            c(b bVar) {
                this.f86208a = bVar;
            }

            public final void onClick(View view) {
                BulletContainerView bulletContainerView;
                ClickAgent.onClick(view);
                if (!this.f86208a.f86204l && (bulletContainerView = this.f86208a.f86203k) != null) {
                    bulletContainerView.b();
                }
            }
        }

        @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
        public final void onActivityCreated(Bundle bundle) {
            e activity;
            super.onActivityCreated(bundle);
            BulletActivityWrapper bulletActivityWrapper = this.f86205m;
            if (bulletActivityWrapper != null && (activity = getActivity()) != null && (activity instanceof e)) {
                bulletActivityWrapper.c(activity, bundle);
            }
        }

        @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            e activity;
            l.d(bundle, "");
            super.onSaveInstanceState(bundle);
            BulletActivityWrapper bulletActivityWrapper = this.f86205m;
            if (bulletActivityWrapper != null && (activity = getActivity()) != null && (activity instanceof e)) {
                bulletActivityWrapper.b(activity, bundle);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$b$b  reason: collision with other inner class name */
        public static final class C2076b extends BulletActivityWrapper {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f86207a;

            static {
                Covode.recordClassIndex(53943);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2076b(e eVar, Activity activity) {
                super(activity);
                this.f86207a = eVar;
            }
        }

        @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i2;
            l.d(layoutInflater, "");
            Bundle arguments = getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("tab_position");
            } else {
                i2 = -1;
            }
            this.f86197a = i2;
            View a2 = com.a.a(layoutInflater, R.layout.oy, viewGroup, false);
            this.f86198b = (TEIgnoreAbleFrameLayout) a2.findViewById(R.id.epu);
            BulletContainerView bulletContainerView = (BulletContainerView) a2.findViewById(R.id.a0n);
            this.f86203k = bulletContainerView;
            if (bulletContainerView != null) {
                e activity = getActivity();
                if (activity instanceof e) {
                    C2076b bVar = new C2076b(activity, activity);
                    bVar.a((androidx.lifecycle.m) activity);
                    this.f86205m = bVar;
                }
                bulletContainerView.a(BulletService.f().a());
                BulletActivityWrapper bulletActivityWrapper = this.f86205m;
                if (bulletActivityWrapper != null) {
                    bulletContainerView.setActivityWrapper(bulletActivityWrapper);
                }
                IBulletService f2 = BulletService.f();
                Context context = bulletContainerView.getContext();
                l.b(context, "");
                bulletContainerView.a(f2.a(context), 17, 0, 0, 0, 0);
            }
            this.f86199c = (ViewGroup) a2.findViewById(R.id.chd);
            this.f86200d = (AppCompatImageView) a2.findViewById(R.id.bm4);
            this.f86201e = (TuxTextView) a2.findViewById(R.id.text);
            this.f86202j = (TuxTextView) a2.findViewById(R.id.ej0);
            a2.findViewById(R.id.dmf).setOnClickListener(new c(this));
            this.n = true;
            b();
            l.b(a2, "");
            return a2;
        }
    }

    public final c a() {
        ArrayList<c> arrayList = this.f86190b;
        DmtTabLayout dmtTabLayout = this.f86189a;
        l.b(dmtTabLayout, "");
        c cVar = arrayList.get(dmtTabLayout.getSelectedTabPosition());
        l.b(cVar, "");
        return cVar;
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f86191d) {
            this.f86191d = false;
            return;
        }
        DmtTabLayout dmtTabLayout = this.f86189a;
        l.b(dmtTabLayout, "");
        a(dmtTabLayout.b(dmtTabLayout.getSelectedTabPosition()));
    }

    private final void c() {
        ac a2 = ae.a(this.f86193f, (ad.b) null).a(OrderTabViewModel.class);
        l.b(a2, "");
        OrderTabViewModel orderTabViewModel = (OrderTabViewModel) a2;
        z.e eVar = new z.e();
        eVar.element = (T) orderTabViewModel.f86259c.getValue();
        this.f86190b.addAll(a((List<OrderListTabInfo>) eVar.element));
        orderTabViewModel.f86259c.observe(this.f86193f, new d(this, eVar));
    }

    private final List<c> d() {
        int ordinal = com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.ALL.ordinal();
        String string = this.f86193f.getString(R.string.fx4);
        l.b(string, "");
        int ordinal2 = com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.TO_PAY.ordinal();
        String string2 = this.f86193f.getString(R.string.fxw);
        l.b(string2, "");
        int ordinal3 = com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.TO_SHIP.ordinal();
        String string3 = this.f86193f.getString(R.string.fxv);
        l.b(string3, "");
        int ordinal4 = com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.SHIPPED.ordinal();
        String string4 = this.f86193f.getString(R.string.fxs);
        l.b(string4, "");
        int ordinal5 = com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.COMPLETED.ordinal();
        String string5 = this.f86193f.getString(R.string.fx6);
        l.b(string5, "");
        return n.b(new c(ordinal, string, b(com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.ALL.ordinal()), "all", (byte) 0), new c(ordinal2, string2, b(com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.TO_PAY.ordinal()), "to_pay", (byte) 0), new c(ordinal3, string3, b(com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.TO_SHIP.ordinal()), "to_ship", (byte) 0), new c(ordinal4, string4, b(com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.SHIPPED.ordinal()), "shipped", (byte) 0), new c(ordinal5, string5, b(com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.a.COMPLETED.ordinal()), "completed", (byte) 0));
    }

    public final int b() {
        String queryParameter;
        Integer e2;
        Intent intent = this.f86193f.getIntent();
        l.b(intent, "");
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter("tab_type")) == null || (e2 = p.e(queryParameter)) == null) {
            return 0;
        }
        for (T t : this.f86190b) {
            if (t.f86209a == e2.intValue()) {
                return this.f86190b.indexOf(t);
            }
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f86190b.get(i2).f86210b;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderCenterAdapter f86214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f86215b;

        static {
            Covode.recordClassIndex(53946);
        }

        d(OrderCenterAdapter orderCenterAdapter, z.e eVar) {
            this.f86214a = orderCenterAdapter;
            this.f86215b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((List) obj);
            if (t != this.f86215b.element) {
                this.f86214a.f86190b.clear();
                this.f86214a.f86190b.addAll(this.f86214a.a((List<OrderListTabInfo>) t));
                this.f86215b.element = t;
                this.f86214a.notifyDataSetChanged();
            }
        }
    }

    public final void a(DmtTabLayout.f fVar) {
        if (fVar != null) {
            IEventCenter a2 = EventCenter.a();
            String jSONObject = new JSONObject().put("tab_type", this.f86190b.get(fVar.f33752e).f86209a).toString();
            l.b(jSONObject, "");
            a2.a("ec_order_center_tab_clicked", jSONObject);
            Logger logger = this.f86194g;
            c cVar = this.f86190b.get(fVar.f33752e);
            l.b(cVar, "");
            logger.a(cVar);
        }
    }

    private static String b(int i2) {
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_list/index.html");
        l.b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        encodedPath.appendQueryParameter("tab_type", String.valueOf(i2));
        String uri = builder.build().toString();
        l.b(uri, "");
        return uri;
    }

    public final List<c> a(List<OrderListTabInfo> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return d();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            int tab = t.getTab();
            String text = t.getText();
            String schema = t.getSchema();
            if (schema == null || schema.length() == 0) {
                str = b(t.getTab());
            } else {
                str = t.getSchema();
            }
            arrayList.add(new c(tab, text, str, t.getTabName(), (byte) 0));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        c cVar = this.f86190b.get(i2);
        l.b(cVar, "");
        c cVar2 = cVar;
        Uri.Builder builder = new Uri.Builder();
        o oVar = new o();
        oVar.a("previous_page", this.f86192e);
        oVar.a("tab_name", cVar2.f86210b);
        oVar.a("tab_id", cVar2.f86212d);
        Uri parse = Uri.parse(cVar2.f86211c);
        l.b(parse, "");
        builder.scheme(parse.getScheme());
        builder.encodedAuthority(parse.getAuthority());
        builder.encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            builder.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        builder.appendQueryParameter("trackParams", oVar.toString());
        String uri = builder.build().toString();
        l.b(uri, "");
        bundle.putString("order_list_url", uri);
        bundle.putInt("tab_position", i2);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
        if (obj instanceof b) {
            ((b) obj).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderCenterAdapter(e eVar, Logger logger, androidx.fragment.app.i iVar) {
        super(iVar);
        Uri data;
        String str = "";
        l.d(eVar, str);
        l.d(logger, str);
        l.d(iVar, str);
        this.f86193f = eVar;
        this.f86194g = logger;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) eVar.findViewById(R.id.ehe);
        this.f86189a = dmtTabLayout;
        this.f86192e = str;
        this.f86190b = new ArrayList<>();
        Intent intent = eVar.getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            String queryParameter = data.getQueryParameter("previous_page");
            this.f86192e = queryParameter != null ? queryParameter : str;
        }
        c();
        eVar.getLifecycle().a(this);
        dmtTabLayout.setOnTabClickListener(new DmtTabLayout.b(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OrderCenterAdapter f86195a;

            static {
                Covode.recordClassIndex(53938);
            }

            {
                this.f86195a = r1;
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
            public final void a(DmtTabLayout.f fVar) {
                OrderCenterAdapter orderCenterAdapter = this.f86195a;
                l.b(fVar, "");
                if (fVar.f33752e >= 0 && fVar.f33752e < orderCenterAdapter.f86190b.size()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (uptimeMillis - orderCenterAdapter.f86190b.get(fVar.f33752e).f86213e < 250) {
                        orderCenterAdapter.f86190b.get(fVar.f33752e).f86213e = 0;
                        IEventCenter a2 = EventCenter.a();
                        String jSONObject = new JSONObject().put("tab_type", orderCenterAdapter.f86190b.get(fVar.f33752e).f86209a).toString();
                        l.b(jSONObject, "");
                        a2.a("ec_order_center_tab_double_clicked", jSONObject);
                    } else {
                        orderCenterAdapter.f86190b.get(fVar.f33752e).f86213e = uptimeMillis;
                    }
                    fVar.a();
                }
            }
        });
        dmtTabLayout.a(new DmtTabLayout.c(this) {
            /* class com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OrderCenterAdapter f86196a;

            static {
                Covode.recordClassIndex(53939);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void b(DmtTabLayout.f fVar) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f86196a = r1;
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void a(DmtTabLayout.f fVar) {
                this.f86196a.a(fVar);
            }
        });
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f86209a;

        /* renamed from: b  reason: collision with root package name */
        public final String f86210b;

        /* renamed from: c  reason: collision with root package name */
        public final String f86211c;

        /* renamed from: d  reason: collision with root package name */
        public final String f86212d;

        /* renamed from: e  reason: collision with root package name */
        public long f86213e;

        static {
            Covode.recordClassIndex(53945);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f86209a == cVar.f86209a && l.a(this.f86210b, cVar.f86210b) && l.a(this.f86211c, cVar.f86211c) && l.a(this.f86212d, cVar.f86212d) && this.f86213e == cVar.f86213e;
        }

        public final int hashCode() {
            int i2 = this.f86209a * 31;
            String str = this.f86210b;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f86211c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f86212d;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            long j2 = this.f86213e;
            return ((hashCode2 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "TabConfig(tabType=" + this.f86209a + ", str=" + this.f86210b + ", url=" + this.f86211c + ", key=" + this.f86212d + ", lastClickedMillis=" + this.f86213e + ")";
        }

        private c(int i2, String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f86209a = i2;
            this.f86210b = str;
            this.f86211c = str2;
            this.f86212d = str3;
            this.f86213e = 0;
        }

        public /* synthetic */ c(int i2, String str, String str2, String str3, byte b2) {
            this(i2, str, str2, str3);
        }
    }
}
