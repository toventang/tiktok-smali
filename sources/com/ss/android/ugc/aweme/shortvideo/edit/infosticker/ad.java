package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.f.g;
import com.ss.android.ugc.aweme.editSticker.interact.view.a;
import com.ss.android.vesdk.VESize;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f127102a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f127103b;

    static {
        Covode.recordClassIndex(83387);
    }

    public ad(i iVar, FrameLayout frameLayout) {
        this.f127102a = iVar;
        this.f127103b = frameLayout;
    }

    public final void run() {
        MethodCollector.i(3669);
        i iVar = this.f127102a;
        FrameLayout frameLayout = this.f127103b;
        VESize b2 = iVar.s.b();
        if (b2.width == 0 || b2.height == 0) {
            MethodCollector.o(3669);
            return;
        }
        int[] a2 = g.a(frameLayout, b2.width, b2.height);
        iVar.D = a2[0];
        iVar.E = a2[1];
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        iVar.F = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
        a aVar = d.c().f88097d;
        if (aVar != null) {
            iVar.G = aVar.a(iVar.f127154c, iVar.D);
            frameLayout.addView(iVar.G.getContentView());
        }
        MethodCollector.o(3669);
    }
}
