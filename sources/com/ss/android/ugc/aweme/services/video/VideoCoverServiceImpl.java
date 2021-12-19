package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.u.a;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import java.util.ArrayList;

public final class VideoCoverServiceImpl implements IVideoCoverService {
    static {
        Covode.recordClassIndex(79866);
    }

    public final Bitmap mergeCoverTextImage(Bitmap bitmap, CoverPublishModel coverPublishModel) {
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoCoverService
    public final void getVideoCoverByCallback(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        l.d(cVar, "");
        ArrayList arrayList = new ArrayList();
        if (cVar.E != null) {
            EffectListModel effectListModel = cVar.E;
            l.b(effectListModel, "");
            arrayList.addAll(effectListModel.getEffectPointModels());
        }
        int i2 = cVar.o;
        if (i2 != 0) {
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setKey(String.valueOf(i2));
            effectPointModel.setEndPoint(cVar.M);
            arrayList.add(effectPointModel);
            if (TextUtils.equals(effectPointModel.getKey(), "1")) {
                z = true;
                bj.d("DraftBoxViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + cVar.W.v);
                VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 = new VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(this, cVar, onVideoCoverCallback);
                IInternalAVService a2 = AVServiceImpl.a();
                l.b(a2, "");
                FilterBean filter = a2.getFilterService().getFilter(cVar.f83192m);
                l.b(filter, "");
                a.a(arrayList, filter.getFilterFilePath(), cVar.s(), (int) (cVar.S * 1000.0f), z, d.h(cVar), videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1);
            }
        }
        z = false;
        bj.d("DraftBoxViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + cVar.W.v);
        VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$12 = new VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(this, cVar, onVideoCoverCallback);
        IInternalAVService a22 = AVServiceImpl.a();
        l.b(a22, "");
        FilterBean filter2 = a22.getFilterService().getFilter(cVar.f83192m);
        l.b(filter2, "");
        a.a(arrayList, filter2.getFilterFilePath(), cVar.s(), (int) (cVar.S * 1000.0f), z, d.h(cVar), videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$12);
    }
}
