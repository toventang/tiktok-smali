package com.ss.android.ugc.aweme.property;

import android.database.ContentObserver;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public final class LifecycleContentObserver extends ContentObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    public final e f118316a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f118317b;

    static {
        Covode.recordClassIndex(76836);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        a();
    }

    private final void a() {
        if (!this.f118317b) {
            this.f118317b = true;
            this.f118316a.getLifecycle().b(this);
            this.f118316a.getContentResolver().unregisterContentObserver(this);
        }
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        Window window = this.f118316a.getWindow();
        l.b(window, "");
        Window window2 = this.f118316a.getWindow();
        l.b(window2, "");
        WindowManager.LayoutParams attributes = window2.getAttributes();
        attributes.screenBrightness = 2.0f;
        window.setAttributes(attributes);
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleContentObserver(e eVar, Handler handler) {
        super(handler);
        l.d(eVar, "");
        l.d(handler, "");
        this.f118316a = eVar;
        eVar.getLifecycle().a(this);
    }
}
