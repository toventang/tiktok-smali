package com.google.ar.core;

import android.content.pm.PackageInstaller;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ao extends PackageInstaller.SessionCallback {

    /* renamed from: a  reason: collision with root package name */
    final Map<Integer, PackageInstaller.SessionInfo> f53428a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ai f53429b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ak f53430c;

    static {
        Covode.recordClassIndex(33068);
    }

    public final void onActiveChanged(int i2, boolean z) {
    }

    public final void onBadgingChanged(int i2) {
    }

    public final void onProgressChanged(int i2, float f2) {
    }

    public final void onCreated(int i2) {
        this.f53428a.put(Integer.valueOf(i2), this.f53430c.f53417d.getSessionInfo(i2));
    }

    ao(ak akVar, ai aiVar) {
        this.f53430c = akVar;
        this.f53429b = aiVar;
    }

    public final void onFinished(int i2, boolean z) {
        PackageInstaller.SessionInfo remove = this.f53428a.remove(Integer.valueOf(i2));
        if (remove != null && "com.google.ar.core".equals(remove.getAppPackageName())) {
            this.f53429b.a(aj.COMPLETED);
        }
    }
}
