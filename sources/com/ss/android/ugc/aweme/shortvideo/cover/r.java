package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.cover.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import h.f.a.a;
import h.f.b.l;
import h.z;

final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b.AnonymousClass1 f125266a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectTextModel f125267b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoPublishEditModel f125268c;

    static {
        Covode.recordClassIndex(82262);
    }

    r(b.AnonymousClass1 r1, EffectTextModel effectTextModel, VideoPublishEditModel videoPublishEditModel) {
        this.f125266a = r1;
        this.f125267b = effectTextModel;
        this.f125268c = videoPublishEditModel;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        b.AnonymousClass1 r6 = this.f125266a;
        EffectTextModel effectTextModel = this.f125267b;
        VideoPublishEditModel videoPublishEditModel = this.f125268c;
        if (effectTextModel.getTextSticker() == null || !effectTextModel.getHasCoverText()) {
            b.this.p.put(0, new EffectTextModel());
        } else {
            b.this.p.put(0, effectTextModel);
        }
        b.this.o.put(0, Float.valueOf(b.this.f125230a.getVideoCoverViewX()));
        for (int i2 = 0; i2 <= 0; i2++) {
            b bVar = b.this;
            VideoPublishEditModel c2 = bVar.f125241l.c();
            EffectTextModel effectTextModel2 = bVar.p.get(0);
            EffectTextModel effectTextModel3 = c2.getCoverPublishModel().getEffectTextModel();
            l.d(effectTextModel3, "");
            l.d(effectTextModel2, "");
            effectTextModel3.setHasCoverText(effectTextModel2.getHasCoverText());
            effectTextModel3.setTextSticker(effectTextModel2.getTextSticker());
            effectTextModel3.setCreateAwemeCoverInfo(effectTextModel2.getCreateAwemeCoverInfo());
            effectTextModel3.setCoverSelectedFrom(effectTextModel2.getCoverSelectedFrom());
            effectTextModel3.setCoverFrameIndex(effectTextModel2.getCoverFrameIndex());
        }
        b bVar2 = b.this;
        videoPublishEditModel.getCoverPublishModel().setVideoCoverViewX(bVar2.f125230a.getVideoCoverViewX());
        videoPublishEditModel.mVideoCoverStartTm = bVar2.n / 1000.0f;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            videoPublishEditModel.mvCreateVideoData.videoCoverStartTime = (int) bVar2.n;
            bVar2.r = com.ss.android.ugc.tools.view.e.b.b(bVar2.getContext(), "");
            bVar2.r.setIndeterminate(true);
            new c(bVar2.f125241l.a(), videoPublishEditModel.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, new l(videoPublishEditModel), m.f125261a, new n(bVar2));
        } else if (!videoPublishEditModel.isMultiVideoEdit() || !es.j(videoPublishEditModel)) {
            bVar2.a();
        } else {
            bVar2.r = com.ss.android.ugc.tools.view.e.b.b(bVar2.getContext(), "");
            bVar2.r.setIndeterminate(true);
            new c(bVar2.f125241l.a(), videoPublishEditModel.multiEditVideoRecordData.coverImagePath, (int) bVar2.n, new o(videoPublishEditModel), p.f125264a, new q(bVar2));
        }
        return z.f158842a;
    }
}
