package com.ss.android.ugc.aweme.prop.b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.g;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118264a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f118265b;

    /* renamed from: c  reason: collision with root package name */
    private final int f118266c;

    /* renamed from: d  reason: collision with root package name */
    private final g f118267d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f118268e;

    static {
        Covode.recordClassIndex(76805);
    }

    v(j jVar, Map map, int i2, g gVar, Bundle bundle) {
        this.f118264a = jVar;
        this.f118265b = map;
        this.f118266c = i2;
        this.f118267d = gVar;
        this.f118268e = bundle;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        j jVar = this.f118264a;
        Map map = this.f118265b;
        int i2 = this.f118266c;
        g gVar = this.f118267d;
        Bundle bundle = this.f118268e;
        r.a("donation_effect_banner_click", map);
        DonationServiceImpl.b().b(i2, gVar.id, bundle).show(jVar.getChildFragmentManager(), "DonationDialogFragment");
    }
}
