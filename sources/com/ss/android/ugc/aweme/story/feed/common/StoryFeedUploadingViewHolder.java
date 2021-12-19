package com.ss.android.ugc.aweme.story.feed.common;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.publish.f;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class StoryFeedUploadingViewHolder extends StoryVideoViewHolder implements j {
    static {
        Covode.recordClassIndex(90031);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryFeedUploadingViewHolder(cf cfVar) {
        super(cfVar);
        l.d(cfVar, "");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Video video) {
        String scheduleId;
        super.a(video);
        Aweme aweme = this.f91515j;
        if (aweme != null && (scheduleId = aweme.getScheduleId()) != null) {
            l.d(scheduleId, "");
            Bitmap bitmap = f.f138117g.get(scheduleId);
            if (bitmap != null) {
                this.s.setImageBitmap(bitmap);
            }
        }
    }
}
