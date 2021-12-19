package com.ss.android.ugc.aweme.sticker.repository.internals.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.f;
import h.f.b.l;

public final class d implements IEffectDownloadProgressListener {

    /* renamed from: a  reason: collision with root package name */
    private long f135521a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    private long f135522b;

    /* renamed from: c  reason: collision with root package name */
    private final ac f135523c;

    /* renamed from: d  reason: collision with root package name */
    private final f<ac, Effect, ab> f135524d;

    static {
        Covode.recordClassIndex(88577);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f135521a = System.currentTimeMillis();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.f135521a;
        f<ac, Effect, ab> fVar = this.f135524d;
        ac acVar = this.f135523c;
        if (effect2 == null) {
            effect2 = acVar.f135465a;
        }
        fVar.a(acVar, effect2, new ab(this.f135522b, 3), currentTimeMillis);
    }

    public d(ac acVar, f<ac, Effect, ab> fVar) {
        l.d(acVar, "");
        l.d(fVar, "");
        this.f135523c = acVar;
        this.f135524d = fVar;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        l.d(exceptionResult, "");
        this.f135524d.a(this.f135523c, exceptionResult.getException(), new ab(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.f135522b), System.currentTimeMillis() - this.f135521a);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i2, long j2) {
        this.f135522b = j2;
        this.f135524d.a(this.f135523c, i2);
    }
}
