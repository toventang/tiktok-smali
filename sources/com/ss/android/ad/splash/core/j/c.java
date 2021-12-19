package com.ss.android.ad.splash.core.j;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.d.a;
import com.ss.android.ad.splash.core.d.b;
import com.ss.android.ad.splash.core.p;
import com.ss.android.ad.splash.core.video2.g;
import com.ss.android.ad.splash.core.video2.h;

public final class c extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ad.splash.core.d.c f58635a;

    /* renamed from: b  reason: collision with root package name */
    public a f58636b;

    /* renamed from: c  reason: collision with root package name */
    public b f58637c;

    /* renamed from: d  reason: collision with root package name */
    public p f58638d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ad.splash.core.e.b f58639e;

    /* renamed from: f  reason: collision with root package name */
    public int f58640f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f58641g = -1;

    static {
        Covode.recordClassIndex(36356);
    }

    public final void b() {
        a aVar = this.f58636b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final g getBDAVideoController() {
        return getController();
    }

    private g getController() {
        a aVar = this.f58636b;
        if (aVar != null) {
            return aVar.a(this.f58640f);
        }
        return null;
    }

    public final void a() {
        if (getController() != null) {
            this.f58641g = 2;
            getController().b();
        }
        p pVar = this.f58638d;
        if (pVar != null) {
            pVar.a(this.f58639e, 2 - this.f58640f);
        }
    }

    public final void setBreakReason(int i2) {
        this.f58641g = i2;
    }

    public final void setSplashAdInteraction(p pVar) {
        this.f58638d = pVar;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.f58635a.setGestureDetector(gestureDetector);
    }

    public final void setOnPageChangeListener(b bVar) {
        if (bVar != null) {
            this.f58637c = bVar;
        }
    }

    public final void setMute(boolean z) {
        if (getController() != null) {
            getController().a(z);
        }
    }

    public c(Context context) {
        super(context);
        MethodCollector.i(4885);
        MethodCollector.o(4885);
    }

    public final void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        for (h hVar : this.f58636b.f58425b) {
            hVar.setSurfaceLayoutParams(layoutParams);
        }
    }
}
