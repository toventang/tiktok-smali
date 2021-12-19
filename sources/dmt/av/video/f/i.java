package dmt.av.video.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.df.t;
import com.ss.android.ugc.aweme.port.in.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class i implements com.ss.android.ugc.aweme.shortvideo.ui.task.a {
    static {
        Covode.recordClassIndex(104222);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    static final class a extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156893a = new a();

        static {
            Covode.recordClassIndex(104223);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c.f115624c.k();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        a aVar = a.f156893a;
        l.d(aVar, "");
        s.f80066a.execute(new t(aVar));
    }
}
