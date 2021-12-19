package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.a;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.g;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.n.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.imagepipeline.o.c;
import f.a.ae;
import f.a.b.b;
import java.io.File;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f8786a;

    static {
        Covode.recordClassIndex(4488);
    }

    f(e eVar) {
        this.f8786a = eVar;
    }

    @Override // com.bytedance.android.live.n.h.a
    public final void a() {
    }

    @Override // com.bytedance.android.live.n.h.a
    public final void a(String str, String str2) {
        e eVar = this.f8786a;
        eVar.f8778e = str2;
        eVar.f8777d.a();
        File file = new File(str);
        if (!file.exists()) {
            eVar.a(new Exception("avatar file don't exists in path ".concat(String.valueOf(str))));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        d.a.a().b().uploadAvatar(multipartTypedOutput).a(new com.bytedance.android.livesdk.util.rxutils.f()).a_(new ae<com.bytedance.android.live.network.response.d<a>>(str) {
            /* class com.bytedance.android.live.broadcast.widget.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f8784a;

            static {
                Covode.recordClassIndex(4487);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                e.this.f8779f.a(bVar);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                e.this.a(th);
                com.bytedance.android.livesdk.ab.a b2 = b.a.b("ttlive_upload_cover_all", th);
                b2.f13428e = true;
                b2.a();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(com.bytedance.android.live.network.response.d<a> dVar) {
                Object valueOf;
                String obj;
                com.bytedance.android.live.network.response.d<a> dVar2 = dVar;
                ((a) dVar2.data).f7453c = this.f8784a;
                e eVar = e.this;
                a aVar = (a) dVar2.data;
                if (!eVar.f8776c.isViewValid()) {
                    eVar.f8778e = null;
                } else {
                    HSImageView hSImageView = eVar.f8774a;
                    String str = aVar.f7453c;
                    if (hSImageView != null && !TextUtils.isEmpty(str)) {
                        if (!str.startsWith("file://")) {
                            str = "file://".concat(String.valueOf(str));
                        }
                        hSImageView.setImageURI(c.a(Uri.parse(str)).a().mSourceUri);
                    }
                    eVar.f8780g.a(g.class, "new_cover");
                    eVar.f8781h = false;
                    eVar.f8775b.setAlpha(1.0f);
                    eVar.f8777d.b();
                    if (!TextUtils.isEmpty(aVar.f7451a)) {
                        eVar.f8782i = aVar;
                    }
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_cover_modify_over").a(eVar.f8780g).c("click").b("live").d("cover_edit").a("live_type", eVar.c()).a("shooting_date", eVar.f8778e).a("current_date", String.valueOf(System.currentTimeMillis())).a("cover_url", eVar.f8782i.f7451a);
                    Object obj2 = "0";
                    if (eVar.f8783j == null) {
                        valueOf = obj2;
                    } else {
                        valueOf = String.valueOf(eVar.f8783j.getId());
                    }
                    a2.a("anchor_id", String.valueOf(valueOf)).b();
                    eVar.f8778e = null;
                    User user = (User) u.a().b().a();
                    com.bytedance.android.livesdk.ab.b a3 = b.a.a("pm_live_photo_upload").a(eVar.f8780g).c("click").b("live").a("live_type", eVar.c());
                    if (user != null) {
                        obj2 = Long.valueOf(user.getId());
                    }
                    a3.a("anchor_id", String.valueOf(obj2)).b();
                }
                a aVar2 = (a) dVar2.data;
                if (aVar2 == null) {
                    com.bytedance.android.livesdk.ab.a d2 = c.a.d("ttlive_upload_cover_all");
                    d2.f13426c = true;
                    d2.a();
                    return;
                }
                String str2 = aVar2.f7451a;
                if (aVar2.f7452b == null) {
                    obj = "";
                } else {
                    obj = aVar2.f7452b.toString();
                }
                com.bytedance.android.livesdk.ab.a a4 = c.a.b("ttlive_upload_cover_all").a("cover", str2).a("cover_list", obj);
                a4.f13426c = true;
                a4.a();
            }

            {
                this.f8784a = r2;
            }
        });
        eVar.f8778e = str2;
    }
}
