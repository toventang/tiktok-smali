package com.ss.android.ugc.aweme.sharer.ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface f extends b {

    public static final class a {
        static {
            Covode.recordClassIndex(81915);
        }

        public static void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
        }

        public static void a(h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
        }

        public static void b(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
        }
    }

    static {
        Covode.recordClassIndex(81914);
    }

    void a(SharePackage sharePackage, Context context);

    void a(h hVar, SharePackage sharePackage, Context context);

    void b(SharePackage sharePackage, Context context);
}
