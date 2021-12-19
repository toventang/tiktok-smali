package com.bytedance.android.livesdk.qa;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.view.c;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aw implements f {

    /* renamed from: a  reason: collision with root package name */
    private View f20411a;

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f20412b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20413c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f20414d;

    static {
        Covode.recordClassIndex(12053);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f20415a;

        static {
            Covode.recordClassIndex(12054);
        }

        a(aw awVar) {
            this.f20415a = awVar;
        }

        @Override // com.bytedance.android.live.design.view.c
        public final void a() {
            b.a.a("livesdk_qa_guide_show").a().c("show").b();
        }
    }

    public aw(Context context) {
        l.d(context, "");
        this.f20414d = context;
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
        if (z && this.f20413c) {
            b.a.a("livesdk_anchor_qa_red_dot_show").a().b();
        }
    }

    public final void onClick(View view) {
        l.d(view, "");
        DataChannel dataChannel = this.f20412b;
        if (dataChannel == null) {
            l.a("mDataChannel");
        }
        aa.a(dataChannel, "qa_entrance");
        if (this.f20413c) {
            com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.QUESTION;
            DataChannel dataChannel2 = this.f20412b;
            if (dataChannel2 == null) {
                l.a("mDataChannel");
            }
            b.a.a("livesdk_anchor_qa_entrance_click").a("has_red_dot", lVar.isRedDotShowing(dataChannel2) ? 1 : 0).a().b();
            return;
        }
        b.a.a("livesdk_qa_entrance_click").a().b();
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        l.d(dataChannel, "");
        av.f20409c = null;
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        this.f20412b = dataChannel;
        Object b2 = dataChannel.b(ee.class);
        if (b2 == null) {
            l.b();
        }
        boolean booleanValue = ((Boolean) b2).booleanValue();
        this.f20413c = booleanValue;
        this.f20411a = view;
        if (booleanValue) {
            com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.QUESTION;
            DataChannel dataChannel2 = this.f20412b;
            if (dataChannel2 == null) {
                l.a("mDataChannel");
            }
            b.a.a("livesdk_anchor_qa_entrance_show").a("has_red_dot", lVar.isRedDotShowing(dataChannel2) ? 1 : 0).a().b();
            return;
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.aR;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.aR;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
            View view2 = this.f20411a;
            if (view2 == null) {
                l.a("mView");
            }
            a.C0140a aVar = new a.C0140a(view2);
            aVar.f9423a = y.a((int) R.string.dwj);
            j.a(((a.C0140a) aVar.a(new a(this))).b());
        }
        if (!com.bytedance.android.live.m.c.b(dataChannel)) {
            com.bytedance.android.live.p.l.QUESTION.unload(dataChannel);
        } else if (!this.f20413c) {
            b.a.a("livesdk_qa_entrance_show").a().b();
        }
    }
}
