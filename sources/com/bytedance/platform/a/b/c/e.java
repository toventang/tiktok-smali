package com.bytedance.platform.a.b.c;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.a.a.b;
import com.bytedance.platform.a.b.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static e f41896a = new e();

    /* renamed from: e  reason: collision with root package name */
    private static Map<IBinder, Service> f41897e;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f41898b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f41899c;

    /* renamed from: d  reason: collision with root package name */
    public Handler.Callback f41900d;

    static {
        Covode.recordClassIndex(25594);
    }

    private e() {
    }

    public final boolean handleMessage(Message message) {
        if (com.bytedance.platform.a.b.a.a.b(message)) {
            if (message.arg2 == 9529) {
                return true;
            }
            try {
                this.f41898b.add(a.a(message));
                if (this.f41898b.size() > 100) {
                    this.f41898b.subList(0, 50).clear();
                }
            } catch (Throwable unused) {
            }
            message.arg2 = 9529;
        }
        Handler.Callback callback = this.f41900d;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    public final synchronized String a(IBinder iBinder) {
        String str;
        MethodCollector.i(4753);
        if (f41897e == null) {
            try {
                Object a2 = com.bytedance.platform.a.a.a.a();
                f41897e = (Map) b.a(a2.getClass(), "mServices").get(a2);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f41897e;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f41897e.get(iBinder).getClass().getName();
        }
        if (str == null) {
            this.f41899c = true;
        }
        MethodCollector.o(4753);
        return str;
    }
}
