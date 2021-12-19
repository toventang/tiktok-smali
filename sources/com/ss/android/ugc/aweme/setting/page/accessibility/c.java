package com.ss.android.ugc.aweme.setting.page.accessibility;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.dc.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f122379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122380b;

    static {
        Covode.recordClassIndex(80241);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        String str = this.f122379a;
        String str2 = this.f122380b;
        boolean z = true;
        if (com.ss.android.ugc.aweme.compliance.api.a.d().h() != 1) {
            z = false;
        }
        return new com.ss.android.ugc.aweme.be.h(z, str, new a(this), false, null, null, null, null, str2, false, 15352);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122381a;

        static {
            Covode.recordClassIndex(80242);
        }

        a(c cVar) {
            this.f122381a = cVar;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            this.f122381a.g();
            boolean z = ((com.ss.android.ugc.aweme.be.h) this.f122381a.l()).f68599c;
            IComplianceBusinessService d2 = com.ss.android.ugc.aweme.compliance.api.a.d();
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            d2.a(i2, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.setting.page.accessibility.c.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(80243);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f122381a.g();
                    return z.f158842a;
                }
            });
        }
    }

    public c(Fragment fragment) {
        l.d(fragment, "");
        String string = fragment.getString(R.string.dqj);
        l.b(string, "");
        this.f122379a = string;
        String string2 = fragment.getString(R.string.dqh);
        l.b(string2, "");
        this.f122380b = string2;
    }
}
