package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class dh {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f80075a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f80076b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f80077c;

    static {
        Covode.recordClassIndex(49847);
    }

    public final void a(Context context) {
        MethodCollector.i(1318);
        if (Build.VERSION.SDK_INT > 23 || this.f80076b) {
            MethodCollector.o(1318);
            return;
        }
        ArrayList arrayList = this.f80075a;
        if (arrayList == null || arrayList.size() <= 0) {
            if (!this.f80077c && this.f80075a == null) {
                new TextView(context).post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.dh.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(49848);
                    }

                    public final void run() {
                    }
                });
                try {
                    Thread currentThread = Thread.currentThread();
                    Field declaredField = Thread.class.getDeclaredField("localValues");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(currentThread);
                    Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                    declaredField2.setAccessible(true);
                    Object[] objArr = (Object[]) declaredField2.get(obj);
                    for (Object obj2 : objArr) {
                        if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                            Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                            declaredField3.setAccessible(true);
                            declaredField3.get(obj2);
                            b.a(declaredField3.get(obj2));
                            declaredField3.get(obj2);
                            this.f80075a = (ArrayList) declaredField3.get(obj2);
                            this.f80077c = true;
                            obj2.getClass().getName();
                            MethodCollector.o(1318);
                            return;
                        }
                    }
                    MethodCollector.o(1318);
                    return;
                } catch (Exception unused) {
                    this.f80076b = true;
                }
            }
            MethodCollector.o(1318);
            return;
        }
        b.a((Object) this.f80075a);
        MethodCollector.o(1318);
    }
}
