package com.bytedance.android.live.slot;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.e;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;

public interface IIconSlot {

    public interface a {
        static {
            Covode.recordClassIndex(7076);
        }

        void a(c cVar);

        void a(ab abVar, SlotViewModel slotViewModel);

        void a(ah ahVar, SlotViewModel slotViewModel);
    }

    static {
        Covode.recordClassIndex(7074);
    }

    ae a();

    Animator.AnimatorListener b();

    public enum b {
        SLOT_BROADCAST_PREVIEW_TOOLBAR,
        SLOT_LIVE_ANCHOR_TOOLBAR,
        SLOT_LIVE_WATCHER_TOOLBAR,
        SLOT_LIVE_WATCHER_L2_TOOLBAR,
        SLOT_BROADCAST_PREVIEW_PROMOTE,
        SLOT_BROADCAST_SHARE,
        SLOT_AUDIENCE_SHARE;

        static {
            Covode.recordClassIndex(7077);
        }
    }

    public enum c {
        PRIORITY,
        AGGREGATE,
        PREEMPTION,
        FIRST,
        LAST;

        static {
            Covode.recordClassIndex(7078);
        }
    }

    public static class SlotViewModel extends ac {

        /* renamed from: a  reason: collision with root package name */
        public final t<Boolean> f12713a = new t<>();

        /* renamed from: b  reason: collision with root package name */
        public final t<Boolean> f12714b = new t<>();

        /* renamed from: c  reason: collision with root package name */
        public final t<String> f12715c = new t<>();

        /* renamed from: d  reason: collision with root package name */
        public final t<Boolean> f12716d = new t<>();

        /* renamed from: e  reason: collision with root package name */
        public final t<Drawable> f12717e = new t<>();

        /* renamed from: f  reason: collision with root package name */
        public final t<Drawable> f12718f = new t<>();

        /* renamed from: g  reason: collision with root package name */
        public final t<Drawable> f12719g = new t<>();

        /* renamed from: h  reason: collision with root package name */
        public final t<Drawable> f12720h = new t<>();

        /* renamed from: i  reason: collision with root package name */
        public final t<String> f12721i = new t<>();

        /* renamed from: j  reason: collision with root package name */
        public final t<String> f12722j = new t<>();

        /* renamed from: k  reason: collision with root package name */
        public final t<String> f12723k = new t<>();

        /* renamed from: l  reason: collision with root package name */
        public final t<Boolean> f12724l = new t<>();

        /* renamed from: m  reason: collision with root package name */
        public long f12725m = 0;
        public String n;
        public String o;
        public Integer p;

        static {
            Covode.recordClassIndex(7075);
        }

        private void b(m mVar) {
            this.f12713a.removeObservers(mVar);
            this.f12714b.removeObservers(mVar);
            this.f12715c.removeObservers(mVar);
            this.f12716d.removeObservers(mVar);
            this.f12717e.removeObservers(mVar);
            this.f12720h.removeObservers(mVar);
            this.f12721i.removeObservers(mVar);
            this.f12722j.removeObservers(mVar);
            this.f12723k.removeObservers(mVar);
            this.f12719g.removeObservers(mVar);
            this.f12724l.removeObservers(mVar);
            this.f12718f.removeObservers(mVar);
        }

        public final void a(m mVar) {
            b(mVar);
            this.f12725m = 0;
            this.o = null;
            this.n = null;
            this.f12714b.setValue(false);
            this.f12715c.setValue(null);
            this.f12716d.setValue(false);
            this.f12717e.setValue(null);
            this.f12720h.setValue(null);
            this.f12721i.setValue(null);
            this.f12722j.setValue(null);
            this.f12723k.setValue(null);
            this.f12724l.setValue(false);
            this.f12719g.setValue(null);
            this.f12713a.setValue(false);
            this.f12718f.setValue(null);
        }

        public static SlotViewModel a(ab abVar, e eVar) {
            ac a2;
            ad a3 = ae.a(eVar, (ad.b) null);
            String str = abVar.e().name() + abVar.hashCode();
            if (SlotViewModel.class.equals(ScopeViewModel.class)) {
                a2 = a3.a(str, SlotViewModel.class);
            } else {
                a2 = a3.a(str, SlotViewModel.class);
                ab.a(a2, a3);
            }
            return (SlotViewModel) a2;
        }
    }
}
