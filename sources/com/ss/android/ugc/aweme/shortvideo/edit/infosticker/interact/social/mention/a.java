package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends FrameLayout implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c, i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final b f127667i = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f127668a;

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b f127669b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a f127670c;

    /* renamed from: d  reason: collision with root package name */
    public final c f127671d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayoutManager f127672e;

    /* renamed from: f  reason: collision with root package name */
    public final int f127673f;

    /* renamed from: g  reason: collision with root package name */
    boolean f127674g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f127675h;

    /* renamed from: j  reason: collision with root package name */
    private final h f127676j;

    /* renamed from: k  reason: collision with root package name */
    private final h f127677k;

    /* renamed from: l  reason: collision with root package name */
    private final b f127678l;

    /* renamed from: m  reason: collision with root package name */
    private int f127679m;
    private AbstractC3321a n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$a  reason: collision with other inner class name */
    public interface AbstractC3321a {
        static {
            Covode.recordClassIndex(83699);
        }

        void a(User user);
    }

    static {
        Covode.recordClassIndex(83697);
    }

    /* access modifiers changed from: package-private */
    public final HashSet<String> getFetchedUidSet() {
        return (HashSet) this.f127676j.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e getMSummonFriendSearchPresenter() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e) this.f127677k.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(143, new org.greenrobot.eventbus.g(a.class, "onSummonFriendClickEvent", com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(83700);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final AbstractC3321a getCallback() {
        return this.n;
    }

    public final int getFrom() {
        return this.f127679m;
    }

    static final class c extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f127704a = new c();

        static {
            Covode.recordClassIndex(83701);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f127727a = new f();

        static {
            Covode.recordClassIndex(83704);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e();
        }
    }

    private final void c() {
        if (!l.a(this.f127668a.getAdapter(), this.f127678l)) {
            this.f127668a.setAdapter(this.f127678l);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f127669b.a().a(new e(this), b.i.f4826c, null);
    }

    public final com.ss.android.ugc.aweme.search.model.g b() {
        return new com.ss.android.ugc.aweme.search.model.g(6, null, this.f127671d.f127707c, "at_user", 20, n.k(getFetchedUidSet()));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void i() {
        if (this.f127671d.getItemCount() == 0) {
            b(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void j() {
        this.f127674g = false;
        if (this.f127671d.getItemCount() == 0) {
            b(2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    public final void setCallback(AbstractC3321a aVar) {
        this.n = aVar;
    }

    public final void setFrom(int i2) {
        this.f127679m = i2;
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127725a;

        static {
            Covode.recordClassIndex(83702);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f127725a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            T t;
            T t2;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (!(!l.a(recyclerView.getAdapter(), this.f127725a.f127671d))) {
                int m2 = this.f127725a.f127672e.m();
                int A = this.f127725a.f127672e.A();
                if (m2 >= this.f127725a.f127673f && A - m2 < 8 && (t = this.f127725a.getMSummonFriendSearchPresenter().f127622b) != null && (t2 = t.f127620e) != null && t2.a()) {
                    a aVar = this.f127725a;
                    if (!aVar.f127674g) {
                        aVar.f127674g = true;
                        aVar.getMSummonFriendSearchPresenter().a(false, aVar.b());
                    }
                }
            }
        }
    }

    public final void setSelectedUser$tools_camera_edit_release(User user) {
        this.f127671d.f127709e = user;
        this.f127670c.f127681a = user;
    }

    public final void a(int i2) {
        if (!l.a(this.f127668a.getAdapter(), this.f127670c)) {
            this.f127668a.setAdapter(this.f127670c);
        }
        b(Integer.valueOf(i2));
    }

    public final void b(Integer num) {
        if (num != null && num.intValue() == 0) {
            setVisibility(0);
            this.f127675h = false;
            c();
            return;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                c();
                setVisibility(4);
                this.f127675h = false;
                return;
            } else if (num.intValue() == 2) {
                c();
                setVisibility(4);
                this.f127675h = false;
                return;
            }
        }
        setVisibility(0);
        this.f127675h = true;
    }

    @r(a = ThreadMode.MAIN)
    public final void onSummonFriendClickEvent(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.a aVar) {
        if (aVar != null) {
            if (l.a(this.f127668a.getAdapter(), this.f127670c)) {
                setSelectedUser$tools_camera_edit_release(aVar.f127730a);
                this.f127670c.notifyDataSetChanged();
            } else if (l.a(this.f127668a.getAdapter(), this.f127671d)) {
                setSelectedUser$tools_camera_edit_release(aVar.f127730a);
                this.f127671d.notifyDataSetChanged();
            }
            AbstractC3321a aVar2 = this.n;
            if (aVar2 != null) {
                aVar2.a(aVar.f127730a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127726a;

        static {
            Covode.recordClassIndex(83703);
        }

        e(a aVar) {
            this.f127726a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            z A = com.ss.android.ugc.aweme.port.in.g.a().A();
            l.b(iVar, "");
            int i2 = 1;
            if (iVar.b() || iVar.c() || !A.b()) {
                this.f127726a.b(1);
            } else {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a aVar = this.f127726a.f127670c;
                b.a.C3327a aVar2 = (b.a.C3327a) iVar.d();
                aVar.f127685e = aVar2;
                if (aVar2 != null) {
                    aVar.f127682b = aVar2.f127742f;
                    aVar.f127683c = aVar2.f127743g;
                }
                this.f127726a.f127670c.notifyDataSetChanged();
                this.f127726a.f127668a.b(0);
                a aVar3 = this.f127726a;
                if (aVar3.f127670c.getItemCount() != 0) {
                    i2 = -1;
                }
                aVar3.a(i2);
            }
            return h.z.f158842a;
        }
    }

    static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f127729b;

        static {
            Covode.recordClassIndex(83705);
        }

        g(a aVar, String str) {
            this.f127728a = aVar;
            this.f127729b = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (iVar.b() || iVar.c()) {
                this.f127728a.b(0);
            } else {
                this.f127728a.f127671d.f127705a = (List) iVar.d();
                List list = (List) iVar.d();
                if (list != null && (!list.isEmpty())) {
                    this.f127728a.a((Integer) -1);
                }
                this.f127728a.f127671d.notifyDataSetChanged();
                this.f127728a.f127668a.b(0);
            }
            this.f127728a.getMSummonFriendSearchPresenter().a(true, this.f127728a.b());
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(6854);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b bVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b();
        bVar.f127732a = true;
        this.f127669b = bVar;
        this.f127676j = h.i.a((h.f.a.a) c.f127704a);
        this.f127677k = h.i.a((h.f.a.a) f.f127727a);
        this.f127678l = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.b();
        this.f127670c = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a();
        c cVar = new c();
        this.f127671d = cVar;
        this.f127673f = 8;
        this.f127675h = true;
        View.inflate(context, R.layout.bj7, this);
        View findViewById = findViewById(R.id.djj);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f127668a = recyclerView;
        cVar.f127708d = new c.a(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f127680a;

            static {
                Covode.recordClassIndex(83698);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c.a
            public final String a() {
                return this.f127680a.getMSummonFriendSearchPresenter().f127761a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f127680a = r1;
            }
        };
        AtFriendHorizontalView$2 atFriendHorizontalView$2 = new AtFriendHorizontalView$2(this, context);
        this.f127672e = atFriendHorizontalView$2;
        recyclerView.setLayoutManager(atFriendHorizontalView$2);
        a(0);
        a();
        recyclerView.a(new d(this));
        MethodCollector.o(6854);
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num) {
        if (!l.a(this.f127668a.getAdapter(), this.f127671d)) {
            this.f127668a.setAdapter(this.f127671d);
        }
        b(num);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.c
    public final void a(com.ss.android.ugc.aweme.search.model.h hVar) {
        ArrayList arrayList;
        String userId;
        l.d(hVar, "");
        this.f127674g = false;
        if (!TextUtils.isEmpty(this.f127671d.f127707c)) {
            c cVar = this.f127671d;
            List<? extends com.ss.android.ugc.aweme.search.model.e> list = hVar.f121536a;
            int i2 = 1;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b bVar = this.f127669b;
                    String userId2 = t.f121524g.getUserId();
                    if (userId2 == null) {
                        userId2 = "";
                    }
                    if (!bVar.a(userId2)) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            cVar.f127706b = arrayList;
            ArrayList arrayList3 = new ArrayList();
            List<? extends com.ss.android.ugc.aweme.search.model.e> list2 = hVar.f121536a;
            if (list2 != null) {
                for (T t2 : list2) {
                    if (t2.f121524g.getMentionBlockType() == 1 && (userId = t2.f121524g.getUserId()) != null) {
                        arrayList3.add(userId);
                    }
                }
            }
            c cVar2 = this.f127671d;
            l.d(arrayList3, "");
            cVar2.f127710f = arrayList3;
            this.f127671d.notifyDataSetChanged();
            if (this.f127671d.getItemCount() != 0) {
                i2 = -1;
            }
            a(Integer.valueOf(i2));
            getFetchedUidSet().addAll(this.f127671d.a());
        }
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
