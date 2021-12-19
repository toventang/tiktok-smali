package com.ss.android.ugc.aweme.sticker.repository.internals.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.repository.a.o;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c implements com.ss.android.ugc.aweme.sticker.g.d {

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.sticker.g.e f135572a = new a();

    /* renamed from: b  reason: collision with root package name */
    final o f135573b;

    /* renamed from: c  reason: collision with root package name */
    final t f135574c;

    static {
        Covode.recordClassIndex(88604);
    }

    public static final class a implements com.ss.android.ugc.aweme.sticker.g.e {
        static {
            Covode.recordClassIndex(88605);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.e
        public final boolean a(Effect effect) {
            l.d(effect, "");
            return false;
        }

        a() {
        }
    }

    static final /* synthetic */ class e extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(88609);
        }

        e(com.ss.android.ugc.aweme.sticker.g.f fVar) {
            super(0, fVar, com.ss.android.ugc.aweme.sticker.g.f.class, "onFailed", "onFailed()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((com.ss.android.ugc.aweme.sticker.g.f) this.receiver).a();
            return z.f158842a;
        }
    }

    public static final class b implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListener f135575a;

        static {
            Covode.recordClassIndex(88606);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
        }

        b(IFetchEffectListener iFetchEffectListener) {
            this.f135575a = iFetchEffectListener;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            this.f135575a.onStart(effect);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            this.f135575a.onSuccess(effect);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f135575a.onFail(effect, exceptionResult);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$c  reason: collision with other inner class name */
    static final /* synthetic */ class C3532c extends j implements h.f.a.b<Integer, z> {
        static {
            Covode.recordClassIndex(88607);
        }

        C3532c(com.ss.android.ugc.aweme.sticker.g.f fVar) {
            super(1, fVar, com.ss.android.ugc.aweme.sticker.g.f.class, "onProgress", "onProgress(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            ((com.ss.android.ugc.aweme.sticker.g.f) this.receiver).a(num.intValue());
            return z.f158842a;
        }
    }

    public static final class f implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f135576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListener f135577b;

        static {
            Covode.recordClassIndex(88610);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListener iFetchEffectListener = this.f135577b;
            if (exceptionResult == null) {
                exceptionResult = new ExceptionResult(-1, new IllegalStateException("get effect info error"));
            }
            iFetchEffectListener.onFail(null, exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            List<String> music;
            String str;
            List<Effect> list2 = list;
            if (list2 == null || !(!list2.isEmpty())) {
                onFail(new ExceptionResult(-1, new IllegalStateException("get effect info error")));
                return;
            }
            Effect effect = list2.get(0);
            c cVar = this.f135576a;
            IFetchEffectListener iFetchEffectListener = this.f135577b;
            l.d(effect, "");
            l.d(iFetchEffectListener, "");
            if (effect == null || !g.r(effect) || (music = effect.getMusic()) == null || music.isEmpty()) {
                cVar.f135573b.a(effect, iFetchEffectListener);
                return;
            }
            cVar.f135572a.a(effect);
            b bVar = new b(effect, new b(iFetchEffectListener));
            List<String> music2 = effect.getMusic();
            if (music2 == null || (str = music2.get(0)) == null) {
                bVar.a();
            } else {
                cVar.f135574c.a(str, true, new C3532c(bVar), new d(bVar), new e(bVar));
            }
            cVar.f135573b.a(effect, bVar);
        }

        f(c cVar, IFetchEffectListener iFetchEffectListener) {
            this.f135576a = cVar;
            this.f135577b = iFetchEffectListener;
        }
    }

    static final /* synthetic */ class d extends j implements m<com.ss.android.ugc.aweme.sticker.g, String, z> {
        static {
            Covode.recordClassIndex(88608);
        }

        d(com.ss.android.ugc.aweme.sticker.g.f fVar) {
            super(2, fVar, com.ss.android.ugc.aweme.sticker.g.f.class, "onSuccess", "onSuccess(Lcom/ss/android/ugc/aweme/sticker/IStickerMusic;Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.sticker.g gVar, String str) {
            com.ss.android.ugc.aweme.sticker.g gVar2 = gVar;
            l.d(gVar2, "");
            ((com.ss.android.ugc.aweme.sticker.g.f) this.receiver).a(gVar2, str);
            return z.f158842a;
        }
    }

    public c(o oVar, t tVar) {
        l.d(oVar, "");
        l.d(tVar, "");
        this.f135573b = oVar;
        this.f135574c = tVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c
    public final void a(String str, String str2, IFetchEffectListener iFetchEffectListener) {
        l.d(str, "");
        l.d(iFetchEffectListener, "");
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str2);
        a(str, hashMap, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c
    public final void a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        l.d(str, "");
        l.d(iFetchEffectListener, "");
        this.f135573b.a(n.a(str), false, map, new f(this, iFetchEffectListener));
    }
}
