package com.bytedance.android.livesdk.toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.d;
import com.bytedance.android.live.p.h;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.o;
import com.bytedance.android.live.p.q;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.other.LiveTurntableUrlSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import java.util.ArrayList;
import java.util.List;

public class LiveToolbarWidget extends LiveRecyclableWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    private static final int f21663c = y.a(8.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final int f21664d = y.a(4.0f);

    /* renamed from: a  reason: collision with root package name */
    protected boolean f21665a;

    /* renamed from: b  reason: collision with root package name */
    protected q f21666b;

    /* renamed from: e  reason: collision with root package name */
    private List<l> f21667e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f21668f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21669g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21670h;

    /* access modifiers changed from: protected */
    public void c() {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfg;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    public LinearLayout a() {
        return (LinearLayout) getView();
    }

    /* access modifiers changed from: protected */
    public void b() {
        o.RIGHT.createHolder(this.dataChannel, this.f21668f, this.f21667e, this.f21666b);
    }

    static {
        Covode.recordClassIndex(12779);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f21667e.clear();
        ((h) a.a(h.class)).toolbarManager().a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f21669g = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f21670h = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.f21668f = a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i2 = 0;
        v.b((View) this.f21668f, 0);
        this.f21669g = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f21670h = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.b(ea.class));
        this.f21665a = equals;
        if (equals) {
            this.f21666b = q.ICON_WITH_TEXT;
            c();
        } else {
            this.f21666b = q.ICON;
        }
        this.dataChannel.a((m) this, ba.class, (b) new f(this)).b((m) this, d.class, (b) new g(this));
        if (TextUtils.isEmpty(LiveTurntableUrlSetting.INSTANCE.getValue())) {
            ((IGiftService) a.a(IGiftService.class)).onTurnTableUrlEmpty("The value in LiveConfigSettingKeys is empty");
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof List)) {
            this.f21667e = (List) objArr[0];
        }
        b();
        if (this.context != null && !this.f21669g && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.f21670h || !com.bytedance.android.live.uikit.c.a.a(this.context)) {
                marginLayoutParams.rightMargin = f21663c;
                if (this.f21665a) {
                    i2 = f21664d;
                }
                marginLayoutParams.leftMargin = i2;
            } else {
                marginLayoutParams.leftMargin = f21663c;
                if (this.f21665a) {
                    i2 = f21664d;
                }
                marginLayoutParams.rightMargin = i2;
            }
            getView().setLayoutParams(marginLayoutParams);
        }
    }
}
