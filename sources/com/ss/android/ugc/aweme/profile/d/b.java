package com.ss.android.ugc.aweme.profile.d;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class b {
    static {
        Covode.recordClassIndex(74873);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f116063a;

        static {
            Covode.recordClassIndex(74874);
        }

        public a(Aweme aweme) {
            this.f116063a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            String authorUid = this.f116063a.getAuthorUid();
            User author = this.f116063a.getAuthor();
            l.b(author, "");
            FeedItemList a2 = AwemeApi.a(true, authorUid, author.getSecUid(), 0, 0, 20, "profile_preload", 0, 0, null, new e());
            if (this.f116063a.getAuthorUid() != null) {
                String authorUid2 = this.f116063a.getAuthorUid();
                com.ss.android.ugc.aweme.account.b.a();
                IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                l.b(e2, "");
                if (TextUtils.equals(authorUid2, e2.getCurUserId())) {
                    i2 = 1000;
                    com.ss.android.ugc.aweme.profile.presenter.b.a(a2, true, 0, i2);
                    return z.f158842a;
                }
            }
            i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            com.ss.android.ugc.aweme.profile.presenter.b.a(a2, true, 0, i2);
            return z.f158842a;
        }
    }
}
