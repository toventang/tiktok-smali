package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public final class b {
    @c(a = "ch_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Challenge> f90599a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f90600b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f90601c;

    static {
        Covode.recordClassIndex(56913);
    }

    public final boolean a() {
        if (this.f90601c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f90601c = z ? 1 : 0;
    }
}
