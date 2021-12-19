package com.bytedance.android.live.slot;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public interface IFrameSlot {

    public interface a {
        static {
            Covode.recordClassIndex(7071);
        }

        void a(c cVar);

        void a(ah ahVar, SlotViewModel slotViewModel);
    }

    static {
        Covode.recordClassIndex(7069);
    }

    View a(Context context);

    Animation a();

    Animation b();

    public enum b {
        SLOT_LIVE_BOTTOM_POP,
        SLOT_LIVE_WATCHER_L2_POP,
        SLOT_LIVE_WATCHER_L3_POP;

        static {
            Covode.recordClassIndex(7072);
        }
    }

    public enum c {
        PRIORITY,
        AGGREGATE,
        PREEMPTION,
        FIRST,
        LAST;

        static {
            Covode.recordClassIndex(7073);
        }
    }

    public static class SlotViewModel extends ac {

        /* renamed from: a  reason: collision with root package name */
        public final t<Pair<Boolean, String>> f12709a = new t<>();

        /* renamed from: b  reason: collision with root package name */
        public final t<Boolean> f12710b = new t<>();

        static {
            Covode.recordClassIndex(7070);
        }

        public final void a(m mVar) {
            this.f12709a.removeObservers(mVar);
            this.f12710b.removeObservers(mVar);
            this.f12709a.setValue(new Pair<>(false, "visibility_reason_dispose"));
            this.f12710b.setValue(null);
        }
    }
}
