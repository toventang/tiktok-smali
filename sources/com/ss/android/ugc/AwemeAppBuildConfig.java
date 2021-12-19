package com.ss.android.ugc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;

public class AwemeAppBuildConfig implements AppBuildConfig {
    static {
        Covode.recordClassIndex(38036);
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    public final String a() {
        return "22.5.3";
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    public final String b() {
        return "disabled";
    }

    @Override // com.bytedance.ies.ugc.appcontext.AppBuildConfig
    public final String c() {
        return "alpha";
    }

    public static AppBuildConfig d() {
        MethodCollector.i(5023);
        Object a2 = b.a(AppBuildConfig.class, false);
        if (a2 != null) {
            AppBuildConfig appBuildConfig = (AppBuildConfig) a2;
            MethodCollector.o(5023);
            return appBuildConfig;
        }
        if (b.f145535j == null) {
            synchronized (AppBuildConfig.class) {
                try {
                    if (b.f145535j == null) {
                        b.f145535j = new AwemeAppBuildConfig();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5023);
                    throw th;
                }
            }
        }
        AwemeAppBuildConfig awemeAppBuildConfig = (AwemeAppBuildConfig) b.f145535j;
        MethodCollector.o(5023);
        return awemeAppBuildConfig;
    }
}
