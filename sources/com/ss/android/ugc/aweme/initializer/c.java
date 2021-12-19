package com.ss.android.ugc.aweme.initializer;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements ISchedulerService {

    /* renamed from: a  reason: collision with root package name */
    static final ISchedulerService f104732a = new c();

    static {
        Covode.recordClassIndex(67138);
    }

    private c() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.ISchedulerService
    public final void schedule(Handler handler, Callable callable, int i2) {
        n.a().a(handler, callable, i2);
    }
}
