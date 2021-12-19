package com.bytedance.android.livesdk.gifttray.d;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18077a = new c();

    public static final long a(int i2) {
        if (i2 <= 70) {
            return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        }
        if (71 <= i2 && 1750 >= i2) {
            return 3000;
        }
        if (1751 <= i2 && 5200 >= i2) {
            return 4000;
        }
        if (5201 <= i2 && 17500 >= i2) {
            return 6000;
        }
        if (17500 <= i2 && 300000 >= i2) {
            return 7000;
        }
        if (300000 <= i2) {
            return 8000;
        }
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(10024);
    }

    private static Drawable a(List<String> list) {
        l.d(list, "");
        LinkedList linkedList = new LinkedList();
        for (String str : list) {
            linkedList.addLast(Integer.valueOf(Color.parseColor(str)));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, n.e((Collection<Integer>) linkedList));
        gradientDrawable.setCornerRadius((float) y.a(24.0f));
        return gradientDrawable;
    }

    public static final Drawable b(int i2) {
        Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
        String str = "1";
        for (String str2 : value.keySet()) {
            if (Integer.parseInt(str2) < i2 && Integer.parseInt(str2) > Integer.parseInt(str)) {
                str = str2;
            }
        }
        List<String> list = value.get(str);
        if (list == null) {
            list = n.b("#99000000", "#33000000");
        }
        return a(list);
    }
}
