package com.ss.android.ugc.aweme.ecommerce.gallery.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e.a.a;
import com.ss.android.ugc.aweme.ecommerce.gallery.a.c;

final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f85960a;

    /* renamed from: b  reason: collision with root package name */
    private final c.b f85961b;

    static {
        Covode.recordClassIndex(53824);
    }

    b(a aVar, c.b bVar) {
        this.f85960a = aVar;
        this.f85961b = bVar;
    }

    @Override // com.ss.android.ugc.aweme.base.e.a.a
    public final void a(Object obj) {
        c.b bVar = this.f85961b;
        Bitmap bitmap = (Bitmap) obj;
        if (bVar == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bVar.a(null);
        } else {
            bVar.a(new BitmapDrawable(a.a(bitmap)));
        }
    }
}
