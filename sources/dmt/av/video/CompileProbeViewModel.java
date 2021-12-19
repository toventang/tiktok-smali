package dmt.av.video;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.bz;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.gamora.editor.c;
import com.ss.android.ugc.gamora.editor.d;
import h.f.b.m;
import h.h;
import h.i;

public final class CompileProbeViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f156719a = i.a((h.f.a.a) a.f156720a);

    static {
        Covode.recordClassIndex(104090);
    }

    public final c a() {
        return (c) this.f156719a.getValue();
    }

    static final class a extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156720a = new a();

        static {
            Covode.recordClassIndex(104091);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            bj.b("CompileProbeViewModel -> init");
            if (bz.a()) {
                bj.b("CompileProbeViewModel -> CompileProbeV2");
                return new d();
            }
            bj.b("CompileProbeViewModel -> CompileProbe");
            return new c();
        }
    }
}
