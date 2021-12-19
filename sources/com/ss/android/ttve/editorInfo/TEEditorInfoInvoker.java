package com.ss.android.ttve.editorInfo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;
import java.util.HashMap;

public class TEEditorInfoInvoker {
    public static native void nativeInit();

    static {
        Covode.recordClassIndex(37617);
        d.a();
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j2) {
        a.a(str, j2);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        a.a(str, str2);
    }

    public static void onNativeCallback_onEditorInfoFloat(String str, float f2) {
        if (a.f61098a != null) {
            a.f61098a.put(str, Float.valueOf(f2));
        }
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        if (a.f61098a != null) {
            a.f61098a.put(str, hashMap);
        }
    }
}
