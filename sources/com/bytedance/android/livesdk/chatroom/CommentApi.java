package com.bytedance.android.livesdk.chatroom;

import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import java.util.HashMap;

public interface CommentApi {
    static {
        Covode.recordClassIndex(8241);
    }

    @t(a = "/webcast/screen_chat/")
    @g
    f.a.t<d<Barrage>> sendBarrage(@f HashMap<String, String> hashMap);

    @t(a = "/webcast/room/emote_chat/")
    @g
    f.a.t<d<com.bytedance.android.livesdk.chatroom.model.d>> sendEmote(@e(a = "room_id") long j2, @e(a = "emote_id_list") String str);

    @t(a = "/webcast/room/chat/")
    @g
    f.a.t<b<ChatResult, ChatExtra>> sendTextMessage(@f HashMap<String, String> hashMap);
}
