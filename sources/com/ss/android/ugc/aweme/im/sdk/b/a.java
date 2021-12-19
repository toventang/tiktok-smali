package com.ss.android.ugc.aweme.im.sdk.b;

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
    public static final a f100096a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f100097b = i.a((h.f.a.a) C2457a.f100098a);

    public static Keva a() {
        return (Keva) f100097b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$a  reason: collision with other inner class name */
    static final class C2457a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2457a f100098a = new C2457a();

        static {
            Covode.recordClassIndex(63795);
        }

        C2457a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upvote_bounce_in_im");
        }
    }

    public static String b() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return g2.getCurUserId();
    }

    static {
        Covode.recordClassIndex(63794);
    }
}
