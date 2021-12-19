package com.google.android.play.core.install;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class NativeInstallStateUpdateListener implements b {
    static {
        Covode.recordClassIndex(32956);
    }

    NativeInstallStateUpdateListener() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.play.core.c.a
    public final /* synthetic */ void a(InstallState installState) {
        MethodCollector.i(9593);
        onStateUpdate(installState);
        MethodCollector.o(9593);
    }

    public final native void onStateUpdate(InstallState installState);
}
