package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.c.d;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class ChallengeSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123938a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81372);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final int describeContents() {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81373);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3222a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Challenge f123939a;

            static {
                Covode.recordClassIndex(81374);
            }

            public C3222a(Challenge challenge) {
                this.f123939a = challenge;
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.b(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void b(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(sharePackage, context);
            }

            private static void a(String str, boolean z, Challenge challenge) {
                if (z && challenge != null) {
                    c cVar = new c();
                    cVar.a(new com.ss.android.ugc.aweme.feed.u.a());
                    c.a aVar = new c.a();
                    aVar.f93987a = challenge.getCid();
                    aVar.f93988b = 1;
                    aVar.f93993g = 3;
                    aVar.f93994h = str;
                    cVar.a(aVar.a());
                }
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                if (d.a(hVar)) {
                    a(hVar.c(), true, this.f123939a);
                }
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                ah.f123353b.a(bVar.a(), 0);
                a(bVar.a(), z, this.f123939a);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }
}
