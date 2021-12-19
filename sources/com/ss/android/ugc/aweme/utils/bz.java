package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class bz {
    static {
        Covode.recordClassIndex(93375);
    }

    public static final void a(c cVar) {
        l.d(cVar, "");
        ca.b(cVar.f(), false);
    }

    public static final void b(c cVar) {
        l.d(cVar, "");
        ca.b(cVar.f());
    }

    public static final void c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        ca.b(videoPublishEditModel.creationId, true);
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return ca.a(videoPublishEditModel.creationId);
    }

    public static final boolean a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        if (!shortVideoContext.O || !shortVideoContext.R) {
            return false;
        }
        return true;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicPath) || !videoPublishEditModel.mIsFromDraft || !videoPublishEditModel.isDraftMusicIllegal) {
            return false;
        }
        return true;
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        l.d(videoPublishEditModel, "");
        ca.a(videoPublishEditModel.creationId, z);
    }
}
