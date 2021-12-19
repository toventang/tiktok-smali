package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.IKevaPreLoader;
import java.io.File;
import java.util.concurrent.Executor;

public class KevaPreLoader {
    private static IKevaPreLoader sPreLoader;

    static {
        Covode.recordClassIndex(24534);
    }

    public static synchronized IKevaPreLoader getPreLoader() {
        IKevaPreLoader iKevaPreLoader;
        synchronized (KevaPreLoader.class) {
            MethodCollector.i(6648);
            iKevaPreLoader = sPreLoader;
            MethodCollector.o(6648);
        }
        return iKevaPreLoader;
    }

    public static class PreloadConfig {
        public final int maxRepos;
        public final long preloadConfigExpiredTimeInMills;
        public final long preloadTimeInMills;

        static {
            Covode.recordClassIndex(24535);
        }

        public PreloadConfig(long j2, int i2, long j3) {
            this.preloadTimeInMills = j2;
            this.maxRepos = i2;
            this.preloadConfigExpiredTimeInMills = j3;
        }
    }

    public static IKevaPreLoader makePreLoader(File file, PreloadConfig preloadConfig, Executor executor) {
        MethodCollector.i(6646);
        if (file == null || preloadConfig == null) {
            MethodCollector.o(6646);
            return null;
        }
        KevaPreLoaderImpl kevaPreLoaderImpl = new KevaPreLoaderImpl(file, executor, preloadConfig.preloadTimeInMills, preloadConfig.maxRepos, preloadConfig.preloadConfigExpiredTimeInMills);
        synchronized (KevaPreLoader.class) {
            try {
                sPreLoader = kevaPreLoaderImpl;
            } finally {
                MethodCollector.o(6646);
            }
        }
        return kevaPreLoaderImpl;
    }
}
