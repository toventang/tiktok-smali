package com.ss.android.ugc.aweme.specact.popup.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.CommonApi;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class SpecActRedPacketApi {

    /* renamed from: a  reason: collision with root package name */
    public static final ISpecActRedPacketApi f134498a = ((ISpecActRedPacketApi) RetrofitFactory.a().a(Api.f66569d).a(ISpecActRedPacketApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final CommonApi f134499b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f134500c = new a((byte) 0);

    public interface ISpecActRedPacketApi {
        static {
            Covode.recordClassIndex(87900);
        }

        @t(a = "/luckycat/tiktokm/v1/popup/click")
        i<String> requestOnPopupClick(@z(a = "name") String str, @z(a = "source") String str2, @z(a = "cancel") String str3, @z(a = "activity_id") String str4, @z(a = "activity_start_time") long j2, @z(a = "activity_end_time") long j3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87901);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi$a$a  reason: collision with other inner class name */
        static final class CallableC3495a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.specact.popup.a.i f134501a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f134502b;

            static {
                Covode.recordClassIndex(87902);
            }

            CallableC3495a(com.ss.android.ugc.aweme.specact.popup.a.i iVar, String str) {
                this.f134501a = iVar;
                this.f134502b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return SpecActRedPacketApi.f134498a.requestOnPopupClick(this.f134501a.f134433c, "client", this.f134502b, this.f134501a.f134434d, this.f134501a.p, this.f134501a.q).a(AnonymousClass1.f134503a, i.f4824a, null);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(com.ss.android.ugc.aweme.specact.popup.a.i iVar, String str) {
            l.d(iVar, "");
            l.d(str, "");
            i.b(new CallableC3495a(iVar, str), i.f4824a);
        }
    }

    static {
        Covode.recordClassIndex(87899);
        Object a2 = RetrofitFactory.a().a(Api.f66569d).a(CommonApi.class);
        l.b(a2, "");
        f134499b = (CommonApi) a2;
    }
}
