package com.ss.android.ugc.aweme.sharedar.a.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.g;
import com.ss.android.ugc.aweme.sharedar.network.API;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.f.b.y;
import h.f.b.z;
import h.h.d;
import h.k.i;
import h.m.p;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124462b = {new y(f.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(f.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f124463d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f124464c;

    /* renamed from: e  reason: collision with root package name */
    private final d f124465e = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    /* renamed from: f  reason: collision with root package name */
    private final d f124466f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.sharedar.c.class);

    static {
        Covode.recordClassIndex(81726);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 1;
    }

    public final e b() {
        return (e) this.f124465e.a(this, f124462b[0]);
    }

    public final com.ss.android.ugc.aweme.sharedar.c c() {
        return (com.ss.android.ugc.aweme.sharedar.c) this.f124466f.a(this, f124462b[1]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81727);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ String $sessionUrl;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(81728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, String str) {
            super(0);
            this.this$0 = fVar;
            this.$sessionUrl = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Dialog a2 = l.f115658a.x().a(this.this$0.b(), new a(this));
            a2.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                /* class com.ss.android.ugc.aweme.sharedar.a.a.f.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f124467a;

                static {
                    Covode.recordClassIndex(81729);
                }

                {
                    this.f124467a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f124467a.this$0.f124464c = false;
                }
            });
            a2.show();
            return z.f158842a;
        }

        static final class a extends m implements h.f.a.b<g, z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(81730);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(g gVar) {
                g gVar2 = gVar;
                h.f.b.l.d(gVar2, "");
                gVar2.f124497a = false;
                gVar2.f124498b = new h.f.a.b<List<? extends User>, z>(this) {
                    /* class com.ss.android.ugc.aweme.sharedar.a.a.f.b.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(81731);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(List<? extends User> list) {
                        List<? extends User> list2 = list;
                        h.f.b.l.d(list2, "");
                        User user = (User) n.g((List) list2);
                        com.ss.android.ugc.aweme.sharedar.c c2 = this.this$0.this$0.this$0.c();
                        h.f.b.l.d(user, "");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sec_uid", user.getSecUid());
                        jSONObject.put("uid", user.getUid());
                        c2.c().a(16385, 3, 0, jSONObject.toString());
                        this.this$0.this$0.this$0.a(user, this.this$0.this$0.$sessionUrl);
                        return z.f158842a;
                    }
                };
                return z.f158842a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ User $invitee;
        final /* synthetic */ String $sessionUrl;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(81732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, User user, String str) {
            super(0);
            this.this$0 = fVar;
            this.$invitee = user;
            this.$sessionUrl = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            JSONArray put = new JSONArray().put(this.$invitee.getUid());
            JSONObject jSONObject = new JSONObject();
            f fVar = this.this$0;
            String uri = new Uri.Builder().scheme("aweme").authority("openShoot").appendQueryParameter(StringSet.type, "use_sticker").appendQueryParameter("sticker_id", fVar.c().d().getEffect_id()).appendQueryParameter("session", this.$sessionUrl).appendQueryParameter("host_uid", com.ss.android.ugc.aweme.port.in.g.a().A().c()).build().toString();
            h.f.b.l.b(uri, "");
            q.a("SharedAR", "schema: ".concat(String.valueOf(uri)));
            jSONObject.put("schema", uri);
            jSONObject.put("notice_type", "shared_ar_effect");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String jSONArray = put.toString();
            h.f.b.l.b(jSONArray, "");
            linkedHashMap.put("receiver_ids", jSONArray);
            String jSONObject2 = jSONObject.toString();
            h.f.b.l.b(jSONObject2, "");
            linkedHashMap.put("notice_content", p.a(jSONObject2, "\\", ""));
            final z.a aVar = new z.a();
            aVar.element = false;
            try {
                T t = ((API) com.ss.android.ugc.aweme.sharedar.network.a.f124501a.getValue()).inviteFriend(linkedHashMap).execute().f42630b;
                if (t.status_code == 0) {
                    aVar.element = true;
                }
                q.a("SharedAR", "invite friend response: ".concat(String.valueOf(t)));
            } catch (Exception e2) {
                q.a("SharedAR", e2);
            }
            this.this$0.b(new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.sharedar.a.a.f.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(81733);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    int i2;
                    String str;
                    e b2 = this.this$0.this$0.b();
                    e b3 = this.this$0.this$0.b();
                    if (aVar.element) {
                        i2 = R.string.fvf;
                    } else {
                        i2 = R.string.fvj;
                    }
                    Object[] objArr = new Object[1];
                    User user = this.this$0.$invitee;
                    h.f.b.l.d(user, "");
                    String uniqueId = user.getUniqueId();
                    if (uniqueId == null || uniqueId.length() == 0) {
                        str = user.getShortId();
                        h.f.b.l.b(str, "");
                    } else {
                        str = user.getUniqueId();
                        h.f.b.l.b(str, "");
                    }
                    objArr[0] = str;
                    com.ss.android.ugc.tools.view.widget.d.b(b2, b3.getString(i2, objArr), 0).b();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.bytedance.o.f fVar) {
        super(fVar);
        h.f.b.l.d(fVar, "");
    }

    public final void a(User user, String str) {
        a(new c(this, user, str));
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final void a(int i2, long j2, String str) {
        String optString;
        if (str != null && !this.f124464c && (optString = new JSONObject(str).optString("session_url")) != null && optString.length() != 0) {
            this.f124464c = true;
            b(new b(this, optString));
            c().a(i2, 2, j2, "");
        }
    }
}
