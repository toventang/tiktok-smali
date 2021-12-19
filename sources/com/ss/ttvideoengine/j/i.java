package com.ss.ttvideoengine.j;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public float[] f152924a;

    /* renamed from: b  reason: collision with root package name */
    public int f152925b;

    /* renamed from: c  reason: collision with root package name */
    public int f152926c;

    /* renamed from: d  reason: collision with root package name */
    public int f152927d;

    static {
        Covode.recordClassIndex(101671);
    }

    private int c(float f2) {
        float[] fArr = this.f152924a;
        if (fArr.length != 3) {
            return 0;
        }
        double d2 = (double) fArr[0];
        double d3 = (double) fArr[1];
        double d4 = (double) f2;
        double pow = Math.pow(d4, (double) fArr[2]);
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d4);
        return (int) (((((d2 / pow) + d3) * d4) * 1024.0d) / 8.0d);
    }

    private int b(float f2) {
        float[] fArr = this.f152924a;
        if (fArr.length > 50) {
            j.e("FitterInfo", "bitrateFitterParams num: " + fArr.length);
            return 0;
        }
        double d2 = 0.0d;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            double d3 = 1.0d;
            for (int i3 = 0; i3 < (fArr.length - i2) - 1; i3++) {
                double d4 = (double) f2;
                Double.isNaN(d4);
                d3 *= d4;
            }
            double d5 = (double) fArr[i2];
            Double.isNaN(d5);
            d2 += d3 * d5;
        }
        double d6 = (double) f2;
        Double.isNaN(d6);
        return (int) (((d2 * d6) * 1024.0d) / 8.0d);
    }

    public final int a(float f2) {
        if (this.f152924a == null) {
            j.e("FitterInfo", "fitter params empty");
            return 0;
        } else if (f2 > ((float) this.f152926c) || f2 <= 0.0f) {
            j.e("FitterInfo", a.a("preload second:%f, fitter duration:%d", new Object[]{Float.valueOf(f2), Integer.valueOf(this.f152926c)}));
            return 0;
        } else {
            int i2 = this.f152927d;
            if (i2 == 0) {
                return b(f2);
            }
            if (i2 == 1) {
                return c(f2);
            }
            return b(f2);
        }
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("func_params")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("func_params");
                    if (jSONArray.length() > 0) {
                        this.f152924a = new float[jSONArray.length()];
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            this.f152924a[i2] = (float) jSONArray.optDouble(i2);
                        }
                    } else {
                        return;
                    }
                }
                this.f152925b = jSONObject.optInt("header_size");
                this.f152926c = jSONObject.optInt("duration");
                this.f152927d = jSONObject.optInt("func_method");
            } catch (Exception unused) {
            }
        }
    }
}
