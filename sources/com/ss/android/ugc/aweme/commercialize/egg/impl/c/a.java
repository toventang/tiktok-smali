package com.ss.android.ugc.aweme.commercialize.egg.impl.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.egg.b.b;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceEggOutService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final dz f74015a = eb.a(C1668a.f74017a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f74016b = new a();

    private a() {
    }

    public static b a() {
        return (b) f74015a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.c.a$a  reason: collision with other inner class name */
    static final class C1668a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1668a f74017a = new C1668a();

        static {
            Covode.recordClassIndex(45582);
        }

        C1668a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            ICommerceEggOutService commerceEggOutService;
            Object a2 = com.ss.android.ugc.b.a(ICommerceEggOutService.class, false);
            if (a2 != null) {
                commerceEggOutService = (ICommerceEggOutService) a2;
                if (commerceEggOutService == null) {
                    return null;
                }
            } else {
                commerceEggOutService = new CommerceEggOutService();
            }
            return commerceEggOutService.a();
        }
    }

    static {
        Covode.recordClassIndex(45581);
    }
}
