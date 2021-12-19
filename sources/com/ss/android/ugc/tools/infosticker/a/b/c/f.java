package com.ss.android.ugc.tools.infosticker.a.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.tools.infosticker.a.a.o;
import com.ss.android.ugc.tools.infosticker.a.a.p;
import com.ss.android.ugc.tools.infosticker.a.b.i;
import com.ss.android.ugc.tools.infosticker.a.b.k;
import com.ss.android.ugc.tools.infosticker.a.b.l;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.t;
import h.a.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f extends d<List<? extends InfoStickerEffect>, List<? extends o>> implements l {

    /* renamed from: a  reason: collision with root package name */
    public final k f149472a;

    /* renamed from: b  reason: collision with root package name */
    public final i f149473b;

    static {
        Covode.recordClassIndex(98412);
    }

    static final class a<V> implements Callable<List<? extends o>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f149474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149475b;

        static {
            Covode.recordClassIndex(98413);
        }

        a(f fVar, List list) {
            this.f149474a = fVar;
            this.f149475b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends o> call() {
            p pVar;
            List<InfoStickerEffect> list = this.f149475b;
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (InfoStickerEffect infoStickerEffect : list) {
                String a2 = this.f149474a.f149472a.a(infoStickerEffect);
                if (com.ss.android.ugc.tools.h.a.i.a(this.f149474a.f149473b, infoStickerEffect)) {
                    pVar = p.SEARCH_STICKER_STICKER_DOWNLOADING;
                } else if (this.f149474a.f149472a.b(infoStickerEffect)) {
                    pVar = p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS;
                } else {
                    pVar = p.SEARCH_STICKER_STICKER_NOT_DOWNLOAD;
                }
                arrayList.add(new o(pVar, a2));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        List list = (List) obj;
        h.f.b.l.d(list, "");
        t c2 = t.c(new a(this, list));
        h.f.b.l.b(c2, "");
        return c2;
    }

    public f(k kVar, i iVar) {
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(iVar, "");
        this.f149472a = kVar;
        this.f149473b = iVar;
    }
}
