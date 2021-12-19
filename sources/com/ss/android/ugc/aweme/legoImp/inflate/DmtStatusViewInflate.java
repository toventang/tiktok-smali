package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.feed.ui.az;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class DmtStatusViewInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f107675a;

    /* renamed from: b  reason: collision with root package name */
    public a f107676b = new a((byte) 0);

    static {
        Covode.recordClassIndex(68884);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public View.OnClickListener f107677a;

        static {
            Covode.recordClassIndex(68885);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f107677a.onClick(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        try {
            if (com.ss.android.ugc.aweme.lego.f.a.a(context)) {
                this.f107675a = a(context, this.f107676b);
            }
        } catch (Exception unused) {
        }
    }

    public static DmtStatusView a(Context context, View.OnClickListener onClickListener) {
        az azVar = new az(context);
        azVar.a(a.f107685a, b.f107686a, new c(context, onClickListener));
        azVar.d(1);
        azVar.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.n4));
        azVar.c(0);
        return azVar;
    }
}
