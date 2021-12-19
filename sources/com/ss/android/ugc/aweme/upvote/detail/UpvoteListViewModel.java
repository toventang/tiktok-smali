package com.ss.android.ugc.aweme.upvote.detail;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.c.e;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class UpvoteListViewModel implements au, c {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f142045e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f142046f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<h> f142047a;

    /* renamed from: b  reason: collision with root package name */
    public String f142048b;

    /* renamed from: c  reason: collision with root package name */
    public final String f142049c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.upvote.event.b f142050d;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f142051g;

    static {
        Covode.recordClassIndex(92832);
    }

    public final t<e> a() {
        return (t) this.f142051g.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92833);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static UpvoteListViewModel a(m mVar) {
            l.d(mVar, "");
            return new UpvoteListViewModel(mVar, (byte) 0);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<t<e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142052a = new b();

        static {
            Covode.recordClassIndex(92834);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<e> invoke() {
            return new t();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        String str = this.f142048b;
        if (str != null) {
            d.a(str, this);
        }
        l.d(this, "");
        d.b().get(this.f142049c);
    }

    public final boolean c() {
        List<h> upvotes;
        e value = a().getValue();
        if (value == null || value.getTotal() <= 0 || (upvotes = value.getUpvotes()) == null || upvotes.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        List<h> list;
        String str;
        T next;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        String uid = curUser.getUid();
        e value = a().getValue();
        if (value == null || (list = value.getUpvotes()) == null) {
            list = z.INSTANCE;
        }
        Iterator<T> it = list.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
            User user = next.getUser();
            if (user != null) {
                str = user.getUid();
            }
        } while (!l.a((Object) str, (Object) uid));
        if (next != null) {
            return true;
        }
        return false;
    }

    private UpvoteListViewModel(m mVar) {
        this.f142051g = h.i.a((h.f.a.a) b.f142052a);
        this.f142047a = z.INSTANCE;
        String valueOf = String.valueOf(hashCode());
        this.f142049c = valueOf;
        mVar.getLifecycle().a(this);
        l.d(this, "");
        d.b().put(valueOf, this);
    }

    public final void a(e eVar) {
        b(eVar);
        a().setValue(eVar);
    }

    private final void b(e eVar) {
        List<h> list;
        String text;
        if (eVar == null || (list = eVar.getUpvotes()) == null) {
            list = z.INSTANCE;
        }
        Iterator<h> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h next = it.next();
            if (!in.g(next.getUser()) || (text = next.getText()) == null || text.length() == 0 || next.getBubbleHidden()) {
                i2++;
            } else if (i2 > 0) {
                list = n.g((Collection) list);
                h hVar = list.get(i2);
                list.remove(i2);
                list.add(0, hVar);
            }
        }
        this.f142047a = list;
    }

    public /* synthetic */ UpvoteListViewModel(m mVar, byte b2) {
        this(mVar);
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.c
    public final void a(String str, e eVar) {
        l.d(str, "");
        if (!l.a((Object) this.f142048b, (Object) str)) {
            d.a(str, this);
        } else {
            a(eVar);
        }
    }

    public final void a(a aVar, String str, long j2) {
        String str2;
        l.d(str, "");
        if ((!f142045e || aVar != null) && (str2 = this.f142048b) != null) {
            d.a(str2, b.a(str2), j2, str, aVar);
        }
    }

    public static /* synthetic */ void a(UpvoteListViewModel upvoteListViewModel, a aVar, String str, long j2, int i2) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        upvoteListViewModel.a(aVar, str, j2);
    }
}
