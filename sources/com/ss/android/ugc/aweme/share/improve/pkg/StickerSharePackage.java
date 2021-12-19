package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.c.d;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.sticker.model.g;
import h.f.b.l;

public final class StickerSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123993a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81412);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81413);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3226a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f123994a;

            static {
                Covode.recordClassIndex(81414);
            }

            public C3226a(g gVar) {
                this.f123994a = gVar;
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

            private static void a(String str, boolean z, g gVar) {
                if (z && gVar != null) {
                    c cVar = new c();
                    cVar.a(new com.ss.android.ugc.aweme.feed.u.a());
                    c.a aVar = new c.a();
                    aVar.f93987a = gVar.id;
                    aVar.f93988b = 1;
                    aVar.f93993g = 5;
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
                    a(hVar.c(), true, this.f123994a);
                }
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                ah.f123353b.a(bVar.a(), 0);
                a(bVar.a(), z, this.f123994a);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }
}
