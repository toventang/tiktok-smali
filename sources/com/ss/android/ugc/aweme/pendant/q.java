package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import h.f.b.l;

public final class q extends h {
    static {
        Covode.recordClassIndex(73833);
    }

    @Override // com.ss.android.ugc.aweme.pendant.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.pendant.h
    public final void a(v vVar) {
        l.d(vVar, "");
        vVar.f39907c = true;
        vVar.u = Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, i iVar) {
        super(context, view, smartImageView, smartImageView2, view2, view3, iVar);
        l.d(context, "");
        l.d(view, "");
        l.d(smartImageView, "");
        l.d(smartImageView2, "");
        l.d(view2, "");
        l.d(view3, "");
        l.d(iVar, "");
    }
}
