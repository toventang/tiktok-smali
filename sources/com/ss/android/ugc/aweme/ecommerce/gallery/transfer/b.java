package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.gallery.a.c;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b extends f {
    static {
        Covode.recordClassIndex(53840);
    }

    b(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.f
    public final c c(int i2) {
        d transConfig = this.f86041a.getTransConfig();
        List<ImageView> a2 = transConfig.a();
        if (a2.size() <= i2 || a2.get(i2) == null) {
            return null;
        }
        c a3 = a(a2.get(i2));
        a(transConfig.f86005k.get(i2), a3, false);
        this.f86041a.addView(a3, 1);
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.f
    public final c a(int i2) {
        d transConfig = this.f86041a.getTransConfig();
        c a2 = a(transConfig.a().get(i2));
        a(transConfig.f86005k.get(i2), a2, true);
        this.f86041a.addView(a2, 1);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.f
    public final void b(int i2) {
        this.f86041a.getTransAdapter();
        d transConfig = this.f86041a.getTransConfig();
        c a2 = this.f86041a.getTransAdapter().a(i2);
        com.ss.android.ugc.aweme.ecommerce.gallery.a.c b2 = transConfig.b();
        if (transConfig.f85999e) {
            a(a2.getDrawable(), i2, a2);
        } else if (b2.b(transConfig.f86005k.get(i2))) {
            b2.a(new c(this, transConfig, i2, a2));
        } else {
            a(transConfig.a(this.f86042b), i2, a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.f
    public final void a(c cVar, int i2) {
        Drawable a2;
        d transConfig = this.f86041a.getTransConfig();
        com.ss.android.ugc.aweme.ecommerce.gallery.a.c b2 = transConfig.b();
        String str = transConfig.f86005k.get(i2);
        if (!b2.b(str) || (a2 = b2.a(str)) == null) {
            cVar.setImageDrawable(transConfig.a(this.f86042b));
        } else {
            cVar.setImageDrawable(a2);
        }
    }

    private void a(Drawable drawable, int i2, final c cVar) {
        final d transConfig = this.f86041a.getTransConfig();
        cVar.f86064i = false;
        this.f86041a.a(cVar, i2);
        transConfig.b().a(transConfig.f86004j.get(i2), cVar, drawable, new c.a() {
            /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(53841);
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.gallery.a.c.a
            public final void a(int i2) {
                if (i2 == 0) {
                    cVar.setImageDrawable(transConfig.a(b.this.f86042b));
                } else if (i2 == 1) {
                    cVar.f86064i = true;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar, int i2, com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c cVar, Drawable drawable) {
        if (drawable == null) {
            drawable = dVar.a(this.f86042b);
        }
        a(drawable, i2, cVar);
    }
}
