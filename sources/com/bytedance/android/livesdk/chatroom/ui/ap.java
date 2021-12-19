package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.n.ab;
import com.bytedance.android.live.n.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.m.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class ap extends al implements g {
    ScreenRecordStatusWidget n;
    private final i o = i.SCREEN_RECORD;
    private int p = -1;
    private LiveWidget q;
    private HashMap r;

    static {
        Covode.recordClassIndex(8790);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final View b(int i2) {
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.r.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void o() {
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        o();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final i h() {
        return this.o;
    }

    private final void c() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) b(R.id.chw);
        l.b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
    }

    private final void d() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) b(R.id.chw);
        l.b(liveLoadingView, "");
        liveLoadingView.setVisibility(8);
    }

    private final void p() {
        ScreenRecordStatusWidget screenRecordStatusWidget = this.n;
        if (screenRecordStatusWidget != null) {
            screenRecordStatusWidget.a(true);
        } else {
            p.b(b(R.id.cdz));
        }
    }

    private final void q() {
        ScreenRecordStatusWidget screenRecordStatusWidget = this.n;
        if (screenRecordStatusWidget != null) {
            screenRecordStatusWidget.a(false);
        } else {
            p.a(b(R.id.cdz));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final Object[] k() {
        return new Object[]{n.d(com.bytedance.android.live.p.l.SLOT, com.bytedance.android.live.p.l.CLOSE_ROOM, com.bytedance.android.live.p.l.MORE)};
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ap f15913a;

        static {
            Covode.recordClassIndex(8791);
        }

        a(ap apVar) {
            this.f15913a = apVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.e.a.a aVar = (com.bytedance.android.livesdk.e.a.a) obj;
            ap apVar = this.f15913a;
            l.b(aVar, "");
            apVar.onEvent(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        i().a((m) this, ab.class, (h.f.a.b) new b(this));
    }

    static final class b extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(8792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ap apVar) {
            super(1);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            ViewGroup.LayoutParams layoutParams;
            View view;
            boolean booleanValue = bool.booleanValue();
            ScreenRecordStatusWidget screenRecordStatusWidget = this.this$0.n;
            RelativeLayout.LayoutParams layoutParams2 = null;
            if (screenRecordStatusWidget == null || (view = screenRecordStatusWidget.getView()) == null) {
                layoutParams = null;
            } else {
                layoutParams = view.getLayoutParams();
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                layoutParams2 = layoutParams;
            }
            RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
            if (layoutParams3 != null) {
                if (booleanValue) {
                    layoutParams3.addRule(3, R.id.rc);
                } else {
                    layoutParams3.addRule(3, R.id.eoo);
                }
            }
            return z.f158842a;
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.e.a.a aVar) {
        int i2 = aVar.f17130a;
        if (i2 == 0) {
            q();
            c();
        } else if (i2 == 1) {
            d();
            p();
        } else if (i2 == 2) {
            ao.a(y.e(), (int) R.string.el1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void a(View view, Bundle bundle) {
        Boolean bool;
        super.a(view, bundle);
        this.n = new ScreenRecordStatusWidget();
        f().load(R.id.cdz, this.n);
        LiveWidget liveWidget = this.q;
        if (liveWidget != null) {
            bool = Boolean.valueOf(liveWidget.isShowing());
        } else {
            bool = null;
        }
        if (p.a(bool)) {
            b.a.a("livesdk_live_center_icon").a().f("show").b();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        int i2 = e.f23262a;
        this.p = i2;
        if (i2 == 1) {
            d();
            p();
        } else {
            q();
            c();
        }
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.e.a.a.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b90, viewGroup, false);
    }
}
