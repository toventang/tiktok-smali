package com.facebook.share.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.j;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.h f49073a = null;

    static {
        Covode.recordClassIndex(30672);
    }

    public abstract void a(Bundle bundle);

    public void a() {
        com.facebook.h hVar = this.f49073a;
        if (hVar != null) {
            hVar.c();
        }
    }

    public h(com.facebook.h hVar) {
    }

    public void a(j jVar) {
        com.facebook.h hVar = this.f49073a;
        if (hVar != null) {
            hVar.a(jVar);
        }
    }
}
