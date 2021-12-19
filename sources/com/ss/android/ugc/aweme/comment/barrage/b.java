package com.ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

public class b implements Serializable {
    public String authorUid;
    public Aweme aweme;
    public String awemeId;
    public String enterFrom;
    public String eventType;
    public String mPlayListId;
    public String mPlayListIdKey;
    public String mPlayListType;
    public int pageType;
    public String requestId;
    public String tabName;

    static {
        Covode.recordClassIndex(44023);
    }
}
