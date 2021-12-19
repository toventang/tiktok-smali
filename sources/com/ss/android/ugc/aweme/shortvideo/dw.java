package com.ss.android.ugc.aweme.shortvideo;

import androidx.appcompat.app.d;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.g;
import com.bytedance.creativex.recorder.b.a.w;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.w.g;

public final class dw {

    /* renamed from: a  reason: collision with root package name */
    final d f126647a;

    /* renamed from: b  reason: collision with root package name */
    final g<?> f126648b;

    /* renamed from: c  reason: collision with root package name */
    private final ASCameraView f126649c;

    /* renamed from: d  reason: collision with root package name */
    private final CameraComponentModel f126650d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b f126651e;

    /* renamed from: f  reason: collision with root package name */
    private final h<Boolean> f126652f;

    static {
        Covode.recordClassIndex(83070);
    }

    public final void a(w wVar) {
        boolean z;
        if (!this.f126651e.q || !Boolean.FALSE.equals(this.f126652f.f6468a.getValue())) {
            CameraComponentModel cameraComponentModel = this.f126650d;
            ASCameraView aSCameraView = this.f126649c;
            if (cameraComponentModel.f124710e == 1) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.shortvideo.w.h.a(cameraComponentModel, aSCameraView, z, wVar.f28211a, this.f126650d.k(), this.f126651e, new dx(this, wVar));
            return;
        }
        this.f126648b.a(new g.e(wVar));
    }

    public final void onEvent(w wVar) {
        String e2;
        if (this.f126650d.h() >= this.f126650d.k()) {
            this.f126648b.a(new com.ss.android.ugc.aweme.tools.h("record_full"));
            return;
        }
        if (!this.f126650d.f124713h.e().exists()) {
            this.f126650d.f124713h.e().mkdirs();
        }
        if (this.f126650d.c() && this.f126651e.f132698e != null) {
            this.f126651e.f132698e.a();
        }
        if (this.f126650d.u != 1) {
            if (this.f126650d.b()) {
                e2 = this.f126650d.o.f124723d;
            } else if (this.f126650d.c()) {
                e2 = this.f126650d.p.f124739a.wavPath;
            } else {
                e2 = this.f126650d.e();
            }
            this.f126649c.a(e2, this.f126650d.g(), this.f126650d.h(), this.f126650d.z);
        }
        this.f126649c.setVideoQuality(this.f126651e.f132695b.f132744a);
        this.f126648b.f_(false);
        this.f126648b.h(false);
        this.f126651e.f132703j.a();
        a(wVar);
    }

    public dw(d dVar, com.bytedance.creativex.recorder.b.a.d dVar2, com.ss.android.ugc.aweme.shortvideo.w.g gVar, g.b bVar) {
        this.f126647a = dVar;
        this.f126649c = dVar2.D();
        this.f126648b = gVar;
        this.f126650d = dVar2.e();
        this.f126651e = bVar;
        this.f126652f = dVar2.j();
    }
}
