package com.ss.android.ugc.aweme.sticker.text;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.c;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.interact.f;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f135729a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f135730b = i.a((h.f.a.a) a.f135731a);

    public static com.ss.android.ugc.aweme.editSticker.e.b a() {
        return (com.ss.android.ugc.aweme.editSticker.e.b) f135730b.getValue();
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(88720);
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135731a = new a();

        static {
            Covode.recordClassIndex(88721);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.e.a invoke() {
            com.ss.android.ugc.aweme.editSticker.e.a aVar = new com.ss.android.ugc.aweme.editSticker.e.a(new c(g.a().h().getVideoWidth(), g.a().h().getVideoHeight(), (f) null, new com.ss.android.ugc.aweme.sticker.view.b(), new com.ss.android.ugc.aweme.sticker.view.c(), 36));
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            com.google.gson.f G = g.a().G();
            com.ss.android.ugc.aweme.sticker.a aVar2 = com.ss.android.ugc.aweme.sticker.a.f134694a;
            com.ss.android.ugc.aweme.sticker.b bVar = com.ss.android.ugc.aweme.sticker.b.f134722a;
            l.d(application, "");
            l.d(aVar2, "");
            l.d(bVar, "");
            c cVar = aVar.f88145a;
            l.d(application, "");
            l.d(cVar, "");
            l.d(aVar2, "");
            l.d(bVar, "");
            if (!d.f88126f) {
                d.f88121a = application;
                if (G == null) {
                    com.google.gson.g gVar = new com.google.gson.g();
                    gVar.f54714d = true;
                    com.google.gson.f b2 = gVar.a((Type) Integer.TYPE, (Object) new com.ss.android.ugc.tools.i.a()).b();
                    l.b(b2, "");
                    d.f88122b = b2;
                } else {
                    d.f88122b = G;
                }
                d.f88123c = cVar;
                d.f88124d = aVar2;
                d.f88125e = bVar;
                d.f88126f = true;
            }
            return aVar;
        }
    }

    public static void a(com.ss.android.ugc.aweme.editSticker.interact.view.a aVar) {
        l.d(aVar, "");
        c c2 = d.c();
        c cVar = new c(c2.f88094a, c2.f88095b, c2.f88096c, aVar, c2.f88098e, c2.f88099f);
        l.d(cVar, "");
        d.f88123c = cVar;
    }
}
