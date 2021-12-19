package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.d;

public class TEImageUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f61054a = TEImageUtils.class.getSimpleName();

    private static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i2);

    static {
        Covode.recordClassIndex(37603);
        d.a();
    }

    public static int a(VEFrame vEFrame, VEFrame vEFrame2, VEFrame.b bVar) {
        MethodCollector.i(7758);
        int nativeConvertFrame = nativeConvertFrame(vEFrame, vEFrame2, bVar.ordinal());
        MethodCollector.o(7758);
        return nativeConvertFrame;
    }
}
