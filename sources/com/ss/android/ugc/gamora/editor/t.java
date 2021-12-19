package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.tools.utils.k;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class t {
    static {
        Covode.recordClassIndex(96797);
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        c cVar = cr.a().f125295a;
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode && !bz.a(videoPublishEditModel)) {
            return true;
        }
        if ((!videoPublishEditModel.mIsFromDraft && es.k(videoPublishEditModel)) || (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.editMusicSyncMode)) {
            return true;
        }
        if ((videoPublishEditModel.recordMode != 1 || videoPublishEditModel.mIsFromDraft) && cVar != null) {
            return true;
        }
        return false;
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        List<String> list;
        List list2;
        l.d(videoPublishEditModel, "");
        String a2 = com.ss.android.ugc.aweme.ba.c.a(cr.a().f125295a);
        l.b(a2, "");
        d dVar = videoPublishEditModel.mvCreateVideoData;
        if (dVar != null) {
            list = dVar.musicIds;
        } else {
            list = null;
        }
        if (k.a(list)) {
            return false;
        }
        d dVar2 = videoPublishEditModel.mvCreateVideoData;
        if (dVar2 == null || (list2 = dVar2.musicIds) == null) {
            list2 = z.INSTANCE;
        }
        if (list2.contains(a2)) {
            return true;
        }
        return false;
    }
}
