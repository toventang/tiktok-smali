package com.bytedance.android.live.liveinteract.multiguest.g.c;

import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.c.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public abstract class a {
    static {
        Covode.recordClassIndex(6063);
    }

    public void a(m mVar) {
        l.d(mVar, "");
    }

    public abstract void a(DataChannel dataChannel);

    public abstract void a(String str);

    public abstract void a(String str, SurfaceView surfaceView);

    public abstract void a(boolean z);

    public boolean a(n nVar) {
        l.d(nVar, "");
        return false;
    }

    public abstract void b();

    public abstract void b(String str);

    public void b(boolean z) {
    }

    public abstract com.bytedance.android.live.liveinteract.multiguest.g.b.a c(String str);

    public void c() {
    }

    public void c(boolean z) {
    }

    public void d() {
    }

    public abstract void d(String str);

    public void d(boolean z) {
    }

    public int e() {
        return 1;
    }

    public int e(String str) {
        l.d(str, "");
        return 0;
    }

    public int f(String str) {
        l.d(str, "");
        return 0;
    }
}
