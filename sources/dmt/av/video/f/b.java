package dmt.av.video.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.effectplatform.p;
import com.ss.android.ugc.aweme.effectplatform.v;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Arrays;
import java.util.List;

public final class b implements com.ss.android.ugc.aweme.shortvideo.ui.task.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f156889a = i.a((h.f.a.a) C4148b.f156890a);

    static {
        Covode.recordClassIndex(104213);
    }

    private final g c() {
        return (g) this.f156889a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    public static final class a implements IFoundationAVService.IFetchResourcesListener {
        static {
            Covode.recordClassIndex(104214);
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            l.d(exc, "");
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            l.d(strArr, "");
            List b2 = n.b(Arrays.copyOf(strArr, strArr.length));
            l.d(b2, "");
            v.f89091a.addAll(b2);
        }
    }

    /* renamed from: dmt.av.video.f.b$b  reason: collision with other inner class name */
    static final class C4148b extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4148b f156890a = new C4148b();

        static {
            Covode.recordClassIndex(104215);
        }

        C4148b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new p();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        c().a(new a());
        if (com.ss.android.ugc.aweme.shortvideo.edit.b.g.a()) {
            c().a(new String[]{"lens_hdr"}, null);
        }
    }
}
