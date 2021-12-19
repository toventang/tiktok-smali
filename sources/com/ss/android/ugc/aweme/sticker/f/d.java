package com.ss.android.ugc.aweme.sticker.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(88149);
    }

    private static ToolsUrlModel a(UrlModel urlModel) {
        l.d(urlModel, "");
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.f138732a = urlModel.getUri();
        toolsUrlModel.f138733b = urlModel.getUrlList();
        return toolsUrlModel;
    }

    public static final IStickerService.FaceSticker a(Effect effect) {
        if (effect == null) {
            return null;
        }
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        faceSticker.id = effect.getId();
        faceSticker.stickerId = Long.parseLong(effect.getEffectId());
        faceSticker.fileUrl = a(effect.getFileUrl());
        faceSticker.iconUrl = a(effect.getIconUrl());
        faceSticker.localPath = effect.getUnzipPath();
        faceSticker.name = effect.getName();
        faceSticker.hint = effect.getHint();
        faceSticker.types = effect.getTypes();
        faceSticker.tags = effect.getTags();
        faceSticker.requirements = effect.getRequirements();
        faceSticker.sdkExtra = effect.getSdkExtra();
        faceSticker.extra = effect.getExtra();
        return faceSticker;
    }
}
