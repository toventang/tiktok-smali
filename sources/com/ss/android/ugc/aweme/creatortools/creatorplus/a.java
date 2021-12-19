package com.ss.android.ugc.aweme.creatortools.creatorplus;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.j.h;
import h.z;
import java.util.List;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static final C1823a f78399a = new C1823a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final e f78400b;

    /* renamed from: c  reason: collision with root package name */
    private final c f78401c;

    /* renamed from: d  reason: collision with root package name */
    private final String f78402d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<z> f78403e;

    static {
        Covode.recordClassIndex(48689);
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.a$a  reason: collision with other inner class name */
    public static final class C1823a {
        static {
            Covode.recordClassIndex(48690);
        }

        private C1823a() {
        }

        public /* synthetic */ C1823a(byte b2) {
            this();
        }
    }

    public final void dismiss() {
        this.f78403e.invoke();
        super.dismiss();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78404a;

        static {
            Covode.recordClassIndex(48691);
        }

        b(a aVar) {
            this.f78404a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78404a.dismiss();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        List<String> urlList;
        String str;
        MethodCollector.i(8766);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.v0, (ViewGroup) null);
        String str2 = "";
        if (inflate != null) {
            inflate.findViewById(R.id.cyq).setOnClickListener(new b(this));
            h hVar = this.f78401c.f78411d;
            if (hVar != null) {
                UrlModel urlModel = hVar.f78435a;
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) n.h((List) urlList)) == null)) {
                    v a2 = r.a(str);
                    a2.E = (SmartImageView) inflate.findViewById(R.id.dck);
                    a2.v = w.CENTER_INSIDE;
                    a2.c();
                }
                try {
                    TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.dcn);
                    l.b(tuxTextView, str2);
                    tuxTextView.setText(hVar.f78437c);
                    TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.dci);
                    l.b(tuxTextView2, str2);
                    tuxTextView2.setText(hVar.f78436b);
                    TuxTextView tuxTextView3 = (TuxTextView) inflate.findViewById(R.id.dcj);
                    l.b(tuxTextView3, str2);
                    tuxTextView3.setText(y.a((int) R.string.b3f));
                } catch (Exception e2) {
                    e2.getMessage();
                    Integer.valueOf(0);
                }
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f78400b.getWindowManager();
        l.b(windowManager, str2);
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(h.c((int) com.bytedance.common.utility.n.b(this.f78400b, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        d a3 = new d().a("enter_from", "creator_tools").a("enter_method", "click_grey_area");
        String str3 = this.f78401c.f78412e;
        if (str3 != null) {
            str2 = str3;
        }
        com.ss.android.ugc.aweme.common.r.a("show_creator_plus_popup", a3.a("feature", str2).f66730a);
        MethodCollector.o(8766);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar, c cVar, String str, h.f.a.a<z> aVar) {
        super(eVar);
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(str, "");
        l.d(aVar, "");
        this.f78400b = eVar;
        this.f78401c = cVar;
        this.f78402d = str;
        this.f78403e = aVar;
    }
}
