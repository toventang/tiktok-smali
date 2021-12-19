package com.bytedance.android.live.p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class n extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12166a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<l> f12167b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f12168c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f12169d;

    static {
        Covode.recordClassIndex(6679);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f12169d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f12169d == null) {
            this.f12169d = new HashMap();
        }
        View view = (View) this.f12169d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f12169d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6680);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7j);
        bVar.f22374a = 2;
        bVar.f22375b = R.style.a2m;
        bVar.f22380g = 80;
        bVar.f22383j = 50;
        return bVar;
    }

    static final class b extends m implements h.f.a.b<z, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(6681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(1);
            this.this$0 = nVar;
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

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        o.POPUP.release(this.p);
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12168c.a((androidx.lifecycle.m) this, d.class, (h.f.a.b) new b(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.p.l> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(List<? extends l> list, DataChannel dataChannel) {
        l.d(list, "");
        l.d(dataChannel, "");
        this.f12167b = list;
        this.f12168c = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        o oVar = o.POPUP;
        DataChannel dataChannel = this.f12168c;
        LinearLayout linearLayout = (LinearLayout) a_(R.id.ene);
        if (linearLayout != null) {
            oVar.createHolder(dataChannel, linearLayout, this.f12167b, q.ICON_TITLE_HORIZONTAL);
        }
    }
}
