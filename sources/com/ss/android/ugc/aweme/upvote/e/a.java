package com.ss.android.ugc.aweme.upvote.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142210a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f142211b = i.a((h.f.a.a) C3798a.f142212a);

    public static Keva a() {
        return (Keva) f142211b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.e.a$a  reason: collision with other inner class name */
    static final class C3798a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3798a f142212a = new C3798a();

        static {
            Covode.recordClassIndex(92975);
        }

        C3798a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upvote_repo");
        }
    }

    public static boolean b() {
        return a().getBoolean(a("has_displayed_comment_panel_"), false);
    }

    public static void c() {
        a().storeBoolean(a("has_displayed_comment_panel_"), true);
    }

    public static int d() {
        return a().getInt(a("publish_anim_shown_count_"), 0);
    }

    static {
        Covode.recordClassIndex(92974);
    }

    public static String a(String str) {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return str + g2.getCurUserId();
    }
}
