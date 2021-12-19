package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public enum AVPublishContentType {
    Video("video"),
    PhotoMovie("video"),
    Photo(UGCMonitor.TYPE_PHOTO);
    
    private final String contentType;

    public final String getContentType() {
        return this.contentType;
    }

    static {
        Covode.recordClassIndex(79756);
    }

    private AVPublishContentType(String str) {
        this.contentType = str;
    }
}
