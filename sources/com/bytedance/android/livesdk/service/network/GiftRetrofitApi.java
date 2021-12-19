package com.bytedance.android.livesdk.service.network;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.android.livesdk.service.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface GiftRetrofitApi {
    static {
        Covode.recordClassIndex(12620);
    }

    @h(a = "/webcast/wishlist/get/")
    t<d<x>> getWishList(@z(a = "anchor_id") long j2, @z(a = "room_id") long j3);

    @g
    @a(a = a.EnumC0254a.GIFT)
    @com.bytedance.retrofit2.b.t(a = "/webcast/gift/send/")
    t<d<w>> send(@e(a = "gift_id") long j2, @z(a = "room_id") long j3, @e(a = "to_user_id") long j4, @e(a = "count") int i2);

    @g
    @a(a = a.EnumC0254a.GIFT)
    @com.bytedance.retrofit2.b.t(a = "/webcast/gift/send/")
    t<d<w>> sendAddType(@e(a = "gift_id") long j2, @z(a = "room_id") long j3, @e(a = "to_user_id") long j4, @e(a = "count") int i2, @e(a = "send_scene") int i3, @e(a = "send_type") int i4, @e(a = "enter_from") String str, @e(a = "send_gift_req_start_ms") long j5, @e(a = "ug_exchange") int i5);

    @h(a = "/webcast/gift/list/")
    @a(a = a.EnumC0254a.GIFT)
    t<b<j, c>> syncGiftList(@z(a = "room_id") String str, @z(a = "fetch_giftlist_from") int i2);
}
