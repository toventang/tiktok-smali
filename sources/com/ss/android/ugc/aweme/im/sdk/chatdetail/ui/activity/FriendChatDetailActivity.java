package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.n;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class FriendChatDetailActivity extends a implements WeakHandler.IHandler, i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f101573j = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    TextView f101574f;

    /* renamed from: g  reason: collision with root package name */
    public IMUser f101575g;

    /* renamed from: h  reason: collision with root package name */
    public WeakHandler f101576h;

    /* renamed from: i  reason: collision with root package name */
    int f101577i;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f101578k;

    /* renamed from: l  reason: collision with root package name */
    private AvatarImageView f101579l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f101580m;
    private TextView n;
    private TextView o;
    private TextView p;
    private RelativeLayout q;
    private boolean r;
    private boolean s;
    private HashMap t;

    static {
        Covode.recordClassIndex(64947);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.t == null) {
            this.t = new HashMap();
        }
        View view = (View) this.t.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.t.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(335, new org.greenrobot.eventbus.g(FriendChatDetailActivity.class, "onBlockUserSuccessEvent", com.ss.android.ugc.aweme.im.service.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendChatDetailActivity f101581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f101582b;

        static {
            Covode.recordClassIndex(64949);
        }

        public final void run() {
            if (this.f101582b) {
                FriendChatDetailActivity.a(this.f101581a).setFollowStatus(0);
            }
            FriendChatDetailActivity.a(this.f101581a).setBlock(this.f101582b);
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(FriendChatDetailActivity.a(this.f101581a));
        }

        b(FriendChatDetailActivity friendChatDetailActivity, boolean z) {
            this.f101581a = friendChatDetailActivity;
            this.f101582b = z;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        IMUser iMUser = this.f101575g;
        if (iMUser == null) {
            l.a("mUser");
        }
        if (!IMUser.isInvalidUser(iMUser.getUid())) {
            IMUser iMUser2 = this.f101575g;
            if (iMUser2 == null) {
                l.a("mUser");
            }
            String uid = iMUser2.getUid();
            IMUser iMUser3 = this.f101575g;
            if (iMUser3 == null) {
                l.a("mUser");
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(uid, iMUser3.getSecUid(), new h(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a
    public final void c() {
        Serializable serializable;
        super.c();
        Bundle a2 = a(getIntent());
        if (a2 != null) {
            serializable = a2.getSerializable("simple_uesr");
        } else {
            serializable = null;
        }
        boolean z = true;
        if (a2 == null || !(serializable instanceof IMUser)) {
            StringBuilder sb = new StringBuilder("initParams, containsExtra: ");
            if (a2 == null) {
                z = false;
            }
            com.ss.android.ugc.aweme.im.service.m.a.e("FriendChatDetailActivity", sb.append(z).append(", containsUser: ").append(serializable instanceof IMUser).toString());
            finish();
            return;
        }
        IMUser iMUser = (IMUser) serializable;
        this.f101575g = iMUser;
        if (iMUser == null) {
            l.a("mUser");
        }
        String uid = iMUser.getUid();
        if (!(uid == null || uid.length() == 0)) {
            try {
                this.f101624e = b.a.a(b.a.a(Long.parseLong(uid)));
            } catch (Exception unused) {
            }
        }
        this.r = a2.getBoolean("is_stranger", false);
        this.s = a2.getBoolean("is_author_supporter", false);
        this.f101576h = new WeakHandler(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a
    public final void e() {
        super.e();
        if (this.f101575g == null) {
            com.ss.android.ugc.aweme.im.service.m.a.e("FriendChatDetailActivity", "initEvents, mUser is not initialized, isFinishing: " + isFinishing());
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = this.f101578k;
        if (relativeLayout == null) {
            l.a("mAvatarLayout");
        }
        relativeLayout.setOnClickListener(this);
        AvatarImageView avatarImageView = this.f101579l;
        if (avatarImageView == null) {
            l.a("mAvatarImage");
        }
        avatarImageView.setOnClickListener(this);
        TextView textView = this.f101574f;
        if (textView == null) {
            l.a("mBlockText");
        }
        textView.setOnClickListener(this);
        TextView textView2 = this.p;
        if (textView2 == null) {
            l.a("mReportText");
        }
        textView2.setOnClickListener(this);
        ((ConstraintLayout) _$_findCachedViewById(R.id.c5b)).setOnClickListener(this);
        ae.a aVar = new ae.a();
        View[] viewArr = new View[2];
        RelativeLayout relativeLayout2 = this.f101578k;
        if (relativeLayout2 == null) {
            l.a("mAvatarLayout");
        }
        viewArr[0] = relativeLayout2;
        AvatarImageView avatarImageView2 = this.f101579l;
        if (avatarImageView2 == null) {
            l.a("mAvatarImage");
        }
        viewArr[1] = avatarImageView2;
        aVar.a(viewArr);
        int c2 = androidx.core.content.b.c(this, R.color.c9);
        int c3 = androidx.core.content.b.c(this, R.color.f159926j);
        View[] viewArr2 = new View[2];
        TextView textView3 = this.f101574f;
        if (textView3 == null) {
            l.a("mBlockText");
        }
        viewArr2[0] = textView3;
        TextView textView4 = this.p;
        if (textView4 == null) {
            l.a("mReportText");
        }
        viewArr2[1] = textView4;
        ae.a(c2, c3, viewArr2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a
    public final void d() {
        super.d();
        if (this.f101575g == null) {
            com.ss.android.ugc.aweme.im.service.m.a.e("FriendChatDetailActivity", "initViews, mUser is not initialized, isFinishing: " + isFinishing());
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.pl);
        l.b(relativeLayout, "");
        this.f101578k = relativeLayout;
        AvatarImageView avatarImageView = (AvatarImageView) _$_findCachedViewById(R.id.pf);
        l.b(avatarImageView, "");
        this.f101579l = avatarImageView;
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.fez);
        l.b(tuxIconView, "");
        this.f101580m = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.csg);
        l.b(tuxTextView, "");
        this.n = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.al5);
        l.b(tuxTextView2, "");
        this.o = tuxTextView2;
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.tu);
        l.b(relativeLayout2, "");
        this.q = relativeLayout2;
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.dly);
        l.b(tuxTextView3, "");
        this.p = tuxTextView3;
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.tw);
        l.b(tuxTextView4, "");
        this.f101574f = tuxTextView4;
        int i2 = 8;
        if (this.r) {
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.c6o);
            l.b(relativeLayout3, "");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(R.id.c86);
            l.b(relativeLayout4, "");
            relativeLayout4.setVisibility(8);
        }
        if (this.s) {
            RelativeLayout relativeLayout5 = (RelativeLayout) _$_findCachedViewById(R.id.c7h);
            l.b(relativeLayout5, "");
            relativeLayout5.setVisibility(8);
            RelativeLayout relativeLayout6 = (RelativeLayout) _$_findCachedViewById(R.id.tu);
            l.b(relativeLayout6, "");
            relativeLayout6.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.co6);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
            TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.al5);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            AvatarImageView avatarImageView2 = (AvatarImageView) _$_findCachedViewById(R.id.pf);
            l.b(avatarImageView2, "");
            avatarImageView2.setEnabled(false);
            RelativeLayout relativeLayout7 = (RelativeLayout) _$_findCachedViewById(R.id.pl);
            l.b(relativeLayout7, "");
            relativeLayout7.setEnabled(false);
        }
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.f()) {
            ((TuxTextView) _$_findCachedViewById(R.id.dly)).setTextColorRes(R.attr.av);
            TuxIconView tuxIconView3 = (TuxIconView) _$_findCachedViewById(R.id.dlt);
            l.b(tuxIconView3, "");
            tuxIconView3.setVisibility(8);
            ((TuxTextView) _$_findCachedViewById(R.id.tw)).setTextColorRes(R.attr.av);
            TuxIconView tuxIconView4 = (TuxIconView) _$_findCachedViewById(R.id.ts);
            l.b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
        }
        IMUser iMUser = this.f101575g;
        if (iMUser == null) {
            l.a("mUser");
        }
        a(iMUser);
        IMUser iMUser2 = this.f101575g;
        if (iMUser2 == null) {
            l.a("mUser");
        }
        if (TextUtils.equals(iMUser2.getUid(), com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b())) {
            RelativeLayout relativeLayout8 = this.q;
            if (relativeLayout8 == null) {
                l.a("mBlockLayout");
            }
            relativeLayout8.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.c5b);
        l.b(constraintLayout, "");
        boolean a2 = com.ss.android.ugc.aweme.im.service.c.b.a();
        if (a2) {
            IMUser iMUser3 = this.f101575g;
            if (iMUser3 == null) {
                l.a("mUser");
            }
            boolean isFriend = IMUser.isFriend(iMUser3.getFollowStatus());
            if (isFriend) {
                i2 = 0;
            } else if (isFriend) {
                throw new n();
            }
        } else if (a2) {
            throw new n();
        }
        constraintLayout.setVisibility(i2);
    }

    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendChatDetailActivity f101585a;

        static {
            Covode.recordClassIndex(64952);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(FriendChatDetailActivity friendChatDetailActivity) {
            this.f101585a = friendChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == -1) {
                String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.j.a(FriendChatDetailActivity.a(this.f101585a));
                WeakHandler weakHandler = this.f101585a.f101576h;
                if (weakHandler == null) {
                    l.a("mHandler");
                }
                String uid = FriendChatDetailActivity.a(this.f101585a).getUid();
                l.b(uid, "");
                com.ss.android.ugc.aweme.im.sdk.common.data.api.a.a(weakHandler, uid, a2, 1, 1);
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("success", FriendChatDetailActivity.a(this.f101585a).getUid(), "chat");
                com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.b("confirm", FriendChatDetailActivity.a(this.f101585a).getUid());
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("cancel", FriendChatDetailActivity.a(this.f101585a).getUid(), "chat");
            com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.b("cancel", FriendChatDetailActivity.a(this.f101585a).getUid());
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendChatDetailActivity f101589a;

        static {
            Covode.recordClassIndex(64958);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(FriendChatDetailActivity friendChatDetailActivity) {
            this.f101589a = friendChatDetailActivity;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            l.d(th, "");
            l.d(th, "");
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            if (iMUser != null) {
                FriendChatDetailActivity friendChatDetailActivity = this.f101589a;
                if (iMUser.isBlock()) {
                    friendChatDetailActivity.f101577i = 1;
                    TextView textView = friendChatDetailActivity.f101574f;
                    if (textView == null) {
                        l.a("mBlockText");
                    }
                    textView.setText(R.string.cj5);
                } else {
                    friendChatDetailActivity.f101577i = 0;
                    TextView textView2 = friendChatDetailActivity.f101574f;
                    if (textView2 == null) {
                        l.a("mBlockText");
                    }
                    textView2.setText(R.string.cdc);
                }
                friendChatDetailActivity.f101575g = iMUser;
                IMUser iMUser2 = friendChatDetailActivity.f101575g;
                if (iMUser2 == null) {
                    l.a("mUser");
                }
                friendChatDetailActivity.a(iMUser2);
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final /* synthetic */ IMUser a(FriendChatDetailActivity friendChatDetailActivity) {
        IMUser iMUser = friendChatDetailActivity.f101575g;
        if (iMUser == null) {
            l.a("mUser");
        }
        return iMUser;
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Activity $act;

        static {
            Covode.recordClassIndex(64953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Activity activity) {
            super(1);
            this.$act = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.ere, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            bVar2.b(R.string.erf, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(64954);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    SmartRouter.buildRoute(this.this$0.$act, "//setting/blocklist").open();
                    return z.f158842a;
                }
            });
            bVar2.f44820b = true;
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f101586a = new g();

        static {
            Covode.recordClassIndex(64955);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f101587a);
            baseActivityViewModel2.config(AnonymousClass2.f101588a);
            return z.f158842a;
        }
    }

    private final void c(boolean z) {
        WeakHandler weakHandler = this.f101576h;
        if (weakHandler == null) {
            l.a("mHandler");
        }
        weakHandler.post(new b(this, z));
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", true);
        activityConfiguration(g.f101586a);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", false);
    }

    private final void a(int i2) {
        int i3 = R.string.ceo;
        if (i2 != -1) {
            if (i2 == 0) {
                i3 = R.string.cdf;
            } else if (i2 == 1) {
                i3 = R.string.cj6;
            }
        }
        new com.bytedance.tux.g.b(this).e(i3).b();
    }

    @r(a = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(com.ss.android.ugc.aweme.im.service.b.a aVar) {
        l.d(aVar, "");
        this.f101577i = 1;
        TextView textView = this.f101574f;
        if (textView == null) {
            l.a("mBlockText");
        }
        textView.setText(R.string.cj5);
        new com.bytedance.tux.g.b(this).e(R.string.cdf).b();
        c(true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.im.service.model.IMUser r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity.a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        l.d(message, "");
        if (message.what == 1) {
            Object obj = message.obj;
            if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                if (((com.ss.android.ugc.aweme.base.api.a.a) obj).getErrorCode() != 3002038) {
                    a(-1);
                } else {
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this).b(R.string.erg), new f(this)).a().b().show();
                }
            } else if (obj instanceof BlockResponse) {
                BlockResponse blockResponse = (BlockResponse) obj;
                if (blockResponse.getBlockStaus() == 1) {
                    this.f101577i = 1;
                    TextView textView = this.f101574f;
                    if (textView == null) {
                        l.a("mBlockText");
                    }
                    textView.setText(R.string.cj5);
                    a(0);
                    c(true);
                } else if (blockResponse.getBlockStaus() == 0) {
                    this.f101577i = 0;
                    TextView textView2 = this.f101574f;
                    if (textView2 == null) {
                        l.a("mBlockText");
                    }
                    textView2.setText(R.string.cdc);
                    a(1);
                    c(false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a
    public final void onClick(View view) {
        String b2;
        String str;
        int i2;
        com.bytedance.im.core.d.h c2;
        String str2 = "";
        l.d(view, str2);
        super.onClick(view);
        int id = view.getId();
        Long l2 = null;
        boolean z = true;
        if (id == R.id.pl || id == R.id.pf) {
            if (!this.s || com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.d()) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.e.j jVar = com.ss.android.ugc.aweme.im.sdk.common.controller.e.j.f102261b;
                IMUser iMUser = this.f101575g;
                if (iMUser == null) {
                    l.a("mUser");
                }
                jVar.b(iMUser.getUid());
                IMUser iMUser2 = this.f101575g;
                if (iMUser2 == null) {
                    l.a("mUser");
                }
                ag.a(iMUser2.getUid());
            }
        } else if (id == R.id.tw) {
            if (this.f101577i == 0) {
                e eVar = new e(this);
                String string = getString(R.string.cdd);
                l.b(string, str2);
                a.C0731a aVar = new a.C0731a(this);
                aVar.f33402b = string;
                aVar.a(R.string.ce1, (DialogInterface.OnClickListener) new c(eVar), false).b(R.string.cdh, (DialogInterface.OnClickListener) new d(eVar), false).a().c();
                IMUser iMUser3 = this.f101575g;
                if (iMUser3 == null) {
                    l.a("mUser");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("chat", iMUser3.getUid(), (String) null);
                IMUser iMUser4 = this.f101575g;
                if (iMUser4 == null) {
                    l.a("mUser");
                }
                com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.a("block", iMUser4.getUid());
                return;
            }
            IMUser iMUser5 = this.f101575g;
            if (iMUser5 == null) {
                l.a("mUser");
            }
            String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.j.a(iMUser5);
            WeakHandler weakHandler = this.f101576h;
            if (weakHandler == null) {
                l.a("mHandler");
            }
            IMUser iMUser6 = this.f101575g;
            if (iMUser6 == null) {
                l.a("mUser");
            }
            String uid = iMUser6.getUid();
            l.b(uid, str2);
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a.a(weakHandler, uid, a2, 0, 1);
            IMUser iMUser7 = this.f101575g;
            if (iMUser7 == null) {
                l.a("mUser");
            }
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName("chat").setValue(iMUser7.getUid()));
            IMUser iMUser8 = this.f101575g;
            if (iMUser8 == null) {
                l.a("mUser");
            }
            com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.a("unblock", iMUser8.getUid());
        } else if (id == R.id.dly) {
            com.bytedance.ies.im.core.api.b.b bVar = this.f101624e;
            if (bVar != null) {
                str = bVar.b();
            } else {
                str = null;
            }
            com.bytedance.ies.im.core.api.b.b bVar2 = this.f101624e;
            if (!(bVar2 == null || (c2 = bVar2.c()) == null)) {
                l2 = Long.valueOf(c2.getConversationShortId());
            }
            IMUser iMUser9 = this.f101575g;
            if (iMUser9 == null) {
                l.a("mUser");
            }
            String uid2 = iMUser9.getUid();
            if (uid2 != null && uid2.length() != 0 && str != null && str.length() != 0 && l2 != null && l2.longValue() > 0) {
                if (this.r) {
                    i2 = 1;
                } else {
                    IMUser iMUser10 = this.f101575g;
                    if (iMUser10 == null) {
                        l.a("mUser");
                    }
                    if (iMUser10.getCommerceUserLevel() > 0) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                }
                String valueOf = String.valueOf(l2.longValue());
                IMUser iMUser11 = this.f101575g;
                if (iMUser11 == null) {
                    l.a("mUser");
                }
                String uid3 = iMUser11.getUid();
                l.b(uid3, str2);
                IMUser iMUser12 = this.f101575g;
                if (iMUser12 == null) {
                    l.a("mUser");
                }
                String contactName = iMUser12.getContactName();
                IMUser iMUser13 = this.f101575g;
                if (iMUser13 == null) {
                    l.a("mUser");
                }
                String a3 = com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(iMUser13);
                if (this.f101577i != 1) {
                    z = false;
                }
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(new g.a(valueOf, uid3, str, a3, Boolean.valueOf(z), "im", i2, contactName, 32), this, "1");
                IMUser iMUser14 = this.f101575g;
                if (iMUser14 == null) {
                    l.a("mUser");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.d(iMUser14.getUid(), "click_share_button");
            }
        } else if (id == R.id.c5b) {
            Bundle bundle = new Bundle();
            IMUser iMUser15 = this.f101575g;
            if (iMUser15 == null) {
                l.a("mUser");
            }
            List a4 = h.a.n.a(iMUser15);
            h.a.z zVar = h.a.z.INSTANCE;
            com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a aVar2 = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.CREATE_GROUP;
            com.bytedance.ies.im.core.api.b.b bVar3 = this.f101624e;
            if (!(bVar3 == null || (b2 = bVar3.b()) == null)) {
                str2 = b2;
            }
            bundle.putSerializable("member_select_config", new b.d(a4, zVar, aVar2, str2));
            RelationSelectActivity.a.a(this, bundle, 12345);
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("private_chat");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f101583a;

        static {
            Covode.recordClassIndex(64950);
        }

        c(e eVar) {
            this.f101583a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f101583a.onClick(dialogInterface, -1);
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f101584a;

        static {
            Covode.recordClassIndex(64951);
        }

        d(e eVar) {
            this.f101584a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f101584a.onClick(dialogInterface, -2);
        }
    }

    private static void a(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
            return;
        }
        textView.setVisibility(4);
    }
}
