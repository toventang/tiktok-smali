package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.f;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.gamora.editor.sticker.read.g;

public final class ck {
    static {
        Covode.recordClassIndex(82189);
    }

    static final /* synthetic */ i a(Context context) {
        try {
            f.enqueueWork(context, OriginalSoundUploadService.class, 3008, new Intent());
            return null;
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return null;
        }
    }

    static void a(VideoPublishEditModel videoPublishEditModel) {
        TextStickerData textStickerData;
        if (g.a() && videoPublishEditModel != null && videoPublishEditModel.infoStickerModel != null && videoPublishEditModel.infoStickerModel.stickers != null && !videoPublishEditModel.infoStickerModel.stickers.isEmpty()) {
            try {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (stickerItemModel.isTextSticker() && (textStickerData = (TextStickerData) com.ss.android.ugc.aweme.port.in.g.a().G().a(stickerItemModel.extra, TextStickerData.class)) != null) {
                        for (String str : textStickerData.getAudioPathList()) {
                            e.c(str);
                        }
                    }
                }
            } catch (Throwable th) {
                a.a("removeAudioFile failed: " + th.getMessage());
            }
        }
    }
}
