package com.ss.android.ugc.aweme.share.improve.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.share.improve.a.d;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123826a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81269);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "copy";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        String b2 = com.ss.android.ugc.aweme.base.utils.h.b(R.string.ft0);
        l.b(b2, "");
        return b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.b$b  reason: collision with other inner class name */
    static final class C3206b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3206b f123827a = new C3206b();

        static {
            Covode.recordClassIndex(81271);
        }

        C3206b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_link_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(C3206b.f123827a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(h hVar, Context context) {
        l.d(hVar, "");
        l.d(context, "");
        if (hVar instanceof k) {
            return a((k) hVar, context);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.b.e, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(k kVar, Context context) {
        String str;
        l.d(kVar, "");
        l.d(context, "");
        String str2 = kVar.f124582e;
        if (str2 == null || str2.length() == 0) {
            str = kVar.f124573b;
        } else {
            str = kVar.f124582e + ' ' + kVar.f124573b;
        }
        new d(null, false, 7).a(str, context, PrivacyCert.Builder.Companion.with("bpea-106").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("clickCopyLinkButtonInShareDialog").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        return true;
    }
}
