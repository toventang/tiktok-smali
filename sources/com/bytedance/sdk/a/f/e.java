package com.bytedance.sdk.a.f;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.a.b.j;
import com.bytedance.sdk.a.a.d;
import com.bytedance.sdk.a.a.d.i;
import com.bytedance.sdk.a.a.d.n;
import com.bytedance.sdk.a.f.e;
import com.bytedance.sdk.a.g.m;
import com.bytedance.sdk.a.h.a.h;
import com.bytedance.sdk.a.l.a;
import com.bytedance.sdk.a.l.c.b;
import com.ss.android.account.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class e implements WeakHandler.IHandler, d {

    /* renamed from: a  reason: collision with root package name */
    static final com.ss.android.account.b.a f43183a;
    private static List<a> al = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static final com.ss.android.account.b.a f43184b;

    /* renamed from: c  reason: collision with root package name */
    static final com.ss.android.account.b.a f43185c;

    /* renamed from: d  reason: collision with root package name */
    static final com.ss.android.account.b.a f43186d;

    /* renamed from: e  reason: collision with root package name */
    static final com.ss.android.account.b.a f43187e;

    /* renamed from: f  reason: collision with root package name */
    static final com.ss.android.account.b.a f43188f;

    /* renamed from: g  reason: collision with root package name */
    static final com.ss.android.account.b.a f43189g;

    /* renamed from: h  reason: collision with root package name */
    static final com.ss.android.account.b.a f43190h;

    /* renamed from: i  reason: collision with root package name */
    static final com.ss.android.account.b.a f43191i;

    /* renamed from: j  reason: collision with root package name */
    static final com.ss.android.account.b.a f43192j;

    /* renamed from: k  reason: collision with root package name */
    public static com.ss.android.account.b.a[] f43193k;
    private static volatile d x;
    private String A = "";
    private String B = "";
    private int C;
    private String D = "";
    private String E = "";
    private int F;
    private String G = "";
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private int P;
    private int Q;
    private int R;
    private String S = "";
    private long T;
    private String U = "";
    private boolean V;
    private String W = "";
    private String X = "";
    private int Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private long ac;
    private String ad = "";
    private String ae = "";
    private boolean af;
    private Set<String> ag;
    private boolean ah;
    private final com.ss.android.account.b.a[] ai;
    private boolean aj;
    private com.bytedance.common.utility.collection.d<com.bytedance.sdk.a.a.b> ak = new com.bytedance.common.utility.collection.d<>();

    /* renamed from: l  reason: collision with root package name */
    protected com.bytedance.sdk.a.a.e f43194l;

    /* renamed from: m  reason: collision with root package name */
    public long f43195m;
    public String n;
    public String o = "";
    public int p;
    public int q;
    public int r;
    public int s;
    com.bytedance.sdk.a.n.a t;
    Context u;
    public final WeakHandler v = new WeakHandler(Looper.getMainLooper(), this);
    private final int w = 1000;
    private String y = "";
    private String z = "";

    interface a {
        static {
            Covode.recordClassIndex(26489);
        }

        void a(com.bytedance.sdk.a.a.a.b bVar);
    }

    static class b implements a {
        static {
            Covode.recordClassIndex(26490);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r3.equals("user_logout") == false) goto L_0x0041;
         */
        @Override // com.bytedance.sdk.a.f.e.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.bytedance.sdk.a.a.a.b r7) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.a.f.e.b.a(com.bytedance.sdk.a.a.a.b):void");
        }
    }

    static class c implements a {
        static {
            Covode.recordClassIndex(26491);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // com.bytedance.sdk.a.f.e.a
        public final void a(com.bytedance.sdk.a.a.a.b bVar) {
            com.bytedance.sdk.a.n.a aVar;
            Context b2 = f.a().b();
            if (bVar instanceof com.bytedance.sdk.a.a.a.e) {
                com.bytedance.sdk.a.n.a aVar2 = ((com.bytedance.sdk.a.a.a.e) bVar).f43082j;
                if (aVar2 != null && (aVar2 instanceof com.bytedance.sdk.a.n.a)) {
                    e.a(b2).a(aVar2, true);
                }
            } else if (bVar instanceof com.bytedance.sdk.a.a.a.d) {
                T t = ((com.bytedance.sdk.a.a.a.d) bVar).f43081j;
                if (t instanceof h) {
                    e.a(b2).a(((h) t).b(), true);
                }
            } else if ((bVar instanceof i) && (aVar = ((i) bVar).f43100j) != null && (aVar instanceof com.bytedance.sdk.a.n.a)) {
                e.a(b2).a(aVar, true);
            }
        }
    }

    @Override // com.bytedance.sdk.a.a.d
    public final String a() {
        return this.X;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final boolean b() {
        return this.aa;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final String c() {
        return this.U;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final com.bytedance.sdk.a.n.a d() {
        return this.t;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final String f() {
        return this.n;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(boolean z2) {
        this.aa = z2;
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.u, "com.bytedance.sdk.account_setting", 0).edit();
        edit.putBoolean("is_login", this.aa);
        edit.apply();
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(String str, final com.bytedance.sdk.a.a.b.d dVar) {
        if (!this.aa) {
            g();
            return;
        }
        com.bytedance.sdk.a.a.e eVar = this.f43194l;
        if (eVar != null) {
            eVar.a(str, new com.bytedance.sdk.a.a.b.d() {
                /* class com.bytedance.sdk.a.f.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26486);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.f fVar) {
                    com.bytedance.sdk.a.a.b.d dVar = dVar;
                    if (dVar != null) {
                        dVar.e(fVar);
                    }
                    e.this.g();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.f fVar, int i2) {
                    com.bytedance.sdk.a.a.b.d dVar = dVar;
                    if (dVar != null) {
                        dVar.a(fVar, i2);
                    }
                    e.this.g();
                }
            });
        }
    }

    public final void g() {
        if (this.v != null) {
            long j2 = 600000;
            if (f.f58195b != null) {
                j2 = f.f58195b.f59514a;
            }
            this.v.sendEmptyMessageDelayed(1000, j2);
        }
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void e() {
        a(true);
        if (this.f43194l != null) {
            final String a2 = com.ss.android.token.f.f61019a.a(false, true);
            if (!TextUtils.isEmpty(a2)) {
                m.a(this.u, a2, new j() {
                    /* class com.bytedance.sdk.a.f.e.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(26488);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                    @Override // com.bytedance.sdk.a.c
                    public final /* bridge */ /* synthetic */ void e(n nVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                    @Override // com.bytedance.sdk.a.c
                    public final /* synthetic */ void a(n nVar, int i2) {
                        String str;
                        n nVar2 = nVar;
                        if (nVar2 == null) {
                            str = "";
                        } else if ("session_expired".equalsIgnoreCase(nVar2.f43103j)) {
                            String str2 = a2;
                            if (com.ss.android.token.d.f61016a) {
                                com.ss.android.token.f.f61019a.a(str2, (List<com.ss.android.token.c>) null, true);
                                return;
                            }
                            return;
                        } else {
                            str = nVar2.f43075f;
                        }
                        com.ss.android.token.e.a("tt_token_beat", i2, str);
                    }
                }).d();
            }
        }
    }

    static {
        Covode.recordClassIndex(26485);
        com.ss.android.account.b.a aVar = new com.ss.android.account.b.a("mobile");
        f43183a = aVar;
        com.ss.android.account.b.a aVar2 = new com.ss.android.account.b.a("email");
        f43184b = aVar2;
        com.ss.android.account.b.a aVar3 = new com.ss.android.account.b.a("google");
        f43185c = aVar3;
        com.ss.android.account.b.a aVar4 = new com.ss.android.account.b.a("facebook");
        f43186d = aVar4;
        com.ss.android.account.b.a aVar5 = new com.ss.android.account.b.a("twitter");
        f43187e = aVar5;
        com.ss.android.account.b.a aVar6 = new com.ss.android.account.b.a("instagram");
        f43188f = aVar6;
        com.ss.android.account.b.a aVar7 = new com.ss.android.account.b.a("line");
        f43189g = aVar7;
        com.ss.android.account.b.a aVar8 = new com.ss.android.account.b.a("kakaotalk");
        f43190h = aVar8;
        com.ss.android.account.b.a aVar9 = new com.ss.android.account.b.a("vk");
        f43191i = aVar9;
        com.ss.android.account.b.a aVar10 = new com.ss.android.account.b.a("tiktok");
        f43192j = aVar10;
        f43193k = new com.ss.android.account.b.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
    }

    private com.ss.android.account.c i() {
        com.ss.android.account.c cVar = new com.ss.android.account.c();
        cVar.f43463a = this.T;
        cVar.f43467e = this.Z;
        cVar.f43468f = this.X;
        cVar.p = this.M;
        cVar.L = this.F;
        cVar.s = this.N;
        cVar.t = this.W;
        cVar.r = this.z;
        cVar.O = this.B;
        cVar.N = this.V;
        cVar.P = this.y;
        cVar.Q = this.G;
        cVar.z = this.S;
        cVar.q = this.D;
        cVar.x = this.J;
        cVar.y = this.O;
        cVar.B = this.C;
        cVar.C = this.P;
        cVar.J = this.A;
        cVar.F = this.q;
        cVar.G = this.r;
        cVar.H = this.s;
        cVar.I = this.f43195m;
        cVar.f43470h = this.E;
        cVar.A = this.o;
        cVar.K = this.p;
        cVar.E = this.R;
        cVar.D = this.Q;
        cVar.S = this.H;
        cVar.R = this.I;
        cVar.T = this.K;
        cVar.U = this.ab;
        cVar.v = this.ad;
        cVar.u = this.f43195m;
        cVar.w = this.ae;
        cVar.f43466d = this.Y;
        cVar.f43471i = this.U;
        cVar.f43473k = this.af;
        cVar.f43474l = this.ah;
        com.ss.android.account.b.a[] aVarArr = this.ai;
        for (com.ss.android.account.b.a aVar : aVarArr) {
            if (!TextUtils.isEmpty(aVar.f58179b) && aVar.f58180c) {
                cVar.f43464b.put(aVar.f58179b, aVar);
            }
        }
        return cVar;
    }

    private void h() {
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.u, "com.bytedance.sdk.account_setting", 0).edit();
        a(edit);
        edit.remove("session");
        edit.putBoolean("is_login", this.aa);
        edit.putLong("user_id", this.T);
        edit.putString("sec_user_id", this.U);
        edit.putString("session_key", this.X);
        edit.putString("user_name", this.M);
        edit.putString("verified_content", this.W);
        edit.putInt("user_gender", this.F);
        edit.putString("screen_name", this.N);
        edit.putBoolean("user_verified", this.V);
        edit.putString("avatar_url", this.z);
        edit.putBoolean("is_new_user", this.Z);
        edit.putString("user_email", this.E);
        edit.putString("user_mobile", this.L);
        edit.putInt("is_blocked", this.H);
        edit.putInt("is_blocking", this.I);
        edit.putBoolean("is_toutiao", this.K);
        edit.putBoolean("user_has_pwd", this.ab);
        edit.putInt("country_code", this.Y);
        edit.putString("area", this.y);
        edit.putString("user_industry", this.G);
        edit.putString("user_decoration", this.S);
        edit.putString("user_birthday", this.B);
        edit.putLong("pgc_mediaid", this.ac);
        edit.putString("pgc_avatar_url", this.ad);
        edit.putString("pgc_name", this.ae);
        edit.putString("user_description", this.D);
        edit.putBoolean("is_recommend_allowed", this.J);
        edit.putString("recommend_hint_message", this.O);
        edit.putInt("can_be_found_by_phone", this.C);
        edit.putInt("can_sync_share", this.P);
        edit.putInt("following_count", this.q);
        edit.putInt("followers_count", this.r);
        edit.putInt("visitors_count", this.s);
        edit.putLong("media_id", this.f43195m);
        edit.putString("bg_img_url", this.A);
        edit.putInt("display_ocr_entrance", this.p);
        edit.putString("user_auth_info", this.o);
        edit.putInt("user_privacy_extend", this.Q);
        edit.putInt("user_privacy_extend_value", this.R);
        edit.putBoolean("is_visitor_account", this.af);
        edit.putBoolean("is_kids_mode", this.ah);
        com.bytedance.common.utility.e.a.a(edit);
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(com.bytedance.sdk.a.n.a aVar) {
        this.t = aVar;
        a(aVar, false);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(String str) {
        a(str, (com.bytedance.sdk.a.a.b.d) null);
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void b(String str) {
        this.n = str;
        com.ss.android.ugc.aweme.bf.d.a(this.u, "com.bytedance.sdk.account_setting", 0).edit().putString("multi_sids", str).apply();
    }

    public static d a(Context context) {
        MethodCollector.i(9913);
        if (x == null) {
            synchronized (e.class) {
                try {
                    if (x == null) {
                        x = new e(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9913);
                    throw th;
                }
            }
        }
        e eVar = (e) x;
        if (!((eVar.u instanceof Application) || context == null || b(context) == null)) {
            eVar.u = b(context);
        }
        d dVar = x;
        MethodCollector.o(9913);
        return dVar;
    }

    private void c(boolean z2) {
        MethodCollector.i(9919);
        com.bytedance.sdk.a.a.a aVar = new com.bytedance.sdk.a.a.a(0);
        aVar.f43067b = z2;
        synchronized (this.ak) {
            try {
                Iterator<com.bytedance.sdk.a.a.b> it = this.ak.iterator();
                while (it.hasNext()) {
                    it.next().a(aVar);
                }
            } finally {
                MethodCollector.o(9919);
            }
        }
    }

    private boolean b(com.bytedance.sdk.a.n.a aVar) {
        com.ss.android.account.b.a[] aVarArr = this.ai;
        boolean z2 = false;
        for (com.ss.android.account.b.a aVar2 : aVarArr) {
            com.ss.android.account.b.a aVar3 = aVar.f43464b.get(aVar2.f58179b);
            if (aVar3 == null) {
                if (aVar2.f58180c) {
                    z2 = true;
                }
                aVar2.a();
            } else {
                if (!aVar2.f58180c) {
                    aVar2.f58180c = true;
                    z2 = true;
                }
                aVar2.f58187j = aVar3.f58187j;
                aVar2.f58188k = aVar3.f58188k;
                aVar2.f58181d = aVar3.f58181d;
                aVar2.f58182e = aVar3.f58182e;
                aVar2.f58183f = aVar3.f58183f;
                aVar2.f58189l = aVar3.f58189l;
                aVar2.f58186i = aVar3.f58186i;
                aVar2.f58184g = aVar3.f58184g;
            }
        }
        return z2;
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(com.bytedance.sdk.a.a.a aVar) {
        MethodCollector.i(9434);
        synchronized (this.ak) {
            try {
                Iterator<com.bytedance.sdk.a.a.b> it = this.ak.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.a.a.b next = it.next();
                    if (next != null) {
                        next.a(aVar);
                    }
                }
            } finally {
                MethodCollector.o(9434);
            }
        }
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void c(String str) {
        if (this.ag == null) {
            this.ag = new HashSet();
        }
        this.ag.add(str);
        com.ss.android.ugc.aweme.bf.d.a(this.u, "com.bytedance.sdk.account_setting", 0).edit().putStringSet("has_update_sec_uids", this.ag).apply();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 100 && (message.obj instanceof k)) {
            k kVar = (k) message.obj;
            if (kVar.f43218b != null) {
                T t2 = kVar.f43218b;
                for (a aVar : al) {
                    aVar.a(t2);
                }
                if (kVar.f43217a != null) {
                    com.bytedance.sdk.a.a.a.a aVar2 = kVar.f43217a;
                    T t3 = kVar.f43218b;
                    if (!aVar2.f43069a) {
                        aVar2.a(t3);
                    }
                    com.bytedance.sdk.a.a.c.a aVar3 = aVar2.f43180b;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                }
            }
        }
        if (message.what == 1000) {
            this.v.removeMessages(1000);
            a("polling", (com.bytedance.sdk.a.a.b.d) null);
        }
    }

    private void a(SharedPreferences.Editor editor) {
        com.ss.android.account.b.a[] aVarArr = this.ai;
        for (com.ss.android.account.b.a aVar : aVarArr) {
            if (!this.aa) {
                editor.putString("_platform_" + aVar.f58179b, "");
            } else if (aVar.f58180c) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", aVar.f58179b);
                    jSONObject.put("mNickname", aVar.f58181d);
                    jSONObject.put("mAvatar", aVar.f58182e);
                    jSONObject.put("mPlatformUid", aVar.f58183f);
                    jSONObject.put("mExpire", aVar.f58187j);
                    jSONObject.put("mExpireIn", aVar.f58188k);
                    jSONObject.put("isLogin", aVar.f58180c);
                    jSONObject.put("mUserId", aVar.f58189l);
                    jSONObject.put("mModifyTime", aVar.f58186i);
                    jSONObject.put("mSecPlatformUid", aVar.f58184g);
                    editor.putString("_platform_" + aVar.f58179b, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        editor.apply();
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void b(boolean z2) {
        MethodCollector.i(9910);
        if (this.aa) {
            this.Z = false;
            this.aa = false;
            this.T = 0;
            this.X = "";
            this.U = "";
            a(0, "");
            this.M = "";
            this.F = 0;
            this.N = "";
            this.W = "";
            this.D = "";
            this.y = "";
            this.G = "";
            this.H = 0;
            this.I = 0;
            this.S = "";
            this.B = "";
            this.V = false;
            this.J = false;
            this.K = false;
            this.Y = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.ab = false;
            this.f43195m = 0;
            this.A = "";
            this.E = "";
            this.L = "";
            this.p = 0;
            this.ad = "";
            this.ac = 0;
            this.ae = "";
            this.o = "";
            this.af = false;
            for (com.ss.android.account.b.a aVar : this.ai) {
                aVar.a();
            }
            h();
        }
        if (z2) {
            com.bytedance.sdk.a.a.a aVar2 = new com.bytedance.sdk.a.a.a(2);
            aVar2.f43067b = false;
            synchronized (this.ak) {
                try {
                    Iterator<com.bytedance.sdk.a.a.b> it = this.ak.iterator();
                    while (it.hasNext()) {
                        it.next().a(aVar2);
                    }
                } finally {
                    MethodCollector.o(9910);
                }
            }
            return;
        }
        MethodCollector.o(9910);
    }

    private void a(SharedPreferences sharedPreferences) {
        Exception e2;
        e eVar = this;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            com.ss.android.account.b.a[] aVarArr = eVar.ai;
            if (i2 < aVarArr.length) {
                aVarArr[i2].f58180c = z2;
                com.ss.android.account.b.a aVar = eVar.ai[i2];
                try {
                    if (!TextUtils.isEmpty(aVar.f58179b)) {
                        try {
                            String string = sharedPreferences.getString("_platform_" + aVar.f58179b, null);
                            if (!TextUtils.isEmpty(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                if (com.bytedance.common.utility.m.a(jSONObject.optString("mName", ""), aVar.f58179b)) {
                                    if (jSONObject.has("mNickname")) {
                                        aVar.f58181d = jSONObject.optString("mNickname", "");
                                    }
                                    if (jSONObject.has("mAvatar")) {
                                        aVar.f58182e = jSONObject.optString("mAvatar", "");
                                    }
                                    if (jSONObject.has("mPlatformUid")) {
                                        aVar.f58183f = jSONObject.optString("mPlatformUid", "");
                                    }
                                    if (jSONObject.has("mExpire")) {
                                        try {
                                            aVar.f58187j = jSONObject.optLong("mExpire", aVar.f58187j);
                                        } catch (Exception e3) {
                                            e2 = e3;
                                            e2.printStackTrace();
                                            i2++;
                                            z2 = false;
                                            eVar = this;
                                        }
                                    }
                                    if (jSONObject.has("mExpireIn")) {
                                        aVar.f58188k = jSONObject.optLong("mExpireIn", aVar.f58188k);
                                    }
                                    if (jSONObject.has("isLogin")) {
                                        aVar.f58180c = jSONObject.optBoolean("isLogin", false);
                                    }
                                    if (jSONObject.has("mUserId")) {
                                        aVar.f58189l = jSONObject.optLong("mUserId", 0);
                                    }
                                    if (jSONObject.has("mModifyTime")) {
                                        aVar.f58186i = jSONObject.optLong("mModifyTime");
                                    }
                                    if (jSONObject.has("mSecPlatformUid")) {
                                        aVar.f58184g = jSONObject.optString("mSecPlatformUid");
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e2 = e4;
                            e2.printStackTrace();
                            i2++;
                            z2 = false;
                            eVar = this;
                        }
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    e2.printStackTrace();
                    i2++;
                    z2 = false;
                    eVar = this;
                }
                i2++;
                z2 = false;
                eVar = this;
            } else {
                return;
            }
        }
    }

    private e(Context context) {
        al.add(new c((byte) 0));
        al.add(new b((byte) 0));
        this.u = context;
        this.aj = false;
        this.ai = f43193k;
        try {
            this.aj = true;
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, "com.bytedance.sdk.account_setting", 0);
            this.aa = a2.getBoolean("is_login", false);
            this.T = a2.getLong("user_id", 0);
            this.U = a2.getString("sec_user_id", "");
            this.Z = a2.getBoolean("is_new_user", false);
            this.X = a2.getString("session_key", "");
            this.M = a2.getString("user_name", "");
            this.F = a2.getInt("user_gender", 0);
            this.N = a2.getString("screen_name", "");
            this.W = a2.getString("verified_content", "");
            this.V = a2.getBoolean("user_verified", false);
            this.z = a2.getString("avatar_url", "");
            this.B = a2.getString("user_birthday", "");
            this.y = a2.getString("area", "");
            this.G = a2.getString("user_industry", "");
            this.E = a2.getString("user_email", "");
            this.L = a2.getString("user_mobile", "");
            this.S = a2.getString("user_decoration", "");
            this.D = a2.getString("user_description", "");
            this.J = a2.getBoolean("is_recommend_allowed", false);
            this.O = a2.getString("recommend_hint_message", "");
            this.H = a2.getInt("is_blocked", 0);
            this.I = a2.getInt("is_blocking", 0);
            this.K = a2.getBoolean("is_toutiao", false);
            this.ab = a2.getBoolean("user_has_pwd", false);
            this.Y = a2.getInt("country_code", 0);
            this.ac = a2.getLong("pgc_mediaid", 0);
            this.ad = a2.getString("pgc_avatar_url", "");
            this.ae = a2.getString("pgc_name", "");
            this.C = a2.getInt("can_be_found_by_phone", 1);
            this.P = a2.getInt("can_sync_share", 0);
            this.Q = a2.getInt("user_privacy_extend", 0);
            this.R = a2.getInt("user_privacy_extend_value", 2147483646);
            this.A = a2.getString("bg_img_url", "");
            this.n = a2.getString("multi_sids", "");
            this.q = a2.getInt("following_count", 0);
            this.r = a2.getInt("followers_count", 0);
            this.s = a2.getInt("visitors_count", 0);
            this.f43195m = a2.getLong("media_id", 0);
            this.A = a2.getString("bg_img_url", "");
            this.p = a2.getInt("display_ocr_entrance", 0);
            this.o = a2.getString("user_auth_info", "");
            this.af = a2.getBoolean("is_visitor_account", false);
            this.ag = a2.getStringSet("has_update_sec_uids", new HashSet());
            this.ah = a2.getBoolean("is_kids_mode", false);
            if (this.aa) {
                if (this.T <= 0) {
                    this.aa = false;
                    this.T = 0;
                    this.U = "";
                }
            } else if (this.T > 0) {
                this.T = 0;
                this.U = "";
            }
            a(a2);
            long j2 = this.T;
            if (j2 > 0) {
                a(j2, this.X);
            }
            this.t = i();
        } catch (Exception e2) {
            com.ss.android.d.a("BDAccountManager", e2.getMessage());
        }
        this.f43194l = d.a(this.u);
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(com.bytedance.sdk.a.a.b bVar) {
        MethodCollector.i(9587);
        synchronized (this.ak) {
            try {
                this.ak.a(bVar);
            } finally {
                MethodCollector.o(9587);
            }
        }
    }

    private static void a(long j2, String str) {
        try {
            f.a().e().a(j2, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.a.a.d
    public final void a(com.bytedance.sdk.a.n.a aVar, boolean z2) {
        boolean z3;
        if (aVar != null) {
            long j2 = aVar.f43463a;
            boolean z4 = false;
            boolean z5 = true;
            if (j2 > 0) {
                this.t = aVar;
                if (!this.aa) {
                    this.aa = true;
                    try {
                        CookieSyncManager.getInstance().sync();
                    } catch (Throwable unused) {
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (aVar.f43467e) {
                    this.Z = true;
                }
                if (this.T != j2) {
                    this.T = j2;
                    z3 = true;
                    z4 = true;
                }
                if (!com.bytedance.common.utility.m.a(this.U, aVar.f43471i)) {
                    this.U = aVar.f43471i;
                    new com.bytedance.sdk.a.l.a.a<a.C1048a>(new StringBuilder().append(aVar.f43463a).toString(), aVar.f43465c, this.u) {
                        /* class com.bytedance.sdk.a.l.a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f43403a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f43404b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Context f43405c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ com.bytedance.sdk.a.l.b.a f43406d = null;

                        static {
                            Covode.recordClassIndex(26592);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.sdk.a.l.a.a
                        public final /* bridge */ /* synthetic */ void a(C1048a aVar) {
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.sdk.a.l.a.a
                        public final /* synthetic */ C1048a a() {
                            C1048a aVar;
                            MethodCollector.i(12930);
                            b bVar = b.a.f43416a;
                            String str = this.f43403a;
                            String str2 = this.f43404b;
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && bVar.a()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("sec_uid", str2);
                                if (bVar.f43414a.update("login_info", contentValues, "uid = ?", new String[]{str}) != 0) {
                                    e.a(this.f43405c).c(this.f43403a);
                                    aVar = new C1048a(0, null);
                                    MethodCollector.o(12930);
                                    return aVar;
                                }
                            }
                            aVar = new C1048a(-1, "fail to update data");
                            MethodCollector.o(12930);
                            return aVar;
                        }

                        {
                            this.f43403a = r2;
                            this.f43404b = r3;
                            this.f43405c = r4;
                        }
                    }.b();
                    z3 = true;
                }
                if (!com.bytedance.common.utility.m.a(this.X, aVar.f43468f)) {
                    this.X = aVar.f43468f;
                    z3 = true;
                    z4 = true;
                }
                if (!com.bytedance.common.utility.m.a(this.L, aVar.f43469g)) {
                    this.L = aVar.f43469g;
                    z3 = true;
                }
                if (!com.bytedance.common.utility.m.a(this.E, aVar.f43470h)) {
                    this.E = aVar.f43470h;
                    z3 = true;
                }
                if (this.ab != aVar.f43472j) {
                    this.ab = aVar.f43472j;
                    z3 = true;
                }
                if (this.Y != aVar.f43466d) {
                    this.Y = aVar.f43466d;
                    z3 = true;
                }
                if (this.af != aVar.f43473k) {
                    this.af = aVar.f43473k;
                    z3 = true;
                }
                if (this.ah != aVar.f43474l) {
                    this.ah = aVar.f43474l;
                    z3 = true;
                }
                if (b(aVar)) {
                    z3 = true;
                }
                if (aVar instanceof com.ss.android.account.c) {
                    com.ss.android.account.c cVar = (com.ss.android.account.c) aVar;
                    if (!com.bytedance.common.utility.m.a(this.M, cVar.p)) {
                        this.M = cVar.p;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.N, cVar.s)) {
                        this.N = cVar.s;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.W, cVar.t)) {
                        this.W = cVar.t;
                        z3 = true;
                    }
                    if (this.F != cVar.L) {
                        this.F = cVar.L;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.D, cVar.q)) {
                        this.D = cVar.q;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.z, cVar.r)) {
                        this.z = cVar.r;
                        z3 = true;
                    }
                    if (this.V != cVar.N) {
                        this.V = cVar.N;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.B, cVar.O)) {
                        this.B = cVar.O;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.y, cVar.P)) {
                        this.y = cVar.P;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.G, cVar.Q)) {
                        this.G = cVar.Q;
                        z3 = true;
                    }
                    if (this.K != cVar.T) {
                        this.K = cVar.T;
                        z3 = true;
                    }
                    if (this.I != cVar.R) {
                        this.I = cVar.R;
                        z3 = true;
                    }
                    if (this.H != cVar.S) {
                        this.H = cVar.S;
                        z3 = true;
                    }
                    if (this.J != cVar.x) {
                        this.J = cVar.x;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.O, cVar.y)) {
                        this.O = cVar.y;
                        z3 = true;
                    }
                    if (this.C != cVar.B) {
                        this.C = cVar.B;
                        z3 = true;
                    }
                    if (this.Q != cVar.D) {
                        this.Q = cVar.D;
                        z3 = true;
                    }
                    if (this.R != cVar.E) {
                        this.R = cVar.E;
                        z3 = true;
                    }
                    if (this.P != cVar.C) {
                        this.P = cVar.C;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.S, cVar.z)) {
                        this.S = cVar.z;
                        z3 = true;
                    }
                    if (this.f43195m != cVar.I) {
                        this.f43195m = cVar.I;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.ad, cVar.v)) {
                        this.ad = cVar.v;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.ae, cVar.w)) {
                        this.ae = cVar.w;
                        z3 = true;
                    }
                    if (this.ac != cVar.u) {
                        this.ac = cVar.u;
                        z3 = true;
                    }
                    if ((!TextUtils.isEmpty(this.A) && !TextUtils.isEmpty(cVar.J) && !com.bytedance.common.utility.m.a(this.A, cVar.J)) || ((TextUtils.isEmpty(this.A) && !TextUtils.isEmpty(cVar.J)) || (!TextUtils.isEmpty(this.A) && TextUtils.isEmpty(cVar.J)))) {
                        this.A = cVar.J;
                        z3 = true;
                    }
                    if (this.p != cVar.K) {
                        this.p = cVar.K;
                        z3 = true;
                    }
                    if (!com.bytedance.common.utility.m.a(this.o, cVar.A)) {
                        this.o = cVar.A;
                        z3 = true;
                    }
                }
                this.aa = true;
            } else if (this.aa) {
                this.Z = false;
                this.aa = false;
                this.T = 0;
                this.U = "";
                this.M = "";
                this.F = 0;
                this.N = "";
                this.W = "";
                this.z = "";
                this.B = "";
                this.y = "";
                this.G = "";
                this.S = "";
                this.D = "";
                this.V = false;
                this.J = false;
                this.X = "";
                this.q = 0;
                this.r = 0;
                this.s = 0;
                this.H = 0;
                this.I = 0;
                this.K = false;
                this.ab = false;
                this.f43195m = 0;
                this.A = "";
                this.p = 0;
                this.ad = "";
                this.ac = 0;
                this.ae = "";
                this.o = "";
                this.af = false;
                this.t = null;
                for (com.ss.android.account.b.a aVar2 : this.ai) {
                    aVar2.a();
                }
                z4 = false;
                z3 = true;
                z5 = false;
            } else {
                return;
            }
            if (z3) {
                h();
                if (z2) {
                    c(z5);
                }
                if (com.bytedance.sdk.a.l.a.a(aVar) != null) {
                    new Object() {
                        /* class com.bytedance.sdk.a.f.e.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(26487);
                        }
                    };
                    f.a();
                }
            }
            if (z4) {
                a(this.T, this.X);
            }
        }
    }
}
