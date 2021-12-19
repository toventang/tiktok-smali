package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.shortvideo.n.b;

final /* synthetic */ class gc implements u {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131784a;

    static {
        Covode.recordClassIndex(86322);
    }

    gc(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131784a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131784a;
        a aVar = (a) obj;
        if (aVar != null && aVar.f69569b == a.EnumC1574a.SUCCESS && aVar.f69568a != null) {
            int intValue = ((Integer) aVar.f69568a.getSecond()).intValue();
            if (videoRecordNewActivity.u != null && videoRecordNewActivity.f131226e.getValue().b(com.ss.android.ugc.aweme.shortvideo.n.a.class) != null) {
                ((com.ss.android.ugc.aweme.shortvideo.n.a) videoRecordNewActivity.f131226e.getValue().b(com.ss.android.ugc.aweme.shortvideo.n.a.class)).a(b.f129514c.f129516a, intValue);
            }
        }
    }
}
