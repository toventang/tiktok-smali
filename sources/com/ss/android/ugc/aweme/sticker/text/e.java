package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.c.a.s;
import com.ss.android.ugc.aweme.editSticker.d.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.f.b.l;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f135736a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(88725);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.c
    public final void a() {
        g.a().I().a("effect_text_res_download_suc_rate", 0, new ar().a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.c
    public final void b() {
        g.a().I().a("effect_text_font_download_suc_rate", 0, new ar().a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.c
    public final void a(Throwable th, String str) {
        String str2 = "";
        l.d(str, str2);
        if (th != null) {
            str2 = s.b(th);
        }
        g.a().I().a("effect_text_res_download_suc_rate", 1, new ar().a("effectId", str).a("exception", str2).a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.c
    public final void b(Throwable th, String str) {
        String str2 = "";
        l.d(str, str2);
        if (th != null) {
            str2 = s.b(th);
        }
        g.a().I().a("effect_text_font_download_suc_rate", 1, new ar().a("effectId", str).a("exception", str2).a());
    }
}
