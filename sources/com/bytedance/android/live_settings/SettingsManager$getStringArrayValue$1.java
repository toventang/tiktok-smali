package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SettingsManager$getStringArrayValue$1 extends i implements b<Class<?>, String[]> {
    static {
        Covode.recordClassIndex(7368);
    }

    SettingsManager$getStringArrayValue$1(SettingsManager settingsManager) {
        super(1, settingsManager);
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "getStringArrayValueInternal";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getStringArrayValueInternal(Ljava/lang/Class;)[Ljava/lang/String;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(SettingsManager.class);
    }

    public final String[] invoke(Class<?> cls) {
        l.c(cls, "");
        return ((SettingsManager) this.receiver).getStringArrayValueInternal(cls);
    }
}
