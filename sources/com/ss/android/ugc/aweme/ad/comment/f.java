package com.ss.android.ugc.aweme.ad.comment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.ad.comment.a.c;
import com.ss.android.ugc.aweme.ad.comment.d.a;
import com.ss.android.ugc.aweme.ad.comment.d.m;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;

public final class f extends LinearLayout implements View.OnClickListener, u<b> {

    /* renamed from: a  reason: collision with root package name */
    public ac f65681a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f65682b;

    /* renamed from: c  reason: collision with root package name */
    public m f65683c;

    /* renamed from: d  reason: collision with root package name */
    public c f65684d;

    /* renamed from: e  reason: collision with root package name */
    private CircleImageView f65685e;

    /* renamed from: f  reason: collision with root package name */
    private TuxTextView f65686f;

    /* renamed from: g  reason: collision with root package name */
    private TuxTextView f65687g;

    /* renamed from: h  reason: collision with root package name */
    private TuxTextView f65688h;

    /* renamed from: i  reason: collision with root package name */
    private TuxTextView f65689i;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f65690j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f65691k;

    /* renamed from: l  reason: collision with root package name */
    private DataCenter f65692l;

    /* renamed from: m  reason: collision with root package name */
    private final float f65693m;

    static {
        Covode.recordClassIndex(40416);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private final void d() {
        String str;
        TuxTextView tuxTextView = this.f65687g;
        if (tuxTextView != null) {
            ac acVar = this.f65681a;
            if (acVar != null) {
                str = acVar.title;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    private final void e() {
        String str;
        TuxTextView tuxTextView = this.f65688h;
        if (tuxTextView != null) {
            ac acVar = this.f65681a;
            if (acVar != null) {
                str = acVar.tipsText;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    private final void g() {
        IAdCommentDepend iAdCommentDepend = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.a(getContext(), this.f65681a, this.f65682b);
        }
    }

    private final void i() {
        if (h()) {
            boolean z = this.f65691k;
        }
    }

    public static final class a implements a.AbstractC1465a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f65694a;

        static {
            Covode.recordClassIndex(40417);
        }

        @Override // com.ss.android.ugc.aweme.ad.comment.d.a.AbstractC1465a
        public final void a() {
            m mVar = this.f65694a.f65683c;
            if (mVar != null) {
                mVar.a();
            }
            c cVar = this.f65694a.f65684d;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.ad.comment.d.a.AbstractC1465a
        public final void c() {
            String str;
            IAdCommentDepend iAdCommentDepend = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
            if (iAdCommentDepend != null) {
                Context context = this.f65694a.getContext();
                Aweme aweme = this.f65694a.f65682b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                iAdCommentDepend.a(context, str);
            }
        }

        @Override // com.ss.android.ugc.aweme.ad.comment.d.a.AbstractC1465a
        public final void b() {
            String str;
            IAdCommentDepend iAdCommentDepend = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
            if (iAdCommentDepend != null) {
                Context context = this.f65694a.getContext();
                String a2 = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a.a();
                ac acVar = this.f65694a.f65681a;
                if (acVar != null) {
                    str = acVar.webUrl;
                } else {
                    str = null;
                }
                iAdCommentDepend.a(context, a2, str);
            }
            this.f65694a.a("otherclick", "plan");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.f65694a = fVar;
        }
    }

    private final void a() {
        b();
        c();
        d();
        e();
        f();
        i();
    }

    private final void b() {
        String str;
        TuxTextView tuxTextView = this.f65686f;
        if (tuxTextView != null) {
            ac acVar = this.f65681a;
            if (acVar != null) {
                str = acVar.source;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.f65686f;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(43);
        }
    }

    private final void f() {
        String str;
        TuxTextView tuxTextView = this.f65689i;
        if (tuxTextView != null) {
            ac acVar = this.f65681a;
            if (acVar != null) {
                str = acVar.buttonText;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        com.ss.android.ugc.aweme.notification.g.a.a(this.f65689i);
    }

    private final boolean h() {
        String str;
        ac acVar = this.f65681a;
        String str2 = null;
        if (acVar != null) {
            str = acVar.downloadUrl;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ac acVar2 = this.f65681a;
        if (acVar2 != null) {
            str2 = acVar2.type;
        }
        if (TextUtils.equals(str2, "app")) {
            return true;
        }
        return false;
    }

    private final void c() {
        UrlModel urlModel;
        com.facebook.drawee.f.a aVar;
        e eVar;
        com.facebook.drawee.f.a aVar2;
        e eVar2;
        CircleImageView circleImageView = this.f65685e;
        if (!(circleImageView == null || (aVar2 = (com.facebook.drawee.f.a) circleImageView.getHierarchy()) == null || (eVar2 = aVar2.f47454a) == null)) {
            eVar2.c((float) n.a(0.5d));
        }
        CircleImageView circleImageView2 = this.f65685e;
        if (!(circleImageView2 == null || (aVar = (com.facebook.drawee.f.a) circleImageView2.getHierarchy()) == null || (eVar = aVar.f47454a) == null)) {
            eVar.f47480f = androidx.core.content.b.c(getContext(), R.color.b6);
        }
        CircleImageView circleImageView3 = this.f65685e;
        ac acVar = this.f65681a;
        if (acVar != null) {
            urlModel = acVar.avatarIcon;
        } else {
            urlModel = null;
        }
        com.ss.android.ugc.aweme.base.e.a(circleImageView3, urlModel);
    }

    public final void setOnDislikeCommentAdListener(c cVar) {
        l.d(cVar, "");
        this.f65684d = cVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f65692l = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("comment_aweme_and_link", this, true).a("comment_dialog_state", this, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(2259);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9v, this);
        this.f65686f = (TuxTextView) inflate.findViewById(R.id.title);
        this.f65685e = (CircleImageView) inflate.findViewById(R.id.or);
        this.f65687g = (TuxTextView) inflate.findViewById(R.id.adh);
        this.f65688h = (TuxTextView) inflate.findViewById(R.id.cb2);
        this.f65689i = (TuxTextView) inflate.findViewById(R.id.eqa);
        this.f65690j = (TuxTextView) inflate.findViewById(R.id.eq2);
        TuxTextView tuxTextView = this.f65689i;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(this);
        }
        TuxTextView tuxTextView2 = this.f65688h;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f65685e;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        TuxTextView tuxTextView3 = this.f65686f;
        if (tuxTextView3 != null) {
            tuxTextView3.setOnClickListener(this);
        }
        TuxTextView tuxTextView4 = this.f65687g;
        if (tuxTextView4 != null) {
            tuxTextView4.setOnClickListener(this);
        }
        setOnClickListener(this);
        this.f65693m = com.bytedance.common.utility.n.b(context, 51.5f);
        MethodCollector.o(2259);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(b bVar) {
        p pVar;
        Aweme aweme;
        ac acVar;
        if (bVar != null) {
            String str = bVar.f67014a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    boolean a2 = bVar.a();
                    if (a2 == null) {
                        a2 = false;
                    }
                    if (l.a(a2, (Object) 5)) {
                        m mVar = this.f65683c;
                        if (mVar != null) {
                            mVar.a();
                        }
                    } else if (l.a(a2, (Object) 3)) {
                        m mVar2 = this.f65683c;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    } else if (l.a(a2, (Object) 6)) {
                        m mVar3 = this.f65683c;
                        if (mVar3 != null) {
                            mVar3.a();
                        }
                    } else if (l.a(a2, (Object) 7)) {
                        i();
                    } else {
                        l.a(a2, (Object) 8);
                    }
                }
            } else if (str.equals("comment_aweme_and_link") && (pVar = (p) bVar.a()) != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                this.f65682b = aweme;
                p pVar2 = (p) bVar.a();
                if (pVar2 != null && (acVar = (ac) pVar2.getSecond()) != null) {
                    this.f65681a = acVar;
                    Aweme aweme2 = this.f65682b;
                    if (aweme2 == null) {
                        l.b();
                    }
                    a(acVar, aweme2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.comment.f.onClick(android.view.View):void");
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    public final void a(ac acVar, Aweme aweme) {
        l.d(acVar, "");
        l.d(aweme, "");
        this.f65681a = acVar;
        this.f65682b = aweme;
        a();
    }

    public final void a(String str, String str2) {
        IAdCommentDepend iAdCommentDepend = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.a(str, getContext(), this.f65681a, this.f65682b, str2);
        }
    }
}
