package com.ss.android.ugc.aweme.i18n.xbridge.d;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public abstract class e implements com.ss.android.ugc.aweme.base.a.b, com.ss.android.ugc.aweme.i18n.xbridge.a.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f100053e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Context> f100054c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.i18n.xbridge.a.a f100055d;

    public enum b {
        TAKE_PHOTO,
        PICK_PHOTO_FROM_ALBUM,
        TAKE_VIDEO,
        PICK_VIDEO_FROM_ALBUM,
        UNSUPPORTED;
        
        public static final a Companion = new a((byte) 0);

        static {
            Covode.recordClassIndex(63765);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(63766);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(63763);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63764);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        this.f100054c = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.base.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        if (i2 == 1 || i2 == 700 || i2 == 800 || i2 == 10003 || i2 == 10004) {
            com.ss.android.ugc.aweme.i18n.xbridge.a.a aVar = this.f100055d;
            if (aVar == null) {
                l.a("mIFileMediaFeature");
            }
            aVar.a(i2, i3, intent);
        } else {
            a(0, "Unrecognized request code");
        }
        return true;
    }
}
