package com.bytedance.android.livesdk.newvideogift.a;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f19879a;

    static {
        Covode.recordClassIndex(11771);
    }

    c(b bVar) {
        this.f19879a = bVar;
    }

    public final void run() {
        boolean z;
        b bVar = this.f19879a;
        boolean z2 = true;
        if (bVar.f19870f != null) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f19869e == null || !bVar.f19869e.a()) {
            z2 = false;
        }
        a.a(3, "GiftCtlManager", "timer start :message = " + z + ", media-playing = " + z2 + ", playEnd = " + bVar.f19872h);
        if (z || z2 || !bVar.f19872h) {
            bVar.b();
        } else {
            bVar.a();
        }
    }
}
