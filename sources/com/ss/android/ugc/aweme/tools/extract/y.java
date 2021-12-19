package com.ss.android.ugc.aweme.tools.extract;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.af;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f140186a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(91587);
    }

    public static af a(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        l.d(videoPublishEditModel, "");
        af.a aVar = new af.a();
        if (videoPublishEditModel.isMvThemeVideoType()) {
            aVar.a(ag.MV_THEME);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mStickerID)) {
            aVar.a(ag.RECORD_PROP);
        }
        ArrayList<EffectPointModel> arrayList = videoPublishEditModel.mEffectList;
        if (arrayList != null && (!arrayList.isEmpty())) {
            aVar.a(ag.EDIT_EFFECT);
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null || !(!list.isEmpty()))) {
            aVar.a(ag.EDIT_STICKER);
        }
        return aVar.a();
    }
}
