package com.ss.android.socialbase.downloader.g;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.j.e;
import com.ss.android.socialbase.downloader.k.i;
import java.net.InetAddress;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final i<String, b> f60529a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f60530b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f60531c;

    public interface a {
        static {
            Covode.recordClassIndex(37402);
        }

        void a(String str, List<InetAddress> list);
    }

    static {
        Covode.recordClassIndex(37399);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        List<InetAddress> f60540a;

        /* renamed from: b  reason: collision with root package name */
        long f60541b;

        static {
            Covode.recordClassIndex(37403);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.c$c  reason: collision with other inner class name */
    public static class C1332c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60542a = new c((byte) 0);

        static {
            Covode.recordClassIndex(37404);
        }
    }

    private c() {
        this.f60529a = new i<>(4, 16, false);
        this.f60531c = new Handler(com.ss.android.socialbase.downloader.g.a.b.f60501a.getLooper());
        this.f60530b = new Handler(e.a.f60727a);
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(final String str, final a aVar) {
        this.f60531c.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.g.c.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f60534c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

            static {
                Covode.recordClassIndex(37400);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
                if (r3.isEmpty() == false) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
                if (r3 == null) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
                if (r3.isEmpty() == false) goto L_0x0081;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
                if (r2 == null) goto L_0x0087;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
                r8.a(r5, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
                r3 = r2.f60540a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
                r8.f60530b.removeCallbacks(r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
                if (r6 == null) goto L_0x0091;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
                r6.a(r7, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(12834);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 159
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.g.c.AnonymousClass1.run():void");
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, List<InetAddress> list) {
        MethodCollector.i(13085);
        synchronized (this.f60529a) {
            try {
                b bVar = (b) this.f60529a.get(str);
                if (bVar == null) {
                    bVar = new b((byte) 0);
                    this.f60529a.put(str, bVar);
                }
                bVar.f60540a = list;
                bVar.f60541b = System.currentTimeMillis();
            } finally {
                MethodCollector.o(13085);
            }
        }
    }
}
