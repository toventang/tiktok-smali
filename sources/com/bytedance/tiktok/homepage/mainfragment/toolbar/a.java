package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.im.service.b.e;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.b;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class a extends c implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public View f44210a;

    /* renamed from: b  reason: collision with root package name */
    public DmNoticeProxy f44211b = DmNoticeProxyImpl.e();

    /* renamed from: c  reason: collision with root package name */
    public b f44212c;

    static {
        Covode.recordClassIndex(27086);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388613;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(88, new g(a.class, "onUnder16RefreshEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        MethodCollector.i(4968);
        if (this.f44212c.getActivity() == null) {
            MethodCollector.o(4968);
            return null;
        }
        if (ax.b()) {
            View c2 = HomePageUIFrameServiceImpl.e().c(this.f44212c.getActivity());
            this.f44210a = c2;
            if (c2 == null) {
                MethodCollector.o(4968);
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) c2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f44210a);
            }
        } else {
            this.f44210a = HomePageUIFrameServiceImpl.e().e(this.f44212c.getActivity());
        }
        View view = this.f44210a;
        MethodCollector.o(4968);
        return view;
    }

    public a(b bVar) {
        this.f44212c = bVar;
        EventBus.a(EventBus.a(), this);
    }

    @r(a = ThreadMode.MAIN)
    public void onUnder16RefreshEvent(e eVar) {
        if (this.f44210a != null && this.f44211b.b()) {
            this.f44210a.setVisibility(8);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        if (b.b().shouldRedictToTipsPage()) {
            b.b().goToTipsPage();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.f44212c.g());
        bundle.putString("enter_method", "button");
        bundle.putString("notice_type", this.f44211b.c());
        bundle.putInt("message_cnt", this.f44211b.d());
        HomePageUIFrameServiceImpl.e().a(this.f44212c.getActivity(), bundle);
    }
}
