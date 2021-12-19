package com.bytedance.android.livesdk.ui.a;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(12829);
    }

    public static void a(ShapeControllableView shapeControllableView, ViewGroup.LayoutParams layoutParams) {
        l.d(shapeControllableView, "");
        l.d(layoutParams, "");
    }

    public static boolean a(String str, com.a.b.a.a aVar, ShapeControllableView shapeControllableView, ViewGroup.LayoutParams layoutParams) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(shapeControllableView, "");
        l.d(layoutParams, "");
        int hashCode = str.hashCode();
        int i2 = 0;
        if (hashCode != -1070567623) {
            if (hashCode != -391775833) {
                if (hashCode == 872454657 && str.equals("app:gradientPositions")) {
                    String str2 = aVar.f4926a;
                    l.b(str2, "");
                    shapeControllableView.setGradientPositions(Integer.parseInt(str2));
                    return true;
                }
            } else if (str.equals("app:gradientOrientation")) {
                String str3 = aVar.f4926a;
                if (str3 != null && str3.hashCode() == -1984141450 && str3.equals("vertical")) {
                    i2 = 1;
                }
                shapeControllableView.setGradientOrientation(i2);
                return true;
            }
        } else if (str.equals("app:gradientColors")) {
            Resources resources = shapeControllableView.getResources();
            String str4 = aVar.f4926a;
            l.b(str4, "");
            shapeControllableView.setGradientColors(resources.getIntArray(Integer.parseInt(str4)));
            return true;
        }
        return false;
    }
}
