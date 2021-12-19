package com.ss.android.ugc.aweme.contentlanguage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.dd.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import com.ss.android.ugc.d.a.c;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ContentLanguageServiceImpl implements IContentLanguageService {
    static {
        Covode.recordClassIndex(48450);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Activity b() {
        return g.b();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final int a() {
        return p.a.a().e();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String d() {
        return b.a().a();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final List<String> c() {
        return h.m.p.b(b.a().a(), new String[]{","});
    }

    public static IContentLanguageService f() {
        MethodCollector.i(3646);
        Object a2 = com.ss.android.ugc.b.a(IContentLanguageService.class, false);
        if (a2 != null) {
            IContentLanguageService iContentLanguageService = (IContentLanguageService) a2;
            MethodCollector.o(3646);
            return iContentLanguageService;
        }
        if (com.ss.android.ugc.b.aU == null) {
            synchronized (IContentLanguageService.class) {
                try {
                    if (com.ss.android.ugc.b.aU == null) {
                        com.ss.android.ugc.b.aU = new ContentLanguageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3646);
                    throw th;
                }
            }
        }
        ContentLanguageServiceImpl contentLanguageServiceImpl = (ContentLanguageServiceImpl) com.ss.android.ugc.b.aU;
        MethodCollector.o(3646);
        return contentLanguageServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String e() {
        j a2 = j.a.a();
        if (!f.a(e.f142364k.a())) {
            return a2.f78193a.b();
        }
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> userAddLanguages = inst.getUserAddLanguages();
        l.b(userAddLanguages, "");
        String c2 = userAddLanguages.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void a(Activity activity) {
        j.a.a().a(activity);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void a(a aVar) {
        com.ss.android.ugc.aweme.settingsrequest.e.a.a(aVar, false);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void a(String str) {
        l.d(str, "");
        l.d(str, "");
        List g2 = n.g((Collection) h.m.p.b(b.a().a(), new String[]{","}));
        if (b.a(g2, str, true)) {
            b.a().a(n.a(g2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Pair<Boolean, String> a(Context context) {
        if ((context instanceof Activity) && (context instanceof MainActivity)) {
            Fragment curFragment = ((MainActivity) context).getCurFragment();
            if (curFragment instanceof ae) {
                z s = ((ae) curFragment).l();
                if ((s instanceof af) && s.isResumed() && s.getUserVisibleHint()) {
                    Aweme aweme = null;
                    if (s.a().booleanValue() && ((af) s).n.aE() == 0) {
                        return new Pair<>(false, null);
                    }
                    af afVar = (af) s;
                    if (afVar.n != null) {
                        aweme = afVar.n.aD();
                    }
                    if (a(aweme)) {
                        return new Pair<>(true, afVar.t);
                    }
                }
            }
        }
        return new Pair<>(false, "");
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        ArrayList arrayList = new ArrayList();
        for (T t : h.m.p.b(b.a().a(), new String[]{","})) {
            if (!TextUtils.isEmpty(t)) {
                arrayList.add(t);
            }
        }
        List g2 = n.g((Collection) arrayList);
        String languageCode = aVar.getLanguageCode();
        l.b(languageCode, "");
        if (!b.a(g2, languageCode, false)) {
            String languageCode2 = aVar.getLanguageCode();
            l.b(languageCode2, "");
            g2.add(languageCode2);
            b.a().a(n.a(g2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void a(boolean z) {
        c.a(new com.ss.android.ugc.aweme.feed.i.z(false));
        if (z) {
            com.ss.android.ugc.aweme.feed.cache.e.m();
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final boolean a(Aweme aweme) {
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34769d || i.e() || com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final com.ss.android.ugc.aweme.contentlanguage.api.a a(List<String> list, List<com.ss.android.ugc.aweme.setting.serverpush.a.a> list2) {
        if (com.bytedance.common.utility.collection.b.a((Collection) list) || com.bytedance.common.utility.collection.b.a((Collection) list2)) {
            return new com.ss.android.ugc.aweme.contentlanguage.api.a(null, list2);
        }
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            l.b();
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            if (list == null) {
                l.b();
            }
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList2.add(t);
                    break;
                }
                if (h.m.p.a(t2.getLanguageCode(), it.next(), true)) {
                    com.ss.android.ugc.aweme.setting.serverpush.a.a aVar = new com.ss.android.ugc.aweme.setting.serverpush.a.a();
                    aVar.setLanguageCode(t2.getLanguageCode());
                    aVar.setLocalName(t2.getLocalName());
                    aVar.setEnglishName(t2.getEnglishName());
                    arrayList.add(aVar);
                    break;
                }
            }
        }
        return new com.ss.android.ugc.aweme.contentlanguage.api.a(arrayList, arrayList2);
    }
}
