package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public class CircleProgressSegmentView extends ProgressSegmentView {

    /* renamed from: a  reason: collision with root package name */
    public static final a f132794a = new a((byte) 0);
    private final h v;
    private final float w;
    private final float x;

    static {
        Covode.recordClassIndex(86892);
    }

    public CircleProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final RectF getMArcRectF() {
        return (RectF) this.v.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86893);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<RectF> {
        final /* synthetic */ CircleProgressSegmentView this$0;

        static {
            Covode.recordClassIndex(86894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CircleProgressSegmentView circleProgressSegmentView) {
            super(0);
            this.this$0 = circleProgressSegmentView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RectF invoke() {
            return new RectF(0.0f, 0.0f, (float) this.this$0.getMeasuredWidth(), (float) this.this$0.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    public final void a(Canvas canvas) {
        c(canvas);
        d(canvas);
    }

    private final float a(long j2) {
        return Math.min((((float) j2) / ((float) this.f132829m)) * 360.0f, 360.0f);
    }

    private static float a(List<VERecordData.VERecordSegmentData> list) {
        long j2 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list) {
            j2 += vERecordSegmentData.f150796c;
        }
        return 360.0f / ((float) j2);
    }

    public void setCircleRadius(float f2) {
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        getMArcRectF().left = (measuredWidth - f2) + this.x;
        getMArcRectF().top = (measuredHeight - f2) + this.x;
        getMArcRectF().right = (measuredWidth + f2) - this.x;
        getMArcRectF().bottom = (measuredHeight + f2) - this.x;
        invalidate();
    }

    private final void c(Canvas canvas) {
        Paint paint = this.f132821e;
        l.b(paint, "");
        paint.setStrokeCap(Paint.Cap.BUTT);
        List list = this.r;
        l.b(list, "");
        float a2 = a(list);
        List<VERecordData.VERecordSegmentData> list2 = this.r;
        l.b(list2, "");
        float f2 = -90.0f;
        int i2 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list2) {
            float f3 = ((float) vERecordSegmentData.f150796c) * a2;
            if (i2 == this.s) {
                if (this.u != null && this.t >= 0) {
                    a(canvas, f2, f3, 1000.0f * a2);
                }
                if (this.p) {
                    Paint paint2 = this.f132828l;
                    l.b(paint2, "");
                    paint2.setAlpha((int) (this.o * 255.0f));
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), f2, f3, false, this.f132828l);
                    }
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), f2, f3, false, this.f132823g);
            }
            f2 += f3;
            i2++;
        }
    }

    private final void d(Canvas canvas) {
        List list = this.r;
        l.b(list, "");
        float a2 = a(list);
        List<VERecordData.VERecordSegmentData> list2 = this.r;
        l.b(list2, "");
        float f2 = -90.0f;
        int i2 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : list2) {
            float f3 = ((float) vERecordSegmentData.f150796c) * a2;
            if (i2 == this.s) {
                Paint paint = this.f132827k;
                l.b(paint, "");
                paint.setAlpha((int) (this.n * 255.0f));
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), f2 - 2.0f, 4.0f, false, this.f132827k);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), f2 - 2.0f, 4.0f, false, this.f132824h);
            }
            f2 += f3;
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    public void onDraw(Canvas canvas) {
        if (this.q == 2) {
            a(canvas);
            return;
        }
        float a2 = a(this.f132820d);
        if (this.f132819c != null) {
            TimeSpeedModelExtension timeSpeedModelExtension = this.f132819c;
            l.b(timeSpeedModelExtension, "");
            float a3 = a((long) timeSpeedModelExtension.getDuration());
            if (canvas != null) {
                canvas.drawArc(getMArcRectF(), -90.0f, a3, false, this.f132825i);
                if (a2 > a3) {
                    canvas.drawArc(getMArcRectF(), a3 - 90.0f, a2 - a3, false, this.f132826j);
                }
            }
        } else if (canvas != null) {
            canvas.drawArc(getMArcRectF(), -90.0f, a2, false, this.f132822f);
        }
        b(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView
    public final void b(Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.f132819c;
        long j2 = 0;
        if (timeSpeedModelExtension != null) {
            long duration = ((long) timeSpeedModelExtension.getDuration()) + 0;
            float a2 = a(duration);
            if (a2 < 360.0f) {
                if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), a2 - 90.0f, 4.0f, false, this.f132824h);
                }
            } else if (canvas != null) {
                canvas.drawArc(getMArcRectF(), (a2 - 90.0f) - 2.0f, 4.0f, false, this.f132824h);
            }
            j2 = duration;
        }
        if (this.f132818b != null) {
            List list = this.f132818b;
            l.b(list, "");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) this.f132818b.get(i2);
                l.b(timeSpeedModelExtension2, "");
                j2 += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                float a3 = a(j2);
                if (a3 < 360.0f) {
                    if (canvas != null) {
                        canvas.drawArc(getMArcRectF(), a3 - 90.0f, 4.0f, false, this.f132824h);
                    }
                } else if (canvas != null) {
                    canvas.drawArc(getMArcRectF(), (a3 - 90.0f) - 2.0f, 4.0f, false, this.f132824h);
                }
            }
        }
    }

    private /* synthetic */ CircleProgressSegmentView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CircleProgressSegmentView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.v = i.a((h.f.a.a) new b(this));
        float b2 = n.b(context, 6.0f);
        this.w = b2;
        this.x = b2 / 2.0f;
        Paint paint = this.f132822f;
        if (paint != null) {
            paint.setStrokeWidth(b2);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
        }
        Paint paint2 = this.f132824h;
        if (paint2 != null) {
            paint2.setStrokeWidth(b2);
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.f132821e;
        if (paint3 != null) {
            paint3.setStrokeWidth(b2);
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.f132823g;
        if (paint4 != null) {
            paint4.setStrokeWidth(b2);
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
            paint4.setAlpha(86);
        }
        Paint paint5 = this.f132827k;
        if (paint5 != null) {
            paint5.setStrokeWidth(b2);
            paint5.setStyle(Paint.Style.STROKE);
        }
        Paint paint6 = this.f132828l;
        if (paint6 != null) {
            paint6.setStrokeWidth(b2);
            paint6.setStyle(Paint.Style.STROKE);
            paint6.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
        }
        Paint paint7 = this.f132825i;
        if (paint7 != null) {
            paint7.setStrokeWidth(b2);
            paint7.setStyle(Paint.Style.STROKE);
            paint7.setColor(androidx.core.content.b.c(getContext(), R.color.bh));
        }
        Paint paint8 = this.f132826j;
        if (paint8 != null) {
            paint8.setStrokeWidth(b2);
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setColor(androidx.core.content.b.c(getContext(), R.color.bm));
        }
    }

    private final void a(Canvas canvas, float f2, float f3, float f4) {
        Paint paint = this.f132822f;
        l.b(paint, "");
        paint.setStrokeCap(Paint.Cap.BUTT);
        float min = Math.min(((float) this.t) * f4, f3);
        if (canvas != null) {
            canvas.drawArc(getMArcRectF(), f2, min, false, this.f132822f);
        }
        if (this.u != null) {
            float f5 = f2;
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.u) {
                l.b(timeSpeedModelExtension, "");
                f5 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f4;
                if (f5 < f3 + f2 && canvas != null) {
                    canvas.drawArc(getMArcRectF(), f5 - 2.0f, 4.0f, false, this.f132824h);
                }
            }
        }
    }
}
