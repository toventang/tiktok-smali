package com.ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.im.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.model.h;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class MainServiceHelperImpl implements IMainServiceHelper {
    static {
        Covode.recordClassIndex(79522);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final void goToTipsPage() {
        IMUnder16ProxyImpl.n().h();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final boolean isChatFunOfflineUnder16() {
        return a.a();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final boolean shouldRedictToTipsPage() {
        return a.b();
    }

    public final boolean shouldHideYellowDot() {
        return IMUnder16ProxyImpl.n().b();
    }

    public final Pair<Boolean, String> getBoeConfig() {
        Boolean valueOf = Boolean.valueOf(a.C2792a.f108997a.f108996a.enableBoe());
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        return new Pair<>(valueOf, localTestApi.getBoeLane());
    }

    public static IMainServiceHelper createIMainServiceHelperbyMonsterPlugin(boolean z) {
        MethodCollector.i(5194);
        Object a2 = b.a(IMainServiceHelper.class, z);
        if (a2 != null) {
            IMainServiceHelper iMainServiceHelper = (IMainServiceHelper) a2;
            MethodCollector.o(5194);
            return iMainServiceHelper;
        }
        if (b.dv == null) {
            synchronized (IMainServiceHelper.class) {
                try {
                    if (b.dv == null) {
                        b.dv = new MainServiceHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5194);
                    throw th;
                }
            }
        }
        MainServiceHelperImpl mainServiceHelperImpl = (MainServiceHelperImpl) b.dv;
        MethodCollector.o(5194);
        return mainServiceHelperImpl;
    }

    public final void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i2, String str2, String str3) {
        l.d(context, "");
        h hVar = new h();
        hVar.f103896a = urlModel;
        hVar.f103903h = com.ss.android.ugc.aweme.im.a.a(comment.getUser());
        hVar.f103898c = str;
        hVar.f103897b = comment.getCid();
        hVar.f103901f = i2;
        hVar.f103899d = str2;
        hVar.f103900e = str3;
        hVar.f103902g = comment.getText();
        Dialog commentReply = IMService.createIIMServicebyMonsterPlugin(false).commentReply(context, hVar);
        if (commentReply != null && (context instanceof MainActivity)) {
            TabChangeManager.a.a((e) context).a(new com.ss.android.ugc.aweme.im.b(new WeakReference(commentReply)));
        }
    }
}
