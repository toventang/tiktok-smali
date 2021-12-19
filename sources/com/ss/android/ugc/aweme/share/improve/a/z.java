package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.ew;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class z implements h {

    /* renamed from: a  reason: collision with root package name */
    public final a f123817a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123818b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveEvent f123819c;

    static {
        Covode.recordClassIndex(81263);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.bq5;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report_music";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_flag;
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

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String str;
        String str2;
        l.d(context, "");
        l.d(sharePackage, "");
        String eventID = this.f123819c.getEventID();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "report");
        a aVar = this.f123817a;
        if (aVar != null) {
            aVar.b("live_event_operation", jSONObject);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "live_event").appendQueryParameter("object_id", eventID);
        User organizer = this.f123819c.getOrganizer();
        if (organizer == null || (str = organizer.getUid()) == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.compliance.api.a.a().a(b.a(context), appendQueryParameter.appendQueryParameter("owner_id", str));
        d dVar = new d();
        User organizer2 = this.f123819c.getOrganizer();
        if (organizer2 != null) {
            str2 = organizer2.getSecUid();
        } else {
            str2 = null;
        }
        d a2 = dVar.a("author_id", str2).a("object_type", "live_event").a("object_id", eventID).a("enter_method", "button");
        String str3 = this.f123818b;
        l.b(a2, "");
        ew.a(str3, a2);
        r.a("click_report", a2.f66730a);
    }

    public z(LiveEvent liveEvent, a aVar, String str) {
        l.d(liveEvent, "");
        this.f123819c = liveEvent;
        this.f123817a = aVar;
        this.f123818b = str;
    }
}
