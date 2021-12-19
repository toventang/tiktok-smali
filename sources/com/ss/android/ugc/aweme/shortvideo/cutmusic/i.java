package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f126398a;

    static {
        Covode.recordClassIndex(82927);
    }

    private i(h hVar) {
        this.f126398a = hVar;
    }

    static Runnable a(h hVar) {
        return new i(hVar);
    }

    public final void run() {
        h hVar = this.f126398a;
        if (hVar.f126384a != null && hVar.f126385b != null) {
            double d2 = (double) hVar.f126391h;
            Double.isNaN(d2);
            double width = (double) hVar.f126385b.getWidth();
            Double.isNaN(width);
            double d3 = d2 * 1.0d * width;
            double d4 = (double) hVar.f126392i;
            Double.isNaN(d4);
            int i2 = (int) (d3 / d4);
            hVar.f126384a.setX((hVar.f126385b.getX() + ((float) i2)) - ((float) (hVar.f126384a.getWidth() / 2)));
            hVar.f126385b.setStart(i2);
            hVar.f126385b.setLength(hVar.a());
            hVar.f126386c.setText(r.a(hVar.f126391h));
        }
    }
}
