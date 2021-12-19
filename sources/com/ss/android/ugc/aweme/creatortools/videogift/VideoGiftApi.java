package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.ExecutionException;
import l.b.e;
import l.b.f;

public final class VideoGiftApi {

    /* renamed from: a  reason: collision with root package name */
    public static SetGiftSettingsApi f78438a;

    /* renamed from: b  reason: collision with root package name */
    public static GetGiftEligibilityApi f78439b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f78440c = new a((byte) 0);

    public interface GetGiftEligibilityApi {
        static {
            Covode.recordClassIndex(48713);
        }

        @f(a = "/tiktok/v1/gift/eligibility/")
        t<e> getGiftEligibilityInfo();
    }

    public interface SetGiftSettingsApi {
        static {
            Covode.recordClassIndex(48714);
        }

        @com.bytedance.retrofit2.b.t(a = "/tiktok/v1/gift/setting/")
        @e
        t<g> setGiftSettings(@com.bytedance.retrofit2.b.e(a = "accept_video_gift") int i2);
    }

    static {
        Covode.recordClassIndex(48712);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48715);
        }

        private a() {
        }

        public static t<e> a() {
            try {
                if (VideoGiftApi.f78439b == null) {
                    VideoGiftApi.f78439b = (GetGiftEligibilityApi) RetrofitFactory.a().a(b.f59141e).a(GetGiftEligibilityApi.class);
                }
                GetGiftEligibilityApi getGiftEligibilityApi = VideoGiftApi.f78439b;
                if (getGiftEligibilityApi == null) {
                    l.b();
                }
                return getGiftEligibilityApi.getGiftEligibilityInfo();
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<e> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t<g> a(boolean z) {
            try {
                if (VideoGiftApi.f78438a == null) {
                    VideoGiftApi.f78438a = (SetGiftSettingsApi) RetrofitFactory.a().a(b.f59141e).a(SetGiftSettingsApi.class);
                }
                SetGiftSettingsApi setGiftSettingsApi = VideoGiftApi.f78438a;
                if (setGiftSettingsApi == null) {
                    l.b();
                }
                return setGiftSettingsApi.setGiftSettings(z ? 1 : 0);
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<g> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }
    }
}
