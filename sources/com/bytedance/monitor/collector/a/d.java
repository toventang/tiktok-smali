package com.bytedance.monitor.collector.a;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.a;
import java.util.Map;

public final class d implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static d f41446a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static c f41447b = null;

    /* renamed from: d  reason: collision with root package name */
    private static Map<IBinder, Service> f41448d;

    /* renamed from: c  reason: collision with root package name */
    public Handler.Callback f41449c;

    private d() {
    }

    static {
        Covode.recordClassIndex(25394);
    }

    public final boolean handleMessage(Message message) {
        try {
            if (b.f41434a.contains(Integer.valueOf(message.what))) {
                f41447b = c.a(message);
            }
        } catch (Throwable unused) {
        }
        Handler.Callback callback = this.f41449c;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    public final synchronized String a(IBinder iBinder) {
        String str;
        if (f41448d == null) {
            try {
                Object b2 = a.b();
                f41448d = (Map) a.a(b2.getClass(), "mServices").get(b2);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f41448d;
        str = null;
        if (!(map == null || map.get(iBinder) == null)) {
            str = f41448d.get(iBinder).getClass().getName();
        }
        return str;
    }
}
