package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecordHistogram {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155274a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Throwable f155275b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Long> f155276c = Collections.synchronizedMap(new HashMap());

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i2);

    private static native long nativeRecordBooleanHistogram(String str, long j2, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j2, int i2, int i3, int i4, int i5);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j2, int i2, int i3, int i4, int i5);

    private static native long nativeRecordEnumeratedHistogram(String str, long j2, int i2, int i3);

    private static native long nativeRecordLinearCountHistogram(String str, long j2, int i2, int i3, int i4, int i5);

    private static native long nativeRecordSparseHistogram(String str, long j2, int i2);

    static {
        Covode.recordClassIndex(103325);
    }

    private static long a(String str) {
        Long l2 = f155276c.get(str);
        if (l2 == null) {
            return 0;
        }
        return l2.longValue();
    }

    public static void a(String str, boolean z) {
        MethodCollector.i(13324);
        if (f155275b != null) {
            MethodCollector.o(13324);
            return;
        }
        long a2 = a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a2, z);
        if (nativeRecordBooleanHistogram != a2) {
            f155276c.put(str, Long.valueOf(nativeRecordBooleanHistogram));
        }
        MethodCollector.o(13324);
    }
}
