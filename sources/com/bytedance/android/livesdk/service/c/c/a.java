package com.bytedance.android.livesdk.service.c.c;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDialogUpDownSetting;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import h.a.ac;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0460a f21354a = new C0460a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f21355b;

    /* renamed from: c  reason: collision with root package name */
    private int f21356c;

    /* renamed from: d  reason: collision with root package name */
    private LongSparseArray<Long> f21357d;

    /* renamed from: e  reason: collision with root package name */
    private LongSparseArray<Long> f21358e;

    /* renamed from: f  reason: collision with root package name */
    private LongSparseArray<Integer> f21359f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<b<? extends com.bytedance.android.livesdk.model.b>> f21360g;

    /* renamed from: h  reason: collision with root package name */
    private int f21361h;

    /* renamed from: i  reason: collision with root package name */
    private int f21362i;

    /* renamed from: j  reason: collision with root package name */
    private LinkedList<Long> f21363j;

    /* renamed from: k  reason: collision with root package name */
    private LinkedList<Long> f21364k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f21365l;

    static {
        Covode.recordClassIndex(12584);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a  reason: collision with other inner class name */
    public static final class C0460a {

        /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a$a  reason: collision with other inner class name */
        public static final class C0461a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f21366a = new a((byte) 0);

            /* renamed from: b  reason: collision with root package name */
            public static final C0462a f21367b = new C0462a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a$a$a  reason: collision with other inner class name */
            public static final class C0462a {
                static {
                    Covode.recordClassIndex(12587);
                }

                private C0462a() {
                }

                public /* synthetic */ C0462a(byte b2) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12586);
            }
        }

        static {
            Covode.recordClassIndex(12585);
        }

        private C0460a() {
        }

        public /* synthetic */ C0460a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f21355b = -1;
        this.f21356c = -1;
        this.f21365l = true;
    }

    private final int f() {
        Iterator<Long> it = this.f21363j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f21364k.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    private a() {
        this.f21355b = -1;
        this.f21356c = -1;
        this.f21357d = new LongSparseArray<>();
        this.f21358e = new LongSparseArray<>();
        this.f21359f = new LongSparseArray<>();
        this.f21360g = new LinkedList<>();
        this.f21363j = new LinkedList<>();
        this.f21364k = new LinkedList<>();
        this.f21365l = true;
    }

    private final int b() {
        Iterator<Long> it = this.f21363j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Long> longSparseArray = this.f21357d;
            l.b(next, "");
            if (longSparseArray.get(next.longValue()) != null || this.f21364k.contains(next)) {
                i2++;
            }
        }
        return i2;
    }

    private final void d() {
        Iterator<Long> it = this.f21363j.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f21359f;
            l.b(next, "");
            longSparseArray.put(next.longValue(), 1);
        }
    }

    private final int g() {
        Iterator<Long> it = this.f21363j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f21359f;
            l.b(next, "");
            Integer num = longSparseArray.get(next.longValue());
            if (num != null && num.intValue() == 0) {
                i2++;
            }
        }
        return i2;
    }

    private final long e() {
        int g2 = g();
        Iterator<Long> it = this.f21363j.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f21359f;
            l.b(next, "");
            Integer num = longSparseArray.get(next.longValue());
            if (num != null && num.intValue() == 0) {
                long longValue = this.f21357d.get(next.longValue()).longValue();
                Long l2 = this.f21358e.get(next.longValue());
                l.b(l2, "");
                j2 += longValue - l2.longValue();
            }
        }
        if (g2 != 0) {
            return j2 / ((long) g2);
        }
        return 0;
    }

    private final long h() {
        Iterator<Long> it = this.f21363j.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Long> longSparseArray = this.f21357d;
            l.b(next, "");
            long longValue = longSparseArray.get(next.longValue()).longValue();
            Long l2 = this.f21358e.get(next.longValue());
            l.b(l2, "");
            long longValue2 = longValue - l2.longValue();
            if (longValue2 > j2) {
                j2 = longValue2;
            }
        }
        return j2;
    }

    private final void c() {
        int i2;
        int i3;
        String str;
        if (g() != 0) {
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_panel_gift_icon_load");
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                i2 = a.C0355a.C0356a.f17017a.f17014j;
            } else {
                i2 = this.f21355b;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("tab_id", i2).a("gift_icon_load_duration_ms", h());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                i3 = GiftManager.inst().getTabLocation(a.C0355a.C0356a.f17017a.f17014j);
            } else {
                i3 = this.f21356c + 1;
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("page_position", i3).a("gift_cnt", this.f21362i).a("no_cache_gift_cnt", g()).a("no_cache_gift_fail_cnt", f()).a("no_cache_gift_load_duration_ms_avg", e());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                str = "1";
            } else {
                str = "null";
            }
            a4.a("is_swipe", str).a().b();
            d();
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(long j2) {
        this.f21358e.put(j2, Long.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
    }

    public final void c(long j2) {
        this.f21357d.put(j2, Long.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        if (this.f21363j.contains(Long.valueOf(j2))) {
            this.f21361h++;
        }
        this.f21364k.add(Long.valueOf(j2));
        if (this.f21361h == this.f21362i && this.f21365l) {
            this.f21365l = false;
            c();
        }
    }

    public final void b(long j2) {
        this.f21357d.put(j2, Long.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        if (this.f21363j.contains(Long.valueOf(j2))) {
            this.f21361h++;
        }
        if (this.f21361h == this.f21362i && this.f21365l) {
            this.f21365l = false;
            c();
        }
    }

    public final void a(int i2) {
        int i3;
        long j2;
        if (this.f21356c != i2) {
            this.f21356c = i2;
            int size = ((this.f21360g.size() - 1) / 8) * 8;
            if (i2 == (((this.f21360g.size() - 1) / 8) + 1) - 1) {
                i3 = this.f21360g.size() - size;
            } else {
                i3 = 8;
            }
            this.f21362i = i3;
            this.f21363j.clear();
            for (ac acVar : n.n(this.f21360g)) {
                if (acVar.f158622a >= i2 * 8 && acVar.f158622a < Math.min((i2 + 1) * 8, this.f21360g.size())) {
                    LinkedList<Long> linkedList = this.f21363j;
                    T t = acVar.f158623b;
                    if (t != null) {
                        j2 = t.d();
                    } else {
                        j2 = 0;
                    }
                    linkedList.add(Long.valueOf(j2));
                }
            }
            int b2 = b();
            this.f21361h = b2;
            this.f21365l = true;
            if (b2 == this.f21362i) {
                this.f21365l = false;
                try {
                    c();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(List<Long> list) {
        Long l2;
        long j2;
        l.d(list, "");
        this.f21362i = list.size();
        this.f21363j.clear();
        for (ac acVar : n.n(this.f21360g)) {
            T t = acVar.f158623b;
            if (t != null) {
                l2 = Long.valueOf(t.d());
            } else {
                l2 = null;
            }
            if (n.a((Iterable) list, (Object) l2)) {
                LinkedList<Long> linkedList = this.f21363j;
                T t2 = acVar.f158623b;
                if (t2 != null) {
                    j2 = t2.d();
                } else {
                    j2 = 0;
                }
                linkedList.add(Long.valueOf(j2));
            }
        }
        int b2 = b();
        this.f21361h = b2;
        this.f21365l = true;
        if (b2 == this.f21362i) {
            this.f21365l = false;
            try {
                c();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i2, LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList) {
        l.d(linkedList, "");
        if (this.f21355b != i2) {
            this.f21356c = -1;
            this.f21365l = true;
            this.f21355b = i2;
            this.f21358e.clear();
            this.f21359f.clear();
            this.f21357d.clear();
            this.f21360g.clear();
            this.f21360g.addAll(linkedList);
        }
    }

    public final void a(long j2, boolean z) {
        this.f21359f.put(j2, Integer.valueOf(z ? 1 : 0));
    }
}
