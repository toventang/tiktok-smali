package com.bytedance.android.livesdk.rank.impl;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.rank.api.model.c;
import com.bytedance.android.livesdk.rank.api.model.d;
import com.bytedance.android.livesdk.rank.impl.b.b;
import com.bytedance.android.livesdk.rank.impl.f.l;
import com.bytedance.android.livesdk.rank.impl.g.e;
import com.bytedance.android.livesdk.rank.impl.view.NoAudienceView;
import com.bytedance.android.livesdk.rank.impl.view.NoNetworkView;
import com.bytedance.android.livesdk.rank.impl.view.SelfRankInfoView;
import com.bytedance.android.livesdk.rank.impl.view.ServerFailView;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class a extends v implements b.a, b.c {

    /* renamed from: b  reason: collision with root package name */
    public static final C0413a f20616b = new C0413a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b.AbstractC0416b f20617a;

    /* renamed from: c  reason: collision with root package name */
    private View f20618c;

    /* renamed from: d  reason: collision with root package name */
    private LiveTextView f20619d;

    /* renamed from: e  reason: collision with root package name */
    private NoNetworkView f20620e;

    /* renamed from: f  reason: collision with root package name */
    private LiveLoadingView f20621f;

    /* renamed from: g  reason: collision with root package name */
    private ServerFailView f20622g;

    /* renamed from: h  reason: collision with root package name */
    private NoAudienceView f20623h;

    /* renamed from: i  reason: collision with root package name */
    private SelfRankInfoView f20624i;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView f20625j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.livesdk.rank.impl.widget.a f20626k;

    /* renamed from: l  reason: collision with root package name */
    private final long f20627l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f20628m;

    static {
        Covode.recordClassIndex(12181);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20628m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20628m == null) {
            this.f20628m = new HashMap();
        }
        View view = (View) this.f20628m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20628m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.a$a  reason: collision with other inner class name */
    public static final class C0413a {
        static {
            Covode.recordClassIndex(12182);
        }

        private C0413a() {
        }

        public /* synthetic */ C0413a(byte b2) {
            this();
        }

        public static a a(com.bytedance.android.livesdk.rank.impl.widget.a aVar, int i2) {
            l.d(aVar, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable(StringSet.type, aVar);
            bundle.putInt("online_count", i2);
            a aVar2 = new a((byte) 0);
            aVar2.setArguments(bundle);
            return aVar2;
        }
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void d() {
        NoAudienceView noAudienceView = this.f20623h;
        if (noAudienceView != null) {
            noAudienceView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void e() {
        ServerFailView serverFailView = this.f20622g;
        if (serverFailView != null) {
            serverFailView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.a
    public final void f() {
        View view = this.f20618c;
        if (view == null) {
            l.a("mRootView");
        }
        a(view);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void g() {
        LiveLoadingView liveLoadingView = this.f20621f;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b.AbstractC0416b bVar = this.f20617a;
        if (bVar != null) {
            bVar.b();
        }
        a();
    }

    private a() {
        this.f20627l = new Date(System.currentTimeMillis()).getTime();
    }

    private static boolean j() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean h2 = h();
        j.f107226e = h2;
        return h2;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.rank.api.f.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdk.rank.api.f.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        boolean z;
        int i2;
        int i3;
        Boolean bool;
        int a2 = ap.a(getContext());
        v.b bVar = new v.b(R.layout.b8y);
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        int i4 = 80;
        if (z) {
            i2 = 80;
        } else {
            i2 = 8388629;
        }
        bVar.f22380g = i2;
        bVar.f22379f = 0.0f;
        if (z) {
            i3 = -1;
        } else {
            i3 = a2;
        }
        bVar.f22381h = i3;
        if (z) {
            a2 = -2;
        }
        bVar.f22382i = a2;
        if (!z) {
            i4 = 8388629;
        }
        bVar.f22380g = i4;
        return bVar;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    private final void a(View view) {
        RecyclerView recyclerView = this.f20625j;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        NoNetworkView noNetworkView = this.f20620e;
        if (noNetworkView != null) {
            noNetworkView.setVisibility(8);
        }
        SelfRankInfoView selfRankInfoView = this.f20624i;
        if (selfRankInfoView != null) {
            selfRankInfoView.setVisibility(8);
        }
        ServerFailView serverFailView = this.f20622g;
        if (serverFailView != null) {
            serverFailView.setContainer(this);
            serverFailView.setVisibility(8);
        }
        NoNetworkView noNetworkView2 = this.f20620e;
        if (noNetworkView2 != null) {
            noNetworkView2.getContext();
            if (j()) {
                LiveLoadingView liveLoadingView = (LiveLoadingView) view.findViewById(R.id.ci9);
                liveLoadingView.setVisibility(0);
                this.f20621f = liveLoadingView;
                b.AbstractC0416b bVar = this.f20617a;
                if (bVar != null) {
                    bVar.a();
                }
            } else {
                noNetworkView2.setContainer(this);
                noNetworkView2.setVisibility(0);
            }
        }
        ((ImageView) view.findViewById(R.id.de7)).setOnClickListener(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20631a;

        static {
            Covode.recordClassIndex(12183);
        }

        b(a aVar) {
            this.f20631a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.a.b.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void a(List<com.bytedance.android.livesdk.rank.api.model.b> list) {
        l.d(list, "");
        try {
            if (!this.o) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (getContext() != null) {
                com.bytedance.android.livesdk.rank.impl.a.b bVar = new com.bytedance.android.livesdk.rank.impl.a.b();
                bVar.a(com.bytedance.android.livesdk.rank.api.model.f.class, new com.bytedance.android.livesdk.rank.impl.view.a());
                bVar.a(d.class, new com.bytedance.android.livesdk.rank.impl.g.b(this.f20626k));
                bVar.a(com.bytedance.android.livesdk.rank.api.model.b.class, new com.bytedance.android.livesdk.rank.impl.g.d());
                bVar.a(c.class, new com.bytedance.android.livesdk.rank.impl.g.a());
                j.a.a.d dVar = new j.a.a.d();
                dVar.add(new com.bytedance.android.livesdk.rank.api.model.f());
                dVar.add(new d(list.size(), ""));
                dVar.addAll(list);
                dVar.add(new c());
                bVar.a(dVar);
                RecyclerView recyclerView = this.f20625j;
                if (recyclerView != null) {
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                }
                RecyclerView recyclerView2 = this.f20625j;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(bVar);
                }
                RecyclerView recyclerView3 = this.f20625j;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                LiveTextView liveTextView = this.f20619d;
                if (liveTextView != null) {
                    liveTextView.setText(y.a((int) R.plurals.gm, list.size()));
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rank_position", "active_user_rank_detail");
        linkedHashMap.put("last_user_rank", String.valueOf(com.bytedance.android.livesdk.rank.impl.f.l.f20720a));
        b.a.a("active_user_rank_swipe_to_end").a().a((Map<String, String>) linkedHashMap).b();
        DataChannel dataChannel = this.p;
        long j2 = this.f20627l;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("duration", String.valueOf(new Date(System.currentTimeMillis()).getTime() - j2));
        linkedHashMap2.put("show_user_position", "top_active_user_rank");
        linkedHashMap2.put("rank_position", "active_user_rank_detail");
        if (dataChannel != null) {
            obj = dataChannel.b(ee.class);
        } else {
            obj = null;
        }
        if (l.a(obj, (Object) true)) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap2.put("user_type", str);
        b.a.a("livesdk_active_user_rank_duration").a(dataChannel).a((Map<String, String>) linkedHashMap2).b();
        long time = new Date(System.currentTimeMillis()).getTime() - this.f20627l;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            long id = room.getId();
            long ownerUserId = room.getOwnerUserId();
            if (id > 0 && ownerUserId > 0) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("duration", String.valueOf(time));
                linkedHashMap3.put("room_id", String.valueOf(id));
                linkedHashMap3.put("anchor_id", String.valueOf(ownerUserId));
                b.a.a("anchor_active_user_rank_duration").a().a((Map<String, String>) linkedHashMap3).b();
            }
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        try {
            if (this.p != null) {
                this.f20618c = view;
                Bundle arguments = getArguments();
                if (arguments == null || (obj = a(arguments, StringSet.type)) == null) {
                    obj = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceType");
                this.f20626k = (com.bytedance.android.livesdk.rank.impl.widget.a) obj;
                com.bytedance.android.livesdk.rank.impl.widget.a aVar = this.f20626k;
                if (aVar == null) {
                    l.b();
                }
                com.bytedance.android.livesdk.rank.impl.e.a aVar2 = new com.bytedance.android.livesdk.rank.impl.e.a(aVar);
                this.f20617a = aVar2;
                aVar2.a(this);
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    i2 = arguments2.getInt("online_count");
                } else {
                    i2 = 0;
                }
                LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f5h);
                liveTextView.setText(y.a((int) R.plurals.gm, i2));
                this.f20619d = liveTextView;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.n7);
                DataChannel dataChannel = this.p;
                com.bytedance.android.livesdk.rank.impl.f.l.f20720a = -1;
                recyclerView.a(new l.b(dataChannel));
                this.f20625j = recyclerView;
                this.f20623h = (NoAudienceView) view.findViewById(R.id.cvf);
                this.f20624i = (SelfRankInfoView) view.findViewById(R.id.dy8);
                this.f20622g = (ServerFailView) view.findViewById(R.id.dz3);
                this.f20620e = (NoNetworkView) view.findViewById(R.id.cvt);
                a(view);
                com.bytedance.android.livesdk.rank.impl.f.l.a(this.p, "active_user_rank_detail");
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void a(com.bytedance.android.livesdk.rank.api.model.b bVar, String str) {
        boolean z;
        String str2 = "";
        h.f.b.l.d(bVar, str2);
        h.f.b.l.d(str, str2);
        try {
            if (this.p == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (this.o) {
                SelfRankInfoView selfRankInfoView = this.f20624i;
                if (selfRankInfoView != null) {
                    selfRankInfoView.setVisibility(0);
                }
                SelfRankInfoView selfRankInfoView2 = this.f20624i;
                if (selfRankInfoView2 != null) {
                    DataChannel dataChannel = this.p;
                    com.bytedance.android.livesdk.rank.impl.widget.a aVar = this.f20626k;
                    selfRankInfoView2.f21029m = dataChannel;
                    selfRankInfoView2.n = this;
                    selfRankInfoView2.o = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    selfRankInfoView2.p = bVar;
                    selfRankInfoView2.q = str;
                    selfRankInfoView2.r = aVar;
                }
                SelfRankInfoView selfRankInfoView3 = this.f20624i;
                if (selfRankInfoView3 != null) {
                    g.a(selfRankInfoView3.f21025i, selfRankInfoView3.p.f20593a.getAvatarThumb(), selfRankInfoView3.f21025i.getWidth(), selfRankInfoView3.f21025i.getHeight(), 2131234424);
                    com.bytedance.android.livesdk.model.j a2 = com.bytedance.android.livesdk.d.a.a(selfRankInfoView3.p.f20593a);
                    if (a2 != null) {
                        k.a((HSImageView) selfRankInfoView3.findViewById(R.id.bu1), a2.f19085a);
                    }
                    if (selfRankInfoView3.r == com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
                        selfRankInfoView3.f21026j.setVisibility(0);
                        selfRankInfoView3.f21026j.setText(aa.a(selfRankInfoView3.p.f20595c).toUpperCase(Locale.US) + " " + selfRankInfoView3.q);
                    } else {
                        selfRankInfoView3.f21026j.setVisibility(8);
                    }
                    String str3 = selfRankInfoView3.p.f20593a.displayId;
                    LiveTextView liveTextView = selfRankInfoView3.f21024h;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    liveTextView.setText(str2);
                    int i2 = selfRankInfoView3.p.f20594b;
                    boolean z2 = true;
                    if (i2 > 99 || selfRankInfoView3.p.f20595c <= 0) {
                        selfRankInfoView3.f21023g.setText("-");
                    } else {
                        if (i2 == 1) {
                            selfRankInfoView3.f21023g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.ux));
                        } else if (i2 == 2) {
                            selfRankInfoView3.f21023g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uy));
                        } else if (i2 != 3) {
                            selfRankInfoView3.f21023g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uw));
                        } else {
                            selfRankInfoView3.f21023g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uz));
                        }
                        selfRankInfoView3.f21023g.setText(String.valueOf(i2));
                    }
                    if (selfRankInfoView3.r == com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
                        selfRankInfoView3.f21027k.setVisibility(0);
                        selfRankInfoView3.f21027k.setText(selfRankInfoView3.p.f20597e);
                    } else {
                        selfRankInfoView3.f21027k.setVisibility(8);
                    }
                    if (selfRankInfoView3.r != com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
                        selfRankInfoView3.f21028l.setVisibility(8);
                    }
                    selfRankInfoView3.f21028l.setVisibility(0);
                    if (selfRankInfoView3.o.getRoomAuthStatus() == null || !selfRankInfoView3.o.getRoomAuthStatus().isEnableGift()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b() <= 0) {
                        z2 = false;
                    }
                    a.EnumC0371a a3 = com.bytedance.android.livesdk.gift.b.a.a(false, z2, z);
                    if (a3 == a.EnumC0371a.GREY) {
                        selfRankInfoView3.f21028l.setAlpha(0.34f);
                    }
                    selfRankInfoView3.f21028l.setOnClickListener(new com.bytedance.android.livesdk.rank.impl.view.c(selfRankInfoView3, a3));
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.c
    public final void a(List<com.bytedance.android.livesdk.rank.api.model.b> list, String str) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(str, "");
        try {
            if (!this.o) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (getContext() != null) {
                com.bytedance.android.livesdk.rank.impl.a.b bVar = new com.bytedance.android.livesdk.rank.impl.a.b();
                bVar.a(com.bytedance.android.livesdk.rank.api.model.f.class, new com.bytedance.android.livesdk.rank.impl.view.a());
                bVar.a(d.class, new com.bytedance.android.livesdk.rank.impl.g.b(this.f20626k));
                bVar.a(com.bytedance.android.livesdk.rank.api.model.b.class, new e(this.p));
                bVar.a(c.class, new com.bytedance.android.livesdk.rank.impl.g.a());
                j.a.a.d dVar = new j.a.a.d();
                dVar.add(new com.bytedance.android.livesdk.rank.api.model.f());
                dVar.add(new d(list.size(), str));
                dVar.addAll(list);
                dVar.add(new c());
                bVar.a(dVar);
                RecyclerView recyclerView = this.f20625j;
                if (recyclerView != null) {
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                }
                RecyclerView recyclerView2 = this.f20625j;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(bVar);
                }
                RecyclerView recyclerView3 = this.f20625j;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                LiveTextView liveTextView = this.f20619d;
                if (liveTextView != null) {
                    liveTextView.setText(y.a((int) R.plurals.gm, list.size()));
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }
}
