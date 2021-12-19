package com.ss.android.ugc.aweme.tcm.impl.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tcm.api.a.a;
import com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements com.ss.android.ugc.aweme.tcm.api.service.b {

    /* renamed from: a  reason: collision with root package name */
    private TcmCheckLayout f138653a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewStub f138654b;

    static {
        Covode.recordClassIndex(90711);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.b
    public final void a() {
        TcmCheckLayout tcmCheckLayout = this.f138653a;
        if (tcmCheckLayout != null) {
            tcmCheckLayout.removeAllViews();
            tcmCheckLayout.setVisibility(8);
        }
    }

    public b(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f138654b = viewStub;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.b
    public final void a(Aweme aweme) {
        User user;
        String str;
        Integer reviewStatus;
        User user2;
        Integer reviewStatus2;
        MethodCollector.i(8366);
        a a2 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
        String str2 = null;
        if (a2 != null) {
            user = a2.b();
        } else {
            user = null;
        }
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (!(!TextUtils.equals(authorUid, str) || aweme.getTcmInfo() == null || aweme.getTcmInfo().getReviewStatus() == null || (reviewStatus = aweme.getTcmInfo().getReviewStatus()) == null || reviewStatus.intValue() != 1)) {
                if (this.f138653a == null) {
                    if (this.f138654b.getParent() != null) {
                        this.f138654b.setLayoutResource(R.layout.b3q);
                        this.f138654b.setInflatedId(R.id.b25);
                        View inflate = this.f138654b.inflate();
                        if (inflate != null) {
                            this.f138653a = (TcmCheckLayout) inflate;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout");
                            MethodCollector.o(8366);
                            throw nullPointerException;
                        }
                    } else {
                        this.f138653a = (TcmCheckLayout) this.f138654b.findViewById(R.id.b25);
                    }
                    this.f138653a = this.f138653a;
                }
                TcmCheckLayout tcmCheckLayout = this.f138653a;
                if (tcmCheckLayout != null) {
                    a a3 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
                    if (a3 != null) {
                        user2 = a3.b();
                    } else {
                        user2 = null;
                    }
                    if (aweme != null) {
                        String authorUid2 = aweme.getAuthorUid();
                        if (user2 != null) {
                            str2 = user2.getUid();
                        }
                        if (!(!TextUtils.equals(authorUid2, str2) || aweme.getTcmInfo() == null || aweme.getTcmInfo().getReviewStatus() == null || (reviewStatus2 = aweme.getTcmInfo().getReviewStatus()) == null || reviewStatus2.intValue() != 1)) {
                            com.a.a(LayoutInflater.from(tcmCheckLayout.getContext()), R.layout.b3p, tcmCheckLayout, true);
                            tcmCheckLayout.setVisibility(0);
                            r.a("show_video_review", new d().f66730a);
                            tcmCheckLayout.setOnClickListener(new TcmCheckLayout.a(tcmCheckLayout));
                            MethodCollector.o(8366);
                            return;
                        }
                    }
                    tcmCheckLayout.setVisibility(8);
                    MethodCollector.o(8366);
                    return;
                }
                MethodCollector.o(8366);
                return;
            }
        }
        MethodCollector.o(8366);
    }
}
