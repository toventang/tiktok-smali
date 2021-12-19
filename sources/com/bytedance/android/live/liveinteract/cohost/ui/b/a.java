package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.b.j;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class a extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final C0168a f10235a = new C0168a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private WaveEffectView f10236b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f10237c;

    static {
        Covode.recordClassIndex(5388);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f10237c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f10237c == null) {
            this.f10237c = new HashMap();
        }
        View view = (View) this.f10237c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f10237c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$a  reason: collision with other inner class name */
    public static final class C0168a {
        static {
            Covode.recordClassIndex(5389);
        }

        private C0168a() {
        }

        public /* synthetic */ C0168a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WaveEffectView waveEffectView = this.f10236b;
        if (waveEffectView != null) {
            waveEffectView.b();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b65);
        bVar.f22375b = R.style.a29;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    static final class b extends m implements h.f.a.b<z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
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

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10238a;

        static {
            Covode.recordClassIndex(5392);
        }

        d(a aVar) {
            this.f10238a = aVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f10238a.p;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.a.class);
            }
            h.a(b.a.a().p, "popup", "withdraw");
            this.f10238a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10239a;

        static {
            Covode.recordClassIndex(5393);
        }

        e(a aVar) {
            this.f10239a = aVar;
        }

        public final void onClick(View view) {
            this.f10239a.dismiss();
            h.a(b.a.a().p, "popup", "keep_waiting");
        }
    }

    static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue <= 0) {
                this.this$0.dismiss();
            } else if (this.this$0.a_(R.id.eyk) != null) {
                LiveTextView liveTextView = (LiveTextView) this.this$0.a_(R.id.eyk);
                l.b(liveTextView, "");
                liveTextView.setText(com.bytedance.android.livesdk.utils.h.a(this.this$0.getString(R.string.dyb), String.valueOf(intValue)));
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ImageModel imageModel;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a(com.bytedance.android.live.liveinteract.cohost.a.b.h.class, (h.f.a.b) new b(this)).a(j.class, (h.f.a.b) new c(this));
        }
        WaveEffectView waveEffectView = (WaveEffectView) view.findViewById(R.id.es3);
        this.f10236b = waveEffectView;
        if (waveEffectView != null) {
            waveEffectView.a();
        }
        LiveTextView liveTextView = (LiveTextView) a_(R.id.f3f);
        l.b(liveTextView, "");
        User user = b.a.a().T;
        if (user == null || (str = user.displayId) == null) {
            str = "";
        }
        liveTextView.setText(str);
        User user2 = b.a.a().T;
        if (!(user2 == null || user2.getAvatarThumb() == null)) {
            List<String> list = user2.getAvatarThumb().mUrls;
            l.b(list, "");
            if (!list.isEmpty()) {
                ImageView imageView = (ImageView) a_(R.id.es2);
                User user3 = b.a.a().T;
                if (user3 != null) {
                    imageModel = user3.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                VHeadView vHeadView = (VHeadView) a_(R.id.es2);
                l.b(vHeadView, "");
                int width = vHeadView.getWidth();
                VHeadView vHeadView2 = (VHeadView) a_(R.id.es2);
                l.b(vHeadView2, "");
                g.a(imageView, imageModel, width, vHeadView2.getHeight(), 2131234424);
                ((LiveButton) a_(R.id.ewg)).setOnClickListener(new d(this));
                ((LiveButton) a_(R.id.eyq)).setOnClickListener(new e(this));
                com.bytedance.android.live.liveinteract.api.m mVar = b.a.a().p;
                HashMap hashMap = new HashMap();
                hashMap.put("invitee_list", w.a(mVar));
                hashMap.put("enter_from", b.a.a().V);
                hashMap.put("event_type", String.valueOf(b.a.a().p.getType()));
                h.a("cancel_connection_popup_show", hashMap);
            }
        }
        p.a((ImageView) a_(R.id.es2), 2131234424, -1, -1);
        ((LiveButton) a_(R.id.ewg)).setOnClickListener(new d(this));
        ((LiveButton) a_(R.id.eyq)).setOnClickListener(new e(this));
        com.bytedance.android.live.liveinteract.api.m mVar2 = b.a.a().p;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("invitee_list", w.a(mVar2));
        hashMap2.put("enter_from", b.a.a().V);
        hashMap2.put("event_type", String.valueOf(b.a.a().p.getType()));
        h.a("cancel_connection_popup_show", hashMap2);
    }
}
