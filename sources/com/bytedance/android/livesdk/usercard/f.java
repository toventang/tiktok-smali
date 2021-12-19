package com.bytedance.android.livesdk.usercard;

import android.animation.Animator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.p.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.at.h;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.g;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.subscribe.c;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.usercard.p;
import com.bytedance.android.livesdk.usercard.y;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.ComboView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f extends a implements View.OnClickListener, y.a {
    private View A;
    private LinearLayout B;
    private ViewGroup C;
    private LiveButton D;
    private LiveButton E;
    private LiveButton F;
    private LiveButton G;
    private LiveButton H;
    private LiveButton I;
    private ComboView J;
    private View K;
    private RecyclerView L;
    private am M;
    private TextView N;
    private final Animator[] O = {null, null};
    private final Animator[] P = {null, null};
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int[] U = {R.id.b7g, R.id.cb3, R.id.mu, R.id.flx, R.id.edr};

    /* renamed from: a  reason: collision with root package name */
    public ImageView f21833a;

    /* renamed from: b  reason: collision with root package name */
    Activity f21834b;

    /* renamed from: c  reason: collision with root package name */
    DataChannel f21835c;

    /* renamed from: d  reason: collision with root package name */
    User f21836d;

    /* renamed from: e  reason: collision with root package name */
    int f21837e;

    /* renamed from: f  reason: collision with root package name */
    boolean f21838f;

    /* renamed from: g  reason: collision with root package name */
    long f21839g;

    /* renamed from: h  reason: collision with root package name */
    Room f21840h;

    /* renamed from: i  reason: collision with root package name */
    long f21841i;

    /* renamed from: j  reason: collision with root package name */
    w f21842j;

    /* renamed from: k  reason: collision with root package name */
    boolean f21843k;

    /* renamed from: l  reason: collision with root package name */
    y f21844l;

    /* renamed from: m  reason: collision with root package name */
    int f21845m;
    String n;
    boolean o;
    public Map<String, String> p;
    String q;
    public p.a r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private View z;

    static {
        Covode.recordClassIndex(12860);
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b() {
        if (this.f21836d == null) {
            this.T = true;
        } else if (this.o && this.f21841i > 0) {
            a(this.E);
            this.G.setVisibility(0);
            if (b.a.a().b() == k.INVITING) {
                this.G.setEnabled(false);
            } else {
                this.G.setOnClickListener(new k(this));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f21835c;
        if (dataChannel != null) {
            dataChannel.c(e.class, false);
        }
        this.R = false;
        a(this.O[0]);
        a(this.O[1]);
        a(this.P[0]);
        a(this.P[1]);
        DataChannelGlobal.f34575d.b(this);
    }

    public final void a() {
        User user = this.f21836d;
        if (user == null) {
            this.S = true;
            return;
        }
        d a2 = c.a(user, this.f21843k);
        if (a2 == d.ACTIVE) {
            a(this.E);
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.G.setOnClickListener(new i(this));
        } else if (a2 == d.GRAYED) {
            a(this.E);
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.G.setEnabled(false);
        } else if (a2 == d.DISCONNECTED) {
            a(this.E);
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            this.H.setOnClickListener(new j(this));
        } else {
            this.G.setVisibility(8);
        }
    }

    private void d() {
        int childCount = this.C.getChildCount();
        View view = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.C.getChildAt(i2);
            if ((childAt instanceof TextView) || (childAt instanceof ViewGroup)) {
                if (childAt.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (z2) {
                childAt.setVisibility(0);
                view = childAt;
            } else {
                childAt.setVisibility(8);
            }
        }
        if (view != null) {
            view.setVisibility(8);
        }
        HashSet hashSet = new HashSet();
        int[] iArr = this.U;
        for (int i3 : iArr) {
            View findViewById = this.K.findViewById(i3);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.E.getLayoutParams();
        if (hashSet.contains(Integer.valueOf((int) R.id.b7g))) {
            if (hashSet.size() == 1) {
                layoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.xg));
            } else if (hashSet.size() == 2) {
                layoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.xh));
            } else if (hashSet.contains(Integer.valueOf((int) R.id.edr))) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.xh);
                layoutParams.setMarginStart(dimensionPixelSize);
                layoutParams.setMarginEnd(dimensionPixelSize);
            } else {
                int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.xh);
                int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.xg);
                layoutParams.setMarginStart(dimensionPixelSize2);
                layoutParams.setMarginEnd(dimensionPixelSize3);
            }
        }
        this.E.setLayoutParams(layoutParams);
    }

    private void e() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live_detail");
        hashMap.put("action_type", "click");
        hashMap.put("event_module", "right_anchor");
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "right_anchor");
        hashMap.put("anchor_id", String.valueOf(this.f21836d.getId()));
        hashMap.put("room_id", String.valueOf(this.f21836d.getLiveRoomId()));
        hashMap.put("right_user_id", String.valueOf(this.f21836d.getId()));
        hashMap.put("live_type", j.a(this.f21840h.getStreamType()));
        if (b.a.a().f9940e > 0) {
            hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
            if (b.a.a().r == 0) {
                str = "anchor";
            } else {
                str = "pk";
            }
            hashMap.put("connection_type", str);
        }
        String g2 = com.bytedance.android.livesdk.ab.e.g();
        if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        hashMap.put("is_return", "0");
        b.a.a("live_show").a((Map<String, String>) hashMap).a(this.f21835c).b();
    }

    private void g() {
        boolean z2;
        boolean z3;
        List<ImageModel> badgeImageList;
        User user;
        User user2 = this.f21836d;
        if (user2 == null || user2.getBadgeImageList() == null || this.f21836d.getBadgeImageList().size() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.J == null || (user = this.f21836d) == null || user.getComboBadgeInfo() == null || !((d) com.bytedance.android.live.t.a.a(d.class)).isRankEnabled(com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getType())) {
            z3 = false;
            if (!z2) {
                this.B.setVisibility(8);
                return;
            }
        } else {
            z3 = true;
        }
        this.B.setVisibility(0);
        if (z3) {
            this.J.setVisibility(0);
            this.J.a(this.f21836d.getComboBadgeInfo().f7448a, (int) this.f21836d.getComboBadgeInfo().f7449b);
        }
        if (z2 && (badgeImageList = this.f21836d.getBadgeImageList()) != null) {
            for (ImageModel imageModel : badgeImageList) {
                if (imageModel.getImageType() == 30) {
                    Boolean bool = (Boolean) this.f21835c.b(c.class);
                    if (bool == null || !bool.booleanValue()) {
                        this.f21835c.a(c.class, (Object) true);
                        b.a.a("livesdk_privilege_badge_show").a("anchor_id", this.f21840h.getOwnerUserId()).a("room_id", this.f21840h.getId()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).f("click").a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("video_id", com.bytedance.android.livesdk.ab.e.f()).a("show_entrance", "personal_profile").b();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f21836d != null && c(this.f21840h.getOwner()) && this.f21836d.getId() == this.f21840h.getOwnerUserId()) {
            if (this.f21840h.getOwner().getFollowInfo().getFollowStatus() == 1 || this.f21840h.getOwner().getFollowInfo().getFollowStatus() == 2 || this.f21840h.getOwner().getSubscribeInfo().isSubscribed()) {
                this.E.b(R.style.t1);
                if (this.f21836d.getFollowInfo().getFollowStatus() == 2) {
                    this.E.setIcon(2131234821);
                } else if (this.f21836d.getFollowInfo().getFollowStatus() == 1) {
                    this.E.setIcon(2131234820);
                } else {
                    this.E.setIcon(2131234819);
                }
                this.E.setText((CharSequence) null);
                this.F.setVisibility(0);
                this.F.setOnClickListener(this);
                g();
                if (d(this.f21840h.getOwner())) {
                    this.F.setText(R.string.eo5);
                    this.F.b(R.style.t1);
                }
                b.a.a("livesdk_subscribe_icon_show").a("anchor_id", this.f21840h.getOwnerUserId()).a("room_id", this.f21840h.getId()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).f("click").a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("video_id", com.bytedance.android.livesdk.ab.e.f()).a("show_entrance", "profile_card").b();
                return;
            }
            this.E.setText(R.string.gsv);
            this.E.setIcon((Drawable) null);
            this.E.b(R.style.sv);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.xg));
            this.E.setLayoutParams(layoutParams);
            this.F.setVisibility(8);
        }
    }

    private static void a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            if (animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    private static void a(LiveButton liveButton) {
        if (liveButton.getVisibility() == 0) {
            liveButton.setIcon((Drawable) null);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) liveButton.getLayoutParams();
            layoutParams.weight = 3.1f;
            liveButton.setLayoutParams(layoutParams);
        }
    }

    private static boolean c(User user) {
        if (user == null || user.getSubscribeInfo() == null) {
            return false;
        }
        return user.getSubscribeInfo().isAnchorQualified();
    }

    private static boolean d(User user) {
        if (!c(user) || !user.getSubscribeInfo().isSubscribed()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.usercard.y.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        User user;
        if (this.R && (user = this.f21836d) != null && user.getFollowInfo() != null && ((int) this.f21836d.getFollowInfo().getFollowStatus()) != aVar.a()) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.depend.b.a(aVar));
        }
    }

    public final void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        User user;
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar.f22946a;
        if (aVar2 != null && aVar2.f23019a == this.f21839g && this.R && (user = this.f21836d) != null && user.getFollowInfo() != null && ((int) this.f21836d.getFollowInfo().getFollowStatus()) != aVar2.a()) {
            this.f21836d.setFollowStatus(aVar2.a());
            b(this.f21836d);
            c();
            d();
        }
    }

    private void b(User user) {
        if (user != null) {
            if (!user.isFollowing()) {
                if (this.F.getVisibility() != 0) {
                    this.E.b(R.style.sv);
                    this.E.setText(R.string.gsv);
                } else {
                    this.E.setIcon(2131234819);
                }
                this.f21836d.getFollowInfo().setPushStatus(2);
                return;
            }
            this.E.b(R.style.t1);
            if (this.F.getVisibility() != 0) {
                this.E.setText(R.string.gsw);
            } else {
                this.E.setIcon(2131234820);
            }
            if (user.getFollowInfo() != null && user.getFollowInfo().getFollowStatus() == 2) {
                if (this.F.getVisibility() != 0) {
                    this.E.setText(R.string.eaw);
                } else {
                    this.E.setIcon(2131234821);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.y.a
    public final void a(Throwable th) {
        if (this.R) {
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                ao.a(com.bytedance.android.live.core.f.y.e(), ((com.bytedance.android.live.a.a.b.a) th).getPrompt(), 0);
                return;
            }
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gss);
        }
    }

    public final void a(User user) {
        boolean z2;
        ImageModel imageModel;
        long j2;
        String str;
        if (!this.R || user == null || user.getId() <= 0) {
            View view = this.K;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (this.K.getVisibility() != 0) {
            this.K.setVisibility(0);
        }
        if (this.f21842j == null) {
            this.f21842j = new w(this.f21834b, this.f21840h, user.getId());
        }
        this.f21836d = user;
        this.f21839g = user.getId();
        long c2 = u.a().b().c();
        boolean z3 = true;
        if (c2 == this.f21839g) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Q = z2;
        if (this.o) {
            if (this.T) {
                b();
            }
        } else if (this.S) {
            a();
        }
        if (this.f21840h.getOwnerUserId() == this.f21839g) {
            this.f21837e = 0;
        } else if (b.a.a().f9941f == this.f21839g) {
            this.f21837e = 2;
        } else {
            this.f21837e = 1;
        }
        if (c2 != this.f21840h.getOwnerUserId()) {
            z3 = false;
        }
        this.f21838f = z3;
        g authenticationInfo = this.f21836d.getAuthenticationInfo();
        if (authenticationInfo == null) {
            imageModel = null;
        } else {
            imageModel = authenticationInfo.f19067c;
        }
        if (this.f21840h.getOwnerUserId() == this.f21839g && imageModel != null) {
            this.f21833a.setVisibility(0);
            com.bytedance.android.live.core.f.p.a(this.f21833a, imageModel, 0, new p.a.C0135a() {
                /* class com.bytedance.android.livesdk.usercard.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12861);
                }

                @Override // com.bytedance.android.live.core.f.p.a.C0135a
                public final void a(boolean z) {
                    int i2;
                    if (f.this.mStatusActive) {
                        ImageView imageView = f.this.f21833a;
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        imageView.setVisibility(i2);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f21839g));
            hashMap.put("room_id", this.f21840h.getIdStr());
            hashMap.put("show_type", "data_card_anchor");
            hashMap.put("live_type", this.f21840h.getStreamType().logStreamingType);
            hashMap.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
            hashMap.put("enter_method", com.bytedance.android.livesdk.ab.e.d());
            hashMap.put("action_type", "click");
            com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
            if (this.f21838f) {
                str = "anchor";
            } else if (a2.getUserAttr() == null || !a2.getUserAttr().f19030b) {
                str = "viewer";
            } else {
                str = "admin";
            }
            hashMap.put("admin_type", str);
            b.a.a("livesdk_authentication_icon_show").a().a((Map<String, String>) hashMap).b();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f21836d.getBadgeImageList() != null) {
            arrayList.addAll(this.f21836d.getBadgeImageList());
        }
        this.M.a(arrayList);
        this.M.f21822a = new View.OnClickListener() {
            /* class com.bytedance.android.livesdk.usercard.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12862);
            }

            public final void onClick(View view) {
                String queryParameter;
                String queryParameter2;
                if (view.getTag() instanceof ImageModel) {
                    ImageModel imageModel = (ImageModel) view.getTag();
                    if (!(m.a(imageModel.getSchema()) || f.this.getContext() == null)) {
                        f fVar = f.this;
                        String schema = imageModel.getSchema();
                        Uri parse = Uri.parse(schema);
                        String queryParameter3 = parse.getQueryParameter("noble_intercept");
                        if (!(queryParameter3 == null || ah.b(queryParameter3) == 0 || (queryParameter = parse.getQueryParameter("url")) == null)) {
                            String uri = Uri.parse(queryParameter).buildUpon().appendQueryParameter("status_bar_height", String.valueOf(com.bytedance.android.live.core.f.y.e(ac.a(fVar.getContext())))).build().toString();
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            for (String str : queryParameterNames) {
                                if ("url".equals(str)) {
                                    queryParameter2 = uri;
                                } else {
                                    queryParameter2 = parse.getQueryParameter(str);
                                }
                                clearQuery.appendQueryParameter(str, queryParameter2);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(StringSet.type, "card");
                            b.a.a("livesdk_nobility_page_click").a((Map<String, String>) hashMap).b();
                            schema = clearQuery.build().toString();
                        }
                        ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(f.this.getContext(), schema);
                    }
                }
            }
        };
        if (TextUtils.isEmpty(this.f21836d.getDisplayId())) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.f21836d.getDisplayId());
            this.s.setVisibility(0);
        }
        this.s.setText(this.f21836d.getDisplayId());
        g();
        if (TextUtils.isEmpty(this.f21836d.getNickName())) {
            this.t.setVisibility(8);
        } else {
            this.t.setText(this.f21836d.getNickName());
            this.t.setVisibility(0);
        }
        if (!this.f21836d.isVerified() || TextUtils.isEmpty(this.f21836d.getVerifiedReason())) {
            this.u.setVisibility(8);
        } else {
            this.u.setText(this.f21836d.getVerifiedReason());
            this.u.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f21836d.getAutoGraph())) {
            this.v.setText(R.string.gmz);
        } else {
            this.v.setText(this.f21836d.getAutoGraph());
        }
        this.v.setMaxLines(2);
        FollowInfo followInfo = this.f21836d.getFollowInfo();
        if (followInfo != null) {
            this.w.setText(aa.b(followInfo.getFollowingCount()));
            this.x.setText(aa.b(followInfo.getFollowerCount()));
            this.x.setText(aa.b(followInfo.getFollowerCount()));
        } else {
            this.w.setText("0");
            this.x.setText("0");
        }
        if (!this.Q) {
            b(this.f21836d);
            c();
            this.E.setOnClickListener(this);
            if (b.a.a().f9941f == this.f21836d.getId() || this.f21845m == 2) {
                this.D.setVisibility(8);
            } else {
                this.D.setVisibility(0);
                this.D.setOnClickListener(this);
            }
            if (this.f21838f) {
                n.a(this.I, 8);
            } else if (b.a.a().f9941f == this.f21836d.getId()) {
                n.a(this.D, 8);
                n.a(this.F, 8);
                n.a(this.I, 0);
                this.I.setOnClickListener(this);
                e();
            } else {
                n.a(this.I, 8);
            }
            if (this.f21840h.officialChannelInfo == null || this.f21840h.officialChannelInfo.f18978a == null) {
                j2 = -1;
            } else {
                j2 = this.f21840h.officialChannelInfo.f18978a.getId();
            }
            if (e.a(this.f21840h.getOwnerUserId(), this.f21836d.getId(), c2, this.q, j2)) {
                this.A.setVisibility(8);
            } else {
                this.A.setVisibility(0);
            }
        } else if (this.f21838f) {
            this.A.setVisibility(8);
            if (c(this.f21836d)) {
                n.a(this.z, 0);
                this.y.setText(Integer.toString(this.f21836d.getSubscribeInfo().getSubscriberCount()));
            }
        } else {
            this.E.setVisibility(8);
            this.D.setVisibility(8);
            this.A.setVisibility(8);
        }
        if (this.N != null) {
            User user2 = this.f21836d;
            if (user2 == null || user2.getAuthorInfo() == null) {
                this.N.setText("0");
            } else {
                this.N.setText(aa.b(this.f21836d.getAuthorInfo().f19070c));
            }
        }
        d();
    }

    public final void onClick(View view) {
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        User user;
        int id = view.getId();
        if (id != R.id.bgj) {
            String str = "right_anchor";
            if (id == R.id.b7g) {
                if (!u.a().b().e()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", "live_detail");
                    bundle.putString("action_type", "follow");
                    bundle.putString("source", "live");
                    bundle.putString("v1_source", "follow");
                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                    Activity activity = this.f21834b;
                    j.a a2 = com.bytedance.android.livesdk.at.j.a();
                    a2.f14158a = com.bytedance.android.livesdk.ao.a.a();
                    a2.f14159b = com.bytedance.android.livesdk.ao.a.b();
                    a2.f14162e = "live_detail";
                    a2.f14163f = "follow";
                    a2.f14161d = "live";
                    a2.f14160c = -1;
                    b2.a(activity, a2.a()).b(new com.bytedance.android.livesdk.at.g());
                } else {
                    getContext();
                    if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107226e = f();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.efp);
                    } else {
                        if (this.f21838f) {
                            str = "live_anchor_c_audience";
                        } else {
                            int i2 = this.f21837e;
                            if (i2 == 0) {
                                str = "live_audience_c_anchor";
                            } else if (i2 != 2) {
                                str = "live_audience_c_audience";
                            }
                        }
                        if (!this.f21836d.isFollowing()) {
                            y yVar = this.f21844l;
                            String requestId = this.f21840h.getRequestId();
                            long j4 = this.f21839g;
                            long id2 = this.f21840h.getId();
                            String labels = this.f21840h.getLabels();
                            if (!yVar.f21898c) {
                                yVar.f21898c = true;
                                yVar.f21896a.a(u.a().b().a(((d.a) new d.b().a(j4)).a(requestId).b("live_detail").c(str).b(id2).d(labels).c()).a(new ag(yVar), new ah(yVar), new ai(yVar)));
                            }
                            if (com.bytedance.android.livesdk.utils.a.a(this.f21835c) && this.f21840h.getOwner() != null && this.f21839g == this.f21840h.getOwner().getId()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("refer", "card_follow_button");
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("anchor_id", String.valueOf(this.f21840h.getOwner().getId()));
                                hashMap2.put("room_id", String.valueOf(this.f21840h.getId()));
                                com.bytedance.android.livesdk.utils.a.a("live_ad", "follow", hashMap, hashMap2);
                            }
                            Map<String, String> map = this.p;
                            if (map != null) {
                                this.f21842j.f21884d = map;
                            }
                            w wVar = this.f21842j;
                            long j5 = this.f21839g;
                            String str2 = this.n;
                            boolean z4 = this.f21838f;
                            int i3 = this.f21837e;
                            if (b.a.a().f9941f == this.f21836d.getId()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (this.f21836d.getFollowInfo() != null) {
                                j3 = this.f21836d.getFollowInfo().getFollowStatus();
                            } else {
                                j3 = 0;
                            }
                            wVar.a(true, j5, str2, z4, i3, z3, j3, this.f21843k);
                        } else {
                            b.a aVar = new b.a(getContext());
                            aVar.f18285b = getContext().getString(R.string.edd, com.bytedance.android.livesdk.ac.g.a(this.f21836d));
                            b.a b3 = aVar.a(R.string.edc, (DialogInterface.OnClickListener) new l(this, str), false).b(R.string.gle, m.f21855a, false);
                            b3.f18289f = n.f21856a;
                            b3.f18290g = o.f21857a;
                            b3.a().show();
                        }
                    }
                }
            } else if (id != R.id.edr) {
                String str3 = "";
                if (id == R.id.mu) {
                    if (!u.a().b().a(h.AT)) {
                        com.bytedance.android.livesdk.ab.k.a(this.f21842j.f21881a);
                        this.f21844l.a();
                        Room room = this.f21840h;
                        if (room == null || room.getOrientation() != 2 || this.f21835c.b(cp.class) == null || ((Boolean) this.f21835c.b(cp.class)).booleanValue()) {
                            ap apVar = new ap(com.bytedance.android.livesdk.ac.g.a(this.f21836d), str3);
                            apVar.f15109e = this.f21836d;
                            this.f21835c.c(com.bytedance.android.live.j.class, apVar);
                        }
                    }
                } else if (id == R.id.flx) {
                    if (this.f21836d.isFollowing() || this.f21836d.getSecret() != 1) {
                        f.a.f23366a.a().a(new Event("live_profile_click", 34560, com.bytedance.android.livesdkapi.session.b.BussinessApiCall).a("click to jump room"));
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        f.a.f23366a.a(EnterRoomLinkSession.a(enterRoomConfig));
                        enterRoomConfig.f23298b.f23311c = str;
                        enterRoomConfig.f23299c.J = "live_detail";
                        enterRoomConfig.f23299c.L = str;
                        enterRoomConfig.f23298b.n = this.f21840h.getId();
                        enterRoomConfig.f23298b.o = (String) this.f21835c.b(com.bytedance.android.livesdkapi.e.b.class);
                        enterRoomConfig.f23298b.f23310b = String.valueOf(this.f21836d.getId());
                        enterRoomConfig.f23299c.X = "live_detail";
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.e(this.f21836d.getLiveRoomId(), enterRoomConfig));
                        boolean z5 = true;
                        boolean z6 = !this.f21838f;
                        boolean a3 = aj.a(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getCurrentLinkMode(), 4);
                        if (this.f21839g != ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getRivalAnchorUidWhenAnchorLinkMic()) {
                            z5 = false;
                        }
                        if (z6 && a3 && z5) {
                            if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                                j2 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId();
                                str3 = "manual_pk";
                            } else {
                                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInCoHost()) {
                                    str3 = "anchor";
                                } else if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest()) {
                                    str3 = "audience";
                                }
                                j2 = 0;
                            }
                            b.a.a("livesdk_profile_swicth_click").a().a("to_anchor_id", this.f21839g).a("to_room_id", this.f21836d.getLiveRoomId()).a("channel_id", ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getChannelId()).a("connection_type", str3).a("pk_id", j2).b();
                        }
                    } else {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ejb);
                        f.a.f23366a.a().a(new Event("click_secret_user", 3072, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall));
                        return;
                    }
                }
            } else if (c(this.f21840h.getOwner())) {
                DataChannel dataChannel = this.f21835c;
                if (dataChannel == null || dataChannel.b(cp.class) == null) {
                    z2 = true;
                } else {
                    z2 = ((Boolean) this.f21835c.b(cp.class)).booleanValue();
                }
                b.a.a("livesdk_subscribe_icon_click").a("anchor_id", this.f21840h.getOwnerUserId()).a("room_id", this.f21840h.getId()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).f("click").a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("video_id", com.bytedance.android.livesdk.ab.e.f()).a("click_position", "profile_card").b();
                if (!z2) {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a("subscribe_profile_card"));
                } else {
                    if (d(this.f21840h.getOwner())) {
                        ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeState(this.f21834b, this.f21840h, "profile_card");
                    } else {
                        ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(this.f21834b, this.f21840h, "profile_card");
                    }
                    p.a aVar2 = this.r;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            }
        } else if (!this.f21838f && (user = this.f21836d) != null) {
            if (com.bytedance.android.live.liveinteract.api.a.c.a().n.intValue() == 2) {
                ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.grf);
            } else {
                int i4 = this.f21837e;
                if (i4 == 0) {
                    w wVar2 = this.f21842j;
                    user.getId();
                    wVar2.a();
                } else if (i4 == 2) {
                    w wVar3 = this.f21842j;
                    user.getId();
                    wVar3.a();
                } else {
                    w wVar4 = this.f21842j;
                    user.getId();
                    wVar4.a();
                }
                b.a.a("livesdk_enter_personal_detail").a().a("to_user_id", user.getIdStr()).b();
                HashMap hashMap3 = new HashMap(1);
                hashMap3.put("log_enter_live_source", this.f21835c.b(com.bytedance.android.livesdkapi.e.b.class));
                hashMap3.put("sec_user_id", user.getSecUid());
                ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).showUserProfile(user.getId(), null, hashMap3);
            }
        } else {
            return;
        }
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        this.R = true;
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).a(i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new g(this));
        if (this.f21843k) {
            i2 = R.layout.b9l;
        } else {
            i2 = R.layout.b9m;
        }
        View a2 = com.a.a(layoutInflater, i2, viewGroup, false);
        this.K = a2;
        this.s = (TextView) a2.findViewById(R.id.cs_);
        this.L = (RecyclerView) this.K.findViewById(R.id.fd_);
        this.t = (TextView) this.K.findViewById(R.id.cva);
        this.f21833a = (ImageView) this.K.findViewById(R.id.nt);
        this.u = (TextView) this.K.findViewById(R.id.ff0);
        this.v = (TextView) this.K.findViewById(R.id.evu);
        this.w = (TextView) this.K.findViewById(R.id.b8e);
        this.x = (TextView) this.K.findViewById(R.id.b82);
        this.y = (TextView) this.K.findViewById(R.id.edy);
        this.z = this.K.findViewById(R.id.edz);
        this.A = this.K.findViewById(R.id.c6);
        this.B = (LinearLayout) this.K.findViewById(R.id.r2);
        this.C = (ViewGroup) this.K.findViewById(R.id.c5);
        this.G = (LiveButton) this.K.findViewById(R.id.cb3);
        this.H = (LiveButton) this.K.findViewById(R.id.fbv);
        this.D = (LiveButton) this.K.findViewById(R.id.mu);
        this.E = (LiveButton) this.K.findViewById(R.id.b7g);
        this.F = (LiveButton) this.K.findViewById(R.id.edr);
        this.I = (LiveButton) this.K.findViewById(R.id.flx);
        this.J = (ComboView) this.K.findViewById(R.id.a9m);
        this.M = new am(this.f21843k);
        RecyclerView recyclerView = this.L;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.L.setAdapter(this.M);
        this.N = (TextView) this.K.findViewById(R.id.c_z);
        a(this.f21836d);
        DataChannel dataChannel = this.f21835c;
        if (dataChannel != null) {
            dataChannel.c(e.class, true);
        }
        DataChannelGlobal.f34575d.a(this, this, com.bytedance.android.live.n.aa.class, new h(this));
        return this.K;
    }
}
