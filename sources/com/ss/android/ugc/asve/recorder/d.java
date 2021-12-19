package com.ss.android.ugc.asve.recorder;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.listener.b;
import com.ss.android.ugc.asve.recorder.a.a;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.runtime.e;
import h.z;

public interface d {
    static {
        Covode.recordClassIndex(38261);
    }

    void a(Context context);

    void a(b bVar);

    void a(ax.j jVar);

    void a(r rVar);

    void a(e eVar, String str);

    void a(h.f.a.b<? super Integer, z> bVar);

    void a(h.f.a.r<? super Integer, ? super Integer, ? super String, ? super ax, z> rVar);

    a b();

    void b(b bVar);

    com.ss.android.ugc.asve.recorder.camera.d c();

    com.ss.android.ugc.asve.recorder.b.a d();

    com.ss.android.ugc.asve.recorder.effect.a e();

    com.ss.android.ugc.asve.recorder.c.a f();

    com.ss.android.ugc.asve.recorder.reaction.a g();

    com.ss.android.ugc.asve.d.a h();
}
