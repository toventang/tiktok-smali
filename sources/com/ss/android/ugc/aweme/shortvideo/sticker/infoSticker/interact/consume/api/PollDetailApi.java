package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import f.a.t;
import l.b.f;

public interface PollDetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130310a = a.f130311a;

    static {
        Covode.recordClassIndex(85467);
    }

    @f(a = "/aweme/v1/vote/option/userlist/")
    t<PollDetailResponse> getPollDetail(@l.b.t(a = "vote_id") long j2, @l.b.t(a = "option_id") long j3, @l.b.t(a = "offset") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f130311a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(85468);
        }
    }
}
