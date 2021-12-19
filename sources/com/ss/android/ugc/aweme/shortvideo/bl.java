package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class bl {
    static {
        Covode.recordClassIndex(82147);
    }

    public static final b a(Object obj) {
        b bVar = new b();
        l.b(bVar, "");
        return a(bVar, obj);
    }

    public static final ar b(Object obj) {
        ar arVar = new ar();
        l.b(arVar, "");
        return a(arVar, obj);
    }

    public static final b a(b bVar, Object obj) {
        String str;
        int i2;
        l.d(bVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isStoryEditMode) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            bVar.a("shoot_page", str);
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bVar.a("is_story", i2);
            TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            if (tTStoryUploadModel != null) {
                bVar.a("clip_index", tTStoryUploadModel.getIndex());
                bVar.a("clips_cnt", tTStoryUploadModel.getTotalCount());
            }
        }
        return bVar;
    }

    private static ar a(ar arVar, Object obj) {
        String str;
        int i2;
        l.d(arVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isStoryEditMode) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            arVar.a("shoot_page", str);
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            arVar.a("is_story", Integer.valueOf(i2));
            TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            if (tTStoryUploadModel != null) {
                arVar.a("clip_index", Integer.valueOf(tTStoryUploadModel.getIndex()));
                arVar.a("clips_cnt", Integer.valueOf(tTStoryUploadModel.getTotalCount()));
            }
        }
        return arVar;
    }
}
