package com.ss.android.ugc.aweme.im.sdk.share.data.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class PureDataSharePackage extends SharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103397a = new a((byte) 0);

    static {
        Covode.recordClassIndex(66258);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66259);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static SharePackage a(String str) {
            l.d(str, "");
            return new SharePackage(new SharePackage.a().a(str));
        }
    }
}
