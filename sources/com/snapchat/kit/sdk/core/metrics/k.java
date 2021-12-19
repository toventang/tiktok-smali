package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import dagger.a.c;
import dagger.a.f;
import java.util.concurrent.ScheduledExecutorService;

public final class k implements c<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    public static final k f57199a = new k();

    static {
        Covode.recordClassIndex(35637);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        return f.a(g.a(a2.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
