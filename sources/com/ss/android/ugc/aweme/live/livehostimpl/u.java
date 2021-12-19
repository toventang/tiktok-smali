package com.ss.android.ugc.aweme.live.livehostimpl;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.facebook.common.b.i;
import com.facebook.common.h.a;
import com.facebook.d.c;
import com.facebook.d.f;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.b;
import java.util.ArrayList;
import java.util.List;

public final class u implements e {
    static {
        Covode.recordClassIndex(69530);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.e
    public final String a(ImageModel imageModel) {
        List<String> urls;
        if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty())) {
            int size = urls.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (com.ss.android.ugc.aweme.base.e.a(Uri.parse(urls.get(i2)))) {
                    return com.ss.android.ugc.aweme.base.e.a(urls.get(i2));
                }
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.e
    public final e.a a(ImageModel imageModel, final e.b bVar) {
        b[] bVarArr;
        AnonymousClass1 r6 = new com.facebook.imagepipeline.f.b() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69531);
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(c<a<com.facebook.imagepipeline.j.c>> cVar) {
            }

            @Override // com.facebook.imagepipeline.f.b
            public final void a(Bitmap bitmap) {
                bVar.a(bitmap);
            }
        };
        if (!(imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String str : imageModel.getUrls()) {
                if (!m.a(str)) {
                    com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                    ((com.bytedance.l.a.a.c) com.bytedance.l.a.a(com.bytedance.l.a.a.c.class)).a(a2);
                    arrayList.add(a2.a());
                }
            }
            if (!(arrayList.size() == 0 || (bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()])) == null || bVarArr.length == 0)) {
                ArrayList arrayList2 = new ArrayList();
                for (b bVar2 : bVarArr) {
                    if (bVar2 != null) {
                        arrayList2.add(k.a().e().a(bVar2, b.EnumC1183b.FULL_FETCH));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    f.a(arrayList2).b().a(r6, i.b());
                }
            }
        }
        return null;
    }
}
