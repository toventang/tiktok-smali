package com.bytedance.ies.xelement.viewpager.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37500a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(22560);
    }

    public static int a(Context context) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return resources.getDisplayMetrics().widthPixels;
    }

    public static int a(String str) {
        l.c(str, "");
        if (str.length() <= 7) {
            return Color.parseColor(str);
        }
        int parseColor = Color.parseColor(str);
        return (parseColor << 24) | (parseColor >>> 8);
    }

    public static int b(Context context, float f2) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return (int) ((f2 * ((float) resources.getDisplayMetrics().widthPixels)) / 750.0f);
    }

    public static int a(Context context, float f2) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }
}
