package dmt.av.video.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class p extends j {
    private int H = -1;
    private List<String> I;

    static {
        Covode.recordClassIndex(104187);
    }

    static final class a implements VEListener.aa {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f156862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f156863b;

        static {
            Covode.recordClassIndex(104188);
        }

        a(p pVar, d dVar) {
            this.f156862a = pVar;
            this.f156863b = dVar;
        }

        @Override // com.ss.android.vesdk.VEListener.aa
        public final void a() {
            ArrayList<MvNetFileBean> arrayList = this.f156863b.newMaskFileData;
            l.b(arrayList, "");
            if (!arrayList.isEmpty()) {
                Iterator<MvNetFileBean> it = this.f156863b.newMaskFileData.iterator();
                while (it.hasNext()) {
                    MvNetFileBean next = it.next();
                    String component1 = next.component1();
                    String component2 = next.component2();
                    String component3 = next.component3();
                    String component4 = next.component4();
                    if (!TextUtils.isEmpty(component3)) {
                        String h2 = h.h(component3);
                        if (!TextUtils.isEmpty(h2)) {
                            if (h2 == null) {
                                l.b();
                            }
                            if (h.m.p.c(h2, ".mp4", false) || h.m.p.c(h2, "/mp4", false)) {
                                this.f156862a.c().a(component1, component2, component3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_VIDEO);
                            }
                        }
                        this.f156862a.c().a(component1, component2, component3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_IMAGE);
                    }
                    if (!TextUtils.isEmpty(component4)) {
                        this.f156862a.c().a(component1, component2, component4, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE.MV_REESULT_IN_TYPE_JSON);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            r0 = -1
            r2.H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.p.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.av.video.b.j
    public final void a(boolean z) {
        com.bytedance.creativex.editor.preview.a aVar = this.f156781h;
        if (this.v == null && aVar != null && aVar.getCanvasWidth() > 0 && aVar.getCanvasHeight() > 0 && !aVar.isCanvasVEEditorType()) {
            c().a(x.e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
            c().c(aVar.getCanvasWidth(), aVar.getCanvasHeight());
        }
        super.a(z);
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        l.d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mType == 0) {
            c().b(vEVolumeChangeOp.mVolume);
            return false;
        } else if (vEVolumeChangeOp.mType != 1) {
            return false;
        } else {
            if (this.f156782i != -1) {
                c().a(this.f156782i, 1, vEVolumeChangeOp.mVolume);
                return false;
            }
            int d2 = c().d();
            this.H = d2;
            if (d2 == -1) {
                return false;
            }
            c().a(this.H, 1, vEVolumeChangeOp.mVolume);
            return false;
        }
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        List<String> list;
        int a2;
        l.d(vEPreviewMusicParams, "");
        if (vEPreviewMusicParams.f156748m) {
            int d2 = c().d();
            this.H = d2;
            if (d2 != -1) {
                c().a(this.H, 1, 0.0f);
            } else {
                c().a(0, 1, 0.0f);
            }
            return false;
        } else if (vEPreviewMusicParams.f156743h == 2 && TextUtils.isEmpty(vEPreviewMusicParams.f156741f)) {
            return false;
        } else {
            if (this.f156782i != -1) {
                c().e(this.f156782i);
                this.f156782i = -1;
            }
            String str = vEPreviewMusicParams.f156741f;
            if (TextUtils.isEmpty(str) || (list = this.I) == null || k.a(list) || !n.a((Iterable) list, (Object) str)) {
                int d3 = c().d();
                this.H = d3;
                if (d3 != -1) {
                    c().a(this.H, 1, 0.0f);
                }
                if (vEPreviewMusicParams.f156736a == null) {
                    return false;
                }
                if (vEPreviewMusicParams.f156739d <= 0 || Math.abs(vEPreviewMusicParams.f156738c - vEPreviewMusicParams.f156739d) < 1000) {
                    g c2 = c();
                    String str2 = vEPreviewMusicParams.f156736a;
                    l.b(str2, "");
                    a2 = c2.a(str2, vEPreviewMusicParams.f156737b, vEPreviewMusicParams.f156737b + vEPreviewMusicParams.f156738c, false);
                } else {
                    g c3 = c();
                    String str3 = vEPreviewMusicParams.f156736a;
                    l.b(str3, "");
                    a2 = c3.a(str3, vEPreviewMusicParams.f156737b, vEPreviewMusicParams.f156737b + vEPreviewMusicParams.f156739d, false);
                }
                this.f156782i = a2;
                c().a(this.f156782i, 1, vEPreviewMusicParams.f156740e);
            } else if (vEPreviewMusicParams.f156743h == 1) {
                c().a(this.H, 1, vEPreviewMusicParams.f156740e);
            } else {
                c().a(0, 1, vEPreviewMusicParams.f156740e);
            }
            return false;
        }
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, com.bytedance.creativex.editor.preview.a aVar, SurfaceView surfaceView, m mVar) {
        int i2;
        l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        if (!(aVar instanceof VEPreviewParams)) {
            bj.b("params isn't VEPreviewParams : ".concat(String.valueOf(aVar)));
            return 0;
        }
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.mvCreateVideoData == null) {
            bj.b("mvCreateVideoData is null");
            return 0;
        }
        d dVar = vEPreviewParams.mvCreateVideoData;
        if (dVar == null) {
            return 0;
        }
        ArrayList<String> arrayList = dVar.selectMediaList;
        l.b(arrayList, "");
        if (!(!arrayList.isEmpty()) || TextUtils.isEmpty(dVar.mvResUnzipPath)) {
            return 0;
        }
        ArrayList<String> arrayList2 = dVar.selectMediaList;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<String> arrayList4 = dVar.selectMediaList;
        l.b(arrayList4, "");
        Iterator<T> it = arrayList4.iterator();
        while (it.hasNext()) {
            it.next();
            arrayList3.add("img");
        }
        this.I = dVar.musicIds;
        if (c() == null) {
            return 0;
        }
        StringBuilder append = new StringBuilder("MVRes: InitMV: path: ").append(dVar.mvResUnzipPath).append(" file count ");
        File[] listFiles = new File(dVar.mvResUnzipPath).listFiles();
        if (listFiles != null) {
            i2 = listFiles.length;
        } else {
            i2 = 0;
        }
        bj.a(append.append(i2).toString());
        c().a(new a(this, dVar));
        g c2 = c();
        String str = dVar.mvResUnzipPath;
        l.b(str, "");
        l.b(arrayList2, "");
        ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList2, 10));
        Iterator<T> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(it2.next().toString());
        }
        Object[] array = arrayList5.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Object[] array2 = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        return c2.a(new com.ss.android.ugc.asve.editor.p(str, (String[]) array, (String[]) array2, VEMVParams.a.RES_CUSTOM, new VESize(aVar.getCanvasWidth(), aVar.getCanvasHeight()), (byte) 0));
    }
}
