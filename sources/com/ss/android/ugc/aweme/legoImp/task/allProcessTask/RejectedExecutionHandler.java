package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.t;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public final class RejectedExecutionHandler implements w {
    static {
        Covode.recordClassIndex(69203);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
        return ae.MAIN;
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
        if (Build.VERSION.SDK_INT <= 28) {
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            Objects.requireNonNull(executor, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
            ((ThreadPoolExecutor) executor).setRejectedExecutionHandler(new t());
        }
    }
}
