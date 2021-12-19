package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.editSticker.d.d;
import com.ss.android.ugc.aweme.editSticker.text.a.c;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.f.b.l;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f135740a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(88730);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.d
    public final void a(c cVar, boolean z, Exception exc) {
        int i2;
        ar a2;
        String c2;
        String str = "font_name";
        if (z) {
            i2 = 0;
            ar arVar = new ar();
            if (cVar == null) {
                l.b();
            }
            a2 = arVar.a("font_title", cVar.f88294b);
            c2 = cVar.f88297e;
        } else {
            i2 = 1;
            ar arVar2 = new ar();
            if (cVar == null) {
                l.b();
            }
            a2 = arVar2.a("font_title", cVar.f88294b).a(str, cVar.f88297e);
            if (exc == null) {
                c2 = "";
            } else {
                c2 = m.c(exc);
            }
            str = "exception";
        }
        q.a("font_resource_download_error_state", i2, a2.a(str, c2).a());
    }
}
