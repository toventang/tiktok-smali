package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.musically.cut.n;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f99899a;

    /* renamed from: b  reason: collision with root package name */
    private final n.b f99900b;

    /* renamed from: c  reason: collision with root package name */
    private final int f99901c;

    /* renamed from: d  reason: collision with root package name */
    private final MediaModel f99902d;

    static {
        Covode.recordClassIndex(63678);
    }

    o(n nVar, n.b bVar, int i2, MediaModel mediaModel) {
        this.f99899a = nVar;
        this.f99900b = bVar;
        this.f99901c = i2;
        this.f99902d = mediaModel;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        n nVar = this.f99899a;
        n.b bVar = this.f99900b;
        int i2 = this.f99901c;
        MediaModel mediaModel = this.f99902d;
        if (!nVar.f99877a) {
            r.a("choose_upload_content", new b().a("content_type", "video").a("upload_type", "mutiple_content").f149193a);
            int indexOf = nVar.f99880d.indexOf(Integer.valueOf(i2));
            if (indexOf >= 0) {
                nVar.f99879c.set(i2, -1);
                bVar.a();
                nVar.f99877a = true;
                bVar.f99898f.animate().alpha(0.0f).setDuration(300).withEndAction(new p(nVar, bVar, i2)).start();
                bVar.f99893a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                if (nVar.f99886j != null) {
                    nVar.f99886j.remove(indexOf);
                }
                nVar.f99880d.remove(Integer.valueOf(i2));
                int size = nVar.f99880d.size();
                while (indexOf < size) {
                    nVar.f99879c.set(nVar.f99880d.get(indexOf).intValue(), Integer.valueOf(indexOf));
                    if (size != 11) {
                        nVar.notifyItemChanged(nVar.f99880d.get(indexOf).intValue());
                    }
                    indexOf++;
                }
                if (size == 11) {
                    nVar.f99887k.b();
                    return;
                }
                return;
            }
            nVar.f99888l.a(mediaModel, 0, -1, new q(nVar, bVar, i2, mediaModel), new r(nVar, bVar.itemView.getContext()));
        }
    }
}
