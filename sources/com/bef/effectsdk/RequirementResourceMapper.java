package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class RequirementResourceMapper {
    static {
        Covode.recordClassIndex(2860);
    }

    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    private RequirementResourceMapper() {
    }

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        MethodCollector.i(1995);
        String[] nativePeekResourcesNeededByRequirements = nativePeekResourcesNeededByRequirements(strArr);
        MethodCollector.o(1995);
        return nativePeekResourcesNeededByRequirements;
    }
}
