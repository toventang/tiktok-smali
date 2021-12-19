package com.ss.ttvideoengine.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public o f152623a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<b> f152624b = new ArrayList<>();

    static {
        Covode.recordClassIndex(101615);
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private n f152625a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f152626b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        private o f152627c;

        /* renamed from: d  reason: collision with root package name */
        private Context f152628d;

        /* renamed from: e  reason: collision with root package name */
        private b f152629e;

        static {
            Covode.recordClassIndex(101616);
        }

        public final void run() {
            final boolean z;
            if (this.f152625a != null) {
                o oVar = this.f152627c;
                if (oVar == null || !oVar.as) {
                    z = false;
                } else {
                    z = true;
                }
                b bVar = this.f152629e;
                o oVar2 = this.f152627c;
                HashMap hashMap = new HashMap();
                if (oVar2 != null) {
                    l.a(hashMap, "player_sessionid", oVar2.r);
                    l.a(hashMap, "v", oVar2.C);
                    l.a(hashMap, "pc", oVar2.f152654i);
                    l.a(hashMap, "sv", oVar2.f152655j);
                    l.a(hashMap, "sdk_version", oVar2.f152656k);
                    l.a(hashMap, "vtype", oVar2.N);
                }
                l.a(hashMap, "abrv", bVar.f152636d);
                l.a(hashMap, "cost_time", bVar.f152634b);
                l.a(hashMap, "pr_time", bVar.f152633a);
                l.a(hashMap, "end_type", bVar.f152635c);
                l.a(hashMap, "old_br", bVar.f152637e);
                l.a(hashMap, "new_br", bVar.f152638f);
                l.a(hashMap, "max_buf", bVar.f152639g);
                l.a(hashMap, "abuf", bVar.f152640h);
                l.a(hashMap, "vbuf", bVar.f152641i);
                l.a((Map) hashMap, "netspeed", bVar.f152642j);
                l.a(hashMap, "delaytime", bVar.f152643k);
                l.a((Map) hashMap, "tonew", bVar.f152645m);
                l.a((Map) hashMap, "reason", bVar.n);
                j.b("VideoEventAbrEvent", "AbrSwitch:" + hashMap.toString());
                final JSONObject jSONObject = new JSONObject(hashMap);
                Handler handler = this.f152626b;
                if (handler == null || handler.getLooper() == null) {
                    t.instance.addEventV2(z, jSONObject, "videoplayer_abrswitch");
                } else {
                    this.f152626b.post(new Runnable() {
                        /* class com.ss.ttvideoengine.h.n.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(101617);
                        }

                        public final void run() {
                            t.instance.addEventV2(z, jSONObject, "videoplayer_abrswitch");
                        }
                    });
                }
            }
        }

        public a(Context context, n nVar, o oVar, b bVar) {
            this.f152625a = nVar;
            this.f152627c = oVar;
            this.f152628d = context;
            this.f152629e = bVar;
        }
    }

    n(o oVar) {
        this.f152623a = oVar;
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public long f152633a;

        /* renamed from: b  reason: collision with root package name */
        public long f152634b;

        /* renamed from: c  reason: collision with root package name */
        public String f152635c;

        /* renamed from: d  reason: collision with root package name */
        public String f152636d;

        /* renamed from: e  reason: collision with root package name */
        public long f152637e;

        /* renamed from: f  reason: collision with root package name */
        public long f152638f;

        /* renamed from: g  reason: collision with root package name */
        public long f152639g;

        /* renamed from: h  reason: collision with root package name */
        public long f152640h;

        /* renamed from: i  reason: collision with root package name */
        public long f152641i;

        /* renamed from: j  reason: collision with root package name */
        public float f152642j;

        /* renamed from: k  reason: collision with root package name */
        public long f152643k;

        /* renamed from: l  reason: collision with root package name */
        public long f152644l;

        /* renamed from: m  reason: collision with root package name */
        public int f152645m;
        public int n;

        static {
            Covode.recordClassIndex(101618);
        }

        private b() {
            this.f152633a = -2147483648L;
            this.f152634b = -2147483648L;
            this.f152635c = "";
            this.f152636d = "";
            this.f152637e = -1;
            this.f152638f = -1;
            this.f152639g = -1;
            this.f152640h = -1;
            this.f152641i = -1;
            this.f152642j = -1.0f;
            this.f152643k = -1;
            this.f152644l = -1;
            this.n = -1;
        }

        /* synthetic */ b(n nVar, byte b2) {
            this();
        }
    }
}
