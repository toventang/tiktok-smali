package com.ss.android.ugc.aweme.feed.ui;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

final /* synthetic */ class dk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dg f94599a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94600b;

    /* renamed from: c  reason: collision with root package name */
    private final b f94601c;

    static {
        Covode.recordClassIndex(60043);
    }

    dk(dg dgVar, String str, b bVar) {
        this.f94599a = dgVar;
        this.f94600b = str;
        this.f94601c = bVar;
    }

    public final void run() {
        dg dgVar = this.f94599a;
        String str = this.f94600b;
        b bVar = this.f94601c;
        str.hashCode();
        if (str.equals("action_video_on_play_progress_change")) {
            e eVar = (e) bVar.a();
            if (eVar != null && eVar.f2398b.doubleValue() >= 1.0d) {
                dgVar.a(3);
                if (dgVar.Q != null) {
                    dgVar.Q.b("action_video_on_play_progress_change", (u<b>) dgVar);
                }
            }
        } else if (str.equals("show_expose_sharer_info_view")) {
            dgVar.a(2);
        }
    }
}
