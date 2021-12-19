package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public abstract class a implements o<b, b> {
    public boolean I;
    public GenericWidget J;
    protected boolean K;
    public Aweme L;
    public String M;
    protected JSONObject N;
    protected boolean O;
    public int P;
    public DataCenter Q;
    public final Context R;
    public final View S;
    public View T;
    protected String U = "click";
    protected Fragment V;
    protected int W;

    /* renamed from: a  reason: collision with root package name */
    private boolean f93130a;

    static {
        Covode.recordClassIndex(59078);
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void b(View view);

    /* access modifiers changed from: protected */
    public abstract void a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    public void a(Map<String, Object> map) {
    }

    /* access modifiers changed from: protected */
    public boolean a(b bVar) {
        return true;
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    /* access modifiers changed from: protected */
    public boolean d(b bVar) {
        return false;
    }

    public int f(b bVar) {
        return 0;
    }

    public void f() {
    }

    public void g() {
    }

    public void i() {
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return true;
    }

    public void h() {
        this.J.b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        b(this.S);
    }

    public final boolean j() {
        if (!k()) {
            return false;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.of).a();
        return true;
    }

    public boolean k() {
        boolean E = com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.L);
        Aweme aweme = this.L;
        if ((aweme == null || !aweme.isAd()) && E) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        Object a2 = this.Q.a("video_params");
        f();
        if (a2 != null && l()) {
            onChanged(new b("video_params", a2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.Q = dataCenter;
            a(dataCenter);
        }
    }

    public a(View view) {
        this.R = view.getContext();
        this.S = view;
        this.I = true;
        a(view, true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Map map) {
        this.U = (String) map.get("enterMethod");
        this.N = (JSONObject) map.get("reqId");
    }

    private void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (this.I) {
            p.f93149a.a(new r(true, new k(this, map)));
            return;
        }
        this.U = (String) map.get("enterMethod");
        this.N = (JSONObject) map.get("reqId");
    }

    private boolean i(b bVar) {
        if (!this.f93130a || bVar == null || q.b(this)) {
            return false;
        }
        if ("video_params".equals(bVar.f67014a)) {
            if (a(bVar)) {
                q.a(this);
                return false;
            }
            q.d(this);
            return true;
        } else if (q.c(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void a(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    public void b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.L = videoItemParams.mWidgetAweme;
            this.P = videoItemParams.mPageType;
            this.M = videoItemParams.mEventType;
            this.N = videoItemParams.mRequestId;
            this.O = videoItemParams.isMyProfile;
            this.U = videoItemParams.mEnterMethodValue;
            this.V = videoItemParams.fragment;
            this.W = videoItemParams.mAwemeFromPage;
        }
    }

    public b e(b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1180796502:
                    if (str.equals("on_viewpager_page_selected")) {
                        i();
                        break;
                    }
                    break;
                case -98766390:
                    if (str.equals("video_params")) {
                        a((VideoItemParams) bVar.a());
                        break;
                    }
                    break;
                case 986395595:
                    if (str.equals("async_widget_unsafe_data")) {
                        c((Map) bVar.a());
                        break;
                    }
                    break;
            }
        }
        return bVar;
    }

    /* renamed from: g */
    public final void onChanged(b bVar) {
        if (this.I) {
            if (!d(bVar)) {
                p.f93149a.a(new r(this.I, new l(this, bVar)));
            }
        } else if (!d(bVar) && !i(bVar)) {
            if (bVar == null || bVar.f67014a.equals("video_params")) {
                b(e(bVar));
                return;
            }
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                i();
            } else if (str.equals("async_widget_unsafe_data")) {
                c((Map) bVar.a());
            }
            c(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(b bVar) {
        if (!i(bVar)) {
            if (bVar == null || bVar.f67014a.equals("video_params")) {
                b e2 = e(bVar);
                p.f93149a.a(new r(false, new e(this, f(e2), e2)));
                return;
            }
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                i();
            } else if (str.equals("async_widget_unsafe_data")) {
                c((Map) bVar.a());
            }
            c(bVar);
        }
    }

    private void a(View view, boolean z) {
        p.f93149a.a(new r(true, new d(this)));
    }

    public a(View view, boolean z) {
        this.R = view.getContext();
        this.S = view;
        this.I = true;
        this.f93130a = z;
        if (z) {
            m mVar = new m(this, view);
            l.d(this, "");
            l.d(mVar, "");
            q.f93152a.put(this, mVar);
            return;
        }
        a(view, true);
    }
}
