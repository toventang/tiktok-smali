package com.ss.android.ugc.aweme.commercialize.widget;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public abstract class AbsAdFeedWidget extends Widget implements u<b>, au {
    public Aweme o;
    public Fragment p;
    public String q;
    public boolean r;

    static {
        Covode.recordClassIndex(47018);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        this.r = false;
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
        this.r = true;
    }

    public void a() {
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_video_params", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        a aVar;
        super.a(view);
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null && (aVar = (a) dataCenter.a("ad_feed_video_params")) != null) {
            a(aVar);
        }
    }

    /* renamed from: a */
    public void onChanged(b bVar) {
        String str;
        a aVar;
        if (bVar != null && (str = bVar.f67014a) != null && str.hashCode() == 1512987055 && str.equals("ad_feed_video_params") && (aVar = (a) bVar.a()) != null) {
            a(aVar);
        }
    }

    public void a(a aVar) {
        l.d(aVar, "");
        this.o = aVar.f76333a;
        this.p = aVar.f76334b;
        this.q = aVar.f76335c;
    }
}
