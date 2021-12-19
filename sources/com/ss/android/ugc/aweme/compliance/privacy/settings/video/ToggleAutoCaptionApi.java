package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface ToggleAutoCaptionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77824a = a.f77825a;

    static {
        Covode.recordClassIndex(48230);
    }

    @o(a = "/tiktok/v1/caption/cla/")
    @e
    t<BaseResponse> toggleAutoCaptionSetting(@c(a = "aweme_id") String str, @c(a = "enable_auto_caption") boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f77825a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48231);
        }
    }
}
