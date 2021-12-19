package com.ss.android.ugc.aweme.service;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bridge.GetContactMethod;
import com.ss.android.ugc.aweme.bridge.GetEOYUserInfoMethod;
import com.ss.android.ugc.aweme.bridge.OpenInviteHalfDialogMethod;
import com.ss.android.ugc.aweme.bridge.OpenQuestionPostPageMethod;
import com.ss.android.ugc.aweme.bridge.OpenRecordFromQaMethod;
import com.ss.android.ugc.aweme.bridge.OpenVideoDetailMethod;
import com.ss.android.ugc.aweme.bridge.RequestBarrageListMethod;
import com.ss.android.ugc.aweme.bridge.RequestQuestionListMethod;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.settings.f;
import com.ss.android.ugc.aweme.util.i;
import com.ss.android.ugc.aweme.util.l;
import com.ss.android.ugc.b;
import h.a.n;
import h.a.z;
import h.m.p;
import h.v;
import java.util.Iterator;
import java.util.List;

public final class EOYServiceImpl implements IEOYService {
    static {
        Covode.recordClassIndex(79349);
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final String a() {
        if (!x.a()) {
            return null;
        }
        return f.a("applink", "click_link");
    }

    public static IEOYService b() {
        MethodCollector.i(2810);
        Object a2 = b.a(IEOYService.class, false);
        if (a2 != null) {
            IEOYService iEOYService = (IEOYService) a2;
            MethodCollector.o(2810);
            return iEOYService;
        }
        if (b.dl == null) {
            synchronized (IEOYService.class) {
                try {
                    if (b.dl == null) {
                        b.dl = new EOYServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2810);
                    throw th;
                }
            }
        }
        EOYServiceImpl eOYServiceImpl = (EOYServiceImpl) b.dl;
        MethodCollector.o(2810);
        return eOYServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final boolean a(TextView textView) {
        if (textView == null) {
            return false;
        }
        return l.a(textView);
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final void b(String str) {
        h.f.b.l.d(str, "");
        if (x.a()) {
            r.a("eoy_banner_show", v.a(str, "enter_from"));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        h.f.b.l.d(bVar, "");
        if (!x.a()) {
            return z.INSTANCE;
        }
        return n.d(new GetContactMethod(bVar), new GetEOYUserInfoMethod(bVar), new OpenInviteHalfDialogMethod(bVar), new OpenQuestionPostPageMethod(bVar), new OpenVideoDetailMethod(bVar), new OpenRecordFromQaMethod(bVar), new RequestQuestionListMethod(bVar), new RequestBarrageListMethod(bVar));
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str, "");
        Iterator<T> it = x.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (p.a((CharSequence) str, (CharSequence) next, false)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final boolean a(Context context, String str) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        if (!x.a() || !h.f.b.l.a((Object) Uri.parse(str).getQueryParameter("_is_eoy"), (Object) "1")) {
            return false;
        }
        SmartRouter.buildRoute(context, f.a("chat", "click_message")).open();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final boolean a(ViewGroup viewGroup, String str) {
        MethodCollector.i(2807);
        h.f.b.l.d(str, "");
        if (!x.a()) {
            MethodCollector.o(2807);
            return false;
        } else if (viewGroup == null) {
            MethodCollector.o(2807);
            return false;
        } else {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (viewGroup.getChildAt(i2) instanceof com.ss.android.ugc.aweme.view.f) {
                    MethodCollector.o(2807);
                    return false;
                }
            }
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.view.f fVar = new com.ss.android.ugc.aweme.view.f(context, (byte) 0);
            fVar.setEnterFrom(str);
            viewGroup.addView(fVar, 0, new ViewGroup.LayoutParams(-1, -2));
            MethodCollector.o(2807);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IEOYService
    public final void a(boolean z, TextView textView, TextView textView2, View view) {
        String url;
        h.f.b.l.d(textView, "");
        h.f.b.l.d(textView2, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(textView, "");
        h.f.b.l.d(textView2, "");
        h.f.b.l.d(view, "");
        l.a(textView2);
        if (x.a()) {
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            h.f.b.l.b(e2, "");
            User curUser = e2.getCurUser();
            h.f.b.l.b(curUser, "");
            ProfileBadgeStruct profileBadge = curUser.getProfileBadge();
            if (profileBadge != null && (url = profileBadge.getUrl()) != null && url.length() > 0) {
                view.setVisibility(0);
                ViewParent parent = textView.getParent();
                if (!(parent instanceof View)) {
                    parent = null;
                }
                View view2 = (View) parent;
                if (view2 != null) {
                    view2.setOnClickListener(new i.a(z));
                }
            }
        }
    }
}
