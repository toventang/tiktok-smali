package com.bytedance.android;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Thread f6774a = Thread.currentThread();

    /* renamed from: b  reason: collision with root package name */
    static final ConcurrentHashMap<Integer, a> f6775b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static Context f6776c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f6777d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static C0092b f6778e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.b$b  reason: collision with other inner class name */
    public static final class C0092b extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6801a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f6802b = {"android.widget.", "android.webkit.", "android.app."};

        /* renamed from: com.bytedance.android.b$b$a */
        public static final class a {
            static {
                Covode.recordClassIndex(3258);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(3257);
        }

        public C0092b(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            l.d(context, "");
            return new C0092b(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            l.d(str, "");
            l.d(attributeSet, "");
            for (String str2 : f6802b) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            View onCreateView = super.onCreateView(str, attributeSet);
            l.b(onCreateView, "");
            return onCreateView;
        }
    }

    private b() {
    }

    public static void a() {
        f6778e = null;
        f6775b.clear();
        f6776c = null;
    }

    static {
        Covode.recordClassIndex(3255);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6803a;

        static {
            Covode.recordClassIndex(3259);
        }

        c(int i2) {
            this.f6803a = i2;
        }

        public final void run() {
            View view;
            a aVar = b.f6775b.get(Integer.valueOf(this.f6803a));
            if (aVar == null || aVar.f6780b) {
                b.f6775b.remove(Integer.valueOf(this.f6803a));
                return;
            }
            aVar.f6781c = true;
            C0092b bVar = aVar.f6784f;
            if (bVar != null) {
                view = bVar.inflate(aVar.f6782d, aVar.f6783e, false);
            } else {
                view = null;
            }
            aVar.f6779a = view;
            aVar.f6781c = false;
            if (b.f6776c != null) {
                View view2 = aVar.f6779a;
                if (view2 != null) {
                    b.a(view2);
                }
            } else {
                b.f6775b.remove(Integer.valueOf(this.f6803a));
            }
            LockSupport.unpark(b.f6774a);
            if (aVar.f6780b) {
                b.f6775b.remove(Integer.valueOf(this.f6803a));
            }
        }
    }

    public static View b(int i2) {
        if (h.b()) {
            return c(i2);
        }
        return null;
    }

    public static View a(View view) {
        Context context = view.getContext();
        if (!(context instanceof MutableContextWrapper)) {
            context = null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(f6776c);
        }
        return view;
    }

    private static View c(int i2) {
        a remove = f6775b.remove(Integer.valueOf(i2));
        if (remove == null) {
            return null;
        }
        remove.f6780b = true;
        if (remove.f6781c) {
            LockSupport.parkNanos(remove, 20000);
        }
        return remove.f6779a;
    }

    public static void a(int i2) {
        if (h.b() && LiveLayoutPreloadSetting.INSTANCE.enable()) {
            ConcurrentHashMap<Integer, a> concurrentHashMap = f6775b;
            if (!concurrentHashMap.containsKey(Integer.valueOf(i2))) {
                concurrentHashMap.put(Integer.valueOf(i2), new a(i2, f6778e));
                g.c().submit(new c(i2));
            }
        }
    }

    public static void a(Context context) {
        f6776c = context;
        if (context != null) {
            f6778e = new C0092b(new MutableContextWrapper(context));
            Collection<a> values = f6775b.values();
            l.b(values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                View view = it.next().f6779a;
                if (view != null) {
                    a(view);
                }
            }
            return;
        }
        f6775b.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public volatile View f6779a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f6780b;

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f6781c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6782d;

        /* renamed from: e  reason: collision with root package name */
        public final ViewGroup f6783e = null;

        /* renamed from: f  reason: collision with root package name */
        public final C0092b f6784f;

        static {
            Covode.recordClassIndex(3256);
        }

        public a(int i2, C0092b bVar) {
            this.f6782d = i2;
            this.f6784f = bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View a(int r3, android.view.ViewGroup r4) {
        /*
            boolean r1 = com.bytedance.android.live.u.h.b()
            r0 = 0
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = c(r3)
            if (r1 != 0) goto L_0x0039
            com.bytedance.android.b$b r0 = com.bytedance.android.b.f6778e
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r0.inflate(r3, r4, r2)
        L_0x001e:
            if (r1 != 0) goto L_0x0039
        L_0x0020:
            if (r4 == 0) goto L_0x0028
            android.view.View r1 = com.bytedance.android.livesdk.utils.p.a(r4, r3, r2)
            if (r1 != 0) goto L_0x0039
        L_0x0028:
            android.content.Context r0 = com.bytedance.android.live.core.f.y.e()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r1 = com.a.a(r0, r3, r4, r2)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
        L_0x0039:
            return r1
        L_0x003a:
            com.bytedance.android.b$b r0 = com.bytedance.android.b.f6778e
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r0.inflate(r3, r4, r2)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.b.a(int, android.view.ViewGroup):android.view.View");
    }
}
