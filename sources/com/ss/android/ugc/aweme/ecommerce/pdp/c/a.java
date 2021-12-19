package com.ss.android.ugc.aweme.ecommerce.pdp.c;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.d.g;
import com.ss.android.ugc.aweme.ecommerce.ab.m;
import java.util.WeakHashMap;

public final class a extends g {

    /* renamed from: e  reason: collision with root package name */
    public static final WeakHashMap<Context, a> f86435e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public int f86436f;

    static {
        Covode.recordClassIndex(54142);
    }

    public final void b() {
        com.ss.android.ugc.aweme.d.a.f79330a.post(new b(this));
    }

    private a(Activity activity) {
        super(activity);
    }

    public static a a(Activity activity) {
        WeakHashMap<Context, a> weakHashMap = f86435e;
        a aVar = weakHashMap.get(activity);
        if (aVar == null) {
            aVar = new a(activity);
            weakHashMap.put(activity, aVar);
        }
        aVar.f86436f++;
        return aVar;
    }

    public static View a(Context context, int i2, ViewGroup viewGroup, boolean z) {
        View a2;
        MethodCollector.i(7449);
        a aVar = f86435e.get(context);
        if (!m.a() || aVar == null) {
            a2 = com.a.a(LayoutInflater.from(context), i2, viewGroup, z);
        } else {
            a2 = aVar.a(i2);
            if (z) {
                viewGroup.addView(a2);
            }
        }
        MethodCollector.o(7449);
        return a2;
    }
}
