package com.ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class d implements ad {

    /* renamed from: a */
    public static final d f74778a = new d();

    /* renamed from: b */
    private static final h f74779b = i.a((h.f.a.a) a.f74782a);

    /* renamed from: c */
    private static final h f74780c = i.a((h.f.a.a) b.f74783a);

    /* renamed from: d */
    private static final Set<String> f74781d = am.a((Object[]) new String[]{"card", "link", "egg"});

    private static HashMap<String, Long> a() {
        return (HashMap) f74779b.getValue();
    }

    private d() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ad
    public final void a(Aweme aweme, ac acVar) {
        if (aweme != null && acVar != null) {
            a("link", "show_result", acVar.creativeId, acVar.logExtra, aweme.getAid(), 0);
        }
    }

    public final void a(String str, String str2, Long l2, String str3, String str4, int i2) {
        String str5;
        if (l2 == null || (str5 = String.valueOf(l2.longValue())) == null) {
            str5 = "-1";
        }
        a(str, str2, str5, str3, str4, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ad
    public final void a(List<? extends Aweme> list) {
        AwemeRawAd awemeRawAd;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(!t2.isAd() || (awemeRawAd = t2.getAwemeRawAd()) == null || awemeRawAd.getCardInfos() == null)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                d dVar = f74778a;
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                Long creativeId = awemeRawAd2 != null ? awemeRawAd2.getCreativeId() : null;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                dVar.a((d) "card", "data_received", (String) creativeId, (Long) (awemeRawAd3 != null ? awemeRawAd3.getLogExtra() : null), aweme.getAid(), (String) -1);
            }
        }
        com.ss.android.ugc.aweme.commercialize.egg.c.a b2 = ((ICommerceEggService) f74780c.getValue()).b();
        b2.a(list);
        b2.b(list);
        b(list);
    }

    static final class a extends m implements h.f.a.a<HashMap<String, Long>> {

        /* renamed from: a */
        public static final a f74782a = new a();

        static {
            Covode.recordClassIndex(46106);
        }

        a() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Long> invoke() {
            return new HashMap<>();
        }
    }

    static final class b extends m implements h.f.a.a<ICommerceEggService> {

        /* renamed from: a */
        public static final b f74783a = new b();

        static {
            Covode.recordClassIndex(46107);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ ICommerceEggService invoke() {
            return CommerceEggServiceImpl.c();
        }
    }

    static {
        Covode.recordClassIndex(46105);
    }

    private static void b(List<? extends Aweme> list) {
        UrlModel redImageUrl;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                AwemeRawAd awemeRawAd = t.getAwemeRawAd();
                if (awemeRawAd != null && TextUtils.equals(awemeRawAd.getType(), "redpacket") && (redImageUrl = awemeRawAd.getRedImageUrl()) != null && !com.bytedance.common.utility.collection.b.a((Collection) redImageUrl.getUrlList())) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                d dVar = f74778a;
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                String str = null;
                Long creativeId = awemeRawAd2 != null ? awemeRawAd2.getCreativeId() : null;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    str = awemeRawAd3.getLogExtra();
                }
                dVar.a((d) "redpacket", "data_received", (String) creativeId, (Long) str, aweme.getAid(), (String) -1);
            }
        }
    }

    private final void b(c cVar) {
        if (com.ss.android.ugc.aweme.commercialize.l.b.a()) {
            String str = cVar.f74774h;
            String str2 = cVar.f74775i;
            String str3 = cVar.f74767a;
            String str4 = "-1";
            if (str3 == null) {
                str3 = str4;
            }
            HashMap<String, Object> a2 = a(str, str2, str3, cVar.f74776j, cVar.f74777k);
            String str5 = cVar.f74770d;
            if (!(str5 == null || str5.length() == 0)) {
                a2.put("reason", str5);
            }
            String str6 = cVar.f74771e;
            if (!(str6 == null || str6.length() == 0)) {
                a2.put(StringSet.type, str6);
            }
            String str7 = cVar.f74772f;
            if (!(str7 == null || str7.length() == 0)) {
                a2.put("extra_id", str7);
            }
            HashMap<String, String> hashMap = cVar.f74773g;
            if (hashMap != null) {
                a2.put("play_fun_data", hashMap);
            }
            String str8 = cVar.f74768b;
            String str9 = cVar.f74775i;
            if (str8 == null || str8.length() == 0) {
                str8 = str4;
            }
            String str10 = cVar.f74769c;
            String str11 = cVar.f74767a;
            if (str11 != null) {
                str4 = str11;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("component_monitor", str9, str8, str10, str4).b("refer", cVar.f74774h).a(a2).b();
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        b(cVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ad
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f74778a.a((d) "card", "preload_start", (String) awemeRawAd.getCreativeId(), (Long) awemeRawAd.getLogExtra(), aweme.getAid(), (String) -1);
        }
    }

    public static void c(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f74778a.a("redpacket", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ad
    public final void b(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f74778a.a("card", "show_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.ad
    public final void a(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f74778a.a("card", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i2);
        }
    }

    private static int a(String str, String str2, String str3) {
        if (a().get(b(str, str2, str3)) == null) {
            return 1;
        }
        return 0;
    }

    private static String b(String str, String str2, String str3) {
        return str + '_' + str2 + '_' + str3;
    }

    private static long a(String str, String str2, String str3, long j2) {
        a().put(b(str, str2, str3), Long.valueOf(j2));
        int hashCode = str2.hashCode();
        String str4 = "preload_result";
        if (hashCode != -1942410580) {
            if (hashCode != -127128813) {
                if (hashCode != 497550239 || !str2.equals("show_result")) {
                    return 0;
                }
            } else if (!str2.equals(str4)) {
                return 0;
            } else {
                str4 = "preload_start";
            }
        } else if (!str2.equals("preload_start")) {
            return 0;
        } else {
            str4 = "data_received";
        }
        Long l2 = a().get(b(str, str4, str3));
        if (l2 != null) {
            return j2 - l2.longValue();
        }
        return -1;
    }

    private final HashMap<String, Object> a(String str, String str2, String str3, int i2, long j2) {
        long j3;
        HashMap<String, Object> hashMap = new HashMap<>();
        int a2 = a(str, str2, str3);
        hashMap.put("is_first", Integer.valueOf(a2));
        if (a2 == 1) {
            j3 = a(str, str2, str3, j2);
        } else {
            j3 = 0;
        }
        hashMap.put("time_interval", Long.valueOf(j3));
        if (i2 != -1) {
            hashMap.put("result", Integer.valueOf(i2));
        }
        return hashMap;
    }

    private void a(String str, String str2, String str3, String str4, String str5, int i2) {
        l.d(str, "");
        l.d(str2, "");
        a(new c(str, str2, i2, System.currentTimeMillis()).a(str5).b(str3).c(str4));
    }
}
