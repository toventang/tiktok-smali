package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.ew;
import h.f.b.l;

public final class SearchSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123991a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81409);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81410);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3225a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f123992a;

            static {
                Covode.recordClassIndex(81411);
            }

            public C3225a(String str) {
                this.f123992a = str;
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

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(hVar, sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                if (z) {
                    String a2 = bVar.a();
                    String str = this.f123992a;
                    d dVar = new d();
                    dVar.a("platform", a2);
                    l.b(dVar, "");
                    ew.a(str, dVar);
                    r.a("share_search_result", dVar.f66730a);
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }
}
