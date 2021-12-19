package com.ss.android.ugc.aweme.live.h;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Activity f108421a;

    /* renamed from: b  reason: collision with root package name */
    public HSImageView f108422b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f108423c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f108424d = true;

    /* renamed from: e  reason: collision with root package name */
    public View f108425e;

    /* renamed from: f  reason: collision with root package name */
    public LiveLoadingView f108426f;

    /* renamed from: g  reason: collision with root package name */
    public long f108427g;

    /* renamed from: h  reason: collision with root package name */
    private ViewStub f108428h;

    static {
        Covode.recordClassIndex(69469);
    }

    public final void a() {
        this.f108423c = false;
        n.a(this.f108426f, 8);
        if (!this.f108424d && !this.f108423c) {
            n.a(this.f108425e, 8);
        }
        c();
    }

    public final void b() {
        this.f108424d = false;
        n.a(this.f108422b, 8);
        if (!this.f108424d && !this.f108423c) {
            n.a(this.f108425e, 8);
        }
    }

    private void c() {
        if (this.f108427g > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(this.f108427g));
            b.a.a("livesdk_pre_loading_duration").a().a((Map<String, String>) hashMap).b();
            this.f108427g = 0;
        }
    }

    public a(Activity activity) {
        MethodCollector.i(13030);
        this.f108421a = activity;
        if (activity != null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.chp);
            this.f108428h = viewStub;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                this.f108425e = inflate;
                if (inflate != null) {
                    this.f108422b = (HSImageView) inflate.findViewById(R.id.cbx);
                    this.f108426f = (LiveLoadingView) this.f108425e.findViewById(R.id.cdi);
                }
            }
        }
        MethodCollector.o(13030);
    }
}
