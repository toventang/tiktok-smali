package com.bytedance.j.a.b;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.lynx.devtoolwrapper.e;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38956a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final List<a> f38957b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final a f38958c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final b f38959d = new b();

    public static final class a implements e {
        static {
            Covode.recordClassIndex(23860);
        }

        a() {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(23859);
        try {
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just Warning: No Devtool Dependency found, add lynx_devtool if needs").printStackTrace();
        }
    }
}
