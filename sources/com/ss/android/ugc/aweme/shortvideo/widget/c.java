package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.c.g;
import com.facebook.imagepipeline.j.d;
import com.ss.android.ugc.aweme.shortvideo.cut.model.a;
import f.a.d.f;
import h.p;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f132907a;

    /* renamed from: b  reason: collision with root package name */
    private final a f132908b;

    static {
        Covode.recordClassIndex(86936);
    }

    c(a aVar, a aVar2) {
        this.f132907a = aVar;
        this.f132908b = aVar2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        com.facebook.common.h.c cVar;
        a aVar = this.f132907a;
        a aVar2 = this.f132908b;
        Bitmap bitmap = (Bitmap) ((p) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (aVar.f132889b) {
                cVar = g.a();
            } else {
                cVar = (f) f.f132910a.getValue();
            }
            aVar2.a(com.facebook.common.h.a.a(new d(bitmap, cVar, com.facebook.imagepipeline.j.g.f48000a)));
        }
    }
}
