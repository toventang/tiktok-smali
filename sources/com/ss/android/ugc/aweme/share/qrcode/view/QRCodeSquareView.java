package com.ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.share.api.ShareQRCodeApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public class QRCodeSquareView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    String f124221a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f124222b;

    /* renamed from: c  reason: collision with root package name */
    public String f124223c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.drawee.c.c<f> f124224d;

    static {
        Covode.recordClassIndex(81585);
    }

    public QRCodeSquareView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final com.facebook.drawee.c.c<f> getImageLoadListener() {
        return this.f124224d;
    }

    public final String getQrCodeUrl() {
        return this.f124223c;
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeSquareView f124225a;

        static {
            Covode.recordClassIndex(81586);
        }

        @Override // com.ss.android.ugc.aweme.base.e.a
        public final void a(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.e.a
        public final void a() {
            QRCodeSquareView qRCodeSquareView = this.f124225a;
            com.facebook.drawee.a.a.e a2 = com.facebook.drawee.a.a.c.b().b(Uri.parse(this.f124225a.f124223c));
            a2.f47325m = this.f124225a.getController();
            a2.f47319g = this.f124225a.getImageLoadListener();
            qRCodeSquareView.setController(a2.e());
            r.a("qr_code_generate", new d().a("qr_code_type", "general").a("enter_from", this.f124225a.f124221a).f66730a);
            l.d(this.f124225a.f124223c, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(QRCodeSquareView qRCodeSquareView) {
            this.f124225a = qRCodeSquareView;
        }
    }

    public static final class b extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeSquareView f124226a;

        static {
            Covode.recordClassIndex(81587);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(QRCodeSquareView qRCodeSquareView) {
            this.f124226a = qRCodeSquareView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            this.f124226a.f124222b = true;
        }
    }

    public static final class c implements ShareQRCodeApi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeSquareView f124227a;

        static {
            Covode.recordClassIndex(81588);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(QRCodeSquareView qRCodeSquareView) {
            this.f124227a = qRCodeSquareView;
        }

        @Override // com.ss.android.ugc.aweme.share.api.ShareQRCodeApi.a
        public final void a(Exception exc) {
            com.ss.android.ugc.aweme.app.api.b.a.a(this.f124227a.getContext(), (Throwable) exc, (int) R.string.g4j);
        }

        @Override // com.ss.android.ugc.aweme.share.api.ShareQRCodeApi.a
        public final void a(com.ss.android.ugc.aweme.qrcode.d.a aVar) {
            List<String> urlList;
            if (aVar != null) {
                QRCodeSquareView qRCodeSquareView = this.f124227a;
                UrlModel urlModel = aVar.f119728a;
                String str = "";
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null || !(!urlList.isEmpty()))) {
                    String str2 = urlList.get(0);
                    l.b(str2, str);
                    str = str2;
                }
                qRCodeSquareView.f124223c = str;
                e.a(aVar.f119728a, new a(qRCodeSquareView));
            }
        }
    }

    private /* synthetic */ QRCodeSquareView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    public final void a(int i2, String str, String str2) {
        l.d(str2, "");
        this.f124221a = str2;
        ShareQRCodeApi.a(i2, str, new c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QRCodeSquareView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f124223c = "";
        this.f124224d = new b(this);
    }
}
