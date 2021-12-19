package com.ss.android.ugc.aweme.port.in;

import android.app.Application;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.property.bs;
import com.ss.android.ugc.aweme.property.ez;
import com.ss.android.ugc.aweme.utils.iq;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.k;
import dmt.av.video.c.b;
import java.util.concurrent.locks.ReentrantLock;

public class br {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f115615a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile br f115616c;

    /* renamed from: b  reason: collision with root package name */
    public volatile a f115617b;

    /* renamed from: d  reason: collision with root package name */
    private Application f115618d;

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f115619e = new ReentrantLock();

    /* renamed from: f  reason: collision with root package name */
    private final f f115620f;

    /* renamed from: g  reason: collision with root package name */
    private final ez f115621g;

    public interface a {
        static {
            Covode.recordClassIndex(74582);
        }

        k a();
    }

    static {
        Covode.recordClassIndex(74581);
    }

    private static void b() {
        if (bs.a()) {
            iq.a(true);
        }
    }

    public final void a() {
        if (!f115615a) {
            a(this.f115617b.a());
        }
    }

    public final void a(k kVar) {
        q.d("VESDKLoader initVESDK start");
        if (!f115615a) {
            try {
                this.f115619e.lock();
                if (!f115615a) {
                    b.f156874d.a(this.f115618d).a();
                    b();
                    a(DownloadableModelSupport.getInstance().getResourceFinder(), kVar);
                    bq.a(this.f115618d);
                    f115615a = true;
                }
            } finally {
                this.f115619e.unlock();
            }
        }
        q.d("VESDKLoader initVESDK end");
    }

    private void a(ResourceFinder resourceFinder, k kVar) {
        com.ss.android.ugc.asve.a.a(new b(this.f115618d, this.f115620f, this.f115621g, resourceFinder, kVar));
    }

    private br(Application application, a aVar, f fVar, ez ezVar) {
        this.f115617b = aVar;
        this.f115620f = fVar;
        this.f115621g = ezVar;
        this.f115618d = application;
        g.a().w();
    }

    public static br a(Application application, a aVar, f fVar, ez ezVar) {
        MethodCollector.i(3080);
        if (f115616c == null) {
            synchronized (br.class) {
                try {
                    if (f115616c == null) {
                        f115616c = new br(application, aVar, fVar, ezVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3080);
                    throw th;
                }
            }
        }
        br brVar = f115616c;
        MethodCollector.o(3080);
        return brVar;
    }
}
