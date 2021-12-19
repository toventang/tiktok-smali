package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class LiveEventSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123965a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81390);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81391);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3223a extends m implements b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3223a f123966a = new C3223a();

            static {
                Covode.recordClassIndex(81392);
            }

            C3223a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
                l.d(bVar, "");
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEventSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        com.ss.android.ugc.aweme.share.i.a.a().a(bVar.a(), 0);
        return false;
    }
}
