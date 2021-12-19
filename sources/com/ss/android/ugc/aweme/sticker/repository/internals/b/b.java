package com.ss.android.ugc.aweme.sticker.repository.internals.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g;
import com.ss.android.ugc.aweme.sticker.g.e;
import com.ss.android.ugc.aweme.sticker.g.f;
import com.ss.android.ugc.aweme.sticker.repository.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.repository.a.n;
import com.ss.android.ugc.aweme.sticker.repository.a.p;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Effect> f135513a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final p f135514b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<t> f135515c;

    /* renamed from: d  reason: collision with root package name */
    private final e f135516d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<com.ss.android.ugc.tools.b.a.d> f135517e;

    static {
        Covode.recordClassIndex(88571);
    }

    static final /* synthetic */ class d extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(88575);
        }

        d(f fVar) {
            super(0, fVar, f.class, "onFailed", "onFailed()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((f) this.receiver).a();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b$b  reason: collision with other inner class name */
    static final /* synthetic */ class C3528b extends j implements h.f.a.b<Integer, z> {
        static {
            Covode.recordClassIndex(88573);
        }

        C3528b(f fVar) {
            super(1, fVar, f.class, "onProgress", "onProgress(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            ((f) this.receiver).a(num.intValue());
            return z.f158842a;
        }
    }

    public static final class a implements com.ss.android.ugc.tools.h.a.f<ac, Effect, ab> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.h.a.f f135519b;

        static {
            Covode.recordClassIndex(88572);
        }

        a(b bVar, com.ss.android.ugc.tools.h.a.f fVar) {
            this.f135518a = bVar;
            this.f135519b = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ac acVar, int i2) {
            l.d(acVar, "");
            this.f135519b.a(acVar, i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ac acVar, Effect effect) {
            l.d(acVar, "");
            l.d(effect, "");
            this.f135519b.a(acVar, effect);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ac acVar, Exception exc, ab abVar, long j2) {
            l.d(acVar, "");
            l.d(abVar, "");
            this.f135519b.a((Object) acVar, exc, (Object) abVar, j2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.ss.android.ugc.tools.h.a.f
        public final /* synthetic */ void a(ac acVar, Effect effect, ab abVar, long j2) {
            ac acVar2 = acVar;
            l.d(acVar2, "");
            l.d(effect, "");
            l.d(abVar, "");
            this.f135518a.f135513a.put(acVar2.f135465a.getId(), acVar2.f135465a);
            this.f135519b.a(acVar2, effect, abVar, j2);
        }
    }

    private final void a(ac acVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        this.f135517e.invoke().b(acVar.f135465a, iEffectDownloadProgressListener);
    }

    static final /* synthetic */ class c extends j implements m<g, String, z> {
        static {
            Covode.recordClassIndex(88574);
        }

        c(f fVar) {
            super(2, fVar, f.class, "onSuccess", "onSuccess(Lcom/ss/android/ugc/aweme/sticker/IStickerMusic;Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(g gVar, String str) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            ((f) this.receiver).a(gVar2, str);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.n
    public final boolean a(Effect effect, boolean z) {
        l.d(effect, "");
        return this.f135513a.containsKey(effect.getId());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.a.g
    public final /* synthetic */ void a(ac acVar, com.ss.android.ugc.tools.h.a.f<ac, Effect, ab> fVar) {
        List<String> music;
        String str;
        ac acVar2 = acVar;
        l.d(acVar2, "");
        l.d(fVar, "");
        boolean a2 = this.f135514b.a(acVar2.f135465a);
        a aVar = new a(this, fVar);
        Effect effect = acVar2.f135465a;
        if (com.ss.android.ugc.aweme.sticker.p.g.r(effect) && (music = effect.getMusic()) != null && !music.isEmpty()) {
            this.f135516d.a(effect);
            e eVar = new e(acVar2, aVar);
            if (a2) {
                eVar.onSuccess(acVar2.f135465a);
            } else {
                a(acVar2, eVar);
            }
            List<String> music2 = acVar2.f135465a.getMusic();
            if (music2 == null || (str = (String) h.a.n.h((List) music2)) == null) {
                eVar.a();
            } else {
                this.f135515c.invoke().a(str, !a(acVar2.f135465a, false), new C3528b(eVar), new c(eVar), new d(eVar));
            }
        } else if (a2) {
            aVar.a(acVar2, acVar2.f135465a, new ab(0, 7), 0);
        } else {
            a(acVar2, new d(acVar2, aVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.repository.a.t> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p pVar, h.f.a.a<? extends t> aVar, e eVar, h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar2) {
        l.d(pVar, "");
        l.d(aVar, "");
        l.d(eVar, "");
        l.d(aVar2, "");
        this.f135514b = pVar;
        this.f135515c = aVar;
        this.f135516d = eVar;
        this.f135517e = aVar2;
    }
}
