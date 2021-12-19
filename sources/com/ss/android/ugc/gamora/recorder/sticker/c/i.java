package com.ss.android.ugc.gamora.recorder.sticker.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ah.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.c.h;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.a.e;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public static int f148471a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f148472b = new a((byte) 0);

    static {
        Covode.recordClassIndex(97863);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97864);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Drawable> {
        final /* synthetic */ androidx.appcompat.app.d $activity;

        static {
            Covode.recordClassIndex(97866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.appcompat.app.d dVar) {
            super(0);
            this.$activity = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Drawable invoke() {
            return g.a().E().a((Context) this.$activity);
        }
    }

    static final class b extends m implements h.f.a.m<String, String, com.ss.android.ugc.aweme.sticker.panel.c.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f148473a = new b();

        static {
            Covode.recordClassIndex(97865);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.c.c invoke(String str, String str2) {
            String str3 = str;
            l.d(str3, "");
            com.ss.android.ugc.aweme.account.model.a a2 = g.a().A().a(str3, str2);
            l.d(a2, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.b(a2);
        }
    }

    static final class d implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f148474a;

        static {
            Covode.recordClassIndex(97867);
        }

        d(z.e eVar) {
            this.f148474a = eVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            T t = this.f148474a.element;
            if (t == null) {
                return true;
            }
            t.c();
            return true;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.d a(androidx.appcompat.app.d dVar, o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar2, com.ss.android.ugc.tools.b.a.d dVar3, ShortVideoContext shortVideoContext, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.tools.view.a.c cVar) {
        l.d(dVar, "");
        l.d(oVar, "");
        l.d(dVar2, "");
        l.d(dVar3, "");
        l.d(shortVideoContext, "");
        l.d(aVar, "");
        z.e eVar = new z.e();
        eVar.element = null;
        d dVar4 = new d(eVar);
        boolean z = !g.a().A().a();
        g.a().E();
        eVar.element = (T) new com.ss.android.ugc.aweme.sticker.panel.c.b(z, b.f148473a, new c(dVar), oVar, dVar2, new com.ss.android.ugc.aweme.sticker.m.a(shortVideoContext), dVar, new com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a(shortVideoContext, cVar, dVar, dVar4, aVar));
        com.ss.android.ugc.aweme.sticker.presenter.handler.d dVar5 = new com.ss.android.ugc.aweme.sticker.presenter.handler.d();
        dVar5.a((h) eVar.element);
        dVar5.a(new e(new com.ss.android.ugc.aweme.sticker.m.a.b(shortVideoContext), f.f66317a));
        dVar5.a(new com.ss.android.ugc.aweme.sticker.panel.c.a());
        dVar5.a(new com.ss.android.ugc.aweme.sticker.panel.c.g(!g.a().A().a()));
        return dVar5;
    }
}
