package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.infoSticker.a;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;

final /* synthetic */ class ai implements a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishEditModel f126738a;

    static {
        Covode.recordClassIndex(83145);
    }

    ai(VideoPublishEditModel videoPublishEditModel) {
        this.f126738a = videoPublishEditModel;
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.a
    public final void a(AVChallenge aVChallenge) {
        VideoPublishEditModel videoPublishEditModel = this.f126738a;
        if (aVChallenge != null) {
            if (videoPublishEditModel.challenges == null) {
                videoPublishEditModel.challenges = new ArrayList();
            }
            videoPublishEditModel.challenges.add(aVChallenge);
        }
    }
}
