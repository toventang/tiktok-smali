package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.File;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127199a = new a((byte) 0);

    static {
        Covode.recordClassIndex(83433);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83434);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b, com.ss.android.ugc.aweme.editSticker.compile.c
    public final String a(String str, int i2) {
        String str2 = "";
        if (str != null) {
            String str3 = File.separator;
            l.b(str3, str2);
            if (p.c(str, str3, false) || (str + File.separator) != null) {
                str2 = str;
            }
        }
        return str2 + "interact_sticker_" + i2 + ".png";
    }
}
