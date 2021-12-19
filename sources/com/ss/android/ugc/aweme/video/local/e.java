package com.ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

public class e extends VideoUrlModel {
    @c(a = "author_id")
    String authorId;
    @c(a = "local_path")
    String localPath;

    static {
        Covode.recordClassIndex(93883);
    }

    public e() {
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public e(String str) {
        setSourceId(str);
    }
}
