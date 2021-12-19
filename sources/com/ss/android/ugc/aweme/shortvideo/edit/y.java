package com.ss.android.ugc.aweme.shortvideo.edit;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.vesdk.VESize;
import h.f.b.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f128063a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(83926);
    }

    public static final boolean a(g gVar, bq bqVar, d... dVarArr) {
        l.d(gVar, "");
        l.d(bqVar, "");
        l.d(dVarArr, "");
        if (bqVar.a() == bqVar.a(true) && bqVar.b() == bqVar.b(true)) {
            return false;
        }
        VESize b2 = gVar.b();
        int a2 = bqVar.a(true);
        int b3 = bqVar.b(true);
        bqVar.a();
        bqVar.b();
        float f2 = (((float) b2.height) - (((float) b3) * ((((float) b2.width) * 1.0f) / ((float) a2)))) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f2, (float) b2.width, ((float) b2.height) - f2);
        boolean z = false;
        for (d dVar : dVarArr) {
            if (dVar != null) {
                z |= dVar.a(rectF);
            }
        }
        return z;
    }
}
