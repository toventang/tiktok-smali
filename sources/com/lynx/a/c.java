package com.lynx.a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.utils.m;

public abstract class c {
    static {
        Covode.recordClassIndex(34555);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract void a(Throwable th);

    /* access modifiers changed from: protected */
    public abstract void b(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract void b(Throwable th);

    public final void a(final Uri uri, final Bitmap bitmap) {
        if (m.a()) {
            a(bitmap);
        } else {
            m.a(new Runnable() {
                /* class com.lynx.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34556);
                }

                public final void run() {
                    c.this.a(bitmap);
                }
            });
        }
    }

    public final void b(final Uri uri, final Bitmap bitmap) {
        if (m.a()) {
            b(bitmap);
        } else {
            m.a(new Runnable() {
                /* class com.lynx.a.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34557);
                }

                public final void run() {
                    c.this.b(bitmap);
                }
            });
        }
    }

    public final void a(final Uri uri, final Throwable th) {
        if (m.a()) {
            a(th);
        } else {
            m.a(new Runnable() {
                /* class com.lynx.a.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(34558);
                }

                public final void run() {
                    c.this.a(th);
                }
            });
        }
    }

    public final void b(final Uri uri, final Throwable th) {
        if (m.a()) {
            b(th);
        } else {
            m.a(new Runnable() {
                /* class com.lynx.a.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(34559);
                }

                public final void run() {
                    c.this.b(th);
                }
            });
        }
    }
}
