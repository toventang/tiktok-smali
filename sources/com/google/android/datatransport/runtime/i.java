package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.Executor;

public final class i implements c<Executor> {

    /* renamed from: a  reason: collision with root package name */
    static final i f49449a = new i();

    static {
        Covode.recordClassIndex(30945);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(g.a(l.a(o.FIXED).a(1).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
