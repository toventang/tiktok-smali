package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface FavoriteAwemeService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100793a = a.f100794a;

    static {
        Covode.recordClassIndex(64488);
    }

    @f(a = "/aweme/v1/aweme/favorite/")
    ab<FeedItemList> getFavoriteAweme(@t(a = "count") int i2, @t(a = "user_id") String str, @t(a = "sec_user_id") String str2, @t(a = "max_cursor") long j2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f100794a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(64489);
        }
    }
}
