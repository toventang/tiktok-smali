package com.facebook.core.a.a.a;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f47147a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private boolean f47148b;

    /* renamed from: c  reason: collision with root package name */
    private Object f47149c;

    /* renamed from: d  reason: collision with root package name */
    private Field f47150d;

    /* renamed from: e  reason: collision with root package name */
    private Field f47151e;

    static {
        Covode.recordClassIndex(28693);
    }

    public final List<C1168a> a() {
        if (!this.f47148b) {
            this.f47148b = true;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                this.f47149c = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.f47150d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.f47151e = declaredField2;
                declaredField2.setAccessible(true);
            } catch (InvocationTargetException e2) {
                com.a.a("could not invoke: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"});
                e2.getCause();
            } catch (ClassNotFoundException unused) {
                com.a.a("could not find class: %s", new Object[]{"android.view.WindowManagerGlobal"});
            } catch (NoSuchFieldException unused2) {
                com.a.a("could not find field: %s or %s on %s", new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"});
            } catch (NoSuchMethodException unused3) {
                com.a.a("could not find method: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"});
            } catch (RuntimeException unused4) {
                com.a.a("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"});
            } catch (IllegalAccessException unused5) {
                com.a.a("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"});
            }
        }
        if (this.f47149c == null || this.f47150d == null || this.f47151e == null) {
            return null;
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            List list = (List) this.f47150d.get(this.f47149c);
            List list2 = (List) this.f47151e.get(this.f47149c);
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(new C1168a((View) list.get(i5), (WindowManager.LayoutParams) list2.get(i5), (byte) 0));
            }
            return arrayList;
        } catch (RuntimeException unused6) {
            com.a.a("Reflective access to %s or %s on %s failed.", new Object[]{this.f47150d, this.f47151e, this.f47149c});
            return null;
        } catch (IllegalAccessException unused7) {
            com.a.a("Reflective access to %s or %s on %s failed.", new Object[]{this.f47150d, this.f47151e, this.f47149c});
            return null;
        }
    }

    /* renamed from: com.facebook.core.a.a.a.a$a  reason: collision with other inner class name */
    public static class C1168a {

        /* renamed from: a  reason: collision with root package name */
        public final View f47152a;

        /* renamed from: b  reason: collision with root package name */
        public final WindowManager.LayoutParams f47153b;

        static {
            Covode.recordClassIndex(28694);
        }

        private C1168a(View view, WindowManager.LayoutParams layoutParams) {
            this.f47152a = view;
            this.f47153b = layoutParams;
        }

        /* synthetic */ C1168a(View view, WindowManager.LayoutParams layoutParams, byte b2) {
            this(view, layoutParams);
        }
    }
}
