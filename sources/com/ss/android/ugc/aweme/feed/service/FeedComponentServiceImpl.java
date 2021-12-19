package com.ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.base.ui.anchor.e;
import com.ss.android.ugc.aweme.de;
import com.ss.android.ugc.aweme.df;
import com.ss.android.ugc.aweme.feed.adapter.an;
import com.ss.android.ugc.aweme.feed.adapter.cg;
import com.ss.android.ugc.aweme.feed.g;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.a.a;
import com.ss.android.ugc.aweme.recommend.k;
import com.ss.android.ugc.aweme.recommend.n;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class FeedComponentServiceImpl implements IFeedComponentService {

    /* renamed from: a  reason: collision with root package name */
    private an f93865a;

    static {
        Covode.recordClassIndex(59714);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final an a() {
        if (this.f93865a == null) {
            this.f93865a = new cg();
        }
        return this.f93865a;
    }

    public static IFeedComponentService b() {
        MethodCollector.i(2852);
        Object a2 = b.a(IFeedComponentService.class, false);
        if (a2 != null) {
            IFeedComponentService iFeedComponentService = (IFeedComponentService) a2;
            MethodCollector.o(2852);
            return iFeedComponentService;
        }
        if (b.bo == null) {
            synchronized (IFeedComponentService.class) {
                try {
                    if (b.bo == null) {
                        b.bo = new FeedComponentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2852);
                    throw th;
                }
            }
        }
        FeedComponentServiceImpl feedComponentServiceImpl = (FeedComponentServiceImpl) b.bo;
        MethodCollector.o(2852);
        return feedComponentServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final d a(float f2) {
        return new a(5, f2, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final <T> T a(Class<T> cls) {
        l.d(cls, "");
        if (l.a(cls, e.class)) {
            return (T) new de();
        }
        if (l.a(cls, com.ss.android.ugc.aweme.base.ui.anchor.d.class)) {
            return (T) new df();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final Boolean a(Activity activity) {
        Dialog dialog;
        l.d(activity, "");
        boolean z = false;
        if (n.a()) {
            k kVar = null;
            if (!(activity instanceof androidx.fragment.app.e)) {
                activity = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            if (eVar != null) {
                Fragment a2 = eVar.getSupportFragmentManager().a("RecommendUserDialogFragment");
                if (a2 instanceof k) {
                    kVar = a2;
                }
                k kVar2 = kVar;
                if (kVar2 != null && (dialog = kVar2.getDialog()) != null && dialog.isShowing() && kVar2.f120080b) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final List<AnchorCommonStruct> b(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : anchors) {
            if (t.getType() == ab.DONATION_STICKER.getTYPE()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final boolean a(Aweme aweme) {
        return com.ss.android.ugc.aweme.landpage.b.a.f107275a.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final com.ss.android.ugc.aweme.feed.e a(String str, int i2, s<ag> sVar, com.ss.android.ugc.aweme.feed.n.e eVar) {
        return new g(str, i2, sVar, eVar);
    }
}
