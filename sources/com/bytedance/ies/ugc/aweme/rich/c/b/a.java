package com.bytedance.ies.ugc.aweme.rich.c.b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.b;
import com.bytedance.ies.ugc.aweme.rich.c.a.d;
import com.bytedance.ies.ugc.aweme.rich.c.a.e;
import com.bytedance.ies.ugc.aweme.rich.c.a.f;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Integer> f35152a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Bundle> f35153b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.ugc.aweme.rich.b.a f35154c;

    /* renamed from: d  reason: collision with root package name */
    private final h f35155d = i.a((h.f.a.a) C0794a.f35158a);

    /* renamed from: e  reason: collision with root package name */
    private final Context f35156e;

    /* renamed from: f  reason: collision with root package name */
    private final d f35157f;

    static {
        Covode.recordClassIndex(21067);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.c
    public final Context a() {
        return this.f35156e;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.c
    public final com.bytedance.ies.ugc.aweme.rich.b.a b() {
        return this.f35154c;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.c.b.a$a  reason: collision with other inner class name */
    static final class C0794a extends m implements h.f.a.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0794a f35158a = new C0794a();

        static {
            Covode.recordClassIndex(21068);
        }

        C0794a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            return new Bundle();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.e
    public final f c() {
        b bVar = new b(this.f35153b, this.f35152a, this.f35157f, this);
        for (Integer num : bVar.f35161c) {
            int intValue = num.intValue();
            Bundle bundle = bVar.f35160b.get(intValue);
            if (bundle == null) {
                bundle = new Bundle();
            }
            b a2 = bVar.f35162d.a(intValue, bVar.f35163e, bundle);
            if (a2 != null) {
                if (!(a2 instanceof com.bytedance.ies.ugc.aweme.rich.c.a.a)) {
                    l.c("Task skipped!!! If you have IRichAsyncTask, pls invoke executeAsync!", "");
                    Thread currentThread = Thread.currentThread();
                    l.a((Object) currentThread, "");
                    currentThread.getName();
                } else if (a2.b()) {
                    g a3 = ((com.bytedance.ies.ugc.aweme.rich.c.a.a) a2).a();
                    a2.a(a3.f35150a);
                    bVar.f35159a.put(String.valueOf(intValue), a3.f35151b);
                    if (a3.f35150a) {
                        String jSONObject = bVar.f35159a.toString();
                        l.a((Object) jSONObject, "");
                        return new f(true, intValue, jSONObject);
                    }
                } else {
                    continue;
                }
            }
        }
        String jSONObject2 = bVar.f35159a.toString();
        l.a((Object) jSONObject2, "");
        return new f(false, Integer.MIN_VALUE, jSONObject2);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.e
    public final e a(int i2, Bundle bundle) {
        this.f35152a.add(Integer.valueOf(i2));
        this.f35153b.put(i2, bundle);
        return this;
    }

    public a(Context context, d dVar) {
        l.c(context, "");
        l.c(dVar, "");
        this.f35156e = context;
        this.f35157f = dVar;
    }
}
