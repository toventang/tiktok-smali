package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.following.ui.view.I18nFollowUserBtn;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class aw extends y {

    /* renamed from: a  reason: collision with root package name */
    public String f97205a;

    /* renamed from: b  reason: collision with root package name */
    public k<User> f97206b;

    /* renamed from: c  reason: collision with root package name */
    public final int f97207c;

    /* renamed from: d  reason: collision with root package name */
    public int f97208d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, Boolean> f97209e;

    /* renamed from: f  reason: collision with root package name */
    public a f97210f;

    /* renamed from: g  reason: collision with root package name */
    private User f97211g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.follow.widet.a f97212h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f97213i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f97214j;

    public interface a {
        static {
            Covode.recordClassIndex(61753);
        }
    }

    static {
        Covode.recordClassIndex(61751);
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final View a(int i2) {
        if (this.f97214j == null) {
            this.f97214j = new SparseArray();
        }
        View view = (View) this.f97214j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f97214j.put(i2, findViewById);
        return findViewById;
    }

    public final User getData() {
        return this.f97211g;
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final View getRecommendItemView() {
        return this;
    }

    public final void setFollowStatusChangeCallback(a aVar) {
        this.f97210f = aVar;
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final void setIgnoreRecFriendsCardExp(boolean z) {
        this.f97213i = z;
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final void setListener(k<User> kVar) {
        this.f97206b = kVar;
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final void setPositionInApiList(int i2) {
        this.f97208d = i2;
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.y
    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.f97205a = str;
    }

    static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f97216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f97217b;

        static {
            Covode.recordClassIndex(61754);
        }

        b(aw awVar, User user) {
            this.f97216a = awVar;
            this.f97217b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.b
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                HashMap<String, Boolean> hashMap = this.f97216a.f97209e;
                if (hashMap != null) {
                    hashMap.put(this.f97217b.getUid(), true);
                }
                this.f97216a.b(followStatus.followStatus);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f97220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f97221b;

        static {
            Covode.recordClassIndex(61756);
        }

        d(aw awVar, User user) {
            this.f97220a = awVar;
            this.f97221b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k<User> kVar = this.f97220a.f97206b;
            if (kVar != null) {
                kVar.a(101, this.f97221b, this.f97220a.f97208d);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f97222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f97223b;

        static {
            Covode.recordClassIndex(61757);
        }

        e(aw awVar, User user) {
            this.f97222a = awVar;
            this.f97223b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k<User> kVar = this.f97222a.f97206b;
            if (kVar != null) {
                kVar.a(101, this.f97223b, this.f97222a.f97208d);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f97224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f97225b;

        static {
            Covode.recordClassIndex(61758);
        }

        f(aw awVar, User user) {
            this.f97224a = awVar;
            this.f97225b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k<User> kVar = this.f97224a.f97206b;
            if (kVar != null) {
                kVar.a(101, this.f97225b, this.f97224a.f97208d);
            }
        }
    }

    static final class c implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f97218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f97219b;

        static {
            Covode.recordClassIndex(61755);
        }

        c(aw awVar, User user) {
            this.f97218a = awVar;
            this.f97219b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            k<User> kVar = this.f97218a.f97206b;
            if (kVar != null) {
                kVar.a(followStatus, this.f97219b.getUid(), this.f97218a.f97205a);
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            l.b(followStatus, "");
            createIIMServicebyMonsterPlugin.storeFollowStatus(followStatus);
        }
    }

    public final void b(int i2) {
        if (a(R.id.yf) instanceof I18nFollowUserBtn) {
            I18nFollowUserBtn i18nFollowUserBtn = (I18nFollowUserBtn) a(R.id.yf);
            if (i2 == 0 || i2 == 1 || i2 == 4) {
                i18nFollowUserBtn.d();
            } else {
                i18nFollowUserBtn.d();
            }
        }
        FollowUserBtn followUserBtn = (FollowUserBtn) a(R.id.yf);
        User user = this.f97211g;
        if (user == null) {
            l.b();
        }
        followUserBtn.a(i2, user.getFollowerStatus());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010c, code lost:
        if (r2 != 3) goto L_0x010e;
     */
    @Override // com.ss.android.ugc.aweme.friends.ui.y
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setData(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.aw.setData(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private aw(Context context, HashMap<String, Boolean> hashMap) {
        super(context, null, 0);
        l.d(context, "");
        l.d(hashMap, "");
        MethodCollector.i(12475);
        this.f97205a = "";
        this.f97207c = 12;
        LayoutInflater.from(context).inflate(R.layout.a2o, this);
        ((FollowUserBtn) a(R.id.yf)).c();
        this.f97209e = hashMap;
        this.f97212h = new com.ss.android.ugc.aweme.follow.widet.a((FollowUserBtn) a(R.id.yf), new a.g(this) {
            /* class com.ss.android.ugc.aweme.friends.ui.aw.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ aw f97215a;

            static {
                Covode.recordClassIndex(61752);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return this.f97215a.f97205a;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final int getFollowFromType() {
                return this.f97215a.f97207c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f97215a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                l.d(user, "");
                k<User> kVar = this.f97215a.f97206b;
                if (kVar != null) {
                    kVar.a(100, user, this.f97215a.f97208d);
                }
            }
        });
        MethodCollector.o(12475);
    }

    public /* synthetic */ aw(Context context, HashMap hashMap, byte b2) {
        this(context, hashMap);
    }
}
