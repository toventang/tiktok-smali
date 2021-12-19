package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MediaBrowserCompat {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f584a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b  reason: collision with root package name */
    public final d f585b;

    public static abstract class c {
        static {
            Covode.recordClassIndex(91);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(92);
        }

        void c();

        void d();

        MediaSessionCompat.Token e();
    }

    interface i {
        static {
            Covode.recordClassIndex(102);
        }

        void a(Messenger messenger);

        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f591a;

        /* renamed from: b  reason: collision with root package name */
        public a f592b;

        interface a {
            static {
                Covode.recordClassIndex(89);
            }

            void a();

            void b();
        }

        static {
            Covode.recordClassIndex(88);
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        class C0006b implements a.AbstractC0007a {
            static {
                Covode.recordClassIndex(90);
            }

            @Override // android.support.v4.media.a.AbstractC0007a
            public final void c() {
                b.this.c();
            }

            @Override // android.support.v4.media.a.AbstractC0007a
            public final void a() {
                if (b.this.f592b != null) {
                    b.this.f592b.a();
                }
                b.this.a();
            }

            @Override // android.support.v4.media.a.AbstractC0007a
            public final void b() {
                if (b.this.f592b != null) {
                    b.this.f592b.b();
                }
                b.this.b();
            }

            C0006b() {
            }
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f591a = new a.b(new C0006b());
            } else {
                this.f591a = null;
            }
        }
    }

    static class e implements b.a, d, i {

        /* renamed from: a  reason: collision with root package name */
        final Context f594a;

        /* renamed from: b  reason: collision with root package name */
        protected final Object f595b;

        /* renamed from: c  reason: collision with root package name */
        protected final Bundle f596c;

        /* renamed from: d  reason: collision with root package name */
        protected final a f597d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        protected int f598e;

        /* renamed from: f  reason: collision with root package name */
        protected j f599f;

        /* renamed from: g  reason: collision with root package name */
        protected Messenger f600g;

        /* renamed from: h  reason: collision with root package name */
        private final androidx.c.a<String, k> f601h = new androidx.c.a<>();

        /* renamed from: i  reason: collision with root package name */
        private MediaSessionCompat.Token f602i;

        /* renamed from: j  reason: collision with root package name */
        private Bundle f603j;

        static {
            Covode.recordClassIndex(93);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void c() {
            ((MediaBrowser) this.f595b).connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public final void b() {
            this.f599f = null;
            this.f600g = null;
            this.f602i = null;
            this.f597d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void d() {
            Messenger messenger;
            j jVar = this.f599f;
            if (!(jVar == null || (messenger = this.f600g) == null)) {
                try {
                    jVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            ((MediaBrowser) this.f595b).disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final MediaSessionCompat.Token e() {
            if (this.f602i == null) {
                this.f602i = MediaSessionCompat.Token.a(((MediaBrowser) this.f595b).getSessionToken(), null);
            }
            return this.f602i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public final void a() {
            Bundle extras = ((MediaBrowser) this.f595b).getExtras();
            if (extras != null) {
                this.f598e = extras.getInt("extra_service_version", 0);
                IBinder a2 = androidx.core.app.c.a(extras, "extra_messenger");
                if (a2 != null) {
                    this.f599f = new j(a2, this.f596c);
                    Messenger messenger = new Messenger(this.f597d);
                    this.f600g = messenger;
                    this.f597d.a(messenger);
                    try {
                        j jVar = this.f599f;
                        Context context = this.f594a;
                        Messenger messenger2 = this.f600g;
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", jVar.f625a);
                        jVar.a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                    }
                }
                android.support.v4.media.session.b a3 = b.a.a(androidx.core.app.c.a(extras, "extra_session_binder"));
                if (a3 != null) {
                    this.f602i = MediaSessionCompat.Token.a(((MediaBrowser) this.f595b).getSessionToken(), a3);
                }
            }
        }

        e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f594a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f596c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.f592b = this;
            this.f595b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.f591a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            k kVar;
            if (this.f600g == messenger && (kVar = this.f601h.get(str)) != null && kVar.a(bundle) != null) {
                if (bundle == null) {
                    if (list != null) {
                        this.f603j = bundle2;
                        this.f603j = null;
                    }
                } else if (list != null) {
                    this.f603j = bundle2;
                    this.f603j = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements d, i {

        /* renamed from: a  reason: collision with root package name */
        final Context f604a;

        /* renamed from: b  reason: collision with root package name */
        final ComponentName f605b;

        /* renamed from: c  reason: collision with root package name */
        final b f606c;

        /* renamed from: d  reason: collision with root package name */
        final Bundle f607d;

        /* renamed from: e  reason: collision with root package name */
        final a f608e = new a(this);

        /* renamed from: f  reason: collision with root package name */
        int f609f = 1;

        /* renamed from: g  reason: collision with root package name */
        a f610g;

        /* renamed from: h  reason: collision with root package name */
        j f611h;

        /* renamed from: i  reason: collision with root package name */
        Messenger f612i;

        /* renamed from: j  reason: collision with root package name */
        private final androidx.c.a<String, k> f613j = new androidx.c.a<>();

        /* renamed from: k  reason: collision with root package name */
        private String f614k;

        /* renamed from: l  reason: collision with root package name */
        private MediaSessionCompat.Token f615l;

        /* renamed from: m  reason: collision with root package name */
        private Bundle f616m;
        private Bundle n;

        static {
            Covode.recordClassIndex(96);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            a(this.f609f);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void d() {
            this.f609f = 0;
            this.f608e.post(new Runnable() {
                /* class android.support.v4.media.MediaBrowserCompat.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(98);
                }

                public final void run() {
                    if (h.this.f612i != null) {
                        try {
                            h.this.f611h.a(2, null, h.this.f612i);
                        } catch (RemoteException unused) {
                        }
                    }
                    int i2 = h.this.f609f;
                    h.this.a();
                    if (i2 != 0) {
                        h.this.f609f = i2;
                    }
                    if (MediaBrowserCompat.f584a) {
                        h.this.b();
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            a aVar = this.f610g;
            if (aVar != null) {
                this.f604a.unbindService(aVar);
            }
            this.f609f = 1;
            this.f610g = null;
            this.f611h = null;
            this.f612i = null;
            this.f608e.a(null);
            this.f614k = null;
            this.f615l = null;
        }

        /* access modifiers changed from: package-private */
        public class a implements ServiceConnection {
            static {
                Covode.recordClassIndex(99);
            }

            /* access modifiers changed from: package-private */
            public final boolean a() {
                if (h.this.f610g != this || h.this.f609f == 0 || h.this.f609f == 1) {
                    return false;
                }
                return true;
            }

            a() {
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                a(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.h.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(101);
                    }

                    public final void run() {
                        if (MediaBrowserCompat.f584a) {
                            h.this.b();
                        }
                        if (a.this.a()) {
                            h.this.f611h = null;
                            h.this.f612i = null;
                            h.this.f608e.a(null);
                            h.this.f609f = 4;
                            h.this.f606c.b();
                        }
                    }
                });
            }

            private void a(Runnable runnable) {
                if (Thread.currentThread() == h.this.f608e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.f608e.post(runnable);
                }
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                a(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.h.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(100);
                    }

                    public final void run() {
                        if (MediaBrowserCompat.f584a) {
                            h.this.b();
                        }
                        if (a.this.a()) {
                            h.this.f611h = new j(iBinder, h.this.f607d);
                            h.this.f612i = new Messenger(h.this.f608e);
                            h.this.f608e.a(h.this.f612i);
                            h.this.f609f = 2;
                            try {
                                if (MediaBrowserCompat.f584a) {
                                    h.this.b();
                                }
                                j jVar = h.this.f611h;
                                Context context = h.this.f604a;
                                Messenger messenger = h.this.f612i;
                                Bundle bundle = new Bundle();
                                bundle.putString("data_package_name", context.getPackageName());
                                bundle.putBundle("data_root_hints", jVar.f625a);
                                jVar.a(1, bundle, messenger);
                            } catch (RemoteException unused) {
                                if (MediaBrowserCompat.f584a) {
                                    h.this.b();
                                }
                            }
                        }
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void c() {
            int i2 = this.f609f;
            if (i2 == 0 || i2 == 1) {
                this.f609f = 2;
                this.f608e.post(new Runnable() {
                    /* class android.support.v4.media.MediaBrowserCompat.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(97);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 190
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.h.AnonymousClass1.run():void");
                    }
                });
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + a(this.f609f) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final MediaSessionCompat.Token e() {
            if (this.f609f == 3) {
                return this.f615l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f609f + ")");
        }

        private boolean b(Messenger messenger) {
            int i2;
            if (this.f612i != messenger || (i2 = this.f609f) == 0 || i2 == 1) {
                return false;
            }
            return true;
        }

        private static String a(int i2) {
            if (i2 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i2 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i2 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i2 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i2 != 4) {
                return "UNKNOWN/".concat(String.valueOf(i2));
            }
            return "CONNECT_STATE_SUSPENDED";
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger) {
            if (b(messenger)) {
                int i2 = this.f609f;
                if (i2 != 2) {
                    a(i2);
                    return;
                }
                a();
                this.f606c.c();
            }
        }

        public h(Context context, ComponentName componentName, b bVar) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f604a = context;
                this.f605b = componentName;
                this.f606c = bVar;
                this.f607d = null;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (b(messenger)) {
                int i2 = this.f609f;
                if (i2 != 2) {
                    a(i2);
                    return;
                }
                this.f614k = str;
                this.f615l = token;
                this.f616m = bundle;
                this.f609f = 3;
                if (MediaBrowserCompat.f584a) {
                    b();
                }
                this.f606c.a();
                try {
                    for (Map.Entry<String, k> entry : this.f613j.entrySet()) {
                        String key = entry.getKey();
                        k value = entry.getValue();
                        List<l> list = value.f627a;
                        List<Bundle> list2 = value.f628b;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            j jVar = this.f611h;
                            IBinder iBinder = list.get(i3).f630b;
                            Messenger messenger2 = this.f612i;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", key);
                            androidx.core.app.c.a(bundle2, "data_callback_token", iBinder);
                            bundle2.putBundle("data_options", list2.get(i3));
                            jVar.a(3, bundle2, messenger2);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            k kVar;
            if (b(messenger) && (kVar = this.f613j.get(str)) != null && kVar.a(bundle) != null) {
                if (bundle == null) {
                    if (list != null) {
                        this.n = bundle2;
                        this.n = null;
                    }
                } else if (list != null) {
                    this.n = bundle2;
                    this.n = null;
                }
            }
        }
    }

    public final void a() {
        this.f585b.d();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* class android.support.v4.media.MediaBrowserCompat.MediaItem.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MediaItem[] newArray(int i2) {
                return new MediaItem[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final int f587a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaDescriptionCompat f588b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(84);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f587a);
            sb.append(", mDescription=").append(this.f588b);
            sb.append('}');
            return sb.toString();
        }

        MediaItem(Parcel parcel) {
            this.f587a = parcel.readInt();
            this.f588b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public static List<MediaItem> a(List<?> list) {
            MediaItem mediaItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    mediaItem = null;
                } else {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f587a);
            this.f588b.writeToParcel(parcel, i2);
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f634a)) {
                this.f587a = i2;
                this.f588b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }

    static {
        Covode.recordClassIndex(81);
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        final Object f629a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f630b = new Binder();

        /* renamed from: c  reason: collision with root package name */
        WeakReference<k> f631c;

        static {
            Covode.recordClassIndex(105);
        }

        public l() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f629a = new b.C0008b(new b());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f629a = new a.d(new a());
            } else {
                this.f629a = null;
            }
        }

        class b extends a implements b.a {
            static {
                Covode.recordClassIndex(107);
            }

            @Override // android.support.v4.media.b.a
            public final void b(List<?> list) {
                MediaItem.a(list);
            }

            b() {
                super();
            }
        }

        class a implements a.c {
            static {
                Covode.recordClassIndex(106);
            }

            a() {
            }

            @Override // android.support.v4.media.a.c
            public final void a(List<?> list) {
                k kVar;
                if (l.this.f631c == null || (kVar = l.this.f631c.get()) == null) {
                    MediaItem.a(list);
                    return;
                }
                List<MediaItem> a2 = MediaItem.a(list);
                List<l> list2 = kVar.f627a;
                List<Bundle> list3 = kVar.f628b;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    Bundle bundle = list3.get(i2);
                    if (!(bundle == null || a2 == null)) {
                        int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i3 != -1) {
                            int i5 = i4 * i3;
                            int i6 = i5 + i4;
                            if (i3 >= 0 && i4 > 0 && i5 < a2.size()) {
                                if (i6 > a2.size()) {
                                    i6 = a2.size();
                                }
                                a2.subList(i5, i6);
                            }
                        } else if (i4 == -1) {
                        }
                        Collections.emptyList();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<i> f589a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Messenger> f590b;

        static {
            Covode.recordClassIndex(87);
        }

        /* access modifiers changed from: package-private */
        public final void a(Messenger messenger) {
            this.f590b = new WeakReference<>(messenger);
        }

        a(i iVar) {
            this.f589a = new WeakReference<>(iVar);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f590b;
            if (weakReference != null && weakReference.get() != null && this.f589a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                i iVar = this.f589a.get();
                Messenger messenger = this.f590b.get();
                try {
                    int i2 = message.what;
                    if (i2 == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle);
                        iVar.a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i2 == 2) {
                        iVar.a(messenger);
                    } else if (i2 != 3) {
                        int i3 = message.arg1;
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.a(bundle3);
                        iVar.a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        iVar.a(messenger);
                    }
                }
            }
        }
    }

    static class k {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f627a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<Bundle> f628b = new ArrayList();

        static {
            Covode.recordClassIndex(104);
        }

        public final l a(Bundle bundle) {
            for (int i2 = 0; i2 < this.f628b.size(); i2++) {
                if (androidx.media.d.a(this.f628b.get(i2), bundle)) {
                    return this.f627a.get(i2);
                }
            }
            return null;
        }
    }

    static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d  reason: collision with root package name */
        private final c f586d;

        static {
            Covode.recordClassIndex(82);
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
            if (this.f586d != null) {
                MediaSessionCompat.a(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        Bundle f625a;

        /* renamed from: b  reason: collision with root package name */
        private Messenger f626b;

        static {
            Covode.recordClassIndex(103);
        }

        public j(IBinder iBinder, Bundle bundle) {
            this.f626b = new Messenger(iBinder);
            this.f625a = bundle;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f626b.send(obtain);
        }
    }

    static class ItemReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(83);
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i2 == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    static class SearchResultReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(86);
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.a(bundle);
            if (i2 == 0 && bundle != null && bundle.containsKey("search_results") && (parcelableArray = bundle.getParcelableArray("search_results")) != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add(parcelable);
                }
            }
        }
    }

    static class g extends f {
        static {
            Covode.recordClassIndex(95);
        }

        g(Context context, ComponentName componentName, b bVar) {
            super(context, componentName, bVar, null);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f585b = new g(context, componentName, bVar);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f585b = new f(context, componentName, bVar, null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f585b = new e(context, componentName, bVar, null);
        } else {
            this.f585b = new h(context, componentName, bVar);
        }
    }

    static class f extends e {
        static {
            Covode.recordClassIndex(94);
        }

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, null);
        }
    }
}
