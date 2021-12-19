package com.bytedance.platform.a.b.c;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.a.a.a;
import com.bytedance.platform.a.a.g;
import com.bytedance.platform.a.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    static final Object f41884c = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static d f41885i;

    /* renamed from: a  reason: collision with root package name */
    public Application f41886a;

    /* renamed from: b  reason: collision with root package name */
    public c f41887b;

    /* renamed from: d  reason: collision with root package name */
    List<Message> f41888d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f41889e;

    /* renamed from: f  reason: collision with root package name */
    public b f41890f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f41891g;

    /* renamed from: h  reason: collision with root package name */
    private long f41892h;

    /* renamed from: j  reason: collision with root package name */
    private MessageQueue f41893j;

    /* renamed from: k  reason: collision with root package name */
    private Field f41894k;

    /* renamed from: l  reason: collision with root package name */
    private Field f41895l;

    static {
        Covode.recordClassIndex(25593);
    }

    private d() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f41886a == null) {
            throw new RuntimeException("Must call start(Application context) first!!!");
        }
    }

    public static d b() {
        MethodCollector.i(5116);
        if (f41885i == null) {
            synchronized (d.class) {
                try {
                    if (f41885i == null) {
                        f41885i = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5116);
                    throw th;
                }
            }
        }
        d dVar = f41885i;
        MethodCollector.o(5116);
        return dVar;
    }

    public final void a() {
        MethodCollector.i(5029);
        c();
        synchronized (f41884c) {
            try {
                MessageQueue messageQueue = this.f41893j;
                if (messageQueue != null) {
                    synchronized (messageQueue) {
                        try {
                            for (Message message : this.f41888d) {
                                if (message.obj != null && message.arg2 == 9527) {
                                    Message obtain = Message.obtain(message);
                                    obtain.arg2 = 9528;
                                    message.what *= -1;
                                    int i2 = obtain.what;
                                    g.a(g.a.ERROR);
                                    int i3 = obtain.what;
                                    g.a(g.a.ERROR);
                                    ((Handler) a.b()).dispatchMessage(obtain);
                                }
                            }
                        } finally {
                            MethodCollector.o(5029);
                        }
                    }
                    this.f41888d.clear();
                }
            } finally {
                MethodCollector.o(5029);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef A[Catch:{ all -> 0x011f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.a.b.c.d.run():void");
    }
}
