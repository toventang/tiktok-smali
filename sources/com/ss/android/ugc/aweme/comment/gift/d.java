package com.ss.android.ugc.aweme.comment.gift;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;

public final class d extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71849b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final IVideoGiftService f71850a;

    /* renamed from: c  reason: collision with root package name */
    private final e f71851c;

    static {
        Covode.recordClassIndex(44189);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44190);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f71852a;

        static {
            Covode.recordClassIndex(44191);
        }

        b(d dVar) {
            this.f71852a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71852a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f71853a;

        static {
            Covode.recordClassIndex(44192);
        }

        c(d dVar) {
            this.f71853a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71853a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(eVar);
        l.d(eVar, "");
        this.f71851c = eVar;
        IVideoGiftService l2 = VideoGiftService.l();
        l.b(l2, "");
        this.f71850a = l2;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(632);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.il, (ViewGroup) null);
        if (inflate != null) {
            inflate.findViewById(R.id.a7r).setOnClickListener(new b(this));
            inflate.findViewById(R.id.cyq).setOnClickListener(new c(this));
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.dcn);
            l.b(tuxTextView, "");
            tuxTextView.setText(this.f71851c.getString(R.string.hb8));
            tuxTextView.setGravity(1);
            View findViewById = inflate.findViewById(R.id.dci);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(this.f71851c.getString(R.string.hb7));
            String b2 = this.f71850a.b();
            if (b2 != null) {
                v a2 = r.a(b2);
                a2.E = (SmartImageView) inflate.findViewById(R.id.dck);
                a2.v = w.CENTER_INSIDE;
                a2.c();
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f71851c.getWindowManager();
        l.b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(h.c((int) n.b(this.f71851c, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        MethodCollector.o(632);
    }
}
