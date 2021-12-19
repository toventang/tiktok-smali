package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lightening.a;
import h.f.b.l;

public final class r {
    static {
        Covode.recordClassIndex(86416);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        c queryDraft;
        LighteningExtraInfo lighteningExtraInfo;
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mIsFromDraft && a.c() && (queryDraft = com.ss.android.ugc.aweme.tools.draft.j.c.a().queryDraft(videoPublishEditModel.getDraftPrimaryKey())) != null && queryDraft.t() && (lighteningExtraInfo = queryDraft.W.bp) != null) {
            String scheduleId = lighteningExtraInfo.getScheduleId();
            if (!TextUtils.isEmpty(scheduleId)) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getStoryService().a(scheduleId);
            }
        }
    }
}
