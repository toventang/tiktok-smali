package com.ss.android.ugc.aweme.shortvideo.upload;

import androidx.core.d.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.af;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.c;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEWatermarkParam;
import dmt.av.video.z;
import java.io.File;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements a.AbstractC0029a {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f132112a;

    /* renamed from: b  reason: collision with root package name */
    private final SynthetiseResult f132113b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoPublishEditModel f132114c;

    /* renamed from: d  reason: collision with root package name */
    private final z f132115d;

    /* renamed from: e  reason: collision with root package name */
    private final VEWatermarkParam f132116e;

    static {
        Covode.recordClassIndex(86534);
    }

    f(c.AnonymousClass1 r1, SynthetiseResult synthetiseResult, VideoPublishEditModel videoPublishEditModel, z zVar, VEWatermarkParam vEWatermarkParam) {
        this.f132112a = r1;
        this.f132113b = synthetiseResult;
        this.f132114c = videoPublishEditModel;
        this.f132115d = zVar;
        this.f132116e = vEWatermarkParam;
    }

    @Override // androidx.core.d.a.AbstractC0029a
    public final void a() {
        String str;
        c.AnonymousClass1 r5 = this.f132112a;
        SynthetiseResult synthetiseResult = this.f132113b;
        VideoPublishEditModel videoPublishEditModel = this.f132114c;
        z zVar = this.f132115d;
        VEWatermarkParam vEWatermarkParam = this.f132116e;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = -66666;
        if (!(c.this.f132071a instanceof af) || ((af) c.this.f132071a).o != -1) {
            str = "Compiler canceled";
        } else {
            str = "Compiler stuck; " + c.this.f132077g;
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            String a2 = com.a.a(Locale.US, "-6666601 videoSize:%d isRecordToEditFrameOptimizeAB:%b", new Object[]{Integer.valueOf(previewInfo != null ? previewInfo.getVideoList().size() : 0), true});
            q.b(a2);
            com.ss.android.ugc.aweme.df.f.a(a2);
            clone.ret = -6666601;
        }
        if (r5.a((Throwable) c.a.a().a(clone).a(str).a(cr.a().f125305l).a())) {
            q.a("ConcurrentUploadCompiler cancelUpload");
            if (c.this.f132071a != null) {
                c.this.f132071a.b();
            }
            zVar.w.s();
        }
        if (synthetiseResult.outputFile != null) {
            File file = new File(synthetiseResult.outputFile);
            if (file.exists()) {
                c.AnonymousClass1.a(file);
                k.a("incompleteFile delete incompleteFile : ".concat(String.valueOf(file)));
            }
            if (vEWatermarkParam != null) {
                File file2 = new File(vEWatermarkParam.extFile);
                if (file2.exists()) {
                    c.AnonymousClass1.a(file2);
                    k.a("incompleteWatermarkFile delete incompleteWatermarkFile : ".concat(String.valueOf(file2)));
                }
            }
        }
    }
}
