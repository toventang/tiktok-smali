package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.c.a;
import com.ss.android.ugc.aweme.feed.ui.seekbar.c.b;
import com.ss.android.ugc.aweme.feed.ui.seekbar.d;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class g extends b {
    static {
        Covode.recordClassIndex(60271);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.feed.ui.seekbar.a.b
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(63, new org.greenrobot.eventbus.g(g.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(164, new org.greenrobot.eventbus.g(g.class, "onFullFeedFragmentLifeCycleEvent", a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.a.h
    public final void b(boolean z) {
        a(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void b(SeekBar seekBar) {
        super.b(seekBar);
        com.ss.android.ugc.aweme.framework.a.a.a(3, b.x, "onStopTrackingTouch");
        c.a(new b(false, this.f95059a));
        this.f95065g = false;
    }

    @r
    public final void onDislikeAwemeEvent(f fVar) {
        l.d(fVar, "");
        if (fVar.f93476b == 1 && fVar.f93475a) {
            a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.b
    public final void a(MotionEvent motionEvent) {
        Integer valueOf;
        super.a(motionEvent);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && this.f95064f && !this.f95065g) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, b.x, "dispatchTouchEvent#move ");
            c.a(new b(true, this.f95059a));
            this.f95065g = true;
        }
    }

    @r
    public final void onFullFeedFragmentLifeCycleEvent(a aVar) {
        l.d(aVar, "");
        this.f95060b = aVar.f95089a;
        if ((!l.a(this.f95059a, aVar.f95090b)) && (!l.a(this.f95068j, aVar.f95091c))) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, b.x, "onFullFeedFragmentLifeCycleEvent");
            c.a(new b(false, this.f95059a));
        }
        this.f95059a = aVar.f95090b;
        this.f95068j = aVar.f95091c;
        int i2 = this.f95060b;
        if (i2 == 1) {
            a();
        } else if (i2 == 2) {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b
    public final boolean a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        l.d(obj, "");
        Object obj7 = null;
        if (!(obj instanceof d)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if (l.a(obj, obj2)) {
            return c.a(((d) obj).f95096b);
        }
        if (!(obj instanceof com.ss.android.ugc.aweme.feed.ui.seekbar.a)) {
            obj3 = null;
        } else {
            obj3 = obj;
        }
        if (l.a(obj, obj3)) {
            return c.a(((com.ss.android.ugc.aweme.feed.ui.seekbar.a) obj).f95052b);
        }
        if (!(obj instanceof com.ss.android.ugc.aweme.feed.ui.seekbar.f)) {
            obj4 = null;
        } else {
            obj4 = obj;
        }
        if (l.a(obj, obj4)) {
            return c.a(((com.ss.android.ugc.aweme.feed.ui.seekbar.f) obj).f95107b);
        }
        if (!(obj instanceof h)) {
            obj5 = null;
        } else {
            obj5 = obj;
        }
        if (l.a(obj, obj5)) {
            return c.a(((h) obj).f95116c);
        }
        if (!(obj instanceof e)) {
            obj6 = null;
        } else {
            obj6 = obj;
        }
        if (l.a(obj, obj6)) {
            return c.a(((e) obj).f95101b);
        }
        if (obj instanceof com.ss.android.ugc.aweme.feed.ui.seekbar.c) {
            obj7 = obj;
        }
        if (l.a(obj, obj7)) {
            return c.a(((com.ss.android.ugc.aweme.feed.ui.seekbar.c) obj).f95087c);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager) {
        super(videoSeekBar, viewGroup, textView, textView2, scrollSwitchStateManager);
        l.d(videoSeekBar, "");
        l.d(viewGroup, "");
        l.d(textView, "");
        l.d(textView2, "");
        l.d(scrollSwitchStateManager, "");
        f.a(videoSeekBar, viewGroup);
    }
}
