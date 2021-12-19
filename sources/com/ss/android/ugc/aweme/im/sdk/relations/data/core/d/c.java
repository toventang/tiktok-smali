package com.ss.android.ugc.aweme.im.sdk.relations.data.core.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.Comparator;
import java.util.Objects;

public final class c extends a<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103103b = new a((byte) 0);

    static {
        Covode.recordClassIndex(66106);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66107);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103104a = new b();

        static {
            Covode.recordClassIndex(66108);
        }

        b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            IMContact iMContact = (IMContact) obj;
            IMContact iMContact2 = (IMContact) obj2;
            Objects.requireNonNull(iMContact2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            Long valueOf = Long.valueOf(((IMUser) iMContact2).getFriendRecTime());
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            return h.b.a.a(valueOf, Long.valueOf(((IMUser) iMContact).getFriendRecTime()));
        }
    }
}
