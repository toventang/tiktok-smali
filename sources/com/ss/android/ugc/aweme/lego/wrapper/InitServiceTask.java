package com.ss.android.ugc.aweme.lego.wrapper;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class InitServiceTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f107637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f107638b;

    /* renamed from: c  reason: collision with root package name */
    public final ae f107639c;

    static {
        Covode.recordClassIndex(68853);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return this.f107639c;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return this.f107638b;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Runnable runnable = this.f107637a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ InitServiceTask(Runnable runnable, int i2) {
        this(runnable, i2, ae.MAIN);
    }

    public InitServiceTask(Runnable runnable, int i2, ae aeVar) {
        l.d(aeVar, "");
        this.f107637a = runnable;
        this.f107638b = i2;
        this.f107639c = aeVar;
    }
}
