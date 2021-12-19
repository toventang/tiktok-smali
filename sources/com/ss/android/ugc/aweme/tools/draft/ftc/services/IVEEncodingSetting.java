package com.ss.android.ugc.aweme.tools.draft.ftc.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public interface IVEEncodingSetting {
    static {
        Covode.recordClassIndex(91302);
    }

    VEVideoEncodeSettings a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, g gVar, String str);
}
