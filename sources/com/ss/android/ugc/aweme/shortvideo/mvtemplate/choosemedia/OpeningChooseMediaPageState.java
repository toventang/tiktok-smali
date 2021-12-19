package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;

public abstract class OpeningChooseMediaPageState implements af {
    static {
        Covode.recordClassIndex(84572);
    }

    private OpeningChooseMediaPageState() {
    }

    public static final class NoSceneAnimation extends OpeningChooseMediaPageState {
        public static final NoSceneAnimation INSTANCE = new NoSceneAnimation();

        private NoSceneAnimation() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84573);
        }
    }

    public static final class OnSceneAnimationEnded extends OpeningChooseMediaPageState {
        public static final OnSceneAnimationEnded INSTANCE = new OnSceneAnimationEnded();

        private OnSceneAnimationEnded() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84574);
        }
    }

    public static final class OnSceneAnimationStarted extends OpeningChooseMediaPageState {
        public static final OnSceneAnimationStarted INSTANCE = new OnSceneAnimationStarted();

        private OnSceneAnimationStarted() {
            super(null);
        }

        static {
            Covode.recordClassIndex(84575);
        }
    }

    public /* synthetic */ OpeningChooseMediaPageState(g gVar) {
        this();
    }
}
