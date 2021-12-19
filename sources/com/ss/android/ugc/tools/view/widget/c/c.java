package com.ss.android.ugc.tools.view.widget.c;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.view.widget.m;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(98916);
    }

    public static final void a(b bVar, String str) {
        l.d(bVar, "");
        if (str != null && str.length() != 0) {
            a.a(bVar.getImageView(), str);
        }
    }

    public static final void a(b bVar, boolean z) {
        l.d(bVar, "");
        bVar.setCustomSelected(z);
        TextView textView = bVar.getTextView();
        if (textView instanceof m) {
            ((m) textView).setMarqueeEnable(z);
        }
    }
}
