package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ModelnamesAssigner {
    static {
        Covode.recordClassIndex(2856);
    }

    private static native int nativeSetAssignedModelNames(long j2, String[] strArr, String[] strArr2);

    private static native int nativeSetAssignedModelNamesWithPriority(long j2, String[] strArr, String[] strArr2, int[] iArr);

    private ModelnamesAssigner() {
    }

    public static int setAssignedModelNames(long j2, String[] strArr, String[] strArr2) {
        MethodCollector.i(2012);
        int nativeSetAssignedModelNames = nativeSetAssignedModelNames(j2, strArr, strArr2);
        MethodCollector.o(2012);
        return nativeSetAssignedModelNames;
    }

    public static int setAssignedModelNamesWithPriority(long j2, String[] strArr, String[] strArr2, int[] iArr) {
        MethodCollector.i(2019);
        int nativeSetAssignedModelNamesWithPriority = nativeSetAssignedModelNamesWithPriority(j2, strArr, strArr2, iArr);
        MethodCollector.o(2019);
        return nativeSetAssignedModelNamesWithPriority;
    }
}
