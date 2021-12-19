package dmt.av.video.b;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.x;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import h.f.b.l;

public final class r extends j {
    private int H;
    private int I;
    private int J = -1;
    private int K = -1;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private int P = -1;
    private int Q;
    private int R;
    private int S = -1;

    static {
        Covode.recordClassIndex(104190);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            r0 = -1
            r2.J = r0
            r2.K = r0
            r2.L = r0
            r2.M = r0
            r2.N = r0
            r2.O = r0
            r2.P = r0
            r2.S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.r.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        l.d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mStart < 0 || vEVolumeChangeOp.mEnd < 0 || vEVolumeChangeOp.mStart >= vEVolumeChangeOp.mEnd) {
            if (vEVolumeChangeOp.mType == 0) {
                c().a(c().a().f151435j, c().a().f151436k, vEVolumeChangeOp.mVolume);
            } else if (vEVolumeChangeOp.mType == 1) {
                c().a(this.f156782i, 1, vEVolumeChangeOp.mVolume);
            }
            return false;
        }
        a(c(), vEVolumeChangeOp);
        return false;
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        l.d(vEPreviewMusicParams, "");
        if (this.f156782i != -1) {
            c().e(this.f156782i);
            this.f156782i = -1;
        }
        if (vEPreviewMusicParams.f156736a == null) {
            return false;
        }
        if (vEPreviewMusicParams.f156739d <= 0 || Math.abs(vEPreviewMusicParams.f156738c - vEPreviewMusicParams.f156739d) < 1000) {
            g c2 = c();
            String str = vEPreviewMusicParams.f156736a;
            l.b(str, "");
            this.f156782i = c2.a(str, vEPreviewMusicParams.f156737b, vEPreviewMusicParams.f156737b + vEPreviewMusicParams.f156738c, false);
        } else {
            g c3 = c();
            String str2 = vEPreviewMusicParams.f156736a;
            l.b(str2, "");
            this.f156782i = c3.a(str2, vEPreviewMusicParams.f156737b, vEPreviewMusicParams.f156737b + vEPreviewMusicParams.f156739d, false);
        }
        c().a(this.f156782i, 1, vEPreviewMusicParams.f156740e);
        if (vEPreviewMusicParams.f156745j >= 0 && vEPreviewMusicParams.f156746k >= 0 && vEPreviewMusicParams.f156745j < vEPreviewMusicParams.f156746k) {
            VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
            vEAudioVolumeFilterParam.volume = 0.0f;
            if (vEPreviewMusicParams.f156745j == this.H && vEPreviewMusicParams.f156746k == this.I && this.J >= 0) {
                c().a(this.J, vEAudioVolumeFilterParam);
            } else {
                this.H = vEPreviewMusicParams.f156745j;
                this.I = vEPreviewMusicParams.f156746k;
                this.J = c().a(1, vEAudioVolumeFilterParam, this.H, this.I + 100);
                c().a(this.J, vEAudioVolumeFilterParam);
            }
        }
        return false;
    }

    private final void a(g gVar, VEVolumeChangeOp vEVolumeChangeOp) {
        VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
        vEAudioVolumeFilterParam.volume = vEVolumeChangeOp.mVolume;
        int i2 = vEVolumeChangeOp.mVoiceType;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (vEVolumeChangeOp.mStart == this.Q && vEVolumeChangeOp.mEnd == this.R) {
                        gVar.a(this.S, vEAudioVolumeFilterParam);
                        return;
                    }
                    this.Q = vEVolumeChangeOp.mStart;
                    int i3 = vEVolumeChangeOp.mEnd;
                    this.R = i3;
                    int a2 = gVar.a(1, vEAudioVolumeFilterParam, this.Q, i3);
                    this.S = a2;
                    gVar.a(a2, vEAudioVolumeFilterParam);
                }
            } else if (vEVolumeChangeOp.mStart == this.N && vEVolumeChangeOp.mEnd == this.O) {
                gVar.a(this.P, vEAudioVolumeFilterParam);
            } else {
                this.N = vEVolumeChangeOp.mStart;
                int i4 = vEVolumeChangeOp.mEnd;
                this.O = i4;
                int a3 = gVar.a(1, vEAudioVolumeFilterParam, this.N, i4);
                this.P = a3;
                gVar.a(a3, vEAudioVolumeFilterParam);
            }
        } else if (vEVolumeChangeOp.mStart == this.K && vEVolumeChangeOp.mEnd == this.L) {
            gVar.a(this.M, vEAudioVolumeFilterParam);
        } else {
            this.K = vEVolumeChangeOp.mStart;
            int i5 = vEVolumeChangeOp.mEnd;
            this.L = i5;
            int a4 = gVar.a(1, vEAudioVolumeFilterParam, this.K, i5);
            this.M = a4;
            gVar.a(a4, vEAudioVolumeFilterParam);
        }
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, a aVar, SurfaceView surfaceView, m mVar) {
        l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        k kVar = new k(aVar.getVideoPaths());
        kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
        kVar.f62021d = aVar.getAudioPaths();
        int a2 = c().a(kVar);
        g c2 = c();
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.stitchParams != null && (vEPreviewParams.mPageType != 1 || vEPreviewParams.mIsFromDraft)) {
            StitchParams stitchParams = vEPreviewParams.stitchParams;
            float f2 = vEPreviewParams.mVolume;
            float f3 = vEPreviewParams.mMusicVolume;
            String musicPath = stitchParams.getMusicPath();
            if (musicPath == null) {
                musicPath = "";
            }
            String[] videoPaths = vEPreviewParams.getVideoPaths();
            l.b(videoPaths, "");
            long j2 = 0;
            for (String str : videoPaths) {
                j2 += b.a(str).getDuration();
            }
            int i2 = (int) j2;
            long duration = stitchParams.getDuration();
            if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0 || musicPath.length() <= 0) {
                int i3 = (int) duration;
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f3, 0, i3, 1);
                l.b(ofVoice, "");
                a(c2, ofVoice);
                int i4 = (int) (duration + 100);
                VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f2, i4, i2, 2);
                l.b(ofVoice2, "");
                a(c2, ofVoice2);
                VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(0.0f, i3, i4, 3);
                l.b(ofVoice3, "");
                a(c2, ofVoice3);
            } else if (e.b(musicPath)) {
                if (this.f156782i != -1) {
                    c().e(this.f156782i);
                    this.f156782i = -1;
                }
                this.f156782i = c2.a(musicPath, stitchParams.getMusicStart(), stitchParams.getMusicStart() + i2, false);
                c2.a(this.f156782i, 1, f3);
                c2.a(c2.a().f151435j, c2.a().f151436k, f2);
            }
        }
        return a2;
    }
}
