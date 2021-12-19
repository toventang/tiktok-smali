package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.bb;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.money.growth.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.aweme.util.t;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fh;
import com.ss.android.ugc.b;
import h.f.b.l;

public class UgAllServiceImpl implements IUgAllService {
    static {
        Covode.recordClassIndex(38413);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void a() {
        i.b(t.f142554a, i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void b() {
        g.a.f99786a.f99780b = false;
        com.ss.android.ugc.aweme.contentlanguage.i iVar = j.a.a().f78196d;
        if (iVar != null) {
            iVar.b();
        }
    }

    public static IUgAllService c() {
        MethodCollector.i(4920);
        Object a2 = b.a(IUgAllService.class, false);
        if (a2 != null) {
            IUgAllService iUgAllService = (IUgAllService) a2;
            MethodCollector.o(4920);
            return iUgAllService;
        }
        if (b.w == null) {
            synchronized (IUgAllService.class) {
                try {
                    if (b.w == null) {
                        b.w = new UgAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4920);
                    throw th;
                }
            }
        }
        UgAllServiceImpl ugAllServiceImpl = (UgAllServiceImpl) b.w;
        MethodCollector.o(4920);
        return ugAllServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void c(Context context) {
        fg.c(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void b(Context context) {
        j.a.a().b(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final boolean d(Context context) {
        return fh.a(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void a(Context context) {
        new Handler(Looper.getMainLooper()).post(new dk(context));
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.t.b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void a(Context context, String str) {
        bb.f94317i = true;
        e.a(str, context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void a(Context context, Aweme aweme) {
        com.ss.android.ugc.aweme.contentlanguage.i iVar;
        j a2 = j.a.a();
        l.d(context, "");
        if (a2.f78196d == null || (iVar = a2.f78196d) == null || !iVar.isShowing()) {
            a2.b(context);
        } else if (ContentLanguageServiceImpl.f().a(aweme)) {
            com.ss.android.ugc.aweme.contentlanguage.i iVar2 = a2.f78196d;
            if (iVar2 != null) {
                iVar2.f78186c = System.currentTimeMillis();
            }
        } else {
            try {
                com.ss.android.ugc.aweme.contentlanguage.i iVar3 = a2.f78196d;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                a2.f78194b = true;
                if (f.a(com.ss.android.ugc.aweme.user.e.f142364k.a())) {
                    IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                    l.b(createIUserServicebyMonsterPlugin, "");
                    User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                    l.b(currentUser, "");
                    currentUser.setContentLanguageDialogShown(false);
                    return;
                }
                a2.f78193a.a(false);
                a2.f78193a.a("");
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }
}
