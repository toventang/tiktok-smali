package com.ss.android.ugc.aweme.service;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.assem.arch.b.v;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.newmedia.h;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.app.v;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.assem.digg.a;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.experiment.t;
import com.ss.android.ugc.aweme.feed.guide.i;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.b;
import h.f.b.ab;
import h.f.b.l;
import h.k.c;
import java.util.List;

public final class CommonFeedApiService implements ICommonFeedApiService {
    static {
        Covode.recordClassIndex(79342);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean e() {
        return k.f93530d;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final c<? extends v<? extends d>> a() {
        return ab.a(a.class);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final long b() {
        return v.a.f66895a.f66890a;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean c() {
        return i.b();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean d() {
        if (!com.ss.android.ugc.aweme.feed.assem.a.f91966a || !t.f93087a) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void f() {
        a.b.f109011a.a("feed_player_to_render", false);
        if (SettingsRequestServiceImpl.i().f() == 1) {
            e.b(true);
        }
    }

    public static ICommonFeedApiService g() {
        MethodCollector.i(9460);
        Object a2 = b.a(ICommonFeedApiService.class, false);
        if (a2 != null) {
            ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) a2;
            MethodCollector.o(9460);
            return iCommonFeedApiService;
        }
        if (b.dk == null) {
            synchronized (ICommonFeedApiService.class) {
                try {
                    if (b.dk == null) {
                        b.dk = new CommonFeedApiService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9460);
                    throw th;
                }
            }
        }
        CommonFeedApiService commonFeedApiService = (CommonFeedApiService) b.dk;
        MethodCollector.o(9460);
        return commonFeedApiService;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final List<AnchorCommonStruct> a(Aweme aweme) {
        return com.ss.android.ugc.aweme.feed.service.a.a().b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void a(Uri uri, boolean z) {
        String str;
        MethodCollector.i(9455);
        l.d(uri, "");
        if (f.b(uri)) {
            g a2 = g.a();
            for (String str2 : f.a(uri)) {
                if (!TextUtils.isEmpty(str2)) {
                    g.a aVar = new g.a((byte) 0);
                    aVar.f118912a = str2;
                    synchronized (a2) {
                        try {
                            if (!a2.f118910a.contains(aVar)) {
                                a2.f118910a.add(aVar);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(9455);
                            throw th;
                        }
                    }
                }
            }
            g.a().f118911b = true;
            try {
                if (!h.f59976a || !z) {
                    MethodCollector.o(9455);
                    return;
                }
                if (uri != null) {
                    String path = uri.getPath();
                    if (f.b(uri) && !m.a(path) && path.startsWith("/detail/")) {
                        str = uri.getLastPathSegment();
                        com.ss.android.ugc.aweme.feed.h.a.a().a(str, System.currentTimeMillis());
                        MethodCollector.o(9455);
                        return;
                    }
                }
                str = "";
                com.ss.android.ugc.aweme.feed.h.a.a().a(str, System.currentTimeMillis());
                MethodCollector.o(9455);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(9455);
    }
}
