package com.bytedance.creativex.recorder.b.a;

import android.graphics.Point;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.g;
import com.bytedance.als.h;
import com.bytedance.als.k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.aweme.tools.j;
import com.ss.android.vesdk.VEListener;
import h.p;
import h.z;

public interface f extends com.bytedance.als.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28183a = a.f28184a;

    public static final class b {
        static {
            Covode.recordClassIndex(16515);
        }
    }

    static {
        Covode.recordClassIndex(16513);
    }

    h<d> A();

    g<z> B();

    void C();

    ASCameraView D();

    VERecorderImpl E();

    SurfaceView F();

    View G();

    o H();

    void I();

    void J();

    i K();

    h<Double> L();

    g<z> M();

    int N();

    boolean O();

    boolean P();

    int Q();

    int R();

    int S();

    boolean T();

    void U();

    boolean V();

    boolean W();

    boolean X();

    boolean Y();

    boolean Z();

    int a(com.ss.android.ugc.aweme.tools.g gVar, PrivacyCert privacyCert, String str);

    int a(boolean z, PrivacyCert privacyCert, String str);

    void a(float f2);

    void a(float f2, float f3);

    void a(int i2);

    void a(PrivacyCert privacyCert, String str);

    void a(ac acVar);

    void a(com.bytedance.creativex.recorder.filter.b.b bVar, com.bytedance.creativex.recorder.filter.b.b bVar2, float f2);

    void a(i iVar);

    void a(j jVar);

    void a(VEListener.j jVar);

    void a(p<String, Float> pVar, p<String, Float> pVar2, float f2);

    void a(String str);

    void a(String str, float f2);

    void a(String str, String str2);

    void a(boolean z);

    void a(boolean z, k<y> kVar);

    void a(boolean z, l.a aVar, PrivacyCert privacyCert);

    boolean a(ScaleGestureDetector scaleGestureDetector);

    boolean a(boolean z, boolean z2);

    boolean aa();

    void ab();

    g<z> ac();

    String ad();

    void ae();

    SavePhotoStickerInfo af();

    void ag();

    g<z> ah();

    g<l> ai();

    g<k> aj();

    boolean ak();

    int al();

    long am();

    void b(float f2);

    void b(float f2, float f3);

    void b(int i2);

    void b(PrivacyCert privacyCert);

    void b(String str);

    void b(boolean z);

    void c(boolean z);

    boolean d(boolean z);

    CameraComponentModel e();

    void e(boolean z);

    CameraModule f();

    void f(boolean z);

    com.ss.android.ugc.aweme.shortvideo.record.d g();

    void g(boolean z);

    h<Boolean> h();

    h<Boolean> i();

    h<Boolean> j();

    g<z> k();

    g<Integer> l();

    g<e> m();

    g<Boolean> n();

    g<Boolean> o();

    LiveData<Float> p();

    g<h> q();

    g<z> r();

    g<Integer> s();

    g<Integer> t();

    g<Integer> u();

    g<j> v();

    g<Boolean> w();

    g<com.ss.android.ugc.aweme.tools.g> x();

    Point y();

    com.ss.android.ugc.asve.recorder.effect.a z();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f28184a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(16514);
        }
    }
}
