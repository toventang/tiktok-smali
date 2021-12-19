package com.ss.android.ugc.tools.infosticker.a.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.d;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.f;
import com.ss.android.ugc.tools.infosticker.a.a.o;
import com.ss.android.ugc.tools.infosticker.a.a.p;
import com.ss.android.ugc.tools.infosticker.a.b.h;
import com.ss.android.ugc.tools.infosticker.a.b.i;
import com.ss.android.ugc.tools.infosticker.a.b.k;
import com.ss.android.ugc.tools.infosticker.a.b.l;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import f.a.d.g;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import java.util.concurrent.Callable;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final i f149452a;

    /* renamed from: b  reason: collision with root package name */
    public final k f149453b;

    /* renamed from: c  reason: collision with root package name */
    private final h f149454c;

    /* renamed from: d  reason: collision with root package name */
    private final l f149455d;

    static {
        Covode.recordClassIndex(98405);
    }

    static final class b<V> implements Callable<x<? extends com.ss.android.ugc.tools.infosticker.a.a.i>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InfoStickerEffect f149459b;

        static {
            Covode.recordClassIndex(98407);
        }

        b(c cVar, InfoStickerEffect infoStickerEffect) {
            this.f149458a = cVar;
            this.f149459b = infoStickerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ x<? extends com.ss.android.ugc.tools.infosticker.a.a.i> call() {
            return this.f149458a.f149452a.a(this.f149459b, true).d(new g<d<InfoStickerEffect, String>, com.ss.android.ugc.tools.infosticker.a.a.i>(this) {
                /* class com.ss.android.ugc.tools.infosticker.a.b.c.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f149460a;

                static {
                    Covode.recordClassIndex(98408);
                }

                {
                    this.f149460a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.g
                public final /* synthetic */ com.ss.android.ugc.tools.infosticker.a.a.i apply(d<InfoStickerEffect, String> dVar) {
                    o oVar;
                    d<InfoStickerEffect, String> dVar2 = dVar;
                    h.f.b.l.d(dVar2, "");
                    KEY key = dVar2.f149208b;
                    c cVar = this.f149460a.f149458a;
                    int i2 = d.f149461a[dVar2.f149207a.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oVar = new o(p.SEARCH_STICKER_STICKER_DOWNLOADING, "");
                    } else if (i2 == 3) {
                        RESULT result = dVar2.f149209c;
                        if (result == null) {
                            result = cVar.f149453b.a(dVar2.f149208b);
                        }
                        oVar = new o(p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS, result);
                    } else if (i2 != 4) {
                        oVar = new o(p.SEARCH_STICKER_STICKER_UNKNOWN, "");
                    } else {
                        oVar = new o(p.SEARCH_STICKER_STICKER_DOWNLOAD_FAILED, "");
                    }
                    return new com.ss.android.ugc.tools.infosticker.a.a.i(key, oVar, dVar2.f149211e, dVar2.f149210d);
                }
            });
        }
    }

    static final class a<T> implements w<com.ss.android.ugc.tools.infosticker.a.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InfoStickerEffect f149457b;

        static {
            Covode.recordClassIndex(98406);
        }

        a(c cVar, InfoStickerEffect infoStickerEffect) {
            this.f149456a = cVar;
            this.f149457b = infoStickerEffect;
        }

        @Override // f.a.w
        public final void subscribe(v<com.ss.android.ugc.tools.infosticker.a.a.i> vVar) {
            h.f.b.l.d(vVar, "");
            if (this.f149456a.f149453b.b(this.f149457b)) {
                vVar.a(new com.ss.android.ugc.tools.infosticker.a.a.i(this.f149457b, new o(p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS, this.f149456a.f149453b.a(this.f149457b))));
            }
            vVar.a();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.f
    public final t<com.ss.android.ugc.tools.infosticker.a.a.i> a(InfoStickerEffect infoStickerEffect) {
        h.f.b.l.d(infoStickerEffect, "");
        t<com.ss.android.ugc.tools.infosticker.a.a.i> d2 = t.a(new a(this, infoStickerEffect)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(t.a(new b(this, infoStickerEffect)));
        h.f.b.l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.f
    public final j<InfoStickerEffect, InfoStickerListModel> a(int i2, String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        return this.f149454c.a(i2, str, str2);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.f
    public final j<InfoStickerEffect, InfoStickerListModel> a(String str, String str2, String str3) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        return this.f149454c.a(str, str2, str3);
    }

    public c(h hVar, l lVar, i iVar, k kVar) {
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(kVar, "");
        this.f149454c = hVar;
        this.f149455d = lVar;
        this.f149452a = iVar;
        this.f149453b = kVar;
    }
}
