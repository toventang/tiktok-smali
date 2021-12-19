package com.ss.android.ugc.aweme.comment.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;

public interface d {
    static {
        Covode.recordClassIndex(44154);
    }

    void a(Comment comment);

    void a(Comment comment, boolean z);

    void a(s<ag> sVar);

    void a(Exception exc, int i2, Comment comment);

    boolean a();

    boolean isAdded();
}
