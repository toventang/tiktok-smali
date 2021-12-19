package com.ss.android.ugc.aweme.port.in;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public interface ISchedulerService {
    static {
        Covode.recordClassIndex(74490);
    }

    void schedule(Handler handler, Callable<?> callable, int i2);
}
