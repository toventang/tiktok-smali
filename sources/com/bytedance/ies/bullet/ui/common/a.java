package com.bytedance.ies.bullet.ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.ab;
import com.bytedance.ies.bullet.service.base.al;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.d.a.c;
import com.bytedance.ies.bullet.service.base.s;
import com.bytedance.ies.bullet.service.f.a.b.r;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.bullet.ui.common.k;
import com.bytedance.ies.bullet.ui.common.view.AutoRTLImageView;
import com.gyf.barlibrary.ImmersionBar;
import com.zhiliaoapp.musically.R;
import h.w;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class a extends com.bytedance.ies.uikit.a.a implements com.bytedance.ies.bullet.service.base.a.j, ab, com.bytedance.ies.bullet.ui.common.b.b, com.bytedance.ies.bullet.ui.common.b.e, h.b, j, k {

    /* renamed from: a  reason: collision with root package name */
    public final g f33051a = new C0721a(this, this);

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.e.a.b f33052b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f33053c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f33054d;

    /* renamed from: e  reason: collision with root package name */
    protected BulletContainerView f33055e;

    /* renamed from: f  reason: collision with root package name */
    protected ViewGroup f33056f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.ies.bullet.ui.common.b.c f33057g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f33058h;

    /* renamed from: l  reason: collision with root package name */
    private String f33059l;

    /* renamed from: m  reason: collision with root package name */
    private View f33060m;
    private k.b n;
    private com.bytedance.ies.bullet.service.f.a.b o = new com.bytedance.ies.bullet.service.f.a.b();
    private boolean p;
    private final h.h q = h.i.a((h.f.a.a) new h(this));
    private final h.h r = h.i.a((h.f.a.a) new k(this));
    private final com.bytedance.ies.bullet.ui.common.d.c s = new com.bytedance.ies.bullet.ui.common.d.c();
    private ImmersionBar t;
    private int u = 1;
    private HashMap v;

    static {
        Covode.recordClassIndex(19726);
    }

    private final s v() {
        return (s) this.r.getValue();
    }

    public View a(int i2) {
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.v.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public View a(ViewGroup viewGroup, Uri uri) {
        h.f.b.l.c(viewGroup, "");
        h.f.b.l.c(uri, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public q getLoggerWrapper() {
        return (q) this.q.getValue();
    }

    public k.b j() {
        return null;
    }

    public View k() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.b
    public final boolean p() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.b
    public final boolean q() {
        return false;
    }

    public static final class i implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33067a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33068b = "bulletOnBackPressAction";

        /* renamed from: c  reason: collision with root package name */
        private final Object f33069c;

        static {
            Covode.recordClassIndex(19735);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f33068b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f33069c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(a aVar) {
            this.f33067a = aVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerID", aVar.g().getReactId());
            this.f33069c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final void d() {
        finish();
    }

    public CharSequence i() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.bullet.ui.common.h.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends android.view.View>> r10, android.net.Uri r11, com.bytedance.ies.bullet.c.c.i r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.ui.common.a.a(java.util.List, android.net.Uri, com.bytedance.ies.bullet.c.c.i, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.q $this_apply$inlined;
        final /* synthetic */ BulletContainerView $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(com.bytedance.ies.bullet.service.base.q qVar, a aVar, BulletContainerView bulletContainerView) {
            super(0);
            this.$this_apply$inlined = qVar;
            this.this$0 = aVar;
            this.$view$inlined = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.ies.bullet.service.base.q $this_apply$inlined;
        final /* synthetic */ BulletContainerView $view$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(com.bytedance.ies.bullet.service.base.q qVar, a aVar, BulletContainerView bulletContainerView) {
            super(0);
            this.$this_apply$inlined = qVar;
            this.this$0 = aVar;
            this.$view$inlined = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$view$inlined.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33072a;

        static {
            Covode.recordClassIndex(19738);
        }

        l(a aVar) {
            this.f33072a = aVar;
        }

        public final void run() {
            this.f33072a.h().setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String e() {
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        return bulletContainerView.getReactId();
    }

    /* access modifiers changed from: protected */
    public final BulletContainerView g() {
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        return bulletContainerView;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup h() {
        ViewGroup viewGroup = this.f33056f;
        if (viewGroup == null) {
            h.f.b.l.a("rootLayout");
        }
        return viewGroup;
    }

    public boolean l() {
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        bulletContainerView.c();
        return true;
    }

    public boolean m() {
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        bulletContainerView.d();
        return true;
    }

    @Override // com.bytedance.ies.uikit.a.a
    public void n() {
        ImmersionBar immersionBar = this.t;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        this.t = null;
    }

    public final void o() {
        x();
        com.bytedance.ies.bullet.ui.common.d.d.a(this, 0);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public void onPause() {
        super.onPause();
        this.f33051a.c(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public void onResume() {
        super.onResume();
        this.f33051a.b(this);
        w();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, androidx.appcompat.app.d
    public void onStart() {
        super.onStart();
        this.f33051a.e(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, androidx.appcompat.app.d
    public void onStop() {
        super.onStop();
        this.f33051a.f(this);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33062a;

        static {
            Covode.recordClassIndex(19728);
        }

        b(a aVar) {
            this.f33062a = aVar;
        }

        public final void run() {
            this.f33062a.h().setPadding(0, com.bytedance.ies.bullet.ui.common.d.d.a((Context) this.f33062a), 0, 0);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<q> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) this.this$0.s().a().b().c(com.bytedance.ies.bullet.service.base.m.class), "Activity");
        }
    }

    private void x() {
        ViewGroup viewGroup = this.f33056f;
        if (viewGroup == null) {
            h.f.b.l.a("rootLayout");
        }
        viewGroup.post(new l(this));
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String a() {
        String str;
        com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) s().a().b().c(com.bytedance.ies.bullet.c.a.a.class);
        if (aVar == null || (str = aVar.f31975a) == null) {
            return "default_bid";
        }
        return str;
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String b() {
        com.bytedance.ies.bullet.service.a.e<String, Object> a2;
        String string;
        String str = this.f33059l;
        if (str == null || (a2 = e.a.a().a(str)) == null || (string = a2.getString("__x_param_channel")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final String c() {
        com.bytedance.ies.bullet.service.a.e<String, Object> a2;
        String string;
        String str = this.f33059l;
        if (str == null || (a2 = e.a.a().a(str)) == null || (string = a2.getString("__x_param_bundle")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.ies.bullet.service.base.ab
    public final Uri f() {
        if (this.f33053c == null) {
            return null;
        }
        Uri uri = this.f33053c;
        if (uri == null) {
            h.f.b.l.a("uri");
        }
        return uri;
    }

    static final class k extends h.f.b.m implements h.f.a.a<s> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            String str;
            com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) this.this$0.s().a().b().c(com.bytedance.ies.bullet.c.a.a.class);
            if (aVar == null || (str = aVar.f31975a) == null) {
                str = "default_bid";
            }
            return e.a.a().a(str, s.class);
        }
    }

    public void finish() {
        super.finish();
        com.bytedance.ies.bullet.service.f.a.b.l b2 = this.o.f32697m.b();
        if (b2 != null) {
            int i2 = b.f33074b[b2.ordinal()];
            if (i2 == 1) {
                super.overridePendingTransition(0, R.anim.al);
            } else if (i2 == 2) {
                super.overridePendingTransition(0, R.anim.an);
            }
        }
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        if (h.f.b.l.a((Object) this.o.y.b(), (Object) true)) {
            onEvent(new i(this));
        } else if (!this.f33051a.a(this)) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.e
    public final void r() {
        int requestedOrientation = getRequestedOrientation();
        int i2 = this.u;
        if (requestedOrientation != i2) {
            setRequestedOrientation(i2);
        }
        h.f.b.l.c(this, "");
        getWindow().clearFlags(1024);
        w();
        Window window = getWindow();
        h.f.b.l.a((Object) window, "");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.a0j);
            if (viewGroup2 != null) {
                viewGroup.removeView(viewGroup2);
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private final void w() {
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        if (com.bytedance.ies.bullet.ui.common.d.d.a()) {
            com.bytedance.ies.bullet.ui.common.d.d.a(getWindow());
            ImmersionBar with = ImmersionBar.with(this);
            Window window = getWindow();
            h.f.b.l.a((Object) window, "");
            ImmersionBar statusBarColorInt = with.statusBarColorInt(window.getStatusBarColor());
            Boolean b2 = this.o.u.b();
            if (b2 != null) {
                z = b2.booleanValue();
            } else {
                z = true;
            }
            ImmersionBar keyboardEnable = statusBarColorInt.keyboardEnable(z);
            keyboardEnable.init();
            this.t = keyboardEnable;
            r b3 = this.o.f32690f.b();
            if (b3 == null || (i2 = b.f33073a[b3.ordinal()]) == 1 || i2 != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.ies.bullet.ui.common.d.d.a(this, getWindow(), z2);
            if (h.f.b.l.a((Object) this.o.f32687c.b(), (Object) true)) {
                o();
            }
            if (!h.f.b.l.a((Object) this.o.f32685a.b(), (Object) true) || (com.bytedance.ies.bullet.ui.common.d.a.a(this) && !h.f.b.l.a((Object) this.o.f32687c.b(), (Object) true))) {
                z3 = false;
            } else {
                z3 = true;
                com.bytedance.ies.bullet.ui.common.d.d.a((Activity) this);
                x();
            }
            if ((!h.f.b.l.a((Object) this.o.f32687c.b(), (Object) true)) && !z3) {
                if (this.f33056f != null) {
                    ViewGroup viewGroup = this.f33056f;
                    if (viewGroup == null) {
                        h.f.b.l.a("rootLayout");
                    }
                    viewGroup.post(new b(this));
                }
                t b4 = this.o.f32689e.b();
                if (b4 != null && b4.f32728a != -2) {
                    com.bytedance.ies.bullet.ui.common.d.d.a(this, b4.f32728a);
                }
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, androidx.appcompat.app.d
    public void onDestroy() {
        Object obj;
        s v2;
        super.onDestroy();
        com.bytedance.ies.bullet.service.base.d.a.c a2 = c.a.a();
        h.f.b.l.c(this, "");
        try {
            obj = h.q.m223constructorimpl(Boolean.valueOf(a2.f32596a.remove(this)));
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(h.r.a(th));
        }
        h.q.m226exceptionOrNullimpl(obj);
        ImmersionBar immersionBar = this.t;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        com.bytedance.ies.bullet.ui.common.d.c cVar = this.s;
        h.f.b.l.c(this, "");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = cVar.f33097b;
        if (onGlobalLayoutListener != null) {
            Window window = getWindow();
            h.f.b.l.a((Object) window, "");
            View decorView = window.getDecorView();
            h.f.b.l.a((Object) decorView, "");
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f33051a.d(this);
        if (this.f33055e != null) {
            al alVar = null;
            if (this.p && (v2 = v()) != null) {
                Uri uri = this.f33053c;
                if (uri == null) {
                    h.f.b.l.a("uri");
                }
                BulletContainerView bulletContainerView = this.f33055e;
                if (bulletContainerView == null) {
                    h.f.b.l.a("bulletContainerView");
                }
                alVar = v2.a(uri, bulletContainerView);
            }
            if (alVar != al.SUCCESS) {
                BulletContainerView bulletContainerView2 = this.f33055e;
                if (bulletContainerView2 == null) {
                    h.f.b.l.a("bulletContainerView");
                }
                bulletContainerView2.e();
                BulletContainerView bulletContainerView3 = this.f33055e;
                if (bulletContainerView3 == null) {
                    h.f.b.l.a("bulletContainerView");
                }
                bulletContainerView3.a();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33063a;

        static {
            Covode.recordClassIndex(19729);
        }

        c(a aVar) {
            this.f33063a = aVar;
        }

        public final void onClick(View view) {
            this.f33063a.finish();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33064a;

        static {
            Covode.recordClassIndex(19730);
        }

        d(a aVar) {
            this.f33064a = aVar;
        }

        public final void onClick(View view) {
            this.f33064a.finish();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33065a;

        static {
            Covode.recordClassIndex(19731);
        }

        e(a aVar) {
            this.f33065a = aVar;
        }

        public final void onClick(View view) {
            this.f33065a.finish();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33066a;

        static {
            Covode.recordClassIndex(19732);
        }

        f(a aVar) {
            this.f33066a = aVar;
        }

        public final void onClick(View view) {
            this.f33066a.finish();
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f33071b;

        static {
            Covode.recordClassIndex(19736);
        }

        j(a aVar, Boolean bool) {
            this.f33070a = aVar;
            this.f33071b = bool;
        }

        public final void onClick(View view) {
            this.f33070a.g().b();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        h.f.b.l.c(configuration, "");
        super.onConfigurationChanged(configuration);
        this.f33051a.a(this, configuration);
    }

    @Override // com.bytedance.ies.uikit.a.a
    public void onRestoreInstanceState(Bundle bundle) {
        h.f.b.l.c(bundle, "");
        super.onRestoreInstanceState(bundle);
        this.f33051a.c(this, bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        h.f.b.l.c(bundle, "");
        super.onSaveInstanceState(bundle);
        this.f33051a.b(this, bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f33051a.a(this, z);
    }

    public final void onEvent(p pVar) {
        h.f.b.l.c(pVar, "");
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        bulletContainerView.onEvent(pVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        h.f.b.l.c(uri, "");
        com.bytedance.ies.bullet.ui.common.b.c cVar = this.f33057g;
        if (cVar != null) {
            cVar.a(uri);
        }
    }

    public final void b(BulletContainerView bulletContainerView) {
        View k2 = k();
        if (k2 != null) {
            BulletContainerView bulletContainerView2 = this.f33055e;
            if (bulletContainerView2 == null) {
                h.f.b.l.a("bulletContainerView");
            }
            bulletContainerView2.a(k2, 17, 0, 0, 0, 0);
        }
        com.bytedance.ies.bullet.service.base.q qVar = (com.bytedance.ies.bullet.service.base.q) e.a.a().a(a(), com.bytedance.ies.bullet.service.base.q.class);
        if (qVar != null) {
            com.bytedance.ies.bullet.service.base.k a2 = qVar.a(this);
            if (a2 != null) {
                View view = a2.getView();
                FrameLayout.LayoutParams d2 = qVar.d();
                if (d2 != null) {
                    bulletContainerView.a(view, d2);
                } else {
                    bulletContainerView.a(view, 17, 0, 0, 0, 0);
                }
            }
            com.bytedance.ies.bullet.service.base.h b2 = qVar.b(this);
            if (b2 != null) {
                new m(qVar, this, bulletContainerView);
                new n(qVar, this, bulletContainerView);
                View a3 = b2.a();
                FrameLayout.LayoutParams e2 = qVar.e();
                if (e2 != null) {
                    bulletContainerView.b(a3, e2);
                } else {
                    bulletContainerView.b((BulletContainerView) a3, (View) new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.e
    public void enterFullScreen(View view) {
        h.f.b.l.c(view, "");
        this.u = getRequestedOrientation();
        int i2 = Build.VERSION.SDK_INT;
        setRequestedOrientation(11);
        com.bytedance.ies.bullet.ui.common.d.d.a((Activity) this);
        Window window = getWindow();
        h.f.b.l.a((Object) window, "");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.a0j);
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(this);
                viewGroup2.setId(R.id.a0j);
                viewGroup.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup2.setVisibility(0);
            viewGroup2.addView(view, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        Object obj;
        String str2;
        boolean a2;
        String str3;
        com.bytedance.ies.bullet.ui.common.b.c cVar;
        com.bytedance.ies.bullet.c.e.a.b c2;
        com.bytedance.ies.bullet.ui.common.b.d dVar;
        com.bytedance.ies.bullet.ui.common.b.c cVar2;
        com.bytedance.ies.bullet.c.e.a.b c3;
        com.bytedance.ies.bullet.ui.common.b.d dVar2;
        Uri data;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            h.f.b.l.a((Object) data, "");
            this.f33053c = data;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle2 = a(intent2);
        } else {
            bundle2 = null;
        }
        this.f33054d = bundle2;
        if (bundle2 != null) {
            str = bundle2.getString("__x_session_id");
        } else {
            str = null;
        }
        this.f33059l = str;
        if (this.f33053c == null) {
            finish();
            return;
        }
        supportRequestWindowFeature(10);
        com.bytedance.ies.bullet.c.d a3 = s().a();
        if (!(a3 instanceof com.bytedance.ies.bullet.c.a)) {
            a3 = null;
        }
        com.bytedance.ies.bullet.c.a aVar = (com.bytedance.ies.bullet.c.a) a3;
        if (aVar != null) {
            Boolean bool = this.f33058h;
            if (bool != null) {
                a2 = bool.booleanValue();
            } else {
                Bundle bundle3 = this.f33054d;
                if (bundle3 != null) {
                    str2 = bundle3.getString("prerender");
                } else {
                    str2 = null;
                }
                a2 = h.f.b.l.a((Object) str2, (Object) "1");
            }
            this.f33058h = Boolean.valueOf(a2);
            Bundle bundle4 = this.f33054d;
            if (bundle4 != null) {
                str3 = bundle4.getString("reuse");
            } else {
                str3 = null;
            }
            this.p = h.f.b.l.a((Object) str3, (Object) "1");
            com.bytedance.ies.bullet.service.f.a.a aVar2 = new com.bytedance.ies.bullet.service.f.a.a();
            Uri uri = this.f33053c;
            if (uri == null) {
                h.f.b.l.a("uri");
            }
            aVar2.a(Uri.class, uri, null);
            List<String> b2 = aVar2.f32681a.b();
            if (b2 != null) {
                Iterator<T> it = b2.iterator();
                while (it.hasNext()) {
                    com.bytedance.ies.bullet.c.g gVar = aVar.f31961i.get(it.next());
                    if (gVar == null || (c3 = gVar.c()) == null || (dVar2 = (com.bytedance.ies.bullet.ui.common.b.d) c3.c(com.bytedance.ies.bullet.ui.common.b.d.class)) == null || (cVar2 = dVar2.a().invoke(aVar.f31955c)) == null) {
                        cVar2 = this.f33057g;
                    }
                    this.f33057g = cVar2;
                }
            }
            if (this.f33057g == null) {
                com.bytedance.ies.bullet.c.g gVar2 = aVar.f31960h;
                if (gVar2 == null || (c2 = gVar2.c()) == null || (dVar = (com.bytedance.ies.bullet.ui.common.b.d) c2.c(com.bytedance.ies.bullet.ui.common.b.d.class)) == null) {
                    cVar = null;
                } else {
                    cVar = dVar.a().invoke(aVar.f31955c);
                }
                this.f33057g = cVar;
            }
        }
        com.bytedance.ies.bullet.ui.common.b.c cVar3 = this.f33057g;
        boolean z = false;
        if (cVar3 != null) {
            ViewGroup a4 = cVar3.a(this);
            setContentView(a4);
            this.f33055e = new BulletContainerView(this, null, 6, (byte) 0);
            this.f33056f = a4;
            ViewGroup a5 = cVar3.a();
            BulletContainerView bulletContainerView = this.f33055e;
            if (bulletContainerView == null) {
                h.f.b.l.a("bulletContainerView");
            }
            a5.addView(bulletContainerView);
            this.f33051a.a(cVar3.b());
            h.f.b.l.c(cVar3, "");
        }
        if (this.f33057g == null) {
            setContentView(R.layout.m3);
            BulletContainerView bulletContainerView2 = (BulletContainerView) a(R.id.a0i);
            h.f.b.l.a((Object) bulletContainerView2, "");
            this.f33055e = bulletContainerView2;
            LinearLayout linearLayout = (LinearLayout) a(R.id.dqk);
            h.f.b.l.a((Object) linearLayout, "");
            this.f33056f = linearLayout;
        }
        if (this.f33055e == null) {
            j.b.a(this, "Load uri failed: bulletContainerView has not been initialized, finish bullet activity", com.bytedance.ies.bullet.service.base.a.p.E, null, 4);
            finish();
        } else {
            BulletContainerView bulletContainerView3 = this.f33055e;
            if (bulletContainerView3 == null) {
                h.f.b.l.a("bulletContainerView");
            }
            g gVar3 = new g(this);
            s v2 = v();
            if (v2 != null) {
                Uri uri2 = this.f33053c;
                if (uri2 == null) {
                    h.f.b.l.a("uri");
                }
                Boolean bool2 = this.f33058h;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                }
                com.bytedance.ies.bullet.service.base.b a6 = v2.a(uri2, z, this.p, bulletContainerView3);
                if (a6 != null) {
                    View view = a6.f32570c;
                    if (view != null) {
                        gVar3.invoke(view, a6.f32571d);
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
            }
            gVar3.invoke(bulletContainerView3, com.bytedance.ies.bullet.service.base.c.NONE);
        }
        this.f33051a.a(this, bundle);
        com.bytedance.ies.bullet.service.base.d.a.c a7 = c.a.a();
        h.f.b.l.c(this, "");
        try {
            obj = h.q.m223constructorimpl(Boolean.valueOf(a7.f32596a.add(this)));
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(h.r.a(th));
        }
        h.q.m226exceptionOrNullimpl(obj);
    }

    /* access modifiers changed from: protected */
    public final void a(BulletContainerView bulletContainerView) {
        h.f.b.l.c(bulletContainerView, "");
        this.f33055e = bulletContainerView;
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.a$a  reason: collision with other inner class name */
    public static final class C0721a extends BulletActivityWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33061a;

        static {
            Covode.recordClassIndex(19727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0721a(a aVar, Activity activity) {
            super(activity);
            this.f33061a = aVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        h.f.b.l.c(th, "");
        h.f.b.l.c(str, "");
        j.b.a(this, th, str);
    }

    static final class g extends h.f.b.m implements h.f.a.m<BulletContainerView, com.bytedance.ies.bullet.service.base.c, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(BulletContainerView bulletContainerView, com.bytedance.ies.bullet.service.base.c cVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar;
            BulletContainerView bulletContainerView2 = bulletContainerView;
            h.f.b.l.c(bulletContainerView2, "");
            h.f.b.l.c(cVar, "");
            this.this$0.a(bulletContainerView2);
            BulletContainerView g2 = this.this$0.g();
            this.this$0.f33052b = g2.getProviderFactory();
            com.bytedance.ies.bullet.ui.common.b.c cVar2 = this.this$0.f33057g;
            if (cVar2 != null) {
                g2.getProviderFactory().a(com.bytedance.ies.bullet.ui.common.b.c.class, cVar2);
            }
            g2.getProviderFactory().a(com.bytedance.ies.bullet.ui.common.b.e.class, this.this$0);
            g2.getProviderFactory().a(com.bytedance.ies.bullet.ui.common.b.b.class, this.this$0);
            g2.getProviderFactory().a(com.bytedance.ies.bullet.service.base.c.class, cVar);
            g2.b(this.this$0.s());
            g2.setActivityWrapper(this.this$0.f33051a);
            this.this$0.b(g2);
            if (cVar == com.bytedance.ies.bullet.service.base.c.NONE) {
                a aVar = this.this$0;
                Uri uri = aVar.f33053c;
                if (uri == null) {
                    h.f.b.l.a("uri");
                }
                com.bytedance.ies.bullet.ui.common.b.c cVar3 = this.this$0.f33057g;
                if (cVar3 != null) {
                    bVar = cVar3.b(this.this$0);
                } else {
                    bVar = null;
                }
                aVar.a(uri, bVar, this.this$0.f33054d);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(Uri uri, Throwable th) {
        h.f.b.l.c(uri, "");
        h.f.b.l.c(th, "");
        j.b.a(this, "activity onLoadFail e: " + th.getMessage(), null, null, 6);
        com.bytedance.ies.bullet.ui.common.b.c cVar = this.f33057g;
        if (cVar != null) {
            cVar.a(uri, th);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f33051a.a(this, i2, i3, intent);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(pVar, "");
        h.f.b.l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.f.b.l.c(strArr, "");
        h.f.b.l.c(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        this.f33051a.a(this, i2, strArr, iArr);
    }

    public final void a(Uri uri, com.bytedance.ies.bullet.c.e.a.b bVar, Bundle bundle) {
        h.f.b.l.c(uri, "");
        if (this.f33055e == null) {
            j.b.a(this, "Load uri inner failed: bulletContainerView has not been initialized, finish bullet activity", com.bytedance.ies.bullet.service.base.a.p.E, null, 4);
            finish();
            return;
        }
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        bulletContainerView.a(uri, bundle, bVar, this);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        h.f.b.l.c(view, "");
        h.f.b.l.c(uri, "");
        h.f.b.l.c(iVar, "");
        InputMethodManager inputMethodManager = null;
        j.b.a(this, "activity onLoadUriSuccess", null, null, 6);
        com.bytedance.ies.bullet.ui.common.b.c cVar = this.f33057g;
        if (cVar != null) {
            cVar.a(view, uri, iVar);
        }
        if (!h.f.b.l.a(this.o.p.b(), (Object) true)) {
            return;
        }
        if (this.f33055e == null) {
            j.b.a(this, "show soft key board failed! bullet container view hasn't been initialized!", null, null, 6);
            return;
        }
        BulletContainerView bulletContainerView = this.f33055e;
        if (bulletContainerView == null) {
            h.f.b.l.a("bulletContainerView");
        }
        h.f.b.l.c(bulletContainerView, "");
        bulletContainerView.requestFocus();
        Object a2 = com.bytedance.ies.bullet.ui.common.d.c.a(bulletContainerView.getContext(), "input_method");
        if (a2 instanceof InputMethodManager) {
            inputMethodManager = a2;
        }
        InputMethodManager inputMethodManager2 = inputMethodManager;
        if (inputMethodManager2 != null) {
            inputMethodManager2.toggleSoftInput(0, 2);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
        h.f.b.l.c(iVar, "");
        h.f.b.l.c(uri, "");
        h.f.b.l.c(qVar, "");
        if (qVar instanceof com.bytedance.ies.bullet.service.f.a.b) {
            com.bytedance.ies.bullet.service.f.a.b bVar = (com.bytedance.ies.bullet.service.f.a.b) qVar;
            this.o = bVar;
            com.bytedance.ies.bullet.ui.common.d.b.a(bVar);
            com.bytedance.ies.bullet.ui.common.d.b.b(this.o);
            if (h.f.b.l.a((Object) this.o.F.b(), (Object) true)) {
                super.overridePendingTransition(R.anim.am, 0);
            }
            if (h.f.b.l.a((Object) this.o.t.b(), (Object) true)) {
                getWindow().setSoftInputMode(32);
            }
            t b2 = this.o.f32695k.b();
            if (b2 != null) {
                Integer valueOf = Integer.valueOf(b2.f32728a);
                if (!(valueOf.intValue() == -2 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup = this.f33056f;
                    if (viewGroup == null) {
                        h.f.b.l.a("rootLayout");
                    }
                    viewGroup.setBackgroundColor(intValue);
                }
            }
            t b3 = this.o.f32696l.b();
            if (b3 != null) {
                Integer valueOf2 = Integer.valueOf(b3.f32728a);
                if (!(valueOf2.intValue() == -2 || valueOf2 == null)) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup2 = this.f33056f;
                    if (viewGroup2 == null) {
                        h.f.b.l.a("rootLayout");
                    }
                    viewGroup2.setBackgroundColor(intValue2);
                }
            }
            if (this.f33057g == null) {
                if (h.f.b.l.a((Object) this.o.f32686b.b(), (Object) true)) {
                    FrameLayout frameLayout = (FrameLayout) a(R.id.emb);
                    h.f.b.l.a((Object) frameLayout, "");
                    frameLayout.setVisibility(8);
                } else {
                    if (this.f33060m == null) {
                        FrameLayout frameLayout2 = (FrameLayout) a(R.id.emb);
                        h.f.b.l.a((Object) frameLayout2, "");
                        Uri uri2 = this.f33053c;
                        if (uri2 == null) {
                            h.f.b.l.a("uri");
                        }
                        this.f33060m = a(frameLayout2, uri2);
                    }
                    if (this.f33060m == null) {
                        k.b j2 = j();
                        this.n = j2;
                        if (j2 == null) {
                            com.bytedance.ies.bullet.ui.common.view.c cVar = new com.bytedance.ies.bullet.ui.common.view.c(this, (byte) 0);
                            com.bytedance.ies.bullet.service.f.a.b bVar2 = this.o;
                            if (bVar2 != null) {
                                t b4 = bVar2.f32688d.b();
                                if (!(b4 == null || b4.f32728a == -2)) {
                                    ((FrameLayout) cVar.a(R.id.en1)).setBackgroundColor(b4.f32728a);
                                }
                                TextView textView = (TextView) cVar.a(R.id.f9l);
                                h.f.b.l.a((Object) textView, "");
                                String b5 = bVar2.f32691g.b();
                                if (b5 == null) {
                                    b5 = "";
                                }
                                textView.setText(b5);
                                t b6 = bVar2.f32692h.b();
                                if (!(b6 == null || b6.f32728a == -2)) {
                                    ((TextView) cVar.a(R.id.f9l)).setTextColor(b6.f32728a);
                                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) cVar.a(R.id.bu7);
                                    Context context = cVar.getContext();
                                    h.f.b.l.a((Object) context, "");
                                    Resources resources = context.getResources();
                                    Context context2 = cVar.getContext();
                                    h.f.b.l.a((Object) context2, "");
                                    androidx.l.a.a.i a2 = androidx.l.a.a.i.a(resources, R.drawable.ajl, context2.getTheme());
                                    if (a2 != null) {
                                        a2.setTint(b6.f32728a);
                                    } else {
                                        a2 = null;
                                    }
                                    autoRTLImageView.setImageDrawable(a2);
                                }
                                if (h.f.b.l.a((Object) bVar2.s.b(), (Object) true)) {
                                    AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) cVar.a(R.id.bvf);
                                    h.f.b.l.a((Object) autoRTLImageView2, "");
                                    autoRTLImageView2.setVisibility(0);
                                }
                            }
                            cVar.setTitleIfMissing(i());
                            cVar.setBackListener(new c(this));
                            cVar.setCloseAllListener(new d(this));
                            this.f33060m = cVar;
                            ((FrameLayout) a(R.id.emb)).addView(this.f33060m, -1, -2);
                        } else {
                            FrameLayout frameLayout3 = (FrameLayout) a(R.id.emb);
                            Uri uri3 = this.f33053c;
                            if (uri3 == null) {
                                h.f.b.l.a("uri");
                            }
                            frameLayout3.addView(j2.a(this, uri3, this.o), -1, -2);
                            j2.a(i());
                            j2.a(new e(this));
                            j2.b(new f(this));
                            com.bytedance.ies.bullet.c.e.a.b bVar3 = this.f33052b;
                            if (bVar3 != null) {
                                bVar3.b(k.b.class, this.n);
                            }
                        }
                    } else {
                        FrameLayout frameLayout4 = (FrameLayout) a(R.id.emb);
                        h.f.b.l.a((Object) frameLayout4, "");
                        if (frameLayout4.getChildCount() == 0) {
                            ((FrameLayout) a(R.id.emb)).addView(this.f33060m, -1, -2);
                        }
                    }
                    FrameLayout frameLayout5 = (FrameLayout) a(R.id.emb);
                    h.f.b.l.a((Object) frameLayout5, "");
                    frameLayout5.setVisibility(0);
                }
            }
            w();
        }
        com.bytedance.ies.bullet.ui.common.b.c cVar2 = this.f33057g;
        if (cVar2 != null) {
            cVar2.a(iVar, uri, qVar);
        }
    }
}
