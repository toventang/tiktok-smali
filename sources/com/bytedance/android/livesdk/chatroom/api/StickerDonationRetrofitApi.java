package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.livesdkapi.depend.model.live.o;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import f.a.t;
import java.util.Map;

public interface StickerDonationRetrofitApi {
    static {
        Covode.recordClassIndex(8282);
    }

    @h
    t<o> fetchStickerDonation(@ag String str, @aa Map<String, String> map);
}
