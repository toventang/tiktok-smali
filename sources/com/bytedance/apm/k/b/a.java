package com.bytedance.apm.k.b;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.k.b.a.b;
import com.bytedance.apm.k.b.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.d;
import com.bytedance.monitor.a.b.e;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static a f25074g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f25075h = false;

    /* renamed from: a  reason: collision with root package name */
    public ReferenceQueue<Object> f25076a;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f25077b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.apm.config.a f25078c;

    /* renamed from: d  reason: collision with root package name */
    long f25079d;

    /* renamed from: e  reason: collision with root package name */
    volatile d f25080e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f25081f;

    static {
        Covode.recordClassIndex(14636);
    }

    public final void a() {
        while (true) {
            b bVar = (b) this.f25076a.poll();
            if (bVar != null) {
                this.f25077b.remove(bVar.f25090a);
            } else {
                return;
            }
        }
    }

    public final boolean a(b bVar) {
        if (!this.f25077b.contains(bVar.f25090a)) {
            return true;
        }
        return false;
    }

    private void a(Application application) {
        this.f25081f = new Handler(Looper.getMainLooper());
        this.f25076a = new ReferenceQueue<>();
        this.f25077b = new CopyOnWriteArraySet();
        application.registerActivityLifecycleCallbacks(new c() {
            /* class com.bytedance.apm.k.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14637);
            }

            @Override // com.bytedance.apm.k.b.a.c
            public final void onActivityDestroyed(Activity activity) {
                boolean b2 = com.bytedance.apm.n.c.b("activity_leak_switch");
                if (com.bytedance.apm.c.e()) {
                    String[] strArr = new String[1];
                    "activity_leak_switch : ".concat(String.valueOf(b2));
                }
                if (b2) {
                    String uuid = UUID.randomUUID().toString();
                    a.this.f25077b.add(uuid);
                    b bVar = new b(activity, uuid, "", a.this.f25076a);
                    String localClassName = activity.getLocalClassName();
                    if (com.bytedance.apm.c.e()) {
                        String[] strArr2 = new String[1];
                        "Wait Check Leak:".concat(String.valueOf(localClassName));
                    }
                    a aVar = a.this;
                    if (aVar.f25080e == null) {
                        aVar.f25080e = a.C1013a.f41371a;
                    }
                    if (aVar.f25080e != null) {
                        d dVar = aVar.f25080e;
                        e a2 = com.bytedance.monitor.a.b.c.a("LeakCheck-Thread", new Runnable(bVar, localClassName) {
                            /* class com.bytedance.apm.k.b.a.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ b f25083a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f25084b;

                            static {
                                Covode.recordClassIndex(14638);
                            }

                            public final void run() {
                                try {
                                    a.this.a();
                                    if (a.this.a(this.f25083a)) {
                                        if (com.bytedance.apm.c.e()) {
                                            String[] strArr = new String[1];
                                            String str = "No Leak First Check:" + this.f25084b;
                                        }
                                    } else if (a.this.f25078c.f24758a) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        Runtime.getRuntime().gc();
                                        try {
                                            Thread.sleep(100);
                                            System.runFinalization();
                                            if (com.bytedance.apm.c.e()) {
                                                String[] strArr2 = new String[1];
                                                String str2 = "GC time done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
                                            }
                                            a.this.a();
                                            if (!a.this.a(this.f25083a)) {
                                                a.this.a(this.f25083a, this.f25084b);
                                            } else if (com.bytedance.apm.c.e()) {
                                                String[] strArr3 = new String[1];
                                                String str3 = "No Leak:" + this.f25084b;
                                            }
                                        } catch (InterruptedException unused) {
                                            throw new AssertionError();
                                        }
                                    } else {
                                        a.this.a(this.f25083a, this.f25084b);
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }

                            {
                                this.f25083a = r2;
                                this.f25084b = r3;
                            }
                        });
                        if (aVar.f25079d <= 0) {
                            aVar.f25079d = 60000;
                        }
                        dVar.a(a2, aVar.f25079d);
                    }
                }
            }
        });
    }

    public static void a(Application application, com.bytedance.apm.config.a aVar) {
        if (application != null && aVar != null && !f25075h) {
            f25075h = true;
            f25074g.b(application, aVar);
        }
    }

    private void b(Application application, com.bytedance.apm.config.a aVar) {
        this.f25078c = aVar;
        this.f25079d = aVar.f24759b;
        long currentTimeMillis = System.currentTimeMillis();
        a(application);
        if (com.bytedance.apm.c.e()) {
            String[] strArr = new String[1];
            String str = "initActivityLeakCheck done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
        }
    }

    public final void a(b bVar, String str) {
        if (com.bytedance.apm.c.e()) {
            String[] strArr = new String[1];
            "Leak:".concat(String.valueOf(str));
        }
        final Activity activity = (Activity) bVar.get();
        if (activity != null) {
            if (this.f25078c.f24761d) {
                this.f25081f.post(new Runnable() {
                    /* class com.bytedance.apm.k.b.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(14639);
                    }

                    public final void run() {
                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(activity) {
                            /* class com.bytedance.apm.k.b.a.AnonymousClass4 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ Activity f25088a;

                            static {
                                Covode.recordClassIndex(14640);
                            }

                            public final boolean queueIdle() {
                                Activity activity = this.f25088a;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (activity != null && activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
                                    try {
                                        int i2 = Build.VERSION.SDK_INT;
                                        if (!activity.isDestroyed()) {
                                            return false;
                                        }
                                        if (activity.getWindow().getContext() == activity) {
                                            View rootView = activity.getWindow().peekDecorView().getRootView();
                                            ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
                                            if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                                                com.bytedance.apm.k.b.a.a.a(rootView, activity);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (com.bytedance.apm.c.e()) {
                                            String[] strArr = new String[2];
                                            th.getMessage();
                                        }
                                    }
                                } else if (com.bytedance.apm.c.e()) {
                                    new String[]{"unbindDrawables, ui or ui's window is null, skip rest works."};
                                }
                                if (com.bytedance.apm.c.e()) {
                                    String[] strArr2 = new String[1];
                                    String str = "unbindDrawables done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
                                }
                                return false;
                            }

                            {
                                this.f25088a = r2;
                            }
                        });
                    }
                });
            }
            if (this.f25078c.f24760c) {
                String name = activity.getClass().getName();
                boolean b2 = com.bytedance.apm.n.c.b("activity_leak_event");
                if (com.bytedance.apm.c.e()) {
                    String[] strArr2 = new String[1];
                    "activity_leak_event : ".concat(String.valueOf(b2));
                }
                if (b2 && !TextUtils.isEmpty(name)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(name, 1);
                        com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.c("activity_leak_event", 0, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (com.bytedance.apm.c.e()) {
                    String[] strArr3 = new String[1];
                    String str2 = "upload leak activity:" + activity.getLocalClassName();
                }
            }
            this.f25077b.remove(bVar.f25090a);
            b bVar2 = this.f25078c.f24762e;
            if (bVar2 != null) {
                bVar2.a(activity);
            }
        }
    }
}
