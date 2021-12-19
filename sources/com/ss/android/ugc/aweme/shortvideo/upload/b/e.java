package com.ss.android.ugc.aweme.shortvideo.upload.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.b.a;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.r;
import dmt.av.video.m;
import h.f.b.l;
import java.util.List;

public final class e extends a {
    static {
        Covode.recordClassIndex(86505);
    }

    public final class a extends a.b {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f132028e;

        static {
            Covode.recordClassIndex(86506);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a.b
        public final boolean b() {
            if (this.f132001a.incrementAndGet() == 2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a.b
        public final void a(g gVar, SynthetiseResult synthetiseResult) {
            l.d(gVar, "");
            l.d(synthetiseResult, "");
            this.f132028e.b(synthetiseResult);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, g gVar, SynthetiseResult synthetiseResult) {
            super(eVar, gVar, synthetiseResult);
            l.d(gVar, "");
            l.d(synthetiseResult, "");
            this.f132028e = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final void h() {
        com.ss.android.ugc.aweme.video.e.c(this.f131996m.b().getPath());
        this.n.extFile = this.f131996m.b().getPath();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final void a(SynthetiseResult synthetiseResult) {
        l.d(synthetiseResult, "");
        g gVar = g().w;
        l.b(gVar, "");
        b((r) new a(this, gVar, synthetiseResult));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.upload.b.a
    public final VEVideoEncodeSettings a(g gVar, SynthetiseResult synthetiseResult) {
        l.d(gVar, "");
        l.d(synthetiseResult, "");
        return m.a(this.f131995l, synthetiseResult, this.n, gVar, this.s);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar, VEWatermarkParam vEWatermarkParam, androidx.lifecycle.m mVar, int i2, List<String> list, com.ss.android.ugc.aweme.shortvideo.upload.a aVar2, com.ss.android.ugc.aweme.shortvideo.upload.l lVar, String str) {
        super(videoPublishEditModel, aVar, vEWatermarkParam, mVar, i2, list, aVar2, lVar, str);
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        l.d(vEWatermarkParam, "");
        l.d(mVar, "");
        l.d(list, "");
        l.d(aVar2, "");
        l.d(str, "");
    }
}
