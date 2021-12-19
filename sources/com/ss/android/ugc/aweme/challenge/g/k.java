package com.ss.android.ugc.aweme.challenge.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class k implements Callable<Object> {

    /* renamed from: a  reason: collision with root package name */
    boolean f69986a;

    /* renamed from: b  reason: collision with root package name */
    public final f f69987b;

    /* renamed from: c  reason: collision with root package name */
    private final String f69988c;

    /* renamed from: d  reason: collision with root package name */
    private final String f69989d;

    static {
        Covode.recordClassIndex(43151);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f69987b.mIsLoading = false;
        if (!this.f69986a) {
            String str = this.f69988c;
            SearchSugChallengeList searchSugChallengeList = ChallengeApi.f69894g.searchSugChallenge(str, this.f69989d).get();
            searchSugChallengeList.setKeyword(str);
            if (!this.f69986a) {
                l.b(searchSugChallengeList, "");
                return searchSugChallengeList;
            }
            throw new j();
        }
        throw new j();
    }

    public k(f fVar, Object[] objArr) {
        l.d(fVar, "");
        l.d(objArr, "");
        this.f69987b = fVar;
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        this.f69988c = (String) obj;
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this.f69989d = (String) obj2;
    }
}
