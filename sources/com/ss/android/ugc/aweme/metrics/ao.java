package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.c;

public final class ao extends h<ao> {

    /* renamed from: a  reason: collision with root package name */
    protected String f109507a;

    /* renamed from: b  reason: collision with root package name */
    public String f109508b;

    /* renamed from: c  reason: collision with root package name */
    public String f109509c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f109510d;

    /* renamed from: e  reason: collision with root package name */
    public int f109511e;
    private int p;

    static {
        Covode.recordClassIndex(70110);
    }

    public ao() {
        super("video_pause");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        a("author_id", ac.a(this.f109510d), c.a.f109562a);
        a("group_id", this.f109508b, c.a.f109563b);
        h(this.f109509c);
        a("enter_from", this.f109507a, c.a.f109562a);
        if (this.p != 0) {
            a("is_long_item", new StringBuilder().append(this.p).toString(), c.a.f109562a);
        }
        a("is_long", this.f109511e);
    }

    public final ao a(String str) {
        this.f109507a = str;
        return this;
    }
}
