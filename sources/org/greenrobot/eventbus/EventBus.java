package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.l;
import org.greenrobot.eventbus.m;

public class EventBus {
    private static final c DEFAULT_BUILDER = new c();

    /* renamed from: a  reason: collision with root package name */
    public static String f159767a = "EventBus";

    /* renamed from: b  reason: collision with root package name */
    static volatile EventBus f159768b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f159769c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f159770d = false;

    /* renamed from: e  reason: collision with root package name */
    public static k<ExecutorService> f159771e = new k<ExecutorService>() {
        /* class org.greenrobot.eventbus.EventBus.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106462);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.greenrobot.eventbus.k
        public final /* bridge */ /* synthetic */ ExecutorService a() {
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = 1;
            return g.a(a2.a());
        }
    };
    private static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public static e f159772f = null;
    private final a asyncPoster;
    private final b backgroundPoster;
    private final ThreadLocal<a> currentPostingThreadState;
    private final boolean eventInheritance;

    /* renamed from: g  reason: collision with root package name */
    public final ExecutorService f159773g;

    /* renamed from: h  reason: collision with root package name */
    public ExecutorService f159774h;

    /* renamed from: i  reason: collision with root package name */
    public final l f159775i;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final q mainThreadPoster;
    private final m mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map<Class<?>, Object> stickyEvents;
    private final u subscriberMethodFinder;
    private final Map<Class<?>, CopyOnWriteArrayList<v>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map<Object, List<Class<?>>> typesBySubscriber;

    public final synchronized boolean a(Object obj) {
        boolean containsKey;
        MethodCollector.i(4778);
        containsKey = this.typesBySubscriber.containsKey(obj);
        MethodCollector.o(4778);
        return containsKey;
    }

    public final <T> T a(Class<T> cls) {
        T cast;
        MethodCollector.i(5057);
        synchronized (this.stickyEvents) {
            try {
                cast = cls.cast(this.stickyEvents.get(cls));
            } finally {
                MethodCollector.o(5057);
            }
        }
        return cast;
    }

    private boolean a(Object obj, a aVar, Class<?> cls) {
        CopyOnWriteArrayList<v> copyOnWriteArrayList;
        MethodCollector.i(5140);
        synchronized (this) {
            try {
                copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
            } catch (Throwable th) {
                MethodCollector.o(5140);
                throw th;
            }
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            MethodCollector.o(5140);
            return false;
        }
        aVar.f159781d += copyOnWriteArrayList.size();
        Iterator<v> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v next = it.next();
            aVar.f159783f = obj;
            aVar.f159782e = next;
            try {
                a(next, obj, aVar.f159780c);
                boolean z = aVar.f159784g;
                aVar.f159783f = null;
                aVar.f159782e = null;
                aVar.f159784g = false;
                if (z) {
                    break;
                }
            } catch (Throwable th2) {
                aVar.f159783f = null;
                aVar.f159782e = null;
                aVar.f159784g = false;
                MethodCollector.o(5140);
                throw th2;
            }
        }
        MethodCollector.o(5140);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(o oVar) {
        Object obj = oVar.f159818a;
        v vVar = oVar.f159819b;
        o.a(oVar);
        if (vVar.f159849c) {
            b(vVar, obj);
        }
    }

    public EventBus() {
        this(DEFAULT_BUILDER);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f159778a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        boolean f159779b;

        /* renamed from: c  reason: collision with root package name */
        boolean f159780c;

        /* renamed from: d  reason: collision with root package name */
        int f159781d;

        /* renamed from: e  reason: collision with root package name */
        v f159782e;

        /* renamed from: f  reason: collision with root package name */
        Object f159783f;

        /* renamed from: g  reason: collision with root package name */
        boolean f159784g;

        static {
            Covode.recordClassIndex(106465);
        }

        a() {
        }
    }

    private boolean b() {
        m mVar = this.mainThreadSupport;
        if (mVar == null || mVar.a()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(106461);
    }

    public static EventBus a() {
        MethodCollector.i(4580);
        EventBus eventBus = f159768b;
        if (eventBus == null) {
            synchronized (EventBus.class) {
                try {
                    eventBus = f159768b;
                    if (eventBus == null) {
                        eventBus = new EventBus();
                        f159768b = eventBus;
                    }
                } finally {
                    MethodCollector.o(4580);
                }
            }
        }
        return eventBus;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.indexCount + ", eventInheritance=" + this.eventInheritance + "]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.greenrobot.eventbus.EventBus$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f159777a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 106464(0x19fe0, float:1.49188E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.greenrobot.eventbus.EventBus.AnonymousClass3.f159777a = r2
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.greenrobot.eventbus.EventBus.AnonymousClass3.f159777a     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.greenrobot.eventbus.EventBus.AnonymousClass3.f159777a     // Catch:{ NoSuchFieldError -> 0x002e }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = org.greenrobot.eventbus.EventBus.AnonymousClass3.f159777a     // Catch:{ NoSuchFieldError -> 0x0039 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = org.greenrobot.eventbus.EventBus.AnonymousClass3.f159777a     // Catch:{ NoSuchFieldError -> 0x0044 }
                org.greenrobot.eventbus.ThreadMode r0 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.AnonymousClass3.<clinit>():void");
        }
    }

