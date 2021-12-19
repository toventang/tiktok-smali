package com.ss.android.ugc.aweme.comment.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;

public interface b {
    static {
        Covode.recordClassIndex(44616);
    }

    void a(int i2, int i3, String str, String str2, boolean z);

    void a(String str);

    void a(String str, int i2);

    void b(Exception exc, int i2, Comment comment);

    void b(String str);

    void e(Comment comment);

    void e(boolean z);

    void f(Comment comment);

    void f(boolean z);

    void g(Comment comment);

    Aweme m();

    Comment n();

    String o();

    void onEvent(a aVar);

    int p();

    boolean q();
}
