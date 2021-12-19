package com.ss.android.ugc.aweme.ecommerce.address.edit.c;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity;
import com.ss.android.ugc.aweme.ecommerce.util.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84444a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.address.edit.a f84445c;

    static {
        Covode.recordClassIndex(52683);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52684);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void a() {
        com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar = this.f84445c;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void b() {
        com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar = this.f84445c;
        if (aVar != null) {
            aVar.h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AddressEditActivity addressEditActivity) {
        super(addressEditActivity);
        l.d(addressEditActivity, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.m
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar2 = this.f84445c;
        if (aVar2 != null) {
            aVar2.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.edit.c.c
    public final void a(Bundle bundle) {
        ((c) this).f84446b.setContentView(R.layout.nw);
        o.a(((c) this).f84446b.getWindow());
        new com.ss.android.ugc.aweme.crossplatform.activity.a(((c) this).f84446b);
        com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar = null;
        if (bundle != null) {
            Fragment a2 = ((c) this).f84446b.getSupportFragmentManager().a("address_edit_fragment");
            if (a2 instanceof com.ss.android.ugc.aweme.ecommerce.address.edit.a) {
                aVar = a2;
            }
            this.f84445c = aVar;
            return;
        }
        AddressPageStarter.AddressEditEnterParams a3 = AddressPageStarter.AddressEditEnterParams.a.a(((c) this).f84446b.getIntent());
        if (a3 != null) {
            aVar = new com.ss.android.ugc.aweme.ecommerce.address.edit.a();
            aVar.a(a3);
        }
        this.f84445c = aVar;
        if (aVar != null) {
            n a4 = ((c) this).f84446b.getSupportFragmentManager().a();
            RelativeLayout relativeLayout = (RelativeLayout) ((c) this).f84446b._$_findCachedViewById(R.id.ad7);
            l.b(relativeLayout, "");
            a4.a(relativeLayout.getId(), aVar, "address_edit_fragment").c();
        }
    }
}
