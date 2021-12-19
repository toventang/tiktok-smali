package com.ss.android.ugc.aweme.story.record.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a {
    static {
        Covode.recordClassIndex(90392);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.d.a$a  reason: collision with other inner class name */
    public static final class C3639a extends m implements b<List<? extends String>, z> {
        final /* synthetic */ CountDownLatch $latch;
        final /* synthetic */ List $pathForExtractFrameList;

        static {
            Covode.recordClassIndex(90393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3639a(List list, CountDownLatch countDownLatch) {
            super(1);
            this.$pathForExtractFrameList = list;
            this.$latch = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            l.d(list2, "");
            this.$pathForExtractFrameList.addAll(list2);
            this.$latch.countDown();
            return z.f158842a;
        }
    }

    public static final void a(o oVar, List<String> list, j jVar) {
        l.d(oVar, "");
        l.d(list, "");
        l.d(jVar, "");
        if (jVar.I() != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            List<String> I = jVar.I();
            if (I == null) {
                l.b();
            }
            oVar.a(I, new C3639a(list, countDownLatch));
            countDownLatch.await(2, TimeUnit.SECONDS);
        }
    }
}
