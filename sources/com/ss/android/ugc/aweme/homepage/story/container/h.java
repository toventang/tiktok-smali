package com.ss.android.ugc.aweme.homepage.story.container;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.story.c.b;
import com.ss.android.ugc.aweme.story.g;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static c f99313a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f99314b = i.f99320a;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f99315c;

    /* renamed from: d  reason: collision with root package name */
    static final boolean f99316d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f99317e = new h();

    /* renamed from: f  reason: collision with root package name */
    private static final h.h f99318f = i.a((h.f.a.a) a.f99319a);

    public static boolean a() {
        return ((Boolean) f99318f.getValue()).booleanValue();
    }

    private h() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f99319a = new a();

        static {
            Covode.recordClassIndex(63270);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(63269);
        boolean z2 = true;
        if (!g.f137757a.a() || b.a() == 5) {
            z = false;
        } else {
            z = true;
        }
        f99315c = z;
        if (!(b.a() == 6 || b.a() == 7)) {
            z2 = false;
        }
        f99316d = z2;
    }

    public static void b(String str) {
        l.d(str, "");
        a();
    }

    public static void a(String str) {
        l.d(str, "");
        if (!a()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "StoryContainer", str);
        }
    }

    public static String a(e eVar) {
        l.d(eVar, "");
        if (eVar != null) {
            String f2 = Hox.a.a(eVar).f(be.f68531c);
            if (l.a((Object) f2, (Object) "page_feed") && f2 != null) {
                String f3 = Hox.a.a(eVar).f(f2);
                if (l.a((Object) f3, (Object) "HOME") && f3 != null) {
                    return Hox.a.a(eVar).f(f3);
                }
            }
        }
        return "";
    }
}
