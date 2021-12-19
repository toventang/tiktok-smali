package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class TypeWords {
    public static final Companion Companion = new Companion(null);
    public boolean fromCache;
    public String imprId = "";
    public String logId;
    @c(a = "source")
    public final String source;
    @c(a = StringSet.type)
    public final String type;
    @c(a = "params")
    public final TypeWordsParams typeWordsParams;
    @c(a = "most_visit_users")
    public List<VisitedAccount> visitedAccount;
    @c(a = "words")
    public List<Word> words;

    static {
        Covode.recordClassIndex(50991);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(50992);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final void setImprId(String str) {
        l.d(str, "");
        this.imprId = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        if (p.a(this.source, "inbox", false)) {
            TypeWords typeWords = (TypeWords) obj;
            if (p.a(typeWords.source, "inbox", false)) {
                return l.a(this.words, typeWords.words);
            }
        }
        return super.equals(obj);
    }
}
