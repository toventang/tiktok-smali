package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "comment_list")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Comment> f90602a;
    @com.google.gson.a.c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f90603b;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f90604c;
    @com.google.gson.a.c(a = "invalid_count")

    /* renamed from: d  reason: collision with root package name */
    public int f90605d;

    static {
        Covode.recordClassIndex(56914);
    }

    public final boolean a() {
        if (this.f90604c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f90604c = z ? 1 : 0;
    }
}
