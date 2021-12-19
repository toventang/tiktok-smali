package com.ss.android.ugc.aweme.notification.i;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.b.e;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.service.a;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c extends i.a implements org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    private final h f113753a = h.i.a((h.f.a.a) a.f113755a);

    /* renamed from: b  reason: collision with root package name */
    private View f113754b;

    static {
        Covode.recordClassIndex(73128);
    }

    public final DmNoticeProxy b() {
        return (DmNoticeProxy) this.f113753a.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(88, new g(c.class, "onUnder16RefreshEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void c() {
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void f() {
        cg.b(this);
    }

    static final class a extends m implements h.f.a.a<DmNoticeProxy> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113755a = new a();

        static {
            Covode.recordClassIndex(73129);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmNoticeProxy invoke() {
            return DmNoticeProxyImpl.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a() {
        b().b("notification_page");
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void bZ_() {
        b().a("notification_page");
    }

    private final void h() {
        if (com.ss.android.ugc.aweme.notice.api.b.b().isChatFunOfflineUnder16()) {
            View view = this.f113754b;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f113754b;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(e eVar) {
        l.d(eVar, "");
        h();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113756a;

        static {
            Covode.recordClassIndex(73130);
        }

        b(c cVar) {
            this.f113756a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.notice.api.b.b().shouldRedictToTipsPage()) {
                com.ss.android.ugc.aweme.notice.api.b.b().goToTipsPage();
                return;
            }
            IIMService a2 = a.C2916a.a();
            Context requireContext = this.f113756a.j().requireContext();
            l.b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            bundle.putString("notice_type", this.f113756a.b().c());
            bundle.putInt("message_cnt", this.f113756a.b().d());
            a2.openSessionListActivity(requireContext, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        MethodCollector.i(3388);
        l.d(view, "");
        if (!com.ss.android.ugc.aweme.notification.utils.l.a() && !com.ss.android.ugc.aweme.inbox.b.b.b()) {
            View dmEntranceView = IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(j().getContext(), "notification_page");
            this.f113754b = dmEntranceView;
            if (dmEntranceView != null) {
                dmEntranceView.setOnClickListener(new b(this));
                ((ViewGroup) c(R.id.dp_)).addView(dmEntranceView);
            }
        }
        h();
        MethodCollector.o(3388);
    }
}
