package com.bytedance.android.live.publicscreen.impl.widget.b;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.f.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.publicscreen.impl.model.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f12564a;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f12565d;

    static {
        Covode.recordClassIndex(6910);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        l.d(view, "");
        this.f12564a = (TextView) view.findViewById(R.id.e0t);
        this.f12565d = (TextView) view.findViewById(R.id.e0_);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f12567b;

        static {
            Covode.recordClassIndex(6911);
        }

        a(f fVar, g gVar) {
            this.f12566a = fVar;
            this.f12567b = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
            r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r6.b(com.bytedance.android.livesdk.j.df.class);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.android.live.publicscreen.a.g r0 = r7.f12567b
                com.bytedance.ies.sdk.datachannel.DataChannel r6 = r0.f12208l
                if (r6 != 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.Class<com.bytedance.android.livesdk.j.df> r0 = com.bytedance.android.livesdk.j.df.class
                java.lang.Object r5 = r6.b(r0)
                com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
                if (r5 != 0) goto L_0x0012
                return
            L_0x0012:
                com.bytedance.android.livesdkapi.depend.e.c$a r0 = com.bytedance.android.livesdkapi.depend.e.c.a(r5)
                com.bytedance.android.livesdkapi.depend.e.c r4 = r0.a()
                java.lang.Class<com.bytedance.android.live.share.c> r0 = com.bytedance.android.live.share.c.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.t.a.a(r0)
                com.bytedance.android.live.share.c r0 = (com.bytedance.android.live.share.c) r0
                com.bytedance.android.live.share.a r2 = r0.share()
                com.bytedance.android.live.publicscreen.impl.widget.b.f r0 = r7.f12566a
                android.view.View r0 = r0.itemView
                java.lang.String r3 = ""
                h.f.b.l.b(r0, r3)
                android.content.Context r0 = r0.getContext()
                androidx.fragment.app.e r1 = com.bytedance.android.livesdk.utils.p.a(r0)
                com.bytedance.android.live.publicscreen.impl.widget.b.f$a$1 r0 = new com.bytedance.android.live.publicscreen.impl.widget.b.f$a$1
                r0.<init>(r7, r5, r6)
                r2.a(r1, r4, r0)
                java.lang.String r0 = "livesdk_share_capsule_click"
                com.bytedance.android.livesdk.ab.b r0 = com.bytedance.android.livesdk.ab.b.a.a(r0)
                com.bytedance.android.livesdk.ab.b r2 = r0.a(r6)
                java.lang.Class<com.bytedance.android.live.liveinteract.api.b> r0 = com.bytedance.android.live.liveinteract.api.b.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.t.a.a(r0)
                h.f.b.l.b(r0, r3)
                com.bytedance.android.live.liveinteract.api.b r0 = (com.bytedance.android.live.liveinteract.api.b) r0
                java.lang.String r1 = r0.getRoomScene()
                java.lang.String r0 = "share_capsule_scence"
                com.bytedance.android.livesdk.ab.b r0 = r2.a(r0, r1)
                r0.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.b.f.a.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, h hVar) {
        k kVar = (k) hVar;
        l.d(gVar, "");
        l.d(kVar, "");
        TextView textView = this.f12564a;
        if (textView != null && this.f12565d != null) {
            textView.setText(kVar.z());
            this.f12565d.setOnClickListener(new a(this, gVar));
        }
    }
}
