package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.concurrent.ExecutionException;
import l.b.f;

public final class CreatorPlusApi {

    /* renamed from: a  reason: collision with root package name */
    public static final h f78387a = d.a(b.f78389a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f78388b = new a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$CreatorPlusApi  reason: collision with other inner class name */
    public interface AbstractC1822CreatorPlusApi {
        static {
            Covode.recordClassIndex(48679);
        }

        @f(a = "/tiktok/v1/creator/plus/enroll")
        t<BaseResponse> enrollForCreatorPlus();

        @f(a = "/tiktok/v1/creator/plus/features")
        t<d> getCreatorPlusFeatures();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48680);
        }

        private static AbstractC1822CreatorPlusApi c() {
            return (AbstractC1822CreatorPlusApi) CreatorPlusApi.f78387a.getValue();
        }

        private a() {
        }

        public static t<d> a() {
            try {
                return c().getCreatorPlusFeatures();
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<d> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }

        public static t<BaseResponse> b() {
            try {
                return c().enrollForCreatorPlus();
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<BaseResponse> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AbstractC1822CreatorPlusApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78389a = new b();

        static {
            Covode.recordClassIndex(48681);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AbstractC1822CreatorPlusApi invoke() {
            return RetrofitFactory.a().a(com.ss.android.c.b.f59141e).a(AbstractC1822CreatorPlusApi.class);
        }
    }

    static {
        Covode.recordClassIndex(48678);
    }
}
