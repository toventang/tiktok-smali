package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.f.g;
import com.ss.android.ugc.aweme.editSticker.interact.view.a;
import com.ss.android.vesdk.VESize;

final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f98019a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f98020b;

    static {
        Covode.recordClassIndex(62307);
    }

    ad(i iVar, FrameLayout frameLayout) {
        this.f98019a = iVar;
        this.f98020b = frameLayout;
    }

    public final void run() {
        MethodCollector.i(5571);
        i iVar = this.f98019a;
        FrameLayout frameLayout = this.f98020b;
        VESize b2 = iVar.r.b();
        if (b2.width == 0 || b2.height == 0) {
            MethodCollector.o(5571);
            return;
        }
        int[] a2 = g.a(frameLayout, b2.width, b2.height);
        iVar.C = a2[0];
        iVar.D = a2[1];
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        iVar.E = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
        a aVar = d.c().f88097d;
        if (aVar != null) {
            iVar.F = aVar.a(iVar.f98068c, iVar.C);
            frameLayout.addView(iVar.F.getContentView());
        }
        MethodCollector.o(5571);
    }
}
