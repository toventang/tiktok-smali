package com.ss.android.ugc.aweme.commercialize.live.service;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.d;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.e;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.g;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.i;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.c;
import d.a.e.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class CommercializeLiveServiceImpl implements ICommercializeLiveService {
    static {
        Covode.recordClassIndex(46064);
    }

    private static int a(int i2) {
        if (i2 == 1) {
            return 5;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 7;
        }
        if (i2 == 8) {
            return 6;
        }
        if (i2 == 14) {
            return 9;
        }
        if (i2 == 11) {
            return 8;
        }
        if (i2 == 12) {
            return 10;
        }
        if (i2 == 42) {
            return 11;
        }
        if (i2 != 43) {
            switch (i2) {
                case 50:
                    return 3;
                case 51:
                    return 4;
                case 52:
                    break;
                default:
                    return 0;
            }
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        try {
            String string = jSONObject.getString("eventName");
            if (l.a((Object) string, (Object) i.LIVE_LINK_PIN.getValue())) {
                c.a(new e((g) new f().a(jSONObject2.toString(), g.class), null));
            } else if (l.a((Object) string, (Object) i.LIVE_LINK_CARD.getValue())) {
                c.a(new e(null, (com.ss.android.ugc.aweme.commercialize.live.business.links.f.f) new f().a(jSONObject2.toString(), com.ss.android.ugc.aweme.commercialize.live.business.links.f.f.class)));
            }
        } catch (Exception unused) {
            b.a("Broadcast JSB", "Gson parse error", null);
        }
    }

    public static ICommercializeLiveService a() {
        MethodCollector.i(11553);
        Object a2 = com.ss.android.ugc.b.a(ICommercializeLiveService.class, false);
        if (a2 != null) {
            ICommercializeLiveService iCommercializeLiveService = (ICommercializeLiveService) a2;
            MethodCollector.o(11553);
            return iCommercializeLiveService;
        }
        if (com.ss.android.ugc.b.aq == null) {
            synchronized (ICommercializeLiveService.class) {
                try {
                    if (com.ss.android.ugc.b.aq == null) {
                        com.ss.android.ugc.b.aq = new CommercializeLiveServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11553);
                    throw th;
                }
            }
        }
        CommercializeLiveServiceImpl commercializeLiveServiceImpl = (CommercializeLiveServiceImpl) com.ss.android.ugc.b.aq;
        MethodCollector.o(11553);
        return commercializeLiveServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final a a(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        return new FeedLiveAdLynxCard(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getComponentType() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        if (aweme.isLive()) {
            return "full_screen_feed_live";
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme)) {
            return "top_live";
        }
        if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isLive()) {
                return "feed_live";
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final com.ss.android.ugc.aweme.commercialize.live.business.links.d.a a(d dVar, h.f.a.b<? super Bundle, z> bVar) {
        l.d(dVar, "");
        return com.ss.android.ugc.aweme.commercialize.live.business.links.e.a.a(dVar, bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final com.ss.android.ugc.aweme.commercialize.live.a.a a(AwemeRawAd awemeRawAd, String str) {
        l.d(awemeRawAd, "");
        l.d(str, "");
        HashMap hashMap = new HashMap();
        String creativeIdStr = awemeRawAd.getCreativeIdStr();
        if (creativeIdStr != null) {
            hashMap.put("value", creativeIdStr);
        }
        String logExtra = awemeRawAd.getLogExtra();
        if (logExtra != null) {
            hashMap.put("log_extra", logExtra);
        }
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            hashMap.put("group_id", String.valueOf(groupId.longValue()));
        }
        hashMap.put("traffic_from_position", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("traffic_from_position", str);
        return new com.ss.android.ugc.aweme.commercialize.live.a.a(String.valueOf(awemeRawAd.getLiveAdType()), hashMap, hashMap2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        Object a2 = RetrofitFactory.a().b(LiveAdCardApi.a.f74544a).d().a(LiveAdCardApi.class);
        l.b(a2, "");
        return ((LiveAdCardApi) a2).getLiveAdCardInfo(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i2) {
        String str;
        Long groupId;
        String logExtra;
        String creativeIdStr;
        l.d(aweme, "");
        l.d(enterRoomConfig, "");
        enterRoomConfig.f23299c.o = true;
        enterRoomConfig.f23299c.p = aweme.getAid();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (str = String.valueOf(awemeRawAd.getLiveAdType())) == null) {
            str = "0";
        }
        roomsData.n = str;
        HashMap<String, String> hashMap = new HashMap<>();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (creativeIdStr = awemeRawAd2.getCreativeIdStr()) == null)) {
            hashMap.put("value", creativeIdStr);
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (!(awemeRawAd3 == null || (logExtra = awemeRawAd3.getLogExtra()) == null)) {
            hashMap.put("log_extra", logExtra);
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (!(awemeRawAd4 == null || (groupId = awemeRawAd4.getGroupId()) == null)) {
            hashMap.put("group_id", String.valueOf(groupId.longValue()));
        }
        hashMap.put("traffic_from_position", String.valueOf(a(i2)));
        enterRoomConfig.f23299c.f23333l = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("traffic_from_position", String.valueOf(a(i2)));
        enterRoomConfig.f23299c.f23334m = hashMap2;
    }
}
