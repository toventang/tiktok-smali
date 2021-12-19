package com.ss.android.ugc.aweme.simkit.config;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.c;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.simkit.impl.b.b;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.videoview.d.h;
import com.ss.android.ugc.playerkit.videoview.d.n;
import com.ss.android.ugc.playerkit.videoview.d.p;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133493a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(87316);
    }

    public static h a() {
        ArrayList arrayList = new ArrayList();
        c a2 = d.a();
        l.a((Object) a2, "");
        ISimKitConfig b2 = a2.b();
        l.a((Object) b2, "");
        ICommonConfig commonConfig = b2.getCommonConfig();
        l.a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            c a3 = d.a();
            l.a((Object) a3, "");
            ISimKitConfig b3 = a3.b();
            l.a((Object) b3, "");
            ICommonConfig commonConfig2 = b3.getCommonConfig();
            l.a((Object) commonConfig2, "");
            List<n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            l.a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        c a4 = d.a();
        l.a((Object) a4, "");
        ISimKitConfig b4 = a4.b();
        l.a((Object) b4, "");
        if (b4.getPreloaderExperiment().PreloadTypeExperiment() == i.a.VideoCache) {
            arrayList.add(new b(s.b()));
        } else {
            i b5 = s.b();
            c a5 = d.a();
            l.a((Object) a5, "");
            ISimKitConfig b6 = a5.b();
            l.a((Object) b6, "");
            ICommonConfig commonConfig3 = b6.getCommonConfig();
            l.a((Object) commonConfig3, "");
            arrayList.add(new com.ss.android.ugc.aweme.simkit.impl.b.a(b5, commonConfig3.getVideoUrlHookHook()));
        }
        c a6 = d.a();
        l.a((Object) a6, "");
        ISimKitConfig b7 = a6.b();
        l.a((Object) b7, "");
        ICommonConfig commonConfig4 = b7.getCommonConfig();
        l.a((Object) commonConfig4, "");
        return new p(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }
}
