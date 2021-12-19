package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class PlanConfig implements Serializable {
    @c(a = "tasks")
    private List<CommerceSmartUITasks> task;

    static {
        Covode.recordClassIndex(59481);
    }

    public final List<CommerceSmartUITasks> getTask() {
        return this.task;
    }

    public final void setTask(List<CommerceSmartUITasks> list) {
        this.task = list;
    }
}
