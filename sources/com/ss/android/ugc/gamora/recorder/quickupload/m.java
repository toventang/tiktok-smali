package com.ss.android.ugc.gamora.recorder.quickupload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f148229a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(97692);
    }

    public static void a(String str, ShortVideoContext shortVideoContext) {
        l.d(str, "");
        l.d(shortVideoContext, "");
        r.a("fast_upload_photo_close", new b().a("enter_method", str).a("shoot_way", shortVideoContext.r).a("creation_id", shortVideoContext.q).f149193a);
    }
}
