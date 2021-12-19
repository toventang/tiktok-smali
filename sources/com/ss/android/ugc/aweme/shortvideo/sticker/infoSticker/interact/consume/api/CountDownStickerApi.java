package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface CountDownStickerApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130304a = a.f130306b;

    static {
        Covode.recordClassIndex(85463);
    }

    @f(a = "tiktok/v1/sticker/countdown/detail/")
    t<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a> getDetail(@l.b.t(a = "item_id") String str);

    @o(a = "tiktok/v1/sticker/countdown/reminder/")
    @e
    t<b> subscribe(@c(a = "item_id") String str, @c(a = "countdown_time") long j2, @c(a = "action") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final IRetrofitFactory f130305a = RetrofitFactory.a();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f130306b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(85464);
        }
    }
}
