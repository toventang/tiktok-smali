package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import dmt.av.video.VEPreviewMusicParams;
import h.f.b.l;

public final class q extends l {
    private boolean I = true;

    static {
        Covode.recordClassIndex(104189);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            r0 = 1
            r2.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.q.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        l.d(vEPreviewMusicParams, "");
        if (!vEPreviewMusicParams.f156744i || !this.I) {
            return false;
        }
        this.I = false;
        return super.a(vEPreviewMusicParams);
    }
}
