package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.b;
import com.ss.android.ugc.aweme.account.login.twostep.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class AuthorizedDeviceActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f63336a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f63337b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private HashMap f63338c;

    static {
        Covode.recordClassIndex(39028);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f63338c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f63338c == null) {
            this.f63338c = new HashMap();
        }
        View view = (View) this.f63338c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f63338c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f63336a.getValue();
    }

    public final m b() {
        return (m) this.f63337b.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends h.f.b.m implements h.f.a.a<m> {
        final /* synthetic */ AuthorizedDeviceActivity this$0;

        static {
            Covode.recordClassIndex(39030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AuthorizedDeviceActivity authorizedDeviceActivity) {
            super(0);
            this.this$0 = authorizedDeviceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return new m(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthorizedDeviceActivity f63343a;

        static {
            Covode.recordClassIndex(39035);
        }

        f(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f63343a = authorizedDeviceActivity;
        }

        public static final class a implements l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f63344a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f63345b;

            static {
                Covode.recordClassIndex(39036);
            }

            @Override // com.ss.android.ugc.aweme.account.login.authorize.l
            public final String a() {
                String a2 = this.f63344a.f63343a.a();
                l.b(a2, "");
                return a2;
            }

            @Override // com.ss.android.ugc.aweme.account.login.authorize.l
            public final void b() {
                bt.a(this.f63344a.f63343a.b());
            }

            @Override // com.ss.android.ugc.aweme.account.login.authorize.l
            public final void d() {
                bt.b(this.f63344a.f63343a.b());
            }

            @Override // com.ss.android.ugc.aweme.account.login.authorize.l
            public final void c() {
                RecyclerView recyclerView = (RecyclerView) this.f63344a.f63343a._$_findCachedViewById(R.id.dr2);
                l.b(recyclerView, "");
                recyclerView.setVisibility(8);
                DmtStatusView dmtStatusView = (DmtStatusView) this.f63344a.f63343a._$_findCachedViewById(R.id.e_c);
                l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) this.f63344a.f63343a._$_findCachedViewById(R.id.e_c)).g();
            }

            a(f fVar, List list) {
                this.f63344a = fVar;
                this.f63345b = list;
            }

            @Override // com.ss.android.ugc.aweme.account.login.authorize.l
            public final void a(Integer num, String str) {
                this.f63344a.f63343a.a(num, str);
            }
        }

        @Override // b.g
        public final Object then(b.i<com.ss.android.ugc.aweme.account.login.twostep.b> iVar) {
            Integer num;
            String str;
            String str2;
            if (!ai.a(iVar)) {
                ((DmtStatusView) this.f63343a._$_findCachedViewById(R.id.e_c)).h();
                this.f63343a.a(null, "");
                return null;
            }
            l.b(iVar, "");
            com.ss.android.ugc.aweme.account.login.twostep.b d2 = iVar.d();
            if (!p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                b.a data = d2.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                b.a data2 = d2.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                ((DmtStatusView) this.f63343a._$_findCachedViewById(R.id.e_c)).h();
                this.f63343a.a(num, str);
                return null;
            }
            List<com.ss.android.ugc.aweme.account.login.twostep.e> auth_device = d2.getData().getAuth_device();
            if (auth_device == null || auth_device.size() <= 0) {
                ((DmtStatusView) this.f63343a._$_findCachedViewById(R.id.e_c)).g();
                return null;
            }
            List<com.ss.android.ugc.aweme.account.login.twostep.e> auth_device2 = d2.getData().getAuth_device();
            if (auth_device2 == null) {
                l.b();
            }
            List g2 = n.g((Collection) auth_device2);
            Iterator it = g2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long device_id = ((com.ss.android.ugc.aweme.account.login.twostep.e) next).getDevice_id();
                if (device_id != null) {
                    str2 = String.valueOf(device_id.longValue());
                } else {
                    str2 = null;
                }
                if (l.a((Object) str2, (Object) DeviceRegisterManager.getDeviceId())) {
                    if (next != null) {
                        g2.remove(next);
                        g2.add(0, next);
                    }
                }
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f63343a._$_findCachedViewById(R.id.e_c);
            l.b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f63343a._$_findCachedViewById(R.id.dr2);
            l.b(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) this.f63343a._$_findCachedViewById(R.id.dr2);
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            recyclerView2.setAdapter(new j(g2, new a(this, g2)));
            return recyclerView2;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ AuthorizedDeviceActivity this$0;

        static {
            Covode.recordClassIndex(39029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AuthorizedDeviceActivity authorizedDeviceActivity) {
            super(0);
            this.this$0 = authorizedDeviceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "enter_from");
            if (a2 == null) {
                return "";
            }
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void c() {
        DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e_c);
        l.b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 0) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) _$_findCachedViewById(R.id.e_c);
            l.b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(0);
        }
        ((DmtStatusView) _$_findCachedViewById(R.id.e_c)).f();
        TwoStepAuthApi.b().a(new f(this), b.i.f4826c, null);
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

    public static final class e implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthorizedDeviceActivity f63342a;

        static {
            Covode.recordClassIndex(39034);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f63342a = authorizedDeviceActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f63342a.finish();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63339a = new c();

        static {
            Covode.recordClassIndex(39031);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f63340a);
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthorizedDeviceActivity f63341a;

        static {
            Covode.recordClassIndex(39033);
        }

        d(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f63341a = authorizedDeviceActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63341a.c();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", true);
        activityConfiguration(c.f63339a);
        super.onCreate(bundle);
        setContentView(R.layout.fq);
        TuxTextView tuxTextView = new TuxTextView(this, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Integer a2 = com.bytedance.tux.h.d.a(this, R.attr.bj);
        if (a2 != null) {
            i2 = a2.intValue();
        } else {
            i2 = -16777216;
        }
        tuxTextView.setTextColor(i2);
        tuxTextView.setText(getString(R.string.g6h));
        tuxTextView.setOnClickListener(new d(this));
        String string = getString(R.string.g6h);
        l.b(string, "");
        Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
        int c2 = androidx.core.content.b.c(a3, R.color.c5);
        TuxTextView tuxTextView2 = new TuxTextView(a3, null, 0, 6);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c2);
        tuxTextView2.setText(string);
        DmtStatusView.a c3 = DmtStatusView.a.a(this).b(tuxTextView2).c(tuxTextView);
        c3.f33605g = 0;
        ((DmtStatusView) _$_findCachedViewById(R.id.e_c)).setBuilder(c3);
        ((ButtonTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new e(this));
        c();
        String a4 = a();
        l.b(a4, "");
        l.d(a4, "");
        r.a("authorized_logins_notify", q.a().a("enter_from", a4).f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", false);
    }

    public final void a(Integer num, String str) {
        com.ss.android.ugc.aweme.tux.a.i.a aVar;
        if (num == null) {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            str = getString(R.string.bpf);
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            str = getString(R.string.de8);
        } else {
            aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this);
            if (str == null) {
                l.b();
            }
        }
        aVar.a(str).a();
    }
}
