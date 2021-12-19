package com.ss.android.ugc.aweme.sticker.m.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class b implements com.ss.android.ugc.aweme.sticker.presenter.handler.b.b {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f134952a;

    static {
        Covode.recordClassIndex(88222);
    }

    public b(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f134952a = shortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.b
    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.sticker.m.l.a("show_toast", ag.c(v.a("toast_type", "prop"), v.a("prop_id", str), v.a("enter_from", "video_shoot_page")));
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.b
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.sticker.m.l.a("click_transform_link", ag.c(v.a("prop_id", str), v.a("shoot_way", this.f134952a.r), v.a("carrier_type", str2)));
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        cr a2 = cr.a();
        l.b(a2, "");
        Boolean bool = a2.f125303i;
        l.b(bool, "");
        if (bool.booleanValue()) {
            cr a3 = cr.a();
            l.b(a3, "");
            a3.f125303i = false;
            return;
        }
        com.ss.android.ugc.aweme.sticker.m.l.a("show_transform_link", ag.c(v.a("prop_id", str), v.a("shoot_way", this.f134952a.r), v.a("carrier_type", str2)));
        cr a4 = cr.a();
        l.b(a4, "");
        a4.f125303i = true;
        cr a5 = cr.a();
        l.b(a5, "");
        a5.f125304j = true;
    }
}
