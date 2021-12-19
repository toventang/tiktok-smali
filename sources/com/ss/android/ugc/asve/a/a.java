package com.ss.android.ugc.asve.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import h.f.b.l;

public final class a implements ax.g {
    static {
        Covode.recordClassIndex(38066);
    }

    @Override // com.ss.android.vesdk.ax.g
    public final BefTextLayoutResult a(String str, BefTextLayout befTextLayout) {
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        com.ss.android.ugc.asve.g.a aVar = new com.ss.android.ugc.asve.g.a(befTextLayout);
        Bitmap a2 = aVar.a(str);
        befTextLayoutResult.setBitmap(a2);
        befTextLayoutResult.setLineCount(aVar.f62094c);
        l.b(a2, "");
        befTextLayoutResult.setHeight(a2.getHeight());
        befTextLayoutResult.setWidth(a2.getWidth());
        return befTextLayoutResult;
    }
}
