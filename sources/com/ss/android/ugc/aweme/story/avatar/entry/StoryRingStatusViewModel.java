package com.ss.android.ugc.aweme.story.avatar.entry;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.o;
import com.ss.android.ugc.aweme.story.publish.d;
import com.ss.android.ugc.aweme.story.publish.e;
import com.ss.android.ugc.aweme.story.publish.f;
import h.f.b.l;

public final class StoryRingStatusViewModel implements au, d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f136775c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final t<k> f136776a;

    /* renamed from: b  reason: collision with root package name */
    Aweme f136777b;

    /* renamed from: d  reason: collision with root package name */
    private final o f136778d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f136779e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f136780f;

    static {
        Covode.recordClassIndex(89366);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a(String str, e eVar) {
        l.d(str, "");
        l.d(eVar, "");
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void b(String str, e eVar) {
        l.d(str, "");
        l.d(eVar, "");
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Aweme aweme) {
            User author;
            boolean z = true;
            if (aweme != null && (author = aweme.getAuthor()) != null && !author.isBlock() && !author.isBlocked()) {
                z = false;
                if (author.getUid() == null) {
                }
            }
            return z;
        }

        public static boolean b(Aweme aweme) {
            String str;
            if (aweme == null) {
                return false;
            }
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            boolean a2 = com.ss.android.ugc.aweme.story.d.a.a(str);
            if (!c(aweme) || (a2 && (!f.f138112b.isEmpty()))) {
                return true;
            }
            return false;
        }

        private static boolean c(Aweme aweme) {
            UserStory userStory;
            if (aweme == null || (userStory = aweme.getUserStory()) == null) {
                return true;
            }
            l.b(userStory, "");
            if (userStory.getTotalCount() >= 1 || userStory.getHasMoreBefore() || userStory.getHasMoreAfter()) {
                return false;
            }
            return true;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void clear() {
        a(false);
    }

    private final boolean c() {
        if (!this.f136780f || !this.f136779e) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a() {
        a(new k(true, com.ss.android.ugc.aweme.tux.business.story.a.PRORGRESS, 4));
    }

    public final void b() {
        k kVar;
        Aweme aweme = this.f136777b;
        if (a.a(aweme) || !a.b(aweme)) {
            kVar = new k(false, (com.ss.android.ugc.aweme.tux.business.story.a) null, 6);
        } else if (c() && f.f138115e) {
            kVar = new k(true, com.ss.android.ugc.aweme.tux.business.story.a.PRORGRESS, f.d());
        } else if (!c() || !f.c()) {
            if (aweme == null) {
                l.b();
            }
            if (com.ss.android.ugc.aweme.story.avatar.a.a(aweme)) {
                kVar = new k(true, com.ss.android.ugc.aweme.tux.business.story.a.GRAY_RING, 4);
            } else {
                kVar = new k(true, com.ss.android.ugc.aweme.tux.business.story.a.BRAND_RING, 4);
            }
        } else {
            kVar = new k(true, com.ss.android.ugc.aweme.tux.business.story.a.RED_RING, 4);
        }
        a(kVar);
    }

    private static /* synthetic */ void a(StoryRingStatusViewModel storyRingStatusViewModel) {
        storyRingStatusViewModel.a(storyRingStatusViewModel.c());
    }

    private final void a(k kVar) {
        if (!l.a(this.f136776a.getValue(), kVar)) {
            this.f136776a.setValue(kVar);
        }
    }

    private StoryRingStatusViewModel(com.ss.android.ugc.aweme.story.avatar.e eVar) {
        this.f136776a = new t<>();
        o c2 = eVar.c();
        this.f136778d = c2;
        boolean mayShowPublishProgress = e.a(c2).getMayShowPublishProgress();
        this.f136779e = mayShowPublishProgress;
        if (mayShowPublishProgress) {
            eVar.b().getLifecycle().a(this);
        }
    }

    private final void a(boolean z) {
        String valueOf = String.valueOf(hashCode());
        if (z) {
            f.f138118h.a(valueOf, this);
        } else {
            f.e(valueOf);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a(float f2) {
        a(new k(true, com.ss.android.ugc.aweme.tux.business.story.a.PRORGRESS, f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.User r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.story.avatar.o r1 = r4.f136778d
            com.ss.android.ugc.aweme.story.avatar.o r0 = com.ss.android.ugc.aweme.story.avatar.o.WESTWINDOW
            if (r1 == r0) goto L_0x000c
            boolean r0 = com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel.a.a(r5)
            if (r0 == 0) goto L_0x004b
        L_0x000c:
            r3 = 1
        L_0x000d:
            r2 = 0
            if (r3 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x003f
            java.lang.String r1 = r5.getUid()
        L_0x0016:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f136777b
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.getUid()
        L_0x0024:
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x0041
            r4.b()
        L_0x002d:
            if (r5 == 0) goto L_0x0033
            java.lang.String r2 = r5.getUid()
        L_0x0033:
            boolean r0 = com.ss.android.ugc.aweme.story.d.a.a(r2)
            r4.f136780f = r0
            a(r4)
            return
        L_0x003d:
            r0 = r2
            goto L_0x0024
        L_0x003f:
            r1 = r2
            goto L_0x0016
        L_0x0041:
            com.ss.android.ugc.aweme.story.avatar.entry.k r1 = new com.ss.android.ugc.aweme.story.avatar.entry.k
            r0 = 6
            r1.<init>(r3, r2, r0)
            r4.a(r1)
            goto L_0x002d
        L_0x004b:
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingStatusViewModel.a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a(com.ss.android.ugc.aweme.story.publish.i iVar) {
        l.d(iVar, "");
        b();
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void a(String str) {
        l.d(str, "");
        b();
    }

    public /* synthetic */ StoryRingStatusViewModel(com.ss.android.ugc.aweme.story.avatar.e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.d
    public final void c(String str, e eVar) {
        l.d(str, "");
        l.d(eVar, "");
        d.a.a(str, eVar);
    }
}
