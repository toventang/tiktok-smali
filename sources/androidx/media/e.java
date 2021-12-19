package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.media.f;
import androidx.media.g;
import androidx.media.h;
import androidx.media.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class e extends Service {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f3648a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b  reason: collision with root package name */
    final androidx.c.a<IBinder, b> f3649b = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    b f3650c;

    /* renamed from: d  reason: collision with root package name */
    final m f3651d = new m();

    /* renamed from: e  reason: collision with root package name */
    public MediaSessionCompat.Token f3652e;

    /* renamed from: f  reason: collision with root package name */
    private c f3653f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3665a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f3666b;

        static {
            Covode.recordClassIndex(1396);
        }
    }

    interface c {
        static {
            Covode.recordClassIndex(1399);
        }

        IBinder a(Intent intent);

        void a();

        void a(MediaSessionCompat.Token token);
    }

    interface k {
        static {
            Covode.recordClassIndex(1421);
        }

        IBinder a();

        void a(String str, MediaSessionCompat.Token token, Bundle bundle);

        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

        void b();
    }

    public abstract a a(String str);

    public abstract void a(String str, i<List<MediaBrowserCompat.MediaItem>> iVar);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    static class l implements k {

        /* renamed from: a  reason: collision with root package name */
        final Messenger f3741a;

        static {
            Covode.recordClassIndex(1422);
        }

        @Override // androidx.media.e.k
        public final IBinder a() {
            return this.f3741a.getBinder();
        }

        @Override // androidx.media.e.k
        public final void b() {
            a(2, null);
        }

        l(Messenger messenger) {
            this.f3741a = messenger;
        }

        private void a(int i2, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3741a.send(obtain);
        }

        @Override // androidx.media.e.k
        public final void a(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            a(1, bundle2);
        }

        @Override // androidx.media.e.k
        public final void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            a(3, bundle3);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f3667a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3668b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3669c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a f3670d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3671e;

        /* renamed from: f  reason: collision with root package name */
        public final k f3672f;

        /* renamed from: g  reason: collision with root package name */
        public final HashMap<String, List<androidx.core.g.e<IBinder, Bundle>>> f3673g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public a f3674h;

        static {
            Covode.recordClassIndex(1397);
        }

        public final void binderDied() {
            e.this.f3651d.post(new Runnable() {
                /* class androidx.media.e.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1398);
                }

                public final void run() {
                    e.this.f3649b.remove(b.this.f3672f.a());
                }
            });
        }

        b(String str, int i2, int i3, Bundle bundle, k kVar) {
            this.f3667a = str;
            this.f3668b = i2;
            this.f3669c = i3;
            this.f3670d = new i.a(str, i2, i3);
            this.f3671e = bundle;
            this.f3672f = kVar;
        }
    }

    class h implements c {

        /* renamed from: b  reason: collision with root package name */
        private Messenger f3693b;

        static {
            Covode.recordClassIndex(1408);
        }

        @Override // androidx.media.e.c
        public final void a() {
            this.f3693b = new Messenger(e.this.f3651d);
        }

        h() {
        }

        @Override // androidx.media.e.c
        public final IBinder a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3693b.getBinder();
            }
            return null;
        }

        @Override // androidx.media.e.c
        public final void a(final MediaSessionCompat.Token token) {
            e.this.f3651d.post(new Runnable() {
                /* class androidx.media.e.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1409);
                }

                public final void run() {
                    Iterator<b> it = e.this.f3649b.values().iterator();
                    while (it.hasNext()) {
                        b next = it.next();
                        try {
                            next.f3672f.a(next.f3674h.f3665a, token, next.f3674h.f3666b);
                        } catch (RemoteException unused) {
                            it.remove();
                        }
                    }
                }
            });
        }
    }

    public static class i<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3696a;

        /* renamed from: f  reason: collision with root package name */
        final Object f3697f;

        /* renamed from: g  reason: collision with root package name */
        boolean f3698g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3699h;

        /* renamed from: i  reason: collision with root package name */
        public int f3700i;

        static {
            Covode.recordClassIndex(1410);
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public final boolean d() {
            if (this.f3696a || this.f3698g || this.f3699h) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3697f);
        }

        public final void c() {
            if (this.f3698g || this.f3699h) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3697f);
            }
            this.f3698g = true;
            a();
        }

        i(Object obj) {
            this.f3697f = obj;
        }
    }

    static {
        Covode.recordClassIndex(1391);
    }

    class d implements c, f.d {

        /* renamed from: a  reason: collision with root package name */
        final List<Bundle> f3677a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        Object f3678b;

        /* renamed from: c  reason: collision with root package name */
        Messenger f3679c;

        static {
            Covode.recordClassIndex(1400);
        }

        @Override // androidx.media.e.c
        public void a() {
            f.b bVar = new f.b(e.this, this);
            this.f3678b = bVar;
            bVar.onCreate();
        }

        d() {
        }

        @Override // androidx.media.e.c
        public final IBinder a(Intent intent) {
            return ((MediaBrowserService) this.f3678b).onBind(intent);
        }

        @Override // androidx.media.e.c
        public final void a(final MediaSessionCompat.Token token) {
            e.this.f3651d.a(new Runnable() {
                /* class androidx.media.e.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1401);
                }

                public final void run() {
                    if (!d.this.f3677a.isEmpty()) {
                        android.support.v4.media.session.b bVar = token.f695b;
                        if (bVar != null) {
                            for (Bundle bundle : d.this.f3677a) {
                                androidx.core.app.c.a(bundle, "extra_session_binder", bVar.asBinder());
                            }
                        }
                        d.this.f3677a.clear();
                    }
                    ((MediaBrowserService) d.this.f3678b).setSessionToken((MediaSession.Token) token.f694a);
                }
            });
        }

        @Override // androidx.media.f.d
        public final void a(String str, final f.c<List<Parcel>> cVar) {
            e.this.a(str, new i<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class androidx.media.e.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(1402);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.e.i
                public final /* bridge */ /* synthetic */ void a() {
                    cVar.a(null);
                }
            });
        }

        @Override // androidx.media.f.d
        public final f.a a(String str, int i2, Bundle bundle) {
            IBinder asBinder;
            if (!(bundle == null || bundle.getInt("extra_client_version", 0) == 0)) {
                bundle.remove("extra_client_version");
                this.f3679c = new Messenger(e.this.f3651d);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                androidx.core.app.c.a(bundle2, "extra_messenger", this.f3679c.getBinder());
                if (e.this.f3652e != null) {
                    android.support.v4.media.session.b bVar = e.this.f3652e.f695b;
                    if (bVar == null) {
                        asBinder = null;
                    } else {
                        asBinder = bVar.asBinder();
                    }
                    androidx.core.app.c.a(bundle2, "extra_session_binder", asBinder);
                } else {
                    this.f3677a.add(bundle2);
                }
            }
            e.this.f3650c = new b(str, -1, i2, bundle, null);
            e.this.a(str);
            e.this.f3650c = null;
            return null;
        }
    }

    /* renamed from: androidx.media.e$e  reason: collision with other inner class name */
    class C0055e extends d implements g.b {
        static {
            Covode.recordClassIndex(1403);
        }

        @Override // androidx.media.e.d, androidx.media.e.c
        public void a() {
            this.f3678b = new g.a(e.this, this);
            ((MediaBrowserService) this.f3678b).onCreate();
        }

        C0055e() {
            super();
        }

        @Override // androidx.media.g.b
        public final void b(String str, final f.c<Parcel> cVar) {
            e.a(new i<MediaBrowserCompat.MediaItem>(str) {
                /* class androidx.media.e.C0055e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1404);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.e.i
                public final /* bridge */ /* synthetic */ void a() {
                    cVar.a(null);
                }
            });
        }
    }

    class f extends C0055e implements h.c {
        static {
            Covode.recordClassIndex(1405);
        }

        @Override // androidx.media.e.d, androidx.media.e.C0055e, androidx.media.e.c
        public final void a() {
            this.f3678b = new h.a(e.this, this);
            ((MediaBrowserService) this.f3678b).onCreate();
        }

        f() {
            super();
        }

        @Override // androidx.media.h.c
        public final void a(String str, final h.b bVar) {
            e.this.b(str, new i<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class androidx.media.e.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1406);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.e.i
                public final /* synthetic */ void a() {
                    h.b bVar = bVar;
                    try {
                        h.f3746a.setInt(bVar.f3747a, this.f3700i);
                    } catch (IllegalAccessException unused) {
                    }
                    bVar.f3747a.sendResult(null);
                }
            });
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3653f = new g();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f3653f = new f();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f3653f = new C0055e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f3653f = new d();
        } else {
            this.f3653f = new h();
        }
        this.f3653f.a();
    }

    class g extends f {
        static {
            Covode.recordClassIndex(1407);
        }

        g() {
            super();
        }
    }

    class j {
        static {
            Covode.recordClassIndex(1411);
        }

        j() {
        }
    }

    public static void a(i<MediaBrowserCompat.MediaItem> iVar) {
        iVar.f3700i = 2;
        iVar.c();
    }

    public IBinder onBind(Intent intent) {
        return this.f3653f.a(intent);
    }

    final class m extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private final j f3743b;

        static {
            Covode.recordClassIndex(1423);
        }

        m() {
            this.f3743b = new j();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            String[] packagesForUid;
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    j jVar = this.f3743b;
                    String string = data.getString("data_package_name");
                    int i2 = data.getInt("data_calling_pid");
                    int i3 = data.getInt("data_calling_uid");
                    l lVar = new l(message.replyTo);
                    e eVar = e.this;
                    if (string != null) {
                        PackageManager packageManager = eVar.getPackageManager();
                        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(packageManager, new Object[]{Integer.valueOf(i3)}, 101310, "java.lang.String[]", false, null);
                        if (((Boolean) a2.first).booleanValue()) {
                            packagesForUid = (String[]) a2.second;
                        } else {
                            packagesForUid = packageManager.getPackagesForUid(i3);
                            com.bytedance.helios.sdk.a.a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i3)}, 101310, "androidx_media_MediaBrowserServiceCompat_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
                        }
                        for (String str : packagesForUid) {
                            if (str.equals(string)) {
                                e.this.f3651d.a(new Runnable(lVar, string, i2, i3, bundle) {
                                    /* class androidx.media.e.j.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ k f3702a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f3703b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ int f3704c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ int f3705d;

                                    /* renamed from: e  reason: collision with root package name */
                                    final /* synthetic */ Bundle f3706e;

                                    static {
                                        Covode.recordClassIndex(1412);
                                    }

                                    public final void run() {
                                        IBinder a2 = this.f3702a.a();
                                        e.this.f3649b.remove(a2);
                                        b bVar = new b(this.f3703b, this.f3704c, this.f3705d, this.f3706e, this.f3702a);
                                        e.this.f3650c = bVar;
                                        bVar.f3674h = e.this.a(this.f3703b);
                                        e.this.f3650c = null;
                                        if (bVar.f3674h == null) {
                                            getClass().getName();
                                            try {
                                                this.f3702a.b();
                                            } catch (RemoteException unused) {
                                            }
                                        } else {
                                            try {
                                                e.this.f3649b.put(a2, bVar);
                                                a2.linkToDeath(bVar, 0);
                                                if (e.this.f3652e != null) {
                                                    this.f3702a.a(bVar.f3674h.f3665a, e.this.f3652e, bVar.f3674h.f3666b);
                                                }
                                            } catch (RemoteException unused2) {
                                                e.this.f3649b.remove(a2);
                                            }
                                        }
                                    }

                                    {
                                        this.f3702a = r2;
                                        this.f3703b = r3;
                                        this.f3704c = r4;
                                        this.f3705d = r5;
                                        this.f3706e = r6;
                                    }
                                });
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
                case 2:
                    j jVar2 = this.f3743b;
                    e.this.f3651d.a(new Runnable(new l(message.replyTo)) {
                        /* class androidx.media.e.j.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ k f3708a;

                        static {
                            Covode.recordClassIndex(1413);
                        }

                        public final void run() {
                            b remove = e.this.f3649b.remove(this.f3708a.a());
                            if (remove != null) {
                                remove.f3672f.a().unlinkToDeath(remove, 0);
                            }
                        }

                        {
                            this.f3708a = r2;
                        }
                    });
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    j jVar3 = this.f3743b;
                    e.this.f3651d.a(new Runnable(new l(message.replyTo), data.getString("data_media_item_id"), androidx.core.app.c.a(data, "data_callback_token"), bundle2) {
                        /* class androidx.media.e.j.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ k f3710a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f3711b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ IBinder f3712c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ Bundle f3713d;

                        static {
                            Covode.recordClassIndex(1414);
                        }

                        public final void run() {
                            b bVar = e.this.f3649b.get(this.f3710a.a());
                            if (bVar != null) {
                                e eVar = e.this;
                                String str = this.f3711b;
                                IBinder iBinder = this.f3712c;
                                Bundle bundle = this.f3713d;
                                List<androidx.core.g.e<IBinder, Bundle>> list = bVar.f3673g.get(str);
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                for (androidx.core.g.e<IBinder, Bundle> eVar2 : list) {
                                    if (iBinder == eVar2.f2397a && d.a(bundle, eVar2.f2398b)) {
                                        return;
                                    }
                                }
                                list.add(new androidx.core.g.e<>(iBinder, bundle));
                                bVar.f3673g.put(str, list);
                                AnonymousClass1 r4 = new i<List<MediaBrowserCompat.MediaItem>>(str, bVar, str, bundle) {
                                    /* class androidx.media.e.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ b f3654a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f3655b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ Bundle f3656c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ Bundle f3657d = null;

                                    static {
                                        Covode.recordClassIndex(1392);
                                    }

                                    /* access modifiers changed from: package-private */
                                    @Override // androidx.media.e.i
                                    public final /* synthetic */ void a() {
                                        b bVar = e.this.f3649b.get(this.f3654a.f3672f.a());
                                        b bVar2 = this.f3654a;
                                        if (bVar == bVar2) {
                                            try {
                                                bVar2.f3672f.a(this.f3655b, null, this.f3656c, this.f3657d);
                                            } catch (RemoteException unused) {
                                            }
                                        }
                                    }

                                    {
                                        this.f3654a = r4;
                                        this.f3655b = r5;
                                        this.f3656c = r6;
                                    }
                                };
                                eVar.f3650c = bVar;
                                if (bundle == null) {
                                    eVar.a(str, r4);
                                } else {
                                    eVar.b(str, r4);
                                }
                                eVar.f3650c = null;
                                if (r4.d()) {
                                    eVar.f3650c = bVar;
                                    eVar.f3650c = null;
                                    return;
                                }
                                throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bVar.f3667a + " id=" + str);
                            }
                        }

                        {
                            this.f3710a = r2;
                            this.f3711b = r3;
                            this.f3712c = r4;
                            this.f3713d = r5;
                        }
                    });
                    return;
                case 4:
                    j jVar4 = this.f3743b;
                    e.this.f3651d.a(new Runnable(new l(message.replyTo), data.getString("data_media_item_id"), androidx.core.app.c.a(data, "data_callback_token")) {
                        /* class androidx.media.e.j.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ k f3715a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f3716b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ IBinder f3717c;

                        static {
                            Covode.recordClassIndex(1415);
                        }

                        public final void run() {
                            b bVar = e.this.f3649b.get(this.f3715a.a());
                            if (bVar != null) {
                                e.this.a(this.f3716b, bVar, this.f3717c);
                            }
                        }

                        {
                            this.f3715a = r2;
                            this.f3716b = r3;
                            this.f3717c = r4;
                        }
                    });
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    j jVar5 = this.f3743b;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    l lVar2 = new l(message.replyTo);
                    if (!(TextUtils.isEmpty(string2) || resultReceiver == null)) {
                        e.this.f3651d.a(new Runnable(lVar2, string2, resultReceiver) {
                            /* class androidx.media.e.j.AnonymousClass5 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ k f3719a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f3720b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ ResultReceiver f3721c;

                            static {
                                Covode.recordClassIndex(1416);
                            }

                            public final void run() {
                                b bVar = e.this.f3649b.get(this.f3719a.a());
                                if (bVar != null) {
                                    e eVar = e.this;
                                    String str = this.f3720b;
                                    AnonymousClass2 r1 = new i<MediaBrowserCompat.MediaItem>(str, this.f3721c) {
                                        /* class androidx.media.e.AnonymousClass2 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ ResultReceiver f3659a;

                                        static {
                                            Covode.recordClassIndex(1393);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.e.i
                                        public final /* synthetic */ void a() {
                                            if ((this.f3700i & 2) != 0) {
                                                this.f3659a.b(-1, null);
                                                return;
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("media_item", null);
                                            this.f3659a.b(0, bundle);
                                        }

                                        {
                                            this.f3659a = r3;
                                        }
                                    };
                                    eVar.f3650c = bVar;
                                    e.a(r1);
                                    eVar.f3650c = null;
                                    if (!r1.d()) {
                                        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
                                    }
                                }
                            }

                            {
                                this.f3719a = r2;
                                this.f3720b = r3;
                                this.f3721c = r4;
                            }
                        });
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    j jVar6 = this.f3743b;
                    e.this.f3651d.a(new Runnable(new l(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3) {
                        /* class androidx.media.e.j.AnonymousClass6 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ k f3723a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f3724b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ int f3725c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ int f3726d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ Bundle f3727e;

                        static {
                            Covode.recordClassIndex(1417);
                        }

                        public final void run() {
                            IBinder a2 = this.f3723a.a();
                            e.this.f3649b.remove(a2);
                            b bVar = new b(this.f3724b, this.f3725c, this.f3726d, this.f3727e, this.f3723a);
                            e.this.f3649b.put(a2, bVar);
                            try {
                                a2.linkToDeath(bVar, 0);
                            } catch (RemoteException unused) {
                            }
                        }

                        {
                            this.f3723a = r2;
                            this.f3724b = r3;
                            this.f3725c = r4;
                            this.f3726d = r5;
                            this.f3727e = r6;
                        }
                    });
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    j jVar7 = this.f3743b;
                    e.this.f3651d.a(new Runnable(new l(message.replyTo)) {
                        /* class androidx.media.e.j.AnonymousClass7 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ k f3729a;

                        static {
                            Covode.recordClassIndex(1418);
                        }

                        public final void run() {
                            IBinder a2 = this.f3729a.a();
                            b remove = e.this.f3649b.remove(a2);
                            if (remove != null) {
                                a2.unlinkToDeath(remove, 0);
                            }
                        }

                        {
                            this.f3729a = r2;
                        }
                    });
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    j jVar8 = this.f3743b;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    l lVar3 = new l(message.replyTo);
                    if (!(TextUtils.isEmpty(string3) || resultReceiver2 == null)) {
                        e.this.f3651d.a(new Runnable(lVar3, string3, bundle4, resultReceiver2) {
                            /* class androidx.media.e.j.AnonymousClass8 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ k f3731a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f3732b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ Bundle f3733c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ ResultReceiver f3734d;

                            static {
                                Covode.recordClassIndex(1419);
                            }

                            public final void run() {
                                b bVar = e.this.f3649b.get(this.f3731a.a());
                                if (bVar != null) {
                                    e eVar = e.this;
                                    String str = this.f3732b;
                                    AnonymousClass3 r1 = new i<List<MediaBrowserCompat.MediaItem>>(str, this.f3734d) {
                                        /* class androidx.media.e.AnonymousClass3 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ ResultReceiver f3661a;

                                        static {
                                            Covode.recordClassIndex(1394);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.e.i
                                        public final /* synthetic */ void a() {
                                            this.f3661a.b(-1, null);
                                        }

                                        {
                                            this.f3661a = r3;
                                        }
                                    };
                                    eVar.f3650c = bVar;
                                    r1.f3700i = 4;
                                    r1.c();
                                    eVar.f3650c = null;
                                    if (!r1.d()) {
                                        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
                                    }
                                }
                            }

                            {
                                this.f3731a = r2;
                                this.f3732b = r3;
                                this.f3733c = r4;
                                this.f3734d = r5;
                            }
                        });
                        return;
                    }
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    j jVar9 = this.f3743b;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    l lVar4 = new l(message.replyTo);
                    if (!(TextUtils.isEmpty(string4) || resultReceiver3 == null)) {
                        e.this.f3651d.a(new Runnable(lVar4, string4, bundle5, resultReceiver3) {
                            /* class androidx.media.e.j.AnonymousClass9 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ k f3736a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f3737b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ Bundle f3738c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ ResultReceiver f3739d;

                            static {
                                Covode.recordClassIndex(1420);
                            }

                            public final void run() {
                                b bVar = e.this.f3649b.get(this.f3736a.a());
                                if (bVar != null) {
                                    e eVar = e.this;
                                    String str = this.f3737b;
                                    Bundle bundle = this.f3738c;
                                    AnonymousClass4 r3 = new i<Bundle>(str, this.f3739d) {
                                        /* class androidx.media.e.AnonymousClass4 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ ResultReceiver f3663a;

                                        static {
                                            Covode.recordClassIndex(1395);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.e.i
                                        public final /* synthetic */ void a() {
                                            this.f3663a.b(0, null);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.e.i
                                        public final void b() {
                                            this.f3663a.b(-1, null);
                                        }

                                        {
                                            this.f3663a = r3;
                                        }
                                    };
                                    eVar.f3650c = bVar;
                                    if (r3.f3698g || r3.f3699h) {
                                        throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + r3.f3697f);
                                    }
                                    r3.f3699h = true;
                                    r3.b();
                                    eVar.f3650c = null;
                                    if (!r3.d()) {
                                        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
                                    }
                                }
                            }

                            {
                                this.f3736a = r2;
                                this.f3737b = r3;
                                this.f3738c = r4;
                                this.f3739d = r5;
                            }
                        });
                        return;
                    }
                    return;
                default:
                    int i4 = message.arg1;
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j2) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j2);
        }
    }

    public final void a(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f3652e == null) {
            this.f3652e = token;
            this.f3653f.a(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    public final void b(String str, i<List<MediaBrowserCompat.MediaItem>> iVar) {
        iVar.f3700i = 1;
        a(str, iVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.f3673g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f3650c = bVar;
                this.f3650c = null;
            }
        } else {
            List<androidx.core.g.e<IBinder, Bundle>> list = bVar.f3673g.get(str);
            if (list != null) {
                Iterator<androidx.core.g.e<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f2397a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f3673g.remove(str);
                }
            }
            this.f3650c = bVar;
            this.f3650c = null;
            return z2;
        }
    }
}
