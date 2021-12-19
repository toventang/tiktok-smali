package emotes.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.n.aa;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import emotes.c.h;
import emotes.c.k;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends v implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final C4150a f157065e = new C4150a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final j.a.a.f f157066a = new j.a.a.f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f157067b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<EmoteModel> f157068c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public EmoteModel f157069d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f157070f = true;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f157071g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f157072h;

    /* renamed from: i  reason: collision with root package name */
    private View f157073i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f157074j = true;

    /* renamed from: k  reason: collision with root package name */
    private int f157075k = 5;

    /* renamed from: l  reason: collision with root package name */
    private boolean f157076l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f157077m;
    private SSGridLayoutManager n;
    private final j.a.a.d t = new j.a.a.d();
    private int u = y.a(58.0f);
    private HashMap v;

    static {
        Covode.recordClassIndex(104306);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.v.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: emotes.a.a$a  reason: collision with other inner class name */
    public static final class C4150a {
        static {
            Covode.recordClassIndex(104307);
        }

        private C4150a() {
        }

        public /* synthetic */ C4150a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        v.b bVar = new v.b(R.layout.b6d);
        bVar.f22375b = R.style.a2d;
        if (this.f157070f) {
            i2 = 80;
        } else {
            i2 = 8388613;
        }
        bVar.f22380g = i2;
        bVar.f22382i = -1;
        bVar.f22379f = 0.0f;
        return bVar;
    }

    public final void d() {
        if (!this.f157068c.isEmpty()) {
            this.t.clear();
            j.a.a.d dVar = this.t;
            dVar.add(0, new h(this.f157076l, this.f157067b));
            for (T t2 : this.f157068c) {
                t2.f7394k = true;
                t2.f7395l = false;
            }
            dVar.addAll(this.f157068c);
            if (!this.f157067b && !this.f157077m) {
                dVar.add(new emotes.c.e(this.f157076l, this.f157067b));
            }
            this.f157066a.notifyDataSetChanged();
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f157078a;

        static {
            Covode.recordClassIndex(104308);
        }

        b(a aVar) {
            this.f157078a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f157078a.onEvent((com.bytedance.android.livesdkapi.depend.b.a) obj);
        }
    }

    public static final class e extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f157079e;

        static {
            Covode.recordClassIndex(104311);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f157079e = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f157079e.f157066a.getItemViewType(i2) == 1) {
                return 1;
            }
            return 5;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f157080a;

        static {
            Covode.recordClassIndex(104312);
        }

        f(a aVar) {
            this.f157080a = aVar;
        }

        public final void onClick(View view) {
            this.f157080a.dismiss();
        }
    }

    static final class c extends m implements h.f.a.b<SubscribeBadge, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(104309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(SubscribeBadge subscribeBadge) {
            l.d(subscribeBadge, "");
            this.this$0.f157067b = true;
            this.this$0.d();
            return z.f158842a;
        }
    }

    public final void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2;
        if (aVar != null && (aVar2 = aVar.f22946a) != null) {
            this.f157076l = aVar2.b();
            d();
        }
    }

    static final class d extends m implements h.f.a.b<List<EmoteModel>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(104310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<EmoteModel> list) {
            List<EmoteModel> list2 = list;
            l.d(list2, "");
            if (list2.size() > 0 && this.this$0.f157068c.size() == 0) {
                this.this$0.f157068c.addAll(list2);
                this.this$0.d();
            }
            return z.f158842a;
        }
    }

    @Override // emotes.a.d
    public final void a(String str) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (getContext() != null && room != null) {
            com.bytedance.android.live.o.a aVar = (com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class);
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            aVar.openUserSubscribeEntry(context, room, str);
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        User owner;
        User owner2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f157075k = 5;
        View findViewById = view.findViewById(R.id.drb);
        l.b(findViewById, "");
        this.f157071g = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.bzu);
        l.b(findViewById2, "");
        this.f157072h = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d0v);
        l.b(findViewById3, "");
        this.f157073i = findViewById3;
        ImageView imageView = this.f157072h;
        if (imageView == null) {
            l.a("mIvPlanet");
        }
        boolean z3 = false;
        imageView.setVisibility(0);
        this.u = (y.c() - y.a(18.0f)) / this.f157075k;
        j.a.a.f fVar = this.f157066a;
        if (this.f157069d != null) {
            EmoteModel emoteModel = this.f157069d;
            if (emoteModel == null) {
                l.b();
            }
            fVar.a(h.class, new emotes.c.d(emoteModel));
        }
        fVar.a(EmoteModel.class, new k(this.u, null, null));
        fVar.a(emotes.c.e.class, new emotes.c.c(this));
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(getContext(), 5);
        this.n = sSGridLayoutManager;
        sSGridLayoutManager.a(new e(this));
        RecyclerView recyclerView = this.f157071g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.setAdapter(this.f157066a);
        RecyclerView recyclerView2 = this.f157071g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        recyclerView2.setLayoutManager(this.n);
        RecyclerView recyclerView3 = this.f157071g;
        if (recyclerView3 == null) {
            l.a("mRecyclerView");
        }
        recyclerView3.setHasFixedSize(true);
        RecyclerView recyclerView4 = this.f157071g;
        if (recyclerView4 == null) {
            l.a("mRecyclerView");
        }
        recyclerView4.setItemViewCacheSize(36);
        RecyclerView recyclerView5 = this.f157071g;
        if (recyclerView5 == null) {
            l.a("mRecyclerView");
        }
        p.b(recyclerView5, y.a(32.0f));
        RecyclerView recyclerView6 = this.f157071g;
        if (recyclerView6 == null) {
            l.a("mRecyclerView");
        }
        recyclerView6.setNestedScrollingEnabled(false);
        String a2 = HSAnimImageView.f9268i.a("tiktok_live_basic_resource", "ttlive_bg_emote_header.png", false);
        if (!TextUtils.isEmpty(a2)) {
            ImageView imageView2 = this.f157072h;
            if (imageView2 == null) {
                l.a("mIvPlanet");
            }
            com.bytedance.android.live.core.f.p.a(imageView2, new ImageModel(a2, n.a(a2)), 0);
            View view2 = this.f157073i;
            if (view2 == null) {
                l.a("mOuterView");
            }
            view2.setOnClickListener(new f(this));
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || (owner2 = room.getOwner()) == null) {
            z = false;
        } else {
            z = owner2.isFollowing();
        }
        this.f157076l = z;
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new b(this));
        Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room2 == null || (owner = room2.getOwner()) == null) {
            z2 = false;
        } else {
            z2 = owner.isSubscribed();
        }
        this.f157067b = z2;
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        Room room3 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room3 != null && c2 == room3.getOwnerUserId()) {
            z3 = true;
        }
        this.f157077m = z3;
        this.f157068c.clear();
        Collection<? extends EmoteModel> collection = (List) DataChannelGlobal.f34575d.b(com.bytedance.android.live.d.class);
        if (collection == null) {
            collection = new ArrayList<>();
        }
        this.f157068c.addAll(collection);
        DataChannelGlobal.f34575d.a(this, this, aa.class, new c(this));
        DataChannelGlobal.f34575d.a(this, this, com.bytedance.android.live.d.class, new d(this));
        this.f157066a.a(this.t);
        d();
        if (DataChannelGlobal.f34575d.b(ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_entrance", "comment_area");
            emotes.b.a.a(hashMap);
            b.a.a("livesdk_privilege_emote_show").a().a((Map<String, String>) hashMap).b();
        }
    }
}
