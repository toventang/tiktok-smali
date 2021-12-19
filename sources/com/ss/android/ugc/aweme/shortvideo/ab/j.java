package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.ss.android.ugc.aweme.draft.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.i;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class j {
    static {
        Covode.recordClassIndex(82033);
    }

    public static final void b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.containBackgroundVideo) {
            l.d(videoPublishEditModel, "");
            e.a(dj.f126465h, c.a(videoPublishEditModel), true);
            e.e(dj.f126465h);
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.hasInfoStickers()) {
            String str = videoPublishEditModel.infoStickerModel.infoStickerDraftDir;
            List<StickerItemModel> list = videoPublishEditModel.infoStickerModel.stickers;
            l.b(list, "");
            for (T t : list) {
                String str2 = str + File.separator + new File(t.path).getName();
                l.b(t, "");
                if (!com.ss.android.ugc.aweme.editSticker.model.c.a(t)) {
                    e.c(t.path, str2);
                } else if (!e.b(str2)) {
                    e.b(t.path, str2 + File.separator);
                }
            }
        }
    }

    public static final void a(com.ss.android.ugc.aweme.draft.model.c cVar, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        String str3;
        String str4;
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        CanvasVideoData canvasVideoData = cVar.W.bo;
        if (canvasVideoData != null) {
            PhotoCanvasBackground background = canvasVideoData.getBackground();
            List list = null;
            if (background != null) {
                str = background.getFilePath();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                String str5 = (dj.f126463f + "canvas/" + cVar.f()) + '/' + new File(str).getName();
                if (!i.a(str5)) {
                    g.b(str, str5);
                }
                PhotoCanvasBackground background2 = canvasVideoData.getBackground();
                if (background2 == null) {
                    l.b();
                }
                PhotoCanvasBackground photoCanvasBackground = new PhotoCanvasBackground(background2.getType());
                photoCanvasBackground.setFilePath(background2.getFilePath());
                photoCanvasBackground.setStartColor(background2.getStartColor());
                photoCanvasBackground.setEndColor(background2.getEndColor());
                CanvasVideoData copy$default = CanvasVideoData.copy$default(canvasVideoData, null, null, photoCanvasBackground, null, 11, null);
                List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData.getTransformInfo();
                if (transformInfo != null) {
                    Iterator<T> it = transformInfo.iterator();
                    while (it.hasNext()) {
                        copy$default.putTransform(it.next());
                    }
                }
                cVar.W.bo = copy$default;
            }
            List<String> sourceInfo = canvasVideoData.getSourceInfo();
            if (sourceInfo != null) {
                str2 = sourceInfo.get(0);
            } else {
                str2 = null;
            }
            List<String> auditFrames = canvasVideoData.getAuditFrames();
            if (auditFrames != null) {
                str3 = (String) n.b((List) auditFrames, 0);
            } else {
                str3 = null;
            }
            if (str2 != null && str2.length() > 0) {
                String str6 = dj.f126463f + "canvas/" + cVar.f();
                String str7 = str6 + '/' + new File(str2).getName();
                if (str3 != null) {
                    str4 = str6 + '/' + new File(str3).getName();
                } else {
                    str4 = null;
                }
                if (!i.a(str7)) {
                    g.b(str2, str7);
                }
                if (str4 != null && !i.a(str4)) {
                    g.b(str3, str4);
                }
                List a2 = n.a(str7);
                if (str4 != null) {
                    list = n.a(str4);
                }
                CanvasVideoData copy$default2 = CanvasVideoData.copy$default(canvasVideoData, a2, list, null, null, 12, null);
                List<PhotoCanvasTransformFilterParam> transformInfo2 = canvasVideoData.getTransformInfo();
                if (transformInfo2 != null) {
                    Iterator<T> it2 = transformInfo2.iterator();
                    while (it2.hasNext()) {
                        copy$default2.putTransform(it2.next());
                    }
                }
                cVar.W.bo = copy$default2;
            }
        }
    }
}
