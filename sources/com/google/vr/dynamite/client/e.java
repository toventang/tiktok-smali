package com.google.vr.dynamite.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationTargetException;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f54905a;

    /* renamed from: b  reason: collision with root package name */
    private ILoadedInstanceCreator f54906b;

    /* renamed from: c  reason: collision with root package name */
    private final f f54907c;

    static {
        Covode.recordClassIndex(34134);
    }

    public e(f fVar) {
        this.f54907c = fVar;
    }

    public final synchronized ILoadedInstanceCreator a(Context context) {
        ILoadedInstanceCreator iLoadedInstanceCreator;
        ILoadedInstanceCreator iLoadedInstanceCreator2;
        MethodCollector.i(10677);
        if (this.f54906b == null) {
            IBinder a2 = a(b(context).getClassLoader());
            if (a2 == null) {
                iLoadedInstanceCreator2 = null;
            } else {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    iLoadedInstanceCreator2 = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    iLoadedInstanceCreator2 = new a(a2);
                }
            }
            this.f54906b = iLoadedInstanceCreator2;
        }
        iLoadedInstanceCreator = this.f54906b;
        MethodCollector.o(10677);
        return iLoadedInstanceCreator;
    }

    public final synchronized Context b(Context context) {
        Context context2;
        MethodCollector.i(10678);
        if (this.f54905a == null) {
            try {
                this.f54905a = context.createPackageContext(this.f54907c.f54908a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                d dVar = new d();
                MethodCollector.o(10678);
                throw dVar;
            }
        }
        context2 = this.f54905a;
        MethodCollector.o(10678);
        return context2;
    }

    private static IBinder a(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e6);
        }
    }
}
