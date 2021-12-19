package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.j.eg;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public class TextureRenderView extends TextureView implements e {

    /* renamed from: a  reason: collision with root package name */
    private int f23372a;

    /* renamed from: b  reason: collision with root package name */
    private int f23373b;

    /* renamed from: c  reason: collision with root package name */
    private int f23374c = 2;

    /* renamed from: d  reason: collision with root package name */
    private final float f23375d = 1.7777778f;

    /* renamed from: e  reason: collision with root package name */
    private DataChannel f23376e;

    static {
        Covode.recordClassIndex(13894);
    }

    public int getTextureLayout() {
        return this.f23374c;
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void a() {
        d.a("RenderView", "TextureView:reset");
        this.f23372a = 0;
        this.f23373b = 0;
        this.f23374c = 2;
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public void setDataChannel(DataChannel dataChannel) {
        this.f23376e = dataChannel;
    }

    public TextureRenderView(Context context) {
        super(context);
        MethodCollector.i(9973);
        MethodCollector.o(9973);
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public void setScaleType(int i2) {
        this.f23374c = i2;
        d.a("RenderView", "TextureView:setScaleType :".concat(String.valueOf(i2)));
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10129);
        MethodCollector.o(10129);
    }

    @Override // com.bytedance.android.livesdkapi.view.e
    public final void a(int i2, int i3) {
        d.a("RenderView", "TextureView:setVideoSize width:" + i2 + " height:" + i3);
        if (i2 > 0 && i3 > 0) {
            this.f23372a = i2;
            this.f23373b = i3;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
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
        if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        int i7 = this.f23374c;
        if (i7 == 2 || (i5 = this.f23372a) == 0 || (i6 = this.f23373b) == 0) {
            float f5 = (float) suggestedMinimumHeight;
            float f6 = (float) suggestedMinimumWidth;
            float f7 = f5 / f6;
            int i8 = this.f23372a;
            if (i8 == 0 || (i4 = this.f23373b) == 0) {
                f4 = 1.7777778f;
                i8 = 9;
                i4 = 16;
            } else {
                f4 = ((float) i4) / ((float) i8);
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
                int i9 = (int) (((float) i6) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i5)));
                if (i9 > suggestedMinimumHeight) {
                    f2 = (((float) suggestedMinimumHeight) * 1.0f) / ((float) i6);
                    f3 = (float) i5;
                    suggestedMinimumWidth = (int) (f3 * f2);
                } else {
                    suggestedMinimumHeight = i9;
                }
            } else if (i7 == 3) {
                suggestedMinimumHeight = (int) (((float) i6) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i5)));
            } else {
                suggestedMinimumWidth = 0;
                suggestedMinimumHeight = 0;
            }
        }
        d.a("RenderView", "TextureView:onMeasure width:" + suggestedMinimumWidth + " height:" + suggestedMinimumHeight);
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
        if (this.f23376e != null && LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            this.f23376e.c(eg.class);
        }
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, null, 0);
        MethodCollector.i(10130);
        MethodCollector.o(10130);
    }
}
