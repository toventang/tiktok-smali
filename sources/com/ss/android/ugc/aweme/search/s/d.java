package com.ss.android.ugc.aweme.search.s;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f121605a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(79206);
    }

    public static int a(Word word) {
        l.d(word, "");
        String wordType = word.getWordType();
        if (wordType == null) {
            return -1;
        }
        int hashCode = wordType.hashCode();
        if (hashCode != 50) {
            if (hashCode != 54) {
                if (hashCode == 1567 && wordType.equals("10")) {
                    return 2131233639;
                }
                return -1;
            } else if (wordType.equals("6")) {
                return 2131233640;
            } else {
                return -1;
            }
        } else if (wordType.equals("2")) {
            return 2131233638;
        } else {
            return -1;
        }
    }
}
