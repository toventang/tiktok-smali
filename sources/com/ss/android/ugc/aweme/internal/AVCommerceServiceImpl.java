package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class AVCommerceServiceImpl implements IInternalCommerceService {
    static {
        Covode.recordClassIndex(67173);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void c() {
        CommerceChallengeServiceImpl.e().b();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final LinkedHashMap<String, Bitmap> d() {
        return CommerceChallengeServiceImpl.e().c();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean e() {
        return CommerceMediaServiceImpl.f().c();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean f() {
        return CommerceMediaServiceImpl.f().e();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void g() {
        CommerceMediaServiceImpl.f().a(false);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean b() {
        if (g.a().A().a()) {
            return false;
        }
        return CommerceMediaServiceImpl.f().a();
    }

    public static IInternalCommerceService h() {
        MethodCollector.i(10575);
        Object a2 = b.a(IInternalCommerceService.class, false);
        if (a2 != null) {
            IInternalCommerceService iInternalCommerceService = (IInternalCommerceService) a2;
            MethodCollector.o(10575);
            return iInternalCommerceService;
        }
        if (b.bJ == null) {
            synchronized (IInternalCommerceService.class) {
                try {
                    if (b.bJ == null) {
                        b.bJ = new AVCommerceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10575);
                    throw th;
                }
            }
        }
        AVCommerceServiceImpl aVCommerceServiceImpl = (AVCommerceServiceImpl) b.bJ;
        MethodCollector.o(10575);
        return aVCommerceServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean a() {
        return CommerceMediaServiceImpl.f().b();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void a(int i2) {
        CommerceChallengeServiceImpl.e().a(i2);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final UrlModel a(String str) {
        return CommerceChallengeServiceImpl.e().a(str, true, true);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean a(Music music) {
        return CommerceMediaServiceImpl.f().a(music);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void a(String str, String str2) {
        CommerceChallengeServiceImpl.e().b(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final /* synthetic */ boolean a(Context context, String str, TextView textView, Boolean bool, String str2) {
        boolean booleanValue = bool.booleanValue();
        l.d(context, "");
        l.d(textView, "");
        return CommerceChallengeServiceImpl.e().a(context, str, true, textView, booleanValue, str2);
    }
}
