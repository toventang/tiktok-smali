package com.bytedance.tux.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f44791a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f44792b;

    private b() {
    }

    static {
        Covode.recordClassIndex(27352);
    }

    public final synchronized void a(Context context, List<String> list) {
        MethodCollector.i(7419);
        l.c(list, "");
        f44792b = false;
        if (context != null) {
            a.f44788a = null;
            a.f44789b.clear();
            l.c(context, "");
            l.c(list, "");
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            a.f44788a = applicationContext;
            a.f44789b.clear();
            for (T t : list) {
                a.f44789b.put(t, a.b(t));
            }
            f44792b = true;
        }
        MethodCollector.o(7419);
    }

    public final synchronized int a(TextView textView, AttributeSet attributeSet, int i2) {
        MethodCollector.i(7489);
        int i3 = 0;
        if (!f44792b) {
            MethodCollector.o(7489);
            return 0;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ap4}, i2, 0);
            l.a((Object) obtainStyledAttributes, "");
            i3 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        MethodCollector.o(7489);
        return i3;
    }
}
