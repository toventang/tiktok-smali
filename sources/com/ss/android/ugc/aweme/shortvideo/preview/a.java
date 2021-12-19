package com.ss.android.ugc.aweme.shortvideo.preview;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.b.j;
import dmt.av.video.n;
import dmt.av.video.p;
import dmt.av.video.s;
import dmt.av.video.u;
import dmt.av.video.w;
import h.z;
import java.util.ArrayList;

public interface a extends b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.a$a  reason: collision with other inner class name */
    public static final class C3377a {
        static {
            Covode.recordClassIndex(85070);
        }
    }

    static {
        Covode.recordClassIndex(85069);
    }

    t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> A();

    t<Boolean> B();

    LiveData<g> C();

    LiveData<VEEditorAutoStartStopArbiter> D();

    t<u> E();

    LiveData<h.u<Boolean, Boolean, Boolean>> F();

    com.bytedance.creativex.editor.preview.a G();

    FrameLayout H();

    LiveData<Boolean> I();

    void J();

    LiveData<z> K();

    void L();

    LiveData<z> M();

    void N();

    LiveData<z> O();

    void P();

    LiveData<Integer> Q();

    LiveData<Integer> R();

    LiveData<Boolean> S();

    ViewGroup.MarginLayoutParams a();

    void a(int i2);

    void a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam);

    void a(FilterBean filterBean, FilterBean filterBean2, float f2);

    void a(com.ss.android.ugc.aweme.filter.c.a aVar);

    void a(VEVolumeChangeOp vEVolumeChangeOp);

    void a(n nVar);

    void a(s sVar);

    void a(u uVar);

    void a(boolean z);

    void a(boolean z, boolean z2, boolean z3);

    boolean a(VEPreviewMusicParams vEPreviewMusicParams);

    int b();

    void b(int i2);

    void b(boolean z);

    int c();

    void c(int i2);

    void c(boolean z);

    j d();

    void d(int i2);

    void d(boolean z);

    LiveData<Void> e();

    LiveData<Void> f();

    LiveData<SurfaceView> g();

    t<Boolean> h();

    t<Bitmap> i();

    LiveData<com.ss.android.ugc.aweme.filter.c.a> j();

    LiveData<com.ss.android.ugc.aweme.filter.repository.a.n> k();

    LiveData<k> l();

    int m();

    t<Integer> n();

    void o();

    dmt.av.video.g<p> p();

    dmt.av.video.k<w> q();

    ArrayList<EffectPointModel> r();

    LiveData<Boolean> s();

    LiveData<w> t();

    LiveData<IAudioEffectParam> u();

    t<dmt.av.video.t> v();

    LiveData<VEPreviewMusicParams> w();

    LiveData<s> x();

    LiveData<Boolean> y();

    void z();
}
