package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2218b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static String f2219c;

    /* renamed from: d  reason: collision with root package name */
    private static Set<String> f2220d = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f2221f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static d f2222g;

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f2223a;

    /* renamed from: e  reason: collision with root package name */
    private final Context f2224e;

    /* access modifiers changed from: package-private */
    public interface e {
        static {
            Covode.recordClassIndex(691);
        }

        void a(android.support.v4.app.a aVar);
    }

    static {
        Covode.recordClassIndex(685);
    }

    static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f2225a;

        /* renamed from: b  reason: collision with root package name */
        final int f2226b;

        /* renamed from: c  reason: collision with root package name */
        final String f2227c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f2228d;

        static {
            Covode.recordClassIndex(686);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:").append(this.f2225a);
            sb.append(", id:").append(this.f2226b);
            sb.append(", tag:").append(this.f2227c);
            sb.append(", all:").append(this.f2228d);
            sb.append("]");
            return sb.toString();
        }

        @Override // androidx.core.app.l.e
        public final void a(android.support.v4.app.a aVar) {
            if (this.f2228d) {
                aVar.a(this.f2225a);
            } else {
                aVar.a(this.f2225a, this.f2226b, this.f2227c);
            }
        }

        a(String str, int i2, String str2) {
            this.f2225a = str;
            this.f2226b = i2;
            this.f2227c = str2;
        }
    }

    static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f2229a;

        /* renamed from: b  reason: collision with root package name */
        final int f2230b;

        /* renamed from: c  reason: collision with root package name */
        final String f2231c = null;

        /* renamed from: d  reason: collision with root package name */
        final Notification f2232d;

        static {
            Covode.recordClassIndex(687);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:").append(this.f2229a);
            sb.append(", id:").append(this.f2230b);
            sb.append(", tag:").append(this.f2231c);
            sb.append("]");
            return sb.toString();
        }

        @Override // androidx.core.app.l.e
        public final void a(android.support.v4.app.a aVar) {
            aVar.a(this.f2229a, this.f2230b, this.f2231c, this.f2232d);
        }

        b(String str, int i2, Notification notification) {
            this.f2229a = str;
            this.f2230b = i2;
            this.f2232d = notification;
        }
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2223a.areNotificationsEnabled();
        }
        int i2 = Build.VERSION.SDK_INT;
        Object a2 = a(this.f2224e, "appops");
        ApplicationInfo applicationInfo = this.f2224e.getApplicationInfo();
        String packageName = c(this.f2224e).getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(a2, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i3), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public static l a(Context context) {
        return new l(context);
    }

    /* access modifiers changed from: package-private */
    public static class d implements ServiceConnection, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2235a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f2236b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f2237c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f2238d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f2239e = new HashSet();

        static {
            Covode.recordClassIndex(689);
        }

        /* access modifiers changed from: package-private */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f2240a;

            /* renamed from: b  reason: collision with root package name */
            boolean f2241b;

            /* renamed from: c  reason: collision with root package name */
            android.support.v4.app.a f2242c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f2243d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f2244e = 0;

            static {
                Covode.recordClassIndex(690);
            }

            a(ComponentName componentName) {
                this.f2240a = componentName;
            }
        }

        private void a(a aVar) {
            if (aVar.f2241b) {
                this.f2235a.unbindService(this);
                aVar.f2241b = false;
            }
            aVar.f2242c = null;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f2237c.obtainMessage(2, componentName).sendToTarget();
        }

        public final void a(e eVar) {
            this.f2237c.obtainMessage(0, eVar).sendToTarget();
        }

        d(Context context) {
            this.f2235a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2236b = handlerThread;
            handlerThread.start();
            this.f2237c = new Handler(handlerThread.getLooper(), this);
        }

        private void b(a aVar) {
            if (!this.f2237c.hasMessages(3, aVar.f2240a)) {
                aVar.f2244e++;
                if (aVar.f2244e > 6) {
                    aVar.f2243d.size();
                    aVar.f2243d.clear();
                    return;
                }
                this.f2237c.sendMessageDelayed(this.f2237c.obtainMessage(3, aVar.f2240a), (long) ((1 << (aVar.f2244e - 1)) * 1000));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r6.f2241b != false) goto L_0x001c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void c(androidx.core.app.l.d.a r6) {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.d.c(androidx.core.app.l$d$a):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.ArrayDeque<androidx.core.app.l$e> */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean handleMessage(Message message) {
            android.support.v4.app.a aVar;
            int i2 = message.what;
            if (i2 == 0) {
                Object obj = message.obj;
                Set<String> b2 = l.b(this.f2235a);
                if (!b2.equals(this.f2239e)) {
                    this.f2239e = b2;
                    List<ResolveInfo> queryIntentServices = this.f2235a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission == null) {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.f2238d.containsKey(componentName2)) {
                            this.f2238d.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, a>> it = this.f2238d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<ComponentName, a> next = it.next();
                        if (!hashSet.contains(next.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                next.getKey();
                            }
                            a(next.getValue());
                            it.remove();
                        }
                    }
                }
                for (a aVar2 : this.f2238d.values()) {
                    aVar2.f2243d.add(obj);
                    c(aVar2);
                }
                return true;
            } else if (i2 == 1) {
                c cVar = (c) message.obj;
                ComponentName componentName3 = cVar.f2233a;
                IBinder iBinder = cVar.f2234b;
                a aVar3 = this.f2238d.get(componentName3);
                if (aVar3 != null) {
                    if (iBinder == null) {
                        aVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.app.a)) {
                            aVar = new a.AbstractBinderC0004a.C0005a(iBinder);
                        } else {
                            aVar = (android.support.v4.app.a) queryLocalInterface;
                        }
                    }
                    aVar3.f2242c = aVar;
                    aVar3.f2244e = 0;
                    c(aVar3);
                }
                return true;
            } else if (i2 == 2) {
                a aVar4 = this.f2238d.get(message.obj);
                if (aVar4 != null) {
                    a(aVar4);
                }
                return true;
            } else if (i2 != 3) {
                return false;
            } else {
                a aVar5 = this.f2238d.get(message.obj);
                if (aVar5 != null) {
                    c(aVar5);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f2237c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }
    }

    private l(Context context) {
        this.f2224e = context;
        this.f2223a = (NotificationManager) a(context, "notification");
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private void a(e eVar) {
        synchronized (f2221f) {
            if (f2222g == null) {
                f2222g = new d(c(this.f2224e));
            }
            f2222g.a(eVar);
        }
    }

    public static Set<String> b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2218b) {
            if (string != null) {
                if (!string.equals(f2219c)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f2220d = hashSet;
                    f2219c = string;
                }
            }
            set = f2220d;
        }
        return set;
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f2233a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f2234b;

        static {
            Covode.recordClassIndex(688);
        }

        c(ComponentName componentName, IBinder iBinder) {
            this.f2233a = componentName;
            this.f2234b = iBinder;
        }
    }

    public final void a(int i2, Notification notification) {
        boolean z;
        Bundle a2 = i.a(notification);
        if (a2 == null || !a2.getBoolean("android.support.useSideChannel")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            a(new b(this.f2224e.getPackageName(), i2, notification));
            this.f2223a.cancel(null, i2);
            return;
        }
        this.f2223a.notify(null, i2, notification);
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public final void a(String str, int i2) {
        this.f2223a.cancel(str, i2);
        if (Build.VERSION.SDK_INT <= 19) {
            a(new a(this.f2224e.getPackageName(), i2, str));
        }
    }
}
