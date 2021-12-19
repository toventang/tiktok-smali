package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.d.f;
import h.f.b.l;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f93521d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f93522a;

    /* renamed from: b  reason: collision with root package name */
    public final String f93523b;

    /* renamed from: c  reason: collision with root package name */
    public final String f93524c;

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93525a = new b();

        static {
            Covode.recordClassIndex(59249);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(59247);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59248);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f93526a = new c();

        static {
            Covode.recordClassIndex(59250);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.getMessage();
            }
        }
    }

    public j(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        this.f93522a = aweme;
        this.f93523b = str;
        this.f93524c = str2;
    }
}
