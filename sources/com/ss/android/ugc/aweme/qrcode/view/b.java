package com.ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.c;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.j;
import com.ss.android.ugc.aweme.qrcode.presenter.e;

public abstract class b extends LinearLayout implements com.ss.android.ugc.aweme.qrcode.presenter.a {

    /* renamed from: a  reason: collision with root package name */
    protected e f119845a;

    /* renamed from: b  reason: collision with root package name */
    protected RemoteImageView f119846b;

    /* renamed from: c  reason: collision with root package name */
    protected a f119847c;

    /* renamed from: d  reason: collision with root package name */
    protected j f119848d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f119849e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f119850f;

    /* renamed from: g  reason: collision with root package name */
    protected c<f> f119851g;

    public interface a {
        static {
            Covode.recordClassIndex(77870);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(77867);
    }

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i2);

    public abstract void setQRCodeCardTitleColor(int i2);

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.aweme.qrcode.d.b a() {
        return new com.ss.android.ugc.aweme.qrcode.d.b();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f119847c;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f119845a.b();
        this.f119847c = null;
    }

    public void setOnBindQrCodeListener(a aVar) {
        this.f119847c = aVar;
    }

    public void setData(j jVar) {
        this.f119848d = jVar;
        setData(jVar.objectId);
    }

    public void a(Context context) {
        this.f119845a = new e(a(), this);
        this.f119851g = new c<f>() {
            /* class com.ss.android.ugc.aweme.qrcode.view.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77868);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                b.this.f119850f = true;
            }
        };
    }

    public static String a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        }
        return urlModel.getUrlList().get(0);
    }

    public final void b(final com.ss.android.ugc.aweme.qrcode.d.a aVar) {
        if (aVar != null) {
            String a2 = a(aVar.f119728a);
            if (com.ss.android.ugc.aweme.base.e.a(Uri.parse(a2))) {
                RemoteImageView remoteImageView = this.f119846b;
                com.facebook.drawee.a.a.e a3 = com.facebook.drawee.a.a.c.b().b(Uri.parse(a2));
                a3.f47325m = this.f119846b.getController();
                a3.f47319g = this.f119851g;
                remoteImageView.setController(a3.e());
                if (!this.f119845a.a()) {
                    this.f119845a.a(a2);
                }
                a aVar2 = this.f119847c;
                if (aVar2 != null) {
                    aVar2.a();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.base.e.a(aVar.f119728a, new e.a() {
                /* class com.ss.android.ugc.aweme.qrcode.view.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(77869);
                }

                @Override // com.ss.android.ugc.aweme.base.e.a
                public final void a() {
                    RemoteImageView remoteImageView = b.this.f119846b;
                    com.facebook.drawee.a.a.e a2 = com.facebook.drawee.a.a.c.b().b(Uri.parse(b.a(aVar.f119728a)));
                    a2.f47325m = b.this.f119846b.getController();
                    a2.f47319g = b.this.f119851g;
                    remoteImageView.setController(a2.e());
                    if (b.this.f119847c != null) {
                        b.this.f119847c.a();
                    }
                    b.this.f119845a.a(b.a(aVar.f119728a));
                }

                @Override // com.ss.android.ugc.aweme.base.e.a
                public final void a(Exception exc) {
                    b.this.c();
                }
            });
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
    }
}
