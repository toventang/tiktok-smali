package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.a;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.n;
import h.f.b.l;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected int f128565a;

    /* renamed from: b  reason: collision with root package name */
    protected int f128566b;

    /* renamed from: c  reason: collision with root package name */
    public int f128567c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f128568d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f128569e;

    /* renamed from: f  reason: collision with root package name */
    private final a f128570f = new n();

    static {
        Covode.recordClassIndex(84304);
    }

    public abstract q<? extends ai> a(Object obj, h hVar, SynthetiseResult synthetiseResult);

    public abstract com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> a(Object obj);

    public abstract com.ss.android.ugc.aweme.publish.b.a.a<h> a(Object obj, h hVar);

    public abstract void a();

    public void a(androidx.core.d.a aVar) {
    }

    public abstract void a(o oVar);

    public long b() {
        return -1;
    }

    public abstract void b(o oVar);

    public long c() {
        return -1;
    }

    public abstract q<h> c(Object obj);

    public long d() {
        return -1;
    }

    public abstract long d(Object obj);

    public boolean e(Object obj) {
        return false;
    }

    public com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> b(Object obj) {
        return a(obj);
    }

    public j(int i2, int i3) {
        this.f128565a = i2;
        this.f128566b = i3;
    }

    public final com.ss.android.ugc.aweme.publish.b.a.a<h> b(Object obj, h hVar) {
        boolean z;
        Class<?> cls;
        String str;
        d dVar;
        e eVar;
        a aVar = this.f128570f;
        String str2 = this.f128568d;
        boolean z2 = this.f128569e;
        l.d(str2, "");
        a.c cVar = new a.c(str2, z2);
        a.d dVar2 = new a.d(obj, cVar);
        a.e eVar2 = new a.e(obj, cVar);
        if (obj == null || ((obj instanceof VideoPublishEditModel) && !((VideoPublishEditModel) obj).getCoverPublishModel().getEffectTextModel().isCoverTextValid())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g.a().o().k().a("cover_text", "skip, will NOT upload cover text image.");
            return a.a(hVar);
        }
        String str3 = null;
        if (obj instanceof VideoPublishEditModel) {
            CoverPublishModel coverPublishModel = ((VideoPublishEditModel) obj).getCoverPublishModel();
            l.b(coverPublishModel, "");
            StickerItemModel textSticker = coverPublishModel.getEffectTextModel().getTextSticker();
            if (textSticker == null || (str = textSticker.path) == null || str.length() == 0) {
                g.a().o().k().a("cover_text", "skip because empty file path, will NOT upload cover text image.");
                return a.a(hVar);
            }
            g.a().o().k().a("cover_text", "ready to upload cover text image, file path=".concat(String.valueOf(str)));
            if (!(hVar instanceof d) || ((eVar = (dVar = (d) hVar).f118724c) == null && (eVar = dVar.f118725d) == null)) {
                return a.a(hVar);
            }
            return new a.f(aVar, eVar, hVar, eVar2, str, obj, dVar2);
        }
        StringBuilder sb = new StringBuilder("unsupported argument type, expected: (VideoPublishEditModel or PhotoMovieContext), actual: (");
        if (!(obj == null || (cls = obj.getClass()) == null)) {
            str3 = cls.getSimpleName();
        }
        throw new IllegalArgumentException(sb.append(str3).append(')').toString());
    }
}
