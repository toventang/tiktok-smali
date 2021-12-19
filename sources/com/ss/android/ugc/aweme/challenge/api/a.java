package com.ss.android.ugc.aweme.challenge.api;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class a implements IChallengeDetailService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69899a = new a();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ IChallengeDetailService f69900c;

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment a(Intent intent) {
        l.d(intent, "");
        return this.f69900c.a(intent);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final com.ss.android.ugc.aweme.common.e.a<Aweme, ?> a() {
        return this.f69900c.a();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void a(com.ss.android.ugc.aweme.common.e.a<Aweme, ?> aVar, List<? extends Aweme> list) {
        this.f69900c.a(aVar, list);
    }

    static {
        Covode.recordClassIndex(43104);
    }

    private a() {
        IChallengeDetailService b2 = ChallengeDetailServiceImpl.b();
        l.b(b2, "");
        this.f69900c = b2;
    }
}
