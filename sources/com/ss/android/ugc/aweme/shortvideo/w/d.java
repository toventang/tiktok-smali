package com.ss.android.ugc.aweme.shortvideo.w;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.z;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.record.a.c;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(86811);
    }

    public static final class b implements l {
        static {
            Covode.recordClassIndex(86813);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.w.l
        public final boolean a(ASCameraView aSCameraView) {
            l.d(aSCameraView, "");
            return false;
        }

        b() {
        }
    }

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f132675a;

        static {
            Covode.recordClassIndex(86812);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.w.e
        public final void a() {
            com.ss.android.ugc.aweme.shortvideo.record.a.a ap = this.f132675a.ap();
            if (ap != null) {
                if (ap.f130011e != null) {
                    ap.f130011e.cancel();
                }
                ap.f130011e = ValueAnimator.ofFloat(0.66f, 1.0f).setDuration(150L);
                ap.f130011e.addUpdateListener(new com.ss.android.ugc.aweme.shortvideo.record.a.d(ap));
                ap.f130011e.start();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.w.e
        public final void b() {
            com.ss.android.ugc.aweme.shortvideo.record.a.a ap = this.f132675a.ap();
            if (ap != null) {
                if (ap.f130011e != null) {
                    ap.f130011e.cancel();
                }
                ap.f130011e = ValueAnimator.ofFloat(1.0f, 0.66f).setDuration(150L);
                ap.f130011e.addUpdateListener(new c(ap));
                ap.f130011e.start();
            }
        }

        a(z zVar) {
            this.f132675a = zVar;
        }
    }
}
