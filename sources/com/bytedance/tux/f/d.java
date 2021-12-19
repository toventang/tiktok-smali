package com.bytedance.tux.f;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.b;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.bytedance.tux.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class d extends SpannableString {
    static {
        Covode.recordClassIndex(27491);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence) {
        super(charSequence == null ? "" : charSequence);
    }

    public final void a(Object obj) {
        setSpan(obj, 0, length(), 17);
    }

    public final void a(int i2) {
        b a2;
        Map<Integer, Object> map;
        if (!(length() == 0 || (a2 = f.a((int) R.attr.ap4, i2)) == null || (map = a2.f44666a) == null)) {
            Typeface typeface = null;
            Float f2 = null;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == g.k().f44668a) {
                    g.k();
                    Object value = entry.getValue();
                    l.c(value, "");
                    a(new com.bytedance.tux.f.a.d(((Number) value).intValue()));
                } else if (intValue == g.h().f44668a) {
                    g.h();
                    Object value2 = entry.getValue();
                    l.c(value2, "");
                    float floatValue = ((Number) value2).floatValue();
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    f2 = Float.valueOf(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                } else if (intValue == g.j().f44668a) {
                    g.j();
                    Object value3 = entry.getValue();
                    l.c(value3, "");
                    typeface = a.a((String) value3);
                }
            }
            if (!(typeface == null && f2 == null)) {
                a(new com.bytedance.tux.f.a.b(typeface, f2));
            }
        }
    }
}
