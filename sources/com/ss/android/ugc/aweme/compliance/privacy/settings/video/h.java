package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f77882a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f77883b;

    static {
        Covode.recordClassIndex(48270);
    }

    h(a aVar, boolean z) {
        this.f77882a = aVar;
        this.f77883b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f77882a;
        boolean z = this.f77883b;
        BaseResponse baseResponse = (BaseResponse) obj;
        int i2 = 1;
        if (baseResponse == null || baseResponse.status_code != 0) {
            new b(aVar.getParentFragment() instanceof a ? aVar.getParentFragment() : aVar).e(R.string.bp3).b();
            aVar.f77833h = !z;
            aVar.f77837l.a(new ax(aVar));
        } else if (aVar.f77828c != null && aVar.f77828c.getVideo() != null && aVar.f77828c.getVideo().getCaptionModel() != null) {
            CaptionModel captionModel = aVar.f77828c.getVideo().getCaptionModel();
            int hasOriginalAudio = captionModel.getHasOriginalAudio();
            if (!aVar.f77833h) {
                i2 = -1;
            }
            aVar.f77828c.getVideo().setCaptionModel(new CaptionModel(hasOriginalAudio, i2, captionModel.getOriginalCaptionLanguage(), captionModel.getCaptionList()));
        }
    }
}
