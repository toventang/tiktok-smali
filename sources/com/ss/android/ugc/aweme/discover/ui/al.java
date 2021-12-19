package com.ss.android.ugc.aweme.discover.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.l;

public interface al {

    public interface a {
        static {
            Covode.recordClassIndex(51215);
        }

        void a(int i2, Word word);

        void b(int i2, Word word);
    }

    public interface b {
        static {
            Covode.recordClassIndex(51216);
        }

        void a(SearchHistory searchHistory, int i2);

        void b();

        void b(SearchHistory searchHistory, int i2);

        void c();
    }

    public interface c {
        static {
            Covode.recordClassIndex(51217);
        }

        void a(VisitedAccount visitedAccount, int i2);

        void a(VisitedAccount visitedAccount, String str, int i2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(51218);
        }

        void a(Word word, int i2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(51219);
        }

        void a(RecyclerView.n nVar);

        void a(l lVar, int i2, int i3);

        void b(l lVar, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(51214);
    }
}
