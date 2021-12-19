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

public final class aa implements h {

    /* renamed from: a  reason: collision with root package name */
    public final a f123592a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveEvent f123593b;

    static {
        Covode.recordClassIndex(81131);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.gfh;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "unregister_live_event";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_refund_black;
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

    public aa(LiveEvent liveEvent, a aVar) {
        l.d(liveEvent, "");
        this.f123593b = liveEvent;
        this.f123592a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "unregister");
        a aVar = this.f123592a;
        if (aVar != null) {
            aVar.b("live_event_operation", jSONObject);
        }
    }
}
