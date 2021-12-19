package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Spannable;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.e.c;
import com.bytedance.android.live.broadcast.model.p;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.n.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.b.a;
import f.a.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i implements c, h.a {

    /* renamed from: e  reason: collision with root package name */
    private static int f8791e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static int f8792f = 1;

    /* renamed from: g  reason: collision with root package name */
    private static int f8793g = 750;

    /* renamed from: h  reason: collision with root package name */
    private static int f8794h = 750;

    /* renamed from: a  reason: collision with root package name */
    long f8795a;

    /* renamed from: b  reason: collision with root package name */
    Context f8796b;

    /* renamed from: c  reason: collision with root package name */
    h f8797c;

    /* renamed from: d  reason: collision with root package name */
    public final a f8798d = new a();

    /* renamed from: i  reason: collision with root package name */
    private Room f8799i;

    /* renamed from: j  reason: collision with root package name */
    private long f8800j;

    /* renamed from: k  reason: collision with root package name */
    private int f8801k;

    /* renamed from: l  reason: collision with root package name */
    private DialogInterface.OnClickListener f8802l = new j(this);

    /* renamed from: m  reason: collision with root package name */
    private DialogInterface.OnClickListener f8803m = new k(this);

    @Override // com.bytedance.android.live.n.h.a
    public final void a() {
        this.f8797c.b();
        this.f8798d.dispose();
    }

    @Override // com.bytedance.android.live.broadcast.api.e.c
    public final void e_() {
        this.f8798d.dispose();
        h hVar = this.f8797c;
        if (hVar != null) {
            hVar.b();
        }
    }

    static {
        Covode.recordClassIndex(4491);
    }

    /* access modifiers changed from: package-private */
    public final HashMap<String, String> b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(this.f8795a));
        hashMap.put("anchor_id", String.valueOf(this.f8800j));
        return hashMap;
    }

    public final void a(Throwable th) {
        String string;
        if (th instanceof FileNotFoundException) {
            string = this.f8796b.getString(R.string.gxj);
        } else if (th instanceof com.bytedance.android.live.a.a.b.a) {
            string = ((com.bytedance.android.live.a.a.b.a) th).getErrorMsg();
        } else {
            string = this.f8796b.getString(R.string.gzl);
        }
        this.f8797c.b();
        ao.a(this.f8796b, string, 0);
    }

    @Override // com.bytedance.android.live.broadcast.api.e.c
    public final void a(bv bvVar) {
        if (this.f8801k <= 0) {
            Spannable a2 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19370h, bvVar.f19370h.f19422b);
            Spannable a3 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19372j, bvVar.f19372j.f19422b);
            b.a aVar = new b.a(this.f8796b);
            aVar.f18284a = a2;
            aVar.f18286c = a3;
            b.a b2 = aVar.a((CharSequence) this.f8796b.getString(R.string.gli), this.f8802l, false).b((CharSequence) this.f8796b.getString(R.string.gpi), this.f8803m, false);
            b2.f18296m = false;
            b2.a().show();
            this.f8801k++;
            b.a.a("livesdk_change_cover_window_show").a((Map<String, String>) b()).b();
        } else if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(6, "LiveDefaultCoverController", "Reach the upper limit , do not show dialog");
        }
    }

    public i(Fragment fragment, Room room) {
        this.f8799i = room;
        this.f8796b = fragment.getContext();
        this.f8801k = 0;
        this.f8795a = this.f8799i.getId();
        this.f8800j = this.f8799i.getOwnerUserId();
        this.f8797c = l.a(fragment.getActivity(), fragment, "cover", f8791e, f8792f, f8793g, f8794h, this);
    }

    @Override // com.bytedance.android.live.n.h.a
    public final void a(final String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            a(new FileNotFoundException("avatar file don't exists in path".concat(String.valueOf(str))));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        d.a.a().b().uploadAvatar(multipartTypedOutput).a(new f()).a_(new ae<com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.user.a>>() {
            /* class com.bytedance.android.live.broadcast.widget.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4492);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
                i.this.f8798d.a(bVar);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                i.this.a(th);
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", "1");
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", th.toString());
                com.bytedance.android.live.core.d.c.a("ttlive_upload_cover_all", 1, jSONObject);
                com.bytedance.android.live.core.d.c.a("ttlive_upload_cover_error", 1, jSONObject);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.user.a> dVar) {
                com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.user.a> dVar2 = dVar;
                ((com.bytedance.android.live.base.model.user.a) dVar2.data).f7453c = str;
                i iVar = i.this;
                b.a.a("livesdk_upload_cover_success").a((Map<String, String>) iVar.b()).b();
                iVar.f8797c.b();
                ao.a(iVar.f8796b, iVar.f8796b.getString(R.string.gtm), 0);
                d.a.a().a().updateRoomInfo(iVar.f8795a, ((com.bytedance.android.live.base.model.user.a) dVar2.data).f7451a).a(new f()).b(new z<com.bytedance.android.live.network.response.d<p>>() {
                    /* class com.bytedance.android.live.broadcast.widget.i.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(4493);
                    }

                    @Override // f.a.z
                    public final void onComplete() {
                    }

                    @Override // f.a.z
                    public final void onSubscribe(f.a.b.b bVar) {
                        i.this.f8798d.a(bVar);
                    }

                    @Override // f.a.z
                    public final void onError(Throwable th) {
                        com.bytedance.android.live.core.c.a.a(6, "LiveDefaultCoverController", th.toString());
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.z
                    public final /* synthetic */ void onNext(com.bytedance.android.live.network.response.d<p> dVar) {
                        com.bytedance.android.live.network.response.d<p> dVar2 = dVar;
                        i iVar = i.this;
                        if (dVar2 != null) {
                            try {
                                if (dVar2.data == null || !((p) dVar2.data).f7952a.booleanValue()) {
                                    com.bytedance.android.live.core.c.a.a(6, "LiveDefaultCoverController", dVar2.toString());
                                    return;
                                }
                                if (Logger.debug()) {
                                    com.bytedance.android.live.core.c.a.a(3, "LiveDefaultCoverController", "update room cover info");
                                }
                                b.a.a("livesdk_cover_pass_audit").a((Map<String, String>) iVar.b()).b();
                            } catch (Exception e2) {
                                com.bytedance.android.live.core.c.a.a(6, "LiveDefaultCoverController", e2.toString());
                            }
                        }
                    }
                });
                com.bytedance.android.live.core.d.c.a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }
        });
    }

    @Override // com.bytedance.android.live.broadcast.api.e.c
    public final void a(int i2, int i3, Intent intent) {
        this.f8797c.a(i2, i3, intent);
    }
}
