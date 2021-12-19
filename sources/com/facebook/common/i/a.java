package com.facebook.common.i;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f47113a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f  reason: collision with root package name */
    private static a f47114f;

    /* renamed from: b  reason: collision with root package name */
    public volatile StatFs f47115b;

    /* renamed from: c  reason: collision with root package name */
    public volatile StatFs f47116c;

    /* renamed from: d  reason: collision with root package name */
    public long f47117d;

    /* renamed from: e  reason: collision with root package name */
    public final Lock f47118e = new ReentrantLock();

    /* renamed from: g  reason: collision with root package name */
    private volatile File f47119g;

    /* renamed from: h  reason: collision with root package name */
    private volatile File f47120h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f47121i;

    static {
        Covode.recordClassIndex(28671);
    }

    protected a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(4736);
            if (f47114f == null) {
                f47114f = new a();
            }
            aVar = f47114f;
            MethodCollector.o(4736);
        }
        return aVar;
    }

    public final void c() {
        this.f47115b = a(this.f47115b, this.f47119g);
        this.f47116c = a(this.f47116c, this.f47120h);
        this.f47117d = SystemClock.uptimeMillis();
    }

    /* renamed from: com.facebook.common.i.a$a  reason: collision with other inner class name */
    public enum EnumC1167a {
        INTERNAL,
        EXTERNAL;

        static {
            Covode.recordClassIndex(28672);
        }
    }

    public final void b() {
        if (!this.f47121i) {
            this.f47118e.lock();
            try {
                if (!this.f47121i) {
                    this.f47119g = Environment.getDataDirectory();
                    this.f47120h = Environment.getExternalStorageDirectory();
                    c();
                    this.f47121i = true;
                }
            } finally {
                this.f47118e.unlock();
            }
        }
    }

    private static StatFs a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                return new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw m.b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
            return statFs;
        }
    }
}
