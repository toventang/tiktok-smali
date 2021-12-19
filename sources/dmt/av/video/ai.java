package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import dmt.av.video.b.f;
import dmt.av.video.z;

final /* synthetic */ class ai implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private final z.AnonymousClass1 f156771a;

    static {
        Covode.recordClassIndex(104120);
    }

    ai(z.AnonymousClass1 r1) {
        this.f156771a = r1;
    }

    @Override // dmt.av.video.b.f.a
    public final void a() {
        z.AnonymousClass1 r2 = this.f156771a;
        if (!z.this.y) {
            z.this.y = true;
            e.a("receive prepare done event");
            z.this.z.postValue(null);
        }
    }
}
