package com.ss.android.ugc.aweme.setting.page.accessibility;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.challenge.d.b;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.setting.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f122374a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122375b;

    static {
        Covode.recordClassIndex(80238);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        return new com.ss.android.ugc.aweme.be.h(o.a(), this.f122375b, new View$OnClickListenerC3163a(this), false, null, null, null, null, null, false, 16376);
    }

    public a(Fragment fragment) {
        l.d(fragment, "");
        this.f122374a = fragment.getContext();
        String string = fragment.getString(R.string.bf5);
        l.b(string, "");
        this.f122375b = string;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3163a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122376a;

        static {
            Covode.recordClassIndex(80239);
        }

        View$OnClickListenerC3163a(a aVar) {
            this.f122376a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f122376a.g();
            boolean z = ((com.ss.android.ugc.aweme.be.h) this.f122376a.l()).f68599c;
            Context context = this.f122376a.f122374a;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            c.a(context, "dynamic_cover", str);
            d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_app", 0).edit().putBoolean("use_dynamic_cover", z).apply();
            com.ss.android.ugc.aweme.base.h.a.f68130a.put(com.ss.android.ugc.aweme.base.h.a.b("aweme_app", "use_dynamic_cover"), Boolean.valueOf(z));
            com.ss.android.ugc.d.a.c.a(new b(!z));
        }
    }
}
