package com.ss.android.ugc.aweme.commercialize.playfun.a;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.playfun.a;
import com.ss.android.ugc.aweme.commercialize.playfun.d;
import com.ss.android.ugc.aweme.commercialize.playfun.e;
import h.f.b.l;

public final class g extends d {

    /* renamed from: c  reason: collision with root package name */
    public Animator f74965c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f74966d;

    static {
        Covode.recordClassIndex(46226);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public final boolean f() {
        return !l.a((Object) this.f74994b.f75006l, (Object) "popupmask");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void e() {
        super.e();
        Animator animator = this.f74965c;
        if (animator != null) {
            animator.cancel();
        }
        this.f74965c = null;
        Animator animator2 = this.f74966d;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f74966d = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void a() {
        a("WidgetShowState---handle");
        this.f74994b.b("badge");
        this.f74994b.f75000f.setVisibility(8);
        if (this.f74994b.f75001g != null) {
            this.f74994b.n.setVisibility(8);
            return;
        }
        PointF c2 = this.f74994b.c();
        if (this.f74994b.f74999e.getTranslationY() != c2.y) {
            Animator a2 = a.a(this.f74994b.f74999e, c2.y);
            this.f74966d = a2;
            if (a2 != null) {
                a2.start();
            }
        }
        this.f74994b.a("become_widget", new Point((int) this.f74994b.f74999e.getTranslationX(), (int) this.f74994b.f74999e.getTranslationY()), null);
        DataCenter dataCenter = this.f74994b.f75002h;
        if (dataCenter != null) {
            dataCenter.a("ON_AD_PLAY_FUN_STATE_WIDGET_SHOW", (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }
}
