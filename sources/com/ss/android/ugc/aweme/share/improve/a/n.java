package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.gif.a;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f123794a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123795b;

    static {
        Covode.recordClassIndex(81248);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fsj;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "gif";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_gif;
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
    public final int g() {
        return R.raw.icon_gif;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f123794a.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
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

    public n(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123794a = aweme;
        this.f123795b = str;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        ACLCommonShare downloadGeneral;
        Activity a2;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        l.d(context, "");
        l.d(sharePackage, "");
        AwemeACLShare awemeACLShareInfo = this.f123794a.getAwemeACLShareInfo();
        if (!(awemeACLShareInfo == null || (downloadGeneral2 = awemeACLShareInfo.getDownloadGeneral()) == null || (toastMsg = downloadGeneral2.getToastMsg()) == null || toastMsg.length() <= 0)) {
            new a(context).a(toastMsg).a();
        }
        AwemeACLShare awemeACLShareInfo2 = this.f123794a.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 != null && (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0 && (a2 = b.a(context)) != null) {
            Aweme aweme = this.f123794a;
            String str = this.f123795b;
            String a3 = ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f123794a));
            l.b(a3, "");
            l.d(a2, "");
            l.d(aweme, "");
            l.d(str, "");
            l.d(a3, "");
            r.a("save_as_gif", new s().a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("enter_from", str).a("log_pb", a3).a());
            com.bytedance.ies.powerpermissions.l.f34469d.a((e) a2, null).a("android.permission.WRITE_EXTERNAL_STORAGE").a(new a.C3200a(ShareDependService.a.a().a(), a2, aweme, str, a3));
        }
    }
}
