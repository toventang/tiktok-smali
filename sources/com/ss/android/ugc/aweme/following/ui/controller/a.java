package com.ss.android.ugc.aweme.following.ui.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.a.e;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.j;
import com.ss.android.ugc.aweme.social.widget.card.k;
import h.f.b.l;
import java.util.List;

public class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final TopRecommendVM f96492a;

    /* renamed from: b  reason: collision with root package name */
    public final DmtStatusView f96493b;

    /* renamed from: c  reason: collision with root package name */
    public final j f96494c;

    static {
        Covode.recordClassIndex(61111);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public void a(User user) {
        l.d(user, "");
        this.f96494c.a(user);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void d(int i2) {
        boolean z;
        TopRecommendVM topRecommendVM = this.f96492a;
        if (i2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        topRecommendVM.f96650c = z;
        topRecommendVM.a(true ^ topRecommendVM.f96650c);
        this.f96494c.d(i2);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void a(k kVar) {
        l.d(kVar, "");
        if (kVar == k.LOADING) {
            this.f96493b.f();
        } else if (!this.f96493b.k()) {
            this.f96493b.d();
        }
        this.f96494c.a(kVar);
    }

    public a(TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, j jVar) {
        l.d(topRecommendVM, "");
        l.d(dmtStatusView, "");
        l.d(jVar, "");
        this.f96492a = topRecommendVM;
        this.f96493b = dmtStatusView;
        this.f96494c = jVar;
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public void a(f fVar, e eVar, List<? extends User> list) {
        l.d(fVar, "");
        l.d(eVar, "");
        this.f96494c.a(fVar, eVar, list);
    }
}
