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

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final C1521a f67468a = new C1521a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f67469b = i.a((h.f.a.a) b.f67475a);

    /* renamed from: c  reason: collision with root package name */
    private final Rect f67470c = new Rect(0, 0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    private final Rect f67471e = new Rect(0, 0, 0, 0);

    /* renamed from: f  reason: collision with root package name */
    private int f67472f;

    /* renamed from: g  reason: collision with root package name */
    private final View f67473g;

    /* renamed from: h  reason: collision with root package name */
    private final g f67474h;

    static final class b extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67475a = new b();

        static {
            Covode.recordClassIndex(41539);
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
        Covode.recordClassIndex(41537);
    }

    private final int[] b() {
        return (int[]) this.f67469b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.a$a  reason: collision with other inner class name */
    public static final class C1521a {
        static {
            Covode.recordClassIndex(41538);
        }

        private C1521a() {
        }

        public /* synthetic */ C1521a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final int a() {
        return this.f67472f;
    }

    private final int c() {
        return com.ss.android.ugc.aweme.framework.d.b.a(this.f67473g.getContext(), 150.0f);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    public final void a(int i2) {
        this.f67472f = i2;
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
        if (this.f67472f == 0) {
            f2 = ((float) rect.top) + (((float) (rect.bottom - rect.top)) / 2.0f);
            i2 = this.f67470c.top;
            i3 = this.f67470c.bottom;
        } else {
            f2 = ((float) rect.left) + (((float) (rect.right - rect.left)) / 2.0f);
            i2 = this.f67470c.left;
            i3 = this.f67470c.right;
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
        if (this.f67472f == 0) {
            f2 = ((float) this.f67470c.top) + (((float) (this.f67470c.bottom - this.f67470c.top)) / 2.0f);
            i2 = rect.top;
            i3 = rect.bottom;
        } else {
            f2 = ((float) this.f67470c.left) + (((float) (this.f67470c.right - this.f67470c.left)) / 2.0f);
            i2 = rect.left;
            i3 = rect.right;
        }
        if (f2 < ((float) i2) || f2 > ((float) i3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e7, code lost:
        if (r3 == r2) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ea, code lost:
        if (r2 != false) goto L_0x0196;
     */
    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.flowfeed.utils.i a(java.util.Set<? extends com.ss.android.ugc.aweme.flowfeed.utils.i> r16) {
        /*
        // Method dump skipped, instructions count: 530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.a.a(java.util.Set):com.ss.android.ugc.aweme.flowfeed.utils.i");
    }

    private static boolean a(com.ss.android.ugc.aweme.flowfeed.utils.i iVar, int i2) {
        if (iVar == null || iVar.f96195e == i2) {
            return false;
        }
        iVar.f96195e = i2;
        return true;
    }

    public a(View view, g gVar) {
        l.d(view, "");
        l.d(gVar, "");
        this.f67473g = view;
        this.f67474h = gVar;
    }

    private final float a(Rect rect, float f2) {
        int i2;
        int i3;
        if (this.f67472f == 0) {
            i2 = rect.top;
        } else {
            i2 = rect.left;
        }
        if (this.f67472f == 0) {
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
