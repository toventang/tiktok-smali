package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.property.p;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final p f69751a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f69752b;

    /* renamed from: c  reason: collision with root package name */
    public static final t f69753c = new t();

    private t() {
    }

    static {
        Covode.recordClassIndex(43005);
        p pVar = new p(5000, 30000);
        f69751a = pVar;
        p pVar2 = (p) b.a().a(true, "main_canvas_duration", p.class, pVar);
        if (pVar2 != null) {
            pVar = pVar2;
        }
        f69752b = pVar;
    }
}
