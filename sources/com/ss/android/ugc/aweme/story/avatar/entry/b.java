package com.ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends a<Aweme, Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f136806a;

    /* renamed from: b  reason: collision with root package name */
    private List<Aweme> f136807b;

    static {
        Covode.recordClassIndex(89385);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        return this.f136807b;
    }

    public b(Aweme aweme) {
        l.d(aweme, "");
        this.f136806a = aweme;
        this.f136807b = n.c(aweme);
    }
}
