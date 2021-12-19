package com.ss.android.ugc.aweme.sharer.ext;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.snapchat.kit.sdk.c;
import com.snapchat.kit.sdk.creative.c.e;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.i;
import com.ss.android.ugc.aweme.sharer.n;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class r extends com.ss.android.ugc.aweme.sharer.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sharer.a.a f124553a;

    static {
        Covode.recordClassIndex(81844);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "snapchat";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Snapchat";
    }

    private final void e() {
        Context a2 = this.f124553a.a();
        if (a2 == null) {
            a2 = d.a();
        }
        c.b(a2);
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124554a = new a();

        static {
            Covode.recordClassIndex(81845);
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
            aVar2.f44749a = R.raw.icon_color_snapchat_circle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return com.bytedance.tux.c.c.a(a.f124554a).a(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean b(Context context) {
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        if (com.ss.android.ugc.aweme.sharer.a.d.a(context, "com.snapchat.android")) {
            return true;
        }
        return false;
    }

    public r(com.ss.android.ugc.aweme.sharer.a.a aVar) {
        l.d(aVar, "");
        this.f124553a = aVar;
        if (!com.ss.android.ugc.aweme.sharer.ext.a.a.a()) {
            Activity a2 = aVar.a();
            if (a2 != null) {
                c.b(a2);
            } else {
                c.b(d.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        e();
        int i2 = Build.VERSION.SDK_INT;
        if (com.snapchat.kit.sdk.b.b.a(context.getPackageManager(), "com.snapchat.android")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        e();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        e();
        File file = new File(lVar.f124576c);
        if (file.exists()) {
            com.snapchat.kit.sdk.creative.api.a a2 = com.snapchat.kit.sdk.b.a(context);
            com.snapchat.kit.sdk.creative.c.b b2 = com.snapchat.kit.sdk.b.b(context);
            try {
                if (file.length() < 314572800) {
                    com.snapchat.kit.sdk.creative.c.c cVar = new com.snapchat.kit.sdk.creative.c.c(file);
                    l.b(cVar, "");
                    com.snapchat.kit.sdk.creative.d.c cVar2 = new com.snapchat.kit.sdk.creative.d.c(cVar);
                    cVar2.f57307b = lVar.f124580g;
                    a2.a(cVar2);
                    return true;
                }
                b2.f57294a.a("exceptionMediaSize");
                throw new com.snapchat.kit.sdk.creative.b.b("Media file size should be under 300MB");
            } catch (com.snapchat.kit.sdk.creative.b.b unused) {
                throw new i("file_too_large");
            }
        } else {
            throw new i("file_not_found");
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        e();
        File file = new File(nVar.f124584c);
        if (file.exists()) {
            com.snapchat.kit.sdk.creative.api.a a2 = com.snapchat.kit.sdk.b.a(context);
            com.snapchat.kit.sdk.creative.c.b b2 = com.snapchat.kit.sdk.b.b(context);
            try {
                long length = file.length();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getPath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                mediaMetadataRetriever.release();
                if (Integer.valueOf(extractMetadata).intValue() >= 60000) {
                    b2.f57294a.a("exceptionVideoLength");
                    throw new com.snapchat.kit.sdk.creative.b.c("Video must be under 1 minute long");
                } else if (length < 314572800) {
                    b2.f57294a.a("videoLength", Long.valueOf(extractMetadata).longValue());
                    e eVar = new e(file);
                    l.b(eVar, "");
                    com.snapchat.kit.sdk.creative.d.d dVar = new com.snapchat.kit.sdk.creative.d.d(eVar);
                    dVar.f57307b = nVar.f124588g;
                    a2.a(dVar);
                    return true;
                } else {
                    b2.f57294a.a("exceptionMediaSize");
                    throw new com.snapchat.kit.sdk.creative.b.b("Media file size should be under 300MB");
                }
            } catch (com.snapchat.kit.sdk.creative.b.b unused) {
                throw new i("file_too_large");
            } catch (com.snapchat.kit.sdk.creative.b.c unused2) {
                throw new i("video_too_long");
            }
        } else {
            throw new i("file_not_found");
        }
    }
}
