package com.bytedance.platform.godzilla;

import android.app.Activity;
import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.a.e;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.a.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public enum b {
    INSTANCE;
    

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Integer, WeakReference<Activity>> f41957a = new HashMap<>();
    private com.bytedance.platform.godzilla.a.b mConsumeExceptionHandler;
    private WeakReference<Activity> mLastDestoryActivity;
    private WeakReference<Activity> mLastPauseActivity;
    private WeakReference<Activity> mLastResumedActivity;
    private WeakReference<Activity> mLastStopActivity;

    static {
        Covode.recordClassIndex(25627);
    }

    public final void destroy() {
        MethodCollector.i(3683);
        com.bytedance.platform.godzilla.a.b bVar = this.mConsumeExceptionHandler;
        if (bVar != null) {
            synchronized (bVar.f41952c) {
                try {
                    bVar.f41952c.clear();
                } finally {
                    MethodCollector.o(3683);
                }
            }
            return;
        }
        MethodCollector.o(3683);
    }

    public final void removeUncaughtExceptionConsumer(h hVar) {
        "remove consumer:".concat(String.valueOf(hVar));
        g.a(g.a.INFO);
        this.mConsumeExceptionHandler.b(hVar);
    }

    public final void addUncaughtExceptionConsumer(h hVar) {
        if (this.mConsumeExceptionHandler == null) {
            com.bytedance.platform.godzilla.a.b bVar = new com.bytedance.platform.godzilla.a.b();
            this.mConsumeExceptionHandler = bVar;
            if (!bVar.f41950a) {
                bVar.f41951b = Thread.getDefaultUncaughtExceptionHandler();
                if (bVar.f41951b != bVar) {
                    Thread.setDefaultUncaughtExceptionHandler(bVar);
                } else {
                    bVar.f41951b = null;
                }
                bVar.f41950a = true;
            }
        }
        g.a(g.a.INFO);
        "add consumer:".concat(String.valueOf(hVar));
        g.a(g.a.INFO);
        this.mConsumeExceptionHandler.a(hVar);
    }

    public final void init(Application application, e eVar, g.a aVar) {
        if (eVar != null) {
            g.f41955c = eVar;
        }
        if (aVar != null) {
            g.f41953a = aVar;
            if (aVar == g.a.DEBUG) {
                g.f41954b = true;
            }
        }
    }
}
