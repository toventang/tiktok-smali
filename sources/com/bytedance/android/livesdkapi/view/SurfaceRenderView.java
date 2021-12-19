package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.j.eg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class SurfaceRenderView extends SurfaceView implements e {

    /* renamed from: a  reason: collision with root package name */
    private int f23367a;

    /* renamed from: b  reason: collision with root package name */
    private int f23368b;

    /* renamed from: c  reason: collision with root package name */
    private int f23369c = 2;

    /* renamed from: d  reason: collision with root package name */
    private final float f23370d = 1.7777778f;

    /* renamed from: e  reason: collision with root package name */
    private DataChannel f23371e;

    static {
        Covode.recordClassIndex(13893);
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void a() {
        d.a("RenderView", "SurfaceView:reset");
        this.f23367a = 0;
        this.f23368b = 0;
        this.f23369c = 2;
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void setDataChannel(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f23371e = dataChannel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceRenderView(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(9401);
        MethodCollector.o(9401);
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void setScaleType(int i2) {
        this.f23369c = i2;
        d.a("RenderView", "SurfaceView:setScaleType :".concat(String.valueOf(i2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(9402);
        MethodCollector.o(9402);
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void a(int i2, int i3) {
        d.a("RenderView", "SurfaceView:setVideoSize width:" + i2 + " height:" + i3);
        if (i2 > 0 && i3 > 0) {
            this.f23367a = i2;
            this.f23368b = i3;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        int i4;
        float f4;
        int i5;
        int i6;
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        int i7 = this.f23369c;
        if (i7 == 2 || (i5 = this.f23367a) == 0 || (i6 = this.f23368b) == 0) {
            float f5 = (float) suggestedMinimumHeight;
            float f6 = (float) suggestedMinimumWidth;
            float f7 = f5 / f6;
            int i8 = this.f23367a;
            if (i8 == 0 || (i4 = this.f23368b) == 0) {
                f4 = this.f23370d;
                i8 = 9;
                i4 = 16;
            } else {
                f4 = (float) (i4 / i8);
            }
            if (f4 > f7) {
                suggestedMinimumHeight = (int) (((float) i4) * ((f6 * 1.0f) / ((float) i8)));
            } else {
                f2 = (f5 * 1.0f) / ((float) i4);
                f3 = (float) i8;
                suggestedMinimumWidth = (int) (f3 * f2);
            }
        } else if (i7 != 1) {
            if (i7 == 0) {
                float f8 = ((float) i6) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i5));
                float f9 = (float) suggestedMinimumHeight;
                if (f8 > f9) {
                    f2 = (f9 * 1.0f) / ((float) i6);
                    f3 = (float) i5;
                    suggestedMinimumWidth = (int) (f3 * f2);
                } else {
                    suggestedMinimumHeight = (int) f8;
                }
            } else if (i7 == 3) {
                suggestedMinimumHeight = (int) (((float) i6) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i5)));
            } else {
                suggestedMinimumWidth = 0;
                suggestedMinimumHeight = 0;
            }
        }
        d.a("RenderView", "SurfaceView:onMeasure width:" + suggestedMinimumWidth + " height:" + suggestedMinimumHeight);
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
        DataChannel dataChannel = this.f23371e;
        if (dataChannel != null) {
            dataChannel.c(eg.class);
        }
    }
}
