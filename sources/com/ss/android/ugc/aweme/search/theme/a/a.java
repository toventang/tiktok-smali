package com.ss.android.ugc.aweme.search.theme.a;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.c;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121665a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Drawable> f121666b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f121667c;

    private a() {
    }

    static {
        Covode.recordClassIndex(79254);
    }

    public static void a() {
        if (f121667c) {
            c.a(new b());
            f121667c = false;
            f121666b = null;
        }
    }

    public static void a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            f121666b = new WeakReference<>(drawable);
        }
        boolean z2 = true;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        c.a(new b(drawable, z));
        if (drawable == null) {
            z2 = false;
        }
        f121667c = z2;
    }
}
