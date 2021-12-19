package com.ss.android.ugc.aweme.shortvideo.upload.b;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEWatermarkParam;
import h.f.b.l;
import h.g.a;
import java.util.List;

public final class j extends h {
    static {
        Covode.recordClassIndex(86521);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a, com.ss.android.ugc.aweme.shortvideo.upload.b.h
    public final String i() {
        return "SerialPublishWithWatermarkFuture";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final void b(SynthetiseResult synthetiseResult) {
        l.d(synthetiseResult, "");
        q.a("ParallelWithEndWatermark", "onBiChannelSynthesisFinished result ".concat(String.valueOf(synthetiseResult)));
        e.c(this.n.extFile, this.f131995l.getLocalTempPath());
        e.c(this.n.extFile);
        a(c.EndingWatermarkSynthesis);
        b((Object) synthetiseResult);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a, com.ss.android.ugc.aweme.shortvideo.upload.b.h
    public final int a(c cVar, int i2) {
        l.d(cVar, "");
        if (k.f132070a[cVar.ordinal()] != 1) {
            return Math.min(100, a.a((((float) (i2 * 40)) / 100.0f) + 60.0f));
        }
        return Math.min(60, a.a(((float) (i2 * 60)) / 100.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(VideoPublishEditModel videoPublishEditModel, VEWatermarkParam vEWatermarkParam, m mVar, int i2, List<String> list, com.ss.android.ugc.aweme.shortvideo.upload.a aVar, com.ss.android.ugc.aweme.shortvideo.upload.l lVar, String str) {
        super(videoPublishEditModel, new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a(), vEWatermarkParam, mVar, i2, list, aVar, lVar, str);
        l.d(videoPublishEditModel, "");
        l.d(vEWatermarkParam, "");
        l.d(mVar, "");
        l.d(list, "");
        l.d(aVar, "");
        l.d(str, "");
    }
}
