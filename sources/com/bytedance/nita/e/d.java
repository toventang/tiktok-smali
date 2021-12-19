package com.bytedance.nita.e;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f41663a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f41664b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41665c;

    static {
        Covode.recordClassIndex(25494);
    }

    public final void a(Context context) {
        MethodCollector.i(7729);
        if (Build.VERSION.SDK_INT > 23 || this.f41664b) {
            MethodCollector.o(7729);
            return;
        }
        ArrayList arrayList = this.f41663a;
        if (arrayList == null || arrayList.size() <= 0) {
            if (!this.f41665c && this.f41663a == null) {
                new TextView(context).post(new Runnable() {
                    /* class com.bytedance.nita.e.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25495);
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
                            declaredField3.get(obj2);
                            ArrayList arrayList2 = (ArrayList) declaredField3.get(obj2);
                            this.f41663a = arrayList2;
                            arrayList2.clear();
                            this.f41665c = true;
                            Thread.currentThread().getName();
                            System.identityHashCode(this.f41663a);
                            MethodCollector.o(7729);
                            return;
                        }
                    }
                    MethodCollector.o(7729);
                    return;
                } catch (Exception unused) {
                    this.f41664b = true;
                }
            }
            MethodCollector.o(7729);
            return;
        }
        this.f41663a.clear();
        MethodCollector.o(7729);
    }
}
