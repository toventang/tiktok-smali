package com.ss.android.ugc.aweme.commerce_sticker_impl.service;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService;
import com.ss.android.ugc.aweme.commerce_sticker_impl.b.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class CommerceStickerServiceImpl implements ICommerceStickerService {
    static {
        Covode.recordClassIndex(45292);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void a() {
        a.a();
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final com.ss.android.ugc.aweme.commerce_sticker_api.service.a b() {
        return new a();
    }

    public static ICommerceStickerService c() {
        Object a2 = b.a(ICommerceStickerService.class, false);
        if (a2 != null) {
            return (ICommerceStickerService) a2;
        }
        return new CommerceStickerServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void a(com.ss.android.ugc.aweme.commerce_sticker_api.a.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.f73584a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void a(String str) {
        if (str != null && str.length() != 0) {
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) new f().a(str, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("camera_ad", "click", awemeRawAd).b("refer", "sticker").b();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void b(String str) {
        if (str != null && str.length() != 0) {
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) new f().a(str, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("camera_ad", "show", awemeRawAd).b("refer", "sticker").b();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final com.ss.android.ugc.aweme.commerce_sticker_api.b.a a(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5) {
        l.d(viewStub, "");
        l.d(viewStub2, "");
        l.d(viewStub3, "");
        l.d(viewStub4, "");
        l.d(viewStub5, "");
        return new com.ss.android.ugc.aweme.commerce_sticker_impl.view.a(viewStub, viewStub2, viewStub3, viewStub4, viewStub5);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void a(boolean z, String str, String str2, String str3, Boolean bool) {
        if (!TextUtils.equals(a.f73588b, str3) && z && TextUtils.equals(str, "challenge") && !(true ^ l.a((Object) bool, (Object) true))) {
            c a2 = new c().a("shoot_way", str);
            if (str2 == null) {
                str2 = "";
            }
            c a3 = a2.a("challenge_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            com.bytedance.apm.b.a("autoselected_sticker_monitor", 0, a3.a("sticker_id", str3).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    public final void a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        if (!TextUtils.equals(a.f73588b, str)) {
            a.a();
            if (z) {
                a.f73588b = str;
                a.f73587a = new a.C1647a(str2, str4, str, SystemClock.elapsedRealtime());
                if (z2) {
                    d dVar = new d();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = str4;
                    }
                    r.a("commerce_prop_click", dVar.a("enter_from", str3).a("prop_id", str).f66730a);
                }
            }
        }
    }
}
