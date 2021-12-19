package com.ss.android.ugc.aweme.kids.setting.items.language.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.b;
import h.f.b.l;
import java.util.Locale;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C2748a f107050b = new C2748a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f107051a;

    /* renamed from: c  reason: collision with root package name */
    private Locale f107052c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f107053d;

    /* renamed from: e  reason: collision with root package name */
    private final String f107054e;

    /* renamed from: f  reason: collision with root package name */
    private final String f107055f;

    /* renamed from: g  reason: collision with root package name */
    private final String f107056g;

    /* renamed from: h  reason: collision with root package name */
    private final String f107057h;

    static {
        Covode.recordClassIndex(68472);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.c.a$a  reason: collision with other inner class name */
    public static final class C2748a {
        static {
            Covode.recordClassIndex(68473);
        }

        private C2748a() {
        }

        public /* synthetic */ C2748a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String a() {
        return this.f107054e;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String b() {
        return this.f107055f;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String[] d() {
        return this.f107053d;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String e() {
        return this.f107056g;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String f() {
        return this.f107057h;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final Locale c() {
        if (this.f107052c == null) {
            this.f107052c = new Locale(this.f107055f, this.f107051a);
        }
        return this.f107052c;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f107054e = str;
        this.f107055f = str2;
        this.f107051a = str3;
        this.f107056g = str4;
        this.f107057h = str5;
    }
}
