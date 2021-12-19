package com.ss.android.ugc.aweme.share.qrcode.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import h.z;

public final class QRCodeSharePackage extends SharePackage {

    /* renamed from: b  reason: collision with root package name */
    public static final b f124202b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f124203a;

    public interface a {
        static {
            Covode.recordClassIndex(81578);
        }

        void a(com.ss.android.ugc.aweme.sharer.b bVar, Context context);
    }

    static {
        Covode.recordClassIndex(81577);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81579);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QRCodeSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        a aVar = this.f124203a;
        if (aVar != null) {
            aVar.a(bVar, context);
        }
        bVar2.invoke(true);
        return true;
    }
}
