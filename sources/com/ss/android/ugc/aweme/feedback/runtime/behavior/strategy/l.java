package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class l extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f95450b = new a((byte) 0);

    static {
        Covode.recordClassIndex(60465);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_upload";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60466);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        AwemeToolFeedbackECode awemeToolFeedbackECode;
        List<i.c> e2 = e();
        if (e2.isEmpty()) {
            return "";
        }
        int size = e2.size();
        ArrayList arrayList = new ArrayList();
        for (T t : e2) {
            if (h.f.b.l.a(t.f95429f, i.c.a.C2296c.f95437b)) {
                arrayList.add(t);
            }
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : e2) {
            if (h.f.b.l.a(t2.f95429f, i.c.a.C2292a.f95432b)) {
                arrayList2.add(t2);
            }
        }
        int size3 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (T t3 : e2) {
            if (t3.f95429f instanceof i.c.a.b) {
                arrayList3.add(t3);
            }
        }
        ArrayList<i.c> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
        for (i.c cVar : arrayList4) {
            i.c.a aVar = cVar.f95429f;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.PublishBaseStrategy.OncePublish.Type.Failed");
            i.c.a.b bVar = (i.c.a.b) aVar;
            if (bVar instanceof i.c.a.b.C2293a) {
                i.c.a.b.C2293a aVar2 = (i.c.a.b.C2293a) bVar;
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(aVar2.f95433b, aVar2.f95434c);
            } else if (bVar instanceof i.c.a.b.C2295c) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode("LO", ((i.c.a.b.C2295c) bVar).f95436b);
            } else if (bVar instanceof i.c.a.b.C2294b) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(((i.c.a.b.C2294b) bVar).f95435b, "EX");
            } else {
                throw new h.n();
            }
            arrayList5.add(awemeToolFeedbackECode);
        }
        String b2 = dg.a().b(n.a(new AwemeToolFeedbackInfo("Publish", size, size2, size3, arrayList5)));
        h.f.b.l.b(b2, "");
        return b2;
    }
}