    public final <T> T b(Class<T> cls) {
        T cast;
        MethodCollector.i(5061);
        synchronized (this.stickyEvents) {
            try {
                cast = cls.cast(this.stickyEvents.remove(cls));
            } finally {
                MethodCollector.o(5061);
            }
        }
        return cast;
    }

    public final void e(Object obj) {
        MethodCollector.i(4990);
        synchronized (this.stickyEvents) {
            try {
                this.stickyEvents.put(obj.getClass(), obj);
            } catch (Throwable th) {
                MethodCollector.o(4990);
                throw th;
            }
        }
        c(obj);
        MethodCollector.o(4990);
    }

    public static List<Class<?>> c(Class<?> cls) {
        List<Class<?>> list;
        MethodCollector.i(5158);
        Map<Class<?>, List<Class<?>>> map = eventTypesCache;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        a(list, cls2.getInterfaces());
                    }
                    eventTypesCache.put(cls, list);
                }
            } finally {
                MethodCollector.o(5158);
            }
        }
        return list;
    }

    public final void d(Object obj) {
        a aVar = this.currentPostingThreadState.get();
        if (!aVar.f159779b) {
            throw new d("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new d("Event may not be null");
        } else if (aVar.f159783f != obj) {
            throw new d("Only the currently handled event may be aborted");
        } else if (aVar.f159782e.f159848b.f159828d == ThreadMode.POSTING) {
            aVar.f159784g = true;
        } else {
            throw new d(" event handlers may only abort the incoming event");
        }
    }

    public final boolean f(Object obj) {
        MethodCollector.i(5129);
        synchronized (this.stickyEvents) {
            try {
                Class<?> cls = obj.getClass();
                if (obj.equals(this.stickyEvents.get(cls))) {
                    this.stickyEvents.remove(cls);
                    return true;
                }
                MethodCollector.o(5129);
                return false;
            } finally {
                MethodCollector.o(5129);
            }
        }
    }

    private synchronized void h(Object obj) {
        MethodCollector.i(4981);
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                CopyOnWriteArrayList<v> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        v vVar = copyOnWriteArrayList.get(i2);
                        if (vVar.f159847a == obj) {
                            vVar.f159849c = false;
                            copyOnWriteArrayList.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            }
            this.typesBySubscriber.remove(obj);
            MethodCollector.o(4981);
            return;
        }
        this.f159775i.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        MethodCollector.o(4981);
    }

    public final synchronized void b(Object obj) {
        MethodCollector.i(4876);
        if (a().a(obj)) {
            try {
                h(obj);
                MethodCollector.o(4876);
                return;
            } catch (d e2) {
                b.a(e2);
            }
        }
        MethodCollector.o(4876);
    }

    public final void c(Object obj) {
        a aVar = this.currentPostingThreadState.get();
        List<Object> list = aVar.f159778a;
        list.add(obj);
        if (!aVar.f159779b) {
            aVar.f159780c = b();
            aVar.f159779b = true;
            if (!aVar.f159784g) {
                while (!list.isEmpty()) {
                    try {
                        a(list.remove(0), aVar);
                    } finally {
                        aVar.f159779b = false;
                        aVar.f159780c = false;
                    }
                }
                return;
            }
            throw new d("Internal error. Abort state was not reset");
        }
    }

    private EventBus(c cVar) {
        l bVar;
        m mVar;
        Object a2;
        int i2;
        this.currentPostingThreadState = new ThreadLocal<a>() {
            /* class org.greenrobot.eventbus.EventBus.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106463);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ a initialValue() {
                return new a();
            }
        };
        if (cVar.f159803l != null) {
            bVar = cVar.f159803l;
        } else if (!org.greenrobot.eventbus.a.a.f159787a || l.a.a() == null) {
            bVar = new l.b();
        } else {
            bVar = new org.greenrobot.eventbus.a.a("EventBus");
        }
        this.f159775i = bVar;
        this.subscriptionsByEventType = new HashMap();
        this.typesBySubscriber = new HashMap();
        this.stickyEvents = new ConcurrentHashMap();
        q qVar = null;
        if (cVar.f159804m != null) {
            mVar = cVar.f159804m;
        } else if (!org.greenrobot.eventbus.a.a.f159787a || (a2 = c.a()) == null) {
            mVar = null;
        } else {
            mVar = new m.a((Looper) a2);
        }
        this.mainThreadSupport = mVar;
        this.mainThreadPoster = mVar != null ? mVar.a(this) : qVar;
        this.backgroundPoster = new b(this);
        this.asyncPoster = new a(this);
        if (cVar.f159802k != null) {
            i2 = cVar.f159802k.size();
        } else {
            i2 = 0;
        }
        this.indexCount = i2;
        this.subscriberMethodFinder = new u(this, cVar.f159802k, cVar.f159799h, cVar.f159798g);
        this.logSubscriberExceptions = cVar.f159792a;
        this.logNoSubscriberMessages = cVar.f159793b;
        this.sendSubscriberExceptionEvent = cVar.f159794c;
        this.sendNoSubscriberEvent = cVar.f159795d;
        this.throwSubscriberException = cVar.f159796e;
        this.eventInheritance = cVar.f159797f;
        this.f159773g = cVar.f159800i;
        if (cVar.f159801j != null) {
            this.f159774h = cVar.f159801j;
            return;
        }
        k<ExecutorService> kVar = f159771e;
        if (kVar != null) {
            if (kVar.f159813a == null) {
                kVar.f159813a = (T) kVar.a();
            }
            this.f159774h = kVar.f159813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.g(java.lang.Object):void");
    }

    private void a(v vVar, Object obj) {
        if (obj != null) {
            a(vVar, obj, b());
        }
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private void b(v vVar, Object obj) {
        Method b2 = vVar.f159848b.b();
        try {
            b2.invoke(vVar.f159847a, obj);
        } catch (InvocationTargetException e2) {
            a(vVar, obj, e2.getCause());
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unexpected exception", e3);
        }
    }

    private void a(Object obj, a aVar) {
        boolean z;
        Class<?> cls = obj.getClass();
        aVar.f159781d = 0;
        if (this.eventInheritance) {
            List<Class<?>> c2 = c(cls);
            int size = c2.size();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= a(obj, aVar, c2.get(i2));
            }
        } else {
            z = a(obj, aVar, cls);
        }
        if (!z) {
            if (this.logNoSubscriberMessages) {
                this.f159775i.a(Level.FINE, "No subscribers registered for event ".concat(String.valueOf(cls)));
            }
            if (!(!this.sendNoSubscriberEvent || cls == n.class || cls == s.class)) {
                c(new n(this, obj));
            }
        }
    }

    private void a(Object obj, t tVar) {
        Class<?> cls = tVar.f159829e;
        v vVar = new v(obj, tVar);
        CopyOnWriteArrayList<v> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(vVar)) {
            throw new d("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                break;
            } else if (i2 == size || tVar.f159830f > copyOnWriteArrayList.get(i2).f159848b.f159830f) {
                copyOnWriteArrayList.add(i2, vVar);
            } else {
                i2++;
            }
        }
        copyOnWriteArrayList.add(i2, vVar);
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (!tVar.f159831g) {
            return;
        }
        if (this.eventInheritance) {
            for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    a(vVar, entry.getValue());
                }
            }
            return;
        }
        a(vVar, this.stickyEvents.get(cls));
    }

    public static void a(EventBus eventBus, Object obj) {
        if (!a().a(obj)) {
            try {
                eventBus.g(obj);
            } catch (d e2) {
                b.a(e2);
            }
        }
    }

    private void a(v vVar, Object obj, Throwable th) {
        if (obj instanceof s) {
            if (this.logSubscriberExceptions) {
                this.f159775i.a(Level.SEVERE, "SubscriberExceptionEvent subscriber " + vVar.f159847a.getClass() + " threw an exception", th);
                s sVar = (s) obj;
                this.f159775i.a(Level.SEVERE, "Initial event " + sVar.f159825c + " caused exception in " + sVar.f159826d, sVar.f159824b);
            }
        } else if (!this.throwSubscriberException) {
            if (this.logSubscriberExceptions) {
                this.f159775i.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + vVar.f159847a.getClass(), th);
            }
            if (this.sendSubscriberExceptionEvent) {
                c(new s(this, th, obj, vVar.f159847a));
            }
        } else {
            throw new d("Invoking subscriber failed", th);
        }
    }

    private void a(v vVar, Object obj, boolean z) {
        int i2 = AnonymousClass3.f159777a[vVar.f159848b.f159828d.ordinal()];
        if (i2 == 1) {
            b(vVar, obj);
        } else if (i2 != 2) {
            if (i2 == 3) {
                q qVar = this.mainThreadPoster;
                if (qVar != null) {
                    qVar.a(vVar, obj);
                } else {
                    b(vVar, obj);
                }
            } else if (i2 != 4) {
                if (i2 == 5) {
                    this.asyncPoster.a(vVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + vVar.f159848b.f159828d);
            } else if (z) {
                this.backgroundPoster.a(vVar, obj);
            } else {
                b(vVar, obj);
            }
        } else if (z) {
            b(vVar, obj);
        } else {
            this.mainThreadPoster.a(vVar, obj);
        }
    }
}
