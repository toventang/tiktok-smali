package com.ss.android.ugc.aweme.comment.page.tag;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public final class m {
    static {
        Covode.recordClassIndex(44552);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f72271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f72272b;

        static {
            Covode.recordClassIndex(44553);
        }

        public a(l lVar, h.f.a.a aVar) {
            this.f72271a = lVar;
            this.f72272b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72271a.setCloseType("delete");
            this.f72272b.invoke();
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f72273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f72274b;

        static {
            Covode.recordClassIndex(44554);
        }

        public b(l lVar, h.f.a.a aVar) {
            this.f72273a = lVar;
            this.f72274b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72273a.setCloseType("confirm");
            this.f72274b.invoke();
        }
    }
}
