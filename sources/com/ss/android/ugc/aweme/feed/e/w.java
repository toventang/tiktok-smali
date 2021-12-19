package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.model.n;
import f.a.v;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements f.a.w {

    /* renamed from: a  reason: collision with root package name */
    private final o f92993a;

    /* renamed from: b  reason: collision with root package name */
    private final n f92994b;

    /* renamed from: c  reason: collision with root package name */
    private final int f92995c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f92996d;

    static {
        Covode.recordClassIndex(58990);
    }

    w(o oVar, n nVar, int i2, Aweme aweme) {
        this.f92993a = oVar;
        this.f92994b = nVar;
        this.f92995c = i2;
        this.f92996d = aweme;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        o oVar = this.f92993a;
        n nVar = this.f92994b;
        oVar.a(nVar.f148789a, this.f92995c, this.f92996d);
    }
}
