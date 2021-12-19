package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.a.d;
import com.ss.android.ugc.aweme.sharer.m;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class h extends com.ss.android.ugc.aweme.sharer.a {
    static {
        Covode.recordClassIndex(81824);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "instagram_story";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Stories";
    }

    static final class a extends h.f.b.m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124542a = new a();

        static {
            Covode.recordClassIndex(81825);
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
            aVar2.f44749a = R.raw.icon_color_instagram_story_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(a.f124542a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean b(Context context) {
        l.d(context, "");
        m mVar = new m("");
        if (!d.a(context, "com.instagram.android") || !a(context, mVar)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        return a(lVar, context, lVar.f124575b);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, com.ss.android.ugc.aweme.sharer.h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        return a(nVar, context, nVar.f124583b);
    }

    private boolean a(com.ss.android.ugc.aweme.sharer.h hVar, Context context, Uri uri) {
        l.d(hVar, "");
        l.d(context, "");
        l.d(uri, "");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        String b2 = hVar.b("media_type", "");
        String b3 = hVar.b("content_url", "video/*");
        String b4 = hVar.b("fb_app_id", "");
        if (!TextUtils.isEmpty(b2)) {
            intent.setType(b2);
        }
        if (!TextUtils.isEmpty(b4)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", b4);
        }
        if (!TextUtils.isEmpty(b3)) {
            intent.putExtra("content_url", b3);
        }
        intent.setDataAndType(uri, b2);
        intent.setFlags(1);
        return a(context, intent);
    }
}
