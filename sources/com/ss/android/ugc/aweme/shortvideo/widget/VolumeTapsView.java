package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.d;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public class VolumeTapsView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    private int f132875a;

    /* renamed from: b  reason: collision with root package name */
    private int f132876b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f132877c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f132878d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f132879e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f132880f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f132881g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f132882h;

    /* renamed from: i  reason: collision with root package name */
    private d f132883i;

    /* renamed from: j  reason: collision with root package name */
    private d f132884j;

    /* renamed from: k  reason: collision with root package name */
    private d f132885k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f132886l;

    /* renamed from: m  reason: collision with root package name */
    private GestureDetector f132887m;
    private int n;
    private int o;
    private int p;
    private int q;
    private a r;
    private long s;
    private int t;

    public interface a {
        static {
            Covode.recordClassIndex(86923);
        }

        void a(int i2);

        void a(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(86922);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public int getStopPosition() {
        return this.q;
    }

    public void setOnProgressChangeListener(a aVar) {
        this.r = aVar;
    }

    public void setPastPosition(int i2) {
        this.n = i2;
        invalidate();
    }

    public void setProgress(int i2) {
        this.p = i2;
        invalidate();
    }

    public void setStopPosition(int i2) {
        this.q = i2;
        invalidate();
    }

    public void setTotalTime(long j2) {
        this.s = j2;
        setWavForm(this.f132880f);
    }

    private int a(float f2) {
        return ((int) (((f2 * 1.0f) * ((float) (this.f132876b - this.f132875a))) / ((float) getMeasuredWidth()))) + this.f132875a;
    }

    private float b(int i2) {
        return ((((float) (i2 - this.f132875a)) * 1.0f) * ((float) getMeasuredWidth())) / ((float) (this.f132876b - this.f132875a));
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.q = a(Math.min(Math.max(b(this.n), motionEvent.getX()), (float) getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        a aVar = this.r;
        if (aVar != null) {
            aVar.a(this.q);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9589);
        super.onDraw(canvas);
        if (k.b.a(this.f132885k.f126352h)) {
            a(canvas, false);
            MethodCollector.o(9589);
            return;
        }
        a(canvas, true);
        MethodCollector.o(9589);
    }

    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        l.d(context, "");
        this.f132880f = a(bitmap, b.c(context, R.color.bz));
        l.d(context, "");
        this.f132881g = a(bitmap, b.c(context, R.color.ib));
        l.d(context, "");
        this.f132882h = a(bitmap, b.c(context, R.color.c5));
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f132887m.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        int a2 = a(Math.min(Math.max(b(this.n), motionEvent.getX()), (float) getMeasuredWidth()));
        this.q = a2;
        int max = Math.max(this.n, a2 - ((int) TimeUnit.SECONDS.toMillis(3)));
        this.o = max;
        this.p = max;
        invalidate();
        a aVar = this.r;
        if (aVar != null) {
            aVar.a(this.o, this.q);
        }
        return onTouchEvent | true;
    }

    private void a(int i2) {
        this.n += i2;
        this.q += i2;
        this.o += i2;
        this.p += i2;
    }

    private void a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
        if (dVar != null && k.b.a(dVar.getMusicWavePointArray())) {
            int b2 = (int) n.b(getContext(), 4.0f);
            k.b(dVar);
            this.f132883i.f126348d = b2;
            this.f132884j.f126348d = b2;
            this.f132885k.f126348d = b2;
            this.f132883i.f126345a = k.f126400f.f126406d;
            this.f132884j.f126345a = k.f126400f.f126406d;
            this.f132885k.f126345a = k.f126400f.f126406d;
            this.f132883i.a(dVar.getMusicWavePointArray());
            this.f132884j.a(dVar.getMusicWavePointArray());
            this.f132885k.a(dVar.getMusicWavePointArray());
        }
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static Bitmap a(Bitmap bitmap, int i2) {
        MethodCollector.i(9596);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        MethodCollector.o(9596);
        return createBitmap;
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10160);
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        this.f132883i.a(size, size2);
        this.f132884j.a(size, size2);
        this.f132885k.a(size, size2);
        MethodCollector.o(10160);
    }

    private static com.ss.android.ugc.aweme.shortvideo.d a(Context context, int i2) {
        com.ss.android.ugc.aweme.shortvideo.d dVar = new com.ss.android.ugc.aweme.shortvideo.d();
        int b2 = k.f126400f.b(context);
        float[] fArr = new float[b2];
        if (i2 > 0) {
            for (int i3 = 0; i3 < b2; i3++) {
                fArr[i3] = (float) Math.random();
            }
        }
        dVar.setMusicWavePointArray(fArr);
        return dVar;
    }

    private void a(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.f132877c;
        float b2 = b(this.n);
        b(this.o);
        float b3 = b(this.p);
        float b4 = b(this.q);
        rectF.left = 0.0f;
        rectF.right = b2;
        rectF.top = 0.0f;
        float f2 = (float) measuredHeight;
        rectF.bottom = f2;
        canvas.drawRect(rectF, this.f132879e);
        int i2 = this.f132875a;
        int i3 = this.f132876b;
        float f3 = (float) measuredWidth;
        float f4 = ((((float) i2) * -1.0f) / ((float) (i3 - i2))) * f3;
        float f5 = (((float) this.s) * 1.0f) / ((float) (i3 - i2));
        this.f132878d.top = 0.1f * f2;
        this.f132878d.right = f5 * f3;
        this.f132878d.bottom = 0.9f * f2;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = b3;
        }
        rectF.right = f3;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.f132882h, (Rect) null, this.f132878d, (Paint) null);
        } else {
            this.f132885k.a(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f2;
        rectF.left = 0.0f;
        rectF.right = b2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.f132880f, (Rect) null, this.f132878d, (Paint) null);
        } else {
            this.f132883i.a(canvas);
        }
        canvas.restore();
        rectF.left = b2;
        rectF.right = b3;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.f132881g, (Rect) null, this.f132878d, (Paint) null);
        } else {
            this.f132884j.a(canvas);
        }
        canvas.restore();
        Bitmap bitmap = this.f132886l;
        canvas.drawBitmap(bitmap, b4 - ((float) (bitmap.getWidth() / 2)), (float) ((measuredHeight / 2) - (this.f132886l.getHeight() / 2)), (Paint) null);
    }

    public final void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i2)));
        } else if (i3 >= i2) {
            a(i2 - this.f132875a);
            this.f132875a = i2;
            this.f132876b = i3;
            invalidate();
        } else {
            throw new IllegalArgumentException("start: " + i2 + "; end: " + i3);
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar, int i2) {
        int i3 = 0;
        if (dVar == null || !k.b.a(dVar.getMusicWavePointArray())) {
            a(a(getContext(), i2));
            i3 = 1;
        } else {
            int i4 = this.f132875a;
            k.a(dVar, i4, this.f132876b - i4, i2);
            int b2 = k.f126400f.b(getContext());
            if (b2 < dVar.getMusicWavePointArray().length) {
                a(k.a(VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, b2)));
            }
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_show_music_wave", new com.ss.android.ugc.tools.f.b().a("scene", "VolumeTapsView").a("status", i3 ^ 1).f149193a);
    }

    private VolumeTapsView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10159);
        this.f132877c = new RectF();
        this.f132878d = new RectF();
        Paint paint = new Paint();
        this.f132879e = paint;
        this.f132887m = new GestureDetector(context, this);
        this.f132886l = BitmapFactory.decodeResource(getResources(), 2131232412);
        setWavForm(BitmapFactory.decodeResource(getResources(), 2131231370));
        this.f132884j = new d(context);
        this.f132883i = new d(context);
        this.f132885k = new d(context);
        this.f132884j.a(Color.parseColor("#FF20E5DC"));
        this.f132885k.a(-1);
        this.f132883i.a(Color.parseColor("#52FFFFFF"));
        int parseColor = Color.parseColor("#22FFFFFF");
        this.t = parseColor;
        paint.setColor(parseColor);
        setBackground(com.ss.android.ugc.tools.view.a.a(0, Color.parseColor("#22FFFFFF"), 0, (int) n.b(context, 2.0f)));
        MethodCollector.o(10159);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        this.q = a(Math.min(Math.max(b(this.n), motionEvent2.getX()), (float) getMeasuredWidth()));
        invalidate();
        a aVar = this.r;
        if (aVar == null) {
            return true;
        }
        aVar.a(this.q);
        return true;
    }
}
