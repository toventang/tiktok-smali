package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.c;
import f.a.d.g;
import java.io.File;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f128799a;

    /* renamed from: b  reason: collision with root package name */
    private final g f128800b;

    /* renamed from: c  reason: collision with root package name */
    private final String f128801c;

    static {
        Covode.recordClassIndex(84500);
    }

    e(c cVar, g gVar, String str) {
        this.f128799a = cVar;
        this.f128800b = gVar;
        this.f128801c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f128799a;
        g gVar = this.f128800b;
        String str = this.f128801c;
        Bitmap a2 = cVar.a();
        if (a2 == null) {
            return null;
        }
        if (gVar != null) {
            a2 = (Bitmap) gVar.apply(a2);
        }
        c.a(a2, new File(str), 60, Bitmap.CompressFormat.PNG);
        c.a(a2);
        return null;
    }
}
