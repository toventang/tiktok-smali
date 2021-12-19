package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface PollApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130307a = a.f130309b;

    static {
        Covode.recordClassIndex(85465);
    }

    @o(a = "/aweme/v1/vote/option/")
    @e
    t<PollResponse> poll(@c(a = "vote_id") long j2, @c(a = "option_id") long j3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final IRetrofitService f130308a = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f130309b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(85466);
        }
    }
}
