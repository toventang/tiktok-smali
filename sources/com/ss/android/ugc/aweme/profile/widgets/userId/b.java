package com.ss.android.ugc.aweme.profile.widgets.userId;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.d.e;
import com.ss.android.ugc.aweme.setting.d.f;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends com.bytedance.assem.arch.d.a implements i, j {

    /* renamed from: j  reason: collision with root package name */
    public User f118109j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f118110k;

    static {
        Covode.recordClassIndex(76700);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(214, new g(b.class, "onSwitchToCreatorAccount", f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(215, new g(b.class, "onSwitchToBusinessAccount", e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(216, new g(b.class, "onSwitchToPersonalAccount", com.ss.android.ugc.aweme.setting.d.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        cg.a(this);
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        cg.b(this);
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(f fVar) {
        l.d(fVar, "");
        s().setVisibility(8);
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(com.ss.android.ugc.aweme.setting.d.b bVar) {
        l.d(bVar, "");
        s().setVisibility(8);
    }

    static final class a extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (aVar2 != null) {
                t = aVar2.f25631b;
            } else {
                t = null;
            }
            this.this$0.f118109j = t;
            this.this$0.a((User) t);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        this.f118110k = (TextView) view;
        d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), c.f118111a, new a(this));
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(e eVar) {
        l.d(eVar, "");
        s().setVisibility(0);
        a(this.f118109j);
    }

    public final void a(User user) {
        if (user != null) {
            com.ss.android.ugc.aweme.commerce.d bizAccountInfo = user.getBizAccountInfo();
            if (bizAccountInfo == null || !bizAccountInfo.enableShowCategory()) {
                TextView textView = this.f118110k;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView2 = this.f118110k;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f118110k;
            if (textView3 != null) {
                textView3.setText(user.getCategory());
            }
        }
    }
}
