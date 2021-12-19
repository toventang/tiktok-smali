package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.k;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class ChatRoomLiveStateManager implements au, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f101282b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.h f101283a = h.i.a((h.f.a.a) d.f101303a);

    /* renamed from: c  reason: collision with root package name */
    private int f101284c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f101285d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f101286e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f101287f = h.i.a((h.f.a.a) g.f101306a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f101288g = h.i.a((h.f.a.a) e.f101304a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f101289h = h.i.a((h.f.a.a) i.f101308a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f101290i = h.i.a((h.f.a.a) h.f101307a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f101291j = h.i.a((h.f.a.a) f.f101305a);

    /* renamed from: k  reason: collision with root package name */
    private final RecyclerView f101292k;

    static {
        Covode.recordClassIndex(64784);
    }

    private final Queue<Integer> f() {
        return (Queue) this.f101287f.getValue();
    }

    private final f.a.b.a g() {
        return (f.a.b.a) this.f101288g.getValue();
    }

    public final HashMap<String, NewLiveRoomStruct> a() {
        return (HashMap) this.f101289h.getValue();
    }

    public final HashMap<String, Boolean> b() {
        return (HashMap) this.f101290i.getValue();
    }

    public final List<p> c() {
        return (List) this.f101291j.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(300, new org.greenrobot.eventbus.g(ChatRoomLiveStateManager.class, "onLiveStatusEvent", com.ss.android.ugc.aweme.im.sdk.chat.data.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64787);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Set<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f101303a = new d();

        static {
            Covode.recordClassIndex(64790);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<Long> invoke() {
            return new LinkedHashSet();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f101304a = new e();

        static {
            Covode.recordClassIndex(64791);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<List<p>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f101305a = new f();

        static {
            Covode.recordClassIndex(64792);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<p> invoke() {
            return new ArrayList();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<ArrayDeque<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f101306a = new g();

        static {
            Covode.recordClassIndex(64793);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayDeque<Integer> invoke() {
            return new ArrayDeque();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<HashMap<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f101307a = new h();

        static {
            Covode.recordClassIndex(64794);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<HashMap<String, NewLiveRoomStruct>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f101308a = new i();

        static {
            Covode.recordClassIndex(64795);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, NewLiveRoomStruct> invoke() {
            return new HashMap();
        }
    }

    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatRoomLiveStateManager f101309a;

        static {
            Covode.recordClassIndex(64796);
        }

        public j(ChatRoomLiveStateManager chatRoomLiveStateManager) {
            this.f101309a = chatRoomLiveStateManager;
        }

        public final void run() {
            this.f101309a.d();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
        f().clear();
        c().clear();
        a().clear();
        g().a();
    }

    public final void d() {
        RecyclerView.i layoutManager;
        if ((ActivityStack.getTopActivity() instanceof ChatRoomActivity) && (layoutManager = this.f101292k.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            if (k2 >= 0) {
                if (k2 != this.f101284c || m2 != this.f101285d) {
                    this.f101284c = k2;
                    this.f101285d = m2;
                    f().clear();
                    if (k2 <= m2) {
                        while (true) {
                            f().add(Integer.valueOf(k2));
                            if (k2 == m2) {
                                break;
                            }
                            k2++;
                        }
                    }
                    if (!this.f101286e) {
                        this.f101286e = true;
                        e();
                    }
                }
            }
        }
    }

    public final void e() {
        com.ss.android.ugc.aweme.live.c d2;
        while (!f().isEmpty()) {
            Integer poll = f().poll();
            RecyclerView recyclerView = this.f101292k;
            l.b(poll, "");
            RecyclerView.ViewHolder f2 = recyclerView.f(poll.intValue());
            if (f2 instanceof p) {
                p pVar = (p) f2;
                String b2 = pVar.b();
                String c2 = pVar.c();
                if (b2 != null && b2.length() > 0 && !a().containsKey(b2) && (!l.a((Object) b().get(b2), (Object) true))) {
                    z.d dVar = new z.d();
                    dVar.element = 0;
                    try {
                        dVar.element = Long.parseLong(b2);
                    } catch (Exception unused) {
                    }
                    ILiveOuterService s = LiveOuterService.s();
                    if (s != null && (d2 = s.d()) != null) {
                        b().put(b2, true);
                        g().a(d2.a(dVar.element, c2).a(new b(this, b2, dVar, c2), new c(this, b2, dVar, c2)));
                        return;
                    }
                    return;
                }
            }
        }
        this.f101286e = false;
    }

    @r(a = ThreadMode.MAIN)
    public final void onLiveStatusEvent(com.ss.android.ugc.aweme.im.sdk.chat.data.b.a aVar) {
        l.d(aVar, "");
        a().put(aVar.f100240a, aVar.f100241b);
        a(aVar.f100240a);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatRoomLiveStateManager f101295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f101296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.d f101297c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f101298d;

        static {
            Covode.recordClassIndex(64788);
        }

        b(ChatRoomLiveStateManager chatRoomLiveStateManager, String str, z.d dVar, String str2) {
            this.f101295a = chatRoomLiveStateManager;
            this.f101296b = str;
            this.f101297c = dVar;
            this.f101298d = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f101295a.a().put(this.f101296b, obj);
            this.f101295a.b().put(this.f101296b, false);
            this.f101295a.a(this.f101296b);
            this.f101295a.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatRoomLiveStateManager f101299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f101300b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.d f101301c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f101302d;

        static {
            Covode.recordClassIndex(64789);
        }

        c(ChatRoomLiveStateManager chatRoomLiveStateManager, String str, z.d dVar, String str2) {
            this.f101299a = chatRoomLiveStateManager;
            this.f101300b = str;
            this.f101301c = dVar;
            this.f101302d = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof com.ss.android.ugc.aweme.base.api.a.a) {
                this.f101299a.a().put(this.f101300b, null);
            }
            this.f101299a.b().put(this.f101300b, false);
            this.f101299a.a(this.f101300b);
            this.f101299a.e();
        }
    }

    public final void a(String str) {
        for (T t : c()) {
            if (TextUtils.equals(str, t.b())) {
                t.d();
            }
        }
    }

    public ChatRoomLiveStateManager(RecyclerView recyclerView, m mVar) {
        l.d(recyclerView, "");
        l.d(mVar, "");
        this.f101292k = recyclerView;
        EventBus.a(EventBus.a(), this);
        mVar.getLifecycle().a(this);
        recyclerView.a(new RecyclerView.n(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatRoomLiveStateManager f101293a;

            static {
                Covode.recordClassIndex(64785);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f101293a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                l.d(recyclerView, "");
                super.a(recyclerView, i2);
                if (i2 == 0) {
                    this.f101293a.d();
                }
            }
        });
        k.a(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatRoomLiveStateManager f101294a;

            static {
                Covode.recordClassIndex(64786);
            }

            {
                this.f101294a = r1;
            }

            public final void run() {
                this.f101294a.d();
            }
        }, 800);
    }
}
