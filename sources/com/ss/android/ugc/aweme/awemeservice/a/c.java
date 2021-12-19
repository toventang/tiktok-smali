package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class c implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Aweme> f67628a = new HashMap();

    static {
        Covode.recordClassIndex(41639);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final Collection<Aweme> a() {
        return this.f67628a.values();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final void b() {
        this.f67628a.clear();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final /* synthetic */ Aweme a(String str) {
        return this.f67628a.get(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final /* synthetic */ boolean b(String str) {
        return this.f67628a.containsKey(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // com.ss.android.ugc.aweme.awemeservice.a.b
    public final /* synthetic */ void a(String str, Aweme aweme) {
        this.f67628a.put(str, aweme);
    }
}
