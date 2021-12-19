package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;
import h.j.h;

public final class FeedAdInteractiveDrawView extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65897a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Paint f65898b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f65899c;

    /* renamed from: d  reason: collision with root package name */
    private final PathMeasure f65900d;

    /* renamed from: e  reason: collision with root package name */
    private float f65901e;

    /* renamed from: f  reason: collision with root package name */
    private float f65902f;

    /* renamed from: g  reason: collision with root package name */
    private float f65903g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f65904h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f65905i;

    static {
        Covode.recordClassIndex(40552);
    }

    public FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40553);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        this.f65904h = false;
        this.f65905i = false;
        this.f65899c.reset();
    }

    private final float getPathLength() {
        this.f65900d.setPath(this.f65899c, false);
        return this.f65900d.getLength();
    }

    private final boolean a() {
        if (!h.a(getCoreAreaXRange(), this.f65902f) || !h.a(getCoreAreaYRange(), this.f65903g)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawColor(0);
            canvas.drawPath(this.f65899c, this.f65898b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r6 <= 150.0d) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
        if (r6 <= 330.0d) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveDrawView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private /* synthetic */ FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        Paint paint = new Paint();
        this.f65898b = paint;
        this.f65899c = new Path();
        this.f65900d = new PathMeasure();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) n.a(4.0d));
    }
}
