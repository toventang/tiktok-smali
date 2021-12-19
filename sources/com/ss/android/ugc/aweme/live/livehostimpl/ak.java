package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.b;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.Arrays;

public final class ak {
    static {
        Covode.recordClassIndex(69502);
    }

    public static IStickerService.FaceSticker a(a aVar) {
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        if (aVar != null) {
            faceSticker.stickerId = aVar.f22995a;
            faceSticker.name = aVar.f22999e;
            b bVar = aVar.f22998d;
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            if (bVar != null) {
                toolsUrlModel.f138732a = bVar.f7375a;
                toolsUrlModel.f138733b = bVar.f7376b;
            }
            faceSticker.iconUrl = toolsUrlModel;
            faceSticker.hint = aVar.f23000f;
            faceSticker.localPath = aVar.f23001g;
            faceSticker.types = aVar.f23004j;
            faceSticker.extra = aVar.A;
            faceSticker.hint = aVar.f23000f;
            faceSticker.tags = aVar.f23003i;
        }
        return faceSticker;
    }

    public static a a(IStickerService.FaceSticker faceSticker) {
        a aVar = new a();
        if (faceSticker != null) {
            aVar.f22995a = faceSticker.stickerId;
            aVar.b(String.valueOf(faceSticker.stickerId));
            aVar.f22999e = faceSticker.name;
            ToolsUrlModel toolsUrlModel = faceSticker.iconUrl;
            b bVar = new b();
            if (toolsUrlModel != null) {
                bVar.f7375a = toolsUrlModel.f138732a;
                bVar.f7376b = toolsUrlModel.f138733b;
            }
            aVar.f22998d = bVar;
            aVar.f23000f = faceSticker.hint;
            aVar.c(faceSticker.localPath);
            aVar.f23003i = faceSticker.tags;
            aVar.f23004j = faceSticker.types;
            aVar.A = faceSticker.extra;
            aVar.a(String.valueOf(faceSticker.stickerId));
            aVar.w = faceSticker.isVideoUsedSticker;
            try {
                o j2 = q.a(faceSticker.extra).j();
                if (!j2.b("gift_sticker") || !j2.c("gift_sticker").h()) {
                    aVar.r.addAll(Arrays.asList(1, 2));
                }
                if (j2.b("Review_original_frame")) {
                    aVar.u = j2.c("Review_original_frame").h();
                }
            } catch (Throwable unused) {
                aVar.r.addAll(Arrays.asList(1, 2));
            }
        }
        return aVar;
    }
}
