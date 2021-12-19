package com.ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.z;

public abstract class NewNormalTask<T> implements NewITask<T> {
    private IEffectPlatformBaseListener<T> baseListener;
    private final Handler handler;
    private boolean isCanceled;
    private String taskId;

    static {
        Covode.recordClassIndex(95319);
    }

    /* access modifiers changed from: protected */
    public abstract void execute();

    /* access modifiers changed from: protected */
    public abstract void onCancel();

    /* access modifiers changed from: protected */
    public final IEffectPlatformBaseListener<T> getBaseListener() {
        return this.baseListener;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public String getId() {
        return this.taskId;
    }

    /* access modifiers changed from: protected */
    public final boolean isCanceled() {
        return this.isCanceled;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public void cancel() {
        this.isCanceled = true;
        runInHandler(new NewNormalTask$cancel$1(this));
    }

    /* access modifiers changed from: protected */
    public final void setBaseListener(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        this.baseListener = iEffectPlatformBaseListener;
    }

    /* access modifiers changed from: protected */
    public final void setCanceled(boolean z) {
        this.isCanceled = z;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.NewITask
    public void execute(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        if (!this.isCanceled) {
            this.baseListener = iEffectPlatformBaseListener;
            execute();
        }
    }

    /* access modifiers changed from: protected */
    public final void runInHandler(a<z> aVar) {
        l.c(aVar, "");
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.post(new NewNormalTask$sam$java_lang_Runnable$0(aVar));
        } else {
            aVar.invoke();
        }
    }

    public NewNormalTask(Handler handler2, String str) {
        l.c(str, "");
        this.handler = handler2;
        this.taskId = str;
    }
}
