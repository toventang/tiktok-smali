package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import h.f.b.l;

public final class ModelEffectFetcher$FetchModelAndEffectTask$getListener$1 implements SyncTaskListener<EffectTaskResult> {
    final /* synthetic */ ModelEffectFetcher.FetchModelAndEffectTask this$0;

    static {
        Covode.recordClassIndex(95225);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onStart(SyncTask<EffectTaskResult> syncTask) {
        l.c(syncTask, "");
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ModelEffectFetcher$FetchModelAndEffectTask$getListener$1(ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask) {
        this.this$0 = fetchModelAndEffectTask;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onFinally(SyncTask<EffectTaskResult> syncTask) {
        l.c(syncTask, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onFinally(fetchModelAndEffectTask);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
        l.c(syncTask, "");
        l.c(exceptionResult, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onFailed(fetchModelAndEffectTask, exceptionResult);
    }

    public final void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult) {
        l.c(syncTask, "");
        l.c(effectTaskResult, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onResponse(fetchModelAndEffectTask, effectTaskResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onProgress(SyncTask<EffectTaskResult> syncTask, int i2, long j2) {
        l.c(syncTask, "");
        this.this$0.onProgress(syncTask, i2, j2);
    }
}
