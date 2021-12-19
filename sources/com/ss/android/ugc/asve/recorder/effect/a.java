package com.ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.presenter.d;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.recorder.effect.composer.b;
import com.ss.android.ugc.asve.wrap.c;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;

public interface a extends b {
    static {
        Covode.recordClassIndex(38263);
    }

    int a(int i2, float f2);

    int a(Bitmap bitmap);

    int a(VEEffectFilterParam vEEffectFilterParam);

    int a(String str, float f2, float f3);

    int a(String str, String str2);

    int a(String str, String str2, float f2);

    int a(String[] strArr, int i2);

    void a();

    void a(double d2);

    void a(double d2, double d3, double d4, double d5);

    void a(float f2);

    void a(float f2, float f3);

    void a(float f2, float f3, float f4, float f5, float f6);

    void a(int i2);

    void a(int i2, float f2, float f3, int i3);

    void a(int i2, int i3, ax.d dVar);

    void a(int i2, long j2, long j3, String str);

    void a(int i2, String str);

    void a(Context context);

    void a(Context context, String str, String str2);

    void a(Context context, String str, String str2, String str3);

    void a(MessageCenter.Listener listener);

    void a(RecordInvoker.OnARTextContentCallback onARTextContentCallback);

    void a(RecordInvoker.OnARTextCountCallback onARTextCountCallback);

    void a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback);

    void a(com.ss.android.ugc.asve.wrap.b bVar);

    void a(c cVar);

    void a(VEARCoreParam vEARCoreParam);

    void a(al alVar);

    void a(ax.b bVar, int i2);

    void a(String str);

    void a(String str, float f2);

    void a(String str, int i2, int i3, String str2);

    void a(String str, String str2, float f2, float f3, float f4);

    void a(boolean z);

    void a(boolean z, boolean z2, boolean z3, boolean z4);

    void a(double[] dArr, double d2);

    void a(String[] strArr, double[] dArr, boolean[] zArr);

    boolean a(bh bhVar, int i2);

    float b(String str);

    int b(String str, float f2, float f3);

    int b(String[] strArr, int i2);

    void b();

    void b(double d2, double d3, double d4, double d5);

    void b(float f2, float f3);

    void b(int i2);

    void b(MessageCenter.Listener listener);

    void b(al alVar);

    void b(String str, String str2);

    void b(boolean z);

    d c();

    void c(double d2, double d3, double d4, double d5);

    void c(float f2, float f3);

    void c(String str);

    void c(boolean z);

    int[] c(String str, String str2);

    void d();

    void d(float f2, float f3);

    void d(String str);

    void d(boolean z);

    VEFrame e(String str);

    void e();

    void e(float f2, float f3);

    void e(boolean z);

    void f();

    void f(float f2, float f3);

    void f(boolean z);

    void g(boolean z);

    void h(boolean z);
}
