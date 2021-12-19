package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.d;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.dn;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class r extends a {

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f91862b;

    /* renamed from: c  reason: collision with root package name */
    final d f91863c;

    /* renamed from: d  reason: collision with root package name */
    final d f91864d;

    /* renamed from: e  reason: collision with root package name */
    k f91865e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f91866f;

    /* renamed from: g  reason: collision with root package name */
    private final SimpleDraweeView f91867g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f91868h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f91869i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f91870j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveCircleView f91871k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveCircleView f91872l;

    /* renamed from: m  reason: collision with root package name */
    private List<k> f91873m;

    static {
        Covode.recordClassIndex(57827);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f91874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f91875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f91876c;

        static {
            Covode.recordClassIndex(57828);
        }

        a(r rVar, k kVar, List list) {
            this.f91874a = rVar;
            this.f91875b = kVar;
            this.f91876c = list;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(this.f91874a.itemView, 1200)) {
                r rVar = this.f91874a;
                View view2 = rVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l.b(context, "");
                rVar.a(context, this.f91875b, this.f91876c, this.f91874a.f91862b.getWidth(), this.f91874a.f91862b.getHeight());
            }
        }
    }

    private static SlimRoom a(k kVar) {
        if (kVar.getSlimRoom() != null) {
            return kVar.getSlimRoom();
        }
        String str = kVar.getUser().roomData;
        l.b(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            kVar.setSlimRoom((SlimRoom) dg.a(str, SlimRoom.class));
            return kVar.getSlimRoom();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(View view) {
        super(view);
        l.d(view, "");
        Context context = view.getContext();
        l.b(context, "");
        this.f91866f = context;
        View findViewById = view.findViewById(R.id.bw0);
        l.b(findViewById, "");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById;
        this.f91867g = simpleDraweeView;
        View findViewById2 = view.findViewById(R.id.bvx);
        l.b(findViewById2, "");
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) findViewById2;
        this.f91862b = simpleDraweeView2;
        View findViewById3 = view.findViewById(R.id.f3c);
        l.b(findViewById3, "");
        this.f91868h = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bjg);
        l.b(findViewById4, "");
        this.f91869i = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f4p);
        l.b(findViewById5, "");
        this.f91870j = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.byr);
        l.b(findViewById6, "");
        LiveCircleView liveCircleView = (LiveCircleView) findViewById6;
        this.f91871k = liveCircleView;
        View findViewById7 = view.findViewById(R.id.byq);
        l.b(findViewById7, "");
        LiveCircleView liveCircleView2 = (LiveCircleView) findViewById7;
        this.f91872l = liveCircleView2;
        d dVar = new d(simpleDraweeView, simpleDraweeView, liveCircleView);
        this.f91863c = dVar;
        d dVar2 = new d(simpleDraweeView2, simpleDraweeView2, liveCircleView2);
        this.f91864d = dVar2;
        dVar.f94547l = false;
        dVar2.f94547l = false;
    }

    public final void a(k kVar, List<k> list, int i2) {
        List<User> list2;
        User user;
        List<User> list3;
        User user2;
        l.d(kVar, "");
        l.d(list, "");
        this.f91580a = i2;
        this.f91865e = kVar;
        this.f91873m = list;
        SlimRoom a2 = a(kVar);
        if (a2 != null) {
            View view = this.itemView;
            l.b(view, "");
            view.setScaleX(1.0f);
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setScaleY(1.0f);
            SlimRoom.a linkMic = a2.getLinkMic();
            l.b(linkMic, "");
            int i3 = 0;
            if (linkMic.f23031a.size() >= 2) {
                SlimRoom.a linkMic2 = a2.getLinkMic();
                if (!(linkMic2 == null || (list3 = linkMic2.f23031a) == null || (user2 = list3.get(0)) == null)) {
                    dn.a(this.f91862b, user2.getAvatarThumb());
                    com.ss.android.ugc.aweme.language.d.c();
                    this.f91868h.setText(user2.displayId);
                }
                SlimRoom.a linkMic3 = a2.getLinkMic();
                if (!(linkMic3 == null || (list2 = linkMic3.f23031a) == null || (user = list2.get(1)) == null)) {
                    dn.a(this.f91867g, user.getAvatarThumb());
                }
            }
            TextView textView = this.f91870j;
            SlimRoom.a linkMic4 = a2.getLinkMic();
            l.b(linkMic4, "");
            if (linkMic4.f23033c <= 1) {
                i3 = 8;
            } else if (gb.a()) {
                TextView textView2 = this.f91870j;
                StringBuilder sb = new StringBuilder();
                SlimRoom.a linkMic5 = a2.getLinkMic();
                l.b(linkMic5, "");
                textView2.setText(sb.append(String.valueOf(linkMic5.f23033c - 1)).append("+").toString());
            } else {
                TextView textView3 = this.f91870j;
                StringBuilder sb2 = new StringBuilder("+");
                SlimRoom.a linkMic6 = a2.getLinkMic();
                l.b(linkMic6, "");
                textView3.setText(sb2.append(String.valueOf(linkMic6.f23033c - 1)).toString());
            }
            textView.setVisibility(i3);
            a(this.f91869i);
            this.f91862b.setOnClickListener(new a(this, kVar, list));
            this.f91863c.a(null, getClass());
            this.f91864d.a(null, getClass());
        }
    }
}
