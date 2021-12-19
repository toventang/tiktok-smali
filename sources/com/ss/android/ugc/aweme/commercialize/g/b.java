package com.ss.android.ugc.aweme.commercialize.g;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.facebook.drawee.c.d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collection;

public final class b {

    public interface a {
        static {
            Covode.recordClassIndex(45914);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(45912);
    }

    public static boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return k.a().d().d(j.a().a(com.facebook.imagepipeline.o.b.fromUri(uri)));
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        a(simpleDraweeView, urlModel, new a(simpleDraweeView));
    }

    public static void a(String str, final a aVar) {
        if (str != null && !str.isEmpty() && !a(Uri.parse(str))) {
            k.a().e().c(com.facebook.imagepipeline.o.b.fromUri(str), null).a(new com.facebook.d.b<Void>() {
                /* class com.ss.android.ugc.aweme.commercialize.g.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(45913);
                }

                @Override // com.facebook.d.b
                public final void onFailureImpl(c<Void> cVar) {
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.b();
                    }
                }

                @Override // com.facebook.d.b
                public final void onNewResultImpl(c<Void> cVar) {
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }, com.bytedance.ies.android.base.runtime.b.a.a());
        }
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, d dVar) {
        com.facebook.imagepipeline.o.b[] a2;
        if (simpleDraweeView != null && simpleDraweeView.getContext() != null && urlModel != null && !com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList()) && (a2 = e.a(urlModel, Bitmap.Config.ARGB_8888)) != null && a2.length != 0) {
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            b2.f47322j = false;
            com.facebook.drawee.c.b a3 = b2.a(a2);
            a3.f47319g = e.a(dVar);
            simpleDraweeView.setController(a3.e());
        }
    }
}
