package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.IAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface IAwemeList<T extends IAwemeList<T>> {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(50903);
    }

    List<Aweme> getIAwemeList();

    int getICursor();

    int getIHasMore();

    int getIStatusCode();

    void setIAwemeList(List<Aweme> list);

    void setICursor(int i2);

    void setIHasMore(int i2);

    void setIStatusCode(int i2);

    void updateData(T t);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(50904);
        }
    }
}
