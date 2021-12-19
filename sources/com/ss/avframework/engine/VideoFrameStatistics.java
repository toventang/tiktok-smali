package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.statics.StaticsReport;

public class VideoFrameStatistics implements StaticsReport.StaticReportInterface {
    static {
        Covode.recordClassIndex(99836);
    }

    private static native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private static native boolean nativeReset();

    public static void reset() {
        MethodCollector.i(11981);
        nativeReset();
        MethodCollector.o(11981);
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.i(12124);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.o(12124);
        return nativeGetStaticsReport;
    }
}
