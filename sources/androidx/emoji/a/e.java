package androidx.emoji.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.e.b;
import androidx.core.g.g;
import androidx.core.graphics.l;
import androidx.emoji.a.a;
import androidx.emoji.a.f;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class e extends a.c {

    /* renamed from: i  reason: collision with root package name */
    private static final a f2794i = new a();

    public static class a {
        static {
            Covode.recordClassIndex(979);
        }
    }

    public static abstract class c {
        static {
            Covode.recordClassIndex(984);
        }

        public abstract long a();
    }

    static {
        Covode.recordClassIndex(978);
    }

    static class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        a.g f2795a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f2796b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.e.a f2797c;

        /* renamed from: d  reason: collision with root package name */
        private final a f2798d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f2799e = new Object();

        /* renamed from: f  reason: collision with root package name */
        private Handler f2800f;

        /* renamed from: g  reason: collision with root package name */
        private HandlerThread f2801g;

        /* renamed from: h  reason: collision with root package name */
        private c f2802h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f2803i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f2804j;

        static {
            Covode.recordClassIndex(980);
        }

        private void c() {
            this.f2795a = null;
            ContentObserver contentObserver = this.f2803i;
            if (contentObserver != null) {
                this.f2796b.getContentResolver().unregisterContentObserver(contentObserver);
                this.f2803i = null;
            }
            synchronized (this.f2799e) {
                this.f2800f.removeCallbacks(this.f2804j);
                HandlerThread handlerThread = this.f2801g;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.f2800f = null;
                this.f2801g = null;
            }
        }

        private b.C0030b b() {
            try {
                b.a a2 = androidx.core.e.b.a(this.f2796b, this.f2797c);
                if (a2.f2319a == 0) {
                    b.C0030b[] bVarArr = a2.f2320b;
                    if (bVarArr != null && bVarArr.length != 0) {
                        return bVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + a2.f2319a + ")");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f2795a != null) {
                try {
                    b.C0030b b2 = b();
                    int i2 = b2.f2325e;
                    if (i2 == 2) {
                        synchronized (this.f2799e) {
                            c cVar = this.f2802h;
                            if (cVar != null) {
                                long a2 = cVar.a();
                                if (a2 >= 0) {
                                    Uri uri = b2.f2321a;
                                    synchronized (this.f2799e) {
                                        if (this.f2803i == null) {
                                            AnonymousClass2 r1 = new ContentObserver(this.f2800f) {
                                                /* class androidx.emoji.a.e.b.AnonymousClass2 */

                                                static {
                                                    Covode.recordClassIndex(982);
                                                }

                                                public final void onChange(boolean z, Uri uri) {
                                                    b.this.a();
                                                }
                                            };
                                            this.f2803i = r1;
                                            this.f2796b.getContentResolver().registerContentObserver(uri, false, r1);
                                        }
                                        if (this.f2804j == null) {
                                            this.f2804j = new Runnable() {
                                                /* class androidx.emoji.a.e.b.AnonymousClass3 */

                                                static {
                                                    Covode.recordClassIndex(983);
                                                }

                                                public final void run() {
                                                    b.this.a();
                                                }
                                            };
                                        }
                                        this.f2800f.postDelayed(this.f2804j, a2);
                                    }
                                    return;
                                }
                            }
                        }
                    } else if (i2 == 0) {
                        Typeface a3 = androidx.core.graphics.e.a(this.f2796b, new b.C0030b[]{b2}, 0);
                        ByteBuffer a4 = l.a(this.f2796b, (CancellationSignal) null, b2.f2321a);
                        if (a4 != null) {
                            a.g gVar = this.f2795a;
                            ByteBuffer duplicate = a4.duplicate();
                            duplicate.position((int) f.a(new f.a(duplicate)).f2810a);
                            androidx.j.a.a.b bVar = new androidx.j.a.a.b();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            bVar.a(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                            gVar.a(new g(a3, bVar));
                            c();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                } catch (Throwable th) {
                    this.f2795a.a(th);
                    c();
                }
            }
        }

        @Override // androidx.emoji.a.a.f
        public final void a(final a.g gVar) {
            g.a(gVar, "LoaderCallback cannot be null");
            synchronized (this.f2799e) {
                if (this.f2800f == null) {
                    HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                    this.f2801g = handlerThread;
                    handlerThread.start();
                    this.f2800f = new Handler(this.f2801g.getLooper());
                }
                this.f2800f.post(new Runnable() {
                    /* class androidx.emoji.a.e.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(981);
                    }

                    public final void run() {
                        b.this.f2795a = gVar;
                        b.this.a();
                    }
                });
            }
        }

        b(Context context, androidx.core.e.a aVar, a aVar2) {
            g.a(context, "Context cannot be null");
            g.a(aVar, "FontRequest cannot be null");
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f2796b = applicationContext;
            this.f2797c = aVar;
            this.f2798d = aVar2;
        }
    }

    public e(Context context, androidx.core.e.a aVar) {
        super(new b(context, aVar, f2794i));
    }
}
