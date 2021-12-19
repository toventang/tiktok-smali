package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.BadgeTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends RecyclerView.ViewHolder implements com.ss.android.ugc.aweme.inbox.widget.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2540a f101927d = new C2540a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f101928a;

    /* renamed from: b  reason: collision with root package name */
    public final BadgeTextView f101929b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a f101930c;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.inbox.widget.b f101931e;

    static {
        Covode.recordClassIndex(65222);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a$a  reason: collision with other inner class name */
    public static final class C2540a {
        static {
            Covode.recordClassIndex(65223);
        }

        private C2540a() {
        }

        public /* synthetic */ C2540a(byte b2) {
            this();
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101933b;

        static {
            Covode.recordClassIndex(65224);
        }

        public b(a aVar, b bVar) {
            this.f101932a = aVar;
            this.f101933b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101932a.f101930c.a(this.f101933b.q);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.a
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (!l.a(this.f101931e, bVar)) {
            this.f101931e = bVar;
            if (bVar.f104373a != -1) {
                View view = this.itemView;
                l.b(view, "");
                View view2 = this.itemView;
                l.b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = bVar.f104373a;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a aVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        this.f101930c = aVar;
        View findViewById = view.findViewById(R.id.c2j);
        l.b(findViewById, "");
        this.f101928a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f_4);
        l.b(findViewById2, "");
        this.f101929b = (BadgeTextView) findViewById2;
        v.a(view);
    }
}
