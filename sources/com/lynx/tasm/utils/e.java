package com.lynx.tasm.utils;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Field f57031a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f57032b;

    static {
        Covode.recordClassIndex(35474);
        try {
            Field declaredField = StaticLayout.class.getDeclaredField("mLines");
            f57031a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
            f57032b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Layout layout, CharSequence charSequence) {
        int lineCount;
        int i2;
        int ellipsisStart;
        if (layout != null && !TextUtils.isEmpty(charSequence) && (lineCount = layout.getLineCount()) != 0 && (ellipsisStart = layout.getEllipsisStart(lineCount - 1)) >= 0 && Character.isLowSurrogate(charSequence.charAt(ellipsisStart))) {
            int i3 = ellipsisStart + 1;
            if (layout instanceof StaticLayout) {
                try {
                    ((int[]) f57031a.get(layout))[(((Integer) f57032b.get(layout)).intValue() * i2) + 5] = i3;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
