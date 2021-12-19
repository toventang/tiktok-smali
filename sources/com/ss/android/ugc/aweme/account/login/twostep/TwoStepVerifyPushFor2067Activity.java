package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.a.ab;
import com.ss.android.ugc.aweme.account.login.v2.a.ae;
import com.ss.android.ugc.aweme.account.login.v2.a.w;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class TwoStepVerifyPushFor2067Activity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.b f63870a;

    /* renamed from: b  reason: collision with root package name */
    f.a.b.b f63871b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f63872c;

    /* renamed from: d  reason: collision with root package name */
    String f63873d;

    /* renamed from: e  reason: collision with root package name */
    String f63874e;

    /* renamed from: f  reason: collision with root package name */
    public String f63875f;

    /* renamed from: g  reason: collision with root package name */
    public String f63876g;

    /* renamed from: h  reason: collision with root package name */
    public final long f63877h = 60;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f63878i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    boolean f63879j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f63880k = new q(this);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f63881l = h.i.a((h.f.a.a) new c(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f63882m = h.i.a((h.f.a.a) new d(this));
    private final h.h n = h.i.a((h.f.a.a) new e(this));
    private final h.h o = h.i.a((h.f.a.a) new i(this));
    private final h.h p = h.i.a((h.f.a.a) new h(this));
    private f.a.b.b q;
    private final long r = 120000;
    private Handler s = new Handler(Looper.getMainLooper());
    private HashMap t;

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63884a = new b();

        static {
            Covode.recordClassIndex(39350);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final o f63892a = new o();

        static {
            Covode.recordClassIndex(39363);
        }

        o() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39348);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.t == null) {
            this.t = new HashMap();
        }
        View view = (View) this.t.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.t.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f63882m.getValue();
    }

    public final String b() {
        return (String) this.n.getValue();
    }

    public final String c() {
        return (String) this.o.getValue();
    }

    public final String d() {
        return (String) this.p.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        f();
    }

    static final class h extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerifyPushFor2067Activity this$0;

        static {
            Covode.recordClassIndex(39356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.this$0 = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return a(this.this$0.getIntent(), "ticket");
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerifyPushFor2067Activity this$0;

        static {
            Covode.recordClassIndex(39357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.this$0 = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return a(this.this$0.getIntent(), "platform");
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerifyPushFor2067Activity this$0;

        static {
            Covode.recordClassIndex(39351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.this$0 = twoStepVerifyPushFor2067Activity;
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

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerifyPushFor2067Activity this$0;

        static {
            Covode.recordClassIndex(39352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.this$0 = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "enter_method");
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

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ TwoStepVerifyPushFor2067Activity this$0;

        static {
            Covode.recordClassIndex(39353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.this$0 = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "enter_type");
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

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        if (!this.f63879j) {
            m.a().a(new com.ss.android.ugc.aweme.account.g.b(null, this.f63874e, 0, "User left TwoStepAuthActivity before completing auth process", this.f63873d));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63893a;

        static {
            Covode.recordClassIndex(39364);
        }

        p(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63893a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.a
        public final void a() {
            String string = this.f63893a.getString(R.string.f2s);
            h.f.b.l.b(string, "");
            ((LoadingButton) this.f63893a._$_findCachedViewById(R.id.zh)).setText(string);
            LoadingButton loadingButton = (LoadingButton) this.f63893a._$_findCachedViewById(R.id.zh);
            h.f.b.l.b(loadingButton, "");
            loadingButton.setEnabled(true);
        }
    }

    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63894a;

        static {
            Covode.recordClassIndex(39365);
        }

        q(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63894a = twoStepVerifyPushFor2067Activity;
        }

        public final void run() {
            if (!this.f63894a.isFinishing()) {
                Context applicationContext = this.f63894a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(this.f63894a.getString(R.string.f2p)).a();
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f63894a;
                String string = twoStepVerifyPushFor2067Activity.getString(R.string.f2p);
                h.f.b.l.b(string, "");
                twoStepVerifyPushFor2067Activity.a(string);
            }
        }
    }

    private void g() {
        ((TuxTextView) _$_findCachedViewById(R.id.ewf)).setOnClickListener(new f(this));
        ((LoadingButton) _$_findCachedViewById(R.id.zh)).setOnClickListener(new g(this));
    }

    public final void f() {
        r.a("cancel_push_challenge_login_request", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", a()).a("enter_from", a()).a("enter_type", b()).a("platform", c()).f62575a);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        h.f.b.l.b(window, "");
        View decorView = window.getDecorView();
        h.f.b.l.b(decorView, "");
        setFinishOnTouchOutside(false);
        ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.width = com.bytedance.common.utility.n.a(this);
        layoutParams2.height = -2;
        getWindowManager().updateViewLayout(decorView, layoutParams2);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        f.a.b.b bVar = this.q;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f63870a;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        f.a.b.b bVar3 = this.f63871b;
        if (bVar3 != null) {
            bVar3.dispose();
        }
        f.a.b.b bVar4 = this.f63872c;
        if (bVar4 != null) {
            bVar4.dispose();
        }
        this.s.removeCallbacks(this.f63880k);
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

    public final void e() {
        String string = getString(R.string.f2r, new Object[]{String.valueOf(this.f63877h)});
        h.f.b.l.b(string, "");
        ((LoadingButton) _$_findCachedViewById(R.id.zh)).setText(string);
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(R.id.zh);
        h.f.b.l.b(loadingButton, "");
        loadingButton.setEnabled(false);
        f.a.b.b bVar = this.q;
        if (bVar != null) {
            bVar.dispose();
        }
        this.q = t.a(0, 1, TimeUnit.SECONDS).b(this.f63877h).d(new m(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new n(this), o.f63892a, new p(this));
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63885a;

        static {
            Covode.recordClassIndex(39354);
        }

        f(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63885a = twoStepVerifyPushFor2067Activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63885a.f();
            this.f63885a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63890a;

        static {
            Covode.recordClassIndex(39361);
        }

        m(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63890a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Long l2 = (Long) obj;
            h.f.b.l.d(l2, "");
            return Long.valueOf(this.f63890a.f63877h - l2.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63891a;

        static {
            Covode.recordClassIndex(39362);
        }

        n(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63891a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String string = this.f63891a.getString(R.string.f2r, new Object[]{String.valueOf(((Long) obj).longValue())});
            h.f.b.l.b(string, "");
            ((LoadingButton) this.f63891a._$_findCachedViewById(R.id.zh)).setText(string);
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        m.a().a(new com.ss.android.ugc.aweme.account.g.b(null, this.f63874e, 0, str, this.f63873d));
        this.f63879j = true;
        finish();
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63883a;

        static {
            Covode.recordClassIndex(39349);
        }

        a(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63883a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.login.v2.a.b bVar = (com.ss.android.ugc.aweme.account.login.v2.a.b) obj;
            String str = "";
            if (h.f.b.l.a((Object) "allowed", (Object) bVar.f64227a)) {
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f63883a;
                String str2 = bVar.f64228b;
                if (str2 != null) {
                    str = str2;
                }
                twoStepVerifyPushFor2067Activity.f63876g = str;
                f.a.b.b bVar2 = this.f63883a.f63872c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f63883a;
                com.ss.android.ugc.aweme.account.g.b bVar3 = new com.ss.android.ugc.aweme.account.g.b(twoStepVerifyPushFor2067Activity2.f63876g, twoStepVerifyPushFor2067Activity2.f63874e, 0, null, twoStepVerifyPushFor2067Activity2.f63873d);
                twoStepVerifyPushFor2067Activity2.f63879j = true;
                m.a().a(bVar3);
                twoStepVerifyPushFor2067Activity2.finish();
            } else if (h.f.b.l.a((Object) "denied", (Object) bVar.f64227a)) {
                Context applicationContext = this.f63883a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(this.f63883a.getString(R.string.f2q)).a();
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity3 = this.f63883a;
                String string = twoStepVerifyPushFor2067Activity3.getString(R.string.f2q);
                h.f.b.l.b(string, str);
                twoStepVerifyPushFor2067Activity3.a(string);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63886a;

        static {
            Covode.recordClassIndex(39355);
        }

        g(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63886a = twoStepVerifyPushFor2067Activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f63886a;
            r.a("click_resend_push_challenge_login", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", twoStepVerifyPushFor2067Activity.a()).a("enter_from", twoStepVerifyPushFor2067Activity.a()).a("enter_type", twoStepVerifyPushFor2067Activity.b()).a("platform", twoStepVerifyPushFor2067Activity.c()).f62575a);
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f63886a;
            ((LoadingButton) twoStepVerifyPushFor2067Activity2._$_findCachedViewById(R.id.zh)).a(true);
            twoStepVerifyPushFor2067Activity2.f63870a = ae.a(twoStepVerifyPushFor2067Activity2.d(), twoStepVerifyPushFor2067Activity2.f63875f).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(twoStepVerifyPushFor2067Activity2), new k(twoStepVerifyPushFor2067Activity2));
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63887a;

        static {
            Covode.recordClassIndex(39358);
        }

        j(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63887a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ab abVar = (ab) obj;
            ((LoadingButton) this.f63887a._$_findCachedViewById(R.id.zh)).b(true);
            if (h.f.b.l.a((Object) "ok", (Object) abVar.f64195e)) {
                if (TextUtils.isEmpty(abVar.f64196f)) {
                    TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f63887a;
                    String str = abVar.f64196f;
                    if (str == null) {
                        str = "";
                    }
                    twoStepVerifyPushFor2067Activity.f63875f = str;
                }
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f63887a;
                Collection collection = abVar.f64200j;
                if (collection == null) {
                    collection = z.INSTANCE;
                }
                twoStepVerifyPushFor2067Activity2.f63878i = new ArrayList<>(collection);
                this.f63887a.e();
            } else if (h.f.b.l.a((Object) "expired", (Object) abVar.f64195e)) {
                this.f63887a.f63880k.run();
            } else {
                String str2 = abVar.f64199i;
                if (str2 != null && str2.length() > 0) {
                    Context applicationContext = this.f63887a.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(str2).a();
                }
            }
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63888a;

        static {
            Covode.recordClassIndex(39359);
        }

        k(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63888a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ((LoadingButton) this.f63888a._$_findCachedViewById(R.id.zh)).b(true);
            if (th instanceof w) {
                w wVar = (w) th;
                if (TextUtils.isEmpty(wVar.getDetailErrorMsg())) {
                    Context applicationContext = this.f63888a.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(wVar.getDetailErrorMsg()).a();
                }
            }
            String string = this.f63888a.getString(R.string.f2s);
            h.f.b.l.b(string, "");
            ((LoadingButton) this.f63888a._$_findCachedViewById(R.id.zh)).setText(string);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f63889a;

        static {
            Covode.recordClassIndex(39360);
        }

        l(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f63889a = twoStepVerifyPushFor2067Activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f63889a;
            f.a.b.b bVar = twoStepVerifyPushFor2067Activity.f63871b;
            if (bVar != null) {
                bVar.dispose();
            }
            String d2 = twoStepVerifyPushFor2067Activity.d();
            String str = twoStepVerifyPushFor2067Activity.f63875f;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(d2)) {
                if (d2 == null) {
                    h.f.b.l.b();
                }
                hashMap.put("verify_ticket", d2);
            }
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    h.f.b.l.b();
                }
                hashMap.put("wait_ticket", str);
            }
            f.a.h<R> a2 = NetworkProxyAccount.d("/passport/push_challenge/check_2sv/", hashMap).a(ae.a.f64218a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            h.f.b.l.b(a2, "");
            twoStepVerifyPushFor2067Activity.f63871b = a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(twoStepVerifyPushFor2067Activity), b.f63884a);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.hd);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("device_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        this.f63878i = stringArrayListExtra;
        this.f63875f = a(getIntent(), "wait_ticket");
        String a2 = a(getIntent(), "sms_code_key");
        if (a2 == null) {
            a2 = "";
        }
        this.f63873d = a2;
        String a3 = a(getIntent(), "profile_key");
        if (a3 == null) {
            a3 = "";
        }
        this.f63874e = a3;
        if (this.f63878i.size() == 1) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.exf);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.f2o, new Object[]{this.f63878i.get(0)}));
        } else if (this.f63878i.size() >= 2) {
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.exf);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setText(getResources().getQuantityString(R.plurals.gz, this.f63878i.size() - 1, this.f63878i.get(0), String.valueOf(this.f63878i.size() - 1)));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.exf);
            h.f.b.l.b(tuxTextView3, "");
            tuxTextView3.setText(getString(R.string.f2o, new Object[]{""}));
        }
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.ewf);
        h.f.b.l.b(tuxTextView4, "");
        tuxTextView4.setText(getString(R.string.a9g));
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(R.id.zh);
        h.f.b.l.b(loadingButton, "");
        loadingButton.setEnabled(false);
        String string = getString(R.string.f2r, new Object[]{String.valueOf(this.f63877h)});
        h.f.b.l.b(string, "");
        ((LoadingButton) _$_findCachedViewById(R.id.zh)).setText(string);
        g();
        this.f63872c = t.a(0, 3, TimeUnit.SECONDS).d(new l(this));
        g();
        e();
        r.a("show_interrupted_login_panel", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", a()).a("enter_from", a()).a("enter_type", b()).a("platform", c()).f62575a);
        this.s.postDelayed(this.f63880k, this.r);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
