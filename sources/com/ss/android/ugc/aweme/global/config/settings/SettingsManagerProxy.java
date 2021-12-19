package com.ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.global.config.settings.a;
import java.util.concurrent.CopyOnWriteArrayList;

public final class SettingsManagerProxy {
    private final b settingManager;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(62999);
        }
    }

    static {
        Covode.recordClassIndex(62998);
    }

    public static SettingsManagerProxy inst() {
        return a.f99071a;
    }

    public final f getGson() {
        return this.settingManager.f99076d;
    }

    public final void notifySettingsChange() {
        this.settingManager.a();
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SettingsManagerProxy f99071a = new SettingsManagerProxy(null);

        static {
            Covode.recordClassIndex(63000);
        }
    }

    private SettingsManagerProxy() {
        this.settingManager = new b();
    }

    /* synthetic */ SettingsManagerProxy(AnonymousClass1 r1) {
        this();
    }

    public final void removeSettingsWatcher(a aVar) {
        MethodCollector.i(4509);
        b bVar = this.settingManager;
        synchronized (bVar.f99073a) {
            try {
                bVar.f99074b.remove(aVar);
            } finally {
                MethodCollector.o(4509);
            }
        }
    }

    public final void registerSettingsWatcher(a aVar, boolean z) {
        MethodCollector.i(4464);
        b bVar = this.settingManager;
        synchronized (bVar.f99073a) {
            try {
                CopyOnWriteArrayList<a> copyOnWriteArrayList = bVar.f99074b;
                if (z) {
                    aVar = new a.C2416a(aVar);
                }
                copyOnWriteArrayList.add(aVar);
            } finally {
                MethodCollector.o(4464);
            }
        }
    }
}
