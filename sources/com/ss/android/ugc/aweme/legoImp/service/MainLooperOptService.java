package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import android.util.Printer;
import android.view.Choreographer;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.b;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.u;
import com.ss.android.ugc.aweme.lego.v;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainLooperOptService implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final Boolean f107696a = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f107697h = true;

    /* renamed from: k  reason: collision with root package name */
    public static Printer f107698k = null;

    /* renamed from: b  reason: collision with root package name */
    public Handler f107699b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f107700c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f107701d;

    /* renamed from: e  reason: collision with root package name */
    public MessageQueue f107702e;

    /* renamed from: f  reason: collision with root package name */
    public a f107703f;

    /* renamed from: g  reason: collision with root package name */
    public Map<a, Boolean> f107704g;

    /* renamed from: i  reason: collision with root package name */
    public int f107705i = 100;

    /* renamed from: j  reason: collision with root package name */
    public int f107706j = 101;

    /* renamed from: l  reason: collision with root package name */
    public Printer f107707l = new Printer() {
        /* class com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass1 */

        /* renamed from: b  reason: collision with root package name */
        private boolean f107710b;

        static {
            Covode.recordClassIndex(68898);
        }

        public final void println(String str) {
            if (!(MainLooperOptService.f107698k == null || MainLooperOptService.f107698k == MainLooperOptService.this.f107707l)) {
                MainLooperOptService.f107698k.println(str);
            }
            if (!MainLooperOptService.f107697h || b.b()) {
                MainLooperOptService.f107696a.booleanValue();
                MainLooperOptService.this.d();
                if (MainLooperOptService.c() == MainLooperOptService.this.f107707l) {
                    Looper.getMainLooper().setMessageLogging(MainLooperOptService.f107698k);
                }
            } else if (!MainLooperOptService.this.f107704g.get(MainLooperOptService.this.f107703f).booleanValue()) {
                int i2 = AnonymousClass2.f107711a[MainLooperOptService.this.f107703f.ordinal()];
                if (i2 == 1) {
                    if (!this.f107710b) {
                        MainLooperOptService mainLooperOptService = MainLooperOptService.this;
                        boolean a2 = mainLooperOptService.a(mainLooperOptService.f107699b, MainLooperOptService.this.f107702e, MainLooperOptService.this.f107706j);
                        this.f107710b = a2;
                        if (a2) {
                            MainLooperOptService.f107696a.booleanValue();
                            MainLooperOptService mainLooperOptService2 = MainLooperOptService.this;
                            mainLooperOptService2.a(mainLooperOptService2.f107702e);
                        }
                    }
                    MainLooperOptService mainLooperOptService3 = MainLooperOptService.this;
                    if (mainLooperOptService3.a(mainLooperOptService3.f107699b, MainLooperOptService.this.f107702e, MainLooperOptService.this.f107705i)) {
                        MainLooperOptService.f107696a.booleanValue();
                        MainLooperOptService mainLooperOptService4 = MainLooperOptService.this;
                        mainLooperOptService4.a(mainLooperOptService4.f107702e);
                        MainLooperOptService.this.f107704g.put(a.WATCH_ACTIVITY, true);
                    }
                } else if (i2 == 2) {
                    MainLooperOptService mainLooperOptService5 = MainLooperOptService.this;
                    if (mainLooperOptService5.a(mainLooperOptService5.f107700c, MainLooperOptService.this.f107702e, 0)) {
                        MainLooperOptService.f107696a.booleanValue();
                        MainLooperOptService mainLooperOptService6 = MainLooperOptService.this;
                        mainLooperOptService6.a(mainLooperOptService6.f107702e);
                        MainLooperOptService.this.f107704g.put(a.WATCH_ON_MEASURE, true);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        MainLooperOptService mainLooperOptService7 = MainLooperOptService.this;
                        if (mainLooperOptService7.a(mainLooperOptService7.f107700c, MainLooperOptService.this.f107702e, 0)) {
                            MainLooperOptService.f107696a.booleanValue();
                            MainLooperOptService mainLooperOptService8 = MainLooperOptService.this;
                            mainLooperOptService8.a(mainLooperOptService8.f107702e);
                            MainLooperOptService.this.f107704g.put(a.WATCH_ON_DRAW, true);
                            MainLooperOptService.f107696a.booleanValue();
                        }
                    }
                } else if (MainLooperOptService.this.f107701d == null) {
                    MainLooperOptService.f107696a.booleanValue();
                    MainLooperOptService.this.f107704g.put(a.WATCH_WINDOW_FOCUS_CHANGE, true);
                } else {
                    MainLooperOptService mainLooperOptService9 = MainLooperOptService.this;
                    if (mainLooperOptService9.a(mainLooperOptService9.f107701d, MainLooperOptService.this.f107702e, 6)) {
                        MainLooperOptService.f107696a.booleanValue();
                        MainLooperOptService mainLooperOptService10 = MainLooperOptService.this;
                        mainLooperOptService10.a(mainLooperOptService10.f107702e);
                        MainLooperOptService.this.f107704g.put(a.WATCH_WINDOW_FOCUS_CHANGE, true);
                    }
                }
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private Choreographer f107708m;
    private Class<?> n;
    private Class<?> o;
    private Class<?> p;
    private Class<?> q;
    private Class<?> r;
    private Class<?> s;
    private Method t;
    private Method u;
    private Method v;
    private Method w;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_legoImp_service_MainLooperOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_legoImp_service_MainLooperOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return v.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "service_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    class ResetTask implements w {
        static {
            Covode.recordClassIndex(68900);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        private ResetTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            com.ss.android.ugc.aweme.framework.a.a.a("ResetTask");
            MainLooperOptService.this.d();
        }

        /* synthetic */ ResetTask(MainLooperOptService mainLooperOptService, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.u
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    public final boolean a(Handler handler, MessageQueue messageQueue, int i2) {
        try {
            Field declaredField = this.s.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            Message message = (Message) declaredField.get(messageQueue);
            while (message != null) {
                if (message.what == i2 && message.getTarget() == handler) {
                    Message obtain = Message.obtain(message);
                    handler.removeMessages(message.what);
                    handler.sendMessageAtFrontOfQueue(obtain);
                    return true;
                }
                message = a(message);
            }
            return false;
        } catch (Exception e2) {
            e2.getMessage();
            f107696a.booleanValue();
            return false;
        }
    }

    public final void d() {
        f107697h = false;
        this.f107699b = null;
        this.f107700c = null;
        this.f107701d = null;
        this.f107702e = null;
        this.f107708m = null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68897);
    }

    public static Printer c() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    private Method m() {
        if (this.u == null) {
            this.u = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        }
        return this.u;
    }

    private Method n() {
        if (this.v == null) {
            this.v = Field.class.getDeclaredMethod("get", Object.class);
        }
        return this.v;
    }

    private Method o() {
        if (this.w == null) {
            this.w = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
        }
        return this.w;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f107711a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 68899(0x10d23, float:9.6548E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a[] r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.f107711a = r2
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.f107711a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ON_MEASURE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.f107711a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_WINDOW_FOCUS_CHANGE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.f107711a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ON_DRAW     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.<clinit>():void");
        }
    }

    public MainLooperOptService() {
        try {
            this.f107708m = Choreographer.getInstance();
        } catch (Throwable th) {
            f107697h = false;
            th.getMessage();
            f107696a.booleanValue();
        }
    }

    private Handler e() {
        try {
            Object invoke = this.n.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = this.n.getDeclaredField("mH");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(invoke);
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    public enum a {
        WATCH_INIT,
        WATCH_ACTIVITY,
        WATCH_ON_MEASURE,
        WATCH_WINDOW_FOCUS_CHANGE,
        WATCH_ON_DRAW;

        static {
            Covode.recordClassIndex(68901);
        }
    }

    private Handler l() {
        try {
            if (this.t == null) {
                this.t = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            }
            Object a2 = a((Method) a(this.t, this.n, new Object[]{"currentActivityThread", null}), (Object) null, new Object[0]);
            Field field = (Field) a(m(), this.n, new Object[]{"mH"});
            a(o(), field, new Object[]{true});
            return (Handler) a(n(), field, new Object[]{a2});
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n, com.ss.android.ugc.aweme.lego.u
    public final void a(Context context) {
        b(context);
    }

    public static MainLooperOptService b(a aVar) {
        try {
            MainLooperOptService mainLooperOptService = (MainLooperOptService) f.a(MainLooperOptService.class);
            if (aVar == null) {
                return mainLooperOptService;
            }
            try {
                mainLooperOptService.a(aVar);
                return mainLooperOptService;
            } catch (Exception unused) {
                return mainLooperOptService;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private Handler a(Choreographer choreographer) {
        try {
            Field declaredField = this.o.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(choreographer);
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    private Message a(Message message) {
        try {
            Field declaredField = this.r.getDeclaredField("next");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message);
            if (obj != null) {
                return (Message) obj;
            }
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    private Handler b(Choreographer choreographer) {
        try {
            Field field = (Field) a(m(), this.o, new Object[]{"mHandler"});
            a(o(), field, new Object[]{true});
            return (Handler) a(n(), field, new Object[]{choreographer});
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    private MessageQueue a(Handler handler) {
        try {
            Field declaredField = this.q.getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            return (MessageQueue) declaredField.get(handler);
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    private MessageQueue b(Handler handler) {
        try {
            Field field = (Field) a(m(), this.q, new Object[]{"mQueue"});
            a(o(), field, new Object[]{true});
            return (MessageQueue) a(n(), field, new Object[]{handler});
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    public final Handler b(ViewParent viewParent) {
        try {
            Field field = (Field) a(m(), this.p, new Object[]{"mHandler"});
            a(o(), field, new Object[]{true});
            return (Handler) a(n(), field, new Object[]{viewParent});
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    public final Handler a(ViewParent viewParent) {
        try {
            Field declaredField = this.p.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(viewParent);
        } catch (Throwable th) {
            th.getMessage();
            f107696a.booleanValue();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.u
    public final void b(Context context) {
        if (f107697h) {
            try {
                this.n = Class.forName("android.app.ActivityThread");
                this.o = Class.forName("android.view.Choreographer");
                this.p = Class.forName("android.view.ViewRootImpl");
                this.q = Class.forName("android.os.Handler");
                this.s = Class.forName("android.os.MessageQueue");
                this.r = Class.forName("android.os.Message");
                com.ss.android.ugc.aweme.framework.a.a.a("MainLooperOptService");
                this.f107708m.postFrameCallback(b.f107716a);
                try {
                    a(com.bytedance.monitor.collector.a.a.a(this.o, "postCallbackDelayedInternal", Integer.TYPE, Object.class, Object.class, Long.TYPE), this.f107708m, new Object[]{4, c.f107717a, null, 0});
                } catch (Throwable unused) {
                }
                Handler e2 = e();
                this.f107699b = e2;
                if (e2 == null) {
                    this.f107699b = l();
                }
                Handler a2 = a(this.f107708m);
                this.f107700c = a2;
                if (a2 == null) {
                    this.f107700c = b(this.f107708m);
                }
                MessageQueue a3 = a(this.f107699b);
                this.f107702e = a3;
                if (a3 == null) {
                    this.f107702e = b(this.f107699b);
                }
                this.f107704g = new HashMap();
                if (!(this.f107699b == null || this.f107702e == null || this.f107700c == null)) {
                    for (a aVar : a.values()) {
                        this.f107704g.put(aVar, false);
                    }
                    this.f107704g.put(a.WATCH_INIT, true);
                    this.f107703f = a.WATCH_INIT;
                    Printer c2 = c();
                    f107698k = c2;
                    if (c2 == this.f107707l) {
                        f107698k = null;
                    }
                    Looper.getMainLooper().setMessageLogging(this.f107707l);
                }
                new f.c().b((w) new ResetTask(this, (byte) 0)).a();
            } catch (Exception unused2) {
            }
        }
    }

    public final void a(MessageQueue messageQueue) {
        if (f107696a.booleanValue()) {
            try {
                Field declaredField = this.s.getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(messageQueue);
                while (message != null) {
                    int i2 = message.what;
                    message = a(message);
                }
                f107696a.booleanValue();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(a aVar) {
        if (f107697h && b.a() && !b.b()) {
            f107696a.booleanValue();
            this.f107703f = aVar;
            this.f107704g.put(aVar, false);
        }
    }
}
