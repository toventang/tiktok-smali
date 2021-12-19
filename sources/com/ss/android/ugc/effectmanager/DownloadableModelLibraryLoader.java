package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DownloadableModelLibraryLoader {
    public static final DownloadableModelLibraryLoader INSTANCE = new DownloadableModelLibraryLoader();
    private static volatile boolean hasLoadedLibrary;

    private DownloadableModelLibraryLoader() {
    }

    static {
        Covode.recordClassIndex(95175);
    }

    public final void loadLibrary() {
        MethodCollector.i(2507);
        if (hasLoadedLibrary) {
            MethodCollector.o(2507);
            return;
        }
        synchronized (this) {
            try {
                if (!hasLoadedLibrary) {
                    DownloadableModelSupport.sLibraryLoader.loadLibrary("oldep");
                    hasLoadedLibrary = true;
                }
            } finally {
                MethodCollector.o(2507);
            }
        }
    }
}
