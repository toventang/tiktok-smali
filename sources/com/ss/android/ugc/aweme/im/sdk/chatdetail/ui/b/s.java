package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public abstract class s extends com.airbnb.epoxy.s<View> {

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.a<z> f101765h;

    static {
        Covode.recordClassIndex(65052);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a86;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f101766a;

        static {
            Covode.recordClassIndex(65053);
        }

        a(s sVar) {
            this.f101766a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f101766a.f101765h;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.airbnb.epoxy.s
    public final /* synthetic */ void a(View view) {
        View view2 = view;
        l.d(view2, "");
        super.a(view2);
        view2.setOnClickListener(new a(this));
    }
}
