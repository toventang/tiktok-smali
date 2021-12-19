package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.t;
import com.kakao.usermgmt.StringSet;

public class Game {
    @c(a = "game_id")
    public long gameId;
    @c(a = "icon")
    public ImageModel icon;
    @c(a = StringSet.name)
    public String name;

    static {
        Covode.recordClassIndex(3723);
    }

    public String toJsonString() {
        if (e.f14000d != null) {
            return e.f14000d.b(this);
        }
        return e.a.f9628b.b(this);
    }

    public static Game fromJson(String str) {
        try {
            if (com.bytedance.android.livesdk.ao.e.f14000d != null) {
                return (Game) com.bytedance.android.livesdk.ao.e.f14000d.a(str, Game.class);
            }
            return (Game) e.a.f9628b.a(str, Game.class);
        } catch (t unused) {
            return null;
        }
    }
}
