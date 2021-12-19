package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f27364a;

    static {
        Covode.recordClassIndex(16102);
    }

    public static b a(Context context) {
        MethodCollector.i(6265);
        if (f27364a == null) {
            synchronized (b.class) {
                try {
                    if (f27364a == null) {
                        HandlerThread handlerThread = new HandlerThread("wschannel");
                        handlerThread.start();
                        a aVar = new a();
                        k kVar = new k(context, aVar);
                        b bVar = new b(context, handlerThread.getLooper(), new m(context), aVar, kVar, new j(context, new WeakHandler(handlerThread.getLooper(), new WeakHandler.IHandler() {
                            /* class com.bytedance.common.wschannel.server.i.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(16103);
                            }

                            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                            public final void handleMsg(Message message) {
                            }
                        })));
                        kVar.f27374d = bVar;
                        f27364a = bVar;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6265);
                    throw th;
                }
            }
        }
        b bVar2 = f27364a;
        MethodCollector.o(6265);
        return bVar2;
    }
}
