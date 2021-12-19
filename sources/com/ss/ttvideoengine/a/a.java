package com.ss.ttvideoengine.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f152132d;

    /* renamed from: e  reason: collision with root package name */
    private static a f152133e;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f152134a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f152135b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, IABRModule> f152136c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private int f152137f;

    /* renamed from: g  reason: collision with root package name */
    private final List<IABRModule> f152138g = new ArrayList();

    static {
        Covode.recordClassIndex(101440);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(14059);
        if (f152133e == null) {
            synchronized (a.class) {
                try {
                    if (f152133e == null) {
                        f152133e = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14059);
                    throw th;
                }
            }
        }
        a aVar = f152133e;
        MethodCollector.o(14059);
        return aVar;
    }

    public final IABRModule b() {
        IABRModule iABRModule = null;
        if (!f152132d) {
            return null;
        }
        this.f152134a.lock();
        if (this.f152138g.size() > 0) {
            iABRModule = this.f152138g.remove(0);
        } else if (this.f152137f < 8) {
            iABRModule = new DefaultABRModule();
            this.f152137f++;
        } else if (this.f152135b.size() >= 6) {
            iABRModule = this.f152136c.remove(this.f152135b.remove(0));
        }
        this.f152134a.unlock();
        return iABRModule;
    }

    public final void a(IABRModule iABRModule) {
        this.f152134a.lock();
        iABRModule.stop();
        this.f152138g.add(iABRModule);
        this.f152134a.unlock();
    }

    public final IABRModule a(String str) {
        if (!f152132d || TextUtils.isEmpty(str)) {
            return null;
        }
        this.f152134a.lock();
        IABRModule remove = this.f152136c.remove(str);
        this.f152135b.remove(str);
        this.f152134a.unlock();
        return remove;
    }
}
