package com.squareup.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;

/* access modifiers changed from: package-private */
public final class l extends a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    e f58050m;

    static {
        Covode.recordClassIndex(36066);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.b.a
    public final void b() {
        super.b();
        if (this.f58050m != null) {
            this.f58050m = null;
        }
    }

    @Override // com.squareup.b.a
    public final void a() {
        ImageView imageView = (ImageView) this.f57957c.get();
        if (imageView != null) {
            if (this.f57961g != 0) {
                imageView.setImageResource(this.f57961g);
            } else if (this.f57962h != null) {
                imageView.setImageDrawable(this.f57962h);
            }
        }
    }

    @Override // com.squareup.b.a
    public final void a(Bitmap bitmap, t.d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f57957c.get();
            if (imageView != null) {
                u.a(imageView, this.f57955a.f58076d, bitmap, dVar, this.f57958d, this.f57955a.f58084l);
                e eVar = this.f58050m;
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(a.a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    l(t tVar, ImageView imageView, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(tVar, imageView, wVar, i2, i3, i4, drawable, str, obj, z);
        this.f58050m = eVar;
    }
}
