package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class g extends com.bytedance.android.live.liveinteract.multilive.e.a {
    static {
        Covode.recordClassIndex(6339);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f11654a;

        static {
            Covode.recordClassIndex(6341);
        }

        b(g gVar) {
            this.f11654a = gVar;
        }

        public final void onClick(View view) {
            this.f11654a.a(1);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f11655a;

        static {
            Covode.recordClassIndex(6342);
        }

        c(g gVar) {
            this.f11655a = gVar;
        }

        public final void onClick(View view) {
            this.f11655a.a(2);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f11656a;

        static {
            Covode.recordClassIndex(6343);
        }

        d(g gVar) {
            this.f11656a = gVar;
        }

        public final void onClick(View view) {
            this.f11656a.a(3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    public final void a(int i2) {
        this.f11788i.c(com.bytedance.android.live.liveinteract.multilive.anchor.b.b.class, new com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a(i2));
    }

    static final class a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(6340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            View view;
            boolean booleanValue = bool.booleanValue();
            g gVar = this.this$0;
            FrameLayout e2 = gVar.e();
            if (e2 == null || e2.getChildCount() != 0) {
                FrameLayout e3 = gVar.e();
                if (e3 != null) {
                    view = e3.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof com.bytedance.android.live.liveinteract.multilive.e.d) {
                    ((com.bytedance.android.live.liveinteract.multilive.e.d) view).a(Boolean.valueOf(booleanValue));
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public void a(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        l.d(viewGroup, "");
        super.a(viewGroup);
        l();
        this.f11788i.a(this, com.bytedance.android.live.liveinteract.multilive.c.c.class, new a(this));
        if ((this instanceof a) || (this instanceof c)) {
            ViewGroup viewGroup2 = this.f11783d;
            if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.avx)) == null)) {
                frameLayout3.setOnClickListener(new b(this));
            }
            ViewGroup viewGroup3 = this.f11783d;
            if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.avy)) == null)) {
                frameLayout2.setOnClickListener(new c(this));
            }
            ViewGroup viewGroup4 = this.f11783d;
            if (viewGroup4 != null && (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.avz)) != null) {
                frameLayout.setOnClickListener(new d(this));
            }
        }
    }
}
