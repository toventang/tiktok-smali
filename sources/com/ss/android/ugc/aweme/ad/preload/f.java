package com.ss.android.ugc.aweme.ad.preload;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.preload.i;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<String, h> f66129a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final f f66130b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f66131c = i.a((h.f.a.a) c.f66134a);

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, g> f66132d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static final f.a.l.b<i> f66133e;

    private static List<String> d() {
        return (List) f66131c.getValue();
    }

    public static final class a extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(40650);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(40651);
        }

        b() {
        }
    }

    private f() {
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(List<? extends Aweme> list) {
        if (list != null && !list.isEmpty()) {
            b.i.b(new e(list), b.i.f4824a);
            l.b(b.a.f65586a, "");
            d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
            if (c2 != null) {
                c2.a(list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(Integer num, long j2, String str, String str2, ag agVar) {
        List<String> geckoChannel;
        String str3 = null;
        if (num != null) {
            if (num.intValue() == 4) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                if (f2 != null) {
                    str3 = f2.g("splash");
                }
                a(str, str3, "splash");
                if (str != null) {
                    f66129a.put(str, new h(j2, str2, 4));
                }
                IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
                if (f3 != null) {
                    f3.a(Long.valueOf(j2), str);
                }
            } else if (num.intValue() == 9 && agVar != null && (geckoChannel = agVar.getGeckoChannel()) != null) {
                for (T t : geckoChannel) {
                    IAdLandPagePreloadService f4 = AdLandPagePreloadServiceImpl.f();
                    a((String) t, f4 != null ? f4.g("lynx_feed") : null, "lynx_feed");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(List<? extends Pair<String, Long>> list, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<? extends Pair<String, Long>> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                h hVar = f66129a.get(pair.first);
                if (hVar != null) {
                    HashMap hashMap = new HashMap();
                    Object obj = pair.first;
                    l.b(obj, "");
                    hashMap.put("channel_name", obj);
                    if (AdLandPagePreloadServiceImpl.f() != null) {
                        Object obj2 = pair.first;
                        hashMap.put("landing_type", 2);
                    }
                    Object obj3 = pair.second;
                    l.b(obj3, "");
                    long longValue = ((Number) obj3).longValue();
                    if (z) {
                        i2 = 1;
                    } else if (longValue != 0) {
                        i2 = 2;
                    }
                    hashMap.put("response_status", Integer.valueOf(i2));
                    Object obj4 = pair.first;
                    hashMap.get("response_status");
                    a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                    a2.f74716b = "ad_landing_channel_query";
                    a2.f74715a = "ad_wap_stat";
                    a2.a(Long.valueOf(hVar.f66142c)).c(hVar.f66143d).a(hashMap).b().c();
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "ad_landing_channel_query", String.valueOf(hVar.f66142c), hVar.f66143d, null).b("ad_event_type", "debug").a(hashMap).c();
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(String str, boolean z) {
        if (str != null) {
            if (d().contains(str)) {
                h hVar = new h(0, (String) null, 7);
                hVar.f66140a = System.currentTimeMillis();
                f66129a.put(str, hVar);
                HashMap hashMap = new HashMap();
                hVar.f66141b = z;
                hashMap.put("is_diff", Integer.valueOf(hVar.f66141b));
                hashMap.put("channel", str);
                a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a2.f74715a = "draw_ad";
                a2.f74716b = "download_start";
                a2.a("card_common").a(hashMap).b().c();
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_start", "0", null, null).b("ad_event_type", "debug").b("refer", "card_common").a(hashMap).c();
                return;
            }
            h hVar2 = f66129a.get(str);
            if (hVar2 != null) {
                hVar2.f66140a = System.currentTimeMillis();
                HashMap hashMap2 = new HashMap();
                hVar2.f66141b = z ? 1 : 0;
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f66141b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                a.b a3 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a3.f74716b = "ad_landing_channel_download_start";
                a3.f74715a = "ad_wap_stat";
                a3.a(Long.valueOf(hVar2.f66142c)).c(hVar2.f66143d).a(hashMap2).b().c();
                com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "ad_landing_channel_download_start", String.valueOf(hVar2.f66142c), hVar2.f66143d, null).b("ad_event_type", "debug").a(hashMap2).c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(String str) {
        if (str != null && d().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 1);
            hashMap.put("channel", str);
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
            a2.f74715a = "draw_ad";
            a2.f74716b = "active_finish";
            a2.a("card_common").a(hashMap).b().c();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "active_finish", "0", null, null).b("ad_event_type", "debug").b("refer", "card_common").a(hashMap).c();
            f66129a.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(String str, Throwable th) {
        String str2;
        if (str != null && d().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 0);
            hashMap.put("channel", str);
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            hashMap.put("fail_reason", str2);
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
            a2.f74715a = "draw_ad";
            a2.f74716b = "active_finish";
            a2.a("card_common").a(hashMap).b().c();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "active_finish", "0", null, null).b("ad_event_type", "debug").b("refer", "card_common").a(hashMap).c();
            f66129a.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(String str, String str2, int i2, int i3, String str3, String str4, long j2) {
        int i4 = 0;
        if (str != null && str.length() != 0) {
            HashMap hashMap = new HashMap();
            if (i3 == 1) {
                hashMap.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    hashMap.put("landing_type", 2);
                }
                if (i2 == 4) {
                    i4 = j2 == -1 ? a(str, str2) : 3;
                }
                hashMap.put("preload_status", Integer.valueOf(i4));
            }
            g gVar = f66132d.get(str);
            if (gVar != null) {
                hashMap.put("webview_init_duration", Long.valueOf(System.currentTimeMillis() - gVar.f66139b));
            }
            hashMap.put("is_web_url", Integer.valueOf(i3));
            hashMap.put("preload_webview_time", Long.valueOf(j2));
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
            a2.f74716b = "ad_landing_webview_init";
            a2.f74715a = "ad_wap_stat";
            a.b c2 = a2.c(str3);
            c2.f74717c = str4;
            c2.a(hashMap).c();
            if (str4 == null) {
                str4 = "0";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "ad_landing_webview_init", str4, str3, null).b("ad_event_type", "debug").a(hashMap).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void c() {
        f66133e.onNext(i.a.f66145a);
    }

    static final class c extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66134a = new c();

        static {
            Covode.recordClassIndex(40652);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> p;
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
            if (b2 == null || (p = b2.p()) == null) {
                return new ArrayList();
            }
            return p;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final t<i> b() {
        t<i> a2 = f66133e.a(d.f66135a).a(f.a.e.b.a.f157188a);
        l.b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$f  reason: collision with other inner class name */
    static final class CallableC1480f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f66137a;

        static {
            Covode.recordClassIndex(40655);
        }

        CallableC1480f(List list) {
            this.f66137a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> list = this.f66137a;
            if (list == null) {
                return null;
            }
            for (String str : list) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                f.a(str, f2 != null ? f2.g("lynx_feed") : null, "lynx_feed");
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(40649);
        f.a.l.b<i> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        f66133e = bVar;
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f66136a;

        static {
            Covode.recordClassIndex(40654);
        }

        e(List list) {
            this.f66136a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            j lynxEntryData;
            List<String> geckoChannel;
            com.ss.android.ugc.aweme.commercialize.model.m stickerData;
            List<String> geckoChannel2;
            Map<String, CardStruct> cardInfos;
            CardStruct cardStruct;
            List<String> geckoChannel3;
            com.ss.android.ugc.aweme.commercialize.model.l adQuestionnaire;
            List<String> geckoChannel4;
            CardStruct cardStruct2;
            List<String> geckoChannel5;
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
            DynamicVideo dynamicVideo;
            List<String> geckoChannel6;
            String str2;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f66136a.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Aweme aweme = (Aweme) it.next();
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        l.b(awemeRawAd, "");
                        if (awemeRawAd.getPreloadWeb() == 4) {
                            String channelName = awemeRawAd.getChannelName();
                            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                            if (f2 != null) {
                                str2 = f2.g("feed");
                            } else {
                                str2 = null;
                            }
                            f.a(channelName, str2, "feed");
                            if (channelName != null) {
                                ConcurrentHashMap<String, h> concurrentHashMap = f.f66129a;
                                Long creativeId = awemeRawAd.getCreativeId();
                                l.b(creativeId, "");
                                long longValue = creativeId.longValue();
                                String logExtra = awemeRawAd.getLogExtra();
                                if (awemeRawAd.getPreloadWebNew() != 1) {
                                    awemeRawAd = null;
                                }
                                concurrentHashMap.put(channelName, new h(longValue, logExtra, awemeRawAd));
                            }
                        } else if (awemeRawAd.getPreloadWeb() == 9) {
                            f.a(awemeRawAd);
                        }
                    }
                    if (aweme != null) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd2 == null || (dynamicVideo = awemeRawAd2.getDynamicVideo()) == null || (geckoChannel6 = dynamicVideo.getGeckoChannel()) == null || geckoChannel6.isEmpty())) {
                            l.b(b.a.f65586a, "");
                            d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
                            if (c2 != null) {
                                IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
                                if (f3 != null) {
                                    str = f3.g("dynamic_ad_feed");
                                }
                                c2.a(aweme, geckoChannel6, str, "dynamic_ad_feed");
                            }
                        }
                        l.b(b.a.f65586a, "");
                        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                        if (!(((a2 == null || (cardStruct2 = a2.c(aweme)) == null) && ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (cardStruct2 = commerceVideoAuthInfo.getCardStruct()) == null)) || (geckoChannel5 = cardStruct2.getGeckoChannel()) == null || geckoChannel5.isEmpty())) {
                            arrayList.addAll(geckoChannel5);
                        }
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd3 == null || (adQuestionnaire = awemeRawAd3.getAdQuestionnaire()) == null || (geckoChannel4 = adQuestionnaire.getGeckoChannel()) == null || geckoChannel4.isEmpty())) {
                            arrayList.addAll(geckoChannel4);
                        }
                        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd4 == null || (cardInfos = awemeRawAd4.getCardInfos()) == null || (cardStruct = cardInfos.get("5")) == null || (geckoChannel3 = cardStruct.getGeckoChannel()) == null || geckoChannel3.isEmpty())) {
                            arrayList.addAll(geckoChannel3);
                        }
                        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd5 == null || (stickerData = awemeRawAd5.getStickerData()) == null || (geckoChannel2 = stickerData.getGeckoChannel()) == null || geckoChannel2.isEmpty())) {
                            arrayList.addAll(geckoChannel2);
                        }
                        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd6 == null || (lynxEntryData = awemeRawAd6.getLynxEntryData()) == null || (geckoChannel = lynxEntryData.getGeckoChannel()) == null || geckoChannel.isEmpty())) {
                            arrayList.addAll(geckoChannel);
                        }
                    }
                }
                if (com.ss.android.ugc.aweme.commercialize.live.service.a.a(aweme)) {
                    arrayList.add("card_liveshopping");
                }
                f.a(arrayList, aweme);
            }
            if (!arrayList.isEmpty()) {
                IAdLandPagePreloadService f4 = AdLandPagePreloadServiceImpl.f();
                if (f4 != null) {
                    str = f4.g("lynx_feed");
                }
                f.a(arrayList, str, "lynx_feed");
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a() {
        a(i.b.f66146a);
        boolean z = false;
        for (Map.Entry<String, h> entry : f66129a.entrySet()) {
            AwemeRawAd awemeRawAd = entry.getValue().f66144e;
            if (awemeRawAd != null) {
                entry.getValue().f66144e = null;
                if (!z && awemeRawAd.getPreloadWebNew() == 1) {
                    AdLandPagePreloadServiceImpl.f().a(awemeRawAd);
                    z = true;
                }
            }
        }
    }

    static final class d<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final d f66135a = new d();

        static {
            Covode.recordClassIndex(40653);
        }

        d() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            l.d(obj, "");
            return !l.a(obj, i.a.f66145a);
        }
    }

    private static void a(i iVar) {
        l.d(iVar, "");
        f66133e.onNext(iVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void c(List<String> list) {
        if (list != null) {
            a(i.c.f66147a);
        }
        b.i.b(new CallableC1480f(list), b.i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void b(String str) {
        if (str != null) {
            f66132d.put(str, new g(str, System.currentTimeMillis()));
        }
    }

    public static void a(AwemeRawAd awemeRawAd) {
        List<String> geckoChannel;
        List<String> geckoChannel2;
        if (awemeRawAd != null) {
            String str = null;
            if (a.a()) {
                ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (!(nativeSiteConfig == null || (geckoChannel2 = nativeSiteConfig.getGeckoChannel()) == null)) {
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                    if (f2 != null) {
                        str = f2.g("lynx_feed");
                    }
                    a(geckoChannel2, str, "lynx_feed");
                    return;
                }
                return;
            }
            ag nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
            if (!(nativeSiteConfig2 == null || (geckoChannel = nativeSiteConfig2.getGeckoChannel()) == null)) {
                for (T t : geckoChannel) {
                    IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
                    a((String) t, f3 != null ? f3.g("lynx_feed") : null, "lynx_feed");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void b(List<String> list) {
        String str;
        if (list != null) {
            for (T t : list) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                if (f2 != null) {
                    str = f2.g("lynx_feed");
                } else {
                    str = null;
                }
                a((String) t, str, "lynx_feed");
            }
        }
    }

    public static void a(List<String> list, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List list2;
        if (!(aweme == null || (anchors = aweme.getAnchors()) == null)) {
            for (T t : anchors) {
                String extra = t.getExtra();
                if (!(extra == null || extra.length() == 0)) {
                    com.google.gson.l a2 = q.a(t.getExtra());
                    l.b(a2, "");
                    o j2 = a2.j();
                    Boolean bool = (Boolean) new com.google.gson.f().a(j2.c("is_schema_lynx"), new b().type);
                    if (bool != null && bool.booleanValue() && (list2 = (List) new com.google.gson.f().a(j2.c("gecko_channel"), new a().type)) != null && !list2.isEmpty()) {
                        list.addAll(list2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final int a(String str, String str2) {
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            l.b(b.a.f65586a, "");
            d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
            if (c2 != null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (c2.a(f2.g(str2), str)) {
                    return 2;
                }
            }
        }
        return 0;
    }

    public static void a(String str, String str2, String str3) {
        l.b(b.a.f65586a, "");
        d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
        if (c2 != null) {
            c2.a(str, str2, str3);
        }
    }

    public static void a(List<String> list, String str, String str2) {
        l.b(b.a.f65586a, "");
        d c2 = com.ss.android.ugc.aweme.ad.b.b.c();
        if (c2 != null) {
            c2.a(list, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(long j2, String str, long j3) {
        if (str != null) {
            if (d().contains(str)) {
                ConcurrentHashMap<String, h> concurrentHashMap = f66129a;
                h hVar = concurrentHashMap.get(str);
                if (hVar != null) {
                    l.b(hVar, "");
                    HashMap hashMap = new HashMap();
                    hashMap.put("download_status", 1);
                    hashMap.put("is_diff", Integer.valueOf(hVar.f66141b));
                    hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar.f66140a));
                    hashMap.put("download_size", Long.valueOf(j3));
                    hashMap.put("package_id", Long.valueOf(j2));
                    hashMap.put("channel", str);
                    a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                    a2.f74715a = "draw_ad";
                    a2.f74716b = "download_finish";
                    a2.a("card_common").a(hashMap).b().c();
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_finish", "0", null, null).b("ad_event_type", "debug").b("refer", "card_common").a(hashMap).c();
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, h> concurrentHashMap2 = f66129a;
            h hVar2 = concurrentHashMap2.get(str);
            if (hVar2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("download_status", 1);
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f66141b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar2.f66140a));
                hashMap2.put("download_size", Long.valueOf(j3));
                hashMap2.put("package_id", Long.valueOf(j2));
                a.b a3 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a3.f74716b = "ad_landing_channel_download_finish";
                a3.f74715a = "ad_wap_stat";
                a3.a(Long.valueOf(hVar2.f66142c)).c(hVar2.f66143d).b().a(hashMap2).c();
                com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(hVar2.f66142c), hVar2.f66143d, null).b("ad_event_type", "debug").a(hashMap2).c();
                concurrentHashMap2.remove(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.e
    public final void a(long j2, String str, long j3, Throwable th) {
        String str2;
        String message;
        if (str != null) {
            String str3 = "";
            if (d().contains(str)) {
                ConcurrentHashMap<String, h> concurrentHashMap = f66129a;
                h hVar = concurrentHashMap.get(str);
                if (hVar != null) {
                    l.b(hVar, str3);
                    HashMap hashMap = new HashMap();
                    hashMap.put("download_status", 0);
                    hashMap.put("is_diff", Integer.valueOf(hVar.f66141b));
                    hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar.f66140a));
                    hashMap.put("download_size", Long.valueOf(j3));
                    hashMap.put("package_id", Long.valueOf(j2));
                    hashMap.put("channel", str);
                    if (!(th == null || (message = th.getMessage()) == null)) {
                        str3 = message;
                    }
                    hashMap.put("fail_reason", str3);
                    a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                    a2.f74715a = "draw_ad";
                    a2.f74716b = "download_finish";
                    a2.a("card_common").a(hashMap).b().c();
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_finish", "0", null, null).b("ad_event_type", "debug").b("refer", "card_common").a(hashMap).c();
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, h> concurrentHashMap2 = f66129a;
            h hVar2 = concurrentHashMap2.get(str);
            if (hVar2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("download_status", 0);
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f66141b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar2.f66140a));
                hashMap2.put("download_size", Long.valueOf(j3));
                if (th == null || (str2 = th.getMessage()) == null) {
                    str2 = str3;
                }
                hashMap2.put("download_fail_reason", str2);
                hashMap2.put("package_id", Long.valueOf(j2));
                a.b a3 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a3.f74716b = "ad_landing_channel_download_finish";
                a3.f74715a = "ad_wap_stat";
                a3.a(Long.valueOf(hVar2.f66142c)).c(hVar2.f66143d).a(hashMap2).b().c();
                com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(hVar2.f66142c), hVar2.f66143d, null).b("ad_event_type", "debug").a(hashMap2).c();
                concurrentHashMap2.remove(str);
            }
        }
    }
}
