package com.bytedance.nita.c;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.api.c;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final int f41622a = 100;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> f41623b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static final ConcurrentHashMap<Integer, ArrayList<String>> f41624c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList<String> f41625d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public static final Object f41626e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final a f41627f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Integer> f41628g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static int f41629h = -1;

    /* renamed from: i  reason: collision with root package name */
    private static final C1016a f41630i;

    private a() {
        super(Looper.getMainLooper());
    }

    public static void a() {
        com.bytedance.nita.e.a.f41650b.a().execute(b.f41631a);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41631a = new b();

        static {
            Covode.recordClassIndex(25471);
        }

        b() {
        }

        public final void run() {
            MethodCollector.i(6412);
            synchronized (a.f41626e) {
                try {
                    HashMap hashMap = new HashMap();
                    int i2 = 0;
                    int size = a.f41625d.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            if (a.f41623b.get(a.f41625d.get(i2)) != null) {
                                hashMap.put(a.f41625d.get(i2), a.f41623b.get(a.f41625d.get(i2)));
                            }
                            a.f41625d.get(i2);
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        }
                    }
                    a.f41623b.size();
                    a.f41623b.clear();
                    a.f41623b.putAll(hashMap);
                } finally {
                    MethodCollector.o(6412);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(25468);
        C1016a aVar = new C1016a();
        f41630i = aVar;
        Context a2 = com.bytedance.nita.a.a();
        if (a2 != null) {
            ((Application) a2).registerActivityLifecycleCallbacks(aVar);
            Context a3 = com.bytedance.nita.a.a();
            if (a3 != null) {
                ((Application) a3).registerComponentCallbacks(new ComponentCallbacks2() {
                    /* class com.bytedance.nita.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25469);
                    }

                    public final void onConfigurationChanged(Configuration configuration) {
                        l.c(configuration, "");
                    }

                    public final void onTrimMemory(int i2) {
                    }

                    public final void onLowMemory() {
                        a.a();
                    }
                });
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* renamed from: com.bytedance.nita.c.a$a  reason: collision with other inner class name */
    static final class C1016a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(25470);
        }

        public final void onActivityPaused(Activity activity) {
            l.c(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
            l.c(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.c(activity, "");
            l.c(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            l.c(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            l.c(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            MethodCollector.i(8113);
            l.c(activity, "");
            synchronized (this) {
                try {
                    ArrayList<String> remove = a.f41624c.remove(Integer.valueOf(activity.hashCode()));
                    if (remove != null) {
                        Iterator<T> it = remove.iterator();
                        while (it.hasNext()) {
                            a.a(it.next(), activity);
                        }
                    }
                } finally {
                    MethodCollector.o(8113);
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.c(activity, "");
            a.f41624c.put(Integer.valueOf(activity.hashCode()), new ArrayList<>());
        }
    }

    public final void handleMessage(Message message) {
        MethodCollector.i(6578);
        l.c(message, "");
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = f41623b;
        Object obj = message.obj;
        if (obj != null) {
            HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(obj);
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(message.arg1));
                        if (sparseArray != null) {
                            sparseArray.remove(message.what);
                        }
                    } finally {
                        MethodCollector.o(6578);
                    }
                }
                return;
            }
            MethodCollector.o(6578);
            return;
        }
        w wVar = new w("null cannot be cast to non-null type");
        MethodCollector.o(6578);
        throw wVar;
    }

    public static void a(String str, Context context) {
        Class<?> cls;
        MethodCollector.i(6722);
        l.c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f41623b.get(str);
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    hashMap.remove(Integer.valueOf(f41627f.a(str, context, false)));
                } catch (Throwable th) {
                    MethodCollector.o(6722);
                    throw th;
                }
            }
        }
        if (context == null || (cls = context.getClass()) == null) {
            MethodCollector.o(6722);
            return;
        }
        cls.getName();
        MethodCollector.o(6722);
    }

    public static void a(Context context, c cVar) {
        MethodCollector.i(6572);
        if (context instanceof Activity) {
            synchronized (f41630i) {
                try {
                    int hashCode = context.hashCode();
                    ConcurrentHashMap<Integer, ArrayList<String>> concurrentHashMap = f41624c;
                    ArrayList<String> arrayList = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (arrayList == null || !arrayList.contains(cVar.a())) {
                        ArrayList<String> arrayList2 = concurrentHashMap.get(Integer.valueOf(hashCode));
                        if (arrayList2 != null) {
                            Boolean.valueOf(arrayList2.add(cVar.a()));
                        }
                        MethodCollector.o(6572);
                    }
                } finally {
                    MethodCollector.o(6572);
                }
            }
        } else {
            MethodCollector.o(6572);
        }
    }

    public static void a(String str, int i2) {
        List<View> list;
        MethodCollector.i(6581);
        l.c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f41623b.get(str);
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    for (Map.Entry<Integer, SparseArray<List<View>>> entry : hashMap.entrySet()) {
                        SparseArray<List<View>> value = entry.getValue();
                        if (!(value == null || (list = value.get(i2)) == null)) {
                            list.clear();
                        }
                    }
                } finally {
                    MethodCollector.o(6581);
                }
            }
            return;
        }
        MethodCollector.o(6581);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5 = com.bytedance.nita.c.a.f41627f;
        r0 = r3.get(java.lang.Integer.valueOf(r5.a(r9, r11, false)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r1.isEmpty() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r0 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = r3.get(java.lang.Integer.valueOf(r5.a(r9, r11, true)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r1 = r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r1.isEmpty() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r2 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r0 = r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6716);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0095, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6716);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6716);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View b(java.lang.String r9, int r10, android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.nita.c.a.b(java.lang.String, int, android.content.Context):android.view.View");
    }

    public static boolean a(String str, int i2, Context context) {
        List<View> list;
        MethodCollector.i(6640);
        l.c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f41623b.get(str);
        boolean z = false;
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(f41627f.a(str, context, false)));
                    if (!(sparseArray == null || (list = sparseArray.get(i2)) == null || list.size() == 0)) {
                        z = true;
                    }
                } finally {
                    MethodCollector.o(6640);
                }
            }
            return z;
        }
        MethodCollector.o(6640);
        return false;
    }

    public final int a(String str, Context context, boolean z) {
        int i2;
        MethodCollector.i(6644);
        if ((context instanceof com.bytedance.nita.a.a) || context == null || z || (context instanceof Application)) {
            synchronized (this) {
                try {
                    HashMap<String, Integer> hashMap = f41628g;
                    Integer num = hashMap.get(str);
                    if (num == null) {
                        int i3 = f41629h - 1;
                        f41629h = i3;
                        num = Integer.valueOf(i3);
                        hashMap.put(str, num);
                    }
                    i2 = num.intValue();
                } finally {
                    MethodCollector.o(6644);
                }
            }
        } else {
            i2 = context.hashCode();
        }
        return i2;
    }

    public final boolean a(View view, c cVar, int i2) {
        MethodCollector.i(6565);
        l.c(view, "");
        l.c(cVar, "");
        String a2 = cVar.a();
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = f41623b;
        HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(a2);
        if (hashMap == null) {
            synchronized (this) {
                try {
                    hashMap = new HashMap<>();
                    if (view.getContext() instanceof com.bytedance.nita.a.a) {
                        int i3 = f41629h - 1;
                        f41629h = i3;
                        f41628g.put(a2, Integer.valueOf(i3));
                        hashMap.put(Integer.valueOf(f41629h), new SparseArray<>());
                    } else {
                        hashMap.put(Integer.valueOf(view.getContext().hashCode()), new SparseArray<>());
                    }
                    concurrentHashMap.put(a2, hashMap);
                } catch (Throwable th) {
                    MethodCollector.o(6565);
                    throw th;
                }
            }
        }
        Context context = view.getContext();
        l.a((Object) context, "");
        if (!com.bytedance.nita.e.b.a(context)) {
            MethodCollector.o(6565);
            return false;
        }
        synchronized (hashMap) {
            try {
                int a3 = f41627f.a(a2, context, false);
                if (hashMap.get(Integer.valueOf(a3)) == null) {
                    hashMap.put(Integer.valueOf(a3), new SparseArray<>());
                }
                SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(a3));
                if (sparseArray != null) {
                    if (sparseArray.get(i2) == null) {
                        sparseArray.put(i2, new ArrayList());
                    }
                    List<View> list = sparseArray.get(i2);
                    if (list == null) {
                        l.a();
                    }
                    Boolean.valueOf(list.add(view));
                }
            } catch (Throwable th2) {
                MethodCollector.o(6565);
                throw th2;
            }
        }
        MethodCollector.o(6565);
        return true;
    }
}
