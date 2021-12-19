package com.ss.android.ugc.aweme.video.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.util.concurrent.ExecutionException;

public final class BitRateSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    private static final f f143260a = a.a(b.f59141e);

    /* access modifiers changed from: package-private */
    public interface RealApi {
        static {
            Covode.recordClassIndex(93768);
        }

        @l.b.f(a = "/aweme/v1/rate/settings/")
        q<RateSettingsResponse> fetchRateSettings();
    }

    static {
        Covode.recordClassIndex(93767);
    }

    public static RateSettingsResponse a() {
        int errorCode;
        try {
            return ((RealApi) f143260a.a(RealApi.class)).fetchRateSettings().get();
        } catch (ExecutionException e2) {
            if ((e2.getCause() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((errorCode = ((com.ss.android.ugc.aweme.base.api.a.a) e2.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        } catch (IncompatibleClassChangeError e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
