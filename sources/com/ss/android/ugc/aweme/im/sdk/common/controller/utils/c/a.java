package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.i;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102397a = new a();

    public static final void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        a(remoteImageView, urlModel, (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
    }

    public static final void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3) {
        a(remoteImageView, urlModel, (d) null, i2, i3, (com.facebook.drawee.c.d) null, 32);
    }

    public static final void a(RemoteImageView remoteImageView, UrlModel urlModel, d dVar) {
        a(remoteImageView, urlModel, dVar, 0, 0, (com.facebook.drawee.c.d) null, 56);
    }

    private a() {
    }

    private static boolean a(UrlModel urlModel) {
        return f.a() && b(urlModel);
    }

    public static final void a(RemoteImageView remoteImageView, String str) {
        if (remoteImageView != null && str != null) {
            if (!g.a() || !i.a(str)) {
                e.b(remoteImageView, str, -1, -1);
            } else {
                com.ss.android.ugc.aweme.im.service.m.a.c("MessageFrescoHelper", "bindImage with illegal url ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(65548);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a$a  reason: collision with other inner class name */
    public static final class C2567a implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f102398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f102399b;

        static {
            Covode.recordClassIndex(65549);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final boolean a() {
            o oVar = this.f102398a;
            if (oVar != null) {
                return oVar.a();
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str) {
            o oVar = this.f102398a;
            if (oVar != null) {
                oVar.a(str);
            }
            this.f102399b.onSubmit(str, null);
        }

        C2567a(o oVar, b bVar) {
            this.f102398a = oVar;
            this.f102399b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, Throwable th) {
            o oVar = this.f102398a;
            if (oVar != null) {
                oVar.a(str, th);
            }
            this.f102399b.onFailure(str, th);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            o oVar = this.f102398a;
            if (oVar != null) {
                oVar.a(str, fVar, animatable);
            }
            this.f102399b.a(fVar, animatable);
        }
    }

    public static final class b implements com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f102400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.drawee.c.d f102401b;

        static {
            Covode.recordClassIndex(65550);
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
            this.f102400a.onRelease(str);
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onRelease(str);
            }
        }

        b(b bVar, com.facebook.drawee.c.d dVar) {
            this.f102400a = bVar;
            this.f102401b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onIntermediateImageSet(str, fVar);
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            this.f102400a.onFailure(str, th);
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onFailure(str, th);
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
            this.f102400a.onIntermediateImageFailed(str, th);
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onIntermediateImageFailed(str, th);
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
            this.f102400a.onSubmit(str, obj);
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onSubmit(str, obj);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            com.facebook.imagepipeline.j.f fVar2 = fVar;
            this.f102400a.a(fVar2, animatable);
            com.facebook.drawee.c.d dVar = this.f102401b;
            if (dVar != null) {
                dVar.onFinalImageSet(str, fVar2, animatable);
            }
        }
    }

    private static boolean b(UrlModel urlModel) {
        if (!g.a() || !i.a(urlModel)) {
            return false;
        }
        return true;
    }

    public static void a(RemoteImageView remoteImageView, int i2) {
        l.d(remoteImageView, "");
        Drawable b2 = androidx.appcompat.a.a.a.b(remoteImageView.getContext(), i2);
        if (b2 != null) {
            androidx.core.graphics.drawable.a.a(b2, true);
        }
        remoteImageView.setImageDrawable(b2);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> dVar) {
        l.d(dVar, "");
        a(remoteImageView, urlModel, (d) null, 0, 0, dVar, 28);
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, d dVar, int i2, int i3, com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> dVar2) {
        if (remoteImageView != null && urlModel != null) {
            String str = null;
            if (b(urlModel)) {
                StringBuilder sb = new StringBuilder("bindImage with illegal url ");
                if (com.bytedance.ies.im.core.api.e.a.a((Collection<? extends Object>) urlModel.getUrlList())) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList != null) {
                        str = (String) n.h((List) urlList);
                    }
                } else {
                    str = urlModel.getUri();
                }
                com.ss.android.ugc.aweme.im.service.m.a.c("MessageFrescoHelper", sb.append(str).toString());
                return;
            }
            List<String> urlList2 = urlModel.getUrlList();
            if (urlList2 != null) {
                str = (String) n.h((List) urlList2);
            }
            e.a(remoteImageView, urlModel, i2, i3, dVar, new b(new b(str), dVar2));
        }
    }

    public static final void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, int i4, int i5, o oVar) {
        List<String> urlList;
        List<String> list;
        List<String> urlList2;
        String str = null;
        if (a(urlModel)) {
            StringBuilder sb = new StringBuilder("bindImage with illegal gif ");
            if (urlModel != null) {
                list = urlModel.getUrlList();
            } else {
                list = null;
            }
            if (com.bytedance.ies.im.core.api.e.a.a((Collection<? extends Object>) list)) {
                if (!(urlModel == null || (urlList2 = urlModel.getUrlList()) == null)) {
                    str = (String) n.h((List) urlList2);
                }
            } else if (urlModel != null) {
                str = urlModel.getUri();
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("MessageFrescoHelper", sb.append(str).toString());
            return;
        }
        if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            str = (String) n.h((List) urlList);
        }
        ah.a(remoteImageView, urlModel, i2, i3, new C2567a(oVar, new b(str)), true, i4, i5);
    }

    public static /* synthetic */ void a(RemoteImageView remoteImageView, UrlModel urlModel, d dVar, int i2, int i3, com.facebook.drawee.c.d dVar2, int i4) {
        d dVar3 = dVar;
        int i5 = i2;
        int i6 = i3;
        com.facebook.drawee.c.d dVar4 = null;
        if ((i4 & 4) != 0) {
            dVar3 = null;
        }
        if ((i4 & 8) != 0) {
            i5 = 0;
        }
        if ((i4 & 16) != 0) {
            i6 = 0;
        }
        if ((i4 & 32) == 0) {
            dVar4 = dVar2;
        }
        a(remoteImageView, urlModel, dVar3, i5, i6, dVar4);
    }
}
