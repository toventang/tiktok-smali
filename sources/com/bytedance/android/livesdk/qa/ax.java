package com.bytedance.android.livesdk.qa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class ax extends v {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f20416a;

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f20422a = new e();

        static {
            Covode.recordClassIndex(12062);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12055);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20416a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20416a == null) {
            this.f20416a = new HashMap();
        }
        View view = (View) this.f20416a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20416a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8k);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    public final void d() {
        long j2;
        if (com.bytedance.android.live.m.c.b(this.p)) {
            b.a.a("livesdk_anchor_qa_entrance_close").a(this.p).b();
        }
        QAApi qAApi = (QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class);
        if (com.bytedance.android.live.m.c.b(this.p)) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        qAApi.switchOn(j2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new d(this), e.f20422a);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f20420a;

        static {
            Covode.recordClassIndex(12060);
        }

        c(ax axVar) {
            this.f20420a = axVar;
        }

        public final void onClick(View view) {
            this.f20420a.dismiss();
        }
    }

    static final class a extends m implements h.f.a.b<z, z> {
        final /* synthetic */ ax this$0;

        static {
            Covode.recordClassIndex(12056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ax axVar) {
            super(1);
            this.this$0 = axVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.a.class, (h.f.a.b) new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f20421a;

        static {
            Covode.recordClassIndex(12061);
        }

        d(ax axVar) {
            this.f20421a = axVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            aa.a(this.f20421a.p, !com.bytedance.android.live.m.c.b(this.f20421a.p));
            DataChannel dataChannel = this.f20421a.p;
            if (dataChannel != null) {
                dataChannel.c(a.class);
            }
            if (!com.bytedance.android.live.m.c.b(this.f20421a.p)) {
                ao.a(y.e(), (int) R.string.eo4);
            }
            this.f20421a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f20417a;

        static {
            Covode.recordClassIndex(12057);
        }

        b(ax axVar) {
            this.f20417a = axVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cf;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (!a2.booleanValue() || !com.bytedance.android.live.m.c.b(this.f20417a.p)) {
                this.f20417a.d();
                return;
            }
            this.f20417a.dismiss();
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cf;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
            b.a aVar = new b.a(this.f20417a.getContext());
            aVar.f18296m = true;
            aVar.a(R.string.ep1).b(R.string.ep2).a(R.string.ep1, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.bytedance.android.livesdk.qa.ax.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f20418a;

                static {
                    Covode.recordClassIndex(12058);
                }

                {
                    this.f20418a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f20418a.f20417a.d();
                    dialogInterface.dismiss();
                }
            }, false).b(R.string.gle, (DialogInterface.OnClickListener) AnonymousClass2.f20419a, false).a().show();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (com.bytedance.android.live.m.c.b(this.p)) {
            ((LiveTextView) a_(R.id.etx)).setText(R.string.ep1);
        } else {
            ((LiveTextView) a_(R.id.etx)).setText(R.string.ep8);
        }
        ((LiveTextView) a_(R.id.etx)).setOnClickListener(new b(this));
        ((LiveTextView) a_(R.id.a1p)).setOnClickListener(new c(this));
    }
}
