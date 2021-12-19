package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import f.a.v;
import f.a.w;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final b f116586a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116587b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f116588c;

    static {
        Covode.recordClassIndex(75320);
    }

    l(b bVar, String str, Aweme aweme) {
        this.f116586a = bVar;
        this.f116587b = str;
        this.f116588c = aweme;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        b bVar = this.f116586a;
        String str = this.f116587b;
        Aweme aweme = this.f116588c;
        FeedItemList c2 = bVar.c(str);
        if (c2 == null) {
            c2 = new FeedItemList();
        }
        if (c2.getItems() == null) {
            c2.items = new ArrayList(1);
        }
        c2.getItems().add(0, aweme);
        bVar.a(c2, str);
    }
}
