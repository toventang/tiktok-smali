package com.ss.android.ugc.tools.a;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

final class b extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f149078a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f149079b;

    static {
        Covode.recordClassIndex(98199);
    }

    public b(View view) {
        super(new Rect(), view);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f149078a.add(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r2 != 3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r6, r0)
            int r2 = r6.getAction()
            r4 = 0
            r1 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0027
            if (r2 == r3) goto L_0x001a
            r0 = 2
            if (r2 == r0) goto L_0x0017
            r0 = 3
            if (r2 == r0) goto L_0x001a
        L_0x0016:
            return r4
        L_0x0017:
            com.ss.android.ugc.tools.a.a r0 = r5.f149079b
            goto L_0x001e
        L_0x001a:
            com.ss.android.ugc.tools.a.a r0 = r5.f149079b
            r5.f149079b = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.onTouchEvent(r6)
            if (r0 == 0) goto L_0x0016
            return r3
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.util.List<com.ss.android.ugc.tools.a.a> r0 = r5.f149078a
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0016
            java.util.List<com.ss.android.ugc.tools.a.a> r0 = r5.f149078a
            java.lang.Object r1 = r0.get(r2)
            com.ss.android.ugc.tools.a.a r1 = (com.ss.android.ugc.tools.a.a) r1
            boolean r0 = r1.onTouchEvent(r6)
            if (r0 == 0) goto L_0x0041
            r5.f149079b = r1
            return r3
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.a.b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
