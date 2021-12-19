package com.ss.android.ugc.aweme.ml.data;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ml.d;
import com.ss.android.ugc.aweme.language.f;
import com.ss.android.ugc.aweme.ml.a.e;
import com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig;
import com.ss.android.ugc.aweme.performance.i;
import com.ss.android.ugc.aweme.video.l;
import h.a.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f110462a = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    /* renamed from: b  reason: collision with root package name */
    public static ArrayList<String> f110463b = n.d("hour", "access", "signal", "country", "p_dev", "sp_dev", "tcp_rtt", "tcp_band", "http_rtt", "net_quality_lv", "is_wifi", "is_charge", "battery_pct");

    /* renamed from: c  reason: collision with root package name */
    public static final a f110464c = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(70917);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static c f110465a = new c((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f110466b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70918);
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(70916);
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.ss.android.ml.d.a
    public final Object a(String str) {
        boolean z;
        int i2 = 1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str != null) {
            switch (str.hashCode()) {
                case -1483091692:
                    if (str.equals("tcp_rtt")) {
                        return Integer.valueOf(e.b(System.currentTimeMillis()).f29065a);
                    }
                    break;
                case -1423461020:
                    if (str.equals("access")) {
                        return e.a(System.currentTimeMillis());
                    }
                    break;
                case -902467928:
                    if (str.equals("signal")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - e.f110310e > 30000) {
                            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                            e.f110309d = l.a(a2).b(a2);
                            e.f110310e = currentTimeMillis;
                        }
                        return Integer.valueOf(e.f110309d);
                    }
                    break;
                case -897593495:
                    if (str.equals("is_charge")) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 - e.f110314i > 30000) {
                            com.bytedance.z.a.a.c a3 = com.bytedance.z.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a());
                            if (a3 != null) {
                                e.f110313h = a3.c();
                            }
                            e.f110314i = currentTimeMillis2;
                        }
                        return Integer.valueOf(e.f110313h ? 1 : 0);
                    }
                    break;
                case -896251085:
                    if (str.equals("sp_dev")) {
                        return Integer.valueOf(i.b() ? 1 : 0);
                    }
                    break;
                case -481815380:
                    if (str.equals("net_quality_lv")) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (currentTimeMillis3 - e.f110312g > 30000) {
                            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                            e.f110311f = effectiveConnectionType;
                            if (effectiveConnectionType < 0) {
                                e.f110311f = 0;
                            }
                            e.f110312g = currentTimeMillis3;
                        }
                        return Integer.valueOf(e.f110311f);
                    }
                    break;
                case -132747717:
                    if (str.equals("http_rtt")) {
                        return Integer.valueOf(e.b(System.currentTimeMillis()).f29066b);
                    }
                    break;
                case 3208676:
                    if (str.equals("hour")) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        if (currentTimeMillis4 - e.f110308c > 900000) {
                            e.f110308c = currentTimeMillis4;
                            Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(e.f110308c);
                            e.f110307b = instance.get(11);
                        }
                        return Integer.valueOf(e.f110307b);
                    }
                    break;
                case 106363846:
                    if (str.equals("p_dev")) {
                        return Integer.valueOf(i.a() ? 1 : 0);
                    }
                    break;
                case 957831062:
                    if (str.equals("country")) {
                        if (e.f110306a == null) {
                            e.f110306a = f.a();
                        }
                        return e.f110306a;
                    }
                    break;
                case 1268302803:
                    if (str.equals("tcp_band")) {
                        return Integer.valueOf(e.b(System.currentTimeMillis()).f29067c);
                    }
                    break;
                case 2023669679:
                    if (str.equals("battery_pct")) {
                        long currentTimeMillis5 = System.currentTimeMillis();
                        if (currentTimeMillis5 - e.f110316k > 30000) {
                            com.bytedance.z.a.a.c a4 = com.bytedance.z.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a());
                            if (a4 != null) {
                                e.f110315j = a4.e();
                            }
                            e.f110316k = currentTimeMillis5;
                        }
                        return Integer.valueOf(e.f110315j);
                    }
                    break;
                case 2082342154:
                    if (str.equals("is_wifi")) {
                        String a5 = e.a(System.currentTimeMillis());
                        if (TextUtils.isEmpty(a5) || !a5.contains("wifi")) {
                            i2 = 0;
                        }
                        return Integer.valueOf(i2);
                    }
                    break;
            }
        }
        return null;
    }

    public final boolean a(Map<String, Object> map, FeaturePhoneTypeConfig featurePhoneTypeConfig) {
        if (map == null || featurePhoneTypeConfig == null || !featurePhoneTypeConfig.getEnable()) {
            return false;
        }
        if (featurePhoneTypeConfig.isNeedAllPhoneFeatures()) {
            Iterator<String> it = f110463b.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Object a2 = a(next);
                if (a2 != null) {
                    h.f.b.l.b(next, "");
                    map.put(next, a2);
                }
            }
            return true;
        }
        List<String> phoneFeatureList = featurePhoneTypeConfig.getPhoneFeatureList();
        if (phoneFeatureList != null) {
            for (String str : phoneFeatureList) {
                Object a3 = a(str);
                if (a3 != null) {
                    map.put(str, a3);
                }
            }
        }
        return true;
    }
}
