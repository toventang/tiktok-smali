package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class AudioTrackView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f126090a;

    /* renamed from: b  reason: collision with root package name */
    private long f126091b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f126092c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f126093d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f126094e;

    /* renamed from: f  reason: collision with root package name */
    private final h f126095f;

    /* renamed from: g  reason: collision with root package name */
    private int f126096g;

    static {
        Covode.recordClassIndex(82806);
    }

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Bitmap getSrcBitmap() {
        return (Bitmap) this.f126095f.getValue();
    }

    public final long getDuraion() {
        return this.f126091b;
    }

    public final float getEndPosition() {
        return (float) this.f126094e.right;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f126094e.width() > 0 && !getSrcBitmap().isRecycled()) {
            getSrcBitmap().recycle();
        }
    }

    static final class a extends m implements h.f.a.a<Bitmap> {
        final /* synthetic */ AudioTrackView this$0;

        static {
            Covode.recordClassIndex(82807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AudioTrackView audioTrackView) {
            super(0);
            this.this$0 = audioTrackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bitmap invoke() {
            MethodCollector.i(6575);
            Bitmap decodeResource = BitmapFactory.decodeResource(this.this$0.getResources(), 2131231000);
            Rect rect = this.this$0.f126090a;
            l.b(decodeResource, "");
            rect.right = decodeResource.getWidth();
            this.this$0.f126090a.bottom = decodeResource.getHeight();
            MethodCollector.o(6575);
            return decodeResource;
        }
    }

    public final void setDuraion(long j2) {
        this.f126091b = j2;
    }

    public final void a(float f2) {
        this.f126096g = (int) f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(6738);
        super.onDraw(canvas);
        if (this.f126094e.width() <= 0) {
            MethodCollector.o(6738);
            return;
        }
        this.f126093d.right = (getMeasuredHeight() * getSrcBitmap().getWidth()) / getSrcBitmap().getHeight();
        this.f126093d.bottom = getMeasuredHeight();
        this.f126094e.bottom = getMeasuredHeight();
        if (canvas != null) {
            canvas.save();
            canvas.translate((float) this.f126096g, 0.0f);
            canvas.clipRect(this.f126094e);
            canvas.drawBitmap(getSrcBitmap(), this.f126090a, this.f126093d, this.f126092c);
            canvas.restore();
            MethodCollector.o(6738);
            return;
        }
        MethodCollector.o(6738);
    }

    private /* synthetic */ AudioTrackView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AudioTrackView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6755);
        this.f126092c = new Paint();
        this.f126093d = new Rect();
        this.f126094e = new Rect(0, 0, 0, 0);
        this.f126090a = new Rect(0, 0, 0, 0);
        this.f126095f = i.a((h.f.a.a) new a(this));
        MethodCollector.o(6755);
    }

    public final void a(float f2, float f3, long j2) {
        if (getMeasuredWidth() > 0) {
            this.f126091b = j2;
            if (r.a(this)) {
                this.f126094e.right = getMeasuredWidth();
                this.f126094e.left = (int) (((float) getMeasuredWidth()) - f3);
            } else {
                this.f126094e.left = 0;
                this.f126094e.right = (int) f3;
            }
            a(f2);
        }
    }
}
