package com.ss.android.ugc.aweme.profile.presenter;

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
import com.ss.android.ugc.aweme.profile.f.p;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class a implements WeakHandler.IHandler, p.a {

    /* renamed from: a  reason: collision with root package name */
    private WeakHandler f116507a = new WeakHandler(this);

    /* renamed from: b  reason: collision with root package name */
    public p f116508b;

    /* renamed from: c  reason: collision with root package name */
    public p f116509c;

    /* renamed from: d  reason: collision with root package name */
    protected int f116510d;

    /* renamed from: e  reason: collision with root package name */
    protected String f116511e;

    /* renamed from: f  reason: collision with root package name */
    private List<d> f116512f;

    static {
        Covode.recordClassIndex(75296);
    }

    @Override // com.ss.android.ugc.aweme.profile.f.p.a
    public final void c() {
        this.f116510d = 0;
    }

    public final void d() {
        p pVar = this.f116508b;
        if (pVar != null) {
            pVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.f.p.a
    public final void b(String str) {
        this.f116511e = str;
        p pVar = this.f116509c;
        if (pVar != null) {
            pVar.b(str);
        }
    }

    public final void a(int i2) {
        if (i2 != -1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d("source", String.valueOf(i2)));
            a(this.f116511e, arrayList);
            return;
        }
        a(this.f116511e, null);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String message2;
        String str;
        String str2;
        if (this.f116509c == null) {
            return;
        }
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            Exception exc = (Exception) message.obj;
            if (this.f116508b != null) {
                int i2 = this.f116510d;
                if (!(exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && !(exc instanceof FileNotFoundException) && !(exc instanceof NullPointerException) && i2 <= 3) {
                    if (exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    } else {
                        str2 = "";
                    }
                    if (!str2.contains("Content-Length") && (!str2.contains("expected") || !str2.contains("received"))) {
                        int i3 = this.f116510d + 1;
                        this.f116510d = i3;
                        this.f116508b.a((i3 << 1) * 1000, this.f116511e, this.f116512f);
                        return;
                    }
                }
            }
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
            b.a("aweme_avartar_upload_error_rate", 1, a2.a("errorCode", str).a("imageUrl", this.f116511e).a());
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) message.obj);
            this.f116509c.b((Exception) message.obj);
        } else if (message.obj instanceof AvatarUri) {
            this.f116509c.b((AvatarUri) message.obj);
            b.a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
        }
    }

    private void a(String str, List<d> list) {
        this.f116511e = str;
        this.f116512f = list;
        p pVar = this.f116508b;
        if (pVar != null) {
            pVar.b(str, list);
        }
    }

    public void b(Activity activity, Fragment fragment) {
        this.f116508b = new p(activity, fragment, new WeakHandler(this), this);
    }

    public boolean a(int i2, int i3, Intent intent) {
        p pVar = this.f116508b;
        if (pVar == null) {
            return false;
        }
        return pVar.a(i2, i3, intent);
    }

    public final void a(Activity activity, View view, User user) {
        String uri;
        p pVar = this.f116508b;
        if (pVar != null) {
            if (TextUtils.isEmpty(this.f116511e)) {
                uri = null;
            } else {
                uri = Uri.parse("file://" + this.f116511e).toString();
            }
            pVar.a(activity, view, user, uri);
        }
    }
}
