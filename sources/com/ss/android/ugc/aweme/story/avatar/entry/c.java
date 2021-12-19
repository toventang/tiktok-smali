package com.ss.android.ugc.aweme.story.avatar.entry;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.d;
import com.ss.android.ugc.aweme.story.avatar.e;
import com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel;
import com.ss.android.ugc.aweme.story.avatar.g;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.userstory.api.UserStoryApi;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c implements d, g {

    /* renamed from: a  reason: collision with root package name */
    public final d f136808a;

    /* renamed from: b  reason: collision with root package name */
    public final StoryRingUserStoryViewModel f136809b;

    /* renamed from: c  reason: collision with root package name */
    public final StoryRingStatusViewModel f136810c;

    /* renamed from: d  reason: collision with root package name */
    public final a f136811d;

    /* renamed from: e  reason: collision with root package name */
    h.f.a.b<? super Aweme, z> f136812e;

    /* renamed from: f  reason: collision with root package name */
    private final StoryBrandView f136813f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ e f136814g;

    static {
        Covode.recordClassIndex(89386);
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.g
    public final boolean a(String str, HashMap<String, String> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        return this.f136814g.a(str, hashMap);
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.d
    public final void a(h.f.a.b<? super Aweme, z> bVar) {
        this.f136812e = bVar;
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f136819a;

        static {
            Covode.recordClassIndex(89390);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f136819a = cVar;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f136819a.a("story_show");
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f136817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f136818b;

        static {
            Covode.recordClassIndex(89389);
        }

        a(c cVar, e eVar) {
            this.f136817a = cVar;
            this.f136818b = eVar;
        }

        public final void onClick(View view) {
            List<Aweme> stories;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof androidx.appcompat.app.d)) {
                    topActivity = null;
                }
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) topActivity;
                if (dVar == null || dVar.isFinishing()) {
                    return;
                }
                if (!fe.a(dVar)) {
                    new com.bytedance.tux.g.b(dVar).e(R.string.de8).b();
                    return;
                }
                Aweme value = this.f136817a.f136809b.f136782a.getValue();
                if (value != null) {
                    l.b(value, "");
                    UserStory userStory = value.getUserStory();
                    if (!(userStory == null || (stories = userStory.getStories()) == null)) {
                        Iterator<T> it = stories.iterator();
                        while (it.hasNext()) {
                            it.next().setUserStory(null);
                        }
                    }
                    ae.f95296a = new b(value);
                    SmartRoute buildRoute = SmartRouter.buildRoute(dVar, "aweme://story/detail");
                    d dVar2 = this.f136817a.f136808a;
                    l.b(buildRoute, "");
                    dVar2.onEnterPlayer(buildRoute);
                    this.f136818b.a(buildRoute, value);
                    buildRoute.open();
                    this.f136817a.a("story_click");
                }
            }
        }
    }

    public c(e eVar) {
        a iVar;
        l.d(eVar, "");
        this.f136814g = eVar;
        d a2 = e.a(eVar.c());
        this.f136808a = a2;
        StoryBrandView a3 = eVar.a();
        this.f136813f = a3;
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = new StoryRingUserStoryViewModel(eVar);
        this.f136809b = storyRingUserStoryViewModel;
        l.d(eVar, "");
        StoryRingStatusViewModel storyRingStatusViewModel = new StoryRingStatusViewModel(eVar, (byte) 0);
        this.f136810c = storyRingStatusViewModel;
        l.d(eVar, "");
        int i2 = j.f136824a[eVar.c().ordinal()];
        if (i2 == 1) {
            iVar = new i(eVar);
        } else if (i2 != 2) {
            iVar = new g(eVar);
        } else {
            iVar = new h(eVar);
        }
        this.f136811d = iVar;
        m b2 = eVar.b();
        storyRingUserStoryViewModel.f136782a.observe(b2, new u(this) {
            /* class com.ss.android.ugc.aweme.story.avatar.entry.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f136815a;

            static {
                Covode.recordClassIndex(89387);
            }

            {
                this.f136815a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Aweme aweme = (Aweme) obj;
                h.f.a.b<? super Aweme, z> bVar = this.f136815a.f136812e;
                if (bVar != null) {
                    bVar.invoke(aweme);
                }
                StoryRingStatusViewModel storyRingStatusViewModel = this.f136815a.f136810c;
                storyRingStatusViewModel.f136777b = aweme;
                storyRingStatusViewModel.b();
            }
        });
        storyRingStatusViewModel.f136776a.observe(b2, new u(this) {
            /* class com.ss.android.ugc.aweme.story.avatar.entry.c.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f136816a;

            static {
                Covode.recordClassIndex(89388);
            }

            {
                this.f136816a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                k kVar = (k) obj;
                a aVar = this.f136816a.f136811d;
                l.b(kVar, "");
                aVar.a(kVar);
                this.f136816a.a("story_show");
            }
        });
        a3.setThemeType(a2.getThemeType());
        if (a2.getRingWidth() > 0.0f) {
            a3.setRingWidth(a2.getRingWidth());
        }
        a3.setOnClickListener(new a(this, eVar));
        a3.addOnAttachStateChangeListener(new b(this));
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.d
    public final void a(Aweme aweme) {
        String uid;
        h.k.c a2;
        l.d(aweme, "");
        this.f136810c.a(aweme.getAuthor());
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = this.f136809b;
        l.d(aweme, "");
        storyRingUserStoryViewModel.f136784c = aweme.getAuthor();
        storyRingUserStoryViewModel.a(aweme);
        User user = storyRingUserStoryViewModel.f136784c;
        if (user != null && (uid = user.getUid()) != null) {
            if (!com.ss.android.ugc.aweme.story.d.a.a(uid)) {
                com.ss.android.ugc.aweme.story.avatar.a.f136768d.a(storyRingUserStoryViewModel, uid);
                return;
            }
            k[] kVarArr = new k[0];
            com.ss.android.ugc.aweme.story.userstory.b bVar = com.ss.android.ugc.aweme.story.userstory.b.f138510c;
            if (l.a(ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class), ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class);
            } else {
                a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class);
            }
            StoryReceiver storyReceiver = new StoryReceiver(uid, storyRingUserStoryViewModel, bVar);
            if (l.a(a2, ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                bVar.a((com.ss.android.ugc.aweme.story.base.d) storyRingUserStoryViewModel, storyReceiver);
            }
            f.a.b.b a3 = bVar.a().a(new StoryRingUserStoryViewModel.g(uid, bVar)).d(new StoryRingUserStoryViewModel.h(kVarArr)).a(bVar.f136888b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new StoryRingUserStoryViewModel.i(storyRingUserStoryViewModel), StoryRingUserStoryViewModel.j.f136799a);
            l.b(a3, "");
            com.ss.android.ugc.aweme.story.base.distribution.dispatcher.d.a(a3, storyReceiver);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.d
    public final void a(String str) {
        User user;
        com.ss.android.ugc.aweme.tux.business.story.a aVar;
        boolean z;
        String str2;
        String requestId;
        String str3 = "";
        l.d(str, str3);
        if (this.f136813f.isAttachedToWindow() && this.f136813f.getVisibility() == 0) {
            Aweme value = this.f136809b.f136782a.getValue();
            if ((value != null && (user = value.getAuthor()) != null) || (user = this.f136809b.f136784c) != null) {
                k value2 = this.f136810c.f136776a.getValue();
                if (value2 != null) {
                    aVar = value2.f136826b;
                } else {
                    aVar = null;
                }
                if (aVar == com.ss.android.ugc.aweme.tux.business.story.a.BRAND_RING || aVar == com.ss.android.ugc.aweme.tux.business.story.a.PRORGRESS) {
                    z = true;
                } else {
                    z = false;
                }
                HashMap<String, String> hashMap = new HashMap<>();
                String uid = user.getUid();
                if (uid == null) {
                    uid = str3;
                }
                hashMap.put("author_id", uid);
                hashMap.put("follow_status", String.valueOf(com.ss.android.ugc.aweme.story.avatar.a.b(user)));
                Aweme value3 = this.f136809b.f136782a.getValue();
                if (!(value3 == null || (requestId = value3.getRequestId()) == null)) {
                    str3 = requestId;
                }
                hashMap.put("req_id", str3);
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put("is_unread", str2);
                if (a(str, hashMap)) {
                    r.a(str, hashMap);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.d
    public final void a(User user, boolean z) {
        String uid;
        h.k.c a2;
        StoryRingUserStoryViewModel.b bVar;
        String uid2;
        this.f136810c.a(user);
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = this.f136809b;
        storyRingUserStoryViewModel.f136784c = user;
        if (user == null || (uid = user.getUid()) == null || !StoryRingUserStoryViewModel.a.a(user)) {
            storyRingUserStoryViewModel.a((Aweme) null);
            com.ss.android.ugc.aweme.story.avatar.a.f136768d.a(storyRingUserStoryViewModel);
            return;
        }
        if (!com.ss.android.ugc.aweme.story.d.a.a(user.getUid())) {
            com.ss.android.ugc.aweme.story.avatar.a.f136768d.a(storyRingUserStoryViewModel, uid);
        } else {
            String uid3 = user.getUid();
            l.b(uid3, "");
            k[] kVarArr = new k[0];
            com.ss.android.ugc.aweme.story.userstory.b bVar2 = com.ss.android.ugc.aweme.story.userstory.b.f138510c;
            if (l.a(ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class), ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class);
            } else {
                a2 = ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class);
            }
            StoryReceiver storyReceiver = new StoryReceiver(uid3, storyRingUserStoryViewModel, bVar2);
            if (l.a(a2, ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                bVar2.a((com.ss.android.ugc.aweme.story.base.d) storyRingUserStoryViewModel, storyReceiver);
            }
            f.a.b.b a3 = bVar2.a().a(new StoryRingUserStoryViewModel.c(uid3, bVar2)).d(new StoryRingUserStoryViewModel.d(kVarArr)).a(bVar2.f136888b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new StoryRingUserStoryViewModel.e(storyRingUserStoryViewModel), StoryRingUserStoryViewModel.f.f136794a);
            l.b(a3, "");
            com.ss.android.ugc.aweme.story.base.distribution.dispatcher.d.a(a3, storyReceiver);
        }
        StoryRingUserStoryViewModel.b bVar3 = storyRingUserStoryViewModel.f136785d;
        if (bVar3 != null) {
            l.d(uid, "");
            if (!l.a((Object) uid, (Object) bVar3.f136788a)) {
                bVar = new StoryRingUserStoryViewModel.b(uid, z);
            } else if (!z && bVar3.f136789b) {
                bVar = new StoryRingUserStoryViewModel.b(uid, z);
            } else {
                return;
            }
        } else {
            bVar = new StoryRingUserStoryViewModel.b(uid, z);
        }
        storyRingUserStoryViewModel.f136785d = bVar;
        if (com.ss.android.ugc.aweme.story.d.a.a(uid)) {
            MineUserStoryFetcher mineUserStoryFetcher = storyRingUserStoryViewModel.f136786e;
            if (z) {
                StoryRingUserStoryViewModel.k kVar = new StoryRingUserStoryViewModel.k(storyRingUserStoryViewModel, z, uid);
                l.d(kVar, "");
                Aweme clone = com.ss.android.ugc.aweme.story.userstory.mine.a.a().clone();
                l.b(clone, "");
                kVar.invoke(clone);
                return;
            }
            StoryRingUserStoryViewModel.l lVar = new StoryRingUserStoryViewModel.l(storyRingUserStoryViewModel, z, uid);
            StoryRingUserStoryViewModel.m mVar = new StoryRingUserStoryViewModel.m(storyRingUserStoryViewModel, z, uid);
            l.d(lVar, "");
            l.d(mVar, "");
            User c2 = in.c();
            if (c2 != null && (uid2 = c2.getUid()) != null && uid2.length() != 0) {
                f.a.b.b a4 = UserStoryApi.f138508a.getUserStories(n.a(uid2).toString()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new MineUserStoryFetcher.a(lVar), new MineUserStoryFetcher.b(mVar));
                l.b(a4, "");
                f.a.j.a.a(a4, mineUserStoryFetcher.f138511a);
                return;
            }
            return;
        }
        f.a.b.b a5 = com.ss.android.ugc.aweme.story.i.d.f137808a.a(uid, z).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new StoryRingUserStoryViewModel.n(storyRingUserStoryViewModel, uid, z), new StoryRingUserStoryViewModel.o(storyRingUserStoryViewModel, uid, z));
        l.b(a5, "");
        f.a.j.a.a(a5, storyRingUserStoryViewModel.f136783b);
    }
}
