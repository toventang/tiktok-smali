package com.ss.android.ugc.aweme.discover;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.g;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.discover.repo.gson.TrendingTopicListTypeAdapterFactory;
import com.ss.android.ugc.aweme.discover.ui.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tools.utils.r;
import h.a.n;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.List;

public final class DiscoveryServiceImpl implements IDiscoveryService {
    static {
        Covode.recordClassIndex(49864);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean a(Aweme aweme, int i2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean a(User user, int i2) {
        return false;
    }

    public static final class a extends com.google.gson.b.a<TrendingTopicList> {
        static {
            Covode.recordClassIndex(49865);
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final c b() {
        return com.ss.android.ugc.aweme.discover.ui.search.a.f82640b;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment a() {
        return new m();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final List<Type> c() {
        return n.a(new a().type);
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final String d() {
        String a2 = d.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean e() {
        if (com.ss.android.ugc.aweme.discover.f.d.a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final boolean f() {
        if (com.ss.android.ugc.aweme.discover.f.d.a() == 2) {
            return true;
        }
        return false;
    }

    public static IDiscoveryService g() {
        MethodCollector.i(3149);
        Object a2 = b.a(IDiscoveryService.class, false);
        if (a2 != null) {
            IDiscoveryService iDiscoveryService = (IDiscoveryService) a2;
            MethodCollector.o(3149);
            return iDiscoveryService;
        }
        if (b.bb == null) {
            synchronized (IDiscoveryService.class) {
                try {
                    if (b.bb == null) {
                        b.bb = new DiscoveryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3149);
                    throw th;
                }
            }
        }
        DiscoveryServiceImpl discoveryServiceImpl = (DiscoveryServiceImpl) b.bb;
        MethodCollector.o(3149);
        return discoveryServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final g a(g gVar) {
        l.d(gVar, "");
        if (com.ss.android.ugc.aweme.discover.f.b.b()) {
            int b2 = r.b(com.bytedance.ies.ugc.appcontext.d.a());
            Resources system = Resources.getSystem();
            l.b(system, "");
            int a2 = b2 - h.g.a.a(TypedValue.applyDimension(1, 275.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.b(system2, "");
            gVar.a(new TrendingTopicListTypeAdapterFactory((a2 / h.g.a.a(TypedValue.applyDimension(1, 165.0f, system2.getDisplayMetrics()))) + 1));
        }
        return gVar;
    }
}
