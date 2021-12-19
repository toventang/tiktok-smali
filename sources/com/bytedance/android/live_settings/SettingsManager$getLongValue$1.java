package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SettingsManager$getLongValue$1 extends i implements b<Class<?>, Long> {
    static {
        Covode.recordClassIndex(7367);
    }

    SettingsManager$getLongValue$1(SettingsManager settingsManager) {
        super(1, settingsManager);
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "getLongValueInternal";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getLongValueInternal(Ljava/lang/Class;)J";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(SettingsManager.class);
    }

    public final long invoke(Class<?> cls) {
        l.c(cls, "");
        return ((SettingsManager) this.receiver).getLongValueInternal(cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ Long invoke(Class<?> cls) {
        return Long.valueOf(invoke(cls));
    }
}
