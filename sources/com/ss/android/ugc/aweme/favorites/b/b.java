package com.ss.android.ugc.aweme.favorites.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.sticker.model.g;
import java.util.List;

public final class b {
    @c(a = "sticker_list")

    /* renamed from: a  reason: collision with root package name */
    public List<g> f90475a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f90476b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f90477c;

    static {
        Covode.recordClassIndex(56792);
    }

    public final boolean a() {
        if (this.f90477c == 1) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.f90477c = z ? 1 : 0;
    }
}
