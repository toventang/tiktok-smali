package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.m;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.ss.android.ugc.aweme.sharer.ext.b.a;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c extends com.ss.android.ugc.aweme.sharer.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sharer.a.a f124536a;

    static {
        Covode.recordClassIndex(81814);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "facebook";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Facebook";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean b(Context context) {
        l.d(context, "");
        return true;
    }

    private final void e() {
        if (m.a()) {
            return;
        }
        if (this.f124536a.a() == null) {
            m.a(d.a());
        } else {
            m.a(this.f124536a.a());
        }
    }

    static final class a extends h.f.b.m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124537a = new a();

        static {
            Covode.recordClassIndex(81815);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_facebook_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return com.bytedance.tux.c.c.a(a.f124537a).a(context);
        }
        return null;
    }

    public c(com.ss.android.ugc.aweme.sharer.a.a aVar) {
        l.d(aVar, "");
        this.f124536a = aVar;
        if (!com.ss.android.ugc.aweme.sharer.ext.a.a.a() && !m.a()) {
            if (aVar.a() == null) {
                m.a(d.a());
            } else {
                m.a(aVar.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean a(h hVar, Context context) {
        l.d(hVar, "");
        l.d(context, "");
        e();
        if (a.C3256a.a(this.f124536a.a())) {
            return false;
        }
        return super.a(hVar, context);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean a(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        e();
        if (a.C3256a.a(this.f124536a.a())) {
            return false;
        }
        ShareLinkContent.a aVar = new ShareLinkContent.a();
        aVar.f49103a = Uri.parse(kVar.f124573b);
        aVar.f49119k = kVar.f124582e;
        ShareLinkContent shareLinkContent = new ShareLinkContent(aVar, (byte) 0);
        com.facebook.share.a.a aVar2 = new com.facebook.share.a.a(this.f124536a.a());
        if (!aVar2.a((Object) shareLinkContent)) {
            return false;
        }
        aVar2.b(shareLinkContent);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        e();
        if (a.C3256a.a(this.f124536a.a())) {
            return false;
        }
        SharePhoto.a aVar = new SharePhoto.a();
        aVar.f49156c = lVar.f124575b;
        SharePhotoContent a2 = new SharePhotoContent.a().a(aVar.a()).a();
        com.facebook.share.a.a aVar2 = new com.facebook.share.a.a(this.f124536a.a());
        if (!aVar2.a((Object) a2)) {
            return false;
        }
        aVar2.b(a2);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        e();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        e();
        if (a.C3256a.a(this.f124536a.a())) {
            return false;
        }
        ShareVideo.a aVar = new ShareVideo.a();
        aVar.f49166b = nVar.f124583b;
        ShareVideoContent shareVideoContent = new ShareVideoContent(new ShareVideoContent.a().a(aVar.a()), (byte) 0);
        com.facebook.share.a.a aVar2 = new com.facebook.share.a.a(this.f124536a.a());
        if (!aVar2.a((Object) shareVideoContent)) {
            return false;
        }
        aVar2.b(shareVideoContent);
        return true;
    }
}
