package com.ss.android.ugc.effectmanager.common.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.TimeUtils;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class MonitorTrace {
    private long duration;
    private final String id;
    private boolean isTraceEnded;
    private final List<String> stepList = new ArrayList();
    private long traceBeginTimeMills;

    static {
        Covode.recordClassIndex(95310);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getStepList() {
        return this.stepList;
    }

    public final void begin() {
        if (!this.stepList.isEmpty()) {
            this.stepList.clear();
        }
        this.isTraceEnded = false;
        this.traceBeginTimeMills = SystemClock.uptimeMillis();
        addStep(">>>>>>> Trace Begin <<<<<<<");
    }

    public final void end() {
        addStep(">>>>>>> Trace End <<<<<<<");
        this.isTraceEnded = true;
        this.duration = SystemClock.uptimeMillis() - this.traceBeginTimeMills;
    }

    public MonitorTrace(String str) {
        this.id = str;
    }

    public final void addStep(String str) {
        l.c(str, "");
        if (!this.isTraceEnded) {
            this.stepList.add(TimeUtils.INSTANCE.currentTime() + " [" + this.id + "]->" + str + " \n");
        }
    }
}
