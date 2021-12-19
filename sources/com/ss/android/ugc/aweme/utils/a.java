package com.ss.android.ugc.aweme.utils;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.experiment.s;
import com.ss.android.ugc.aweme.video.b.f;
import com.ss.android.ugc.aweme.video.b.h;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig;
import com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.bytedance.ies.abmock.a.a f142584a = new com.bytedance.ies.abmock.a.a() {
        /* class com.ss.android.ugc.aweme.utils.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93271);
        }

        @Override // com.bytedance.ies.abmock.a.a
        public final void a() {
            a.a();
        }
    };

    static {
        Covode.recordClassIndex(93270);
    }

    public static void a() {
        boolean a2 = b.a().a(true, "ab_call_opt", false);
        if (a2 != c.f142752a) {
            c.f142752a = a2;
            com.ss.android.ugc.aweme.player.a.f114913a = a2;
        }
        if (a2) {
            i.b(b.f142655a, i.f4824a);
        }
    }

    static final /* synthetic */ Void b() {
        System.currentTimeMillis();
        try {
            s.f93086a = b.a().a(true, "share_guide", 0);
            h.f143290b = Boolean.valueOf(b.a().a(true, "enable_ies_route", true));
            PreloaderExperiment.videoNetworkSpeedAlgorithmExperimentValue = b.a().a(true, "video_network_speed_algorithm", 0);
            q.f143316a = f.a();
            SimKitCommonConfig.superResolutionStrategyExperimentValueInited = false;
            c.a();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
