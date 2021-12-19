package com.lynx.tasm.behavior.ui.a;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

public class e extends a {

    /* renamed from: h  reason: collision with root package name */
    public a f56117h;

    /* renamed from: i  reason: collision with root package name */
    private double f56118i;

    static {
        Covode.recordClassIndex(35053);
    }

    public enum a {
        None,
        ToTop,
        ToBottom,
        ToLeft,
        ToRight,
        ToTopRight,
        ToTopLeft,
        ToBottomRight,
        ToBottomLeft,
        Angle;

        static {
            Covode.recordClassIndex(35054);
        }
    }

    public e(ReadableArray readableArray) {
        if (readableArray == null) {
            LLog.a(6, "LinearGradient", "native parse error array is null");
        } else if (readableArray.size() != 3) {
            LLog.a(6, "LinearGradient", "native parse error, array.size must be 3");
        } else {
            this.f56118i = readableArray.getDouble(0);
            a(readableArray.getArray(1), readableArray.getArray(2));
        }
    }

    public void setBounds(Rect rect) {
        PointF pointF;
        this.f56101b = Math.max(rect.width(), 1);
        this.f56102c = Math.max(rect.height(), 1);
        int[] iArr = this.f56103d;
        float[] fArr = this.f56104e;
        if (this.f56103d == null || this.f56103d.length < 2) {
            this.f56100a = null;
        } else if (this.f56104e == null || this.f56104e.length == this.f56103d.length) {
            try {
                float f2 = ((((float) this.f56101b) * 2.0f) * ((float) this.f56102c)) / ((float) ((this.f56101b * this.f56101b) + (this.f56102c * this.f56102c)));
                if (this.f56118i == 0.0d || this.f56117h == a.ToTop) {
                    this.f56100a = new LinearGradient(0.0f, (float) this.f56102c, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 180.0d || this.f56117h == a.ToBottom) {
                    this.f56100a = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f56102c, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 270.0d || this.f56117h == a.ToLeft) {
                    this.f56100a = new LinearGradient((float) this.f56101b, 0.0f, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 90.0d || this.f56117h == a.ToRight) {
                    this.f56100a = new LinearGradient(0.0f, 0.0f, (float) this.f56101b, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 45.0d || this.f56117h == a.ToTopRight) {
                    this.f56100a = new LinearGradient(((float) this.f56101b) - (((float) this.f56102c) * f2), ((float) this.f56101b) * f2, (float) this.f56101b, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 305.0d || this.f56117h == a.ToTopLeft) {
                    this.f56100a = new LinearGradient(((float) this.f56102c) * f2, ((float) this.f56101b) * f2, 0.0f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 135.0d || this.f56117h == a.ToBottomRight) {
                    this.f56100a = new LinearGradient(0.0f, 0.0f, ((float) this.f56102c) * f2, ((float) this.f56101b) * f2, iArr, fArr, Shader.TileMode.CLAMP);
                } else if (this.f56118i == 225.0d || this.f56117h == a.ToBottomLeft) {
                    this.f56100a = new LinearGradient((float) this.f56101b, 0.0f, ((float) this.f56101b) - (((float) this.f56102c) * f2), ((float) this.f56101b) * f2, iArr, fArr, Shader.TileMode.CLAMP);
                } else {
                    PointF pointF2 = new PointF();
                    PointF pointF3 = new PointF();
                    PointF pointF4 = new PointF(((float) this.f56101b) / 2.0f, ((float) this.f56102c) / 2.0f);
                    double radians = Math.toRadians(this.f56118i);
                    float sin = (float) Math.sin(radians);
                    float cos = (float) Math.cos(radians);
                    float tan = (float) Math.tan(radians);
                    if (sin >= 0.0f && cos >= 0.0f) {
                        pointF = new PointF((float) this.f56101b, 0.0f);
                    } else if (sin >= 0.0f && cos < 0.0f) {
                        pointF = new PointF((float) this.f56101b, (float) this.f56102c);
                    } else if (sin >= 0.0f || cos >= 0.0f) {
                        pointF = new PointF(0.0f, 0.0f);
                    } else {
                        pointF = new PointF(0.0f, (float) this.f56102c);
                    }
                    float f3 = ((pointF4.y - pointF.y) - (pointF4.x * tan)) + (pointF.x * tan);
                    pointF3.x = pointF4.x + ((sin * f3) / ((sin * tan) + cos));
                    pointF3.y = pointF4.y - (f3 / ((tan * tan) + 1.0f));
                    pointF2.x = (pointF4.x * 2.0f) - pointF3.x;
                    pointF2.y = (pointF4.y * 2.0f) - pointF3.y;
                    this.f56100a = new LinearGradient(pointF2.x, pointF2.y, pointF3.x, pointF3.y, iArr, fArr, Shader.TileMode.CLAMP);
                }
            } catch (Exception e2) {
                this.f56100a = null;
                e2.printStackTrace();
                LLog.c("BackgroundLinearGradientLayer", "exception:\n" + e2.toString());
            }
        } else {
            this.f56100a = null;
        }
        super.setBounds(rect);
    }
}
