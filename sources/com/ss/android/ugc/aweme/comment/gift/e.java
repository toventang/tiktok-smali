package com.ss.android.ugc.aweme.comment.gift;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.util.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import h.z;

public final class e extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71854b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final IVideoGiftService f71855a;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.fragment.app.e f71856c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f71857d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71858e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<z> f71859f;

    static {
        Covode.recordClassIndex(44193);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44194);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void dismiss() {
        this.f71859f.invoke();
        super.dismiss();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f71860a;

        static {
            Covode.recordClassIndex(44195);
        }

        b(e eVar) {
            this.f71860a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71860a.a("click_cancel");
            this.f71860a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f71861a;

        static {
            Covode.recordClassIndex(44196);
        }

        c(e eVar) {
            this.f71861a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71861a.a("click_ok");
            this.f71861a.dismiss();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        a("click_blank");
        dismiss();
        return true;
    }

    public final void a(String str) {
        d a2 = new d().a("enter_from", this.f71858e).a("group_id", ac.e(this.f71857d)).a("author_id", ac.a(this.f71857d));
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        d a3 = a2.a("user_id", g2.getCurUserId()).a("is_follow", s.b(this.f71857d)).a("is_like", s.a(this.f71857d)).a("enter_method", str);
        l.b(a3, "");
        r.a("dismiss_gift_interstitial", a3.f66730a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(734);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.il, (ViewGroup) null);
        if (inflate != null) {
            inflate.findViewById(R.id.a7r).setOnClickListener(new b(this));
            inflate.findViewById(R.id.cyq).setOnClickListener(new c(this));
            String a2 = this.f71855a.a();
            if (a2 != null) {
                v a3 = com.bytedance.lighten.a.r.a(a2);
                a3.E = (SmartImageView) inflate.findViewById(R.id.dck);
                a3.v = w.CENTER_INSIDE;
                a3.c();
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f71856c.getWindowManager();
        l.b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(h.c((int) n.b(this.f71856c, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        d a4 = new d().a("enter_from", this.f71858e).a("group_id", ac.e(this.f71857d)).a("author_id", ac.a(this.f71857d));
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        d a5 = a4.a("user_id", g2.getCurUserId()).a("is_follow", s.b(this.f71857d)).a("is_like", s.a(this.f71857d));
        l.b(a5, "");
        r.a("show_gift_interstitial", a5.f66730a);
        MethodCollector.o(734);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.e eVar, Aweme aweme, String str, h.f.a.a<z> aVar) {
        super(eVar);
        l.d(eVar, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(aVar, "");
        this.f71856c = eVar;
        this.f71857d = aweme;
        this.f71858e = str;
        this.f71859f = aVar;
        IVideoGiftService l2 = VideoGiftService.l();
        l.b(l2, "");
        this.f71855a = l2;
    }
}
