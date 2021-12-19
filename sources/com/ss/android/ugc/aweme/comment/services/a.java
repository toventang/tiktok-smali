package com.ss.android.ugc.aweme.comment.services;

import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface a extends s<ag> {
    static {
        Covode.recordClassIndex(44615);
    }

    void a(int i2);

    void a(Comment comment);

    void a(String str);

    void a(boolean z);

    void b(Comment comment);

    boolean b(String str);

    void c(Comment comment);

    void c(String str);

    Aweme h();

    String i();

    boolean j();

    i k();
}
