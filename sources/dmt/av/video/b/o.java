package dmt.av.video.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.editor.n;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.tools.utils.k;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.s;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class o extends j {
    static {
        Covode.recordClassIndex(104186);
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        l.d(vEPreviewMusicParams, "");
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.o.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        l.d(vEVolumeChangeOp, "");
        return c().a(c().d(), 1, vEVolumeChangeOp.mVolume);
    }

    @Override // dmt.av.video.b.j
    public final boolean a(s sVar) {
        l.d(sVar, "");
        if (c().a(c().d(), sVar.f156950a, sVar.f156950a + sVar.f156951b, false) >= 0) {
            return true;
        }
        return false;
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, a aVar, SurfaceView surfaceView, m mVar) {
        VEPreviewParams vEPreviewParams;
        d dVar;
        l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        if (!(aVar instanceof VEPreviewParams) || (dVar = (vEPreviewParams = (VEPreviewParams) aVar).mvCreateVideoData) == null || !k.b(dVar.selectMediaList) || TextUtils.isEmpty(dVar.mvResUnzipPath)) {
            return 0;
        }
        int size = dVar.selectMediaList.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            String str = dVar.selectMediaList.get(i2);
            l.b(str, "");
            strArr[i2] = str;
        }
        int size2 = dVar.selectMediaList.size();
        String[] strArr2 = new String[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            strArr2[i3] = "img";
        }
        if (c() == null) {
            return 0;
        }
        if (vEPreviewParams.mPageType == 3 || vEPreviewParams.mPageType == 2 || vEPreviewParams.mIsFromDraft) {
            g c2 = c();
            String str2 = dVar.mvResUnzipPath;
            l.b(str2, "");
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(strArr[i4].toString());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return c2.a(new n(str2, (String[]) array, strArr2, vEPreviewParams.mMusicPath, vEPreviewParams.mMusicInPoint, vEPreviewParams.mMusicOutPoint, 192));
        }
        g c3 = c();
        String str3 = dVar.mvResUnzipPath;
        l.b(str3, "");
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(strArr[i5].toString());
        }
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        return c3.a(new n(str3, (String[]) array2, strArr2, null, 0, 0, 248));
    }
}
