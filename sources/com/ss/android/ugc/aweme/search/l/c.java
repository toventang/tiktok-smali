package com.ss.android.ugc.aweme.search.l;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.d.e;
import com.ss.android.ugc.aweme.d.g;
import com.ss.android.ugc.aweme.d.i;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.LinkedList;

public final class c extends g {

    final /* synthetic */ class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f121383a;

        static {
            Covode.recordClassIndex(79086);
        }

        b(h.f.a.a aVar) {
            this.f121383a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f121383a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(79084);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ e.a $target;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(79085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, e.a aVar) {
            super(0);
            this.this$0 = cVar;
            this.$target = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(616);
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
                                    MethodCollector.o(616);
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(616);
            return zVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Activity activity) {
        super(activity);
        l.d(activity, "");
    }

    @Override // com.ss.android.ugc.aweme.d.g, com.ss.android.ugc.aweme.d.e
    public final void a(e.a aVar) {
        l.d(aVar, "");
        if (i.b()) {
            com.ss.android.ugc.aweme.d.a.f79330a.post(new b(new a(this, aVar)));
        }
    }
}
