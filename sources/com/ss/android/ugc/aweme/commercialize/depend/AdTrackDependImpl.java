package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.e;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.ug.g;
import h.f.b.l;
import h.z;

public final class AdTrackDependImpl implements IAdTrackDepend {
    static {
        Covode.recordClassIndex(45401);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String a() {
        String str = b.f59141e;
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String e() {
        String a2 = RawURLGetter.a("other");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final SharedPreferences b() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        SharedPreferences sharePref = inst.getSharePref();
        l.b(sharePref, "");
        return sharePref;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final boolean c() {
        Boolean a2 = s.a();
        l.b(a2, "");
        if (!a2.booleanValue() || !g.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String d() {
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        String adTrackerConfig = iESSettingsProxy.getAdTrackerConfig();
        l.b(adTrackerConfig, "");
        return adTrackerConfig;
    }

    public static IAdTrackDepend f() {
        MethodCollector.i(9760);
        Object a2 = com.ss.android.ugc.b.a(IAdTrackDepend.class, false);
        if (a2 != null) {
            IAdTrackDepend iAdTrackDepend = (IAdTrackDepend) a2;
            MethodCollector.o(9760);
            return iAdTrackDepend;
        }
        if (com.ss.android.ugc.b.an == null) {
            synchronized (IAdTrackDepend.class) {
                try {
                    if (com.ss.android.ugc.b.an == null) {
                        com.ss.android.ugc.b.an = new AdTrackDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9760);
                    throw th;
                }
            }
        }
        AdTrackDependImpl adTrackDependImpl = (AdTrackDependImpl) com.ss.android.ugc.b.an;
        MethodCollector.o(9760);
        return adTrackDependImpl;
    }

    static final class a implements com.ss.android.ugc.aweme.global.config.settings.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f73778a;

        static {
            Covode.recordClassIndex(45402);
        }

        a(h.f.a.a aVar) {
            this.f73778a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.global.config.settings.a
        public final void a(IESSettingsProxy iESSettingsProxy) {
            l.d(iESSettingsProxy, "");
            this.f73778a.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final int a(Exception exc) {
        l.d(exc, "");
        if (exc instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) {
            return ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) exc).getStatusCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String a2 = e.a(str, str2);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    public final void a(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        SettingsManagerProxy.inst().registerSettingsWatcher(new a(aVar), z);
    }
}
