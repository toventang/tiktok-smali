package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.statics.StaticsReport;

public abstract class MediaSource extends NativeObject implements StaticsReport.StaticReportInterface {
    static {
        Covode.recordClassIndex(99820);
    }

    public abstract int status();
}
