package com.ss.android.ugc.aweme.profile.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.story.j.a;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f115842a;

    /* renamed from: b  reason: collision with root package name */
    private final c f115843b;

    /* renamed from: c  reason: collision with root package name */
    private final int f115844c;

    static {
        Covode.recordClassIndex(74722);
    }

    g(e eVar, c cVar, int i2) {
        this.f115842a = eVar;
        this.f115843b = cVar;
        this.f115844c = i2;
    }

    public final void run() {
        e eVar = this.f115842a;
        c cVar = this.f115843b;
        if (cVar.k()) {
            String o = cVar.o();
            if (e.b(o)) {
                a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMvThemeType: firstBitmap");
                v a2 = r.a(new File(o));
                a2.E = eVar.f115837b;
                a2.a("DraftBoxViewHolder").c();
            } else {
                a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMvThemeType: firstBitmap does not exist");
            }
        } else if (cVar.n()) {
            String p = cVar.p();
            if (e.b(p)) {
                a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMultiEditType: firstBitmap");
                v a3 = r.a(new File(p));
                a3.E = eVar.f115837b;
                a3.a("DraftBoxViewHolder").c();
            } else {
                a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMultiEditType: firstBitmap does not exist");
            }
        } else if (cVar.W.bo != null) {
            List<String> sourceInfo = cVar.W.bo.getSourceInfo();
            if (sourceInfo == null || sourceInfo.isEmpty()) {
                a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isCanvasType: sourceInfo is null or empty || firstBitmap does not exist");
            } else {
                String str = sourceInfo.get(0);
                if (e.b(str)) {
                    a.b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isCanvasType: firstBitmap");
                    v a4 = r.a(new File(str));
                    a4.E = eVar.f115837b;
                    a4.a("DraftBoxViewHolder").c();
                }
            }
        } else {
            AVExternalServiceImpl.a().abilityService().infoService().videoCover(cVar, new j(eVar));
        }
        if (eVar.f115838c != null) {
            i.b(new h(eVar), i.f4824a).a(new i(eVar), i.f4826c, null);
        }
        if (eVar.f115839d != null) {
            eVar.f115839d.setTypeface(b.a().a(d.f33801g));
        }
    }
}
