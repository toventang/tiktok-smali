package com.ss.android.ugc.aweme.challenge.api;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface IChallengeDetailService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69897b = a.f69898a;

    static {
        Covode.recordClassIndex(43102);
    }

    Fragment a(Intent intent);

    com.ss.android.ugc.aweme.common.e.a<Aweme, ?> a();

    void a(com.ss.android.ugc.aweme.common.e.a<Aweme, ?> aVar, List<? extends Aweme> list);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f69898a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(43103);
        }
    }
}
