package com.ss.android.ugc.aweme.tux.a.j;

import android.content.Context;
import android.view.ViewGroup;
import com.a.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import h.f.b.l;

public final class e {
    static {
        Covode.recordClassIndex(92521);
    }

    public static void a(TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        l.d(tuxIconView, "");
        l.d(layoutParams, "");
    }

    public static boolean a(String str, a aVar, TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(tuxIconView, "");
        l.d(layoutParams, "");
        switch (str.hashCode()) {
            case -1754043686:
                if (!str.equals("app:tux_icon")) {
                    return false;
                }
                String str2 = aVar.f4926a;
                l.b(str2, "");
                tuxIconView.setIconRes(Integer.parseInt(str2));
                return true;
            case -697836383:
                if (!str.equals("app:tux_iconHeight")) {
                    return false;
                }
                Context context = tuxIconView.getContext();
                l.b(context, "");
                tuxIconView.setIconHeight(h.g.a.a(com.a.b.b.a.a(context, aVar)));
                return true;
            case -380386150:
                if (!str.equals("app:tux_iconShadow")) {
                    return false;
                }
                tuxIconView.a(com.a.b.b.a.a(aVar));
                return true;
            case 361903975:
                if (!str.equals("app:tux_tintColor")) {
                    return false;
                }
                Context context2 = tuxIconView.getContext();
                l.b(context2, "");
                tuxIconView.setTintColor(com.a.b.b.a.d(context2, aVar));
                return true;
            case 1931119372:
                if (!str.equals("app:tux_iconWidth")) {
                    return false;
                }
                Context context3 = tuxIconView.getContext();
                l.b(context3, "");
                tuxIconView.setIconWidth(h.g.a.a(com.a.b.b.a.a(context3, aVar)));
                return true;
            default:
                return false;
        }
    }
}
