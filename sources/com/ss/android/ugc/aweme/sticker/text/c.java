package com.ss.android.ugc.aweme.sticker.text;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.editSticker.e;
import com.ss.android.ugc.aweme.editSticker.f;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.ay;
import com.ss.android.ugc.aweme.property.cv;
import com.ss.android.ugc.aweme.property.de;
import com.ss.android.ugc.aweme.shortvideo.cr;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f135732a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f135733b = i.a((h.f.a.a) a.f135735a);

    /* renamed from: c  reason: collision with root package name */
    private static boolean f135734c;

    public static com.ss.android.ugc.aweme.editSticker.e.a.a a() {
        return (com.ss.android.ugc.aweme.editSticker.e.a.a) f135733b.getValue();
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(88722);
    }

    public static final void b() {
        if (!f135734c) {
            a();
            com.ss.android.ugc.aweme.editSticker.a aVar = new com.ss.android.ugc.aweme.editSticker.a("coverpic", "covertext");
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            com.ss.android.ugc.aweme.editSticker.e.a.a.a(aVar, com.ss.android.ugc.aweme.effectplatform.c.a(application, null), e.f135736a, g.a().E().a());
            f135734c = true;
        }
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.e.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135735a = new a();

        static {
            Covode.recordClassIndex(88723);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.e.a.a invoke() {
            com.ss.android.ugc.aweme.editSticker.e.a.a aVar = new com.ss.android.ugc.aweme.editSticker.e.a.a();
            f fVar = new f(b.a().a(true, "edit_text_sticker_stroke_mode", false), com.ss.android.ugc.gamora.editor.sticker.read.g.a(), 12);
            com.ss.android.ugc.aweme.editSticker.a.f fVar2 = new com.ss.android.ugc.aweme.editSticker.a.f();
            boolean a2 = cv.a();
            boolean a3 = ay.a();
            cr a4 = cr.a();
            l.b(a4, "");
            Boolean bool = a4.o;
            l.b(bool, "");
            e eVar = new e("textfont", fVar, fVar2, a2, a3, bool.booleanValue(), com.ss.android.ugc.gamora.editor.sticker.permission.a.f146748a, de.a());
            com.ss.android.ugc.aweme.effectplatform.f createFontEffectPlatform = AVServiceImpl.a().effectService().createFontEffectPlatform(com.ss.android.ugc.aweme.port.in.i.f115645a);
            l.b(createFontEffectPlatform, "");
            aVar.a(eVar, createFontEffectPlatform, com.ss.android.ugc.aweme.adaptation.a.f66177a, j.f135740a);
            return aVar;
        }
    }

    public static final void a(com.ss.android.ugc.aweme.editSticker.a.e eVar) {
        l.d(eVar, "");
        a();
        com.ss.android.ugc.aweme.editSticker.e.a.a.a(eVar);
    }

    public static final void a(boolean z, boolean z2, boolean z3) {
        a();
        com.ss.android.ugc.aweme.editSticker.e.a.a.a(z, z2, z3);
    }
}
