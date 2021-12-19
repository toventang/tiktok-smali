package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;

public final class g extends c {
    static {
        Covode.recordClassIndex(35251);
    }

    private void a(JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < javaOnlyArray.size(); i2++) {
                JavaOnlyMap map = javaOnlyArray.getMap(i2);
                if (map != null && !map.isEmpty()) {
                    arrayList.add(map);
                }
            }
            a("attachedCells", arrayList);
        }
    }

    private g(int i2, String str) {
        super(i2, str);
    }

    public static g a(int i2, String str) {
        return new g(i2, str);
    }

    public final void a(int i2, JavaOnlyArray javaOnlyArray) {
        a("state", Integer.valueOf(i2));
        if (javaOnlyArray != null) {
            a(javaOnlyArray);
        }
    }

    public final void a(int i2, int i3, int i4, JavaOnlyArray javaOnlyArray) {
        if (DisplayMetricsHolder.a() != null) {
            float f2 = DisplayMetricsHolder.a().density;
            a("scrollLeft", Float.valueOf(0.0f / f2));
            a("scrollTop", Float.valueOf(((float) i2) / f2));
            a("deltaX", Float.valueOf(((float) i3) / f2));
            a("deltaY", Float.valueOf(((float) i4) / f2));
            a(javaOnlyArray);
        }
    }
}
