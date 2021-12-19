package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.b;
import com.ss.android.ugc.aweme.api.IZeroRatingService;
import com.ss.android.ugc.aweme.api.d;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f122470a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122471b;

    /* renamed from: c  reason: collision with root package name */
    private final String f122472c;

    static {
        Covode.recordClassIndex(80316);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.e, com.ss.android.ugc.aweme.dc.a
    public final void ce_() {
        IZeroRatingService f2 = ZeroRatingServiceImpl.f();
        l.b(f2, "");
        f2.c().c();
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        String str = this.f122471b;
        String str2 = this.f122472c;
        IZeroRatingService f2 = ZeroRatingServiceImpl.f();
        l.b(f2, "");
        return new com.ss.android.ugc.aweme.be.h(f2.b(), str, new a(this), false, null, null, null, null, str2, false, 15352);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122473a;

        static {
            Covode.recordClassIndex(80317);
        }

        a(c cVar) {
            this.f122473a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f122473a.g();
            final boolean z = ((com.ss.android.ugc.aweme.be.h) this.f122473a.l()).f68599c;
            ZeroRatingServiceImpl.f().a(z, new b.a(this) {
                /* class com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f122474a;

                static {
                    Covode.recordClassIndex(80318);
                }

                @Override // com.bytedance.sdk.b.b.a
                public final void a() {
                    String str;
                    IZeroRatingService f2 = ZeroRatingServiceImpl.f();
                    l.b(f2, "");
                    d c2 = f2.c();
                    if (z) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c2.a(str);
                }

                @Override // com.bytedance.sdk.b.b.a
                public final void b() {
                    this.f122474a.f122473a.g();
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f122474a.f122473a.f122470a).a(R.string.bp3).a();
                }

                {
                    this.f122474a = r1;
                }
            });
        }
    }

    public c(Fragment fragment) {
        l.d(fragment, "");
        String string = fragment.getString(R.string.dqx);
        l.b(string, "");
        this.f122471b = string;
        String string2 = fragment.getString(R.string.gb8);
        l.b(string2, "");
        this.f122472c = string2;
        this.f122470a = fragment.getContext();
    }
}
