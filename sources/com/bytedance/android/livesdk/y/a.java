package com.bytedance.android.livesdk.y;

import com.bytedance.android.live.core.d.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class a {
    public a mNextTask;
    public volatile int mStatus;

    static {
        Covode.recordClassIndex(13540);
    }

    /* access modifiers changed from: protected */
    public Callable asyncCallable() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getTaskName();

    /* access modifiers changed from: protected */
    public abstract void run();

    public synchronized boolean isFinished() {
        boolean z;
        if (this.mStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isIDLE() {
        boolean z;
        if (this.mStatus == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isRunning() {
        if (this.mStatus == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public List<Integer> preTasks() {
        return Arrays.asList(0);
    }

    public final List<Integer> getPreTasks() {
        ArrayList arrayList = new ArrayList();
        if (preTasks() != null) {
            arrayList.add(0);
            for (Integer num : preTasks()) {
                if (!arrayList.contains(num)) {
                    arrayList.add(num);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getTaskId() {
        try {
            return ((com.bytedance.android.live.annotation.a) getClass().getAnnotation(com.bytedance.android.live.annotation.a.class)).a();
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(6, "ttlive_sdk_launch_error", getClass().getCanonicalName() + " task getTaskID exception");
            com.bytedance.android.live.core.c.a.a(6, "ttlive_sdk_launch_error", e2.getStackTrace());
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public void start() {
        if (this.mStatus != 2 && this.mStatus != 1) {
            this.mStatus = 1;
            try {
                b.a("init_live_launch_task_" + getTaskName());
                run();
                b.b("init_live_launch_task_" + getTaskName());
                this.mStatus = 2;
            } catch (Exception e2) {
                this.mStatus = 3;
                throw e2;
            }
        }
    }
}
