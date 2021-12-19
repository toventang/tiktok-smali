package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ah.b.d;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.a.c;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.b.b;
import org.json.JSONObject;

public final class br extends e<JSONObject, a> implements com.bytedance.android.livesdk.browser.jsbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    public b f14627a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f14628b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdk.l.a f14629c;

    /* renamed from: d  reason: collision with root package name */
    g f14630d;

    static {
        Covode.recordClassIndex(8126);
    }

    public final void a() {
        com.bytedance.android.livesdk.l.a aVar = this.f14629c;
        if (aVar != null) {
            aVar.dismiss();
            this.f14629c = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14627a;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14628b = null;
        this.f14630d = null;
    }

    public br(Fragment fragment) {
        this.f14628b = fragment;
    }

    static final class a {
        @c(a = "code")

        /* renamed from: a  reason: collision with root package name */
        int f14641a;
        @c(a = "uri")

        /* renamed from: b  reason: collision with root package name */
        String f14642b;
        @c(a = "url")

        /* renamed from: c  reason: collision with root package name */
        String f14643c;

        static {
            Covode.recordClassIndex(8131);
        }

        private a(String str, String str2) {
            this.f14641a = 1;
            this.f14642b = str;
            this.f14643c = str2;
        }

        /* synthetic */ a(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final g gVar) {
        final JSONObject jSONObject2 = jSONObject;
        this.f14630d = gVar;
        int optInt = jSONObject2.optInt("action_type", 0);
        if (optInt == 0) {
            f.a(p.a(gVar.f35646a)).a(new d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.br.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8127);
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void b(String... strArr) {
                    n.a(gVar.f35646a, 2131234317, (int) R.string.gma);
                    br.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void a(String... strArr) {
                    int optInt = jSONObject2.optInt("duration_limit", 10);
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (br.this.f14628b.getActivity() == null) {
                        br.this.finishWithFailure();
                    } else {
                        br.this.f14628b.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            f.a(p.a(gVar.f35646a)).a(new d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.br.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8128);
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void b(String... strArr) {
                    n.a(gVar.f35646a, 2131234317, (int) R.string.gma);
                    br.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    if (br.this.f14628b.getActivity() == null) {
                        br.this.finishWithFailure();
                    } else {
                        br.this.f14628b.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.c.a
    public final void a(int i2, int i3, final Intent intent) {
        if (9001 != i2 && 9002 != i2) {
            return;
        }
        if (-1 != i3 || intent == null || intent.getData() == null) {
            a();
            return;
        }
        androidx.fragment.app.e activity = this.f14628b.getActivity();
        if (activity == null) {
            a();
            return;
        }
        final byte[] a2 = com.bytedance.android.livesdk.utils.g.a(activity, intent.getData());
        if (a2 == null || a2.length == 0) {
            a();
            return;
        }
        a.C0382a aVar = new a.C0382a(activity);
        aVar.f18266c = false;
        aVar.f18265b = y.a((int) R.string.gty);
        com.bytedance.android.livesdk.l.a a3 = aVar.a();
        this.f14629c = a3;
        a3.show();
        f.a(this.f14628b.getActivity()).a(new d() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.br.AnonymousClass3 */

            static {
                Covode.recordClassIndex(8129);
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void b(String... strArr) {
                com.bytedance.android.live.core.c.a.a(3, "RecordVideoMethod", "onPermissionDenied: ");
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void a(String... strArr) {
                br brVar = br.this;
                byte[] bArr = a2;
                Uri data = intent.getData();
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, "temp" + System.currentTimeMillis()));
                ((UploadApi) com.bytedance.android.live.network.e.a().a(UploadApi.class)).upload(multipartTypedOutput).a(new com.bytedance.android.livesdk.util.rxutils.f()).a_(new ae<com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.user.c>>(data) {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.br.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Uri f14639a;

                    static {
                        Covode.recordClassIndex(8130);
                    }

                    @Override // f.a.ae
                    public final void onSubscribe(b bVar) {
                        br.this.f14627a = bVar;
                    }

                    @Override // f.a.ae
                    public final void onError(Throwable th) {
                        Context context;
                        if (!(br.this.f14628b == null || (context = br.this.f14628b.getContext()) == null)) {
                            com.bytedance.android.live.core.e.b.a.a(context, th, null);
                        }
                        br.this.a();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.ae
                    public final /* synthetic */ void onSuccess(com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.user.c> dVar) {
                        br brVar = br.this;
                        com.bytedance.android.live.base.model.user.c cVar = (com.bytedance.android.live.base.model.user.c) dVar.data;
                        Uri uri = this.f14639a;
                        if (brVar.f14629c != null) {
                            brVar.f14629c.dismiss();
                            brVar.f14629c = null;
                        }
                        try {
                            String str = cVar.f7455a;
                            com.bytedance.android.livesdk.browser.f.d.a();
                            a aVar = new a(str, com.bytedance.android.livesdk.browser.f.d.a(brVar.f14630d.f35646a, uri), (byte) 0);
                            brVar.f14630d.a("H5_uploadVideoStatus", aVar);
                            brVar.finishWithResult(aVar);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }

                    {
                        this.f14639a = r2;
                    }
                });
            }
        }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
