package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.TypedValue;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class p extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static final float f144697a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f144698b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f144699c;

    /* renamed from: d  reason: collision with root package name */
    private final h f144700d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f144701e;

    /* renamed from: f  reason: collision with root package name */
    private final Float f144702f;

    private final Path getCirclePath() {
        return (Path) this.f144699c.getValue();
    }

    private final Path getCutoutCirclePath() {
        return (Path) this.f144700d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94655);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Path> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144703a = new b();

        static {
            Covode.recordClassIndex(94656);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    static final class c extends m implements h.f.a.a<Path> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f144704a = new c();

        static {
            Covode.recordClassIndex(94657);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    @Override // com.facebook.drawee.view.c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    static {
        Covode.recordClassIndex(94654);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f144697a = TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics());
    }

    @Override // com.facebook.drawee.view.c
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.clipPath(getCirclePath());
        }
        if (this.f144701e && canvas != null) {
            canvas.clipPath(getCutoutCirclePath(), Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private p(Context context, Float f2) {
        super(context, null, 0);
        l.d(context, "");
        boolean z = false;
        this.f144702f = f2;
        this.f144699c = i.a((h.f.a.a) b.f144703a);
        this.f144700d = i.a((h.f.a.a) c.f144704a);
        this.f144701e = f2 != null ? true : z;
    }

    @Override // com.facebook.drawee.view.c
    public final void onMeasure(int i2, int i3) {
        float measuredWidth;
        super.onMeasure(i2, i3);
        int i4 = 1;
        if (v.e(this) == 1) {
            i4 = -1;
        }
        float measuredWidth2 = ((float) getMeasuredWidth()) * 0.5f;
        float f2 = (float) i4;
        Float f3 = this.f144702f;
        if (f3 != null) {
            measuredWidth = f3.floatValue();
        } else {
            measuredWidth = 0.7f * ((float) getMeasuredWidth());
        }
        getCirclePath().reset();
        getCirclePath().addCircle(measuredWidth2, measuredWidth2, measuredWidth2, Path.Direction.CW);
        getCutoutCirclePath().reset();
        getCutoutCirclePath().addCircle((f2 * measuredWidth) + measuredWidth2, measuredWidth2, f144697a + measuredWidth2, Path.Direction.CW);
    }

    public /* synthetic */ p(Context context, Float f2, byte b2) {
        this(context, f2);
    }
}
