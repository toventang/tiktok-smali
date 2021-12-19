package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public final a f130087b;

    public interface a {
        static {
            Covode.recordClassIndex(85352);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(85351);
    }

    public b(a aVar) {
        l.d(aVar, "");
        this.f130087b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b$b  reason: collision with other inner class name */
    static final class C3388b extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3388b(b bVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = bVar;
            this.$callback = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            this.this$0.f130087b.b();
            h.f.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(intValue));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.a
    public final void a(ASCameraView aSCameraView, h.f.a.b<? super Integer, z> bVar) {
        l.d(aSCameraView, "");
        this.f130087b.a();
        aSCameraView.a(new C3388b(this, bVar));
    }
}
