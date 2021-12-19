package com.ss.android.ugc.aweme.main.uiApiImpl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.main.bb;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTab;
import com.ss.android.ugc.aweme.newfollow.ui.DiscoverSearchTab;
import com.ss.android.ugc.aweme.newfollow.ui.c;
import com.ss.android.ugc.aweme.node.a;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.Objects;

public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    static {
        Covode.recordClassIndex(70021);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void b() {
        ShareServiceImpl.d().c().b();
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View c() {
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) f.a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f99520f == null) {
            return null;
        }
        X2CFragmentMainPageIcon.a(x2CFragmentMainPageIcon.f99520f);
        m mVar = x2CFragmentMainPageIcon.f99520f;
        x2CFragmentMainPageIcon.f99520f = null;
        return mVar;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View d() {
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) f.a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f99519e == null) {
            return null;
        }
        X2CFragmentMainPageIcon.a(x2CFragmentMainPageIcon.f99519e);
        m mVar = x2CFragmentMainPageIcon.f99519e;
        x2CFragmentMainPageIcon.f99519e = null;
        return mVar;
    }

    public static HomePageUIFrameService e() {
        MethodCollector.i(3529);
        Object a2 = b.a(HomePageUIFrameService.class, false);
        if (a2 != null) {
            HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) a2;
            MethodCollector.o(3529);
            return homePageUIFrameService;
        }
        if (b.cz == null) {
            synchronized (HomePageUIFrameService.class) {
                try {
                    if (b.cz == null) {
                        b.cz = new HomePageUIFrameServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3529);
                    throw th;
                }
            }
        }
        HomePageUIFrameServiceCommonImpl homePageUIFrameServiceCommonImpl = (HomePageUIFrameServiceCommonImpl) b.cz;
        MethodCollector.o(3529);
        return homePageUIFrameServiceCommonImpl;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final com.bytedance.hox.b a(e eVar) {
        l.d(eVar, "");
        return new a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ar c(Context context) {
        l.d(context, "");
        return com.ss.android.ugc.aweme.newfollow.ui.b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ImageView d(e eVar) {
        l.d(eVar, "");
        return (ImageView) com.bytedance.tiktok.homepage.mainfragment.inflate.a.e(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View e(e eVar) {
        l.d(eVar, "");
        return com.bytedance.tiktok.homepage.mainfragment.inflate.a.b(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View g(e eVar) {
        if (eVar == null) {
            return null;
        }
        return com.bytedance.tiktok.homepage.mainfragment.inflate.a.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View i(e eVar) {
        if (eVar == null) {
            return null;
        }
        return com.bytedance.tiktok.homepage.mainfragment.inflate.a.d(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View k(e eVar) {
        if (eVar == null) {
            return null;
        }
        return com.bytedance.tiktok.homepage.mainfragment.inflate.a.c(eVar);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final o a(Context context) {
        l.d(context, "");
        if (MSAdaptionService.c().a(d.a())) {
            return new bb(context, null, null);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ImageView b(e eVar) {
        l.d(eVar, "");
        return (ImageView) ((MainFragmentTopRightIconInflate) f.b(MainFragmentTopRightIconInflate.class)).a(eVar, 6);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View h(e eVar) {
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) f.b(MainFragmentTopRightIconInflate.class);
        if (eVar == null) {
            return null;
        }
        View a2 = mainFragmentTopRightIconInflate.a(eVar, 4);
        if (a2 == null) {
            return i(eVar);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View j(e eVar) {
        MainFragmentTopRightIconInflate mainFragmentTopRightIconInflate = (MainFragmentTopRightIconInflate) f.b(MainFragmentTopRightIconInflate.class);
        if (eVar == null) {
            return null;
        }
        View a2 = mainFragmentTopRightIconInflate.a(eVar, 5);
        if (a2 == null) {
            return k(eVar);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final by b(Context context) {
        l.d(context, "");
        if (SearchServiceImpl.t().i()) {
            return new DiscoverCompassTab(context);
        }
        return new DiscoverSearchTab(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View c(e eVar) {
        l.d(eVar, "");
        return ((MainFragmentTopRightIconInflate) f.b(MainFragmentTopRightIconInflate.class)).a(eVar, 3);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final ar d(Context context) {
        l.d(context, "");
        return com.ss.android.ugc.aweme.newfollow.ui.b.b(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final Class<? extends Fragment> b(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    Class<? extends Fragment> a2 = com.ss.android.ugc.aweme.notice.api.services.b.f112773a.a();
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.Class<out androidx.fragment.app.Fragment>");
                    return a2;
                }
                break;
            case 2223327:
                if (str.equals("HOME")) {
                    return ae.class;
                }
                break;
            case 2614219:
                str.equals("USER");
                break;
            case 185242617:
                if (str.equals("page_profile")) {
                    return k.class;
                }
                break;
            case 883457358:
                if (str.equals("page_feed")) {
                    return MainPageFragment.class;
                }
                break;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return c.class;
                }
                break;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View f(e eVar) {
        ViewParent viewParent;
        MethodCollector.i(3522);
        MainFragmentTopLeftIconInflate mainFragmentTopLeftIconInflate = (MainFragmentTopLeftIconInflate) f.b(MainFragmentTopLeftIconInflate.class);
        ImageView imageView = null;
        if (eVar == null) {
            MethodCollector.o(3522);
            return null;
        }
        l.d(eVar, "");
        if (mainFragmentTopLeftIconInflate.f44201a == null) {
            mainFragmentTopLeftIconInflate.f44201a = com.bytedance.tiktok.homepage.mainfragment.inflate.a.a(eVar);
            if (com.ss.android.ugc.aweme.s.d.i()) {
                mainFragmentTopLeftIconInflate.c();
            }
        }
        ImageView imageView2 = mainFragmentTopLeftIconInflate.f44201a;
        if (imageView2 != null) {
            viewParent = imageView2.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(mainFragmentTopLeftIconInflate.f44201a);
        }
        ImageView imageView3 = mainFragmentTopLeftIconInflate.f44201a;
        mainFragmentTopLeftIconInflate.f44201a = null;
        if (imageView3 != null) {
            if (imageView3 instanceof ImageView) {
                imageView = imageView3;
            }
            ImageView imageView4 = imageView;
            MethodCollector.o(3522);
            return imageView4;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        MethodCollector.o(3522);
        throw nullPointerException;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void a(String str) {
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (!TextUtils.equals("HOME", str) && j2 != null) {
            UgCommonServiceImpl.j().a(j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final void a(e eVar, Bundle bundle) {
        l.d(eVar, "");
        l.d(bundle, "");
        IMService.createIIMServicebyMonsterPlugin(false).openSessionListActivity(eVar, bundle);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public final View.OnClickListener a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        switch (str.hashCode()) {
            case -1382453013:
                if (str.equals("NOTIFICATION")) {
                    return new com.ss.android.ugc.aweme.notification.view.a(context);
                }
                break;
            case 2223327:
                if (str.equals("HOME")) {
                    return new com.ss.android.ugc.aweme.main.bottomobserver.a(context);
                }
                break;
            case 482617583:
                if (str.equals("PUBLISH")) {
                    return new BottomPublishObserver(context);
                }
                break;
            case 1055811561:
                if (str.equals("DISCOVER")) {
                    return new com.ss.android.ugc.aweme.newfollow.ui.a(context);
                }
                break;
        }
        l.b();
        return null;
    }
}
