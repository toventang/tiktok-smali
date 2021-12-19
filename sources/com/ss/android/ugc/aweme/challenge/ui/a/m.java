package com.ss.android.ugc.aweme.challenge.ui.a;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.ss.android.ugc.aweme.challenge.ui.a.a;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.n;
import java.util.List;

public final class m extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f70090h = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private TextView f70091i;

    /* renamed from: j  reason: collision with root package name */
    private View f70092j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f70093k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f70094l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f70095m;
    private TextView n;
    private View o;
    private CheckableImageView p;
    private TextView q;
    private i r;

    static {
        Covode.recordClassIndex(43232);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getAttrsResId() {
        return R.layout.my;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getLayoutResId() {
        return R.layout.n5;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43233);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void a() {
        l a2 = ChallengeDetailProvicer.b().a();
        l.b(a2, "");
        a(a2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getButtonResId() {
        int i2 = n.f70098a[getMHeaderParam().f70085c.ordinal()];
        if (i2 == 1) {
            return R.layout.n0;
        }
        if (i2 == 2) {
            return R.layout.n1;
        }
        throw new n();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void b() {
        MethodCollector.i(11974);
        View findViewById = findViewById(R.id.pm);
        l.b(findViewById, "");
        this.f70091i = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.my);
        l.b(findViewById2, "");
        ViewStub viewStub = (ViewStub) findViewById2;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        l.b(inflate, "");
        this.f70092j = inflate;
        if (inflate == null) {
            l.a("attrsContainer");
        }
        View findViewById3 = inflate.findViewById(R.id.mz);
        l.b(findViewById3, "");
        this.f70093k = (TextView) findViewById3;
        View view = this.f70092j;
        if (view == null) {
            l.a("attrsContainer");
        }
        View findViewById4 = view.findViewById(R.id.n2);
        l.b(findViewById4, "");
        this.f70094l = (TextView) findViewById4;
        View view2 = this.f70092j;
        if (view2 == null) {
            l.a("attrsContainer");
        }
        View findViewById5 = view2.findViewById(R.id.n3);
        l.b(findViewById5, "");
        this.f70095m = (TextView) findViewById5;
        View view3 = this.f70092j;
        if (view3 == null) {
            l.a("attrsContainer");
        }
        View findViewById6 = view3.findViewById(R.id.n0);
        l.b(findViewById6, "");
        this.n = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.a0z);
        l.b(findViewById7, "");
        ViewStub viewStub2 = (ViewStub) findViewById7;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById8 = inflate2.findViewById(R.id.a8e);
        l.b(findViewById8, "");
        View findViewById9 = inflate2.findViewById(R.id.bvi);
        l.b(findViewById9, "");
        this.r = new i(findViewById8, (CheckableImageView) findViewById9, (TextView) inflate2.findViewById(R.id.ex4), getDetailParam());
        View findViewById10 = inflate2.findViewById(R.id.eq7);
        this.o = findViewById10;
        if (findViewById10 != null) {
            View findViewById11 = inflate2.findViewById(R.id.c2a);
            l.b(findViewById11, "");
            this.p = (CheckableImageView) findViewById11;
            View findViewById12 = inflate2.findViewById(R.id.f9x);
            l.b(findViewById12, "");
            this.q = (TextView) findViewById12;
        }
        super.b();
        MethodCollector.o(11974);
    }

    public final void b(String str) {
        r.a(str, new d().a("challenge_id", getMChallenge().getCid()).a("content_type", getMChallenge().getContentType()).f66730a);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f70096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeTransform f70097b;

        static {
            Covode.recordClassIndex(43234);
        }

        b(m mVar, ChallengeTransform challengeTransform) {
            this.f70096a = mVar;
            this.f70097b = challengeTransform;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f70096a.b("challenge_transform_button_click");
            if (b.a(this.f70097b.getAction())) {
                String action = this.f70097b.getAction();
                if (action == null) {
                    action = "";
                }
                if (b.a(action)) {
                    action = Uri.parse(action).buildUpon().appendQueryParameter("bundle_webview_background", "ffffff").build().toString();
                }
                l.b(action, "");
                if (!g.c().a(this.f70096a.getContext(), action, true)) {
                    g.c().a(this.f70096a.getContext(), action, "");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void a(ChallengeDetail challengeDetail) {
        boolean z;
        l.d(challengeDetail, "");
        if (challengeDetail.challenge != null) {
            super.a(challengeDetail);
            if (b.a(getMChallenge().getProfileTagUrl())) {
                TextView textView = this.f70091i;
                if (textView == null) {
                    l.a("avatarTag");
                }
                textView.setVisibility(0);
                TextView textView2 = this.f70091i;
                if (textView2 == null) {
                    l.a("avatarTag");
                }
                textView2.setText(getMChallenge().getProfileTagUrl());
            } else {
                TextView textView3 = this.f70091i;
                if (textView3 == null) {
                    l.a("avatarTag");
                }
                textView3.setVisibility(8);
            }
            List<String> attrs = getMChallenge().getAttrs();
            if (attrs == null || attrs.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view = this.f70092j;
                if (view == null) {
                    l.a("attrsContainer");
                }
                view.setVisibility(4);
            } else {
                TextView textView4 = this.f70093k;
                if (textView4 == null) {
                    l.a("attrsFirst");
                }
                a(0, textView4);
                TextView textView5 = this.f70094l;
                if (textView5 == null) {
                    l.a("attrsSecond");
                }
                a(1, textView5);
                TextView textView6 = this.f70095m;
                if (textView6 == null) {
                    l.a("attrsThird");
                }
                a(2, textView6);
                TextView textView7 = this.n;
                if (textView7 == null) {
                    l.a("attrsForth");
                }
                a(3, textView7);
                View view2 = this.f70092j;
                if (view2 == null) {
                    l.a("attrsContainer");
                }
                view2.setVisibility(0);
            }
            i iVar = this.r;
            if (iVar == null) {
                l.a("collectButtonBlock");
            }
            iVar.a(getMChallenge(), getMHeaderParam());
            if (this.o != null && a.C1587a.a(getMChallengeDetail())) {
                ChallengeTransform transfrom = getMChallenge().getTransfrom();
                if (transfrom.getIconUrlModel() == null) {
                    CheckableImageView checkableImageView = this.p;
                    if (checkableImageView == null) {
                        l.a("transformIv");
                    }
                    checkableImageView.setVisibility(8);
                } else {
                    CheckableImageView checkableImageView2 = this.p;
                    if (checkableImageView2 == null) {
                        l.a("transformIv");
                    }
                    e.a(checkableImageView2, transfrom.getIconUrlModel());
                }
                TextView textView8 = this.q;
                if (textView8 == null) {
                    l.a("transformTv");
                }
                textView8.setText(transfrom.getText());
                View view3 = this.o;
                if (view3 == null) {
                    l.b();
                }
                view3.setOnClickListener(new b(this, transfrom));
                b("challenge_transform_button_show");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private m(Context context, j jVar) {
        super(context, jVar, null);
        l.d(context, "");
    }

    private final void a(int i2, TextView textView) {
        List<String> attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i2);
        if (size >= 0) {
            textView.setVisibility(0);
            textView.setText(attrs.get(size));
            return;
        }
        textView.setVisibility(4);
    }

    public /* synthetic */ m(Context context, j jVar, byte b2) {
        this(context, jVar);
    }
}
