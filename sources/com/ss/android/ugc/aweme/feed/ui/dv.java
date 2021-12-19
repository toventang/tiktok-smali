package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.cp.f;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.experiment.ac;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.power.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class dv extends h {

    /* renamed from: b  reason: collision with root package name */
    ImageView f94632b;

    /* renamed from: c  reason: collision with root package name */
    TextView f94633c;

    /* renamed from: d  reason: collision with root package name */
    MarqueeView f94634d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f94635e;

    /* renamed from: f  reason: collision with root package name */
    TextView f94636f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f94637g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f94638h = b.a().a(true, "marquee_title_opt", false);

    /* renamed from: i  reason: collision with root package name */
    private f f94639i;

    static {
        Covode.recordClassIndex(60064);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.h
    public final void b() {
        long j2;
        if (this.f94637g) {
            this.f94637g = false;
            if (this.f94634d != null) {
                p pVar = p.f93149a;
                r rVar = new r(false, new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.ui.dv.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(60067);
                    }

                    public final void run() {
                        dv.this.f94634d.c();
                    }
                });
                if (gg.f90139a) {
                    j2 = 300;
                } else {
                    j2 = 0;
                }
                pVar.a(rVar, j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    private void a(String str) {
        this.f94636f.setText(str);
        this.f94634d.setText(str);
    }

    public dv(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a, com.ss.android.ugc.aweme.feed.ui.h
    public final void a(DataCenter dataCenter) {
        dataCenter.a("stopPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("startPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("pausePlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
    }

    private void b(int i2) {
        if (this.f94638h || c.a().f115706a == 2) {
            this.f94636f.setVisibility(i2);
            this.f94634d.setVisibility(8);
            return;
        }
        this.f94634d.setVisibility(i2);
        this.f94636f.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!TextUtils.equals(bVar.f67014a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
        hashMap.put("aweme_state", this.L);
        hashMap.put("event_type_state", this.M);
        hashMap.put("enter_method_state", this.U);
        return bVar2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a, com.ss.android.ugc.aweme.feed.ui.h
    public final void a(View view) {
        super.a(view);
        this.T = com.a.b.c.a((Activity) this.R, (int) R.layout.t8);
        this.f94634d = (MarqueeView) this.T.findViewById(R.id.crb);
        this.f94636f = (TextView) this.T.findViewById(R.id.crd);
        this.f94633c = (TextView) this.T.findViewById(R.id.cqq);
        this.f94632b = (ImageView) this.T.findViewById(R.id.cqi);
        this.f94635e = (LinearLayout) this.T.findViewById(R.id.cr_);
        if (!ac.a()) {
            this.f94638h = true;
            this.f94636f.setVisibility(0);
            this.f94634d.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.dv.c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0189, code lost:
        if (android.text.TextUtils.equals(r1.getOwnerId(), r2.getUid()) != false) goto L_0x015c;
     */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b r16) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.dv.b(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }
}
