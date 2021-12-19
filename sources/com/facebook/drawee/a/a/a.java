package com.facebook.drawee.a.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.i;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.p.b;

public final class a implements com.facebook.imagepipeline.h.a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f47208a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.h.a f47209b;

    static {
        Covode.recordClassIndex(28719);
    }

    @Override // com.facebook.imagepipeline.h.a
    public final boolean a(c cVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.h.a
    public final Drawable b(c cVar) {
        boolean z;
        try {
            b.a();
            if (cVar instanceof d) {
                d dVar = (d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f47208a, dVar.f47984a);
                boolean z2 = false;
                if (dVar.f47985b == 0 || dVar.f47985b == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (!(dVar.f47986c == 1 || dVar.f47986c == 0)) {
                        z2 = true;
                    }
                    if (!z2) {
                        b.a();
                        return bitmapDrawable;
                    }
                }
                i iVar = new i(bitmapDrawable, dVar.f47985b, dVar.f47986c);
                b.a();
                return iVar;
            }
            com.facebook.imagepipeline.h.a aVar = this.f47209b;
            if (aVar == null || !aVar.a(cVar)) {
                b.a();
                return null;
            }
            Drawable b2 = this.f47209b.b(cVar);
            b.a();
            return b2;
        } catch (Throwable th) {
            b.a();
            throw th;
        }
    }

    public a(Resources resources, com.facebook.imagepipeline.h.a aVar) {
        this.f47208a = resources;
        this.f47209b = aVar;
    }
}
