package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class es {

    /* renamed from: e  reason: collision with root package name */
    public static final ArrayMap<Object, es> f142882e = new ArrayMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static final a f142883f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f142884a;

    /* renamed from: b  reason: collision with root package name */
    String f142885b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f142886c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f142887d;

    /* renamed from: g  reason: collision with root package name */
    private final h f142888g;

    /* access modifiers changed from: package-private */
    public final LinkedHashMap<Uri, b> a() {
        return (LinkedHashMap) this.f142888g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93494);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static es a(Object obj) {
            l.d(obj, "");
            if (es.f142882e.containsKey(obj)) {
                es esVar = es.f142882e.get(obj);
                if (esVar == null) {
                    l.b();
                }
                return esVar;
            }
            es esVar2 = new es(obj, (byte) 0);
            es.f142882e.put(obj, esVar2);
            return esVar2;
        }
    }

    static final class d extends m implements h.f.a.a<LinkedHashMap<Uri, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142892a = new d();

        static {
            Covode.recordClassIndex(93497);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedHashMap<Uri, b> invoke() {
            return new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        a().clear();
        this.f142885b = "";
        this.f142886c = null;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f142889a;

        /* renamed from: b  reason: collision with root package name */
        public final long f142890b;

        static {
            Covode.recordClassIndex(93495);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f142889a == bVar.f142889a && this.f142890b == bVar.f142890b;
        }

        public final String toString() {
            return "CostInfo(startTime=" + this.f142889a + ", endTime=" + this.f142890b + ")";
        }

        public final int hashCode() {
            long j2 = this.f142889a;
            long j3 = this.f142890b;
            return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public b(long j2, long j3) {
            this.f142889a = j2;
            this.f142890b = j3;
        }
    }

    static {
        Covode.recordClassIndex(93493);
    }

    public final void c() {
        if (this.f142884a != 0) {
            new Handler().postDelayed(new c(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    public final void b() {
        a();
        d();
        new StringBuilder().append(this).append(" and ").append(this.f142887d).append(" startRecordOnce");
        this.f142884a = 1;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ es f142891a;

        static {
            Covode.recordClassIndex(93496);
        }

        c(es esVar) {
            this.f142891a = esVar;
        }

        public final void run() {
            String a2;
            es esVar = this.f142891a;
            if (esVar.f142886c != null) {
                if (esVar.a().isEmpty()) {
                    String str = esVar.f142885b;
                    JSONObject jSONObject = esVar.f142886c;
                    if (jSONObject == null) {
                        l.b();
                    }
                    es.b(str, jSONObject);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    String str2 = "";
                    int i2 = 0;
                    long j2 = 0;
                    for (Map.Entry<Uri, b> entry : esVar.a().entrySet()) {
                        String queryParameter = entry.getKey().getQueryParameter("bundle");
                        if (TextUtils.isEmpty(queryParameter)) {
                            a2 = "unknow";
                        } else {
                            if (queryParameter == null) {
                                l.b();
                            }
                            a2 = p.a(queryParameter, "/template.js", "");
                        }
                        if (sb.length() == 0) {
                            sb.append(a2);
                        } else {
                            sb.append(",".concat(String.valueOf(a2)));
                        }
                        b value = entry.getValue();
                        long j3 = value.f142890b - value.f142889a;
                        if (j3 <= 0) {
                            j3 = 0;
                        }
                        if (j3 > ((long) i2)) {
                            i2 = (int) j3;
                            str2 = a2;
                        }
                        long j4 = value.f142889a;
                        if (j4 < currentTimeMillis) {
                            currentTimeMillis = j4;
                        }
                        long j5 = value.f142890b;
                        if (j5 > j2) {
                            j2 = j5;
                        }
                    }
                    JSONObject jSONObject2 = esVar.f142886c;
                    if (jSONObject2 == null) {
                        l.b();
                    }
                    jSONObject2.put("lynx_longest_cost", i2);
                    JSONObject jSONObject3 = esVar.f142886c;
                    if (jSONObject3 == null) {
                        l.b();
                    }
                    jSONObject3.put("lynx_type_cost_longest", str2);
                    JSONObject jSONObject4 = esVar.f142886c;
                    if (jSONObject4 == null) {
                        l.b();
                    }
                    jSONObject4.put("lynx_cards_type", sb.toString());
                    JSONObject jSONObject5 = esVar.f142886c;
                    if (jSONObject5 == null) {
                        l.b();
                    }
                    jSONObject5.put("lynx_cards_count", esVar.a().size());
                    long j6 = j2 - currentTimeMillis;
                    if (j6 > 0) {
                        JSONObject jSONObject6 = esVar.f142886c;
                        if (jSONObject6 == null) {
                            l.b();
                        }
                        jSONObject6.put("lynx_all_draw_cost", j6);
                    }
                    new StringBuilder("lynxLongestCost:").append(i2).append("\nlynxTypeLongest:").append(str2).append("\nlynxCardsType:").append((Object) sb).append("\nlynxCardsCount:").append(esVar.a().size()).append('\n').append("lynxAllDrawCost:").append(j6);
                    String str3 = esVar.f142885b;
                    JSONObject jSONObject7 = esVar.f142886c;
                    if (jSONObject7 == null) {
                        l.b();
                    }
                    es.b(str3, jSONObject7);
                }
            }
            es esVar2 = this.f142891a;
            esVar2.d();
            esVar2.f142884a = 0;
            es.f142882e.remove(esVar2.f142887d);
        }
    }

    private es(Object obj) {
        this.f142887d = obj;
        this.f142885b = "";
        this.f142888g = i.a((h.f.a.a) d.f142892a);
    }

    public /* synthetic */ es(Object obj, byte b2) {
        this(obj);
    }

    static void b(String str, JSONObject jSONObject) {
        com.ss.android.common.c.a.a(str, jSONObject);
        o.a(str, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (this.f142884a != 0) {
            new StringBuilder().append(this).append(" and ").append(this.f142887d).append(" setLogData ").append(str);
            this.f142885b = str;
            this.f142886c = jSONObject;
        }
    }

    public final void a(Uri uri, b bVar) {
        l.d(uri, "");
        l.d(bVar, "");
        if (this.f142884a != 0) {
            new StringBuilder().append(this).append(" and ").append(this.f142887d).append(" appendLoadUrlTime ").append(uri).append(" and time").append(bVar);
            if (a().containsKey(uri)) {
                String uri2 = uri.toString();
                l.b(uri2, "");
                Uri parse = Uri.parse(uri2 + uri.hashCode());
                LinkedHashMap<Uri, b> a2 = a();
                l.b(parse, "");
                a2.put(parse, bVar);
                return;
            }
            a().put(uri, bVar);
        }
    }
}
