package com.ss.android.ugc.aweme.user.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.n;

public class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f142358a;

    /* renamed from: b  reason: collision with root package name */
    private WeakHandler f142359b = new WeakHandler(Looper.getMainLooper(), this);

    static {
        Covode.recordClassIndex(93110);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(10698);
        if (f142358a == null) {
            synchronized (a.class) {
                try {
                    if (f142358a == null) {
                        f142358a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10698);
                    throw th;
                }
            }
        }
        a aVar = f142358a;
        MethodCollector.o(10698);
        return aVar;
    }

    public static void a(Handler handler) {
        n.a().a(handler, b.f142360a, 115);
    }
}
