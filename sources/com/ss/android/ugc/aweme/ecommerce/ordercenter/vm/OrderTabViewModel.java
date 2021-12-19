package com.ss.android.ugc.aweme.ecommerce.ordercenter.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.EntranceData;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabData;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabResponse;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderListTabInfo;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class OrderTabViewModel extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f86256d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Keva f86257a;

    /* renamed from: b  reason: collision with root package name */
    public final t<List<EntranceData>> f86258b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<OrderListTabInfo>> f86259c;

    /* renamed from: e  reason: collision with root package name */
    private final Keva.OnChangeListener f86260e;

    static {
        Covode.recordClassIndex(53991);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53992);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends f.a.g.b<ListOrderTabResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderTabViewModel f86262a;

        static {
            Covode.recordClassIndex(53994);
        }

        @Override // f.a.z
        public final void onComplete() {
            dispose();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(OrderTabViewModel orderTabViewModel) {
            this.f86262a = orderTabViewModel;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            dispose();
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            l.d(aVar, "");
            if (aVar.isCodeOK() && aVar.data != null) {
                this.f86262a.f86257a.storeString("list_order_tab_data", new f().b(aVar.data));
            }
            dispose();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f86257a.unRegisterChangeListener(this.f86260e);
    }

    public OrderTabViewModel() {
        b bVar = new b(this);
        this.f86260e = bVar;
        Keva repo = Keva.getRepo("ec_order_center_tab_data");
        l.b(repo, "");
        this.f86257a = repo;
        ListOrderTabData a2 = a();
        t<List<EntranceData>> tVar = new t<>();
        tVar.setValue(a2.getEntrances());
        this.f86258b = tVar;
        t<List<OrderListTabInfo>> tVar2 = new t<>();
        tVar2.setValue(a2.getTabs());
        this.f86259c = tVar2;
        this.f86257a.registerChangeListener(bVar);
    }

    /* access modifiers changed from: package-private */
    public final ListOrderTabData a() {
        try {
            Object a2 = new f().a(this.f86257a.getString("list_order_tab_data", "{}"), ListOrderTabData.class);
            l.b(a2, "");
            return (ListOrderTabData) a2;
        } catch (Throwable th) {
            com.bytedance.services.apm.api.a.a(th);
            return new ListOrderTabData(z.INSTANCE, z.INSTANCE);
        }
    }

    static final class b implements Keva.OnChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderTabViewModel f86261a;

        static {
            Covode.recordClassIndex(53993);
        }

        b(OrderTabViewModel orderTabViewModel) {
            this.f86261a = orderTabViewModel;
        }

        @Override // com.bytedance.keva.Keva.OnChangeListener
        public final void onChanged(Keva keva, String str) {
            if ("list_order_tab_data" == str) {
                OrderTabViewModel orderTabViewModel = this.f86261a;
                ListOrderTabData a2 = orderTabViewModel.a();
                if (!l.a(a2.getEntrances(), orderTabViewModel.f86258b.getValue())) {
                    orderTabViewModel.f86258b.postValue(a2.getEntrances());
                }
                if (!l.a(a2.getTabs(), orderTabViewModel.f86259c.getValue())) {
                    orderTabViewModel.f86259c.postValue(a2.getTabs());
                }
            }
        }
    }
}
