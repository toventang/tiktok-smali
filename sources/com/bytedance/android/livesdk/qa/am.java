package com.bytedance.android.livesdk.qa;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.NoMoreSpaceTextView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class am extends com.bytedance.android.live.publicscreen.a.f.b<al> {

    /* renamed from: a  reason: collision with root package name */
    boolean f20359a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20360d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20361e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.e f20362f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20363g = true;

    /* renamed from: h  reason: collision with root package name */
    private bj f20364h;

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20365a = new a();

        static {
            Covode.recordClassIndex(12022);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20366a = new b();

        static {
            Covode.recordClassIndex(12023);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12021);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f20369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f20370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DataChannel f20371c;

        static {
            Covode.recordClassIndex(12025);
        }

        d(am amVar, bj bjVar, DataChannel dataChannel) {
            this.f20369a = amVar;
            this.f20370b = bjVar;
            this.f20371c = dataChannel;
        }

        public final void onClick(View view) {
            aa.a(this.f20371c, UGCMonitor.EVENT_COMMENT);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f20367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f20368b;

        static {
            Covode.recordClassIndex(12024);
        }

        c(am amVar, User user) {
            this.f20367a = amVar;
            this.f20368b = user;
        }

        public final void onClick(View view) {
            this.f20367a.a(this.f20368b, "head");
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f20377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f20378b;

        static {
            Covode.recordClassIndex(12028);
        }

        g(am amVar, User user) {
            this.f20377a = amVar;
            this.f20378b = user;
        }

        public final void onClick(View view) {
            this.f20377a.a(this.f20378b, StringSet.name);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am(View view) {
        super(view);
        l.d(view, "");
        this.f20362f = p.a(view.getContext());
    }

    static final class e implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f20372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f20373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DataChannel f20374c;

        static {
            Covode.recordClassIndex(12026);
        }

        e(am amVar, bj bjVar, DataChannel dataChannel) {
            this.f20372a = amVar;
            this.f20373b = bjVar;
            this.f20374c = dataChannel;
        }

        public final boolean onLongClick(View view) {
            DataChannel dataChannel;
            i iVar;
            androidx.fragment.app.d dVar;
            User user = this.f20373b.f19336e;
            l.b(user, "");
            long id = user.getId();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            if (!(id == b2.c() || (dataChannel = this.f20374c) == null || (iVar = (i) dataChannel.b(ao.class)) == null || this.f20374c.b(df.class) == null)) {
                this.f20374c.a(ad.class, this.f20373b);
                this.f20374c.a(au.class, "qa_comment");
                if (this.f20372a.f20360d || this.f20372a.f20361e) {
                    this.f20374c.a(ao.class, (Object) false);
                    dVar = new as();
                } else {
                    dVar = new at();
                }
                dVar.show(iVar, "qa_comment");
            }
            return true;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f20375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f20376b;

        static {
            Covode.recordClassIndex(12027);
        }

        f(am amVar, bj bjVar) {
            this.f20375a = amVar;
            this.f20376b = bjVar;
        }

        public final void onClick(View view) {
            String str;
            int i2;
            am amVar = this.f20375a;
            bj bjVar = this.f20376b;
            amVar.f20359a = !amVar.f20359a;
            if (amVar.f20359a) {
                str = "livesdk_qa_question_like";
            } else {
                str = "livesdk_qa_question_cancel_like";
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a(str).a().a("question_content", bjVar.f19333b);
            User user = bjVar.f19336e;
            l.b(user, "");
            a2.a("question_user_id", user.getId()).a("like_enter_from", UGCMonitor.EVENT_COMMENT).b();
            View view2 = amVar.itemView;
            l.b(view2, "");
            ImageView imageView = (ImageView) view2.findViewById(R.id.c_o);
            if (amVar.f20359a) {
                i2 = 2131234691;
            } else {
                i2 = 2131234690;
            }
            imageView.setBackgroundResource(i2);
            ((QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class)).likeQuestion(bjVar.f19332a, amVar.f20359a ? 1 : 0, 0).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(a.f20365a, b.f20366a);
        }
    }

    public final void a(User user, String str) {
        long j2;
        String str2;
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user);
        bj bjVar = this.f20364h;
        if (bjVar != null) {
            j2 = bjVar.f19332a;
        } else {
            j2 = 0;
        }
        userProfileEvent.msgId = j2;
        bj bjVar2 = this.f20364h;
        if (bjVar2 != null) {
            str2 = bjVar2.f19333b;
        } else {
            str2 = null;
        }
        userProfileEvent.content = str2;
        userProfileEvent.chatType = "3";
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.setClickModule(str);
        userProfileEvent.setClickUserPosition("qa_comment");
        a2.a(userProfileEvent);
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(com.bytedance.android.live.publicscreen.a.g gVar, h hVar) {
        User b2;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        List<String> urls;
        User user;
        ba userAttr;
        Boolean bool;
        Boolean bool2;
        al alVar = (al) hVar;
        l.d(gVar, "");
        l.d(alVar, "");
        bj bjVar = ((bl) alVar.f12190d).f19340a;
        if (bjVar != null && (b2 = alVar.b()) != null) {
            DataChannel dataChannel = gVar.f12208l;
            if (dataChannel == null || (bool2 = (Boolean) dataChannel.b(ee.class)) == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            this.f20360d = z;
            DataChannel dataChannel2 = gVar.f12208l;
            if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(cp.class)) == null) {
                z2 = true;
            } else {
                z2 = bool.booleanValue();
            }
            this.f20363g = z2;
            DataChannel dataChannel3 = gVar.f12208l;
            if (dataChannel3 == null || (user = (User) dataChannel3.b(dn.class)) == null || (userAttr = user.getUserAttr()) == null) {
                z3 = false;
            } else {
                z3 = userAttr.f19030b;
            }
            this.f20361e = z3;
            this.f20364h = bjVar;
            View view = this.itemView;
            l.b(view, "");
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.cs_);
            com.bytedance.android.live.publicscreen.a.g gVar2 = this.f12195b;
            if (gVar2 != null) {
                l.b(liveTextView, "");
                gVar2.a(liveTextView);
            }
            if (((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getTextMessageConfig() != null) {
                i2 = R.color.a1t;
            } else {
                i2 = 0;
            }
            SpannableString spannableString = new SpannableString(y.a((int) R.string.dzg, com.bytedance.android.livesdk.ac.g.a(b2)));
            spannableString.setSpan(new ForegroundColorSpan(y.b(i2)), 0, spannableString.length(), 18);
            liveTextView.setText(spannableString);
            liveTextView.setOnClickListener(new g(this, b2));
            liveTextView.setHighlightColor(0);
            DataChannel dataChannel4 = gVar.f12208l;
            View view2 = this.itemView;
            l.b(view2, "");
            NoMoreSpaceTextView noMoreSpaceTextView = (NoMoreSpaceTextView) view2.findViewById(R.id.adh);
            com.bytedance.android.live.publicscreen.a.g gVar3 = this.f12195b;
            if (gVar3 != null) {
                l.b(noMoreSpaceTextView, "");
                gVar3.a(noMoreSpaceTextView);
            }
            noMoreSpaceTextView.setText(bjVar.f19333b);
            noMoreSpaceTextView.setOnClickListener(new d(this, bjVar, dataChannel4));
            noMoreSpaceTextView.setOnLongClickListener(new e(this, bjVar, dataChannel4));
            if (!this.f20360d) {
                View view3 = this.itemView;
                l.b(view3, "");
                ImageView imageView = (ImageView) view3.findViewById(R.id.c_o);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new f(this, bjVar));
            }
            ImageModel avatarThumb = b2.getAvatarThumb();
            if (avatarThumb == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty()) {
                View view4 = this.itemView;
                l.b(view4, "");
                ((HSImageView) view4.findViewById(R.id.dfr)).setImageResource(alVar.h_());
            } else {
                View view5 = this.itemView;
                l.b(view5, "");
                k.a((HSImageView) view5.findViewById(R.id.dfr), b2.getAvatarThumb());
            }
            View view6 = this.itemView;
            l.b(view6, "");
            ((HSImageView) view6.findViewById(R.id.dfr)).setOnClickListener(new c(this, b2));
            long id = b2.getId();
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            if (id == b3.c()) {
                b.a.a("livesdk_audience_qa_message").a().b();
            }
        }
    }
}
