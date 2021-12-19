package com.bytedance.android.livesdk.guide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideDialogDurationSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.b.a;
import com.bytedance.android.livesdk.w;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class a extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    long f18081a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.livesdk.model.message.c.b f18082b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f18083c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC0378a f18084d;

    /* renamed from: e  reason: collision with root package name */
    private View f18085e;

    /* renamed from: f  reason: collision with root package name */
    private View f18086f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f18087g;

    /* renamed from: h  reason: collision with root package name */
    private LiveTextView f18088h;

    /* renamed from: i  reason: collision with root package name */
    private LiveTextView f18089i;

    /* renamed from: j  reason: collision with root package name */
    private final f.a.b.a f18090j = new f.a.b.a();

    /* renamed from: k  reason: collision with root package name */
    private HashMap f18091k;

    /* renamed from: com.bytedance.android.livesdk.guide.a$a  reason: collision with other inner class name */
    public interface AbstractC0378a {
        static {
            Covode.recordClassIndex(10028);
        }

        void a();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f18094a = new d();

        static {
            Covode.recordClassIndex(10031);
        }

        d() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(10027);
    }

    private View a(int i2) {
        if (this.f18091k == null) {
            this.f18091k = new HashMap();
        }
        View view = (View) this.f18091k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f18091k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f18091k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f18090j.a();
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18092a;

        static {
            Covode.recordClassIndex(10029);
        }

        b(a aVar) {
            this.f18092a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.service.c.b.a.b(a.EnumC0459a.TIME_UP);
            AbstractC0378a aVar = this.f18092a.f18084d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18093a;

        static {
            Covode.recordClassIndex(10030);
        }

        c(a aVar) {
            this.f18093a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.service.c.b.a.b(a.EnumC0459a.USER_CLOSE);
            AbstractC0378a aVar = this.f18093a.f18084d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18095a;

        static {
            Covode.recordClassIndex(10032);
        }

        e(a aVar) {
            this.f18095a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.service.c.b.a.b(a.EnumC0459a.USER_CLOSE);
            AbstractC0378a aVar = this.f18095a.f18084d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18096a;

        static {
            Covode.recordClassIndex(10033);
        }

        f(a aVar) {
            this.f18096a = aVar;
        }

        public final void onClick(View view) {
            Room room;
            boolean z;
            a aVar = this.f18096a;
            b.a.a("gift_guide_popup_send_click").a("gift_id", aVar.f18081a).a().b();
            u findGiftById = GiftManager.inst().findGiftById(aVar.f18081a);
            if (findGiftById != null) {
                DataChannel dataChannel = aVar.f18083c;
                User user = null;
                if (dataChannel != null) {
                    room = (Room) dataChannel.b(df.class);
                } else {
                    room = null;
                }
                GiftDialogViewModel.a aVar2 = GiftDialogViewModel.a.GIFT;
                long j2 = aVar.f18081a;
                boolean z2 = false;
                if (findGiftById.f19762e == 1 || findGiftById.f19762e == 5 || findGiftById.f19762e == 10) {
                    z = false;
                } else {
                    z = true;
                }
                com.bytedance.android.livesdk.service.b.d dVar = new com.bytedance.android.livesdk.service.b.d(aVar2, j2, z);
                if (findGiftById.f19762e != 1) {
                    z2 = true;
                }
                dVar.f21295k = z2;
                dVar.o = "click";
                dVar.q = findGiftById.J;
                dVar.f21290f = findGiftById.f19763f;
                dVar.p = "0";
                if (room != null) {
                    user = room.getOwner();
                }
                dVar.f21293i = user;
                dVar.f21294j = "gift_guide_popup";
                DataChannel dataChannel2 = aVar.f18083c;
                if (dataChannel2 != null) {
                    dataChannel2.c(az.class, dVar);
                }
                AbstractC0378a aVar3 = aVar.f18084d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
            com.bytedance.android.livesdk.service.c.b.a.b(a.EnumC0459a.SEND);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageModel imageModel;
        String str;
        Resources resources;
        Drawable drawable;
        com.bytedance.android.live.base.model.user.b a2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.amz).setOnClickListener(new c(this));
        view.findViewById(R.id.fme).setOnClickListener(d.f18094a);
        View findViewById = view.findViewById(R.id.ah9);
        this.f18085e = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new e(this));
        }
        this.f18086f = view.findViewById(R.id.dyh);
        ((LinearLayout) a(R.id.dyi)).setOnClickListener(new f(this));
        this.f18087g = (ImageView) view.findViewById(R.id.bb7);
        this.f18088h = (LiveTextView) view.findViewById(R.id.fe3);
        this.f18089i = (LiveTextView) view.findViewById(R.id.akp);
        u findGiftById = GiftManager.inst().findGiftById(this.f18081a);
        ImageView imageView = this.f18087g;
        com.bytedance.android.livesdk.widget.f fVar = null;
        if (findGiftById != null) {
            imageModel = findGiftById.f19759b;
        } else {
            imageModel = null;
        }
        p.b(imageView, imageModel);
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        if (b2 == null || (a2 = b2.a()) == null || (str = a2.getDisplayId()) == null) {
            str = "";
        }
        String a3 = y.a((int) R.string.e47, str);
        LiveTextView liveTextView = this.f18088h;
        if (liveTextView != null) {
            liveTextView.setText(a3);
        }
        CharSequence a4 = w.a(this.f18082b);
        LiveTextView liveTextView2 = this.f18089i;
        if (liveTextView2 != null) {
            liveTextView2.setText(a4.toString());
        }
        this.f18090j.a(t.b((long) LiveGuideDialogDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this)));
        if (findGiftById != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context = getContext();
            if (!(context == null || (resources = context.getResources()) == null || (drawable = resources.getDrawable(2131234643)) == null)) {
                drawable.setBounds(0, 0, y.a(11.0f), y.a(11.0f));
                fVar = new com.bytedance.android.livesdk.widget.f(drawable);
            }
            if (y.g()) {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.f19763f));
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) ")");
            } else {
                spannableStringBuilder.append((CharSequence) "(");
                spannableStringBuilder.append((CharSequence) ".");
                spannableStringBuilder.append((CharSequence) String.valueOf(findGiftById.f19763f));
                spannableStringBuilder.append((CharSequence) ")");
            }
            int a5 = h.m.p.a((CharSequence) spannableStringBuilder, ".", 0, false, 6);
            spannableStringBuilder.setSpan(fVar, a5, a5 + 1, 33);
            LiveTextView liveTextView3 = (LiveTextView) a(R.id.dyj);
            l.b(liveTextView3, "");
            liveTextView3.setText(spannableStringBuilder);
        }
        b.a.a("gift_guide_popup_show").a().a("gift_id", this.f18081a).b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b6m, viewGroup, false);
    }
}
