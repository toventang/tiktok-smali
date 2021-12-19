package com.ss.android.ugc.aweme.qrcode.f;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.qrcode.j;

public final class b extends a {
    static {
        Covode.recordClassIndex(77802);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.b
    public final com.ss.android.ugc.aweme.qrcode.d.b a() {
        return new e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ BitmapDrawable b() {
        try {
            if (this.f119845a.a()) {
                return new BitmapDrawable(getResources(), this.f119845a.d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public b(Context context) {
        super(context);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.a, com.ss.android.ugc.aweme.qrcode.f.a
    public final void a(Exception exc) {
        if (!this.f119849e) {
            super.a(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) {
        if (iVar.d() == null) {
            return null;
        }
        ((a) this.f119846b.getHierarchy()).b(0);
        ((a) this.f119846b.getHierarchy()).a((Drawable) iVar.d(), q.b.f47442h);
        this.f119850f = true;
        return null;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.f.a, com.ss.android.ugc.aweme.qrcode.view.b
    public final void setData(j jVar) {
        super.setData(jVar);
        if (this.f119845a.a()) {
            this.f119849e = true;
            Uri fromFile = Uri.fromFile(this.f119845a.d());
            k.a().e().a(fromFile);
            RemoteImageView remoteImageView = this.f119846b;
            com.facebook.drawee.a.a.e a2 = c.b().b(fromFile);
            a2.f47325m = this.f119846b.getController();
            a2.f47319g = this.f119851g;
            remoteImageView.setController(a2.e());
            if (this.f119847c != null) {
                this.f119847c.c();
            }
            i.b(new c(this), i.f4824a).a(new d(this), i.f4826c, null);
        }
    }
}
