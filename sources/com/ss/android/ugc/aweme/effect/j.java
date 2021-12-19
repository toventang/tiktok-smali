package com.ss.android.ugc.aweme.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.tools.utils.u;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f88949a = new j();

    static {
        Covode.recordClassIndex(55942);
    }

    private j() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Application application = i.f115645a;
        u.a(application, (int) R.raw.fake3d, di.p);
        u.a(application, (int) R.raw.soul_scale, di.p);
        return null;
    }
}
