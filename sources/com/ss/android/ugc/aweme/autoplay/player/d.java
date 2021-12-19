package com.ss.android.ugc.aweme.autoplay.player;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.flowfeed.utils.e;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class d implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67483c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Rect f67484a = new Rect(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final Rect f67485b = new Rect(0, 0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    private final h f67486e = i.a((h.f.a.a) b.f67490a);

    /* renamed from: f  reason: collision with root package name */
    private int f67487f;

    /* renamed from: g  reason: collision with root package name */
    private final View f67488g;

    /* renamed from: h  reason: collision with root package name */
    private final g f67489h;

    static final class b extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67490a = new b();

        static {
            Covode.recordClassIndex(41551);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41549);
    }

    /* access modifiers changed from: protected */
    public final int[] b() {
        return (int[]) this.f67486e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41550);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final int a() {
        return this.f67487f;
    }

    public final View e() {
        return this.f67488g;
    }

    public int c() {
        return com.ss.android.ugc.aweme.framework.d.b.a(this.f67488g.getContext(), 150.0f);
    }

    public void d() {
        this.f67488g.getLocationOnScreen(b());
        this.f67485b.left = b()[0];
        this.f67485b.top = b()[1];
        this.f67485b.right = b()[0] + this.f67488g.getWidth();
        this.f67485b.bottom = b()[1] + this.f67488g.getHeight();
        float height = (float) this.f67485b.height();
        this.f67484a.set(this.f67485b.left, (int) (((float) this.f67485b.top) + (0.0f * height)), this.f67485b.right, (int) (((float) this.f67485b.top) + (height * 1.0f)));
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final void a(int i2) {
        this.f67487f = i2;
    }

    private static boolean c(Rect rect) {
        if (rect.right <= rect.left || rect.bottom <= rect.top) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final boolean a(Rect rect) {
        float f2;
        int i2;
        int i3;
        l.d(rect, "");
        if (!c(rect)) {
            return false;
        }
        if (this.f67487f == 0) {
            f2 = ((float) rect.top) + (((float) (rect.bottom - rect.top)) / 2.0f);
            i2 = this.f67484a.top;
            i3 = this.f67484a.bottom;
        } else {
            f2 = ((float) rect.left) + (((float) (rect.right - rect.left)) / 2.0f);
            i2 = this.f67484a.left;
            i3 = this.f67484a.right;
        }
        if (f2 < ((float) i2) || f2 > ((float) i3)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final boolean b(Rect rect) {
        float f2;
        int i2;
        int i3;
        l.d(rect, "");
        if (!c(rect)) {
            return false;
        }
        if (this.f67487f == 0) {
            f2 = ((float) this.f67484a.top) + (((float) (this.f67484a.bottom - this.f67484a.top)) / 2.0f);
            i2 = rect.top;
            i3 = rect.bottom;
        } else {
            f2 = ((float) this.f67484a.left) + (((float) (this.f67484a.right - this.f67484a.left)) / 2.0f);
            i2 = rect.left;
            i3 = rect.right;
        }
        if (f2 < ((float) i2) || f2 > ((float) i3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018e, code lost:
        if (r3 == r2) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0191, code lost:
        if (r2 != false) goto L_0x013d;
     */
    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.aweme.flowfeed.utils.i a(java.util.Set<? extends com.ss.android.ugc.aweme.flowfeed.utils.i> r16) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.d.a(java.util.Set):com.ss.android.ugc.aweme.flowfeed.utils.i");
    }

    private static boolean a(com.ss.android.ugc.aweme.flowfeed.utils.i iVar, int i2) {
        if (iVar == null || iVar.f96195e == i2) {
            return false;
        }
        iVar.f96195e = i2;
        return true;
    }

    public d(View view, g gVar) {
        l.d(view, "");
        l.d(gVar, "");
        this.f67488g = view;
        this.f67489h = gVar;
    }

    private final float a(Rect rect, float f2) {
        int i2;
        int i3;
        if (this.f67487f == 0) {
            i2 = rect.top;
        } else {
            i2 = rect.left;
        }
        if (this.f67487f == 0) {
            i3 = rect.bottom;
        } else {
            i3 = rect.right;
        }
        float f3 = (float) i2;
        if (f3 <= f2 && ((float) i3) >= f2) {
            return 0.0f;
        }
        if (f3 > f2) {
            return f3 - f2;
        }
        return f2 - ((float) i3);
    }
}
