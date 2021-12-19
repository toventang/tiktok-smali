package com.facebook.a.b;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.b.a;
import com.facebook.a.b.a.f;
import com.facebook.a.b.d;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f46649f = c.class.getCanonicalName();

    /* renamed from: g  reason: collision with root package name */
    private static c f46650g = null;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f46651a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public Set<Activity> f46652b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c  reason: collision with root package name */
    public Set<b> f46653c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public HashSet<String> f46654d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public HashMap<Integer, HashSet<String>> f46655e = new HashMap<>();

    /* access modifiers changed from: protected */
    public static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<View> f46659a;

        /* renamed from: b  reason: collision with root package name */
        private List<com.facebook.a.b.a.a> f46660b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f46661c;

        /* renamed from: d  reason: collision with root package name */
        private HashSet<String> f46662d;

        /* renamed from: e  reason: collision with root package name */
        private final String f46663e;

        static {
            Covode.recordClassIndex(28438);
        }

        public final void onGlobalLayout() {
            a();
        }

        public final void onScrollChanged() {
            a();
        }

        private void a() {
            if (!(this.f46660b == null || this.f46659a.get() == null)) {
                for (int i2 = 0; i2 < this.f46660b.size(); i2++) {
                    a(this.f46660b.get(i2), this.f46659a.get());
                }
            }
        }

        public final void run() {
            View view;
            if (!com.facebook.internal.a.b.a.a(this)) {
                try {
                    ae.a();
                    q a2 = r.a(m.f48915a);
                    if (a2 == null) {
                        return;
                    }
                    if (a2.f48651l) {
                        List<com.facebook.a.b.a.a> a3 = com.facebook.a.b.a.a.a(a2.n);
                        this.f46660b = a3;
                        if (a3 != null && (view = this.f46659a.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            a();
                        }
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a.b.a.a(th, this);
                }
            }
        }

        private static List<View> a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        private void a(com.facebook.a.b.a.a aVar, View view) {
            if (!(aVar == null || view == null)) {
                if (TextUtils.isEmpty(aVar.f46612i) || aVar.f46612i.equals(this.f46663e)) {
                    List unmodifiableList = Collections.unmodifiableList(aVar.f46608e);
                    if (unmodifiableList.size() <= 25) {
                        for (a aVar2 : a(aVar, view, unmodifiableList, 0, -1, this.f46663e)) {
                            a(aVar2, view, aVar);
                        }
                    }
                }
            }
        }

        private void b(a aVar, View view, com.facebook.a.b.a.a aVar2) {
            boolean z;
            View a2 = aVar.a();
            if (a2 != null) {
                String str = aVar.f46657a;
                View.OnClickListener g2 = f.g(a2);
                if (!(g2 instanceof a.View$OnClickListenerC1158a) || !((a.View$OnClickListenerC1158a) g2).f46599a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f46662d.contains(str) && !z) {
                    a2.setOnClickListener(a.a(aVar2, view, a2));
                    this.f46662d.add(str);
                }
            }
        }

        private void c(a aVar, View view, com.facebook.a.b.a.a aVar2) {
            boolean z;
            AdapterView adapterView = (AdapterView) aVar.a();
            if (adapterView != null) {
                String str = aVar.f46657a;
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (!(onItemClickListener instanceof a.b) || !((a.b) onItemClickListener).f46615a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f46662d.contains(str) && !z) {
                    adapterView.setOnItemClickListener(a.a(aVar2, view, adapterView));
                    this.f46662d.add(str);
                }
            }
        }

        private void d(a aVar, View view, com.facebook.a.b.a.a aVar2) {
            boolean z;
            View a2 = aVar.a();
            if (a2 != null) {
                String str = aVar.f46657a;
                View.OnTouchListener h2 = f.h(a2);
                if (!(h2 instanceof d.a) || !((d.a) h2).f46665a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f46662d.contains(str) && !z) {
                    a2.setOnTouchListener(d.a(aVar2, view, a2));
                    this.f46662d.add(str);
                }
            }
        }

        private void a(a aVar, View view, com.facebook.a.b.a.a aVar2) {
            if (aVar2 != null) {
                try {
                    View a2 = aVar.a();
                    if (a2 != null) {
                        View i2 = f.i(a2);
                        if (i2 != null && f.a(a2, i2)) {
                            d(aVar, view, aVar2);
                        } else if (!a2.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a2 instanceof AdapterView)) {
                                b(aVar, view, aVar2);
                            } else if (a2 instanceof ListView) {
                                c(aVar, view, aVar2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ad.a(c.c(), e2);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            if (r7.getClass().getSimpleName().equals(r1[r1.length - 1]) == false) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(android.view.View r7, com.facebook.a.b.a.c r8, int r9) {
            /*
            // Method dump skipped, instructions count: 267
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.b.c.b.a(android.view.View, com.facebook.a.b.a.c, int):boolean");
        }

        public b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f46659a = new WeakReference<>(view);
            this.f46661c = handler;
            this.f46662d = hashSet;
            this.f46663e = str;
            handler.postDelayed(this, 200);
        }

        public static List<a> a(com.facebook.a.b.a.a aVar, View view, List<com.facebook.a.b.a.c> list, int i2, int i3, String str) {
            String str2 = str + "." + String.valueOf(i3);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i2 >= list.size()) {
                arrayList.add(new a(view, str2));
            } else {
                com.facebook.a.b.a.c cVar = list.get(i2);
                if (cVar.f46624a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> a2 = a((ViewGroup) parent);
                        int size = a2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.addAll(a(aVar, a2.get(i4), list, i2 + 1, i4, str2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f46624a.equals(".")) {
                    arrayList.add(new a(view, str2));
                    return arrayList;
                } else if (!a(view, cVar, i3)) {
                    return arrayList;
                } else {
                    if (i2 == list.size() - 1) {
                        arrayList.add(new a(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> a3 = a((ViewGroup) view);
                int size2 = a3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.addAll(a(aVar, a3.get(i5), list, i2 + 1, i5, str2));
                }
            }
            return arrayList;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f46657a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<View> f46658b;

        static {
            Covode.recordClassIndex(28437);
        }

        public final View a() {
            WeakReference<View> weakReference = this.f46658b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public a(View view, String str) {
            this.f46658b = new WeakReference<>(view);
            this.f46657a = str;
        }
    }

    static {
        Covode.recordClassIndex(28435);
    }

    static /* synthetic */ String c() {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            return f46649f;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private c() {
    }

    public static synchronized c a() {
        synchronized (c.class) {
            MethodCollector.i(882);
            if (com.facebook.internal.a.b.a.a(c.class)) {
                MethodCollector.o(882);
                return null;
            }
            try {
                if (f46650g == null) {
                    f46650g = new c();
                }
                c cVar = f46650g;
                MethodCollector.o(882);
                return cVar;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, c.class);
                MethodCollector.o(882);
                return null;
            }
        }
    }

    public final void b() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                for (Activity activity : this.f46652b) {
                    if (activity != null) {
                        this.f46653c.add(new b(com.facebook.a.e.b.a(activity), this.f46651a, this.f46654d, activity.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public static Bundle a(com.facebook.a.b.a.a aVar, View view, View view2) {
        List<com.facebook.a.b.a.b> unmodifiableList;
        List<a> a2;
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.a.b.a.a aVar2 = aVar;
            if (!(aVar2 == null || (unmodifiableList = Collections.unmodifiableList(aVar2.f46609f)) == null)) {
                for (com.facebook.a.b.a.b bVar : unmodifiableList) {
                    if (bVar.f46621b != null && bVar.f46621b.length() > 0) {
                        bundle.putString(bVar.f46620a, bVar.f46621b);
                    } else if (bVar.f46622c.size() > 0) {
                        if (bVar.f46623d.equals("relative")) {
                            a2 = b.a(aVar2, view2, bVar.f46622c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            aVar2 = aVar2;
                            a2 = b.a(aVar2, view, bVar.f46622c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<a> it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            a next = it.next();
                            if (next.a() != null) {
                                String e2 = f.e(next.a());
                                if (e2.length() > 0) {
                                    bundle.putString(bVar.f46620a, e2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }
}
