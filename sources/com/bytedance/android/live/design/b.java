package com.bytedance.android.live.design;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f9422a = new ThreadLocal<>();

    static {
        Covode.recordClassIndex(4800);
    }

    public static int a(View view, int i2) {
        return a(view.getContext(), i2);
    }

    public static int a(Context context, int i2) {
        ThreadLocal<TypedValue> threadLocal = f9422a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }
}
