package com.ss.android.ugc.asve.recorder.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.w;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ax f62150a;

    static {
        Covode.recordClassIndex(38199);
    }

    @Override // com.ss.android.ugc.asve.recorder.b.a
    public final void a(Runnable runnable) {
        this.f62150a.a(runnable);
    }

    public b(ax axVar) {
        l.d(axVar, "");
        this.f62150a = axVar;
    }

    @Override // com.ss.android.ugc.asve.recorder.b.a
    public final void a(boolean z) {
        this.f62150a.o(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.b.a
    public final void a(String str, String str2, boolean z) {
        l.d(str, "");
        ax axVar = this.f62150a;
        if (str2 == null) {
            str2 = "";
        }
        axVar.a(new w(str, str2, z));
    }
}
