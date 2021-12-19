package org.webrtc;

import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

public abstract /* synthetic */ class EglBase$$CC {
    public static void $$triggerInterfaceInit() {
    }

    static {
        Covode.recordClassIndex(106556);
    }

    public static EglBase create$$STATIC$$() {
        return create$$STATIC$$(null, EglBase.CONFIG_PLAIN);
    }

    public static EglBase create$$STATIC$$(EglBase.Context context) {
        return create$$STATIC$$(context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase create$$STATIC$$(EglBase.Context context, int[] iArr) {
        return (!EglBase14.isEGL14Supported() || (context != null && !(context instanceof EglBase14.Context))) ? new EglBase10((EglBase10.Context) context, iArr) : new EglBase14((EglBase14.Context) context, iArr);
    }

    public static EglBase createEgl10$$STATIC$$(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), iArr);
    }

    public static EglBase createEgl10$$STATIC$$(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase createEgl14$$STATIC$$(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(new EglBase14.Context(eGLContext), iArr);
    }

    public static EglBase createEgl14$$STATIC$$(int[] iArr) {
        return new EglBase14(null, iArr);
    }

    public static void eglContextDestoryEnd$$STATIC$$() {
        EglBaseCheckerHelper.EglContextDestoryEnd();
    }

    public static void eglContextDestoryStart$$STATIC$$() {
        EglBaseCheckerHelper.EglContextDestoryStart();
    }

    public static void setEglContextChecker$$STATIC$$(EglBase.EglContextChecker eglContextChecker) {
        EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
    }
}
