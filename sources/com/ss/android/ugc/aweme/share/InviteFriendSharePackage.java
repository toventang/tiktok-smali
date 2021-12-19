package com.ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.friends.f.c;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;

public final class InviteFriendSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123244b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f123245a;

    static {
        Covode.recordClassIndex(80948);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80949);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static InviteFriendSharePackage a(c cVar) {
            l.d(cVar, "");
            SharePackage.a c2 = new SharePackage.a().c("");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String a2 = cVar.a(in.j(g2.getCurUser()));
            l.b(a2, "");
            InviteFriendSharePackage inviteFriendSharePackage = new InviteFriendSharePackage(c2.d(a2).e("").a("text"));
            inviteFriendSharePackage.a(cVar);
            return inviteFriendSharePackage;
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f123245a = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteFriendSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InviteFriendSharePackage f123246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f123248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f123249d;

        static {
            Covode.recordClassIndex(80950);
        }

        b(InviteFriendSharePackage inviteFriendSharePackage, com.ss.android.ugc.aweme.sharer.b bVar, String str, Context context) {
            this.f123246a = inviteFriendSharePackage;
            this.f123247b = bVar;
            this.f123248c = str;
            this.f123249d = context;
        }

        @Override // com.ss.android.ugc.aweme.friends.f.c.b
        public final void a(String str) {
            String a2 = this.f123247b.a();
            if (a2.hashCode() == 96619420 && a2.equals("email")) {
                com.ss.android.ugc.aweme.sharer.b bVar = this.f123247b;
                l.b(str, "");
                bVar.a((h) new k(str, this.f123246a.f124592f, this.f123248c), this.f123249d);
                return;
            }
            com.ss.android.ugc.aweme.sharer.b bVar2 = this.f123247b;
            l.b(str, "");
            bVar2.a((h) new k(str, this.f123248c, null, 4), this.f123249d);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
        l.d(bVar, "");
        l.d(context, "");
        if (this.f123245a == null) {
            l.a("presenter");
        }
        c cVar = this.f123245a;
        if (cVar == null) {
            l.a("presenter");
        }
        String a2 = c.a(cVar.b(), bVar.a(), "invitevia", "invite_friends", false);
        ah.f123353b.a(bVar.a(), 2);
        com.ss.android.ugc.aweme.friends.e.a.a("find_friends_page", bVar.a(), (String) null, (String) null);
        String a3 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        c cVar2 = this.f123245a;
        if (cVar2 == null) {
            l.a("presenter");
        }
        cVar2.a(a2, new b(this, bVar, a3, context));
        return true;
    }
}
