package com.ss.android.ugc.aweme.share.improve.d;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.h;
import com.ss.android.ugc.aweme.sharer.i;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import org.json.JSONObject;

public final class j implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123897b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.b f123898a;

    static {
        Covode.recordClassIndex(81327);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81328);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $actionCallback;

        static {
            Covode.recordClassIndex(81331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.b bVar) {
            super(0);
            this.$actionCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$actionCallback.invoke(false);
            return z.f158842a;
        }
    }

    public j(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        this.f123898a = bVar;
    }

    public static void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oversize_cause", str);
            r.a("share_snapchat_oversized", jSONObject);
        } catch (Throwable unused) {
        }
    }

    static final class b extends m implements h.f.a.b<String, z> {
        final /* synthetic */ h.f.a.b $actionCallback;
        final /* synthetic */ Context $context;
        final /* synthetic */ AwemeSharePackage $sharePackage;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(81329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar) {
            super(1);
            this.this$0 = jVar;
            this.$sharePackage = awemeSharePackage;
            this.$context = context;
            this.$actionCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            final String str2 = str;
            l.d(str2, "");
            File file = new File(str2);
            final String a2 = h.f124087a.a(this.this$0.f123898a, this.$sharePackage.f124590d, this.$sharePackage.f124593g);
            if (com.ss.android.ugc.aweme.share.improve.c.b.a(file)) {
                com.ss.android.ugc.aweme.share.improve.c.c.b(this.$sharePackage.f124594h, this.$sharePackage.f124590d, this.this$0.f123898a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new f(this) {
                    /* class com.ss.android.ugc.aweme.share.improve.d.j.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f123899a;

                    static {
                        Covode.recordClassIndex(81330);
                    }

                    {
                        this.f123899a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        String str = (String) obj;
                        try {
                            this.f123899a.this$0.f123898a.a((com.ss.android.ugc.aweme.sharer.h) new n(com.ss.android.ugc.aweme.share.improve.c.c.a(str2, d.a()), str2, null, null, str, 28), this.f123899a.$context);
                            this.f123899a.$sharePackage.f124595i.putString("share_form", "video_form");
                            this.f123899a.$sharePackage.f124595i.putString("share_url", str);
                        } catch (i e2) {
                            String message = e2.getMessage();
                            int hashCode = message.hashCode();
                            if (hashCode != 1212011917) {
                                if (hashCode == 1703438795 && message.equals("video_too_long")) {
                                    j.a("60S");
                                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f123899a.$context).a(R.string.had).a();
                                    new com.ss.android.ugc.aweme.share.improve.a.h(this.f123899a.$sharePackage.a(), null, a2, true, 0, PrivacyCert.Builder.Companion.with("bpea-97").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareViewToSnapChatCaseVideoTooLong").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).a(this.f123899a.$context, this.f123899a.$sharePackage);
                                    this.f123899a.$sharePackage.f124595i.putString("share_form", "url_form");
                                    this.f123899a.$sharePackage.f124595i.putString("share_url", str);
                                }
                            } else if (message.equals("file_too_large")) {
                                j.a("100M");
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123899a.$context).a(R.string.aj1).a();
                                new com.ss.android.ugc.aweme.share.improve.a.h(this.f123899a.$sharePackage.a(), null, a2, true, 0, PrivacyCert.Builder.Companion.with("bpea-94").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareVideoToSnapChatCaseFileTooLarge").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).a(this.f123899a.$context, this.f123899a.$sharePackage);
                                this.f123899a.$sharePackage.f124595i.putString("share_form", "url_form");
                                this.f123899a.$sharePackage.f124595i.putString("share_url", str);
                            }
                        }
                    }
                });
            } else {
                j.a("100M");
                new com.ss.android.ugc.aweme.tux.a.i.a(this.$context).a(R.string.aj1).a();
                new com.ss.android.ugc.aweme.share.improve.a.h(this.$sharePackage.a(), null, a2, true, 0, PrivacyCert.Builder.Companion.with("bpea-98").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareVideoToSnapChatCaseOverSize").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).a(this.$context, this.$sharePackage);
                this.$sharePackage.f124595i.putString("share_form", "url_form");
            }
            this.$actionCallback.invoke(true);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        l.d(context, "");
        l.d(awemeSharePackage, "");
        l.d(bVar, "");
        h.a.a(awemeSharePackage, this.f123898a.a(), context, new b(this, awemeSharePackage, context, bVar), new c(bVar));
        return true;
    }
}
