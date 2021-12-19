package com.ss.android.ugc.aweme.shortvideo.edit.videolength;

import android.app.Activity;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.preview.a;
import com.ss.android.ugc.gamora.editor.rootscene.d;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;

public interface IVideoLengthChecker {
    static {
        Covode.recordClassIndex(83915);
    }

    void a(Activity activity, VideoPublishEditModel videoPublishEditModel);

    void a(Activity activity, VideoPublishEditModel videoPublishEditModel, d dVar);

    void a(VideoPublishEditModel videoPublishEditModel, a aVar, m mVar, EditToolbarViewModel editToolbarViewModel);

    void a(a aVar, m mVar, FTCEditToolbarViewModel fTCEditToolbarViewModel);
}
