package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;

public abstract class ClosingChooseMediaPageState implements af {
    static {
        Covode.recordClassIndex(84534);
    }

    private ClosingChooseMediaPageState() {
    }

    public static final class Closed extends ClosingChooseMediaPageState {
        public static final Closed INSTANCE = new Closed();

        private Closed() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84535);
        }
    }

    public static final class Closing extends ClosingChooseMediaPageState {
        public static final Closing INSTANCE = new Closing();

        private Closing() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84536);
        }
    }

    public static final class Ready extends ClosingChooseMediaPageState {
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84537);
        }
    }

    public /* synthetic */ ClosingChooseMediaPageState(g gVar) {
        this();
    }
}
