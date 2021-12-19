package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a;
import com.ss.android.ugc.aweme.feed.ui.seekbar.b;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.feed.ui.seekbar.f;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class d extends b {
    static {
        Covode.recordClassIndex(60268);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.a.h
    public final void c() {
        this.t.setVisibility(8);
        this.s.setSeekBarShowType(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void b(SeekBar seekBar) {
        super.b(seekBar);
        c.a(new b(false, this.f95059a, this.f95068j));
        this.f95065g = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.b, com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.b
    public final void a(MotionEvent motionEvent) {
        Integer valueOf;
        super.a(motionEvent);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && this.f95064f && !this.f95065g) {
            c.a(new b(true, this.f95059a, this.f95068j));
            this.f95065g = true;
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
        if (!(obj instanceof com.ss.android.ugc.aweme.feed.ui.seekbar.d)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if (l.a(obj, obj2)) {
            return l.a(((com.ss.android.ugc.aweme.feed.ui.seekbar.d) obj).f95099e, this.f95068j);
        }
        if (!(obj instanceof a)) {
            obj3 = null;
        } else {
            obj3 = obj;
        }
        if (!l.a(obj, obj3)) {
            if (!(obj instanceof f)) {
                obj4 = null;
            } else {
                obj4 = obj;
            }
            if (l.a(obj, obj4)) {
                return l.a(((f) obj).f95110e, this.f95068j);
            }
            if (!(obj instanceof h)) {
                obj5 = null;
            } else {
                obj5 = obj;
            }
            if (l.a(obj, obj5)) {
                return true;
            }
            if (!(obj instanceof e)) {
                obj6 = null;
            } else {
                obj6 = obj;
            }
            if (l.a(obj, obj6)) {
                return l.a(((e) obj).f95104e, this.f95068j);
            }
            if (obj instanceof com.ss.android.ugc.aweme.feed.ui.seekbar.c) {
                obj7 = obj;
            }
            if (l.a(obj, obj7)) {
                return true;
            }
            return false;
        } else if (l.a(((a) obj).f95054d, this.f95068j)) {
            return true;
        } else {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager, al alVar) {
        super(videoSeekBar, viewGroup, textView, textView2, scrollSwitchStateManager);
        l.d(videoSeekBar, "");
        l.d(viewGroup, "");
        l.d(textView, "");
        l.d(textView2, "");
        l.d(alVar, "");
        this.f95068j = alVar;
        f.a(videoSeekBar, viewGroup);
    }
}
