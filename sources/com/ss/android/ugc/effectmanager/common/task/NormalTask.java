package com.ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class NormalTask implements ITask {
    private final Handler handler;
    private boolean isCanceled;
    private String taskId;

    static {
        Covode.recordClassIndex(95322);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void cancel() {
        this.isCanceled = true;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    /* access modifiers changed from: protected */
    public final boolean isCanceled() {
        return this.isCanceled;
    }

    /* access modifiers changed from: protected */
    public final String getTaskId() {
        String str = this.taskId;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    public NormalTask(Handler handler2, String str) {
        this.handler = handler2;
        this.taskId = str;
    }

    public final void sendMessage(int i2, BaseTaskResult baseTaskResult) {
        Message obtainMessage;
        l.c(baseTaskResult, "");
        baseTaskResult.setTaskID(this.taskId);
        Handler handler2 = this.handler;
        if (handler2 != null && (obtainMessage = handler2.obtainMessage(i2)) != null) {
            obtainMessage.obj = baseTaskResult;
            obtainMessage.sendToTarget();
        }
    }
}
