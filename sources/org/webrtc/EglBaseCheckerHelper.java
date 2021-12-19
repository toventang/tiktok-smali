package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.webrtc.EglBase;

public class EglBaseCheckerHelper {
    protected static WeakReference<EglBase.EglContextChecker> eglContextChecker;

    static {
        Covode.recordClassIndex(106564);
    }

    public static void EglContextDestoryEnd() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference != null && weakReference.get() != null) {
            eglContextChecker.get().EglContextDestoryEnd();
        }
    }

    public static void EglContextDestoryStart() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference != null && weakReference.get() != null) {
            eglContextChecker.get().EglContextDestoryStart();
        }
    }

    public static void setEglContextChecker(EglBase.EglContextChecker eglContextChecker2) {
        eglContextChecker = new WeakReference<>(eglContextChecker2);
    }
}
