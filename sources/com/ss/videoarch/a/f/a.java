package com.ss.videoarch.a.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.a.a.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f154296i;

    /* renamed from: j  reason: collision with root package name */
    private static final SparseArray<String> f154297j;

    /* renamed from: k  reason: collision with root package name */
    private static final SparseArray<String> f154298k;

    /* renamed from: l  reason: collision with root package name */
    private static final SparseArray<String> f154299l;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4105a f154300a;

    /* renamed from: b  reason: collision with root package name */
    public final long f154301b;

    /* renamed from: c  reason: collision with root package name */
    public long f154302c;

    /* renamed from: d  reason: collision with root package name */
    public long f154303d = 10000;

    /* renamed from: e  reason: collision with root package name */
    public AtomicInteger f154304e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public String f154305f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f154306g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f154307h = new Handler(Looper.myLooper()) {
        /* class com.ss.videoarch.a.f.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(102871);
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 10001:
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - a.this.f154302c < a.this.f154301b) {
                        a.this.a(-100015);
                        a.this.f154300a.a();
                        a.this.f154307h.sendEmptyMessageDelayed(10001, a.this.f154303d);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("stallTime", Long.valueOf(currentTimeMillis - a.this.f154302c));
                    a.this.a(-1, new com.ss.videoarch.a.a.a(-100007, "Stall retry timeout", hashMap));
                    return;
                case 10002:
                case 10003:
                    a.this.a(2, (com.ss.videoarch.a.a.a) null);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private int f154308m = 7;
    private boolean n = false;
    private long o = 0;
    private boolean p = false;
    private b q;

    /* renamed from: com.ss.videoarch.a.f.a$a  reason: collision with other inner class name */
    public interface AbstractC4105a {
        static {
            Covode.recordClassIndex(102872);
        }

        void a();

        void a(com.ss.videoarch.a.a.a aVar);

        void b();

        void c();
    }

    private boolean b() {
        b bVar = this.q;
        if (bVar != null) {
            return bVar.k();
        }
        return false;
    }

    public final void a() {
        this.f154304e.set(0);
        this.f154302c = 0;
        this.f154308m = 7;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.f154307h.removeCallbacksAndMessages(null);
    }

    static {
        Covode.recordClassIndex(102870);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f154296i = sparseIntArray;
        SparseArray<String> sparseArray = new SparseArray<>();
        f154297j = sparseArray;
        SparseArray<String> sparseArray2 = new SparseArray<>();
        f154298k = sparseArray2;
        SparseArray<String> sparseArray3 = new SparseArray<>();
        f154299l = sparseArray3;
        sparseIntArray.put(-100002, 3);
        sparseIntArray.put(-100006, 3);
        sparseIntArray.put(-100007, 3);
        sparseIntArray.put(-100008, 3);
        sparseIntArray.put(-100009, 3);
        sparseIntArray.put(-100013, 3);
        sparseIntArray.put(-100014, 3);
        sparseArray.put(-499988, "media player: setting uri is null error");
        sparseArray.put(-499987, "media player: setting uri is error");
        sparseArray.put(-499986, "media player: url is not mp4 error");
        sparseArray.put(-499985, "media player: invalid data error");
        sparseArray.put(-499899, "media player: http bad request error");
        sparseArray.put(-499898, "media player: http unauthorized error");
        sparseArray.put(-499897, "media player: http forbidden error");
        sparseArray.put(-499896, "media player: http not found error");
        sparseArray.put(-499894, "media player: http other 4xx error");
        sparseArray.put(-499893, "media player: http server error");
        sparseArray.put(-499891, "media player: http content type invalid");
        sparseArray.put(251658241, "media info http redirect");
        sparseArray.put(-499799, "media player: tcp failed to resolve hostname");
        sparseArray.put(-499795, "media player: tcp send data failed");
        sparseArray.put(-499794, "media player: tcp receive data failed");
        sparseArray.put(-499793, "media player: tcp read network timeout");
        sparseArray.put(-499792, "media player: tcp write network timeout");
        sparseArray2.put(-499999, "media player setting is null");
        sparseArray2.put(-499997, "media player start decoder error");
        sparseArray2.put(-499996, "media player open decoder error");
        sparseArray2.put(-499992, "media player open outlet error");
        sparseArray2.put(-499991, "media player start outputer error");
        sparseArray2.put(-499990, "media player start outlet error");
        sparseArray2.put(-499989, "media player open device error");
        sparseArray2.put(1, "android media player unknown");
        sparseArray3.put(-1, "not retry, report to application");
        sparseArray3.put(1, "try next url from live info");
        sparseArray3.put(2, "reset player");
    }

    private void a(com.ss.videoarch.a.a.a aVar) {
        int i2 = this.f154308m - 1;
        this.f154308m = i2;
        if (i2 >= 0) {
            this.q.a(aVar.code, aVar.getInfoJSON());
        }
    }

    public final void a(int i2) {
        if (!this.n || System.currentTimeMillis() - this.o >= 1000) {
            this.q.c(i2);
            this.q.a(i2);
            this.n = true;
            this.o = System.currentTimeMillis();
        }
    }

    public final void a(int i2, com.ss.videoarch.a.a.a aVar) {
        long j2;
        if (i2 == -1) {
            this.f154300a.a(aVar);
        } else if (i2 == 1) {
            this.f154300a.b();
        } else if (i2 == 2) {
            this.f154300a.a();
        } else if (i2 != 3) {
            if (i2 == 4) {
                this.f154300a.c();
            } else if (i2 == 5) {
                this.f154307h.sendEmptyMessageDelayed(10003, (long) this.q.cp);
            }
        } else if (!this.f154307h.hasMessages(10002)) {
            Handler handler = this.f154307h;
            if (this.f154304e.get() > 3) {
                j2 = this.f154303d;
            } else {
                j2 = (long) (this.f154304e.get() * this.f154304e.get() * 1000);
            }
            handler.sendEmptyMessageDelayed(10002, j2);
        }
    }

    public final void a(com.ss.videoarch.a.a.a aVar, boolean z) {
        int i2;
        if (this.f154306g) {
            if (!this.p || aVar.code != -100016) {
                this.f154304e.incrementAndGet();
                this.f154304e.get();
                if (aVar.code != -100016) {
                    this.p = true;
                }
                Map map = aVar.info;
                if (this.f154304e.get() > 700) {
                    i2 = -1;
                } else if (aVar.code == -100003) {
                    int i3 = 0;
                    try {
                        i3 = ((Integer) map.get("internalCode")).intValue();
                        aVar.code = i3;
                    } catch (NumberFormatException unused) {
                        map.put("retryError", "error while get player internal error code");
                    }
                    SparseArray<String> sparseArray = f154297j;
                    if (sparseArray.indexOfKey(i3) >= 0) {
                        map.put("playErrorReason", sparseArray.get(i3));
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                    if (b()) {
                        if (this.f154304e.get() > this.q.cn) {
                            i2 = 4;
                        } else {
                            i2 = 5;
                        }
                    }
                } else {
                    i2 = 3;
                }
                if (this.f154304e.get() > 3 && this.f154305f != null) {
                    com.ss.videoarch.a.d.b.a().b(this.f154305f);
                }
                this.q.i();
                if (this.f154304e.get() == 1) {
                    this.q.a(aVar.code, z);
                }
                a(i2, aVar);
                a(aVar);
                a(aVar.code);
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            this.f154302c = System.currentTimeMillis();
            if (z2) {
                this.f154300a.a();
                a(-100018);
            }
            if (!this.f154307h.hasMessages(10001)) {
                this.f154307h.sendEmptyMessageDelayed(10001, this.f154303d);
                return;
            }
            return;
        }
        a();
    }

    public a(AbstractC4105a aVar, int i2, long j2, b bVar) {
        this.f154300a = aVar;
        this.f154301b = (long) (i2 * 1000);
        this.f154303d = j2;
        this.f154304e.set(0);
        this.q = bVar;
    }
}
