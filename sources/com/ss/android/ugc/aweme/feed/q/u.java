package com.ss.android.ugc.aweme.feed.q;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cc.c;
import com.ss.android.ugc.aweme.feed.adapter.ac;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.guide.e;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.n.g;
import com.ss.android.ugc.aweme.feed.n.q;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.c.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.story.d.a;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public class u extends w {

    /* renamed from: a  reason: collision with root package name */
    public e f93811a;

    /* renamed from: b  reason: collision with root package name */
    public g f93812b;

    /* renamed from: c  reason: collision with root package name */
    public q f93813c;
    private boolean r = true;
    private boolean s;

    static {
        Covode.recordClassIndex(59687);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void aV() {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(197, new org.greenrobot.eventbus.g(u.class, "onFollowCleanModeChangedEvent", b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a
    public final void H() {
        super.H();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.w
    public final boolean c() {
        return super.c();
    }

    public final void d() {
        this.O.setVisibility(8);
    }

    public final void j() {
        this.O.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a
    public final void bx() {
        super.bx();
        if (this.ay) {
            this.ay = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w
    public final void f() {
        super.f();
        if (this.bu) {
            ScrollSwitchStateManager.a.a((androidx.fragment.app.e) this.bv).a(false);
        }
        if (this.W != null && this.W.getCount() > 0) {
            if (this.bu) {
                aX();
            }
            this.W.a(Collections.emptyList());
            this.W.f91652b = false;
            View bu = bu();
            if (bu != null) {
                bu.setAlpha(0.0f);
            }
        }
        l();
        e eVar = this.f93811a;
        if (eVar != null) {
            eVar.a(this.aF);
        }
        q qVar = this.f93813c;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void q() {
        Aweme a2;
        if (com.ss.android.ugc.aweme.story.c.b.f() && TextUtils.equals(this.aJ.getEventType(), "homepage_follow")) {
            Aweme c2 = this.W.c(0);
            if (m.a(c2) && a.c(c2) && (a2 = com.ss.android.ugc.aweme.story.g.f137757a.e().a(c2.getAuthorUid())) != null && a2 != c2) {
                this.W.d().set(0, a2);
                aj n = n(a2.getAid());
                if (n != null) {
                    n.a(a2);
                }
            }
        }
        super.q();
    }

    public u(String str) {
        super(str, 1);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r, com.ss.android.ugc.aweme.feed.q.a
    public final void b(FollowStatus followStatus) {
        super.b(followStatus);
        if (followStatus != null && followStatus.followStatus == 0) {
            a(followStatus.userId);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a
    public final void m(boolean z) {
        super.m(z);
        if (!this.bq) {
            this.ay = true;
        } else {
            this.ay = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w
    public final void c(Exception exc) {
        super.c(exc);
        new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.g4e).a();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void g(String str) {
        super.g(str);
        if (!this.s) {
            this.s = true;
            c.a("homepage_follow", (com.ss.android.ugc.aweme.cc.b) null, 6);
        }
    }

    @r
    public void onFollowCleanModeChangedEvent(b bVar) {
        boolean z = com.ss.android.ugc.aweme.main.c.a().f109218b;
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            aj j2 = j(i2);
            if (j2 != null) {
                j2.b(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w
    public final void b(List<Aweme> list, boolean z) {
        super.b(list, z);
        if (!z) {
            this.M.c();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.ss.android.ugc.aweme.common.e.d, com.ss.android.ugc.aweme.feed.q.a
    public final void a(List<Aweme> list, int i2) {
        if (this.W.getCount() == 0) {
            this.W.a(list);
        } else {
            this.W.a(list, i2);
        }
        if (i2 >= 0 && i2 < this.W.getCount()) {
            this.N.setCurrentItem(i2);
            Aweme c2 = this.W.c(i2);
            if (a.c(c2)) {
                bf().a(c2, i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w
    public final void a(List<Aweme> list, boolean z) {
        e eVar = this.f93811a;
        if (eVar != null) {
            eVar.c();
        }
        if (this.bv instanceof androidx.fragment.app.e) {
            FollowPageFirstFrameViewModel.a((androidx.fragment.app.e) this.bv);
        }
        super.a(list, z);
        if (!this.r) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                q(list.get(0));
            }
            this.r = false;
        }
        if (this.bu) {
            ScrollSwitchStateManager.a.a((androidx.fragment.app.e) this.bv).a(!com.bytedance.common.utility.collection.b.a((Collection) this.W.e()));
        }
        g gVar = this.f93812b;
        if (gVar == null || !gVar.i()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.b40).a();
            q qVar = this.f93813c;
            if (qVar != null) {
                qVar.d();
                return;
            }
            return;
        }
        final int currentItem = this.N.getCurrentItem();
        final Aweme c2 = this.W.c(currentItem);
        this.N.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.q.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59688);
            }

            public final void run() {
                if (u.this.N != null) {
                    u.this.Y = 0;
                    if (currentItem == 0) {
                        u.this.m(c2);
                        u.this.ab = false;
                    } else {
                        u.this.ab = true;
                        u.this.N.a(u.this.Y, true);
                    }
                    if (u.this.f93813c != null) {
                        u.this.f93813c.d();
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a
    public final com.ss.android.ugc.aweme.feed.adapter.b a(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, l lVar) {
        return new ac(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
