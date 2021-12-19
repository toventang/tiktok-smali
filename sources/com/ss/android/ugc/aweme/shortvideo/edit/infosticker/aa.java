package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.a;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.vesdk.VESize;

public final /* synthetic */ class aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f127099a;

    static {
        Covode.recordClassIndex(83384);
    }

    public aa(i iVar) {
        this.f127099a = iVar;
    }

    public final void onGlobalLayout() {
        i iVar = this.f127099a;
        if (iVar.s != null) {
            VESize b2 = iVar.s.b();
            iVar.D = (dh.b(iVar.f127154c) - b2.width) >> 1;
            iVar.E = (((dh.e(iVar.f127154c) - a.f66177a.f()) - b2.height) / 2) + a.f66177a.d();
        }
    }
}
