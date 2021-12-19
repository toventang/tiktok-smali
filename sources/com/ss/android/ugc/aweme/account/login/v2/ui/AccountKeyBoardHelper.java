package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class AccountKeyBoardHelper implements ViewTreeObserver.OnGlobalLayoutListener, au {

    /* renamed from: c  reason: collision with root package name */
    public static final h f64745c = i.a(m.NONE, b.f64755a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f64746d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public k f64747a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f64748b;

    /* renamed from: e  reason: collision with root package name */
    private final h f64749e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f64750f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final Rect f64751g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private Boolean f64752h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f64753i = true;

    /* renamed from: j  reason: collision with root package name */
    private final View f64754j;

    public final int a() {
        return ((Number) this.f64749e.getValue()).intValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            startListen();
        } else if (aVar == i.a.ON_PAUSE) {
            stopListen();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39798);
        }

        public static boolean a() {
            return ((Boolean) AccountKeyBoardHelper.f64745c.getValue()).booleanValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ AccountKeyBoardHelper this$0;

        static {
            Covode.recordClassIndex(39800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AccountKeyBoardHelper accountKeyBoardHelper) {
            super(0);
            this.this$0 = accountKeyBoardHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.a() / 3);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void startListen() {
        this.f64754j.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @v(a = i.a.ON_PAUSE)
    public final void stopListen() {
        this.f64754j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64755a = new b();

        static {
            Covode.recordClassIndex(39799);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (n.b(com.bytedance.ies.ugc.appcontext.d.a()) >= 1183) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(39797);
    }

    static final class d extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ AccountKeyBoardHelper this$0;

        static {
            Covode.recordClassIndex(39801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AccountKeyBoardHelper accountKeyBoardHelper) {
            super(0);
            this.this$0 = accountKeyBoardHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Window window;
            View decorView;
            View rootView;
            e activity = this.this$0.f64748b.getActivity();
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
                i2 = 0;
            } else {
                i2 = rootView.getHeight();
            }
            return Integer.valueOf(i2);
        }
    }

    public final void onGlobalLayout() {
        Window window;
        View decorView;
        boolean z = false;
        if (this.f64753i) {
            this.f64753i = false;
            return;
        }
        this.f64751g.setEmpty();
        e activity = this.f64748b.getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.getWindowVisibleDisplayFrame(this.f64751g);
        }
        if (a() - this.f64751g.bottom > ((Number) this.f64750f.getValue()).intValue()) {
            z = true;
        }
        if (!l.a(Boolean.valueOf(z), this.f64752h)) {
            this.f64752h = Boolean.valueOf(z);
            if (z) {
                k kVar = this.f64747a;
                if (kVar != null) {
                    kVar.f();
                    return;
                }
                return;
            }
            k kVar2 = this.f64747a;
            if (kVar2 != null) {
                kVar2.u();
            }
        }
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        l.d(view, "");
        l.d(fragment, "");
        this.f64754j = view;
        this.f64748b = fragment;
        fragment.getLifecycle().a(this);
    }
}
