package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.c.b;

public final class l extends n {

    /* renamed from: a  reason: collision with root package name */
    private final f f94936a;

    static {
        Covode.recordClassIndex(60216);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void b(View view) {
        h.f.b.l.d(view, "");
        this.f94936a.a("report");
        super.b(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        h.f.b.l.d(view, "");
        if (this.f94901f != null && f.j() != null) {
            Activity j2 = f.j();
            if (j2 == null) {
                h.f.b.l.b();
            }
            Aweme aweme = this.f94901f;
            if (aweme == null) {
                h.f.b.l.b();
            }
            if (aweme.isAd()) {
                Aweme aweme2 = this.f94901f;
                if (aweme2 == null) {
                    h.f.b.l.b();
                }
                if (aweme2.getAwemeRawAd() != null) {
                    Aweme aweme3 = this.f94901f;
                    if (aweme3 == null) {
                        h.f.b.l.b();
                    }
                    AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(awemeRawAd, "");
                    if (awemeRawAd.isReportEnable()) {
                        IReportService a2 = a.a();
                        Activity a3 = b.a(j2);
                        Aweme aweme4 = this.f94901f;
                        if (aweme4 == null) {
                            h.f.b.l.b();
                        }
                        a2.b(a3, com.ss.android.ugc.aweme.report.b.a(aweme4, "long_press", "ad"));
                        return;
                    }
                }
            }
            ShareDependService a4 = ShareDependService.a.a();
            Aweme aweme5 = this.f94901f;
            if (aweme5 == null) {
                h.f.b.l.b();
            }
            a4.a(aweme5, this.f94902g, j2, "long_press", this.f94902g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(a aVar, f fVar) {
        super(aVar, fVar);
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(fVar, "");
        this.f94936a = fVar;
    }
}
