package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import h.z;

public final class MusicSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123982a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81400);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81401);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        com.ss.android.ugc.aweme.share.i.a.a().a(bVar.a(), 0);
        return false;
    }
}
