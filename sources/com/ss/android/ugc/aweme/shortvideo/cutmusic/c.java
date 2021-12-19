package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.g;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.h;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.zhiliaoapp.musically.R;

public final class c implements g, h.a, h.b {

    /* renamed from: a  reason: collision with root package name */
    public d f126340a;

    /* renamed from: b  reason: collision with root package name */
    private View f126341b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f126342c;

    /* renamed from: d  reason: collision with root package name */
    private h f126343d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f126344e;

    static {
        Covode.recordClassIndex(82911);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.g
    public final boolean a() {
        MethodCollector.i(10187);
        View view = this.f126341b;
        if (view != null) {
            this.f126342c.removeView(view);
            this.f126341b = null;
            MethodCollector.o(10187);
            return true;
        }
        MethodCollector.o(10187);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.h.b
    public final void b(int i2) {
        this.f126344e.d(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.h.a
    public final void c(int i2) {
        a();
        this.f126344e.e(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.g
    public final void a(int i2) {
        h hVar = this.f126343d;
        if (hVar != null && hVar.f126389f != null && hVar.f126389f.getVisibility() == 0) {
            hVar.f126389f.b((((float) (i2 - hVar.f126391h)) * 1.0f) / ((float) hVar.f126392i));
        }
    }

    public c(FrameLayout frameLayout, g.a aVar) {
        this.f126342c = frameLayout;
        this.f126344e = aVar;
    }

    public final void a(int i2, int i3, int i4) {
        MethodCollector.i(10028);
        View a2 = a.a(LayoutInflater.from(this.f126342c.getContext()), R.layout.aep, this.f126342c, false);
        this.f126341b = a2;
        this.f126342c.addView(a2);
        h a3 = h.a(this.f126341b, i2, i3, i4);
        a3.f126393j = this;
        a3.f126394k = this;
        this.f126343d = a3;
        a3.a(k.a(this.f126340a), i2, i3);
        this.f126341b.setAlpha(0.0f);
        this.f126341b.animate().alpha(1.0f).setDuration(200).start();
        MethodCollector.o(10028);
    }
}
