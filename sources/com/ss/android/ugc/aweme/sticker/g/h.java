package com.ss.android.ugc.aweme.sticker.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.repository.a.k;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;

public final class h implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final o f134896a = o.a();

    /* renamed from: b  reason: collision with root package name */
    private final int f134897b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f134898c;

    /* renamed from: d  reason: collision with root package name */
    private final k f134899d;

    static {
        Covode.recordClassIndex(88186);
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c.a
    public final void c(Effect effect) {
        c.a aVar = this.f134898c;
        if (aVar != null) {
            aVar.c(effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c.a
    public final void b(Effect effect) {
        long a2 = this.f134896a.a(TimeUnit.MILLISECONDS);
        c.a aVar = this.f134898c;
        if ((aVar instanceof g) && this.f134897b == 1) {
            ((g) aVar).a(effect);
        } else if (aVar != null) {
            aVar.b(effect);
        }
        k kVar = this.f134899d;
        if (kVar != null) {
            kVar.a(effect, a2, this.f134897b);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c.a
    public final void a(Effect effect, int i2) {
        c.a aVar = this.f134898c;
        if (aVar != null) {
            aVar.a(effect, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c.a
    public final void a(Effect effect, ExceptionResult exceptionResult) {
        Integer num;
        long a2 = this.f134896a.a(TimeUnit.MILLISECONDS);
        c.a aVar = this.f134898c;
        if (aVar != null) {
            aVar.a(effect, exceptionResult);
        }
        k kVar = this.f134899d;
        if (kVar != null) {
            int i2 = this.f134897b;
            if (exceptionResult != null) {
                exceptionResult.getException();
                num = Integer.valueOf(exceptionResult.getErrorCode());
            } else {
                num = null;
            }
            kVar.a(effect, a2, i2, num);
        }
    }

    public h(int i2, c.a aVar, k kVar) {
        this.f134897b = i2;
        this.f134898c = aVar;
        this.f134899d = kVar;
    }
}
