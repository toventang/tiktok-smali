package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskRunnerImpl f155333a;

    static {
        Covode.recordClassIndex(103357);
    }

    o(TaskRunnerImpl taskRunnerImpl) {
        this.f155333a = taskRunnerImpl;
    }

    public final void run() {
        this.f155333a.d();
    }
}
