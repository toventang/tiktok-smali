package com.bytedance.android.livesdk.rank.impl.ranks.b;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.live.liveinteract.api.af;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRankListCoHostEnableSetting;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.az;
import com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.android.livesdk.rank.impl.ranks.a.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class b extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f20873h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<z> f20874a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f20875b;

    /* renamed from: c  reason: collision with root package name */
    public a f20876c;

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f20877d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20878e;

    /* renamed from: f  reason: collision with root package name */
    public RankPage f20879f;

    /* renamed from: g  reason: collision with root package name */
    public m f20880g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f20881i = h.i.a((h.f.a.a) new g(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f20882j = h.i.a((h.f.a.a) new f(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f20883k;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$b  reason: collision with other inner class name */
    static final class C0441b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0441b f20891a = new C0441b();

        static {
            Covode.recordClassIndex(12356);
        }

        C0441b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f20895a = new c();

        static {
            Covode.recordClassIndex(12357);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12354);
    }

    public View a(int i2) {
        if (this.f20883k == null) {
            this.f20883k = new HashMap();
        }
        View view = (View) this.f20883k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20883k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract void a(Rank rank, List<Rank> list);

    /* access modifiers changed from: protected */
    public final boolean a() {
        return ((Boolean) this.f20882j.getValue()).booleanValue();
    }

    public abstract a d();

    public abstract String e();

    public void g() {
        HashMap hashMap = this.f20883k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12355);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RankPage f20902b;

        static {
            Covode.recordClassIndex(12365);
        }

        k(b bVar, RankPage rankPage) {
            this.f20901a = bVar;
            this.f20902b = rankPage;
        }

        public final void run() {
            a aVar = this.f20901a.f20876c;
            if (aVar != null) {
                aVar.a(this.f20902b);
            }
        }
    }

    public final h.f.a.a<z> b() {
        h.f.a.a<z> aVar = this.f20874a;
        if (aVar == null) {
            l.a("mDismissDialog");
        }
        return aVar;
    }

    public final c.a c() {
        c.a aVar = this.f20875b;
        if (aVar == null) {
            l.a("mRankFragmentPresenter");
        }
        return aVar;
    }

    static final class f extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("is_anchor");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("page_position");
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        a aVar = this.f20876c;
        if (aVar != null && getUserVisibleHint()) {
            b(aVar.f20830c);
        }
        super.onDestroy();
    }

    private final void h() {
        az azVar;
        String str;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        LiveButton liveButton = (LiveButton) a(R.id.zn);
        if (liveButton != null) {
            IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
            boolean isEnabled = liveButton.isEnabled();
            DataChannel dataChannel = this.f20877d;
            if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (azVar = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                azVar = az.UNKNOWN;
            }
            if (a()) {
                str = "anchor";
            } else {
                str = "user";
            }
            iGiftService.monitorGiftIconShow(isEnabled, azVar, str, e());
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        OwnerRank ownerRank;
        int i2;
        String obj;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RankPage rankPage = this.f20879f;
        if (rankPage != null && (ownerRank = rankPage.getOwnerRank()) != null) {
            LiveTextView liveTextView = (LiveTextView) a(R.id.dh4);
            liveTextView.setText(ownerRank.getRankStr());
            int rank = ownerRank.getRank();
            boolean z = true;
            if (rank == 1) {
                i2 = R.color.xo;
            } else if (rank == 2) {
                i2 = R.color.xp;
            } else if (rank != 3) {
                i2 = R.color.x5;
            } else {
                i2 = R.color.xq;
            }
            liveTextView.setTextColor(y.b(i2));
            String e2 = e();
            if (l.a((Object) e2, (Object) com.bytedance.android.livesdk.rank.api.j.HOURLY_RANK.getRankName())) {
                com.bytedance.android.livesdk.rank.impl.c.a.a(com.bytedance.android.livesdk.rank.api.j.HOURLY_RANK.getType(), ownerRank.getRank());
            } else if (l.a((Object) e2, (Object) com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getRankName())) {
                com.bytedance.android.livesdk.rank.impl.c.a.a(com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getType(), ownerRank.getRank());
            }
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.ezy);
            l.b(liveTextView2, "");
            if (!l.a((Object) e(), (Object) com.bytedance.android.livesdk.rank.api.j.HOURLY_RANK.getRankName()) || ownerRank.getUser().getSecret() == 1) {
                obj = com.bytedance.android.livesdk.chatroom.f.c.a(ownerRank.getGapDescription(), "").toString();
            } else {
                obj = com.bytedance.android.livesdk.rank.impl.d.b.a().a(ownerRank.getUser().getId(), ownerRank.getGapScore(), ownerRank.getRank(), ownerRank.getGapDescription());
            }
            liveTextView2.setText(obj);
            LiveButton liveButton = (LiveButton) a(R.id.zn);
            liveButton.setVisibility(0);
            DataChannel dataChannel = this.f20877d;
            if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableGift()) {
                z = false;
            }
            liveButton.setEnabled(z);
            liveButton.setOnClickListener(new d(ownerRank, this));
            if (getUserVisibleHint()) {
                h();
            }
            ImageModel avatarThumb = ownerRank.getUser().getAvatarThumb();
            ImageView imageView = (ImageView) a(R.id.fcu);
            l.b(imageView, "");
            int width = imageView.getWidth();
            ImageView imageView2 = (ImageView) a(R.id.fcu);
            l.b(imageView2, "");
            com.bytedance.android.livesdk.chatroom.g.g.a((ImageView) a(R.id.fcu), avatarThumb, width, imageView2.getHeight(), 2131234621);
            com.bytedance.android.livesdk.model.j a2 = com.bytedance.android.livesdk.d.a.a(ownerRank.getUser());
            if (a2 != null) {
                com.bytedance.android.live.core.f.k.a((HSImageView) a(R.id.bu1), a2.f19085a);
            }
            LiveTextView liveTextView3 = (LiveTextView) a(R.id.cs_);
            l.b(liveTextView3, "");
            liveTextView3.setText(ownerRank.getUser().displayId);
        }
    }

    public final void a(c.a aVar) {
        l.d(aVar, "");
        this.f20875b = aVar;
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f20874a = aVar;
    }

    static final class h extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.b().invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OwnerRank f20896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f20897b;

        static {
            Covode.recordClassIndex(12358);
        }

        d(OwnerRank ownerRank, b bVar) {
            this.f20896a = ownerRank;
            this.f20897b = bVar;
        }

        public final void onClick(View view) {
            this.f20897b.b().invoke();
            DataChannel dataChannel = this.f20897b.f20877d;
            if (dataChannel != null) {
                com.bytedance.android.livesdk.gift.d.h hVar = new com.bytedance.android.livesdk.gift.d.h();
                hVar.f17850a = this.f20896a.getUser();
                hVar.f17851b = this.f20897b.e();
                dataChannel.c(t.class, hVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            a(b.a.a("livesdk_hourly_live_rank_show")).b();
            c.a aVar = this.f20875b;
            if (aVar == null) {
                l.a("mRankFragmentPresenter");
            }
            aVar.d();
            h();
            return;
        }
        a aVar2 = this.f20876c;
        if (aVar2 != null) {
            b(aVar2.f20830c);
        }
    }

    public final com.bytedance.android.livesdk.ab.b a(com.bytedance.android.livesdk.ab.b bVar) {
        String str;
        String str2;
        l.d(bVar, "");
        com.bytedance.android.livesdk.ab.b a2 = bVar.a();
        if (a()) {
            str = "anchor";
        } else {
            str = "user";
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("user_type", str).a("rank_type", e());
        c.a aVar = this.f20875b;
        if (aVar == null) {
            l.a("mRankFragmentPresenter");
        }
        if (aVar.e()) {
            str2 = "click";
        } else {
            str2 = "swipe";
        }
        a3.a("enter_from", str2);
        if (TextUtils.equals(e(), com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getRankName())) {
            c.a aVar2 = this.f20875b;
            if (aVar2 == null) {
                l.a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g2 = aVar2.g();
            if (g2 != null) {
                String str3 = "user_live_area";
                bVar.a(str3, g2.getViewerRegion());
                bVar.a("anchor_live_area", g2.getRoomRegion());
                if (g2.getCurrentType() != com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                    str3 = "anchor_live_area";
                }
                bVar.a("rank_area", str3);
            }
        }
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        RankPage rankPage;
        RankResponse rankResponse;
        List<RankPage> pages;
        super.onCreate(bundle);
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        this.f20877d = a2;
        Integer num = null;
        if (a2 != null) {
            bool = (Boolean) a2.b(cp.class);
        } else {
            bool = null;
        }
        this.f20878e = p.d(bool);
        DataChannel dataChannel = this.f20877d;
        if (dataChannel == null || (rankResponse = (RankResponse) dataChannel.b(com.bytedance.android.livesdk.rank.impl.c.class)) == null || (pages = rankResponse.getPages()) == null) {
            rankPage = null;
        } else {
            rankPage = pages.get(((Number) this.f20881i.getValue()).intValue());
        }
        this.f20879f = rankPage;
        c.a aVar = this.f20875b;
        if (aVar == null) {
            l.a("mRankFragmentPresenter");
        }
        Map<Integer, m> c2 = aVar.c();
        RankPage rankPage2 = this.f20879f;
        if (rankPage2 != null) {
            num = Integer.valueOf(rankPage2.getRankType());
        }
        this.f20880g = c2.get(num);
        DataChannel dataChannel2 = this.f20877d;
        if (dataChannel2 != null) {
            dataChannel2.a(af.class, (h.f.a.b) new h(this));
        }
    }

    private final void b(int i2) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("last_user_rank", String.valueOf(i2));
        if (a()) {
            str = "anchor";
        } else {
            str = "user";
        }
        hashMap.put("user_type", str);
        if (TextUtils.equals(e(), com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getRankName())) {
            c.a aVar = this.f20875b;
            if (aVar == null) {
                l.a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g2 = aVar.g();
            if (g2 != null) {
                String str3 = "user_live_area";
                hashMap.put(str3, g2.getViewerRegion());
                hashMap.put("anchor_live_area", g2.getRoomRegion());
                if (g2.getCurrentType() != com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                    str3 = "anchor_live_area";
                }
                hashMap.put("rank_area", str3);
            }
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_hourly_user_rank_swipe_to_end").a(this.f20877d);
        if (this.f20878e) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        a2.a("room_orientation", str2).a("rank_type", e()).a((Map<String, String>) hashMap).b();
    }

    public final void a(Rank rank) {
        int i2;
        String str;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_rank_list_anchor_click").a("anchor_id", rank.getUser().getId());
        if (rank.getRoomId() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("is_live", i2).a("rank", rank.getRank()).a("rank_type", e());
        if (a()) {
            str = "anchor";
        } else {
            str = "user";
        }
        a3.a("user_type", str).b();
    }

    static final class e extends h.f.b.m implements h.f.a.b<Rank, z> {
        final /* synthetic */ RankPage $this_run$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RankPage rankPage, b bVar) {
            super(1);
            this.$this_run$inlined = rankPage;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Rank rank) {
            Rank rank2 = rank;
            l.d(rank2, "");
            this.this$0.a(rank2);
            boolean z = false;
            if (rank2.getUser().getId() == this.$this_run$inlined.getOwnerRank().getUser().getId() || rank2.getRoomId() <= 0) {
                this.this$0.a(rank2.getUser(), rank2.getRoomId(), false);
            } else if (!this.this$0.a()) {
                if (rank2.getUser().getSecret() == 1) {
                    FollowInfo followInfo = rank2.getUser().getFollowInfo();
                    l.b(followInfo, "");
                    long followStatus = followInfo.getFollowStatus();
                    if (1 > followStatus || 2 < followStatus) {
                        b bVar = this.this$0;
                        b.a.a("livesdk_follow_private_host_popup").a("anchor_id", rank2.getUser().getId()).a("room_id", rank2.getRoomId()).b();
                        p.a(new b.a(bVar.getContext()).a(R.string.dtm).b(R.string.dtl).a(R.string.e34, (DialogInterface.OnClickListener) new i(bVar, rank2), false).b(R.string.gle, (DialogInterface.OnClickListener) j.f20900a, false).a());
                    }
                }
                this.this$0.b(rank2);
            } else if (LiveRankListCoHostEnableSetting.INSTANCE.getValue()) {
                b bVar2 = this.this$0;
                User user = rank2.getUser();
                long roomId = rank2.getRoomId();
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class);
                l.b(a2, "");
                if (((com.bytedance.android.livesdk.rank.api.d) a2).isRoomOnRank()) {
                    com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                    l.b(a3, "");
                    if (!((com.bytedance.android.live.liveinteract.api.b) a3).isLinkingMic()) {
                        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                        l.b(a4, "");
                        if (!((com.bytedance.android.live.liveinteract.api.b) a4).isInRandomLinkMic()) {
                            z = true;
                        }
                    }
                }
                bVar2.a(user, roomId, z);
            } else {
                ao.a(y.e(), (int) R.string.e8k);
                this.this$0.b().invoke();
            }
            return z.f158842a;
        }
    }

    public final void a(RankPage rankPage) {
        l.d(rankPage, "");
        this.f20879f = rankPage;
        ((RecyclerView) a(R.id.djs)).post(new k(this, rankPage));
        f();
    }

    public final void b(Rank rank) {
        List<Rank> list;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", e());
        hashMap.put("anchor_id", String.valueOf(rank.getUser().getId()));
        hashMap.put("room_id", String.valueOf(rank.getRoomId()));
        hashMap.put("action_type", "click");
        hashMap.put("is_return", "0");
        c.a aVar = this.f20875b;
        if (aVar == null) {
            l.a("mRankFragmentPresenter");
        }
        WeeklyRankRegionInfo g2 = aVar.g();
        String str2 = "user_live_area";
        if (g2 != null) {
            if (g2.getCurrentType() == com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                str = str2;
            } else {
                str = "anchor_live_area";
            }
            hashMap.put("rank_area", str);
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_show").a(this.f20877d).a((Map<String, String>) hashMap);
        l.d(a2, "");
        if (TextUtils.equals(e(), com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getRankName())) {
            c.a aVar2 = this.f20875b;
            if (aVar2 == null) {
                l.a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g3 = aVar2.g();
            if (g3 != null) {
                if (g3.getCurrentType() != com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                    str2 = "anchor_live_area";
                }
                a2.a("rank_area", str2);
            }
        }
        a2.b();
        a(b.a.a("livesdk_live_rank_click").a(this.f20877d)).a("rank", rank.getRank()).b();
        RankPage rankPage = this.f20879f;
        if (rankPage == null || (list = rankPage.getRanks()) == null) {
            list = Collections.emptyList();
            l.b(list, "");
        }
        a(rank, list);
    }

    static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f20900a = new j();

        static {
            Covode.recordClassIndex(12364);
        }

        j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Rank f20899b;

        static {
            Covode.recordClassIndex(12363);
        }

        i(b bVar, Rank rank) {
            this.f20898a = bVar;
            this.f20899b = rank;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            b bVar = this.f20898a;
            Rank rank = this.f20899b;
            u.a().b().a(((d.a) new d.b().a(rank.getUser().getId())).b(rank.getRoomId()).c()).a(C0441b.f20891a, c.f20895a);
            b.a.a("livesdk_follow").a(bVar.f20877d).a("request_page", "live_audience_c_anchor").a("click_user_position", "private_host_follow").a("to_user_id", rank.getUser().getId()).b();
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RankPage rankPage = this.f20879f;
        if (rankPage != null) {
            ArrayList arrayList = new ArrayList();
            for (Rank rank : rankPage.getRanks()) {
                if (rank.getRoomId() > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_rank_list_anchor_status").a("is_live", arrayList.toString()).a("rank_type", e());
            if (a()) {
                str = "anchor";
            } else {
                str = "user";
            }
            a2.a("user_type", str).b();
        }
        RankPage rankPage2 = this.f20879f;
        if (rankPage2 != null) {
            a d2 = d();
            e eVar = new e(rankPage2, this);
            l.d(eVar, "");
            d2.f20831d = eVar;
            this.f20876c = d2;
            RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
            recyclerView.setAdapter(this.f20876c);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
            com.bytedance.android.livesdk.performance.b bVar = null;
            if (!(itemAnimator instanceof ab)) {
                itemAnimator = null;
            }
            ab abVar = (ab) itemAnimator;
            if (abVar != null) {
                abVar.f3953m = false;
            }
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
            l.b(recyclerView2, "");
            l.d(recyclerView2, "");
            h.h<com.bytedance.android.livesdk.performance.b> hVar = com.bytedance.android.livesdk.performance.g.f20231b.get("panel_hourly_rank_slide");
            if (hVar != null) {
                bVar = hVar.getValue();
            }
            recyclerView2.a(new com.bytedance.android.livesdk.performance.c(bVar));
            f();
        }
    }

    public final void a(User user, long j2, boolean z) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(user);
        userProfileEvent.mReportType = "report_anchor";
        userProfileEvent.roomId = j2;
        userProfileEvent.mSource = e();
        userProfileEvent.coHostEnable = z;
        userProfileEvent.linkInRoomEnable = false;
        com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        l.d(layoutInflater, "");
        if (this.f20878e) {
            i2 = R.layout.bbl;
        } else {
            i2 = R.layout.bbm;
        }
        return com.a.a(layoutInflater, i2, viewGroup, false);
    }
}
