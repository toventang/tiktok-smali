package com.ss.android.ugc.aweme.main;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static int f109219a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final WeakHashMap<Context, a> f109220b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f109221c = false;

    static {
        Covode.recordClassIndex(69940);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f109222a;

        /* renamed from: b  reason: collision with root package name */
        public ContextThemeWrapper f109223b;

        /* renamed from: c  reason: collision with root package name */
        public Configuration f109224c;

        static {
            Covode.recordClassIndex(69941);
        }

        public final boolean a(MainActivity mainActivity) {
            if (!mainActivity.getOriginResources().getConfiguration().equals(this.f109224c)) {
                return b(mainActivity);
            }
            return false;
        }

        private boolean b(MainActivity mainActivity) {
            if (mainActivity == null) {
                return true;
            }
            this.f109222a = d.a(mainActivity);
            this.f109224c = mainActivity.getOriginResources().getConfiguration();
            try {
                Method declaredMethod = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]);
                declaredMethod.setAccessible(true);
                this.f109223b = new ContextThemeWrapper(mainActivity, ((Integer) declaredMethod.invoke(mainActivity, new Object[0])).intValue());
                return false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }
    }

    public static Context a(MainActivity mainActivity) {
        try {
            Trace.beginSection("generateWrapperContext");
            Configuration configuration = (Configuration) a(mainActivity.getOriginResources().getConfiguration());
            Field a2 = f.a(Configuration.class, "assetsSeq");
            int intValue = ((Integer) a2.get(configuration)).intValue();
            int i2 = f109219a;
            f109219a = i2 + 1;
            a2.set(configuration, Integer.valueOf(intValue + i2));
            Context createConfigurationContext = mainActivity.createConfigurationContext(configuration);
            Trace.endSection();
            return createConfigurationContext;
        } catch (Throwable unused) {
            Trace.endSection();
            return null;
        }
    }

    private static <T> T a(Parcelable parcelable) {
        Parcel parcel;
        Throwable th;
        try {
            parcel = Parcel.obtain();
            try {
                parcel.writeParcelable(parcelable, 0);
                parcel.setDataPosition(0);
                T t = (T) parcel.readParcelable(parcelable.getClass().getClassLoader());
                parcel.recycle();
                return t;
            } catch (Throwable th2) {
                th = th2;
                parcel.recycle();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            parcel = null;
            parcel.recycle();
            throw th;
        }
    }
}
