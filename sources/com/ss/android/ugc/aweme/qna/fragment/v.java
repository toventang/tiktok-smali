package com.ss.android.ugc.aweme.qna.fragment;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public enum v {
    Suggestions(R.id.eeo),
    Answers(R.id.l2),
    Questions(R.id.dgd);
    
    private final int rvId;

    public final int getRvId() {
        return this.rvId;
    }

    static {
        Covode.recordClassIndex(77645);
    }

    private v(int i2) {
        this.rvId = i2;
    }
}
