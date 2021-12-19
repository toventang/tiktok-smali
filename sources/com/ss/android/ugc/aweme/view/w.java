package com.ss.android.ugc.aweme.view;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.ah;
import com.ss.android.ugc.aweme.shortvideo.dh;

public abstract class w extends b {

    /* renamed from: b  reason: collision with root package name */
    private boolean f144296b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f144297c = true;

    /* renamed from: d  reason: collision with root package name */
    private View f144298d;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnLayoutChangeListener f144299e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    public boolean f144300f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f144301g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f144302h;

    static {
        Covode.recordClassIndex(94450);
    }

    /* access modifiers changed from: protected */
    public abstract void E();

    /* access modifiers changed from: protected */
    public void a(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public abstract void b(boolean z);

    public final void M() {
        E();
        F();
    }

    @Override // com.bytedance.scene.j
    public void n_() {
        super.n_();
        c(false);
    }

    private final void F() {
        switch (com.ss.android.ugc.aweme.adaptation.a.f66177a.a()) {
            case 1:
            case 4:
                a(true);
                b(true);
                return;
            case 2:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                a(false);
                b(true);
                return;
            case 3:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                a(true);
                b(false);
                return;
            default:
                a(false);
                b(false);
                return;
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (this.f144297c) {
            this.f144297c = false;
            int d2 = dh.d(this.f42913m);
            this.f144302h = d2;
            if (d2 != com.ss.android.ugc.aweme.adaptation.a.f66177a.b()) {
                com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f144302h);
            }
            M();
            c(this.f144300f);
        }
    }

    @Override // com.bytedance.scene.j
    public final void v() {
        View view;
        Window window;
        View decorView;
        Activity activity;
        Window window2;
        Window window3;
        super.v();
        if (this.f144296b) {
            this.f144296b = false;
            Activity activity2 = this.f42913m;
            if (!(activity2 == null || (window3 = activity2.getWindow()) == null)) {
                window3.clearFlags(1024);
            }
            ah.a(this.f42913m);
            if (!(Build.VERSION.SDK_INT < 21 || (activity = this.f42913m) == null || (window2 = activity.getWindow()) == null)) {
                window2.setNavigationBarColor(-16777216);
            }
            Activity activity3 = this.f42913m;
            if (!(activity3 == null || (window = activity3.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundColor(-16777216);
            }
            a(dh.c(this.f42913m), com.ss.android.ugc.aweme.adaptation.a.c());
            Activity activity4 = this.f42913m;
            if (activity4 != null) {
                view = activity4.findViewById(16908290);
            } else {
                view = null;
            }
            this.f144298d = view;
        }
    }

    private final void c(boolean z) {
        if (z) {
            View view = this.f144298d;
            if (view != null) {
                view.addOnLayoutChangeListener(this.f144299e);
                return;
            }
            return;
        }
        View view2 = this.f144298d;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.f144299e);
        }
    }

    static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f144303a;

        static {
            Covode.recordClassIndex(94451);
        }

        a(w wVar) {
            this.f144303a = wVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int d2;
            if (i5 != i9 && this.f144303a.f144301g && this.f144303a.f144302h != (d2 = dh.d(this.f144303a.f42913m))) {
                this.f144303a.f144302h = d2;
                com.ss.android.ugc.aweme.adaptation.a.f66177a.a(d2);
                this.f144303a.M();
            }
        }
    }
}
