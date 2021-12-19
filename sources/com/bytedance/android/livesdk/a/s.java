package com.bytedance.android.livesdk.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.livesdk.chatroom.c.y;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.s.k;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;

public final class s extends com.bytedance.android.livesdk.ui.a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f13360a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f13361b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f13362c;

    static {
        Covode.recordClassIndex(7443);
    }

    private View a(int i2) {
        if (this.f13362c == null) {
            this.f13362c = new HashMap();
        }
        View view = (View) this.f13362c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13362c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    private final void b() {
        ((LiveSwitch) a(R.id.aal)).setOnCheckedChangeListener(this);
        ((LiveSwitch) a(R.id.bbt)).setOnCheckedChangeListener(this);
    }

    private final void c() {
        ((LiveSwitch) a(R.id.aal)).setOnCheckedChangeListener(null);
        ((LiveSwitch) a(R.id.bbt)).setOnCheckedChangeListener(null);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f.a.b.b bVar = this.f13361b;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroyView();
        HashMap hashMap = this.f13362c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r0.booleanValue() != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.a.s.a():void");
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f13363a;

        static {
            Covode.recordClassIndex(7444);
        }

        a(s sVar) {
            this.f13363a = sVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f13363a.a();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f13364a;

        static {
            Covode.recordClassIndex(7445);
        }

        b(s sVar) {
            this.f13364a = sVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13364a);
            if (a2 != null) {
                a2.b(r.class, com.bytedance.android.livesdk.j.s.a(q.GUIDE));
            }
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f13365a;

        static {
            Covode.recordClassIndex(7446);
        }

        c(s sVar) {
            this.f13365a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.b(this.f13365a.getContext());
            dialogInterface.dismiss();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f13366a;

        static {
            Covode.recordClassIndex(7447);
        }

        d(s sVar) {
            this.f13366a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f13366a.a();
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a();
        ((LinearLayout) a(R.id.dqa)).setOnClickListener(new b(this));
        this.f13361b = com.bytedance.android.livesdk.an.a.a().a(y.class).d(new a(this));
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (l.a(compoundButton, a(R.id.aal))) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ah;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(z));
        } else if (l.a(compoundButton, a(R.id.bbt))) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ai;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, Boolean.valueOf(z));
        }
        if (z && !k.a(getContext())) {
            if (this.f13360a == null) {
                com.bytedance.android.livesdk.l.b a2 = new b.a(getContext()).a(R.string.ek5).b(R.string.ek4).a(R.string.ek2, (DialogInterface.OnClickListener) new c(this), false).b(R.string.ek1, (DialogInterface.OnClickListener) new d(this), false).a();
                a2.setCanceledOnTouchOutside(false);
                this.f13360a = a2;
            }
            p.a(this.f13360a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b8b, viewGroup, false);
    }
}
