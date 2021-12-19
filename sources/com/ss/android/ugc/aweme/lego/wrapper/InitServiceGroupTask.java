package com.ss.android.ugc.aweme.lego.wrapper;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InitServiceGroupTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Runnable> f107634a;

    /* renamed from: b  reason: collision with root package name */
    private final int f107635b;

    /* renamed from: c  reason: collision with root package name */
    private final ae f107636c;

    static {
        Covode.recordClassIndex(68852);
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
        return this.f107636c;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return this.f107635b;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public /* synthetic */ InitServiceGroupTask(Runnable[] runnableArr) {
        this(runnableArr, ae.MAIN);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        for (T t : this.f107634a) {
            if (t != null) {
                t.run();
            }
        }
    }

    private InitServiceGroupTask(Runnable[] runnableArr, ae aeVar) {
        l.d(runnableArr, "");
        l.d(aeVar, "");
        this.f107634a = new ArrayList<>();
        this.f107635b = 1;
        this.f107636c = aeVar;
        for (Runnable runnable : runnableArr) {
            this.f107634a.add(runnable);
        }
    }
}
