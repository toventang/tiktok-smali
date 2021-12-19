package com.bytedance.android.livesdk.hashtag;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.af;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class h extends v {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18147i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Room f18148a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18149b = FeedDrawMtSetting.INSTANCE.getValue().getUrl();

    /* renamed from: c  reason: collision with root package name */
    public i f18150c;

    /* renamed from: d  reason: collision with root package name */
    public long f18151d;

    /* renamed from: e  reason: collision with root package name */
    public long f18152e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18153f;

    /* renamed from: g  reason: collision with root package name */
    public final float f18154g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final float f18155h = 0.3f;

    /* renamed from: j  reason: collision with root package name */
    private b f18156j;

    /* renamed from: k  reason: collision with root package name */
    private final ak.a f18157k = ak.a.PANEL_HASHTAG_AUDIENCE;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f18158l;

    static {
        Covode.recordClassIndex(10078);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f18158l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f18158l == null) {
            this.f18158l = new HashMap();
        }
        View view = (View) this.f18158l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f18158l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10079);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f18157k;
    }

    static final class j implements StateLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18167a;

        static {
            Covode.recordClassIndex(10088);
        }

        j(h hVar) {
            this.f18167a = hVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.a
        public final void a() {
            this.f18167a.d();
        }
    }

    static final class k implements StateLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18168a;

        static {
            Covode.recordClassIndex(10089);
        }

        k(h hVar) {
            this.f18168a = hVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.a
        public final void a() {
            this.f18168a.d();
        }
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean f2 = f();
        com.ss.android.ugc.aweme.lancet.j.f107226e = f2;
        return f2;
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6u);
        bVar.f22380g = 80;
        bVar.f22383j = 73;
        return bVar;
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(10091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            long j2;
            Hashtag hashtag;
            Long l2;
            String valueOf;
            h.a(this.this$0).f18172a = 1;
            h.a(this.this$0).notifyDataSetChanged();
            h hVar = this.this$0;
            long j3 = hVar.f18152e;
            hVar.getContext();
            if (!h.e()) {
                i iVar = hVar.f18150c;
                if (iVar == null) {
                    h.f.b.l.a("mAdapter");
                }
                iVar.f18172a = 3;
            } else {
                FeedApi feedApi = (FeedApi) com.bytedance.android.live.network.e.a().a(FeedApi.class);
                String str2 = hVar.f18149b;
                Room room = hVar.f18148a;
                String str3 = "";
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = str3;
                }
                Room room2 = hVar.f18148a;
                if (!(room2 == null || (valueOf = String.valueOf(room2.getOwnerUserId())) == null)) {
                    str3 = valueOf;
                }
                DataChannel dataChannel = hVar.p;
                if (dataChannel == null || (hashtag = (Hashtag) dataChannel.b(aq.class)) == null || (l2 = hashtag.id) == null) {
                    j2 = 0;
                } else {
                    j2 = l2.longValue();
                }
                feedApi.feed(str2, j3, "enter_hashtag_loadmore", "76", str, str3, j2, 6).d(c.f18161a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.i.a(hVar, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new d(hVar), new e(hVar));
            }
            return z.f158842a;
        }
    }

    public final void d() {
        String str;
        long j2;
        Hashtag hashtag;
        Long l2;
        String valueOf;
        ((StateLayout) a_(R.id.bep)).a("LOADING");
        getContext();
        if (!e()) {
            ((StateLayout) a_(R.id.bep)).a("OFFLINE");
            return;
        }
        FeedApi feedApi = (FeedApi) com.bytedance.android.live.network.e.a().a(FeedApi.class);
        String str2 = this.f18149b;
        Room room = this.f18148a;
        String str3 = "";
        if (room == null || (str = String.valueOf(room.getId())) == null) {
            str = str3;
        }
        Room room2 = this.f18148a;
        if (!(room2 == null || (valueOf = String.valueOf(room2.getOwnerUserId())) == null)) {
            str3 = valueOf;
        }
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (hashtag = (Hashtag) dataChannel.b(aq.class)) == null || (l2 = hashtag.id) == null) {
            j2 = 0;
        } else {
            j2 = l2.longValue();
        }
        feedApi.feed(str2, 0, "enter_hashtag_refresh", "76", str, str3, j2, 6).d(f.f18164a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new g(this), new C0381h(this));
    }

    public static final class n implements com.bytedance.android.livesdkapi.l.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18169a;

        static {
            Covode.recordClassIndex(10092);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(h hVar) {
            this.f18169a = hVar;
        }

        @Override // com.bytedance.android.livesdkapi.l.c
        public final void a(Throwable th) {
            h.f.b.l.d(th, "");
            com.bytedance.android.live.core.c.a.a(6, "HashtagAudienceDialog", "query Live permission failed");
        }

        @Override // com.bytedance.android.livesdkapi.l.c
        public final void a(Boolean bool, com.bytedance.android.livesdkapi.l.b bVar, com.bytedance.android.livesdkapi.l.a aVar) {
            this.f18169a.f18153f = p.a(bool);
            if (bVar != null) {
                DataChannelGlobal.f34575d.a(af.class, bVar);
            }
            if (aVar != null) {
                DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.e.class, aVar);
            }
            if (this.f18169a.f18153f) {
                h hVar = this.f18169a;
                LiveButton liveButton = (LiveButton) hVar.a_(R.id.e9s);
                h.f.b.l.b(liveButton, "");
                hVar.a(liveButton);
                h hVar2 = this.f18169a;
                ImageView imageView = (ImageView) hVar2.a_(R.id.e9t);
                h.f.b.l.b(imageView, "");
                hVar2.a(imageView);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(10090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    public static final /* synthetic */ i a(h hVar) {
        i iVar = hVar.f18150c;
        if (iVar == null) {
            h.f.b.l.a("mAdapter");
        }
        return iVar;
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f18161a = new c();

        static {
            Covode.recordClassIndex(10081);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.android.live.network.response.a aVar = (com.bytedance.android.live.network.response.a) obj;
            h.f.b.l.d(aVar, "");
            return new com.bytedance.android.livesdk.feed.l.a(aVar.f12145b, (com.bytedance.android.live.base.model.c.a) aVar.f12146c);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18163a;

        static {
            Covode.recordClassIndex(10083);
        }

        e(h hVar) {
            this.f18163a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.a(this.f18163a).f18172a = 2;
            com.bytedance.android.live.core.c.a.a(6, "HashtagAudienceDialog", "failed to fetch feeds!");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f18164a = new f();

        static {
            Covode.recordClassIndex(10084);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.android.live.network.response.a aVar = (com.bytedance.android.live.network.response.a) obj;
            h.f.b.l.d(aVar, "");
            return new com.bytedance.android.livesdk.feed.l.a(aVar.f12145b, (com.bytedance.android.live.base.model.c.a) aVar.f12146c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.hashtag.h$h  reason: collision with other inner class name */
    public static final class C0381h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18166a;

        static {
            Covode.recordClassIndex(10086);
        }

        C0381h(h hVar) {
            this.f18166a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f18166a.a_(R.id.bep)).a("ERROR");
            com.bytedance.android.live.core.c.a.a(6, "HashtagAudienceDialog", "failed to fetch feeds!");
        }
    }

    public final void a(View view) {
        view.setVisibility(0);
        k.a("show");
        view.setOnClickListener(new b(view, this));
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18162a;

        static {
            Covode.recordClassIndex(10082);
        }

        d(h hVar) {
            this.f18162a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            com.bytedance.android.live.base.model.c.a aVar;
            List<FeedItem> list;
            com.bytedance.android.livesdk.feed.l.a aVar2 = (com.bytedance.android.livesdk.feed.l.a) obj;
            if (!(aVar2 == null || (list = aVar2.f17588a) == null)) {
                if (list.isEmpty()) {
                    h.a(this.f18162a).f18172a = 3;
                    h.a(this.f18162a).notifyDataSetChanged();
                } else {
                    h.a(this.f18162a).f18172a = 2;
                    h.a(this.f18162a).a(list);
                }
            }
            h hVar = this.f18162a;
            if (aVar2 == null || (aVar = aVar2.f17589b) == null) {
                j2 = 0;
            } else {
                j2 = aVar.f7381d;
            }
            hVar.f18152e = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18165a;

        static {
            Covode.recordClassIndex(10085);
        }

        g(h hVar) {
            this.f18165a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            com.bytedance.android.live.base.model.c.a aVar;
            List<FeedItem> list;
            String str;
            com.bytedance.android.livesdk.feed.l.a aVar2 = (com.bytedance.android.livesdk.feed.l.a) obj;
            if (!(aVar2 == null || (list = aVar2.f17588a) == null)) {
                if (!list.isEmpty()) {
                    ((StateLayout) this.f18165a.a_(R.id.bep)).a("CONTENT");
                    com.bytedance.android.live.base.model.c.a aVar3 = aVar2.f17589b;
                    if (!(aVar3 == null || (str = aVar3.f7387j) == null)) {
                        LiveTextView liveTextView = (LiveTextView) this.f18165a.a_(R.id.bet);
                        liveTextView.setText(str);
                        liveTextView.setVisibility(0);
                    }
                    h.a(this.f18165a).a(list);
                } else if (this.f18165a.f18153f) {
                    ((StateLayout) this.f18165a.a_(R.id.bep)).a("WithGoLivePerm");
                } else {
                    ((StateLayout) this.f18165a.a_(R.id.bep)).a("WithoutGoLivePerm");
                }
            }
            h hVar = this.f18165a;
            if (aVar2 == null || (aVar = aVar2.f17589b) == null) {
                j2 = 0;
            } else {
                j2 = aVar.f7381d;
            }
            hVar.f18152e = j2;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Room, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(10087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Room room) {
            Room room2 = room;
            h.f.b.l.d(room2, "");
            this.this$0.dismiss();
            EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a(room2, false);
            a2.f23299c.L = "hashtag";
            a2.f23299c.J = "live_detail";
            EnterRoomLinkSession.a(a2).a(new Event("hashtag_enter_room", 4864, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.e(room2.getId(), a2));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f18159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f18160b;

        static {
            Covode.recordClassIndex(10080);
        }

        b(View view, h hVar) {
            this.f18159a = view;
            this.f18160b = hVar;
        }

        public final void onClick(View view) {
            long j2;
            Hashtag hashtag;
            Long l2;
            Hashtag hashtag2;
            String str;
            String a2;
            if (System.currentTimeMillis() - this.f18160b.f18151d > 500) {
                String str2 = "";
                h.f.b.l.b(view, str2);
                if (view.getAlpha() >= 0.01f) {
                    this.f18160b.f18151d = System.currentTimeMillis();
                    k.a("click");
                    DataChannel dataChannel = this.f18160b.p;
                    if (!(dataChannel == null || (hashtag2 = (Hashtag) dataChannel.b(aq.class)) == null || (str = hashtag2.title) == null || (a2 = h.m.p.a(str, "&", "%26", false)) == null)) {
                        str2 = a2;
                    }
                    DataChannel dataChannel2 = this.f18160b.p;
                    if (dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.b(aq.class)) == null || (l2 = hashtag.id) == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).handleSchema(p.a(this.f18159a.getContext()), "sslocal://openRecord?enter_from=direct_shoot&tab=live&".concat(String.valueOf("source_params={\"hashtag_title\":\"" + str2 + "\",\"hashtag_id\":" + j2 + ",\"request_from\":hashtag}")), new Bundle());
                }
            }
        }
    }

    static final class o implements AppBarLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f18170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.b f18171b;

        static {
            Covode.recordClassIndex(10093);
        }

        o(h hVar, z.b bVar) {
            this.f18170a = hVar;
            this.f18171b = bVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i2) {
            z.b bVar = this.f18171b;
            AppBarLayout appBarLayout2 = (AppBarLayout) this.f18170a.a_(R.id.ld);
            h.f.b.l.b(appBarLayout2, "");
            bVar.element = Math.abs(((float) i2) / ((float) appBarLayout2.getTotalScrollRange()));
            if (this.f18171b.element > this.f18170a.f18155h) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f18170a.a_(R.id.em8);
                h.f.b.l.b(constraintLayout, "");
                constraintLayout.setAlpha(Math.min(((1.0f - (((1.0f - this.f18171b.element) * (1.0f - this.f18171b.element)) * (1.0f - this.f18171b.element))) - this.f18170a.f18155h) / (1.0f - this.f18170a.f18155h), 1.0f));
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f18170a.a_(R.id.em8);
                h.f.b.l.b(constraintLayout2, "");
                constraintLayout2.setAlpha(0.0f);
            }
            if (this.f18171b.element > this.f18170a.f18154g) {
                ImageView imageView = (ImageView) this.f18170a.a_(R.id.e9t);
                h.f.b.l.b(imageView, "");
                imageView.setAlpha(Math.min((this.f18171b.element - this.f18170a.f18154g) / (1.0f - this.f18170a.f18154g), 1.0f));
                return;
            }
            ImageView imageView2 = (ImageView) this.f18170a.a_(R.id.e9t);
            h.f.b.l.b(imageView2, "");
            imageView2.setAlpha(0.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        Hashtag hashtag;
        ImageModel imageModel;
        String str;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new l(this));
        }
        DataChannel dataChannel2 = this.p;
        String str2 = null;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.b(df.class);
        } else {
            room = null;
        }
        this.f18148a = room;
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 != null) {
            hashtag = (Hashtag) dataChannel3.b(aq.class);
        } else {
            hashtag = null;
        }
        ImageView imageView = (ImageView) a_(R.id.beq);
        if (hashtag != null) {
            imageModel = hashtag.image;
        } else {
            imageModel = null;
        }
        com.bytedance.android.live.core.f.p.b(imageView, imageModel, 2131234109, 2);
        LiveTextView liveTextView = (LiveTextView) a_(R.id.beu);
        h.f.b.l.b(liveTextView, "");
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) a_(R.id.bev);
        h.f.b.l.b(liveTextView2, "");
        if (hashtag != null) {
            str2 = hashtag.title;
        }
        liveTextView2.setText(str2);
        ((AppBarLayout) a_(R.id.ld)).a(new o(this, new z.b()));
        i iVar = new i(this.p);
        i iVar2 = new i(this);
        h.f.b.l.d(iVar2, "");
        iVar.f18173b = iVar2;
        this.f18150c = iVar;
        this.f18156j = new b(new m(this));
        StateLayout stateLayout = (StateLayout) a_(R.id.bep);
        stateLayout.a("WithoutGoLivePerm", R.layout.b6w);
        stateLayout.a("WithGoLivePerm", R.layout.b6v);
        stateLayout.setOfflineClickListener(new j(this));
        stateLayout.setErrorClickListener(new k(this));
        RecyclerView recyclerView = (RecyclerView) a_(R.id.b1g);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        i iVar3 = this.f18150c;
        if (iVar3 == null) {
            h.f.b.l.a("mAdapter");
        }
        recyclerView.setAdapter(iVar3);
        recyclerView.a(new a());
        b bVar = this.f18156j;
        if (bVar == null) {
            h.f.b.l.a("feedRecyclerOnScrollListener");
        }
        recyclerView.a(bVar);
        d();
        ((IHostUser) com.bytedance.android.live.t.a.a(IHostUser.class)).requestLivePermission(new n(this));
    }
}
