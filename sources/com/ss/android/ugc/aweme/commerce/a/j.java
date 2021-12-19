package com.ss.android.ugc.aweme.commerce.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.ArrayList;
import java.util.List;

public final class j {
    static {
        Covode.recordClassIndex(45176);
    }

    public static String a(Aweme aweme) {
        if (!e(aweme)) {
            return "";
        }
        return bs.e(aweme).javascriptResource;
    }

    public static String b(Aweme aweme) {
        if (!e(aweme)) {
            return "";
        }
        return bs.e(aweme).vender;
    }

    public static String c(Aweme aweme) {
        if (!e(aweme)) {
            return "";
        }
        return bs.e(aweme).verificationParameters;
    }

    public static String d(Aweme aweme) {
        return MD5Utils.getMD5String(a(aweme) + b(aweme) + c(aweme));
    }

    private static boolean e(Aweme aweme) {
        if (!b.s(aweme) || aweme.getAwemeRawAd().getOmVast() == null || bs.e(aweme) == null || bs.e(aweme) == null) {
            return false;
        }
        return true;
    }

    private static boolean b(View view, int i2, int i3) {
        if (((float) view.getHeight()) <= ((float) i2) * 0.8f || ((float) view.getWidth()) <= ((float) i3) * 0.8f) {
            return false;
        }
        return true;
    }

    public static List<View> a(View view, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        if (b(view, i2, i3)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (b(view, i2, i3)) {
                    arrayList.add(childAt);
                }
                arrayList.addAll(a(childAt, i2, i3));
            }
        }
        return arrayList;
    }
}
