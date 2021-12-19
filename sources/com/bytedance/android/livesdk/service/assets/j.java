package com.bytedance.android.livesdk.service.assets;

import android.os.SystemClock;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.service.network.PropApi;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    private static j f21270d;

    /* renamed from: a  reason: collision with root package name */
    public final List<Prop> f21271a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f21272b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    boolean f21273c = false;

    public interface a {
        static {
            Covode.recordClassIndex(12550);
        }

        void b(List<Prop> list);
    }

    static {
        Covode.recordClassIndex(12549);
    }

    private j() {
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            MethodCollector.i(9562);
            if (f21270d == null) {
                f21270d = new j();
            }
            jVar = f21270d;
            MethodCollector.o(9562);
        }
        return jVar;
    }

    public final Prop a(long j2) {
        for (Prop prop : this.f21271a) {
            if (prop.id == j2) {
                return prop;
            }
        }
        return null;
    }

    public final void b(long j2) {
        if (!this.f21273c) {
            this.f21273c = true;
            ((PropApi) e.a().a(PropApi.class)).getPropList(j2).a(new f()).a(new k(this, SystemClock.uptimeMillis()), new l(this), new m(this));
        }
    }
}
