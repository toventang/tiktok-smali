package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26838a;

    /* renamed from: b  reason: collision with root package name */
    static ExecutorService f26839b;

    static {
        Covode.recordClassIndex(15828);
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.common.jato.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15829);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("jato_monitor");
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        f26839b = g.a(a2.a());
    }

    public static synchronized k a() {
        k a2;
        synchronized (d.class) {
            MethodCollector.i(7736);
            a2 = SDKMonitorUtils.a("2021");
            MethodCollector.o(7736);
        }
        return a2;
    }

    public static synchronized ExecutorService b() {
        ExecutorService executorService;
        synchronized (d.class) {
            MethodCollector.i(7796);
            executorService = f26839b;
            MethodCollector.o(7796);
        }
        return executorService;
    }

    public static synchronized void a(final Context context, final a aVar) {
        synchronized (d.class) {
            MethodCollector.i(7667);
            f26839b.execute(new Runnable() {
                /* class com.bytedance.common.jato.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15830);
                }

                public final void run() {
                    if (!d.f26838a && context != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("host_aid", aVar.f26756a);
                            jSONObject.put("update_version_code", aVar.f26757b);
                            jSONObject.put("app_version", aVar.f26758c);
                            jSONObject.put("package_name", aVar.f26759d);
                            jSONObject.put("device_id", aVar.f26760e);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar.f26762g);
                            SDKMonitorUtils.a("2021", arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(aVar.f26761f);
                            SDKMonitorUtils.b("2021", arrayList2);
                            Context context = context;
                            if (!(context instanceof Application)) {
                                context = context.getApplicationContext();
                                if (a.f107168c) {
                                    if (context == null) {
                                        context = a.f107166a;
                                    }
                                }
                            }
                            SDKMonitorUtils.a(context, "2021", jSONObject, new k.a() {
                                /* class com.bytedance.common.jato.d.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(15831);
                                }

                                @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                                public final String a() {
                                    return null;
                                }

                                @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                                public final Map<String, String> b() {
                                    return null;
                                }
                            });
                        } catch (Throwable th) {
                            th.getLocalizedMessage();
                        } finally {
                            d.f26838a = true;
                        }
                    }
                }
            });
            MethodCollector.o(7667);
        }
    }
}
