package com.bytedance.android.livesdk.qa;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class ay extends v {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f20423a;

    static {
        Covode.recordClassIndex(12063);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20423a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20423a == null) {
            this.f20423a = new HashMap();
        }
        View view = (View) this.f20423a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20423a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.bdn);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ay f20424a;

        static {
            Covode.recordClassIndex(12065);
        }

        b(ay ayVar) {
            this.f20424a = ayVar;
        }

        public final void onClick(View view) {
            this.f20424a.dismiss();
        }
    }

    static final class a extends m implements h.f.a.b<z, z> {
        final /* synthetic */ ay this$0;

        static {
            Covode.recordClassIndex(12064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ay ayVar) {
            super(1);
            this.this$0 = ayVar;
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

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (!(dataChannel == null || (bool = (Boolean) dataChannel.b(ee.class)) == null || bool.booleanValue())) {
            LiveTextView liveTextView = (LiveTextView) a_(R.id.title);
            if (liveTextView != null) {
                liveTextView.setText(R.string.ejl);
            }
            LiveTextView liveTextView2 = (LiveTextView) a_(R.id.adh);
            if (liveTextView2 != null) {
                liveTextView2.setText(R.string.eji);
            }
        }
        LiveButton liveButton = (LiveButton) a_(R.id.ayx);
        if (liveButton != null) {
            liveButton.setOnClickListener(new b(this));
        }
    }
}
