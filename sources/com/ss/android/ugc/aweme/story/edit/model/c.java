package com.ss.android.ugc.aweme.story.edit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, bq> f137591a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(90023);
    }

    public final bq a(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        bq bqVar = this.f137591a.get(storyEditClipModel.getClipId());
        if (bqVar != null) {
            return bqVar;
        }
        com.ss.android.ugc.aweme.story.edit.b.c cVar = new com.ss.android.ugc.aweme.story.edit.b.c(storyEditClipModel);
        this.f137591a.put(storyEditClipModel.getClipId(), cVar);
        return cVar;
    }
}
