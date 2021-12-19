package com.ss.android.ugc.aweme.kids.profile.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f106741a = i.a((h.f.a.a) C2733b.f106744a);

    /* renamed from: b  reason: collision with root package name */
    private final h f106742b = i.a((h.f.a.a) a.f106743a);

    static {
        Covode.recordClassIndex(68230);
    }

    static final class a extends m implements h.f.a.a<IExternalService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f106743a = new a();

        static {
            Covode.recordClassIndex(68231);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.a.a
    public final Object a() {
        return this.f106741a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.a.b$b  reason: collision with other inner class name */
    static final class C2733b extends m implements h.f.a.a<com.ss.android.ugc.aweme.kids.api.account.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2733b f106744a = new C2733b();

        static {
            Covode.recordClassIndex(68232);
        }

        C2733b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.kids.api.account.a.a invoke() {
            return KidsAccountServiceImpl.h().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.a.a
    public final Object b() {
        return n.h((Iterable) ((IExternalService) this.f106742b.getValue()).draftService().draftList(false));
    }
}
