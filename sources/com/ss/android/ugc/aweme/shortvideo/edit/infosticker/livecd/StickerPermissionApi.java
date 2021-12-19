package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import f.a.t;
import h.f.b.l;

public interface StickerPermissionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127772a = a.f127774b;

    static {
        Covode.recordClassIndex(83747);
    }

    @h(a = "tiktok/v1/sticker/permission/")
    t<StickerPermissionResponse> getStickerPermission();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f127773a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f127774b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(83748);
            AVApi b2 = AVApiImpl.b();
            l.b(b2, "");
            f127773a = b2.a();
        }
    }
}
