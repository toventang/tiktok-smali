package com.ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.AVLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GLTracer {
    private static boolean sEnableGlTracer;
    private static volatile GLTracer sGlTracer;
    private List<StackInfo> threads = new ArrayList();

    static {
        Covode.recordClassIndex(100531);
    }

    public static void abort() {
        dump();
    }

    public static void checkAndDump() {
        checkAndDump(12);
    }

    public static void traceStack() {
        traceStack(Thread.currentThread());
    }

    private GLTracer() {
    }

    private static GLTracer getWithLock() {
        if (sGlTracer == null) {
            sGlTracer = new GLTracer();
        }
        return sGlTracer;
    }

    /* access modifiers changed from: package-private */
    public static class StackInfo {
        public String stack;
        public Thread thread;
        public String time;

        static {
            Covode.recordClassIndex(100532);
        }

        public String toString() {
            return "StackInfo{thread=" + this.thread + ", time='" + this.time + ", createStack=" + this.stack + '\'' + '}';
        }

        public StackInfo(Thread thread2, StackTraceElement[] stackTraceElementArr) {
            this.thread = thread2;
            if (stackTraceElementArr != null) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    sb.append("    at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + " :" + stackTraceElement.getLineNumber() + ")").append("\n");
                }
                this.stack = "\n" + sb.toString();
            } else {
                this.stack = "none";
            }
            this.time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        }
    }

    public static void dump() {
        MethodCollector.i(11381);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    for (StackInfo stackInfo : getWithLock().threads) {
                        AVLog.ioe("GLTracer", stackInfo.toString());
                    }
                } finally {
                    MethodCollector.o(11381);
                }
            }
            return;
        }
        MethodCollector.o(11381);
    }

    public static int size() {
        int size;
        MethodCollector.i(11552);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    size = getWithLock().threads.size();
                } finally {
                    MethodCollector.o(11552);
                }
            }
            return size;
        }
        MethodCollector.o(11552);
        return 0;
    }

    public static void removeTraceStack() {
        MethodCollector.i(11226);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    synchronized (GLTracer.class) {
                        try {
                            Iterator<StackInfo> it = getWithLock().threads.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                StackInfo next = it.next();
                                if (next.thread == Thread.currentThread()) {
                                    getWithLock().threads.remove(next);
                                    AVLog.iow("GLTracer", "RemoveTrackStack remain " + getWithLock().threads.size());
                                    break;
                                }
                            }
                        } finally {
                            MethodCollector.o(11226);
                        }
                    }
                    return;
                } finally {
                    MethodCollector.o(11226);
                }
            }
            return;
        }
        MethodCollector.o(11226);
    }

    public static void setEnableGlTracer(boolean z) {
        sEnableGlTracer = z;
    }

    public static void checkAndDump(int i2) {
        if (sEnableGlTracer && size() > i2) {
            dump();
        }
    }

    public static void traceStack(Thread thread) {
        MethodCollector.i(11068);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    getWithLock().threads.add(new StackInfo(thread, Thread.currentThread().getStackTrace()));
                    AVLog.iow("GLTracer", "AddTrackStack with threadName[" + thread.getName() + "] current size " + getWithLock().threads.size());
                    int size = size();
                    if (size > 12) {
                        AVLog.ioe("GLTracer", "Too more GL thread with " + size + " VS 12");
                        abort();
                    }
                } finally {
                    MethodCollector.o(11068);
                }
            }
            return;
        }
        MethodCollector.o(11068);
    }
}
