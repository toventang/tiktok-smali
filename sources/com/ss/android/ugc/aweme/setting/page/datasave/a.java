package com.ss.android.ugc.aweme.setting.page.datasave;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.setting.api.DataSaverApi;
import com.ss.android.ugc.aweme.setting.l;
import com.zhiliaoapp.musically.R;

public final class a extends h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f122453a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122454b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f122455c;

    static {
        Covode.recordClassIndex(80308);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        return new com.ss.android.ugc.aweme.be.h(l.a(), this.f122453a, this, false, null, null, null, null, this.f122454b, false, 15352);
    }

    public final void c() {
        g();
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f122455c).a(R.string.bpf).a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.a$a  reason: collision with other inner class name */
    static final class C3170a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f122457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f122458c;

        static {
            Covode.recordClassIndex(80309);
        }

        C3170a(a aVar, int i2, boolean z) {
            this.f122456a = aVar;
            this.f122457b = i2;
            this.f122458c = z;
        }

        @Override // b.g
        public final Object then(i<BaseResponse> iVar) {
            String str;
            h.f.b.l.b(iVar, "");
            if (iVar.b() || iVar.c()) {
                this.f122456a.c();
                return null;
            } else if (!iVar.a()) {
                return null;
            } else {
                if (l.a(this.f122457b)) {
                    if (this.f122458c) {
                        str = "data_saver_on";
                    } else {
                        str = "data_saver_off";
                    }
                    r.onEventV3(str);
                    return null;
                }
                this.f122456a.c();
                return null;
            }
        }
    }

    public a(Fragment fragment) {
        h.f.b.l.d(fragment, "");
        String string = fragment.getString(R.string.b4l);
        h.f.b.l.b(string, "");
        this.f122453a = string;
        String string2 = fragment.getString(R.string.b4k);
        h.f.b.l.b(string2, "");
        this.f122454b = string2;
        this.f122455c = fragment.getContext();
    }

    public final void onClick(View view) {
        int i2;
        ClickAgent.onClick(view);
        g();
        boolean z = ((com.ss.android.ugc.aweme.be.h) l()).f68599c;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        C3170a aVar = new C3170a(this, i2, z);
        h.f.b.l.d(aVar, "");
        DataSaverApi.a.f122045a.setDataSaverSetting(i2).a(aVar, i.f4826c, null);
    }
}
