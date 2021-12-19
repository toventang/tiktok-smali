package com.lynx.tasm.behavior.ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f56432a;

    /* renamed from: b  reason: collision with root package name */
    public final float f56433b;

    /* renamed from: c  reason: collision with root package name */
    public final float f56434c;

    /* renamed from: d  reason: collision with root package name */
    public final float f56435d;

    /* renamed from: e  reason: collision with root package name */
    private final int f56436e;

    /* renamed from: f  reason: collision with root package name */
    private final int f56437f;

    /* renamed from: g  reason: collision with root package name */
    private final int f56438g;

    static {
        Covode.recordClassIndex(35199);
    }

    public final boolean a() {
        if (this.f56436e == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f56437f == 1) {
            return true;
        }
        return false;
    }

    private boolean c() {
        if (a() || b() || this.f56438g == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(List<i> list) {
        if (list != null && !list.isEmpty()) {
            for (i iVar : list) {
                if (iVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<i> a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableArray array = readableArray.getArray(i2);
            if (array.size() < 7) {
                new IllegalArgumentException("transform params is error.");
            } else {
                arrayList.add(new i(array.getInt(0), (float) array.getDouble(1), array.getInt(2), (float) array.getDouble(3), array.getInt(4), (float) array.getDouble(5), array.getInt(6)));
            }
        }
        return arrayList;
    }

    public i(int i2, float f2, int i3, float f3, int i4, float f4, int i5) {
        this.f56432a = i2;
        this.f56433b = f2;
        this.f56436e = i3;
        this.f56434c = f3;
        this.f56437f = i4;
        this.f56435d = f4;
        this.f56438g = i5;
    }
}
