package com.ss.android.ugc.aweme.im.sdk.relations.data.core.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;

public final class c extends a<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103075b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final b f103076c;

    static {
        Covode.recordClassIndex(66084);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66085);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
            l.d(cVar, "");
            return new c(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        super(cVar);
        l.d(cVar, "");
        this.f103076c = b.a.a(cVar);
    }

    public final boolean a(IMContact iMContact) {
        l.d(iMContact, "");
        return this.f103076c.a(iMContact);
    }
}
