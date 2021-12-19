package com.ss.android.ugc.asve.recorder.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.asve.recorder.a.b;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import h.z;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;

public interface a extends b {
    static {
        Covode.recordClassIndex(38201);
    }

    int a(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z);

    int a(Context context, AudioRecorderInterface audioRecorderInterface);

    int a(String str, int i2, int i3, h.f.a.b<? super Integer, z> bVar);

    void a(double d2, boolean z, float f2, int i2, int i3, boolean z2, h.f.a.b<? super Integer, z> bVar);

    void a(int i2, VESafeAreaParams[] vESafeAreaParamsArr);

    void a(long j2);

    void a(Surface surface);

    void a(Surface surface, String str, h.f.a.b<? super Integer, z> bVar);

    void a(PrivacyCert privacyCert);

    void a(com.ss.android.ugc.asve.a.b bVar);

    void a(VEListener.j jVar);

    void a(ax.h hVar);

    void a(h.f.a.b<? super Integer, z> bVar);

    void a(h.f.a.b<? super Integer, z> bVar, h.f.a.a<z> aVar);

    void a(String str, double d2, h.f.a.b<? super Integer, z> bVar);

    void a(String str, int i2, int i3, boolean z, Bitmap.CompressFormat compressFormat, h.f.a.b<? super Integer, z> bVar, boolean z2);

    void a(String str, long j2, long j3, boolean z);

    void a(String str, String str2, boolean z, String str3, String str4, h.f.a.b<? super RecorderConcatResult, z> bVar);

    void a(List<ASMediaSegment> list, String str, String str2, int i2, VEListener.j jVar);

    void a(boolean z);

    void a(boolean z, PrivacyCert privacyCert);

    void a(boolean z, h.f.a.b<? super Integer, z> bVar);

    boolean a();

    boolean a(boolean z, String str);

    int b();

    int b(Context context, AudioRecorderInterface audioRecorderInterface);

    void b(Surface surface, String str, h.f.a.b<? super Integer, z> bVar);

    void b(VEListener.j jVar);

    boolean b(boolean z);

    void c();

    void c(VEListener.j jVar);

    void c(boolean z);

    long d();

    void d(boolean z);

    boolean e();

    long f();

    void g();

    LiveData<Boolean> h();

    int i();

    int j();

    int k();

    float l();

    int m();

    int n();

    int o();

    float p();

    float q();

    int r();

    float[] s();

    String[] t();

    void u();

    VEMapBufferInfo v();
}
