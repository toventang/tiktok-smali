package com.ss.android.ugc.aweme.feed.p;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93628a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93629b = i.a((h.f.a.a) C2271a.f93630a);

    public static com.ss.android.ugc.aweme.feed.p.b.b a() {
        return (com.ss.android.ugc.aweme.feed.p.b.b) f93629b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.a$a  reason: collision with other inner class name */
    static final class C2271a extends m implements h.f.a.a<com.ss.android.ugc.aweme.feed.p.b.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2271a f93630a = new C2271a();

        static {
            Covode.recordClassIndex(59575);
        }

        C2271a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.feed.p.b.b invoke() {
            return new com.ss.android.ugc.aweme.feed.p.b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93641a = new b();

        static {
            Covode.recordClassIndex(59576);
        }

        b() {
        }

        public final void run() {
            a.a().b();
        }
    }

    static {
        Covode.recordClassIndex(59574);
    }

    public static void b() {
        if (b.a()) {
            new Handler().postDelayed(b.f93641a, 5000);
        }
    }
}
