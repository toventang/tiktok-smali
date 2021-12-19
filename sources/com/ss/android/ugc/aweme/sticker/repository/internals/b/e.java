package com.ss.android.ugc.aweme.sticker.repository.internals.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.sticker.g;
import com.ss.android.ugc.aweme.sticker.g.f;
import com.ss.android.ugc.aweme.sticker.repository.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class e implements f, IEffectDownloadProgressListener {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f135525a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f135526b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f135527c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f135528d;

    /* renamed from: e  reason: collision with root package name */
    private long f135529e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    private long f135530f;

    /* renamed from: g  reason: collision with root package name */
    private final ac f135531g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.tools.h.a.f<ac, Effect, ab> f135532h;

    static {
        Covode.recordClassIndex(88578);
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a() {
        this.f135526b = true;
        h.a(this.f135531g.f135465a.getEffectId());
        b();
    }

    private final void b() {
        if (this.f135525a && this.f135526b) {
            long currentTimeMillis = System.currentTimeMillis() - this.f135529e;
            com.ss.android.ugc.tools.h.a.f<ac, Effect, ab> fVar = this.f135532h;
            ac acVar = this.f135531g;
            fVar.a(acVar, acVar.f135465a, new ab(this.f135530f, 3), currentTimeMillis);
        }
    }

    private final void c() {
        int i2 = 100;
        if (!this.f135525a && !this.f135526b) {
            i2 = (this.f135528d + this.f135527c) / 2;
        } else if (!this.f135526b) {
            i2 = (this.f135528d + 100) / 2;
        } else if (!this.f135525a) {
            i2 = (this.f135527c + 100) / 2;
        }
        this.f135532h.a(this.f135531g, i2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a(int i2) {
        this.f135528d = i2;
        c();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f135529e = System.currentTimeMillis();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        this.f135525a = true;
        b();
    }

    public e(ac acVar, com.ss.android.ugc.tools.h.a.f<ac, Effect, ab> fVar) {
        l.d(acVar, "");
        l.d(fVar, "");
        this.f135531g = acVar;
        this.f135532h = fVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a(g gVar, String str) {
        l.d(gVar, "");
        this.f135526b = true;
        h.a(this.f135531g.f135465a.getEffectId(), gVar, str);
        if (str != null) {
            com.ss.android.ugc.aweme.sticker.p.e.a(gVar.getMusicId(), str);
        }
        b();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        l.d(exceptionResult, "");
        this.f135532h.a(this.f135531g, exceptionResult.getException(), new ab(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.f135530f), System.currentTimeMillis() - this.f135529e);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i2, long j2) {
        this.f135530f = j2;
        this.f135527c = i2;
        c();
    }
}
