package com.ss.android.ugc.aweme.share.silent.a;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.model.c;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.i;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.io.File;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f124308a;

    static {
        Covode.recordClassIndex(81626);
    }

    public h(b bVar) {
        l.d(bVar, "");
        this.f124308a = bVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f124309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f124310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f124311c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f124312d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f124313e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Aweme f124314f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f124315g;

        static {
            Covode.recordClassIndex(81627);
        }

        a(h hVar, c cVar, String str, Context context, h.f.a.b bVar, Aweme aweme, AwemeSharePackage awemeSharePackage) {
            this.f124309a = hVar;
            this.f124310b = cVar;
            this.f124311c = str;
            this.f124312d = context;
            this.f124313e = bVar;
            this.f124314f = aweme;
            this.f124315g = awemeSharePackage;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            c cVar = this.f124310b;
            l.b(str, "");
            cVar.a(str);
            try {
                this.f124309a.f124308a.a((com.ss.android.ugc.aweme.sharer.h) new n(com.ss.android.ugc.aweme.share.improve.c.c.a(this.f124311c, d.a()), this.f124311c, null, null, str, 28), this.f124312d);
                this.f124310b.b("video_form");
                this.f124313e.invoke(this.f124310b);
            } catch (i e2) {
                String message = e2.getMessage();
                int hashCode = message.hashCode();
                if (hashCode != 1212011917) {
                    if (hashCode == 1703438795 && message.equals("video_too_long")) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f124312d).a(R.string.had).a();
                        new com.ss.android.ugc.aweme.share.improve.a.h(this.f124314f, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-100").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseVideTooLong").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).a(this.f124312d, this.f124315g);
                        this.f124310b.b("url_form");
                    }
                } else if (message.equals("file_too_large")) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f124312d).a(R.string.aj1).a();
                    new com.ss.android.ugc.aweme.share.improve.a.h(this.f124314f, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-99").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseFileTooLarge").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).a(this.f124312d, this.f124315g);
                    this.f124310b.b("url_form");
                }
                this.f124313e.invoke(this.f124310b);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a.a
    public final void a(Context context, String str, c cVar, h.f.a.b<? super c, z> bVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(cVar, "");
        l.d(bVar, "");
        File file = new File(str);
        Aweme aweme = cVar.f124109d;
        AwemeSharePackage a2 = AwemeSharePackage.a.a(aweme, context, 0, "", "");
        if (com.ss.android.ugc.aweme.share.improve.c.b.a(file)) {
            ShareInfo shareInfo = aweme.getShareInfo();
            l.b(shareInfo, "");
            String shareUrl = shareInfo.getShareUrl();
            l.b(shareUrl, "");
            com.ss.android.ugc.aweme.share.improve.c.c.b(shareUrl, "aweme", this.f124308a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new a(this, cVar, str, context, bVar, aweme, a2));
            return;
        }
        r.onEventV3("share_snapchat_oversized");
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.aj1).a();
        new com.ss.android.ugc.aweme.share.improve.a.h(aweme, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-101").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseOverSize").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).a(context, a2);
        cVar.b("url_form");
        bVar.invoke(cVar);
    }
}
