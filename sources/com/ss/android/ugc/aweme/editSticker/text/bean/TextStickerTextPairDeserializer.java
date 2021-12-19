package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import java.lang.reflect.Type;
import java.util.List;

public final class TextStickerTextPairDeserializer implements k<TextStickerTextPair> {
    static {
        Covode.recordClassIndex(55634);
    }

    public static final class a extends com.google.gson.b.a<List<? extends InteractTextStructWrap>> {
        static {
            Covode.recordClassIndex(55635);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends InteractTextStructWrap>> {
        static {
            Covode.recordClassIndex(55636);
        }

        b() {
        }
    }

    private static TextStickerTextPair a(l lVar) {
        if (lVar == null) {
            try {
                return new TextStickerTextPair();
            } catch (Exception e2) {
                bj.a(e2);
                return new TextStickerTextPair();
            }
        } else {
            o j2 = lVar.j();
            l c2 = j2.c("a");
            if (c2 == null && (c2 = j2.c("first")) == null) {
                return new TextStickerTextPair();
            }
            l c3 = j2.c("b");
            if (c3 == null && (c3 = j2.c("second")) == null) {
                return new TextStickerTextPair();
            }
            if (c2 instanceof r) {
                String iVar = c3.k().toString();
                h.f.b.l.b(iVar, "");
                String c4 = c2.c();
                h.f.b.l.b(c4, "");
                Object a2 = d.b().a(iVar, new a().type);
                h.f.b.l.b(a2, "");
                return new TextStickerTextPair(c4, (List) a2);
            } else if (!(c3 instanceof r)) {
                return new TextStickerTextPair();
            } else {
                String iVar2 = c2.k().toString();
                h.f.b.l.b(iVar2, "");
                String c5 = c3.c();
                h.f.b.l.b(c5, "");
                Object a3 = d.b().a(iVar2, new b().type);
                h.f.b.l.b(a3, "");
                return new TextStickerTextPair(c5, (List) a3);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ TextStickerTextPair a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
