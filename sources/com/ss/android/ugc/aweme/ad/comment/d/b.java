package com.ss.android.ugc.aweme.ad.comment.d;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.comment.a.a;
import com.ss.android.ugc.aweme.ad.comment.g;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gq;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    CircleImageView f65635a;

    /* renamed from: b  reason: collision with root package name */
    TuxTextView f65636b;

    /* renamed from: c  reason: collision with root package name */
    MentionTextView f65637c;

    /* renamed from: d  reason: collision with root package name */
    View f65638d;

    /* renamed from: e  reason: collision with root package name */
    View f65639e;

    /* renamed from: f  reason: collision with root package name */
    TextView f65640f;

    /* renamed from: g  reason: collision with root package name */
    MentionTextView f65641g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f65642h;

    /* renamed from: i  reason: collision with root package name */
    View f65643i;

    /* renamed from: j  reason: collision with root package name */
    TextView f65644j;

    /* renamed from: k  reason: collision with root package name */
    ImageView f65645k;

    /* renamed from: l  reason: collision with root package name */
    TextView f65646l;

    /* renamed from: m  reason: collision with root package name */
    TextView f65647m;
    RelativeLayout n;
    TextView o;
    LinearLayout p;
    int q;
    protected String r;
    protected Aweme s;
    protected Keva t;
    protected WeakReference<a> u;
    com.ss.android.ugc.aweme.commercialize.j.b v;
    private s w;
    private h.f.a.a<z> x;

    static {
        Covode.recordClassIndex(40396);
    }

    public final s getData() {
        return this.w;
    }

    public final String getEventType() {
        return this.r;
    }

    private void d() {
        if (this.u.get() != null) {
            this.u.get().a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a() {
        Aweme aweme = this.s;
        if (aweme != null && aweme.isAd()) {
            a("title");
            a(4);
            c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getDiggSpKey() {
        return "COMMENT_DIGG" + this.w.getAwemeId();
    }

    private void b() {
        if (this.w.getUserDigged() == 1) {
            this.f65645k.setSelected(true);
            ImageView imageView = this.f65645k;
            imageView.setImageDrawable(imageView.getResources().getDrawable(2131232227));
            return;
        }
        this.f65645k.setSelected(false);
        ImageView imageView2 = this.f65645k;
        imageView2.setImageDrawable(imageView2.getResources().getDrawable(2131232228));
    }

    private void c() {
        Aweme aweme;
        if (this.w != null && (aweme = this.s) != null && aweme.getAdCommentStruct() == null) {
            if (com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a != null) {
                com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(getContext(), this.s);
            }
            d();
            if (com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a != null) {
                com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(this.r, "click_comment_link", this.s, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Aweme aweme = this.s;
        if (aweme != null && aweme.isAd()) {
            if (this.w.getCommentStyle() == 1) {
                AwemeRawAd awemeRawAd = this.s.getAwemeRawAd();
                i.a aVar = new i.a();
                aVar.f74815a = awemeRawAd;
                com.ss.android.ugc.aweme.ad.comment.b.a.a("othershow", awemeRawAd, aVar.a());
                com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_first_ad", "othershow", this.s.getAwemeRawAd()).a("anchor_id", b(this.s)).a("room_id", a(this.s)).c();
            } else if (this.w.getCommentStyle() == 0) {
                AwemeRawAd awemeRawAd2 = this.s.getAwemeRawAd();
                i.a aVar2 = new i.a();
                aVar2.f74815a = awemeRawAd2;
                com.ss.android.ugc.aweme.ad.comment.b.a.a("comment_first_show", awemeRawAd2, aVar2.a());
                com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_first_ad", "comment_first_show", this.s.getAwemeRawAd()).a("anchor_id", b(this.s)).a("room_id", a(this.s)).c();
            }
        }
        if (com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a != null) {
            com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(this.r, "show_comment_link", this.s, false);
        }
    }

    public final void setEventType(String str) {
        this.r = str;
    }

    public b(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnInternalEventListener(a aVar) {
        this.u = new WeakReference<>(aVar);
    }

    private void a(int i2) {
        Aweme aweme;
        if (this.w != null && (aweme = this.s) != null && aweme.isAd() && com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a != null) {
            com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(getContext(), this.s, i2, this.v);
        }
    }

    private static String a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    private static String b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    private void a(String str) {
        AwemeRawAd awemeRawAd = this.s.getAwemeRawAd();
        if (awemeRawAd != null) {
            String openUrl = awemeRawAd.getOpenUrl();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_first_ad", "click", awemeRawAd).b("refer", str).a("anchor_id", b(this.s)).a("room_id", a(this.s)).b();
            if (com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a != null) {
                com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(awemeRawAd);
            }
            if (com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a == null || !com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(openUrl)) {
                com.ss.android.ugc.aweme.ad.comment.b.a.b(awemeRawAd);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_first_ad", "click_title", this.s.getAwemeRawAd()).a("anchor_id", b(this.s)).a("room_id", a(this.s)).c();
                return;
            }
            com.ss.android.ugc.aweme.ad.comment.b.a.a(awemeRawAd);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_first_ad", "click_message", awemeRawAd).a("anchor_id", b(this.s)).a("room_id", a(this.s)).c();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.comment.d.b.i(android.view.View):void");
    }

    public final void setData(s sVar) {
        boolean z;
        this.w = sVar;
        String aid = sVar.getAid();
        IAwemeService b2 = AwemeService.b();
        Aweme d2 = b2.d(aid);
        Aweme b3 = b2.b(aid);
        Aweme a2 = b2.a(aid);
        if (d2 == null) {
            if (b3 != null) {
                d2 = b3;
            } else {
                d2 = a2;
            }
        }
        this.s = d2;
        if (((com.facebook.drawee.f.a) this.f65635a.getHierarchy()).f47454a != null) {
            ((com.facebook.drawee.f.a) this.f65635a.getHierarchy()).f47454a.c((float) n.a(0.5d));
            ((com.facebook.drawee.f.a) this.f65635a.getHierarchy()).f47454a.f47480f = this.f65635a.getResources().getColor(R.color.b6);
        }
        User user = this.w.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                e.a(this.f65635a, 2131232324);
            } else {
                CircleImageView circleImageView = this.f65635a;
                int i2 = this.q;
                e.a(circleImageView, avatarThumb, i2, i2, null, circleImageView.getControllerListener());
            }
        }
        String commentInfo = this.w.getCommentInfo();
        if (!(this.s == null || TextUtils.isEmpty(commentInfo) || com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a == null)) {
            boolean isAd = this.s.isAd();
            if (this.s.getAdCommentStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (isAd && z) {
                List<TextExtraStruct> a3 = com.ss.android.ugc.aweme.ad.comment.i.f65696a.a(this.w, this.s.getAwemeRawAd(), this.x);
                this.f65637c.setText(com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.b(this.w));
                this.f65637c.a(a3, new g(), (MentionTextView.d) null);
                this.f65637c.setMovementMethod(LinkMovementMethod.getInstance());
                com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.p);
            } else {
                List<TextExtraStruct> a4 = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a(getContext(), this.s, this.w);
                this.f65637c.setText(com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.b(this.w));
                if (a4 != null) {
                    this.f65637c.a(a4, new g(), (MentionTextView.d) null);
                    this.f65637c.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        this.f65644j.setVisibility(8);
        this.n.setVisibility(0);
        int i3 = this.t.getInt(getDiggSpKey(), -1);
        if (i3 != -1) {
            this.w.setUserDigged(i3);
        }
        b();
        String str = "";
        if (this.w.showCreatorTag()) {
            this.f65646l.setVisibility(0);
            this.f65646l.setText(com.a.a(getResources().getString(R.string.akw), new Object[]{str}));
            this.f65647m.setVisibility(0);
            this.f65647m.setText(getResources().getText(R.string.x1));
        }
        TuxTextView tuxTextView = this.f65636b;
        if (!TextUtils.isEmpty(this.w.getCommentNickName())) {
            str = this.w.getCommentNickName();
        }
        tuxTextView.setText(str);
        this.f65636b.setTuxFont(62);
        this.f65636b.setTextColor(androidx.core.content.b.c(getContext(), R.color.c4));
    }

    private b(Context context, byte b2) {
        this(context, (char) 0);
    }

    private b(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(2612);
        this.r = "";
        this.t = Keva.getRepo("ad_comment");
        this.v = new com.ss.android.ugc.aweme.commercialize.j.b() {
            /* class com.ss.android.ugc.aweme.ad.comment.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(40397);
            }
        };
        this.x = new c(this);
        LayoutInflater.from(context).inflate(R.layout.a97, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.q = n.a(32.0d);
        this.f65635a = (CircleImageView) findViewById(R.id.or);
        this.f65636b = (TuxTextView) findViewById(R.id.title);
        this.f65637c = (MentionTextView) findViewById(R.id.adh);
        this.f65638d = findViewById(R.id.a_0);
        this.f65639e = findViewById(R.id.dl3);
        this.f65640f = (TextView) findViewById(R.id.dld);
        this.f65641g = (MentionTextView) findViewById(R.id.dl4);
        this.f65642h = (ImageView) findViewById(R.id.ayu);
        this.f65643i = findViewById(R.id.dl5);
        this.f65644j = (TextView) findViewById(R.id.aam);
        this.f65645k = (ImageView) findViewById(R.id.bwd);
        this.f65646l = (TextView) findViewById(R.id.aa6);
        this.f65647m = (TextView) findViewById(R.id.aah);
        this.n = (RelativeLayout) findViewById(R.id.c5g);
        this.o = (TextView) findViewById(R.id.dl2);
        this.p = (LinearLayout) findViewById(R.id.ae_);
        View findViewById = findViewById(R.id.c5g);
        if (findViewById != null) {
            findViewById.setOnClickListener(new d(this));
        }
        View findViewById2 = findViewById(R.id.or);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new e(this));
        }
        View findViewById3 = findViewById(R.id.title);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new f(this));
        }
        View findViewById4 = findViewById(R.id.a_n);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new g(this));
        }
        View findViewById5 = findViewById(R.id.ae_);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new h(this));
        }
        View findViewById6 = findViewById(R.id.adh);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new i(this));
        }
        View findViewById7 = findViewById(R.id.a_0);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new j(this));
        }
        View findViewById8 = findViewById(R.id.aah);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new k(this));
        }
        View findViewById9 = findViewById(R.id.aa6);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new l(this));
        }
        setOrientation(1);
        gq.a(this.f65637c);
        gq.a(this.f65641g);
        MethodCollector.o(2612);
    }
}
