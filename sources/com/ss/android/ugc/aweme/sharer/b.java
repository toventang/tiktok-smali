package com.ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import h.f.b.l;

public interface b {
    static {
        Covode.recordClassIndex(81775);
    }

    Drawable a(Context context);

    String a();

    void a(RemoteImageView remoteImageView, boolean z);

    boolean a(Context context, h hVar);

    boolean a(h hVar, Context context);

    boolean a(k kVar, Context context);

    boolean a(l lVar, Context context);

    boolean a(m mVar, Context context);

    boolean a(n nVar, Context context);

    String b();

    boolean b(Context context);

    boolean c();

    float d();

    public static final class a {
        static {
            Covode.recordClassIndex(81776);
        }

        public static void a(b bVar, RemoteImageView remoteImageView) {
            l.d(remoteImageView, "");
            remoteImageView.setImageDrawable(bVar.a(remoteImageView.getContext()));
        }
    }
}
