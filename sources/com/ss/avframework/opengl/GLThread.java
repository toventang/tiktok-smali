package com.ss.avframework.opengl;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThread;

public class GLThread extends SafeHandlerThread {
    static {
        Covode.recordClassIndex(100526);
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        MethodCollector.i(11347);
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.addRef();
        }
        if (GlUtil.nativeAttachThreadToOpenGl()) {
            AVLog.ioi("GLThread", "gl thread(" + getName() + ") is attached to opengl ...");
            MethodCollector.o(11347);
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("OpenGl thread created failed.");
        MethodCollector.o(11347);
        throw androidRuntimeException;
    }

    public void run() {
        MethodCollector.i(11515);
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is runing ...");
        super.run();
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is exit ...");
        GlUtil.nativeDetachThreadToOpenGl();
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is exit done");
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.decrementRef();
        }
        GLTracer.removeTraceStack();
        MethodCollector.o(11515);
    }

    public GLThread(String str) {
        super(str);
        GLTracer.traceStack(this);
    }
}
