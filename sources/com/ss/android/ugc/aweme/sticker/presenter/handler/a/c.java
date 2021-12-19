package com.ss.android.ugc.aweme.sticker.presenter.handler.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.p.f;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import h.f.b.l;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135368a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.presenter.m f135369b;

    static {
        Covode.recordClassIndex(88429);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88430);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(com.ss.android.ugc.aweme.sticker.presenter.m mVar) {
        this.f135369b = mVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final b a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        b a2 = aVar.a(cVar);
        if (this.f135369b != null && (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a)) {
            FaceStickerBean a3 = f.a(((com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar).f135378a);
            l.b(a3, "");
            if (!g.a(a3) && !a3.getTags().contains("transfer_touch")) {
                a3.getTypes().contains("FaceReplace3D");
            }
        }
        return a2;
    }
}
