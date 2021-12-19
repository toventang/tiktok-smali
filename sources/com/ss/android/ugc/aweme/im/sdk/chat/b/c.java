package com.ss.android.ugc.aweme.im.sdk.chat.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.service.b;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class c implements d, com.ss.android.ugc.aweme.im.service.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100146a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f100147b = i.a((h.f.a.a) b.f100167a);

    /* renamed from: c  reason: collision with root package name */
    private final List<ai> f100148c;

    /* renamed from: d  reason: collision with root package name */
    private final h f100149d = i.a((h.f.a.a) C2463c.f100191a);

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.ies.im.core.api.b.d f100150e;

    /* renamed from: f  reason: collision with root package name */
    private int f100151f;

    /* renamed from: g  reason: collision with root package name */
    private final long f100152g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f100153h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f100154i;

    /* renamed from: j  reason: collision with root package name */
    private b.a f100155j;

    /* renamed from: k  reason: collision with root package name */
    private final String f100156k;

    /* renamed from: l  reason: collision with root package name */
    private final ai f100157l;

    static {
        Covode.recordClassIndex(63831);
    }

    private final HashSet<String> d() {
        return (HashSet) this.f100147b.getValue();
    }

    private final List<ai> e() {
        return (List) this.f100149d.getValue();
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar, ay ayVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map map, Map map2) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63832);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void a(b.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "register: startIndex: " + this.f100152g);
        String str = this.f100156k;
        l.d(str, "");
        com.bytedance.ies.im.core.api.b.d a2 = com.bytedance.ies.im.core.api.c.f33958a.a(str, new int[]{8});
        a2.a(this);
        a2.c().addAll(this.f100148c);
        this.f100150e = a2;
        List<ai> list = this.f100148c;
        e().clear();
        if (list != null && !list.isEmpty()) {
            e().addAll(n.h((Iterable) list));
        }
        this.f100153h = true;
        this.f100154i = true;
        this.f100155j = aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void a(String str) {
        l.d(str, "");
        d().add(str);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, ar arVar) {
        l.d(arVar, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "onGetMessage: " + (list != null ? Integer.valueOf(list.size()) : null) + ' ' + i2 + "  " + arVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, String str) {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "onQueryMessage: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "onLoadOlder: " + (list != null ? Integer.valueOf(list.size()) : null) + ", " + e().size() + ", " + z);
        if (z) {
            this.f100154i = list != null && !list.isEmpty() && list.size() >= 7;
            List<ai> h2 = n.h((Iterable) a(list));
            if (h2 != null && !h2.isEmpty()) {
                e().addAll(0, h2);
            }
            b.a aVar = this.f100155j;
            if (aVar != null) {
                aVar.b(c(h2, this.f100154i));
            }
            this.f100151f = 0;
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, Map<String, String>> map) {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "onUpdateMessage: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    static final class b extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100167a = new b();

        static {
            Covode.recordClassIndex(63833);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c$c  reason: collision with other inner class name */
    static final class C2463c extends m implements h.f.a.a<List<ai>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2463c f100191a = new C2463c();

        static {
            Covode.recordClassIndex(63834);
        }

        C2463c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<ai> invoke() {
            return new ArrayList();
        }
    }

    private final boolean f() {
        if (this.f100151f != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void a() {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "unregister");
        com.bytedance.ies.im.core.api.b.d dVar = this.f100150e;
        if (dVar != null) {
            dVar.a();
        }
        e().clear();
        this.f100151f = 0;
        this.f100155j = null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void b() {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "refresh");
        if (!f()) {
            boolean z = true;
            List<ai> a2 = a(this.f100152g, 1);
            boolean z2 = false;
            if ((!a2.isEmpty()) && (!e().isEmpty())) {
                if (e().indexOf(n.i((List) a2)) >= e().size() - 1) {
                    z = false;
                }
                z2 = z;
            }
            b.a aVar = this.f100155j;
            if (aVar != null) {
                aVar.a(c(a2, z2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final b.c c() {
        b.C2642b bVar;
        ArrayList<ai> arrayList = new ArrayList();
        arrayList.add(this.f100157l);
        ArrayList arrayList2 = new ArrayList();
        for (ai aiVar : arrayList) {
            BaseContent b2 = b.f.b(aiVar);
            BaseContent baseContent = null;
            if (b2 instanceof ShareAwemeContent) {
                baseContent = b2;
            }
            if (baseContent != null) {
                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b2;
                if (!d().contains(shareAwemeContent.getItemId())) {
                    String itemId = shareAwemeContent.getItemId();
                    l.b(itemId, "");
                    bVar = new b.C2642b(itemId, aiVar.getIndex());
                }
            } else if ((b2 instanceof CommentContent) && b2 != null) {
                CommentContent commentContent = (CommentContent) b2;
                if (!d().contains(commentContent.getAwemeId())) {
                    String awemeId = commentContent.getAwemeId();
                    l.b(awemeId, "");
                    bVar = new b.C2642b(awemeId, aiVar.getIndex());
                }
            }
            arrayList2.add(bVar);
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = true;
        boolean z2 = false;
        if ((!arrayList.isEmpty()) && (!e().isEmpty())) {
            if (e().indexOf(n.i((List) arrayList)) >= e().size() - 1) {
                z = false;
            }
            z2 = z;
        }
        return new b.c(arrayList3, z2);
    }

    private final int c(long j2) {
        int i2 = 0;
        for (T t : e()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (t.getIndex() == j2) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    private static List<ai> a(List<ai> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if ((t2.getMsgType() == 8 || t2.getMsgType() == 40) && !t2.isRecalled() && !t2.isDeleted()) {
                arrayList.add(t);
            }
        }
        return n.g((Collection) arrayList);
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void b(long j2) {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "loadOlder: " + j2 + ", " + this.f100154i);
        if (!f()) {
            List<ai> a2 = a(j2, 2);
            if (!a2.isEmpty()) {
                b.a aVar = this.f100155j;
                if (aVar != null) {
                    aVar.b(c(a2, true));
                }
            } else if (this.f100154i) {
                this.f100151f = 2;
                com.bytedance.ies.im.core.api.b.d dVar = this.f100150e;
                if (dVar != null) {
                    dVar.b();
                }
            } else {
                b.a aVar2 = this.f100155j;
                if (aVar2 != null) {
                    aVar2.b(c(null, false));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.b
    public final void a(long j2) {
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", "loadNewer: " + j2 + ", " + this.f100153h);
        if (!f()) {
            List<ai> a2 = a(j2, 3);
            boolean z = true;
            boolean z2 = false;
            if ((!a2.isEmpty()) && (!e().isEmpty())) {
                if (e().indexOf(n.i((List) a2)) >= e().size() - 1) {
                    z = false;
                }
                z2 = z;
            }
            b.a aVar = this.f100155j;
            if (aVar != null) {
                aVar.c(c(a2, z2));
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
        Integer num;
        StringBuilder sb = new StringBuilder("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", sb.append(num).toString());
    }

    private final List<ai> a(long j2, int i2) {
        int i3;
        if (e().size() <= 0) {
            return new ArrayList();
        }
        int c2 = c(j2);
        if (c2 < 0) {
            return new ArrayList();
        }
        int size = e().size();
        if (i2 == 1) {
            int max = Math.max(0, c2 - 3);
            c2 = Math.min(max + 7, size);
            i3 = Math.min(max, Math.max(0, c2 - 7));
            return e().subList(i3, c2);
        } else if (i2 != 2) {
            if (i2 == 3 && c2 != size - 1) {
                i3 = c2 + 1;
                c2 = Math.min(i3 + 7, size);
                if (i3 >= 0 && c2 >= 0) {
                    return e().subList(i3, c2);
                }
            }
        } else if (c2 != 0) {
            i3 = Math.max(0, c2 - 7);
            return e().subList(i3, c2);
        }
        return new ArrayList();
    }

    private final b.c c(List<ai> list, boolean z) {
        b.C2642b bVar;
        CommentContent commentContent;
        String awemeId;
        com.ss.android.ugc.aweme.im.service.m.a.b("IMAwemeIdProvider", new StringBuilder("packResponse: ").append(list != null ? Integer.valueOf(list.size()) : null).toString());
        if (list == null || list.isEmpty()) {
            return new b.c(z.INSTANCE, z);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            BaseContent b2 = b.f.b(t);
            if ((!(b2 instanceof ShareAwemeContent) ? null : b2) != null) {
                ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b2;
                String itemId = shareAwemeContent.getItemId();
                if (!(itemId == null || itemId.length() == 0 || d().contains(shareAwemeContent.getItemId()))) {
                    String itemId2 = shareAwemeContent.getItemId();
                    l.b(itemId2, "");
                    bVar = new b.C2642b(itemId2, t.getIndex());
                }
            } else if (!(!(b2 instanceof CommentContent) || b2 == null || (awemeId = (commentContent = (CommentContent) b2).getAwemeId()) == null || awemeId.length() == 0 || d().contains(commentContent.getAwemeId()))) {
                String awemeId2 = commentContent.getAwemeId();
                l.b(awemeId2, "");
                bVar = new b.C2642b(awemeId2, t.getIndex());
            }
            arrayList.add(bVar);
        }
        return new b.c(arrayList, z);
    }

    public c(String str, ai aiVar, List<ai> list) {
        l.d(str, "");
        l.d(aiVar, "");
        l.d(list, "");
        this.f100156k = str;
        this.f100157l = aiVar;
        this.f100152g = aiVar.getIndex();
        this.f100153h = true;
        this.f100154i = true;
        this.f100148c = a(list);
    }
}
