package com.ss.android.ugc.aweme.qrcode.presenter;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.qrcode.e.b;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import h.f.b.l;
import java.util.ArrayList;

public final class QrCodeScanImpl implements QrCodeScanService {
    static {
        Covode.recordClassIndex(77813);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a() {
        b.f119739a = false;
    }

    public static QrCodeScanService b() {
        Object a2 = com.ss.android.ugc.b.a(QrCodeScanService.class, false);
        if (a2 != null) {
            return (QrCodeScanService) a2;
        }
        return new QrCodeScanImpl();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final String a(String str) {
        l.d(str, "");
        String securityUrl = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSecurityUrl(str);
        l.b(securityUrl, "");
        return securityUrl;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).openDeepLinkActivity(context, str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a(Context context, ArrayList<String> arrayList) {
        l.d(arrayList, "");
        SmartRouter.buildRoute(context, "//stickers/detail").withParam("extra_stickers", arrayList).withParam("extra_sticker_from", "reuse").open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void b(Context context, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        SmartRouter.buildRoute(context, "//music/detail").withParam("id", str).withParam("extra_music_from", str2).open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void c(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        SmartRouter.buildRoute(context, "//challenge/detail").withParam("id", str).withParam("extra_challenge_from", str2).open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a(Context context, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        SmartRouter.buildRoute(context, "//aweme/detail").withParam("id", str).withParam("refer", str2).open();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a(String str, Activity activity, IMovieReuseService.b bVar) {
        l.d(str, "");
        l.d(activity, "");
        l.d(bVar, "");
        MovieReuseServiceImpl.a().a(str, activity, bVar);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final boolean a(Activity activity, String str, String str2) {
        l.d(activity, "");
        l.d(str2, "");
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).checkIsMinAppVersionNotSatisfied(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    public final void a(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener) {
        l.d(str, "");
        l.d(activity, "");
        l.d(downLoadFinishListener, "");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).downloadStickerHelper(str, str2, activity, z, downLoadFinishListener);
    }
}
