package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.covode.number.Covode;
import java.util.Timer;
import java.util.TimerTask;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f62470a;

    /* renamed from: b  reason: collision with root package name */
    public Timer f62471b;

    /* renamed from: c  reason: collision with root package name */
    public long f62472c;

    /* renamed from: d  reason: collision with root package name */
    public long f62473d = -1;

    public interface a {
        static {
            Covode.recordClassIndex(38439);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(38438);
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.b$b  reason: collision with other inner class name */
    public class C1367b extends TimerTask {
        static {
            Covode.recordClassIndex(38440);
        }

        public final void run() {
            if (System.currentTimeMillis() - b.this.f62472c > com.bytedance.ies.ugc.aweme.plugin.b.a.f35117c && b.this.f62470a != null) {
                b.this.f62470a.a();
            }
        }

        public C1367b() {
        }
    }

    public final void a() {
        Timer timer = this.f62471b;
        if (timer != null) {
            timer.cancel();
            this.f62471b = null;
        }
        this.f62473d = -1;
        this.f62472c = 0;
    }

    public b(a aVar) {
        this.f62470a = aVar;
    }
}
