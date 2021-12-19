package com.ss.android.ugc.aweme.services.connection;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public interface IConnectionEntranceService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79589);
    }

    int bubbleTime();

    void checkShowConnectionEntrance(m mVar, int i2);

    String getSchema();

    void hideConnectionEntrance();

    boolean isShowConnectionEntrance();

    void setConnectionEntranceHasClickedToday();

    void setConnectionEntranceHasShowBubbleToday();

    void showConnectionEntrance();

    boolean withAnimation();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79590);
        }
    }
}
