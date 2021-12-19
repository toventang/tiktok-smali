package com.ss.android.ugc.aweme.journey;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.HashMap;
import java.util.List;

public abstract class p {

    /* renamed from: i  reason: collision with root package name */
    public static final h f104882i = i.a((h.f.a.a) b.f104892a);

    /* renamed from: j  reason: collision with root package name */
    public static final a f104883j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f104884a;

    /* renamed from: b  reason: collision with root package name */
    public String f104885b;

    /* renamed from: c  reason: collision with root package name */
    public int f104886c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f104887d;

    /* renamed from: e  reason: collision with root package name */
    public final h f104888e = i.a(m.NONE, new c(this));

    /* renamed from: f  reason: collision with root package name */
    public boolean f104889f;

    /* renamed from: g  reason: collision with root package name */
    public int f104890g = -1;

    /* renamed from: h  reason: collision with root package name */
    public StringBuilder f104891h = new StringBuilder();

    public boolean S_() {
        return false;
    }

    public r a(Context context, Boolean bool) {
        l.d(context, "");
        return null;
    }

    public void a(boolean z) {
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract String g();

    public static final class a {
        static {
            Covode.recordClassIndex(67256);
        }

        public static p a() {
            return (p) p.f104882i.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Intent intent) {
            String str;
            if (intent != null) {
                str = a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, "HOME")) {
                return true;
            }
            return false;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(67255);
    }

    public final boolean h() {
        if (d() != 2 || this.f104884a || this.f104887d) {
            return false;
        }
        return true;
    }

    static final class b extends h.f.b.m implements h.f.a.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104892a = new b();

        static {
            Covode.recordClassIndex(67257);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ p invoke() {
            p a2 = z.f105220a.a(1);
            if (a2.d() != 0) {
                return a2;
            }
            p a3 = z.f105220a.a(2);
            if (a3.d() != 0) {
                return a3;
            }
            p a4 = z.f105220a.a(3);
            if (a4.d() != 0) {
                return a4;
            }
            return new c();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(67258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (q.f104896d.contains(q.a()) || q.f104898f.contains(q.a()) ? this.this$0.e() == 10 : q.f104895c.contains(q.a())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public final String a(int i2) {
        if (d() == 0) {
            return null;
        }
        if (i2 == 4) {
            HashMap hashMap = new HashMap();
            hashMap.put("recommend_group", Integer.valueOf(e()));
            hashMap.put("special_type", Integer.valueOf(this.f104886c));
            return dg.a().b(hashMap);
        } else if (TextUtils.isEmpty(this.f104885b)) {
            return null;
        } else {
            String str = this.f104885b;
            this.f104885b = null;
            return str;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        try {
            this.f104891h.append(str + ' ');
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String b(List<w> list, int i2) {
        l.d(list, "");
        g gVar = new g();
        gVar.f54715e = false;
        String b2 = gVar.b().b(new af(list, Integer.valueOf(f()), Integer.valueOf(this.f104886c), Integer.valueOf(i2)));
        this.f104885b = b2;
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    public final String a(List<w> list, int i2) {
        l.d(list, "");
        g gVar = new g();
        gVar.f54715e = false;
        String b2 = gVar.b().b(new af(list, Integer.valueOf(f()), Integer.valueOf(this.f104886c), Integer.valueOf(i2)));
        this.f104885b = b2;
        if (b2 == null) {
            return "";
        }
        return b2;
    }
}
