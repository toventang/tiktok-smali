package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.b.a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.c;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.im.sdk.chat.b.b.f;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class g implements Comparable<g>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final f f100142a;

    /* renamed from: b  reason: collision with root package name */
    public final e f100143b;

    static {
        Covode.recordClassIndex(63829);
    }

    public final void run() {
        f fVar = this.f100142a;
        e eVar = this.f100143b;
        for (T t : fVar.f100136b) {
            List<String> urlList = t.f100144a.getUrlList();
            l.b(urlList, "");
            String str = (String) n.h((List) urlList);
            if (str != null && str.length() != 0) {
                List<String> urlList2 = t.f100144a.getUrlList();
                l.b(urlList2, "");
                Uri parse = Uri.parse((String) n.h((List) urlList2));
                if (!e.a(parse)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    if (fVar.f100137c) {
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                        imageDecodeOptionsBuilder.a(1);
                        imageDecodeOptionsBuilder.f47724e = false;
                    } else {
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                    }
                    c a2 = c.a(parse);
                    a2.f48449f = new b(imageDecodeOptionsBuilder);
                    k a3 = k.a();
                    l.b(a3, "");
                    a3.e().c(a2.a(), null).a(new f.a(t, fVar, eVar), a.f47054a);
                } else if (eVar != null) {
                    eVar.a(t);
                    return;
                } else {
                    return;
                }
            } else if (eVar != null) {
                eVar.a(t);
                return;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        return this.f100142a.f100138d - gVar2.f100142a.f100138d;
    }

    public g(f fVar, e eVar) {
        l.d(fVar, "");
        this.f100142a = fVar;
        this.f100143b = eVar;
    }
}
