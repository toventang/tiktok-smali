package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commerce_sticker_api.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import h.f.b.l;

public final class o implements a {
    static {
        Covode.recordClassIndex(45429);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final User a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final boolean b(String str) {
        l.d(str, "");
        return AVExternalServiceImpl.a().infoService().stickerInfo().idUnlocked(str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final boolean c(String str) {
        l.d(str, "");
        return AVExternalServiceImpl.a().infoService().stickerInfo().isScanUnLockType(str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final boolean a(String str) {
        return t.a(t.a(), str);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final boolean a(Context context, String str) {
        l.d(context, "");
        return w.a(context, str, false);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final void a(Context context, String str, String str2) {
        l.d(context, "");
        w.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final void a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        FestivalService.b().a(str, textView, viewGroup, textView2, imageView);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.a.a
    public final void a(Context context, String str, String str2, String str3, String str4, String str5) {
        l.d(context, "");
        l.d(str4, "");
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a(str4, str5, null);
        if (!w.a(context, str, false)) {
            w.a(context, str2, str3);
        }
    }
}
