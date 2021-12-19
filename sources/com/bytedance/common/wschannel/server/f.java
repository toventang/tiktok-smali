package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.server.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f27356a;

    static {
        Covode.recordClassIndex(16096);
    }

    public static b a(Context context) {
        MethodCollector.i(6162);
        if (f27356a == null) {
            synchronized (b.class) {
                try {
                    if (f27356a == null) {
                        HandlerThread handlerThread = new HandlerThread("wschannel");
                        handlerThread.start();
                        a aVar = new a();
                        g gVar = new g(context, aVar);
                        b bVar = new b(context, handlerThread.getLooper(), new e() {
                            /* class com.bytedance.common.wschannel.server.f.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(16098);
                            }

                            @Override // com.bytedance.common.wschannel.server.e
                            public final void a(Map<Integer, IWsApp> map) {
                            }

                            @Override // com.bytedance.common.wschannel.server.e
                            public final Map<Integer, IWsApp> a() {
                                return Collections.emptyMap();
                            }
                        }, aVar, gVar, new d() {
                            /* class com.bytedance.common.wschannel.server.f.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(16097);
                            }

                            @Override // com.bytedance.common.wschannel.server.d
                            public final void a() {
                            }

                            @Override // com.bytedance.common.wschannel.server.d
                            public final void a(d.a aVar) {
                            }

                            @Override // com.bytedance.common.wschannel.server.d
                            public final boolean b() {
                                return true;
                            }
                        });
                        gVar.f27357a = bVar;
                        f27356a = bVar;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6162);
                    throw th;
                }
            }
        }
        b bVar2 = f27356a;
        MethodCollector.o(6162);
        return bVar2;
    }
}
