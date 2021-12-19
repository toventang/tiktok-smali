package com.facebook.a.a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.facebook.a.m;
import com.facebook.internal.a.b.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, d> f46584a = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final String f46585e = d.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    final Set<String> f46586b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Activity> f46587c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f46588d;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f46589f;

    static {
        Covode.recordClassIndex(28413);
    }

    private void a(final View view) {
        if (!a.a(this)) {
            try {
                a(new Runnable() {
                    /* class com.facebook.a.a.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28414);
                    }

                    public final void run() {
                        if (!a.a(this)) {
                            try {
                                View view = view;
                                if (view instanceof EditText) {
                                    d dVar = d.this;
                                    if (!a.a(d.class)) {
                                        try {
                                            if (!a.a(dVar)) {
                                                try {
                                                    String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
                                                    if (!(lowerCase.isEmpty() || dVar.f46586b.contains(lowerCase))) {
                                                        if (lowerCase.length() <= 100) {
                                                            dVar.f46586b.add(lowerCase);
                                                            HashMap hashMap = new HashMap();
                                                            List<String> a2 = b.a(view);
                                                            List<String> list = null;
                                                            for (c cVar : c.a()) {
                                                                String a3 = d.a(cVar.b(), lowerCase);
                                                                if (cVar.d().isEmpty() || b.a(a3, cVar.d())) {
                                                                    if (b.a(a2, cVar.c())) {
                                                                        d.a(hashMap, cVar.b(), a3);
                                                                    } else {
                                                                        if (list == null) {
                                                                            list = b.b(view);
                                                                        }
                                                                        if (b.a(list, cVar.c())) {
                                                                            d.a(hashMap, cVar.b(), a3);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            m.a(hashMap);
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    a.a(th, dVar);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            a.a(th2, d.class);
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                a.a(th3, this);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public d(Activity activity) {
        this.f46587c = new WeakReference<>(activity);
        this.f46589f = new Handler(Looper.getMainLooper());
        this.f46588d = new AtomicBoolean(false);
    }

    private void a(Runnable runnable) {
        if (!a.a(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f46589f.post(runnable);
                }
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (!a.a(this)) {
            if (view != null) {
                try {
                    a(view);
                } catch (Throwable th) {
                    a.a(th, this);
                    return;
                }
            }
            if (view2 != null) {
                a(view2);
            }
        }
    }

    static String a(String str, String str2) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            if ("r2".equals(str)) {
                return str2.replaceAll("[^\\d.]", "");
            }
            return str2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static void a(Map<String, String> map, String str, String str2) {
        if (!a.a(d.class)) {
            char c2 = 65535;
            try {
                switch (str.hashCode()) {
                    case 3585:
                        if (str.equals("r3")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3586:
                        if (str.equals("r4")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3587:
                        if (str.equals("r5")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3588:
                        if (str.equals("r6")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    if (c2 == 1 || c2 == 2) {
                        str2 = str2.replaceAll("[^a-z]+", "");
                    } else if (c2 == 3 && str2.contains("-")) {
                        str2 = str2.split("-")[0];
                    }
                } else if (str2.startsWith("m") || str2.startsWith("b") || str2.startsWith("ge")) {
                    str2 = "m";
                } else {
                    str2 = "f";
                }
                map.put(str, str2);
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }
}
