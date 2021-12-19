package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.a;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.vesdk.VESize;

final /* synthetic */ class aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f98016a;

    static {
        Covode.recordClassIndex(62304);
    }

    aa(i iVar) {
        this.f98016a = iVar;
    }

    public final void onGlobalLayout() {
        i iVar = this.f98016a;
        if (iVar.r != null) {
            VESize b2 = iVar.r.b();
            iVar.C = (dh.b(iVar.f98068c) - b2.width) >> 1;
            iVar.D = (((dh.e(iVar.f98068c) - a.f66177a.f()) - b2.height) / 2) + a.f66177a.d();
        }
    }
}
