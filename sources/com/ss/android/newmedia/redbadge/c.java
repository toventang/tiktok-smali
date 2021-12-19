package com.ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.newmedia.redbadge.b.a;
import com.ss.android.pushmanager.b;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class c implements WeakHandler.IHandler {
    private static volatile c p;

    /* renamed from: a  reason: collision with root package name */
    public boolean f60019a;

    /* renamed from: b  reason: collision with root package name */
    public b f60020b;

    /* renamed from: c  reason: collision with root package name */
    public Context f60021c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHandler f60022d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f60023e;

    /* renamed from: f  reason: collision with root package name */
    public int f60024f;

    /* renamed from: g  reason: collision with root package name */
    public String f60025g;

    /* renamed from: h  reason: collision with root package name */
    public String f60026h;

    /* renamed from: i  reason: collision with root package name */
    public String f60027i;

    /* renamed from: j  reason: collision with root package name */
    public long f60028j;

    /* renamed from: k  reason: collision with root package name */
    public long f60029k;

    /* renamed from: l  reason: collision with root package name */
    public long f60030l;

    /* renamed from: m  reason: collision with root package name */
    public int f60031m;
    final BroadcastReceiver n = new BroadcastReceiver() {
        /* class com.ss.android.newmedia.redbadge.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37100);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                try {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        if (!j.f107226e || !j.b() || j.c()) {
                            j.f107226e = a();
                        }
                        if (j.f107226e && c.this.f60019a) {
                            c.this.f60022d.sendEmptyMessage(0);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };
    public AtomicBoolean o = new AtomicBoolean(false);
    private int q;
    private long r;
    private boolean s = false;
    private ContentObserver t;
    private ContentObserver u;
    private ContentObserver v;

    static {
        Covode.recordClassIndex(37099);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        if (!m.a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, a(bundle, str2));
                }
            } catch (Throwable unused) {
            }
            com.ss.android.message.log.c.a(this.f60021c, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    public final void a() {
        String a2 = a.a(this.f60021c).f60017a.a("red_badge_last_valid_response", "");
        if (a.a(this.f60021c).f60017a.a("red_badge_is_use_last_valid_response", true) && !TextUtils.isEmpty(a2)) {
            try {
                int h2 = a.a(this.f60021c).h();
                if (!DateUtils.isToday(this.f60029k) && h2 > 0) {
                    h2 = 0;
                }
                if (h2 >= this.f60024f) {
                    Logger.debug();
                    com.ss.android.message.log.c.a(this.f60021c, "event_v1", "red_badge", "outdo_max_show_times", (long) h2, (long) this.f60024f);
                    return;
                }
                JSONObject jSONObject = new JSONObject(a2);
                if ("success".equals(jSONObject.getString("reason"))) {
                    jSONObject.put("content", jSONObject.optInt("content", 0) + 1);
                    com.ss.android.message.log.c.a(this.f60021c, "red_badge", "use_last_valid_response", jSONObject);
                    this.f60030l = System.currentTimeMillis();
                    this.f60031m = jSONObject.optInt("next_query_interval", 0) + 600;
                    try {
                        a.a(this.f60021c).e(jSONObject.toString());
                        Intent intent = new Intent("com.ss.android.redbadge.message");
                        intent.putExtra("message_data", jSONObject.toString());
                        intent.setPackage(this.f60021c.getPackageName());
                        if (Build.VERSION.SDK_INT < 26 || com.ss.android.message.a.a() < 26) {
                            a(this.f60021c, intent);
                            a.a(this.f60021c).a(this.f60030l);
                            a.a(this.f60021c).a(this.f60031m);
                        } else {
                            Context context = this.f60021c;
                            h hVar = new h(intent, this.f60021c);
                            if (context == null || !(context instanceof Context)) {
                                context.bindService(intent, hVar, 1);
                                a.a(this.f60021c).a(this.f60030l);
                                a.a(this.f60021c).a(this.f60031m);
                            } else {
                                if (!d.a(context, intent)) {
                                    context.bindService(intent, hVar, 1);
                                }
                                a.a(this.f60021c).a(this.f60030l);
                                a.a(this.f60021c).a(this.f60031m);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                a.a(this.f60021c).a(this.f60030l);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static long b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static c a(b bVar) {
        MethodCollector.i(4429);
        if (p == null) {
            synchronized (c.class) {
                try {
                    if (p == null) {
                        p = new c(bVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4429);
                    throw th;
                }
            }
        }
        c cVar = p;
        MethodCollector.o(4429);
        return cVar;
    }

    public final void b(Context context) {
        if (context != null) {
            try {
                this.f60030l = a.a(this.f60021c).c();
                this.f60031m = a.a(this.f60021c).d();
                this.f60026h = a.a(this.f60021c).e();
                this.f60027i = a.a(this.f60021c).f();
                if (!m.a(this.f60026h)) {
                    JSONObject jSONObject = new JSONObject(this.f60026h);
                    this.f60028j = jSONObject.optLong("launch");
                    this.r = jSONObject.optLong("leave");
                    this.f60029k = jSONObject.optLong("badge");
                }
            } catch (Throwable unused) {
            }
        }
    }

    private c(b bVar) {
        com.ss.android.message.d.a();
        WeakHandler weakHandler = new WeakHandler(com.ss.android.message.d.f59825b.getLooper(), this);
        this.f60022d = weakHandler;
        this.t = new ContentObserver(weakHandler) {
            /* class com.ss.android.newmedia.redbadge.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(37102);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                c cVar = c.this;
                cVar.a(cVar.f60021c);
            }
        };
        this.u = new ContentObserver(weakHandler) {
            /* class com.ss.android.newmedia.redbadge.c.AnonymousClass4 */

            static {
                Covode.recordClassIndex(37103);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                c cVar = c.this;
                cVar.a(cVar.f60021c);
            }
        };
        this.v = new ContentObserver(weakHandler) {
            /* class com.ss.android.newmedia.redbadge.c.AnonymousClass5 */

            static {
                Covode.recordClassIndex(37104);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                c cVar = c.this;
                cVar.b(cVar.f60021c);
            }
        };
        this.f60020b = bVar;
        Context applicationContext = bVar.a().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f60021c = applicationContext;
        a(applicationContext);
        Context context = this.f60021c;
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "is_desktop_red_badge_show", "boolean"), true, this.t);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "desktop_red_badge_args", "string"), true, this.u);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "red_badge_last_time_paras", "string"), true, this.v);
            } catch (Throwable unused) {
            }
        }
        if (this.f60023e) {
            b(this.f60021c, this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            b(this.f60021c);
            this.f60022d.sendEmptyMessageDelayed(0, 10000);
        }
        this.f60019a = true;
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (m.a(str)) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                a(jSONObject2, "launch");
                a(jSONObject2, "leave");
                a(jSONObject2, "badge");
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j2;
        if (message != null) {
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    Logger.debug();
                    if (this.f60023e) {
                        this.f60022d.removeMessages(0);
                        final long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis < this.f60030l) {
                            this.f60030l = currentTimeMillis - ((long) (this.f60031m * 1000));
                            a.a(this.f60021c).a(this.f60030l);
                        }
                        if (!com.ss.android.pushmanager.setting.a.a().f60125a.b() || !com.ss.android.pushmanager.a.b.a().e()) {
                            Logger.debug();
                            Logger.debug();
                            long j3 = this.r;
                            long j4 = this.f60028j;
                            if (j3 < j4) {
                                j2 = (currentTimeMillis - j4) - 900000;
                            } else {
                                j2 = currentTimeMillis - j3;
                            }
                            Logger.debug();
                            if (j2 < ((long) (this.q * 1000)) || currentTimeMillis - this.f60030l < ((long) (this.f60031m * 1000))) {
                                WeakHandler weakHandler = this.f60022d;
                                weakHandler.sendMessage(weakHandler.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                                return;
                            }
                            Logger.debug();
                            if (!this.o.get()) {
                                this.o.getAndSet(true);
                                e.a(new Runnable() {
                                    /* class com.ss.android.newmedia.redbadge.c.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(37101);
                                    }

                                    private static boolean a() {
                                        try {
                                            return f.a.f68431a.c();
                                        } catch (Exception unused) {
                                            return false;
                                        }
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:71:0x029f  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 811
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.c.AnonymousClass2.run():void");
                                    }

                                    /* JADX WARNING: Failed to process nested try/catch */
                                    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
                                        /*
                                        // Method dump skipped, instructions count: 114
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.c.AnonymousClass2.a(android.content.Context, android.content.Intent):android.content.ComponentName");
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Logger.debug();
                        WeakHandler weakHandler2 = this.f60022d;
                        weakHandler2.sendMessage(weakHandler2.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                    }
                } else if (i2 == 1) {
                    Logger.debug();
                    if (this.f60023e) {
                        this.s = true;
                        if (!this.f60022d.hasMessages(0)) {
                            this.f60022d.sendEmptyMessageDelayed(0, (long) (this.f60031m * 1000));
                        }
                    }
                } else if (i2 == 2) {
                    Logger.debug();
                    if (this.f60023e) {
                        this.s = false;
                        this.f60022d.removeMessages(0);
                        this.f60022d.sendEmptyMessageDelayed(0, (long) (this.q * 1000));
                    }
                } else if (i2 == 3) {
                    ((Long) message.obj).longValue();
                    long j5 = (long) (this.f60031m * 1000);
                    Logger.debug();
                    this.f60022d.sendEmptyMessageDelayed(0, j5);
                } else if (i2 == 4) {
                    long longValue = ((Long) message.obj).longValue();
                    int i3 = this.f60031m;
                    long j6 = (long) (i3 * 1000);
                    long j7 = this.f60030l + ((long) (i3 * 1000));
                    if (longValue <= j7) {
                        j6 = j7 - longValue;
                    }
                    Logger.debug();
                    this.f60022d.sendEmptyMessageDelayed(0, j6);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context) {
        if (context != null) {
            try {
                this.f60023e = a.a(this.f60021c).a();
                String b2 = a.a(this.f60021c).b();
                if (!m.a(b2)) {
                    JSONObject jSONObject = new JSONObject(b2);
                    this.f60024f = jSONObject.optInt("max_show_times", 5);
                    this.q = jSONObject.optInt("query_waiting_duration", 30);
                    this.f60025g = jSONObject.optString("strategy");
                    if (!this.f60023e) {
                        this.f60022d.removeMessages(0);
                        this.f60022d.removeMessages(1);
                        this.f60022d.removeMessages(2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private static void a(JSONObject jSONObject, String str) {
        if (!m.a(str)) {
            try {
                jSONObject.put(str, jSONObject.optLong(str) / 1000);
            } catch (Throwable unused) {
            }
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.c.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
