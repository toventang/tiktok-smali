package com.ss.android.ugc.aweme.share.silent;

import android.widget.RadioGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.s;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class q implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f124362a;

    static {
        Covode.recordClassIndex(81654);
    }

    q(j jVar) {
        this.f124362a = jVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        j jVar = this.f124362a;
        if (i2 == R.id.zk) {
            s.a.f66880a.j().b(1);
            jVar.a("sync_share_save_local");
            SharePrefCache.inst().getAutoSaveVideo().b(true);
        } else if (i2 == R.id.yr) {
            s.a.f66880a.j().b(2);
            jVar.a("sync_share_save_ins");
            SharePrefCache.inst().getAutoSaveVideo().b(true);
        } else if (i2 == R.id.ys) {
            s.a.f66880a.j().b(3);
            jVar.a("sync_share_save_ins_story");
            SharePrefCache.inst().getAutoSaveVideo().b(true);
        } else {
            s.a.f66880a.j().b(0);
            SharePrefCache.inst().getAutoSaveVideo().b(false);
        }
    }
}
