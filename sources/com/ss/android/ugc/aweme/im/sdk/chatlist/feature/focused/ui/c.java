package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d;
import com.ss.android.ugc.aweme.inbox.t;
import h.a.n;
import h.b.f;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f101936b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f101937a;

    /* renamed from: c  reason: collision with root package name */
    private final h f101938c;

    /* renamed from: d  reason: collision with root package name */
    private final int f101939d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.ies.im.core.api.b.a f101940e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<Long> f101941f;

    /* renamed from: g  reason: collision with root package name */
    private final q<String, String, String, z> f101942g;

    static {
        Covode.recordClassIndex(65229);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65232);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Long> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(65233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(TimeUnit.DAYS.toMillis((long) this.this$0.f101937a));
        }
    }

    public /* synthetic */ c() {
        this(t.a().f104290e, t.a().f104291f, a.C0745a.a(), AnonymousClass1.f101943a, new q<String, String, String, z>(d.f102404a) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65231);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(String str, String str2, String str3) {
                com.bytedance.im.core.d.h a2;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                l.d(str5, "");
                l.d(str6, "");
                l.d(str5, "");
                l.d(str6, "");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6) && (a2 = a.C0745a.a().a(str4)) != null) {
                    Map<String, String> localExt = a2.getLocalExt();
                    if (localExt == null) {
                        localExt = new HashMap<>();
                    }
                    localExt.put(str5, str6);
                    a2.setLocalExt(localExt);
                    if (str4 == null) {
                        l.b();
                    }
                    b.a.a(str4).a(localExt);
                }
                return z.f158842a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.k.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.b
    public final List<com.ss.android.ugc.aweme.im.service.k.a> a(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
        String str;
        l.d(list, "");
        if (list.size() <= this.f101939d) {
            return list;
        }
        long longValue = this.f101941f.invoke().longValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.bytedance.im.core.d.h a2 = this.f101940e.a(((com.ss.android.ugc.aweme.im.service.k.a) obj).bF_());
            if (!(a2 == null || (str = a2.getLocalExt().get("key_focused_session_last_shown_time")) == null)) {
                Long g2 = p.g(str);
                if (g2 == null) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("FocusedListFilter", "Invalid number format ".concat(String.valueOf(str)));
                } else if (a2.getUpdatedTime() < g2.longValue() && longValue - a2.getUpdatedTime() >= ((Number) this.f101938c.getValue()).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        List<com.ss.android.ugc.aweme.im.service.k.a> g3 = n.g((Collection) arrayList);
        int size = g3.size();
        int i2 = this.f101939d;
        if (size < i2) {
            g3.addAll(n.d((Iterable) n.e(list, g3), i2 - g3.size()));
            l.d(g3, "");
            f fVar = f.f158658a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            n.a(g3, (Comparator) fVar);
        }
        for (com.ss.android.ugc.aweme.im.service.k.a aVar : g3) {
            this.f101942g.invoke(aVar.bF_(), "key_focused_session_last_shown_time", String.valueOf(longValue));
        }
        return n.k(g3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private c(int i2, int i3, com.bytedance.ies.im.core.api.b.a aVar, h.f.a.a<Long> aVar2, q<? super String, ? super String, ? super String, z> qVar) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(qVar, "");
        this.f101937a = i2;
        this.f101939d = i3;
        this.f101940e = aVar;
        this.f101941f = aVar2;
        this.f101942g = qVar;
        this.f101938c = i.a((h.f.a.a) new b(this));
    }
}
