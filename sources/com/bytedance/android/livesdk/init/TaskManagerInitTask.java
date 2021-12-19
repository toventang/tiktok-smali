package com.bytedance.android.livesdk.init;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.annotation.a;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.common.utility.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.e.a.a;
import com.ss.android.ugc.aweme.cw.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@a(a = 4)
public class TaskManagerInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10146);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "task_manager_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public List<Integer> preTasks() {
        return Arrays.asList(0);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        Executor com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = g.a();
        } else {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool(new b("live-work-threads"));
        }
        a.C0736a aVar = new a.C0736a();
        if (com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool == null) {
            com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool = com.bytedance.ies.e.a.a.f33804a;
        }
        aVar.f33812a = com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool;
        com.bytedance.ies.e.a.a a2 = com.bytedance.ies.e.a.a.a();
        a2.f33808e = aVar.f33812a;
        com.bytedance.ies.e.a.a.f33806c = new Handler(Looper.getMainLooper());
        a2.f33807d = true;
    }

    public static ExecutorService com_bytedance_android_livesdk_init_TaskManagerInitTask_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newCachedThreadPool(ThreadFactory threadFactory) {
        if ((threadFactory instanceof b) || (threadFactory instanceof com.ss.android.socialbase.downloader.j.a)) {
            return g.a();
        }
        return Executors.newCachedThreadPool(threadFactory);
    }
}
