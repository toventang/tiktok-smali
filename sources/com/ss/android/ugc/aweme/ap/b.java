package com.ss.android.ugc.aweme.ap;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class b {
    static {
        Covode.recordClassIndex(40820);
    }

    public static final class a extends m implements h.f.a.b<List<? extends String>, z> {
        final /* synthetic */ CountDownLatch $latch;
        final /* synthetic */ List $pathForExtractFrameList;

        static {
            Covode.recordClassIndex(40821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List list, CountDownLatch countDownLatch) {
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
}
