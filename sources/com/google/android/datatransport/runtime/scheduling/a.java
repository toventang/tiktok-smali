package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.p;
import com.google.android.datatransport.runtime.scheduling.a.c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f49469a = Logger.getLogger(p.class.getName());

    /* renamed from: b  reason: collision with root package name */
    final s f49470b;

    /* renamed from: c  reason: collision with root package name */
    final e f49471c;

    /* renamed from: d  reason: collision with root package name */
    final c f49472d;

    /* renamed from: e  reason: collision with root package name */
    final b f49473e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f49474f;

    static {
        Covode.recordClassIndex(30958);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public final void a(k kVar, h hVar, com.google.android.datatransport.h hVar2) {
        this.f49474f.execute(new b(this, kVar, hVar2, hVar));
    }

    public a(Executor executor, e eVar, s sVar, c cVar, b bVar) {
        this.f49474f = executor;
        this.f49471c = eVar;
        this.f49470b = sVar;
        this.f49472d = cVar;
        this.f49473e = bVar;
    }
}
