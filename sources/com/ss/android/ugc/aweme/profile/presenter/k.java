package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.x.m;
import f.a.v;
import f.a.w;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements w {

    /* renamed from: a  reason: collision with root package name */
    private final b f116583a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116584b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection f116585c;

    static {
        Covode.recordClassIndex(75319);
    }

    k(b bVar, String str, Collection collection) {
        this.f116583a = bVar;
        this.f116584b = str;
        this.f116585c = collection;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        b bVar = this.f116583a;
        String str = this.f116584b;
        Collection<Aweme> collection = this.f116585c;
        FeedItemList c2 = bVar.c(str);
        if (!(c2 == null || c2.getItems() == null)) {
            for (Aweme aweme : collection) {
                m.a(c2.getItems(), aweme, null);
            }
            bVar.a(c2, str);
        }
    }
}
