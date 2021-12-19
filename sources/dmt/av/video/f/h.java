package dmt.av.video.f;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import com.ss.android.ugc.aweme.sticker.i.b;
import h.f.b.l;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f156892a;

    static {
        Covode.recordClassIndex(104221);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        i.b(new b(com.ss.android.ugc.aweme.sticker.i.a.a(), this.f156892a), i.f4824a);
    }

    public h(Context context) {
        l.d(context, "");
        this.f156892a = context;
    }
}
