package com.ss.android.ttvecamera.d;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.m;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f61478f;

    /* renamed from: a  reason: collision with root package name */
    protected final int f61479a = 90;

    /* renamed from: b  reason: collision with root package name */
    protected final float f61480b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    protected final float f61481c = 2.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f61482d;

    /* renamed from: e  reason: collision with root package name */
    public List<Camera.Area> f61483e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private int f61484g = 1;

    /* renamed from: h  reason: collision with root package name */
    private List<Camera.Area> f61485h = new ArrayList();

    static {
        Covode.recordClassIndex(37845);
        ArrayList arrayList = new ArrayList();
        f61478f = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public static boolean a(Camera.Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    public final List<Camera.Area> a(int i2, int i3, float f2, int i4, int i5, int i6) {
        Rect a2 = a(i2, i3, f2, 180.0f, i4, i5, i6);
        if (this.f61485h.size() > 0) {
            this.f61485h.clear();
        }
        this.f61485h.add(new Camera.Area(a2, 1000));
        return this.f61485h;
    }

    public final Rect a(int i2, int i3, float f2, float f3, int i4, int i5, int i6) {
        int intValue = Float.valueOf((f2 * f3) + 0.5f).intValue();
        int i7 = ((int) ((((float) (i4 * LiveNetAdaptiveHurryTimeSetting.DEFAULT)) * 1.0f) / ((float) i2))) - 1000;
        int i8 = ((int) ((((float) (i5 * LiveNetAdaptiveHurryTimeSetting.DEFAULT)) * 1.0f) / ((float) i3))) - 1000;
        if (this.f61482d == 1) {
            i7 = -i7;
        }
        int i9 = intValue / 2;
        int a2 = m.a(i7 - i9, -1000, 1000);
        int a3 = m.a(i8 - i9, -1000, 1000);
        RectF rectF = new RectF((float) a2, (float) a3, (float) m.a(a2 + intValue), (float) m.a(a3 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        m.a(i6, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = m.a(rect2.left);
        rect2.right = m.a(rect2.right);
        rect2.top = m.a(rect2.top);
        rect2.bottom = m.a(rect2.bottom);
        return rect2;
    }
}
