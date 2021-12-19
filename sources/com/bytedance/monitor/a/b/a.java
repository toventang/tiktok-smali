package com.bytedance.monitor.a.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a.a;
import com.bytedance.monitor.a.b.a.b;
import com.bytedance.monitor.a.b.a.c;
import com.bytedance.monitor.a.b.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f41361b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Map<b, Long> f41362a = new ConcurrentHashMap(3);

    /* renamed from: c  reason: collision with root package name */
    private volatile b f41363c;

    /* renamed from: d  reason: collision with root package name */
    private volatile b f41364d;

    /* renamed from: e  reason: collision with root package name */
    private volatile b f41365e;

    /* renamed from: f  reason: collision with root package name */
    private f f41366f;

    /* renamed from: g  reason: collision with root package name */
    private d.a f41367g;

    @Override // com.bytedance.monitor.a.b.d
    public final f b() {
        return this.f41366f;
    }

    @Override // com.bytedance.monitor.a.b.d
    public final ExecutorService a() {
        return d();
    }

    /* renamed from: com.bytedance.monitor.a.b.a$a  reason: collision with other inner class name */
    public static final class C1013a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41371a = new a();

        static {
            Covode.recordClassIndex(25355);
        }
    }

    static {
        Covode.recordClassIndex(25351);
    }

    private b c() {
        if (this.f41364d == null) {
            Object obj = f41361b;
            synchronized (obj) {
                if (this.f41364d == null) {
                    f fVar = this.f41366f;
                    synchronized (obj) {
                        if (this.f41364d == null) {
                            com.bytedance.monitor.a.b.a.a aVar = new com.bytedance.monitor.a.b.a.a("light-weight-task");
                            aVar.f41373b = fVar;
                            aVar.f41374c = new a.AbstractC1014a() {
                                /* class com.bytedance.monitor.a.b.a.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(25353);
                                }

                                @Override // com.bytedance.monitor.a.b.a.a.AbstractC1014a
                                public final void a(long j2) {
                                    a.this.f41362a.put(b.LIGHT_WEIGHT, Long.valueOf(j2));
                                }
                            };
                            b bVar = new b(aVar);
                            bVar.f41379b = fVar;
                            this.f41364d = bVar;
                        }
                    }
                }
            }
        }
        return this.f41364d;
    }

    private b d() {
        if (this.f41363c == null) {
            Object obj = f41361b;
            synchronized (obj) {
                if (this.f41363c == null) {
                    f fVar = this.f41366f;
                    synchronized (obj) {
                        if (this.f41363c == null) {
                            com.bytedance.monitor.a.b.a.a aVar = new com.bytedance.monitor.a.b.a.a("io-task");
                            aVar.f41373b = fVar;
                            aVar.f41374c = new a.AbstractC1014a() {
                                /* class com.bytedance.monitor.a.b.a.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(25352);
                                }

                                @Override // com.bytedance.monitor.a.b.a.a.AbstractC1014a
                                public final void a(long j2) {
                                    a.this.f41362a.put(b.IO, Long.valueOf(j2));
                                }
                            };
                            b bVar = new b(aVar);
                            bVar.f41379b = fVar;
                            this.f41363c = bVar;
                        }
                    }
                }
            }
        }
        return this.f41363c;
    }

    private b e() {
        if (this.f41365e == null) {
            Object obj = f41361b;
            synchronized (obj) {
                if (this.f41365e == null) {
                    f fVar = this.f41366f;
                    synchronized (obj) {
                        if (this.f41365e == null) {
                            com.bytedance.monitor.a.b.a.a aVar = new com.bytedance.monitor.a.b.a.a("time-sensitive-task");
                            aVar.f41373b = fVar;
                            aVar.f41374c = new a.AbstractC1014a() {
                                /* class com.bytedance.monitor.a.b.a.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(25354);
                                }

                                @Override // com.bytedance.monitor.a.b.a.a.AbstractC1014a
                                public final void a(long j2) {
                                    a.this.f41362a.put(b.TIME_SENSITIVE, Long.valueOf(j2));
                                }
                            };
                            b bVar = new b(aVar);
                            bVar.f41379b = fVar;
                            this.f41365e = bVar;
                        }
                    }
                }
            }
        }
        return this.f41365e;
    }

    @Override // com.bytedance.monitor.a.b.d
    public final void a(d.a aVar) {
        this.f41367g = aVar;
    }

    private c c(e eVar) {
        b b2 = eVar.b();
        if (b2 == b.IO) {
            return d();
        }
        if (b2 == b.TIME_SENSITIVE) {
            return e();
        }
        return c();
    }

    @Override // com.bytedance.monitor.a.b.d
    public final long a(b bVar) {
        Long l2 = this.f41362a.get(bVar);
        if (l2 != null) {
            return l2.longValue();
        }
        return -1;
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void b(e eVar) {
        if (eVar != null) {
            try {
                c(eVar).b(eVar);
            } catch (Throwable th) {
                a(th, "Apm-Async-task-removeTask");
            }
        }
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar) {
        if (eVar != null) {
            try {
                c(eVar).a(eVar);
            } catch (Throwable th) {
                a(th, "Apm-Async-task-post");
            }
        }
    }

    @Override // com.bytedance.monitor.a.b.d
    public final void a(ExecutorService executorService) {
        b d2 = d();
        if (executorService == null) {
            d2.f41380c = null;
            d2.f41381d = null;
            return;
        }
        if (executorService instanceof ThreadPoolExecutor) {
            d2.f41381d = (ThreadPoolExecutor) executorService;
        }
        d2.f41380c = (ExecutorService) Proxy.newProxyInstance(executorService.getClass().getClassLoader(), new Class[]{ExecutorService.class}, new InvocationHandler(executorService) {
            /* class com.bytedance.monitor.a.b.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExecutorService f41386a;

            static {
                Covode.recordClassIndex(25360);
            }

            {
                this.f41386a = r2;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object invoke;
                ExecutorService executorService = this.f41386a;
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{executorService, objArr}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_thread_inner_ApmInnerThreadPool$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    invoke = a2.second;
                } else {
                    invoke = method.invoke(executorService, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{executorService, objArr}, "com_bytedance_monitor_util_thread_inner_ApmInnerThreadPool$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                if (b.this.a()) {
                    String str = "null";
                    if (objArr != null) {
                        for (int i2 = 0; i2 < objArr.length; i2++) {
                            str = str + objArr[i2];
                        }
                    }
                    b.this.a("call outer-executor " + method.getName() + ", args: " + str);
                    if ("submit".equals(method.getName())) {
                        b.this.a("call outer-executor " + method.getName() + ", args: " + str);
                    }
                }
                return invoke;
            }
        });
    }

    @Override // com.bytedance.monitor.a.b.d
    public final void a(Throwable th, String str) {
        d.a aVar = this.f41367g;
        if (aVar != null) {
            aVar.a(th, str);
        }
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar, long j2) {
        if (eVar != null) {
            try {
                c(eVar).a(eVar, j2);
            } catch (Throwable th) {
                a(th, "Apm-Async-task-postDelayed");
            }
        }
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar, long j2, long j3) {
        if (eVar != null) {
            try {
                c(eVar).a(eVar, j2, j3);
            } catch (Throwable th) {
                a(th, "Apm-Async-task-removeTask");
            }
        }
    }
}
