package com.ss.android.ugc.aweme.donation;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.donation.detail.c;
import com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public final class DonationServiceImpl implements IDonationService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82955a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51721);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51722);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final IInterceptor a() {
        return new c();
    }

    public static IDonationService b() {
        MethodCollector.i(2572);
        Object a2 = com.ss.android.ugc.b.a(IDonationService.class, false);
        if (a2 != null) {
            IDonationService iDonationService = (IDonationService) a2;
            MethodCollector.o(2572);
            return iDonationService;
        }
        if (com.ss.android.ugc.b.bd == null) {
            synchronized (IDonationService.class) {
                try {
                    if (com.ss.android.ugc.b.bd == null) {
                        com.ss.android.ugc.b.bd = new DonationServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2572);
                    throw th;
                }
            }
        }
        DonationServiceImpl donationServiceImpl = (DonationServiceImpl) com.ss.android.ugc.b.bd;
        MethodCollector.o(2572);
        return donationServiceImpl;
    }

    static final class b extends m implements h.f.a.b<String, z> {
        final /* synthetic */ Bundle $bundle = null;
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(51723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, Bundle bundle) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putString("title", this.$context.getString(R.string.bav));
            bundle.putString("enter_from", "donation_sticker_consume");
            bundle.putString("hide_more", "false");
            Bundle bundle2 = this.$bundle;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            DonationWebPageDialogActivity.a.a(this.$context, bundle);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final void a(Context context, String str, String str2) {
        l.d(context, "");
        com.ss.android.ugc.aweme.donation.token.a.a(context, str, 1, str2, new JSONObject().toString(), new b(context, null));
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final com.bytedance.tux.sheet.sheet.a a(int i2, String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        com.ss.android.ugc.aweme.donation.detail.b bVar = new com.ss.android.ugc.aweme.donation.detail.b();
        bundle.putInt("ngo_id", i2);
        bundle.putString("profile_uid", str);
        bundle.putInt("item_type", 3);
        bVar.setArguments(bundle);
        return new a.C1112a().a(bVar).a(0).b(false).f45299a;
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final com.bytedance.tux.sheet.sheet.a b(int i2, String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        com.ss.android.ugc.aweme.donation.detail.b bVar = new com.ss.android.ugc.aweme.donation.detail.b();
        bundle.putInt("ngo_id", i2);
        bundle.putString("sticker_id", str);
        bundle.putInt("item_type", 4);
        bVar.setArguments(bundle);
        return new a.C1112a().a(bVar).a(0).b(false).f45299a;
    }
}
