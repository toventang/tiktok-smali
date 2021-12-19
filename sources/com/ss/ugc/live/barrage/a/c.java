package com.ss.ugc.live.barrage.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.barrage.a.a;
import com.ss.ugc.live.barrage.c.a;
import h.f.b.l;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f154075a;

    /* renamed from: b  reason: collision with root package name */
    public View f154076b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f154077c;

    /* renamed from: d  reason: collision with root package name */
    private int f154078d;

    /* renamed from: e  reason: collision with root package name */
    private final a f154079e = new a(this);

    static {
        Covode.recordClassIndex(102740);
    }

    @Override // com.ss.ugc.live.barrage.a.a
    public final Bitmap b() {
        return this.f154075a;
    }

    @Override // com.ss.ugc.live.barrage.a.a
    public final void c() {
        super.c();
        View view = this.f154076b;
        if (view != null) {
            com.ss.ugc.live.barrage.c.a.a(view, this.f154079e);
        } else {
            com.ss.ugc.live.barrage.c.a.a(this.f154077c, this.f154078d, this.f154079e);
        }
    }

    @Override // com.ss.ugc.live.barrage.a.a
    public final void d() {
        super.d();
        View view = this.f154076b;
        if (view != null) {
            view.destroyDrawingCache();
        }
        this.f154076b = null;
        Bitmap bitmap = this.f154075a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f154075a = null;
    }

    public static final class a implements a.AbstractC4101a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f154080a;

        static {
            Covode.recordClassIndex(102741);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f154080a = cVar;
        }

        @Override // com.ss.ugc.live.barrage.c.a.AbstractC4101a
        public final void a(View view, Bitmap bitmap) {
            int i2;
            MethodCollector.i(11326);
            l.c(view, "");
            l.c(bitmap, "");
            this.f154080a.f154076b = view;
            int i3 = 0;
            if (bitmap.isRecycled()) {
                this.f154080a.f154075a = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_4444);
            } else {
                this.f154080a.f154075a = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            View view2 = this.f154080a.f154076b;
            if (view2 != null) {
                view2.destroyDrawingCache();
            }
            RectF rectF = this.f154080a.f154067j;
            float f2 = this.f154080a.f154067j.left;
            Bitmap bitmap2 = this.f154080a.f154075a;
            if (bitmap2 != null) {
                i2 = bitmap2.getWidth();
            } else {
                i2 = 0;
            }
            rectF.right = f2 + ((float) i2);
            RectF rectF2 = this.f154080a.f154067j;
            float f3 = this.f154080a.f154067j.top;
            Bitmap bitmap3 = this.f154080a.f154075a;
            if (bitmap3 != null) {
                i3 = bitmap3.getHeight();
            }
            rectF2.bottom = f3 + ((float) i3);
            this.f154080a.f154065h = true;
            MethodCollector.o(11326);
        }
    }

    public final void a(View view) {
        l.c(view, "");
        b(view);
    }

    public c(View view) {
        l.c(view, "");
        Context context = view.getContext();
        l.a((Object) context, "");
        this.f154077c = context;
        a(view);
    }

    private final void b(View view) {
        this.f154076b = view;
        this.f154078d = -1;
        a.AbstractC4098a aVar = this.f154068k;
        if (l.a(aVar, a.AbstractC4098a.c.f154071a) || l.a(aVar, a.AbstractC4098a.d.f154072a)) {
            View view2 = this.f154076b;
            if (view2 != null) {
                com.ss.ugc.live.barrage.c.a.a(view2, this.f154079e);
            } else {
                com.ss.ugc.live.barrage.c.a.a(this.f154077c, this.f154078d, this.f154079e);
            }
        }
    }
}
