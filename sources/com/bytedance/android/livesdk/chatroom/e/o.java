package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.chatroom.api.StickerDonationRetrofitApi;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;

public final class o extends com.bytedance.ies.a.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.b.a f15378a = new f.a.b.a();

    public interface a extends com.bytedance.ies.a.a {
        static {
            Covode.recordClassIndex(8498);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.live.o oVar);

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(8497);
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        super.b();
        this.f15378a.dispose();
        this.f15378a.a();
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f15380a;

        static {
            Covode.recordClassIndex(8500);
        }

        c(o oVar) {
            this.f15380a = oVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a aVar = (a) this.f15380a.y;
            if (aVar != null) {
                aVar.a(th);
            }
        }
    }

    public final void a(Map<String, String> map) {
        l.d(map, "");
        this.f15378a.a(((StickerDonationRetrofitApi) e.a().a(StickerDonationRetrofitApi.class)).fetchStickerDonation(new StringBuilder("https://api.tiktokv.com/aweme/v1/donation/orgs/").toString(), map).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new b(this), new c(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f15379a;

        static {
            Covode.recordClassIndex(8499);
        }

        b(o oVar) {
            this.f15379a = oVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdkapi.depend.model.live.o oVar = (com.bytedance.android.livesdkapi.depend.model.live.o) obj;
            if (oVar == null) {
                a aVar = (a) this.f15379a.y;
                if (aVar != null) {
                    aVar.a(new IllegalArgumentException("data is null"));
                }
            } else if (oVar.f23158a == 0) {
                a aVar2 = (a) this.f15379a.y;
                if (aVar2 != null) {
                    aVar2.a(oVar);
                }
            } else {
                a aVar3 = (a) this.f15379a.y;
                if (aVar3 != null) {
                    aVar3.a(new IllegalArgumentException("status code is:" + oVar.f23158a));
                }
            }
        }
    }
}
