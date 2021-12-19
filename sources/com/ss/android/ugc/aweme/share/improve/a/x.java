package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class x implements h {

    /* renamed from: a  reason: collision with root package name */
    public final a f123812a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveEvent f123813b;

    static {
        Covode.recordClassIndex(81260);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.bq_;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "edit_live_event";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_pen_on_doc;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public x(LiveEvent liveEvent, a aVar) {
        l.d(liveEvent, "");
        this.f123813b = liveEvent;
        this.f123812a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        this.f123813b.getEventID();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "edit");
        a aVar = this.f123812a;
        if (aVar != null) {
            aVar.b("live_event_operation", jSONObject);
        }
    }
}
