package com.ss.android.ugc.aweme.share.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.z;

public final class ShareQRCodeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final b f123366a = new b((byte) 0);

    public interface RealApi {
        static {
            Covode.recordClassIndex(81020);
        }

        @t(a = "/tiktok/share/qrcode/create/v1/")
        @g
        i<com.ss.android.ugc.aweme.qrcode.d.a> getUserQRCodeInfo(@e(a = "schema_type") int i2, @e(a = "object_id") String str);
    }

    public interface a {
        static {
            Covode.recordClassIndex(81021);
        }

        void a(com.ss.android.ugc.aweme.qrcode.d.a aVar);

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(81019);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81022);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f123367a;

        static {
            Covode.recordClassIndex(81023);
        }

        c(a aVar) {
            this.f123367a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            Exception exc = null;
            com.ss.android.ugc.aweme.qrcode.d.a aVar = null;
            if (ai.a(iVar)) {
                a aVar2 = this.f123367a;
                if (iVar != null) {
                    aVar = (com.ss.android.ugc.aweme.qrcode.d.a) iVar.d();
                }
                aVar2.a(aVar);
            } else {
                a aVar3 = this.f123367a;
                if (iVar != null) {
                    exc = iVar.e();
                }
                aVar3.a(exc);
            }
            return z.f158842a;
        }
    }

    public static void a(int i2, String str, a aVar) {
        l.d(aVar, "");
        ((RealApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(RealApi.class)).getUserQRCodeInfo(i2, str).a(new c(aVar));
    }
}
