package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.h.a.g;
import h.f.b.l;

public abstract class c<RESULT, INFO> implements g<ProviderEffect, RESULT, INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<d> f149238a;

    static {
        Covode.recordClassIndex(98289);
    }

    public abstract Exception a(ProviderEffect providerEffect, ExceptionResult exceptionResult);

    public abstract RESULT a(ProviderEffect providerEffect);

    public abstract INFO b(ProviderEffect providerEffect);

    public abstract INFO c(ProviderEffect providerEffect);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(h.f.a.a<? extends d> aVar) {
        l.d(aVar, "");
        this.f149238a = aVar;
    }

    public static final class a implements IDownloadProviderEffectProgressListener {

        /* renamed from: a  reason: collision with root package name */
        public long f149239a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f149240b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f149241c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ProviderEffect f149242d;

        static {
            Covode.recordClassIndex(98290);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(ProviderEffect providerEffect) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149239a;
            f fVar = this.f149241c;
            ProviderEffect providerEffect2 = this.f149242d;
            fVar.a(providerEffect2, this.f149240b.a(providerEffect2), this.f149240b.b(this.f149242d), currentTimeMillis);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
        public final void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
            long currentTimeMillis = System.currentTimeMillis() - this.f149239a;
            f fVar = this.f149241c;
            ProviderEffect providerEffect2 = this.f149242d;
            fVar.a((Object) providerEffect2, this.f149240b.a(providerEffect2, exceptionResult), this.f149240b.c(this.f149242d), currentTimeMillis);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener
        public final void onProgress(ProviderEffect providerEffect, int i2, long j2) {
            this.f149241c.a(this.f149242d, i2);
        }

        a(c cVar, f fVar, ProviderEffect providerEffect) {
            this.f149240b = cVar;
            this.f149241c = fVar;
            this.f149242d = providerEffect;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.a.g
    public final /* synthetic */ void a(ProviderEffect providerEffect, f fVar) {
        ProviderEffect providerEffect2 = providerEffect;
        l.d(providerEffect2, "");
        l.d(fVar, "");
        this.f149238a.invoke().a(providerEffect2, new a(this, fVar, providerEffect2));
    }
}
