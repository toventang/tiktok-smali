package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.r.j;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class a extends v {

    /* renamed from: a  reason: collision with root package name */
    public j.a f22678a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22679b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f22680c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    private HashMap f22681d;

    static {
        Covode.recordClassIndex(13379);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f22681d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f22681d == null) {
            this.f22681d = new HashMap();
        }
        View view = (View) this.f22681d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f22681d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.f22679b) {
            j.a(false);
        }
        this.f22680c.a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        int i3;
        if (this.p != null) {
            DataChannel dataChannel = this.p;
            if (dataChannel == null) {
                l.b();
            }
            Object b2 = dataChannel.b(cp.class);
            if (b2 == null) {
                l.b();
            }
            if (!((Boolean) b2).booleanValue()) {
                i3 = R.layout.b6f;
                i2 = 5;
                v.b bVar = new v.b(i3);
                bVar.f22375b = R.style.a2w;
                bVar.f22385l = 48;
                bVar.f22380g = i2;
                return bVar;
            }
        }
        i3 = R.layout.b6e;
        i2 = 17;
        v.b bVar2 = new v.b(i3);
        bVar2.f22375b = R.style.a2w;
        bVar2.f22385l = 48;
        bVar2.f22380g = i2;
        return bVar2;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        Window window;
        super.onStart();
        if (this.p != null) {
            DataChannel dataChannel = this.p;
            if (dataChannel == null) {
                l.b();
            }
            Object b2 = dataChannel.b(cp.class);
            if (b2 == null) {
                l.b();
            }
            boolean booleanValue = ((Boolean) b2).booleanValue();
            if (!booleanValue || !com.bytedance.android.live.core.f.d.a(getContext())) {
                z = false;
            } else {
                z = true;
            }
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (!booleanValue || !com.bytedance.android.live.core.f.d.a(getContext())) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
                if (z) {
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = y.c();
                    attributes.height = y.b() - y.d();
                    window.setAttributes(attributes);
                } else {
                    window.setLayout(-1, -1);
                }
            }
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.gift.j());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0494a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22682a;

        static {
            Covode.recordClassIndex(13380);
        }

        View$OnClickListenerC0494a(a aVar) {
            this.f22682a = aVar;
        }

        public final void onClick(View view) {
            this.f22682a.dismissAllowingStateLoss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22685a;

        static {
            Covode.recordClassIndex(13382);
        }

        c(a aVar) {
            this.f22685a = aVar;
        }

        public final void onClick(View view) {
            this.f22685a.dismissAllowingStateLoss();
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22686a;

        static {
            Covode.recordClassIndex(13383);
        }

        d(a aVar) {
            this.f22686a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f22686a.dismissAllowingStateLoss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22684b;

        static {
            Covode.recordClassIndex(13381);
        }

        b(u uVar, a aVar) {
            this.f22683a = uVar;
            this.f22684b = aVar;
        }

        public final void onClick(View view) {
            j.a aVar = this.f22684b.f22678a;
            if (aVar != null) {
                aVar.a();
            }
            this.f22684b.f22679b = true;
            j.a(true);
            this.f22684b.dismissAllowingStateLoss();
            long j2 = this.f22683a.f19761d;
            com.bytedance.android.livesdk.ap.b<Set<String>> bVar = com.bytedance.android.livesdk.ap.a.W;
            l.b(bVar, "");
            Set<String> a2 = bVar.a();
            if (a2 == null) {
                a2 = new HashSet<>();
            }
            a2.add(String.valueOf(j2));
            com.bytedance.android.livesdk.ap.b<Set<String>> bVar2 = com.bytedance.android.livesdk.ap.a.W;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, a2);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j2;
        String str;
        Room room;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        GiftManager inst = GiftManager.inst();
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getId();
        }
        u fastGift = inst.getFastGift(j2);
        if (fastGift != null) {
            p.b((ImageView) a_(R.id.b0c), fastGift.f19759b);
            LiveTextView liveTextView = (LiveTextView) a_(R.id.b0d);
            l.b(liveTextView, "");
            liveTextView.setText(fastGift.f19758a);
            LiveTextView liveTextView2 = (LiveTextView) a_(R.id.bbj);
            l.b(liveTextView2, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.ejw, Integer.valueOf(fastGift.f19763f));
            } else {
                str = null;
            }
            liveTextView2.setText(str);
            ((ImageView) a_(R.id.a1r)).setOnClickListener(new View$OnClickListenerC0494a(this));
            ((LiveTextView) a_(R.id.bbj)).setOnClickListener(new b(fastGift, this));
        }
        ((ConstraintLayout) a_(R.id.amz)).setOnClickListener(new c(this));
        this.f22680c.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.widgets.giftwidget.a.a.class).d(new d(this)));
    }
}
