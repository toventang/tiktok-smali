package dmt.av.video.b;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.concurrent.ScheduledExecutorService;

public class l extends j {
    public h.f.a.a<? extends e> H;
    private final h I = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(104180);
    }

    /* access modifiers changed from: protected */
    public e a() {
        b bVar = new b();
        bVar.a(new i(), -1);
        return bVar;
    }

    static final class a extends m implements h.f.a.a<e> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(104181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            if (this.this$0.H == null) {
                return this.this$0.a();
            }
            h.f.a.a<? extends e> aVar = this.this$0.H;
            if (aVar == null) {
                h.f.b.l.b();
            }
            return aVar.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(s sVar, ScheduledExecutorService scheduledExecutorService) {
        super(sVar, scheduledExecutorService);
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(scheduledExecutorService, "");
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, com.bytedance.creativex.editor.preview.a aVar, SurfaceView surfaceView, androidx.lifecycle.m mVar) {
        h.f.b.l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        if (aVar.getVideoPaths() == null || aVar.getVideoPaths().length == 0 || !p.c(aVar.getVideoPaths()[0], "jpeg", false)) {
            c().d(1);
        } else {
            c().d(-1);
        }
        return c().a(((e) this.I.getValue()).a(aVar));
    }
}
