package com.ss.android.ugc.asve.editor;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public interface g {

    public static final class a {
        static {
            Covode.recordClassIndex(38127);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(38128);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(38126);
    }

    boolean A();

    int B();

    int C();

    int D();

    float F();

    int G();

    int H();

    int I();

    void J();

    void K();

    void L();

    int a(float f2);

    int a(int i2, float f2);

    int a(int i2, float f2, float f3);

    int a(int i2, int i3, int i4);

    int a(int i2, int i3, int i4, int i5, int i6, boolean z);

    int a(int i2, int i3, int i4, boolean z);

    int a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam);

    int a(int i2, int i3, x.g gVar);

    int a(int i2, int i3, String str, byte[] bArr, int i4, int i5, VEListener.a aVar);

    int a(int i2, ROTATE_DEGREE rotate_degree);

    int a(int i2, VEListener.i iVar);

    int a(int i2, VEListener.w wVar);

    int a(int i2, VEBaseFilterParam vEBaseFilterParam);

    int a(int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4);

    int a(int i2, x.f fVar);

    int a(int i2, x.f fVar, VEListener.s sVar);

    int a(int i2, String str, String str2);

    int a(int i2, ByteBuffer byteBuffer);

    int a(int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2);

    int a(int i2, float[] fArr);

    int a(int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    int a(int i2, ByteBuffer[] byteBufferArr);

    int a(c cVar);

    int a(i iVar);

    int a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    int a(VERecordData vERecordData, boolean z, boolean z2);

    int a(bg bgVar);

    int a(bg bgVar, int i2, int i3);

    int a(VEBaseFilterParam vEBaseFilterParam);

    int a(x.e eVar);

    int a(String str);

    int a(String str, float f2);

    int a(String str, float f2, float f3, float f4, float f5);

    int a(String str, int i2, int i3);

    int a(String str, int i2, int i3, int i4, int i5, boolean z);

    int a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath);

    int a(String str, int i2, int i3, boolean z);

    int a(String str, String str2);

    int a(String str, String str2, float f2);

    int a(String str, String str2, float f2, float f3, float f4);

    int a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type);

    int a(String str, String[] strArr);

    int a(int[] iArr);

    int a(int[] iArr, int i2, int i3, x.a aVar, VEListener.w wVar);

    int a(int[] iArr, String str, byte[] bArr, VEListener.a aVar);

    int a(String[] strArr, String[] strArr2);

    int a(boolean[] zArr, c cVar);

    Bitmap a(int i2);

    VESize a(int i2, int i3);

    com.ss.android.vesdk.runtime.b a();

    String a(int i2, int i3, int i4, String str);

    void a(float f2, float f3, float f4, int i2, int i3);

    void a(int i2, int i3, int i4, int i5);

    void a(Bitmap bitmap);

    void a(b bVar);

    void a(VEListener.aa aaVar);

    void a(VEListener.p pVar);

    void a(VEListener.t tVar);

    void a(VEListener.v vVar);

    void a(r rVar);

    void a(boolean z);

    void a(String[] strArr);

    boolean a(int i2, int i3, float f2);

    boolean a(VEVideoEncodeSettings vEVideoEncodeSettings);

    boolean a(String str, VEVideoEncodeSettings vEVideoEncodeSettings);

    boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.q qVar);

    int[] a(VECherEffectParam vECherEffectParam);

    int[] a(int[] iArr, int[] iArr2, String[] strArr);

    int[] a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2);

    int b(float f2);

    int b(int i2, float f2);

    int b(int i2, float f2, float f3);

    int b(int i2, int i3);

    int b(int i2, int i3, int i4);

    int b(int i2, int i3, VEBaseFilterParam vEBaseFilterParam);

    int b(int i2, ROTATE_DEGREE rotate_degree);

    int b(String str);

    int b(String str, float f2);

    int b(int[] iArr);

    int b(String[] strArr);

    VESize b();

    void b(int i2);

    void b(b bVar);

    void b(r rVar);

    void b(boolean z);

    float c(String str);

    int c(int i2, float f2);

    int c(String str, float f2);

    int c(boolean z);

    int c(int[] iArr);

    Bitmap c();

    void c(float f2);

    void c(int i2);

    void c(int i2, int i3);

    void c(r rVar);

    int d();

    String d(String str);

    void d(int i2);

    void d(int i2, int i3);

    void d(r rVar);

    void d(boolean z);

    int e(int i2);

    int e(int i2, int i3);

    VEMVAudioInfo e();

    void e(boolean z);

    int f(int i2, int i3);

    x.j f();

    void f(boolean z);

    boolean f(int i2);

    int g(int i2);

    int g(int i2, int i3);

    void g(boolean z);

    String[] g();

    float[] h(int i2);

    String[] h();

    int i(int i2);

    String[] i();

    int j();

    int j(int i2);

    int k();

    int k(int i2);

    int l(int i2);

    List<VEClipAlgorithmParam> l();

    void m(int i2);

    int n();

    int n(int i2);

    float o(int i2);

    int o();

    float p(int i2);

    int p();

    int q();

    boolean q(int i2);

    int r(int i2);

    void r();

    int s(int i2);

    void s();

    int t();

    int t(int i2);

    int u();

    int v();

    int w();

    int x();

    int y();

    int z();
}
