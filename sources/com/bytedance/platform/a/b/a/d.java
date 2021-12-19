package com.bytedance.platform.a.b.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.b.a;
import java.util.ArrayList;
import java.util.List;

public final class d implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static d f41852a = new d();

    /* renamed from: b  reason: collision with root package name */
    public List<a> f41853b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public Handler.Callback f41854c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41855d;

    static {
        Covode.recordClassIndex(25580);
    }

    private d() {
    }

    public final void a(a aVar) {
        this.f41853b.add(aVar);
    }

    public final boolean handleMessage(Message message) {
        if (message.arg2 == 1000089) {
            Handler.Callback callback = this.f41854c;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        } else if (a.b(message)) {
            c a2 = c.a();
            Message obtain = Message.obtain(message);
            Message obtain2 = Message.obtain(a2.f41839b);
            obtain2.obj = obtain;
            a2.f41839b.sendMessageAtTime(obtain2, message.getWhen());
            return true;
        } else if (message.getTarget() == com.bytedance.platform.a.a.a.b() && a.f41828b.contains(Integer.valueOf(message.what))) {
            a.a(Message.obtain(message));
            return true;
        } else {
            Handler.Callback callback2 = this.f41854c;
            if (callback2 != null) {
                return callback2.handleMessage(message);
            }
            return false;
        }
    }
}
