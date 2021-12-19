package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.be.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.feed.experiment.c;
import com.ss.android.ugc.aweme.setting.page.base.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

@com.bytedance.ies.powerpage.a.a
public final class BackgroundAudioPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: e  reason: collision with root package name */
    private final h f122421e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f122422f = i.a((h.f.a.a) new a(this));

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f122423g;

    static {
        Covode.recordClassIndex(80276);
    }

    private final BGAudioViewModel d() {
        return (BGAudioViewModel) this.f122421e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122423g == null) {
            this.f122423g = new SparseArray();
        }
        View view = (View) this.f122423g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122423g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122423g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.az3;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    static final class a extends m implements h.f.a.a<dm> {
        final /* synthetic */ BackgroundAudioPage this$0;

        static {
            Covode.recordClassIndex(80277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BackgroundAudioPage backgroundAudioPage) {
            super(0);
            this.this$0 = backgroundAudioPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb4);
            l.b(powerList, "");
            return new dm(powerList);
        }
    }

    static final class b extends m implements h.f.a.a<BGAudioViewModel> {
        final /* synthetic */ BackgroundAudioPage this$0;

        static {
            Covode.recordClassIndex(80278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BackgroundAudioPage backgroundAudioPage) {
            super(0);
            this.this$0 = backgroundAudioPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BGAudioViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(BGAudioViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.a
    public final void h() {
        String str;
        String str2;
        super.h();
        Boolean value = d().f122419a.getValue();
        c.a value2 = d().f122420b.getValue();
        if (value != null) {
            if (value.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            d a2 = new d().a("enter_from", "settings_page").a("status", str);
            if (value2 != null) {
                str2 = value2.toMobString();
            } else {
                str2 = null;
            }
            r.a("background_audio_status", a2.a("play_order", str2).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.a
    public final void a(Activity activity) {
        l.d(activity, "");
        dm dmVar = (dm) this.f122422f.getValue();
        dmVar.a(new a(this));
        String string = activity.getString(R.string.vw);
        l.b(string, "");
        dmVar.a(new com.ss.android.ugc.aweme.dc.d(new e(string, false, false, 14)));
        dmVar.a(new c(this, b.PLAY_IN_ORDER));
        dmVar.a(new c(this, b.REPEAT));
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.setting.page.base.b.a(this, "", new b.a(this));
    }
}
