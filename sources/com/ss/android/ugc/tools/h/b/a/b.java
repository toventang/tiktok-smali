package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.h.a.g;
import h.f.b.l;

public abstract class b<RESULT, INFO> implements g<Effect, RESULT, INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<d> f149233a;

    static {
        Covode.recordClassIndex(98287);
    }

    public abstract Exception a(Effect effect, ExceptionResult exceptionResult);

    public abstract INFO a(Effect effect);

    public abstract RESULT a(Effect effect, Effect effect2);

    public abstract INFO b(Effect effect, ExceptionResult exceptionResult);

    public static final class a implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        public long f149234a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f149235b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f149236c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Effect f149237d;

        static {
            Covode.recordClassIndex(98288);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            this.f149234a = System.currentTimeMillis();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149234a;
            f fVar = this.f149236c;
            Effect effect2 = this.f149237d;
            fVar.a(effect2, this.f149235b.a(effect2, effect), this.f149235b.a(this.f149237d), currentTimeMillis);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f149234a;
            f fVar = this.f149236c;
            Effect effect2 = this.f149237d;
            fVar.a((Object) effect2, this.f149235b.a(effect2, exceptionResult), this.f149235b.b(this.f149237d, exceptionResult), currentTimeMillis);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            this.f149236c.a(this.f149237d, i2);
        }

        a(b bVar, f fVar, Effect effect) {
            this.f149235b = bVar;
            this.f149236c = fVar;
            this.f149237d = effect;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(h.f.a.a<? extends d> aVar) {
        l.d(aVar, "");
        this.f149233a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.a.g
    public final /* synthetic */ void a(Effect effect, f fVar) {
        Effect effect2 = effect;
        l.d(effect2, "");
        l.d(fVar, "");
        this.f149233a.invoke().b(effect2, new a(this, fVar, effect2));
    }
}
