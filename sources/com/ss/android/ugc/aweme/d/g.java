package com.ss.android.ugc.aweme.d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.d.e;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class g extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f79340d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, LinkedList<View>> f79341b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public long f79342c = 10000;

    static {
        Covode.recordClassIndex(49253);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49254);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e.a $target;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(49255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, e.a aVar) {
            super(0);
            this.this$0 = gVar;
            this.$target = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(1327);
            if (!this.this$0.f79335a.isFinishing()) {
                try {
                    for (p<Integer, Integer> pVar : this.$target.f79336a) {
                        Integer first = pVar.getFirst();
                        int intValue = pVar.getSecond().intValue();
                        int intValue2 = first.intValue();
                        LinkedList<View> linkedList = this.this$0.f79341b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.this$0.f79341b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        for (int i2 = 0; i2 < intValue; i2++) {
                            View a2 = com.a.b.a.a(this.this$0.f79335a, intValue2, new FrameLayout(this.this$0.f79335a), false);
                            synchronized (linkedList) {
                                try {
                                    linkedList.offer(a2);
                                } catch (Throwable th) {
                                    MethodCollector.o(1327);
                                    throw th;
                                }
                            }
                        }
                    }
                    e.a aVar = this.$target;
                    ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = this.this$0.f79341b;
                    long j2 = this.this$0.f79342c;
                    l.c(aVar, "");
                    l.c(concurrentHashMap, "");
                    a.f79330a.postDelayed(new f(aVar, concurrentHashMap), j2);
                    a.f79331b.a(this.this$0.f79335a);
                } catch (Exception unused) {
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(1327);
            return zVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Activity activity) {
        super(activity);
        l.c(activity, "");
    }

    @Override // com.ss.android.ugc.aweme.d.e
    public void a(e.a aVar) {
        l.c(aVar, "");
        if (i.b()) {
            a.f79330a.post(new h(new b(this, aVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.d.c
    public final View a(int i2) {
        MethodCollector.i(3262);
        if (i.b()) {
            LinkedList<View> linkedList = this.f79341b.get(Integer.valueOf(i2));
            if (linkedList != null) {
                synchronized (linkedList) {
                    try {
                        View poll = linkedList.poll();
                        if (poll != null) {
                            return poll;
                        }
                        this.f79341b.remove(Integer.valueOf(i2));
                    } finally {
                        MethodCollector.o(3262);
                    }
                }
            }
            View a2 = com.a.b.a.a(this.f79335a, i2, new FrameLayout(this.f79335a), false);
            l.a((Object) a2, "");
            MethodCollector.o(3262);
            return a2;
        } else if (((Boolean) i.f79344a.getValue()).booleanValue()) {
            View a3 = com.a.b.a.a(this.f79335a, i2, new FrameLayout(this.f79335a), false);
            l.a((Object) a3, "");
            MethodCollector.o(3262);
            return a3;
        } else {
            View a4 = com.a.a(LayoutInflater.from(this.f79335a), i2, new FrameLayout(this.f79335a), false);
            l.a((Object) a4, "");
            MethodCollector.o(3262);
            return a4;
        }
    }
}
