package com.bytedance.lynx.hybrid.d;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.e.d;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.devtoolwrapper.e;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40931a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f40932b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final List<a> f40933c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final a f40934d = new a();

    public static final class a implements e {
        static {
            Covode.recordClassIndex(25090);
        }

        a() {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(25089);
        try {
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just Warning: No Devtool Dependency found, add lynx_devtool if needs").printStackTrace();
        }
    }

    public static void a() {
        if (f40932b) {
            LynxEnv.b().a(true);
            if (!d.f40961c) {
                LynxEnv.b().b(true);
            }
            LynxDevtoolGlobalHelper.getInstance().registerCardListener(f40934d);
        }
    }

    public static void a(a aVar) {
        l.c(aVar, "");
        f40933c.add(aVar);
    }
}
