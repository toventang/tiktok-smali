package com.bytedance.android.live.broadcast.c;

import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.covode.number.Covode;

public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static float[] f7775e = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};

    /* renamed from: a  reason: collision with root package name */
    public float f7776a = com.bytedance.android.livesdk.ap.a.Q.a().floatValue();

    /* renamed from: b  reason: collision with root package name */
    public float f7777b = com.bytedance.android.livesdk.ap.a.R.a().floatValue();

    /* renamed from: c  reason: collision with root package name */
    public float f7778c = com.bytedance.android.livesdk.ap.a.S.a().floatValue();

    /* renamed from: d  reason: collision with root package name */
    public int f7779d = com.bytedance.android.livesdk.ap.a.T.a().intValue();

    /* access modifiers changed from: package-private */
    public abstract void d(float f2);

    /* access modifiers changed from: package-private */
    public abstract void e(float f2);

    /* access modifiers changed from: package-private */
    public abstract void f(float f2);

    static {
        Covode.recordClassIndex(3842);
    }

    public a() {
        a();
    }

    public static void a() {
        if (com.bytedance.android.livesdk.ap.a.Q.a().floatValue() < 0.0f) {
            c.a(com.bytedance.android.livesdk.ap.a.Q, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18949b));
        }
        if (com.bytedance.android.livesdk.ap.a.R.a().floatValue() < 0.0f) {
            c.a(com.bytedance.android.livesdk.ap.a.R, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b));
        }
        if (com.bytedance.android.livesdk.ap.a.S.a().floatValue() < 0.0f) {
            c.a(com.bytedance.android.livesdk.ap.a.S, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b));
        }
    }

    public final void a(float f2) {
        if (com.bytedance.android.livesdk.ap.a.Q.a().floatValue() != f2) {
            c.a(com.bytedance.android.livesdk.ap.a.Q, Float.valueOf(f2));
            this.f7776a = LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18948a * f2;
        }
        d(this.f7776a);
    }

    public final void b(float f2) {
        if (com.bytedance.android.livesdk.ap.a.R.a().floatValue() != f2) {
            c.a(com.bytedance.android.livesdk.ap.a.R, Float.valueOf(f2));
            this.f7777b = LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18948a * f2;
        }
        e(this.f7777b);
    }

    public final void c(float f2) {
        if (com.bytedance.android.livesdk.ap.a.S.a().floatValue() != f2) {
            c.a(com.bytedance.android.livesdk.ap.a.S, Float.valueOf(f2));
            this.f7778c = LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18948a * f2;
        }
        f(this.f7778c);
    }

    public final void a(int i2) {
        if (com.bytedance.android.livesdk.ap.a.T.a().intValue() != i2) {
            c.a(com.bytedance.android.livesdk.ap.a.T, Integer.valueOf(i2));
            this.f7779d = i2;
        }
        d(f7775e[i2]);
    }
}
