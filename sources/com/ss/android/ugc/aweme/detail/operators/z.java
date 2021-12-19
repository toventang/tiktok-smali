package com.ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.l;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.im.service.b;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class z implements l, aa, aa.a, aa.b, b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79840a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f79841b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f79842c = i.a((h.f.a.a) c.f79853a);

    /* renamed from: d  reason: collision with root package name */
    private final h f79843d = i.a((h.f.a.a) d.f79854a);

    /* renamed from: e  reason: collision with root package name */
    private int f79844e = 1;

    /* renamed from: f  reason: collision with root package name */
    private b.c f79845f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f79846g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f79847h;

    /* renamed from: i  reason: collision with root package name */
    private ad f79848i;

    /* renamed from: j  reason: collision with root package name */
    private long f79849j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f79850k = true;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.b f79851l;

    /* renamed from: m  reason: collision with root package name */
    private final Aweme f79852m;
    private final boolean n;

    static {
        Covode.recordClassIndex(49675);
    }

    private final com.ss.android.ugc.aweme.detail.i.a a() {
        return (com.ss.android.ugc.aweme.detail.i.a) this.f79841b.getValue();
    }

    private final com.ss.android.ugc.aweme.detail.i.b b() {
        return (com.ss.android.ugc.aweme.detail.i.b) this.f79842c.getValue();
    }

    private final List<Aweme> c() {
        return (List) this.f79843d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void bindPreLoadView(x xVar) {
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 7000;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49676);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.detail.i.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f79853a = new c();

        static {
            Covode.recordClassIndex(49678);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.detail.i.b invoke() {
            return new com.ss.android.ugc.aweme.detail.i.b();
        }
    }

    static final class d extends m implements h.f.a.a<List<Aweme>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f79854a = new d();

        static {
            Covode.recordClassIndex(49679);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<Aweme> invoke() {
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return a();
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.detail.i.a> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(49677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.detail.i.a invoke() {
            return new com.ss.android.ugc.aweme.detail.i.a(this.this$0.getPageType(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        c().isEmpty();
        return c().isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        if (!this.f79846g) {
            b().j();
        }
        if (this.f79846g || b().j()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
        this.f79848i = null;
        c().clear();
        b().cd_();
        b().h();
        this.f79851l.a();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void setPreLoad(boolean z) {
        this.f79847h = z;
    }

    private final void d(b.c cVar) {
        this.f79845f = cVar;
        this.f79846g = false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        h.f.b.l.d(fragment, "");
        if (this.n && this.f79852m != null) {
            this.f79850k = true;
        }
        return true;
    }

    private final long a(boolean z) {
        Object i2;
        if (c().isEmpty()) {
            return -1;
        }
        if (z) {
            i2 = n.g((List) c());
        } else {
            i2 = n.i((List) c());
        }
        try {
            String aid = ((Aweme) i2).getAid();
            h.f.b.l.b(aid, "");
            return Long.parseLong(aid);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static String d(List<b.C2642b> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f103825a).append(",");
        }
        p.a((CharSequence) sb, (CharSequence) ",");
        sb.append("]");
        String sb2 = sb.toString();
        h.f.b.l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        h.f.b.l.d(adVar, "");
        this.f79848i = adVar;
        b().a_(this);
        b().a(a());
        this.f79851l.a(this);
    }

    private final void c(List<Aweme> list) {
        List<b.C2642b> list2;
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            b.c cVar = this.f79845f;
            if (!(cVar == null || (list2 = cVar.f103827a) == null || size != list2.size())) {
                b.c cVar2 = this.f79845f;
                if (cVar2 == null) {
                    h.f.b.l.b();
                }
                List<b.C2642b> list3 = cVar2.f103827a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                list.clear();
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    Aweme aweme = (Aweme) obj;
                    Aweme aweme2 = new Aweme();
                    b.C2642b bVar = list3.get(i2);
                    h.f.b.l.a((Object) aweme.getAid(), (Object) bVar.f103825a);
                    aweme2.setAid(String.valueOf(bVar.f103826b));
                    aweme2.setAwemeType(13);
                    aweme2.setForwardItem(aweme);
                    list.add(aweme2);
                    i2 = i3;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.b.a
    public final void a(b.c cVar) {
        h.f.b.l.d(cVar, "");
        d(cVar);
        if (cVar.f103827a.isEmpty()) {
            c().clear();
            ad adVar = this.f79848i;
            if (adVar != null) {
                adVar.a(c(), cVar.f103828b);
                return;
            }
            return;
        }
        b().a(d(cVar.f103827a), "", "");
    }

    @Override // com.ss.android.ugc.aweme.im.service.b.a
    public final void b(b.c cVar) {
        h.f.b.l.d(cVar, "");
        d(cVar);
        if (cVar.f103827a.isEmpty()) {
            ad adVar = this.f79848i;
            if (adVar != null) {
                adVar.c(this.f79847h);
            }
            this.f79847h = false;
            ad adVar2 = this.f79848i;
            if (adVar2 != null) {
                adVar2.c(c(), cVar.f103828b);
                return;
            }
            return;
        }
        b().a(d(cVar.f103827a), "", "");
    }

    @Override // com.ss.android.ugc.aweme.detail.i.l
    public final void c_(Exception exc) {
        if (!(exc instanceof com.ss.android.ugc.aweme.base.api.a.a) || ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() != 2053) {
            boolean z = this.f79847h;
            this.f79845f = null;
            ad adVar = this.f79848i;
            if (adVar != null) {
                adVar.c(z);
            }
            this.f79847h = false;
            if (!z) {
                int i2 = this.f79844e;
                if (i2 == 1) {
                    ad adVar2 = this.f79848i;
                    if (adVar2 != null) {
                        adVar2.b(exc);
                    }
                } else if (i2 != 2) {
                    ad adVar3 = this.f79848i;
                    if (adVar3 != null) {
                        adVar3.c(exc);
                    }
                } else {
                    ad adVar4 = this.f79848i;
                    if (adVar4 != null) {
                        adVar4.a(exc);
                    }
                }
            }
        } else {
            a((List<Aweme>) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        h.f.b.l.d(str, "");
        this.f79851l.a(str);
        int size = c().size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Aweme forwardItem = c().get(i2).getForwardItem();
            h.f.b.l.b(forwardItem, "");
            if (!TextUtils.equals(forwardItem.getAid(), str)) {
                i2++;
            } else if (i2 >= 0) {
                c().remove(i2);
                this.f79849j = System.currentTimeMillis();
                ad adVar = this.f79848i;
                if (adVar == null) {
                    return true;
                }
                adVar.b(i2);
                return true;
            }
        }
        return false;
    }

    private final void b(List<Aweme> list) {
        if (this.f79845f != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            List g2 = n.g((Collection) arrayList);
            ArrayList arrayList2 = new ArrayList();
            b.c cVar = this.f79845f;
            if (cVar == null) {
                h.f.b.l.b();
            }
            arrayList2.addAll(cVar.f103827a);
            int i2 = 0;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                b.C2642b bVar = (b.C2642b) obj;
                int size = g2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        Aweme aweme = new Aweme();
                        AwemeStatus awemeStatus = new AwemeStatus();
                        aweme.setCanPlay(false);
                        awemeStatus.setDelete(true);
                        aweme.setStatus(awemeStatus);
                        User user = new User();
                        user.setAdFake(false);
                        aweme.setAuthor(user);
                        aweme.setAid(bVar.f103825a);
                        list.add(i2, aweme);
                        g2.add(i2, bVar.f103825a);
                        break;
                    }
                    if (TextUtils.equals((CharSequence) g2.get(i4), bVar.f103825a) && i2 == i4) {
                        break;
                    }
                    i4++;
                }
                i2 = i3;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.i.l
    public final void a(List<Aweme> list) {
        boolean z;
        if (list != null) {
            Integer.valueOf(list.size());
        }
        b.c cVar = this.f79845f;
        if (cVar != null) {
            z = cVar.f103828b;
        } else {
            z = false;
        }
        ad adVar = this.f79848i;
        if (adVar != null) {
            adVar.c(this.f79847h);
        }
        this.f79847h = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        b(list);
        c(list);
        this.f79845f = null;
        int i2 = this.f79844e;
        if (i2 == 1) {
            c().clear();
            c().addAll(list);
            ad adVar2 = this.f79848i;
            if (adVar2 != null) {
                adVar2.a(c(), z);
            }
        } else if (i2 != 2) {
            c().addAll(list);
            ad adVar3 = this.f79848i;
            if (adVar3 != null) {
                adVar3.b(c(), z);
            }
        } else {
            c().addAll(0, list);
            ad adVar4 = this.f79848i;
            if (adVar4 != null) {
                adVar4.c(c(), !list.isEmpty());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.b.a
    public final void c(b.c cVar) {
        h.f.b.l.d(cVar, "");
        d(cVar);
        if (cVar.f103827a.isEmpty()) {
            ad adVar = this.f79848i;
            if (adVar != null) {
                adVar.c(this.f79847h);
            }
            this.f79847h = false;
            ad adVar2 = this.f79848i;
            if (adVar2 != null) {
                adVar2.b(c(), cVar.f103828b);
                return;
            }
            return;
        }
        b().a(d(cVar.f103827a), "", "");
    }

    public z(com.ss.android.ugc.aweme.im.service.b bVar, Aweme aweme, boolean z) {
        h.f.b.l.d(bVar, "");
        this.f79851l = bVar;
        this.f79852m = aweme;
        this.n = z;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        h.f.b.l.d(bVar, "");
        if (!isLoading() && System.currentTimeMillis() - this.f79849j >= 500) {
            ad adVar = this.f79848i;
            if (adVar != null) {
                adVar.c(this.f79847h);
            }
            this.f79844e = i2;
            this.f79846g = true;
            if (this.n && this.f79850k && this.f79852m != null) {
                this.f79850k = false;
                d(this.f79851l.c());
                ArrayList arrayList = new ArrayList();
                Aweme aweme = this.f79852m;
                if (aweme == null) {
                    h.f.b.l.b();
                }
                arrayList.add(aweme);
                a(arrayList);
            } else if (i2 == 1) {
                this.f79851l.b();
            } else if (i2 != 2) {
                this.f79851l.a(a(false));
            } else {
                this.f79851l.b(a(true));
            }
        }
    }
}
