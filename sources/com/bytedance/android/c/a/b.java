package com.bytedance.android.c.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.c.a.c;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.d;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.n.aa;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentEmoteInputMaxCount;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.common.d.e;
import com.zhiliaoapp.musically.R;
import emotes.a.b;
import emotes.c.h;
import emotes.c.j;
import emotes.c.k;
import h.a.n;
import h.f.b.l;
import j.a.a.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SpannableStringBuilder f6816a = new SpannableStringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final List<EmoteModel> f6817b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6818c;

    /* renamed from: d  reason: collision with root package name */
    public a f6819d;

    /* renamed from: e  reason: collision with root package name */
    c.a f6820e;

    /* renamed from: m  reason: collision with root package name */
    private LiveTextView f6821m;
    private c.a n;
    private final int o;
    private final int p;
    private final int q;
    private emotes.a.b r;

    public interface a extends c.a {
        static {
            Covode.recordClassIndex(3276);
        }

        void a(List<? extends EmoteModel> list);
    }

    static {
        Covode.recordClassIndex(3275);
    }

    @Override // com.bytedance.android.c.a.c
    public final int a() {
        return 2131234354;
    }

    /* renamed from: com.bytedance.android.c.a.b$b  reason: collision with other inner class name */
    public static final class C0094b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f6822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6823b;

        static {
            Covode.recordClassIndex(3277);
        }

        @Override // com.bytedance.android.live.e.a.a.a
        public final void b_() {
        }

        @Override // com.bytedance.android.c.a.c.a
        public final void a_() {
            this.f6822a.a_();
        }

        @Override // com.bytedance.android.c.a.c.a
        public final void a(c cVar) {
            l.d(cVar, "");
            this.f6822a.a(cVar);
            this.f6823b.f();
        }

        @Override // com.bytedance.android.live.e.a.a.a
        public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
            if (this.f6823b.f6816a.length() >= this.f6823b.f6818c) {
                ao.a(y.e(), this.f6823b.f6833l.getResources().getQuantityString(R.plurals.gj, this.f6823b.f6818c, String.valueOf(this.f6823b.f6818c)), 0);
                return;
            }
            if (!(aVar instanceof EmoteModel)) {
                aVar = null;
            }
            EmoteModel emoteModel = (EmoteModel) aVar;
            if (emoteModel != null) {
                this.f6823b.a(emoteModel);
            }
        }

        C0094b(c.a aVar, b bVar) {
            this.f6822a = aVar;
            this.f6823b = bVar;
        }
    }

    public static final class c implements b.AbstractC4151b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f6824a;

        static {
            Covode.recordClassIndex(3278);
        }

        @Override // emotes.a.b.AbstractC4151b
        public final void a() {
            c.a aVar = this.f6824a.f6820e;
            if (aVar != null) {
                aVar.a_();
            }
        }

        c(b bVar) {
            this.f6824a = bVar;
        }

        @Override // emotes.a.b.AbstractC4151b
        public final void a(boolean z) {
            this.f6824a.e(z);
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final boolean d() {
        if (this.f6816a.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.c.a.c
    public final /* synthetic */ CharSequence b() {
        String string = this.f6833l.getResources().getString(R.string.en4);
        l.b(string, "");
        return string;
    }

    @Override // com.bytedance.android.c.a.c
    public final void e() {
        a aVar = this.f6819d;
        if (aVar != null) {
            e copyOf = e.copyOf(this.f6817b);
            l.b(copyOf, "");
            aVar.a(copyOf);
        }
    }

    public final void f() {
        if (this.f6832k) {
            emotes.a.b bVar = this.r;
            if (bVar != null) {
                bVar.a(true);
            }
        } else if (this.f6817b.size() >= this.f6818c) {
            emotes.a.b bVar2 = this.r;
            if (bVar2 != null) {
                bVar2.a(true);
            }
        } else {
            emotes.a.b bVar3 = this.r;
            if (bVar3 != null) {
                bVar3.a(false);
            }
        }
    }

    private final void g() {
        if (this.f6832k) {
            LiveTextView liveTextView = this.f6821m;
            if (liveTextView != null) {
                liveTextView.setText(R.string.eb_);
            }
        } else if (this.f6816a.length() == 0) {
            LiveTextView liveTextView2 = this.f6821m;
            if (liveTextView2 != null) {
                liveTextView2.setText(this.f6833l.getResources().getString(R.string.en2, String.valueOf(this.f6818c)));
            }
        } else {
            LiveTextView liveTextView3 = this.f6821m;
            if (liveTextView3 != null) {
                liveTextView3.setText(this.f6816a);
            }
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final void c() {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = this.f6816a;
        if (spannableStringBuilder.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && spannableStringBuilder != null) {
            spannableStringBuilder.delete(this.f6816a.length() - 1, this.f6816a.length());
        }
        List<EmoteModel> list = this.f6817b;
        if ((!list.isEmpty()) && list != null) {
            list.remove(n.a((List) this.f6817b));
        }
        g();
        c.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final void a(c.a aVar) {
        if (aVar != null) {
            this.n = new C0094b(aVar, this);
        }
        this.f6820e = aVar;
    }

    @Override // com.bytedance.android.c.a.c
    public final void b(boolean z) {
        super.b(z);
        g();
        f();
    }

    public final void a(List<? extends EmoteModel> list) {
        int size = this.f6817b.size();
        for (int i2 = 0; i2 < size; i2++) {
            c();
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                a((EmoteModel) it.next());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        this.o = context.getResources().getDimensionPixelSize(R.dimen.wa);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.wb);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.w_);
        this.f6817b = new ArrayList();
        this.f6818c = LiveCommentEmoteInputMaxCount.INSTANCE.getValue();
    }

    public final void a(EmoteModel emoteModel) {
        this.f6816a.append((char) 65532);
        SpannableStringBuilder spannableStringBuilder = this.f6816a;
        Drawable mutate = emoteModel.f7396m.mutate();
        int i2 = this.o;
        mutate.setBounds(0, 0, i2, i2);
        androidx.core.graphics.drawable.a.b(mutate, com.bytedance.android.live.uikit.c.a.a(this.f6833l) ? 1 : 0);
        l.b(mutate, "");
        m mVar = new m(mutate);
        mVar.a((float) this.q);
        mVar.f22625a = this.p;
        spannableStringBuilder.setSpan(mVar, this.f6816a.length() - 1, this.f6816a.length(), 33);
        this.f6817b.add(emoteModel);
        g();
        c.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final View b(ViewGroup viewGroup) {
        MethodCollector.i(1389);
        l.d(viewGroup, "");
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f6833l);
        horizontalScrollView.setScrollBarSize(0);
        LiveTextView liveTextView = new LiveTextView(this.f6833l);
        liveTextView.setGravity(16);
        liveTextView.setSingleLine(true);
        liveTextView.a(R.style.to);
        liveTextView.setTextColor(com.bytedance.android.live.design.b.a(liveTextView, (int) R.attr.amp));
        this.f6821m = liveTextView;
        horizontalScrollView.addView(liveTextView, -2, -1);
        g();
        MethodCollector.o(1389);
        return horizontalScrollView;
    }

    @Override // com.bytedance.android.c.a.c
    public final void a(boolean z) {
        super.a(z);
        emotes.a.b bVar = this.r;
        if (bVar != null && z) {
            if (DataChannelGlobal.f34575d.b(ac.class) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("show_entrance", "comment_area");
                emotes.b.a.a(hashMap);
                b.a.a("livesdk_privilege_emote_bar_show").a().a((Map<String, String>) hashMap).b();
            }
            if (!bVar.f157088m) {
                emotes.b.a.a("emote_bar");
            }
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final View a(ViewGroup viewGroup) {
        int i2;
        boolean z;
        boolean z2;
        User owner;
        User owner2;
        l.d(viewGroup, "");
        Context context = this.f6833l;
        boolean z3 = this.f6828g;
        c.a aVar = this.n;
        emotes.a.b bVar = new emotes.a.b(context);
        bVar.setOnEmojiSelectListener(aVar);
        bVar.f157086k = z3;
        if (bVar.f157086k) {
            i2 = 5;
        } else {
            i2 = 10;
        }
        bVar.f157087l = i2;
        View findViewById = bVar.findViewById(R.id.drb);
        l.b(findViewById, "");
        bVar.f157082g = (RecyclerView) findViewById;
        RecyclerView recyclerView = bVar.f157082g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        boolean z4 = false;
        recyclerView.setClipToPadding(false);
        bVar.s = (y.c() - y.a(18.0f)) / bVar.f157087l;
        f fVar = bVar.f157083h;
        fVar.a(h.class, new j(bVar));
        fVar.a(EmoteModel.class, new k(bVar.s, bVar, bVar));
        bVar.f157084i = new SSGridLayoutManager(bVar.getContext(), bVar.f157087l);
        SSGridLayoutManager sSGridLayoutManager = bVar.f157084i;
        if (sSGridLayoutManager != null) {
            sSGridLayoutManager.a(new b.f(bVar));
        }
        RecyclerView recyclerView2 = bVar.f157082g;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        recyclerView2.setAdapter(bVar.f157083h);
        RecyclerView recyclerView3 = bVar.f157082g;
        if (recyclerView3 == null) {
            l.a("mRecyclerView");
        }
        recyclerView3.setLayoutManager(bVar.f157084i);
        RecyclerView recyclerView4 = bVar.f157082g;
        if (recyclerView4 == null) {
            l.a("mRecyclerView");
        }
        recyclerView4.setHasFixedSize(true);
        RecyclerView recyclerView5 = bVar.f157082g;
        if (recyclerView5 == null) {
            l.a("mRecyclerView");
        }
        recyclerView5.setItemViewCacheSize(36);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || (owner2 = room.getOwner()) == null) {
            z = false;
        } else {
            z = owner2.isFollowing();
        }
        bVar.n = z;
        bVar.r.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b.c(bVar)));
        Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room2 == null || (owner = room2.getOwner()) == null) {
            z2 = false;
        } else {
            z2 = owner.isSubscribed();
        }
        bVar.f157088m = z2;
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        Room room3 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room3 != null && c2 == room3.getOwnerUserId()) {
            z4 = true;
        }
        bVar.o = z4;
        b.AbstractC4151b bVar2 = bVar.f157085j;
        if (bVar2 != null) {
            bVar2.a(bVar.b());
        }
        bVar.q.clear();
        Collection<? extends EmoteModel> collection = (List) DataChannelGlobal.f34575d.b(d.class);
        if (collection == null) {
            collection = new ArrayList<>();
        }
        bVar.q.addAll(collection);
        if (bVar.getContext() instanceof androidx.lifecycle.m) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
            Context context2 = bVar.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            dataChannelGlobal.a(bVar, (androidx.lifecycle.m) context2, aa.class, new b.d(bVar));
            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.f34575d;
            Context context3 = bVar.getContext();
            Objects.requireNonNull(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            dataChannelGlobal2.a(bVar, (androidx.lifecycle.m) context3, d.class, new b.e(bVar));
        }
        bVar.f157083h.a(bVar.p);
        bVar.c();
        Context context4 = bVar.getContext();
        l.b(context4, "");
        int dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.w9);
        RecyclerView recyclerView6 = bVar.f157082g;
        if (recyclerView6 == null) {
            l.a("mRecyclerView");
        }
        RecyclerView recyclerView7 = bVar.f157082g;
        if (recyclerView7 == null) {
            l.a("mRecyclerView");
        }
        int paddingLeft = recyclerView7.getPaddingLeft();
        RecyclerView recyclerView8 = bVar.f157082g;
        if (recyclerView8 == null) {
            l.a("mRecyclerView");
        }
        int paddingTop = recyclerView8.getPaddingTop();
        RecyclerView recyclerView9 = bVar.f157082g;
        if (recyclerView9 == null) {
            l.a("mRecyclerView");
        }
        recyclerView6.setPadding(paddingLeft, paddingTop, recyclerView9.getPaddingRight(), dimensionPixelSize);
        this.r = bVar;
        f();
        e(bVar.b());
        bVar.setEmoteSelectPanelCallback(new c(this));
        l.b(bVar, "");
        return bVar;
    }
}
