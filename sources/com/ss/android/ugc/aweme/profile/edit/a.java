package com.ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.profile.f.a;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.profile.ui.ap;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.utils.im;
import com.ss.android.ugc.aweme.utils.in;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.profile.presenter.a implements a.AbstractC2970a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f116088a;

    /* renamed from: f  reason: collision with root package name */
    private List<d> f116089f;

    static {
        Covode.recordClassIndex(74885);
    }

    @Override // com.ss.android.ugc.aweme.profile.f.a.AbstractC2970a
    public final void a() {
        this.f116088a = true;
        if (this.f116509c != null) {
            ((ap) this.f116509c).e();
        }
    }

    public final void b() {
        if (this.f116508b != null && !TextUtils.isEmpty(this.f116511e)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d("source", "0"));
            this.f116089f = arrayList;
            ((com.ss.android.ugc.aweme.profile.f.a) this.f116508b).a(this.f116511e, this.f116089f);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.f.a.AbstractC2970a
    public final void a(String str) {
        if (this.f116509c != null) {
            ((ap) this.f116509c).a(str);
        }
        this.f116511e = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String message2;
        String str;
        if (this.f116509c == null) {
            return;
        }
        if (message.obj instanceof Exception) {
            if (this.f116510d >= 4 || this.f116508b == null) {
                Exception exc = (Exception) message.obj;
                c cVar = new c();
                boolean z = exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
                if (z) {
                    message2 = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorMsg();
                } else {
                    message2 = exc.getMessage();
                }
                c a2 = cVar.a("errorDesc", message2);
                if (z) {
                    str = new StringBuilder().append(((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode()).toString();
                } else {
                    str = "-1";
                }
                b.a("aweme_avartar_upload_error_rate", 1, a2.a("errorCode", str).a());
                ((ap) this.f116509c).a((Exception) message.obj);
                if (this.f116508b != null) {
                    this.f116508b.g();
                    return;
                }
                return;
            }
            this.f116510d++;
            ((com.ss.android.ugc.aweme.profile.f.a) this.f116508b).a((this.f116510d << 1) * 1000, this.f116089f);
        } else if (message.obj instanceof AvatarUri) {
            ((ap) this.f116509c).a((AvatarUri) message.obj);
            b.a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.a
    public final void b(Activity activity, Fragment fragment) {
        this.f116508b = new com.ss.android.ugc.aweme.profile.f.a(activity, fragment, new WeakHandler(this), this);
    }

    public final void a(Activity activity, Fragment fragment) {
        this.f116508b = new com.ss.android.ugc.aweme.profile.f.a(activity, fragment, new WeakHandler(this), this);
    }

    @Override // com.ss.android.ugc.aweme.profile.f.a.AbstractC2970a
    public final void a(Activity activity, View view) {
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        h.f116622a.startHeaderDetailActivity(activity, new com.ss.android.ugc.aweme.utils.ap().a("extra_zoom_info", ZoomAnimationUtils.a(view)).a("enable_edit_img", false).a("enable_download_img", true).a("uri", TextUtils.isEmpty(this.f116511e) ? in.a(im.a(curUser)) : new String[]{Uri.parse("file://" + this.f116511e).toString()}).a("share_info", curUser).f142646a);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.a
    public final boolean a(int i2, int i3, Intent intent) {
        return super.a(i2, i3, intent);
    }
}
