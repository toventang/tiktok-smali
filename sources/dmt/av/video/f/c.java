package dmt.av.video.f;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.bs;
import com.ss.android.ugc.aweme.setting.bt;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;

public final class c implements a {
    static {
        Covode.recordClassIndex(104216);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        if (!g.a().e().getReactDuetSettingChanged(false)) {
            i.b(bs.f122117a, i.f4824a).a(bt.f122118a);
        }
    }
}
