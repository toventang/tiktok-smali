package com.bytedance.monitor.a;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Object f41349a;

    /* renamed from: b  reason: collision with root package name */
    public static Class f41350b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f41351c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f41352d;

    /* renamed from: e  reason: collision with root package name */
    private static Object f41353e;

    /* renamed from: f  reason: collision with root package name */
    private static Set<Integer> f41354f;

    private static synchronized Class c() {
        Class cls;
        synchronized (a.class) {
            if (f41351c == null) {
                try {
                    f41351c = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            cls = f41351c;
        }
        return cls;
    }

    private static synchronized Field d() {
        Field field;
        synchronized (a.class) {
            if (f41352d == null) {
                f41352d = b.a((Class<?>) c(), "mH");
            }
            field = f41352d;
        }
        return field;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.Object e() {
        /*
            java.lang.Class<com.bytedance.monitor.a.a> r3 = com.bytedance.monitor.a.a.class
            monitor-enter(r3)
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            if (r0 != 0) goto L_0x0016
            java.lang.Class r2 = c()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.String r1 = "currentActivityThread"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            java.lang.Object r0 = com.bytedance.monitor.a.e.a(r2, r1, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            com.bytedance.monitor.a.a.f41349a = r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
        L_0x0016:
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d, all -> 0x001a }
            monitor-exit(r3)
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x001d:
            r0 = 0
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.a.a.e():java.lang.Object");
    }

    public static synchronized Object a() {
        Object obj;
        synchronized (a.class) {
            if (f41353e == null) {
                try {
                    f41353e = d().get(e());
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
            obj = f41353e;
        }
        return obj;
    }

    static {
        Covode.recordClassIndex(25345);
        HashSet hashSet = new HashSet();
        f41354f = hashSet;
        hashSet.add(113);
        f41354f.add(114);
        f41354f.add(115);
        f41354f.add(116);
        f41354f.add(121);
        f41354f.add(122);
        f41354f.add(100);
        f41354f.add(159);
        f41354f.add(123);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b() {
        /*
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a
            if (r0 != 0) goto L_0x0060
            java.lang.Class<com.bytedance.monitor.a.a> r3 = com.bytedance.monitor.a.a.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x005c }
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0024
            java.lang.Class r0 = com.bytedance.monitor.a.a.f41350b     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.a.a.f41350b = r0     // Catch:{ all -> 0x0059 }
        L_0x0017:
            java.lang.Class r2 = com.bytedance.monitor.a.a.f41350b     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "currentActivityThread"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = com.bytedance.monitor.a.e.a(r2, r1, r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.a.a.f41349a = r0     // Catch:{ all -> 0x0059 }
        L_0x0024:
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0059 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0059 }
            if (r1 == r0) goto L_0x0057
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x0059 }
            r2.<init>()     // Catch:{ all -> 0x0059 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0059 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0059 }
            r1.<init>(r0)     // Catch:{ all -> 0x0059 }
            com.bytedance.monitor.a.a$1 r0 = new com.bytedance.monitor.a.a$1     // Catch:{ all -> 0x0059 }
            r0.<init>(r2)     // Catch:{ all -> 0x0059 }
            r1.post(r0)     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            monitor-enter(r2)     // Catch:{ all -> 0x0059 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0052 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0057:
            monitor-exit(r3)
            goto L_0x0060
        L_0x0059:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x005c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0060:
            java.lang.Object r0 = com.bytedance.monitor.a.a.f41349a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.a.a.b():java.lang.Object");
    }

    public static boolean a(Message message) {
        if (message != null && f41354f.contains(Integer.valueOf(message.what))) {
            return true;
        }
        return false;
    }
}
