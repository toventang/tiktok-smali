package com.ss.android.ugc.aweme.adaptation;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.ah;
import com.ss.android.ugc.aweme.shortvideo.dh;

public abstract class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public boolean f66250d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f66251e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66252f = true;

    /* renamed from: g  reason: collision with root package name */
    private View f66253g;

    /* renamed from: h  reason: collision with root package name */
    private int f66254h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnLayoutChangeListener f66255i = new i(this);

    static {
        Covode.recordClassIndex(40705);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public abstract void b(boolean z);

    /* access modifiers changed from: protected */
    public boolean cv_() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    public final void cu_() {
        h();
        j();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public void onDestroy() {
        super.onDestroy();
        View view = this.f66253g;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f66255i);
            this.f66255i = null;
        }
    }

    private void j() {
        switch (a.f66177a.a()) {
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

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public void onResume() {
        super.onResume();
        if (this.f66252f) {
            this.f66252f = false;
            int d2 = dh.d(this);
            this.f66254h = d2;
            if (d2 != a.f66177a.b()) {
                a.f66177a.a(this.f66254h);
            }
            cu_();
            if (this.f66250d) {
                this.f66253g.addOnLayoutChangeListener(this.f66255i);
            } else {
                this.f66253g.removeOnLayoutChangeListener(this.f66255i);
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        super.onStart();
        if (this.f66251e) {
            this.f66251e = false;
            getWindow().clearFlags(1024);
            ah.a(this);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            getWindow().getDecorView().setBackgroundColor(-16777216);
            a(dh.c(this), a.c());
            this.f66253g = findViewById(16908290);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f66250d = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, int i3) {
        int d2;
        if (i2 != i3 && cv_() && this.f66254h != (d2 = dh.d(this))) {
            this.f66254h = d2;
            a.f66177a.a(d2);
            cu_();
        }
    }
}
