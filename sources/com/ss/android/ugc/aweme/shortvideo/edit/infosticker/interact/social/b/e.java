package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.Character;

public final class e {
    static {
        Covode.recordClassIndex(83664);
    }

    public static final boolean a(String str) {
        l.d(str, "");
        Character.UnicodeBlock of = Character.UnicodeBlock.of(str.charAt(0));
        if (!l.a(of, Character.UnicodeBlock.ARABIC) && !l.a(of, Character.UnicodeBlock.HEBREW) && !l.a(of, Character.UnicodeBlock.THAANA) && !l.a(of, Character.UnicodeBlock.SYRIAC) && !l.a(of, Character.UnicodeBlock.MANDAIC) && !l.a(of, Character.UnicodeBlock.SAMARITAN) && !l.a(of, Character.UnicodeBlock.NKO)) {
            return false;
        }
        return true;
    }
}
