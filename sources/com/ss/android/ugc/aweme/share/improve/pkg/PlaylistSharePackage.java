package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class PlaylistSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123983a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81402);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81403);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaylistSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(b bVar, Context context) {
        l.d(bVar, "");
        l.d(context, "");
        return super.a(bVar, context);
    }
}
