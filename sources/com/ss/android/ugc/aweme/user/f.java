package com.ss.android.ugc.aweme.user;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.p;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.c;
import h.a.z;
import h.f.b.ab;
import h.f.b.ad;
import h.f.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f142376a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static final t<List<String>> f142377b;

    /* renamed from: c  reason: collision with root package name */
    public static final LiveData<List<String>> f142378c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f142379d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static final h.h f142380e = h.i.a((h.f.a.a) e.f142407a);

    /* renamed from: f  reason: collision with root package name */
    private static final h.h f142381f = h.i.a((h.f.a.a) j.f142412a);

    /* renamed from: g  reason: collision with root package name */
    private static final h.h f142382g = h.i.a((h.f.a.a) d.f142406a);

    /* renamed from: h  reason: collision with root package name */
    private static final List<c> f142383h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private static String f142384i = "";

    /* renamed from: j  reason: collision with root package name */
    private static String f142385j = "";

    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C3805a f142386h = new C3805a((byte) 0);
        @com.google.gson.a.c(a = "uid")

        /* renamed from: a  reason: collision with root package name */
        public final String f142387a;
        @com.google.gson.a.c(a = "session_key")

        /* renamed from: b  reason: collision with root package name */
        public final String f142388b;
        @com.google.gson.a.c(a = StringSet.name)

        /* renamed from: c  reason: collision with root package name */
        public final String f142389c;
        @com.google.gson.a.c(a = "user_verified")

        /* renamed from: d  reason: collision with root package name */
        public final boolean f142390d;
        @com.google.gson.a.c(a = "country_code")

        /* renamed from: e  reason: collision with root package name */
        public String f142391e;
        @com.google.gson.a.c(a = "sec_uid")

        /* renamed from: f  reason: collision with root package name */
        public String f142392f;
        @com.google.gson.a.c(a = "is_kids_mode")

        /* renamed from: g  reason: collision with root package name */
        public final boolean f142393g;

        static {
            Covode.recordClassIndex(93117);
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$a$a  reason: collision with other inner class name */
        public static final class C3805a {
            static {
                Covode.recordClassIndex(93118);
            }

            private C3805a() {
            }

            public /* synthetic */ C3805a(byte b2) {
                this();
            }

            public static a a(long j2, String str, String str2, boolean z, String str3, String str4, boolean z2) {
                String str5 = "";
                h.f.b.l.d(str, str5);
                h.f.b.l.d(str2, str5);
                h.f.b.l.d(str3, str5);
                h.f.b.l.d(str4, str5);
                if (j2 != 0) {
                    str5 = String.valueOf(j2);
                }
                return new a(str5, str, str2, z, str3, str4, z2);
            }
        }

        public /* synthetic */ a(String str) {
            this(str, "", "", false, "", "", false);
        }

        public a(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            h.f.b.l.d(str5, "");
            this.f142387a = str;
            this.f142388b = str2;
            this.f142389c = str3;
            this.f142390d = z;
            this.f142391e = str4;
            this.f142392f = str5;
            this.f142393g = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class g implements Predicate {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f142409a;

        static {
            Covode.recordClassIndex(93130);
        }

        g(h.f.a.b bVar) {
            this.f142409a = bVar;
        }

        @Override // java.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            Object invoke = this.f142409a.invoke(obj);
            h.f.b.l.b(invoke, "");
            return ((Boolean) invoke).booleanValue();
        }
    }

    public static com.google.gson.f a() {
        return (com.google.gson.f) f142380e.getValue();
    }

    public static SharedPreferences b() {
        return (SharedPreferences) f142381f.getValue();
    }

    private f() {
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142407a = new e();

        static {
            Covode.recordClassIndex(93128);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            return new com.google.gson.f();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142406a = new d();

        static {
            Covode.recordClassIndex(93127);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ User invoke() {
            User user = new User();
            user.setAllowStatus(1);
            return user;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f142412a = new j();

        static {
            Covode.recordClassIndex(93133);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SharedPreferences invoke() {
            return com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.a.f62426a, "aweme_user", 0);
        }
    }

    public static boolean g() {
        return b().getBoolean("mandatory_2sv", false);
    }

    public static long h() {
        return b().getLong("last_show_hpas_dialog_time", 0);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f142402a;

        /* renamed from: b  reason: collision with root package name */
        private final h.h f142403b = h.i.a((h.f.a.a) new b(this));

        /* renamed from: c  reason: collision with root package name */
        private final h.h f142404c = h.i.a((h.f.a.a) new a(this));

        /* renamed from: d  reason: collision with root package name */
        private final h.h f142405d = h.i.a((h.f.a.a) new C3806c(this));

        static {
            Covode.recordClassIndex(93120);
        }

        public final b<User> a() {
            return (b) this.f142403b.getValue();
        }

        public final b<a> b() {
            return (b) this.f142404c.getValue();
        }

        public final b<c> c() {
            return (b) this.f142405d.getValue();
        }

        static final class a extends h.f.b.m implements h.f.a.a<b<a>> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(93121);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ b<a> invoke() {
                return new b(this.this$0.f142402a, "account_user_info", new a(this.this$0.f142402a), new h.f.a.a<a>(this.this$0) {
                    /* class com.ss.android.ugc.aweme.user.f.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(93122);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ a invoke() {
                        String str = ((c) this.receiver).f142402a;
                        long j2 = com.ss.android.ugc.aweme.user.d.c.a().getLong("user_id", 0);
                        String string = com.ss.android.ugc.aweme.user.d.c.a().getString("session_key", "");
                        if (string == null) {
                            string = "";
                        }
                        h.f.b.l.b(string, "");
                        String string2 = com.ss.android.ugc.aweme.user.d.c.a().getString("user_name", "");
                        if (string2 == null) {
                            string2 = "";
                        }
                        h.f.b.l.b(string2, "");
                        boolean z = com.ss.android.ugc.aweme.user.d.c.a().getBoolean("user_verified", false);
                        String string3 = com.ss.android.ugc.aweme.user.d.c.a().getString("country_code", "");
                        if (string3 == null) {
                            string3 = "";
                        }
                        h.f.b.l.b(string3, "");
                        String string4 = com.ss.android.ugc.aweme.user.d.c.a().getString("sec_uid", "");
                        if (string4 == null) {
                            string4 = "";
                        }
                        h.f.b.l.b(string4, "");
                        boolean z2 = com.ss.android.ugc.aweme.user.d.c.a().getBoolean("is_kids_mode", false);
                        if (!TextUtils.equals(str, String.valueOf(j2))) {
                            return null;
                        }
                        return a.C3805a.a(j2, string, string2, z, string3, string4, z2);
                    }
                });
            }
        }

        public final void d() {
            a().c();
            b().c();
            c().c();
        }

        public final User f() {
            String str;
            User n = f.n();
            if (n != null) {
                str = n.getUid();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str, (Object) this.f142402a)) {
                return n;
            }
            return null;
        }

        static final class b extends h.f.b.m implements h.f.a.a<b<User>> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(93123);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ b<User> invoke() {
                String str = this.this$0.f142402a;
                String str2 = this.this$0.f142402a;
                User user = new User();
                user.setUid(str2);
                user.setAllowStatus(1);
                return new b(str, "aweme_user_info", user, new h.f.a.a<User>(this.this$0) {
                    /* class com.ss.android.ugc.aweme.user.f.c.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(93124);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ User invoke() {
                        return ((c) this.receiver).f();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.f$c$c  reason: collision with other inner class name */
        static final class C3806c extends h.f.b.m implements h.f.a.a<b<c>> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(93125);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3806c(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ b<c> invoke() {
                return new b(this.this$0.f142402a, "significant_user_info", new c(this.this$0.f142402a, null, null, null, null, null, 0, 126), new h.f.a.a<c>(this.this$0) {
                    /* class com.ss.android.ugc.aweme.user.f.c.C3806c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(93126);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ c invoke() {
                        User f2 = ((c) this.receiver).f();
                        if (f2 != null) {
                            return c.a.a(f2);
                        }
                        return null;
                    }
                });
            }
        }

        public final void e() {
            a().a((User) null);
            a().b();
            b().a((a) null);
            b().b();
            c().a((c) null);
            c().b();
        }

        public c(String str) {
            h.f.b.l.d(str, "");
            this.f142402a = str;
        }
    }

    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f142394a;

        /* renamed from: b  reason: collision with root package name */
        public final String f142395b;

        /* renamed from: c  reason: collision with root package name */
        public final String f142396c;

        /* renamed from: d  reason: collision with root package name */
        private final Class<? extends T> f142397d;

        /* renamed from: e  reason: collision with root package name */
        private final String f142398e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<T> f142399f = new ArrayList<>(1);

        /* renamed from: g  reason: collision with root package name */
        private T f142400g;

        /* renamed from: h  reason: collision with root package name */
        private final h.f.a.a<T> f142401h;

        static {
            Covode.recordClassIndex(93119);
        }

        public final void d() {
            SharedPreferences.Editor edit = f.b().edit();
            edit.putString(this.f142398e, f.a().b(a()));
            edit.apply();
        }

        public final void b() {
            Iterator<T> it = this.f142399f.iterator();
            if (it.hasNext()) {
                T next = it.next();
                SharedPreferences.Editor edit = f.b().edit();
                if (next == null) {
                    edit.remove(this.f142398e);
                } else {
                    edit.putString(this.f142398e, f.a().b(next));
                }
                edit.commit();
            }
            this.f142399f.clear();
        }

        public final void c() {
            Iterator<T> it = this.f142399f.iterator();
            if (it.hasNext()) {
                T next = it.next();
                SharedPreferences.Editor edit = f.b().edit();
                if (next == null) {
                    edit.remove(this.f142398e);
                } else {
                    edit.putString(this.f142398e, f.a().b(next));
                }
                edit.apply();
            }
            this.f142399f.clear();
        }

        private final T e() {
            boolean z;
            JSONObject jSONObject;
            String string = f.b().getString(this.f142398e, "");
            if (string == null || string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                return com.bytedance.ies.abmock.b.a().a(true, "gson_opt_for_user_deserialize_optimize_enable", true) ? a(string) : (T) f.a().a(string, (Type) this.f142397d);
            } catch (Exception e2) {
                e2.printStackTrace();
                if ((e2 instanceof com.google.gson.t) || (e2 instanceof p)) {
                    return null;
                }
                if (e2 instanceof NullPointerException) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        jSONObject = new JSONObject();
                    }
                    com.ss.android.ugc.aweme.app.n.a("user_store_load_npe", jSONObject);
                    return null;
                }
                throw e2;
            }
        }

        public final T a() {
            if (this.f142394a) {
                return this.f142400g;
            }
            T e2 = e();
            this.f142400g = e2;
            if (e2 == null) {
                a((Object) this.f142401h.invoke());
                b();
            }
            this.f142394a = true;
            return this.f142400g;
        }

        private final void b(T t) {
            this.f142399f.clear();
            this.f142399f.add(t);
        }

        public final void a(T t) {
            if (this.f142400g != t) {
                this.f142400g = t;
                b(t);
                this.f142394a = true;
            }
        }

        private final T a(String str) {
            boolean z;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                com.google.gson.f a2 = f.a();
                com.google.gson.g gVar = new com.google.gson.g(a2);
                gVar.a((Type) User.class, (Object) new com.ss.android.ugc.aweme.gsonopt.c(a2));
                return (T) gVar.b().a(str, (Type) this.f142397d);
            } catch (com.google.gson.t e2) {
                e2.printStackTrace();
                return (T) f.a().a(str, (Type) this.f142397d);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, T t, h.f.a.a<? extends T> aVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(t, "");
            h.f.b.l.d(aVar, "");
            this.f142395b = str;
            this.f142396c = str2;
            this.f142401h = aVar;
            this.f142397d = (Class<? extends T>) t.getClass();
            this.f142398e = str + '_' + str2;
        }
    }

    public static String f() {
        String string = b().getString("mandatory_2sv_nudge_period", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static final synchronized String j() {
        boolean z;
        String str;
        synchronized (f.class) {
            MethodCollector.i(6815);
            if (f142385j.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = f142385j;
            } else {
                str = Keva.getRepo("keva_aweme_account_user").getString("last_recorded_sec_uid", "");
                h.f.b.l.b(str, "");
            }
            f142385j = str;
            MethodCollector.o(6815);
        }
        return str;
    }

    public static List<String> l() {
        boolean z;
        List<String> list;
        MethodCollector.i(6978);
        synchronized (f142376a) {
            try {
                String string = b().getString("logged_in_uid_list", "");
                if (string == null) {
                    string = "";
                }
                h.f.b.l.b(string, "");
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = z.INSTANCE;
                } else {
                    list = h.m.p.b(string, new String[]{","});
                }
            } finally {
                MethodCollector.o(6978);
            }
        }
        return list;
    }

    public static void m() {
        z.e eVar = new z.e();
        eVar.element = null;
        eVar.element = (T) f.a.t.c(h.f142410a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new i(eVar));
    }

    public static User n() {
        String string = b().getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) a().a(string, User.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private String o() {
        String uid;
        long j2 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.a.f62426a, "com.ss.spipe_setting", 0).getLong("user_id", 0);
        if (j2 > 0) {
            return String.valueOf(j2);
        }
        User n2 = n();
        if (n2 == null || (uid = n2.getUid()) == null) {
            return "0";
        }
        return uid;
    }

    public final String e() {
        String string = b().getString("current_foreground_uid", "");
        if (string != null && string.length() > 0) {
            return string;
        }
        if (!h(o())) {
            return o();
        }
        User n2 = n();
        if (n2 == null || n2.getUid() == null) {
            return "0";
        }
        String uid = n2.getUid();
        h.f.b.l.b(uid, "");
        return uid;
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final h f142410a = new h();

        static {
            Covode.recordClassIndex(93131);
        }

        h() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MethodCollector.i(7596);
            synchronized (f.f142376a) {
                try {
                    Iterator<T> it = f.c().iterator();
                    while (it.hasNext()) {
                        it.next().d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7596);
                    throw th;
                }
            }
            f.b().edit().putString("current_foreground_uid", f.f142379d.e()).apply();
            h.z zVar = h.z.f158842a;
            MethodCollector.o(7596);
            return zVar;
        }
    }

    static {
        Covode.recordClassIndex(93116);
        t<List<String>> tVar = new t<>();
        tVar.postValue(l());
        f142377b = tVar;
        LiveData<List<String>> a2 = aa.a(tVar, C3807f.f142408a);
        h.f.b.l.b(a2, "");
        f142378c = a2;
    }

    public static List<c> c() {
        List<String> l2 = l();
        for (T t : l2) {
            Iterator<T> it = f142383h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (h.f.b.l.a((Object) next.f142402a, (Object) t)) {
                    if (next != null) {
                    }
                }
            }
            f142383h.add(new c(t));
        }
        List<c> list = f142383h;
        k kVar = new k(l2);
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new g(kVar));
        } else {
            Iterator<c> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Boolean) kVar.invoke(it2.next())).booleanValue()) {
                    it2.remove();
                }
            }
        }
        return f142383h;
    }

    public final synchronized String i() {
        boolean z;
        String str;
        MethodCollector.i(6808);
        boolean z2 = true;
        if (f142384i.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = f142384i;
        } else {
            String string = b().getString("latest_logged_in_uid_list", "");
            if (string == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(string, "");
            if (string.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                str = b().getString("latest_logged_in_uid_list", "0");
                if (str == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(str, "");
            } else {
                str = b().getString("last_uid", "");
                if (str == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(str, "");
            }
        }
        f142384i = str;
        MethodCollector.o(6808);
        return str;
    }

    public final void d() {
        T t;
        MethodCollector.i(6798);
        String e2 = e();
        synchronized (f142376a) {
            try {
                Iterator<T> it = c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f142402a, (Object) e2)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    h.k.c a2 = ab.a(User.class);
                    if (h.f.b.l.a(a2, ab.a(User.class))) {
                        if (t2.a().f142394a) {
                            t2.a().a();
                        } else {
                            t2.a().a();
                        }
                    } else if (h.f.b.l.a(a2, ab.a(a.class))) {
                        t2.b().a();
                    } else if (h.f.b.l.a(a2, ab.a(c.class))) {
                        t2.c().a();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(6798);
                throw th;
            }
        }
        a.C1450a.a(e());
        MethodCollector.o(6798);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r1 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.profile.model.User k() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.f.k():com.ss.android.ugc.aweme.profile.model.User");
    }

    public static final class l<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f142413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f142414b = true;

        static {
            Covode.recordClassIndex(93135);
        }

        public l(Object obj) {
            this.f142413a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            T t;
            T t2;
            String str2;
            boolean z;
            MethodCollector.i(7845);
            Object obj = this.f142413a;
            h.k.c a2 = ab.a(a.class);
            if (h.f.b.l.a(a2, ab.a(User.class))) {
                if (obj != null) {
                    str = ((User) obj).getUid();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    MethodCollector.o(7845);
                    throw nullPointerException;
                }
            } else if (h.f.b.l.a(a2, ab.a(a.class))) {
                if (obj != null) {
                    str = ((a) obj).f142387a;
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                    MethodCollector.o(7845);
                    throw nullPointerException2;
                }
            } else if (!h.f.b.l.a(a2, ab.a(c.class))) {
                str = "0";
            } else if (obj != null) {
                str = ((c) obj).f142345a;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                MethodCollector.o(7845);
                throw nullPointerException3;
            }
            if (str != null) {
                synchronized (f.f142376a) {
                    try {
                        Iterator<T> it = f.c().iterator();
                        while (true) {
                            t = null;
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (h.f.b.l.a((Object) t2.f142402a, (Object) str)) {
                                break;
                            }
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            Object obj2 = this.f142413a;
                            h.k.c a3 = ab.a(a.class);
                            if (h.f.b.l.a(a3, ab.a(User.class))) {
                                b<User> a4 = t3.a();
                                if (obj2 != null) {
                                    a4.a((User) obj2);
                                    b<c> c2 = t3.c();
                                    User a5 = t3.a().a();
                                    if (a5 != null) {
                                        c2.a(c.a.a(a5));
                                    } else {
                                        NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        MethodCollector.o(7845);
                                        throw nullPointerException4;
                                    }
                                } else {
                                    NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.o(7845);
                                    throw nullPointerException5;
                                }
                            } else if (h.f.b.l.a(a3, ab.a(a.class))) {
                                b<a> b2 = t3.b();
                                if (obj2 != null) {
                                    b2.a((a) obj2);
                                } else {
                                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.o(7845);
                                    throw nullPointerException6;
                                }
                            } else if (h.f.b.l.a(a3, ab.a(c.class))) {
                                b<c> c3 = t3.c();
                                if (obj2 != null) {
                                    c3.a((c) obj2);
                                } else {
                                    NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                    MethodCollector.o(7845);
                                    throw nullPointerException7;
                                }
                            }
                            t3.d();
                        }
                        if (t3 == null && this.f142414b) {
                            Object obj3 = this.f142413a;
                            h.k.c a6 = ab.a(a.class);
                            if (h.f.b.l.a(a6, ab.a(User.class))) {
                                if (obj3 != null) {
                                    str2 = ((User) obj3).getUid();
                                } else {
                                    NullPointerException nullPointerException8 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.o(7845);
                                    throw nullPointerException8;
                                }
                            } else if (h.f.b.l.a(a6, ab.a(a.class))) {
                                if (obj3 != null) {
                                    str2 = ((a) obj3).f142387a;
                                } else {
                                    NullPointerException nullPointerException9 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.o(7845);
                                    throw nullPointerException9;
                                }
                            } else if (!h.f.b.l.a(a6, ab.a(c.class))) {
                                str2 = "0";
                            } else if (obj3 != null) {
                                str2 = ((c) obj3).f142345a;
                            } else {
                                NullPointerException nullPointerException10 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                MethodCollector.o(7845);
                                throw nullPointerException10;
                            }
                            if (str2 != null && !f.h(str2)) {
                                List<String> l2 = f.l();
                                if (!(l2 instanceof Collection) || !l2.isEmpty()) {
                                    Iterator<T> it2 = l2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (h.f.b.l.a((Object) it2.next(), (Object) str2)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                    SharedPreferences.Editor edit = f.b().edit();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(f.l());
                                    arrayList.add(str2);
                                    edit.putString("logged_in_uid_list", h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
                                    edit.apply();
                                    Iterator<T> it3 = f.c().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        T next = it3.next();
                                        if (h.f.b.l.a((Object) next.f142402a, (Object) str2)) {
                                            t = next;
                                            break;
                                        }
                                    }
                                    T t4 = t;
                                    if (t4 != null) {
                                        h.k.c a7 = ab.a(a.class);
                                        if (h.f.b.l.a(a7, ab.a(User.class))) {
                                            b<User> a8 = t4.a();
                                            if (obj3 != null) {
                                                a8.a((User) obj3);
                                                b<c> c4 = t4.c();
                                                User a9 = t4.a().a();
                                                if (a9 != null) {
                                                    c4.a(c.a.a(a9));
                                                } else {
                                                    NullPointerException nullPointerException11 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                    MethodCollector.o(7845);
                                                    throw nullPointerException11;
                                                }
                                            } else {
                                                NullPointerException nullPointerException12 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                MethodCollector.o(7845);
                                                throw nullPointerException12;
                                            }
                                        } else if (h.f.b.l.a(a7, ab.a(a.class))) {
                                            b<a> b3 = t4.b();
                                            if (obj3 != null) {
                                                b3.a((a) obj3);
                                            } else {
                                                NullPointerException nullPointerException13 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                                MethodCollector.o(7845);
                                                throw nullPointerException13;
                                            }
                                        } else if (h.f.b.l.a(a7, ab.a(c.class))) {
                                            b<c> c5 = t4.c();
                                            if (obj3 != null) {
                                                c5.a((c) obj3);
                                            } else {
                                                NullPointerException nullPointerException14 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                                MethodCollector.o(7845);
                                                throw nullPointerException14;
                                            }
                                        }
                                        t4.d();
                                    }
                                    f.f142377b.postValue(arrayList);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(7845);
                        throw th;
                    }
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(7845);
            return zVar;
        }
    }

    public static final class m<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f142415a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f142416b = true;

        static {
            Covode.recordClassIndex(93136);
        }

        public m(Object obj) {
            this.f142415a = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
            if (r5 == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
            if (r4 == null) goto L_0x012f;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 702
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.f.m.call():java.lang.Object");
        }
    }

    public static final class n<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f142417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f142418b = true;

        static {
            Covode.recordClassIndex(93137);
        }

        public n(Object obj) {
            this.f142417a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            T t;
            T t2;
            String str2;
            boolean z;
            MethodCollector.i(6490);
            Object obj = this.f142417a;
            h.k.c a2 = ab.a(c.class);
            if (h.f.b.l.a(a2, ab.a(User.class))) {
                if (obj != null) {
                    str = ((User) obj).getUid();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    MethodCollector.o(6490);
                    throw nullPointerException;
                }
            } else if (h.f.b.l.a(a2, ab.a(a.class))) {
                if (obj != null) {
                    str = ((a) obj).f142387a;
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                    MethodCollector.o(6490);
                    throw nullPointerException2;
                }
            } else if (!h.f.b.l.a(a2, ab.a(c.class))) {
                str = "0";
            } else if (obj != null) {
                str = ((c) obj).f142345a;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                MethodCollector.o(6490);
                throw nullPointerException3;
            }
            if (str != null) {
                synchronized (f.f142376a) {
                    try {
                        Iterator<T> it = f.c().iterator();
                        while (true) {
                            t = null;
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (h.f.b.l.a((Object) t2.f142402a, (Object) str)) {
                                break;
                            }
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            Object obj2 = this.f142417a;
                            h.k.c a3 = ab.a(c.class);
                            if (h.f.b.l.a(a3, ab.a(User.class))) {
                                b<User> a4 = t3.a();
                                if (obj2 != null) {
                                    a4.a((User) obj2);
                                    b<c> c2 = t3.c();
                                    User a5 = t3.a().a();
                                    if (a5 != null) {
                                        c2.a(c.a.a(a5));
                                    } else {
                                        NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        MethodCollector.o(6490);
                                        throw nullPointerException4;
                                    }
                                } else {
                                    NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.o(6490);
                                    throw nullPointerException5;
                                }
                            } else if (h.f.b.l.a(a3, ab.a(a.class))) {
                                b<a> b2 = t3.b();
                                if (obj2 != null) {
                                    b2.a((a) obj2);
                                } else {
                                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.o(6490);
                                    throw nullPointerException6;
                                }
                            } else if (h.f.b.l.a(a3, ab.a(c.class))) {
                                b<c> c3 = t3.c();
                                if (obj2 != null) {
                                    c3.a((c) obj2);
                                } else {
                                    NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                    MethodCollector.o(6490);
                                    throw nullPointerException7;
                                }
                            }
                            t3.d();
                        }
                        if (t3 == null && this.f142418b) {
                            Object obj3 = this.f142417a;
                            h.k.c a6 = ab.a(c.class);
                            if (h.f.b.l.a(a6, ab.a(User.class))) {
                                if (obj3 != null) {
                                    str2 = ((User) obj3).getUid();
                                } else {
                                    NullPointerException nullPointerException8 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                    MethodCollector.o(6490);
                                    throw nullPointerException8;
                                }
                            } else if (h.f.b.l.a(a6, ab.a(a.class))) {
                                if (obj3 != null) {
                                    str2 = ((a) obj3).f142387a;
                                } else {
                                    NullPointerException nullPointerException9 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                    MethodCollector.o(6490);
                                    throw nullPointerException9;
                                }
                            } else if (!h.f.b.l.a(a6, ab.a(c.class))) {
                                str2 = "0";
                            } else if (obj3 != null) {
                                str2 = ((c) obj3).f142345a;
                            } else {
                                NullPointerException nullPointerException10 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                MethodCollector.o(6490);
                                throw nullPointerException10;
                            }
                            if (str2 != null && !f.h(str2)) {
                                List<String> l2 = f.l();
                                if (!(l2 instanceof Collection) || !l2.isEmpty()) {
                                    Iterator<T> it2 = l2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (h.f.b.l.a((Object) it2.next(), (Object) str2)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                    SharedPreferences.Editor edit = f.b().edit();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(f.l());
                                    arrayList.add(str2);
                                    edit.putString("logged_in_uid_list", h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
                                    edit.apply();
                                    Iterator<T> it3 = f.c().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        T next = it3.next();
                                        if (h.f.b.l.a((Object) next.f142402a, (Object) str2)) {
                                            t = next;
                                            break;
                                        }
                                    }
                                    T t4 = t;
                                    if (t4 != null) {
                                        h.k.c a7 = ab.a(c.class);
                                        if (h.f.b.l.a(a7, ab.a(User.class))) {
                                            b<User> a8 = t4.a();
                                            if (obj3 != null) {
                                                a8.a((User) obj3);
                                                b<c> c4 = t4.c();
                                                User a9 = t4.a().a();
                                                if (a9 != null) {
                                                    c4.a(c.a.a(a9));
                                                } else {
                                                    NullPointerException nullPointerException11 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                    MethodCollector.o(6490);
                                                    throw nullPointerException11;
                                                }
                                            } else {
                                                NullPointerException nullPointerException12 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                                MethodCollector.o(6490);
                                                throw nullPointerException12;
                                            }
                                        } else if (h.f.b.l.a(a7, ab.a(a.class))) {
                                            b<a> b3 = t4.b();
                                            if (obj3 != null) {
                                                b3.a((a) obj3);
                                            } else {
                                                NullPointerException nullPointerException13 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.UserStore.AccountUser");
                                                MethodCollector.o(6490);
                                                throw nullPointerException13;
                                            }
                                        } else if (h.f.b.l.a(a7, ab.a(c.class))) {
                                            b<c> c5 = t4.c();
                                            if (obj3 != null) {
                                                c5.a((c) obj3);
                                            } else {
                                                NullPointerException nullPointerException14 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.user.SignificantUserInfo");
                                                MethodCollector.o(6490);
                                                throw nullPointerException14;
                                            }
                                        }
                                        t4.d();
                                    }
                                    f.f142377b.postValue(arrayList);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6490);
                        throw th;
                    }
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(6490);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.f$f  reason: collision with other inner class name */
    static final class C3807f<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3807f f142408a = new C3807f();

        static {
            Covode.recordClassIndex(93129);
        }

        C3807f() {
        }

        @Override // androidx.a.a.c.a
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f142411a;

        static {
            Covode.recordClassIndex(93132);
        }

        i(z.e eVar) {
            this.f142411a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = this.f142411a.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<c, Boolean> {
        final /* synthetic */ List $uidList;

        static {
            Covode.recordClassIndex(93134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(List list) {
            super(1);
            this.$uidList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(c cVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            return Boolean.valueOf(!this.$uidList.contains(cVar2.f142402a));
        }
    }

    public static boolean a(String str) {
        if (!h(str)) {
            return true;
        }
        return false;
    }

    public static void b(String str) {
        h.f.b.l.d(str, "");
        a.C1450a.a(str);
        b().edit().putString("current_foreground_uid", str).apply();
    }

    public static boolean h(String str) {
        if (str == null || str.length() == 0 || h.f.b.l.a((Object) str, (Object) "0")) {
            return true;
        }
        return false;
    }

    public static f.a.b.b a(User user) {
        h.f.b.l.d(user, "");
        f.a.t a2 = f.a.t.c(new m(user)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    public static final synchronized void d(String str) {
        synchronized (f.class) {
            MethodCollector.i(6817);
            h.f.b.l.d(str, "");
            if (h.f.b.l.a((Object) f142385j, (Object) str)) {
                MethodCollector.o(6817);
                return;
            }
            f142385j = str;
            Keva.getRepo("keva_aweme_account_user").storeString("last_recorded_sec_uid", str);
            MethodCollector.o(6817);
        }
    }

    public final synchronized void c(String str) {
        MethodCollector.i(6813);
        h.f.b.l.d(str, "");
        if (h.f.b.l.a((Object) f142384i, (Object) str)) {
            MethodCollector.o(6813);
            return;
        }
        f142384i = str;
        b().edit().putString("latest_logged_in_uid_list", str).apply();
        MethodCollector.o(6813);
    }

    public static a e(String str) {
        a aVar;
        T t;
        MethodCollector.i(6833);
        h.f.b.l.d(str, "");
        synchronized (f142376a) {
            try {
                Iterator<T> it = c().iterator();
                while (true) {
                    aVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f142402a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                h.k.c a2 = ab.a(a.class);
                if (h.f.b.l.a(a2, ab.a(User.class))) {
                    if (t2.a().f142394a) {
                        aVar = (a) t2.a().a();
                    } else {
                        aVar = (a) t2.a().a();
                    }
                } else if (h.f.b.l.a(a2, ab.a(a.class))) {
                    aVar = t2.b().a();
                } else if (h.f.b.l.a(a2, ab.a(c.class))) {
                    aVar = (a) t2.c().a();
                }
                MethodCollector.o(6833);
                return aVar;
            } finally {
                MethodCollector.o(6833);
            }
        }
    }

    public static c f(String str) {
        c cVar;
        T t;
        MethodCollector.i(6845);
        h.f.b.l.d(str, "");
        synchronized (f142376a) {
            try {
                Iterator<T> it = c().iterator();
                while (true) {
                    cVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f142402a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                h.k.c a2 = ab.a(c.class);
                if (h.f.b.l.a(a2, ab.a(User.class))) {
                    if (t2.a().f142394a) {
                        cVar = (c) t2.a().a();
                    } else {
                        cVar = (c) t2.a().a();
                    }
                } else if (h.f.b.l.a(a2, ab.a(a.class))) {
                    cVar = (c) t2.b().a();
                } else if (h.f.b.l.a(a2, ab.a(c.class))) {
                    cVar = t2.c().a();
                }
                MethodCollector.o(6845);
                return cVar;
            } finally {
                MethodCollector.o(6845);
            }
        }
    }

    public final void g(String str) {
        T t;
        MethodCollector.i(6971);
        h.f.b.l.d(str, "");
        if (h.f.b.l.a((Object) str, (Object) e())) {
            b("0");
        }
        synchronized (f142376a) {
            try {
                Iterator<T> it = c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f142402a, (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.e();
                }
                List<c> c2 = c();
                if (c2 != null) {
                    ad.b(c2).remove(t2);
                    SharedPreferences.Editor edit = b().edit();
                    List<String> l2 = l();
                    ArrayList arrayList = new ArrayList();
                    for (T t3 : l2) {
                        if (!h.f.b.l.a((Object) t3, (Object) str)) {
                            arrayList.add(t3);
                        }
                    }
                    edit.putString("logged_in_uid_list", h.a.n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62)).apply();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    MethodCollector.o(6971);
                    throw nullPointerException;
                }
            } catch (Throwable th) {
                MethodCollector.o(6971);
                throw th;
            }
        }
        f142377b.postValue(l());
        MethodCollector.o(6971);
    }
}
