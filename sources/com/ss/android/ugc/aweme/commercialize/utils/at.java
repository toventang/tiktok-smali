package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static final at f75615a = new at();

    private at() {
    }

    static {
        Covode.recordClassIndex(46641);
    }

    public static void a() {
        a(10000, "live_duration_10s");
        a(30000, "live_duration_30s");
        a(60000, "live_duration_60s");
    }

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f75616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f75617c;

        static {
            Covode.recordClassIndex(46642);
        }

        @Override // com.bytedance.android.livesdk.callback.b
        public final void a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                if (roomsData != null) {
                    hashMap = roomsData.f23333l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                if (roomsData2 != null && roomsData2.o) {
                    String str3 = this.f75616b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    l.b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("live_ad", str3, str, str4, "0").a("room_id", map.get("audience_live_play_room_id")).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, long j2, long j3) {
            super(j3);
            this.f75616b = str;
            this.f75617c = j2;
        }
    }

    private static void a(long j2, String str) {
        l.d(str, "");
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().a(b.a.AUDIENCE_LIVE_PLAY_DURATION, new a(str, j2, j2));
    }

    public static final void a(Context context, Aweme aweme, int i2) {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
        l.d(context, "");
        l.d(aweme, "");
        IAdSceneService f2 = AdSceneServiceImpl.f();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23298b.f23311c = aweme.getAid();
        EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
        User author = aweme.getAuthor();
        l.b(author, "");
        logData.f23309a = author.getRequestId();
        enterRoomConfig.f23299c.L = "feed";
        com.ss.android.ugc.aweme.commercialize.live.service.a.a(aweme, enterRoomConfig, i2);
        enterRoomConfig.f23299c.J = "feed";
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.i().a(context, aweme.getAuthor(), enterRoomConfig);
        a();
        if (f2 != null && (c2 = f2.c()) != null) {
            c2.a(aweme, context, i2);
        }
    }
}
