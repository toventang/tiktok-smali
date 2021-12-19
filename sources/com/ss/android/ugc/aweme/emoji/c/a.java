package com.ss.android.ugc.aweme.emoji.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.utils.d;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f89110a = C2153a.f89113a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f89111b = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f89112c;

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.a$a  reason: collision with other inner class name */
    static final class C2153a {

        /* renamed from: a  reason: collision with root package name */
        static a f89113a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C2153a f89114b = new C2153a();

        private C2153a() {
        }

        static {
            Covode.recordClassIndex(56043);
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(56044);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private a() {
        this.f89112c = true;
    }

    static {
        Covode.recordClassIndex(56042);
    }

    public final void a() {
        d a2 = d.a();
        l.b(a2, "");
        if (!TextUtils.equals(a2.g(), com.ss.android.ugc.aweme.emoji.utils.a.b()) || this.f89112c) {
            com.ss.android.ugc.aweme.emoji.h.a.a();
            d.a().f();
            this.f89112c = false;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
