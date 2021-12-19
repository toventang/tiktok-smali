package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.port.in.g;
import java.lang.reflect.Type;

public final class BackgroundVideoDeserializer implements k<com.ss.android.ugc.aweme.sticker.model.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82946a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51697);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51698);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static com.ss.android.ugc.aweme.sticker.model.a a(l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            o j2 = lVar.j();
            h.f.b.l.b(j2, "");
            a.b(j2, "videoPath");
            return (com.ss.android.ugc.aweme.sticker.model.a) g.a().H().a((l) j2, com.ss.android.ugc.aweme.sticker.model.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.sticker.model.a a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
