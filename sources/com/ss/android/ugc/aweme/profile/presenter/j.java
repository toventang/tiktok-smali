package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.x.m;
import f.a.v;
import f.a.w;

public final /* synthetic */ class j implements w {

    /* renamed from: a  reason: collision with root package name */
    private final b f116580a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116581b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f116582c;

    static {
        Covode.recordClassIndex(75318);
    }

    public j(b bVar, String str, Aweme aweme) {
        this.f116580a = bVar;
        this.f116581b = str;
        this.f116582c = aweme;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        b bVar = this.f116580a;
        String str = this.f116581b;
        Aweme aweme = this.f116582c;
        FeedItemList c2 = bVar.c(str);
        if (c2 != null && c2.getItems() != null) {
            m.a(c2.getItems(), aweme, null);
            bVar.a(c2, str);
        }
    }
}
