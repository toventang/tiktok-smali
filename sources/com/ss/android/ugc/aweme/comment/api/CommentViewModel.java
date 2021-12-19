package com.ss.android.ugc.aweme.comment.api;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;

public abstract class CommentViewModel extends ac {
    static {
        Covode.recordClassIndex(43973);
    }

    public abstract LiveData<Boolean> a();
}
