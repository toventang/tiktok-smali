package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;

public final class b extends RecyclerView.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f85460b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f85461a;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f85462c = new Paint();

    static {
        Covode.recordClassIndex(53474);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53475);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(View view, C2044b bVar) {
            l.d(view, "");
            view.setTag(R.id.ab7, bVar);
        }
    }

    public static final class c implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85469a;

        static {
            Covode.recordClassIndex(53477);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85470a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f85471b;

                static {
                    Covode.recordClassIndex(53478);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85470a < this.f85471b.f85469a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85471b.f85469a;
                    int i2 = this.f85470a;
                    this.f85470a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85471b = r1;
                }
            };
        }

        public c(ViewGroup viewGroup) {
            this.f85469a = viewGroup;
        }
    }

    public b(int i2) {
        this.f85461a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        int bottom;
        int bottom2;
        l.d(canvas, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.onDraw(canvas, recyclerView, sVar);
        for (View view : new c(recyclerView)) {
            l.d(view, "");
            if (view.getTag(R.id.ab7) != null) {
                Object tag = view.getTag(R.id.ab7);
                if (!(tag instanceof C2044b)) {
                    tag = null;
                }
                C2044b bVar = (C2044b) tag;
                if (bVar != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    if (bVar.f85468f) {
                        if (bVar.f85465c == 48) {
                            bottom2 = view.getTop() - bVar.f85463a;
                        } else {
                            bottom2 = view.getBottom();
                        }
                        this.f85462c.setColor(0);
                        canvas.drawRect((float) left, (float) bottom2, (float) right, (float) (bVar.f85463a + bottom2), this.f85462c);
                    }
                    if (bVar.f85467e) {
                        if (bVar.f85464b == 48) {
                            bottom = view.getTop() - bVar.f85466d;
                        } else {
                            bottom = view.getBottom();
                        }
                        this.f85462c.setColor(this.f85461a);
                        canvas.drawRect((float) left, (float) bottom, (float) right, (float) (bVar.f85466d + bottom), this.f85462c);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView.s r10) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r7, r0)
            h.f.b.l.d(r8, r0)
            h.f.b.l.d(r9, r0)
            h.f.b.l.d(r10, r0)
            r0 = 2131363233(0x7f0a05a1, float:1.834627E38)
            java.lang.Object r5 = r8.getTag(r0)
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b.C2044b
            if (r0 != 0) goto L_0x001a
            r5 = 0
        L_0x001a:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$b r5 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b.C2044b) r5
            if (r5 != 0) goto L_0x001f
            return
        L_0x001f:
            boolean r0 = r5.f85468f
            r2 = 48
            r4 = 0
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f85465c
            if (r0 != r2) goto L_0x004b
            int r3 = r5.f85463a
        L_0x002c:
            r0 = 0
        L_0x002d:
            boolean r1 = r5.f85467e
            if (r1 == 0) goto L_0x0047
            int r1 = r5.f85464b
            if (r1 != r2) goto L_0x003b
            int r1 = r5.f85466d
            if (r3 >= r1) goto L_0x003b
            int r3 = r5.f85466d
        L_0x003b:
            int r2 = r5.f85464b
            r1 = 80
            if (r2 != r1) goto L_0x0047
            int r1 = r5.f85466d
            if (r0 >= r1) goto L_0x0047
            int r0 = r5.f85466d
        L_0x0047:
            r7.set(r4, r3, r4, r0)
            return
        L_0x004b:
            int r0 = r5.f85463a
            r3 = 0
            goto L_0x002d
        L_0x004f:
            r3 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$b  reason: collision with other inner class name */
    public static final class C2044b {

        /* renamed from: a  reason: collision with root package name */
        public final int f85463a;

        /* renamed from: b  reason: collision with root package name */
        public final int f85464b;

        /* renamed from: c  reason: collision with root package name */
        public final int f85465c;

        /* renamed from: d  reason: collision with root package name */
        public final int f85466d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f85467e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f85468f;

        static {
            Covode.recordClassIndex(53476);
        }

        public C2044b() {
            this(0, 0, 0, 0, false, false, 63);
        }

        private C2044b(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            this.f85463a = i2;
            this.f85464b = i3;
            this.f85465c = i4;
            this.f85466d = i5;
            this.f85467e = z;
            this.f85468f = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2044b(int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6) {
            this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? 80 : i3, (i6 & 4) == 0 ? i4 : 80, (i6 & 8) != 0 ? 1 : i5, (i6 & 16) != 0 ? false : z, (i6 & 32) != 0 ? false : z2);
        }
    }
}
