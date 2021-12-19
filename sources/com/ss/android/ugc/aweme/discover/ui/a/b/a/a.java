package com.ss.android.ugc.aweme.discover.ui.a.b.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "search_type")

    /* renamed from: a  reason: collision with root package name */
    public String f82215a;
    @c(a = "filter_option")

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.c f82216b;
    @c(a = "sort_option")

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.c f82217c;
    @c(a = "activity_option")

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.a f82218d;

    static {
        Covode.recordClassIndex(51168);
    }

    public final boolean a() {
        com.ss.android.ugc.aweme.search.g.c cVar = this.f82216b;
        if (cVar != null && !cVar.isEmpty()) {
            return false;
        }
        com.ss.android.ugc.aweme.search.g.c cVar2 = this.f82217c;
        if (cVar2 != null && !cVar2.isEmpty()) {
            return false;
        }
        com.ss.android.ugc.aweme.search.g.a aVar = this.f82218d;
        if (aVar == null || aVar.isEmpty()) {
            return true;
        }
        return false;
    }
}
