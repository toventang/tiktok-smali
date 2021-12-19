package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.d;
import android.support.v4.media.session.e;
import android.support.v4.media.session.f;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.i;
import androidx.media.m;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.playerkit.model.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {

    /* renamed from: b  reason: collision with root package name */
    static int f684b;

    /* renamed from: a  reason: collision with root package name */
    public final MediaControllerCompat f685a;

    /* renamed from: c  reason: collision with root package name */
    private final b f686c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<Object> f687d;

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(151);
        }

        void a();

        void a(PendingIntent pendingIntent);

        void a(MediaMetadataCompat mediaMetadataCompat);

        void a(a aVar, Handler handler);

        void a(PlaybackStateCompat playbackStateCompat);

        void a(i.a aVar);

        void a(boolean z);

        boolean b();

        void c();

        Token d();

        PlaybackStateCompat e();

        i.a f();
    }

    static {
        Covode.recordClassIndex(137);
    }

    static class e implements b {

        /* renamed from: a  reason: collision with root package name */
        final Object f707a;

        /* renamed from: b  reason: collision with root package name */
        final Token f708b;

        /* renamed from: c  reason: collision with root package name */
        boolean f709c;

        /* renamed from: d  reason: collision with root package name */
        final RemoteCallbackList<a> f710d = new RemoteCallbackList<>();

        /* renamed from: e  reason: collision with root package name */
        PlaybackStateCompat f711e;

        /* renamed from: f  reason: collision with root package name */
        List<QueueItem> f712f;

        /* renamed from: g  reason: collision with root package name */
        MediaMetadataCompat f713g;

        /* renamed from: h  reason: collision with root package name */
        int f714h;

        /* renamed from: i  reason: collision with root package name */
        boolean f715i;

        /* renamed from: j  reason: collision with root package name */
        int f716j;

        /* renamed from: k  reason: collision with root package name */
        int f717k;

        static {
            Covode.recordClassIndex(156);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void a(i.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public i.a f() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final Token d() {
            return this.f708b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat e() {
            return this.f711e;
        }

        class a extends b.a {
            static {
                Covode.recordClassIndex(157);
            }

            @Override // android.support.v4.media.session.b
            public final void b(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public final List<QueueItem> i() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public final boolean o() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public final void a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean a() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String c() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent d() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final long e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final ParcelableVolumeInfo f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence j() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle k() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final int l() {
                return e.this.f714h;
            }

            @Override // android.support.v4.media.session.b
            public final boolean m() {
                return e.this.f715i;
            }

            @Override // android.support.v4.media.session.b
            public final int n() {
                return e.this.f716j;
            }

            @Override // android.support.v4.media.session.b
            public final int p() {
                return e.this.f717k;
            }

            @Override // android.support.v4.media.session.b
            public final void q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void r() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void t() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void u() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void w() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void x() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat h() {
                return MediaSessionCompat.a(e.this.f711e, e.this.f713g);
            }

            a() {
            }

            @Override // android.support.v4.media.session.b
            public final void a(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void c(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(long j2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(long j2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(a aVar) {
                e.this.f710d.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public final void a(a aVar) {
                String a2;
                if (!e.this.f709c) {
                    e eVar = e.this;
                    if (Build.VERSION.SDK_INT < 24 || (a2 = f.a(eVar.f707a)) == null) {
                        a2 = "android.media.session.MediaController";
                    }
                    e.this.f710d.register(aVar, new i.a(a2, getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public final void d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void c(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b(int i2, int i3, String str) {
                throw new AssertionError();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a() {
            ((MediaSession) this.f707a).setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final boolean b() {
            return ((MediaSession) this.f707a).isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void c() {
            this.f709c = true;
            ((MediaSession) this.f707a).release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(PendingIntent pendingIntent) {
            ((MediaSession) this.f707a).setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            Object obj;
            this.f713g = mediaMetadataCompat;
            Object obj2 = this.f707a;
            if (mediaMetadataCompat == null) {
                obj = null;
            } else {
                if (mediaMetadataCompat.f656c == null && Build.VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    mediaMetadataCompat.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.f656c = MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                obj = mediaMetadataCompat.f656c;
            }
            ((MediaSession) obj2).setMetadata((MediaMetadata) obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(boolean z) {
            ((MediaSession) this.f707a).setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(PlaybackStateCompat playbackStateCompat) {
            Object obj;
            this.f711e = playbackStateCompat;
            for (int beginBroadcast = this.f710d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f710d.getBroadcastItem(beginBroadcast).a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f710d.finishBroadcast();
            Object obj2 = this.f707a;
            Object obj3 = null;
            ArrayList arrayList = null;
            if (playbackStateCompat != null) {
                if (playbackStateCompat.f754l == null && Build.VERSION.SDK_INT >= 21) {
                    if (playbackStateCompat.f751i != null) {
                        arrayList = new ArrayList(playbackStateCompat.f751i.size());
                        for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f751i) {
                            if (customAction.f759e != null || Build.VERSION.SDK_INT < 21) {
                                obj = customAction.f759e;
                            } else {
                                String str = customAction.f755a;
                                CharSequence charSequence = customAction.f756b;
                                int i2 = customAction.f757c;
                                Bundle bundle = customAction.f758d;
                                PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i2);
                                builder.setExtras(bundle);
                                customAction.f759e = builder.build();
                                obj = customAction.f759e;
                            }
                            arrayList.add(obj);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        playbackStateCompat.f754l = h.a(playbackStateCompat.f743a, playbackStateCompat.f744b, playbackStateCompat.f745c, playbackStateCompat.f746d, playbackStateCompat.f747e, playbackStateCompat.f749g, playbackStateCompat.f750h, arrayList, playbackStateCompat.f752j, playbackStateCompat.f753k);
                    } else {
                        playbackStateCompat.f754l = g.a(playbackStateCompat.f743a, playbackStateCompat.f744b, playbackStateCompat.f745c, playbackStateCompat.f746d, playbackStateCompat.f747e, playbackStateCompat.f749g, playbackStateCompat.f750h, arrayList, playbackStateCompat.f752j);
                    }
                }
                obj3 = playbackStateCompat.f754l;
            }
            ((MediaSession) obj2).setPlaybackState((PlaybackState) obj3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(a aVar, Handler handler) {
            Object obj;
            Object obj2 = this.f707a;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f698b;
            }
            ((MediaSession) obj2).setCallback((MediaSession.Callback) obj, handler);
            if (aVar != null) {
                aVar.a(this, handler);
            }
        }

        e(Context context, String str, Bundle bundle) {
            MediaSession mediaSession = new MediaSession(context, str);
            this.f707a = mediaSession;
            this.f708b = new Token(mediaSession.getSessionToken(), new a(), null);
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements b {
        private final b A;
        private final Token B;
        private c C;
        private boolean D = false;
        private boolean E = false;
        private i.a F;
        private m.a G = new m.a() {
            /* class android.support.v4.media.session.MediaSessionCompat.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(160);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        final String f719a;

        /* renamed from: b  reason: collision with root package name */
        final String f720b;

        /* renamed from: c  reason: collision with root package name */
        final AudioManager f721c;

        /* renamed from: d  reason: collision with root package name */
        final RemoteControlClient f722d;

        /* renamed from: e  reason: collision with root package name */
        final Object f723e = new Object();

        /* renamed from: f  reason: collision with root package name */
        final RemoteCallbackList<a> f724f = new RemoteCallbackList<>();

        /* renamed from: g  reason: collision with root package name */
        boolean f725g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f726h = false;

        /* renamed from: i  reason: collision with root package name */
        volatile a f727i;

        /* renamed from: j  reason: collision with root package name */
        int f728j;

        /* renamed from: k  reason: collision with root package name */
        MediaMetadataCompat f729k;

        /* renamed from: l  reason: collision with root package name */
        PlaybackStateCompat f730l;

        /* renamed from: m  reason: collision with root package name */
        PendingIntent f731m;
        List<QueueItem> n;
        CharSequence o;
        int p;
        boolean q;
        int r;
        int s;
        Bundle t;
        int u;
        int v;
        m w;
        private final Context x;
        private final ComponentName y;
        private final PendingIntent z;

        static {
            Covode.recordClassIndex(159);
        }

        static int a(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return 5;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    return 8;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return 9;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    return 7;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        public int a(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final boolean b() {
            return this.f726h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final Token d() {
            return this.B;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void a(a aVar, Handler handler) {
            this.f727i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f723e) {
                    c cVar = this.C;
                    if (cVar != null) {
                        cVar.removeCallbacksAndMessages(null);
                    }
                    this.C = new c(handler.getLooper());
                    this.f727i.a(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(boolean z2) {
            if (z2 != this.f726h) {
                this.f726h = z2;
                if (g()) {
                    a(this.f729k);
                    a(this.f730l);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f723e) {
                this.f730l = playbackStateCompat;
            }
            c(playbackStateCompat);
            if (this.f726h) {
                if (playbackStateCompat == null) {
                    this.f722d.setPlaybackState(0);
                    this.f722d.setTransportControlFlags(0);
                    return;
                }
                b(playbackStateCompat);
                this.f722d.setTransportControlFlags(a(playbackStateCompat.f747e));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(i.a aVar) {
            synchronized (this.f723e) {
                this.F = aVar;
            }
        }

        class b extends b.a {
            static {
                Covode.recordClassIndex(162);
            }

            @Override // android.support.v4.media.session.b
            public final void b(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public final boolean o() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public final void a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                a(1, new a(str, bundle, resultReceiverWrapper.f693a));
            }

            @Override // android.support.v4.media.session.b
            public final boolean a(KeyEvent keyEvent) {
                if ((g.this.f728j & 1) == 0) {
                    return false;
                }
                a(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public final void a(a aVar) {
                if (g.this.f725g) {
                    try {
                        aVar.a();
                    } catch (Exception unused) {
                    }
                } else {
                    g.this.f724f.register(aVar, new i.a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public final void a(String str, Bundle bundle) {
                a(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void a(RatingCompat ratingCompat) {
                a(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public final void a(RatingCompat ratingCompat, Bundle bundle) {
                a(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void a(boolean z) {
                a(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.b
            public final boolean a() {
                return (g.this.f728j & 2) != 0;
            }

            @Override // android.support.v4.media.session.b
            public final String b() {
                return g.this.f719a;
            }

            @Override // android.support.v4.media.session.b
            public final String c() {
                return g.this.f720b;
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat g() {
                return g.this.f729k;
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence j() {
                return g.this.o;
            }

            @Override // android.support.v4.media.session.b
            public final int l() {
                return g.this.p;
            }

            @Override // android.support.v4.media.session.b
            public final boolean m() {
                return g.this.q;
            }

            @Override // android.support.v4.media.session.b
            public final int n() {
                return g.this.r;
            }

            @Override // android.support.v4.media.session.b
            public final int p() {
                return g.this.s;
            }

            @Override // android.support.v4.media.session.b
            public final void q() {
                d(3);
            }

            @Override // android.support.v4.media.session.b
            public final void r() {
                d(7);
            }

            @Override // android.support.v4.media.session.b
            public final void s() {
                d(12);
            }

            @Override // android.support.v4.media.session.b
            public final void t() {
                d(13);
            }

            @Override // android.support.v4.media.session.b
            public final void u() {
                d(14);
            }

            @Override // android.support.v4.media.session.b
            public final void v() {
                d(15);
            }

            @Override // android.support.v4.media.session.b
            public final void w() {
                d(16);
            }

            @Override // android.support.v4.media.session.b
            public final void x() {
                d(17);
            }

            @Override // android.support.v4.media.session.b
            public final long e() {
                long j2;
                synchronized (g.this.f723e) {
                    j2 = (long) g.this.f728j;
                }
                return j2;
            }

            @Override // android.support.v4.media.session.b
            public final List<QueueItem> i() {
                List<QueueItem> list;
                synchronized (g.this.f723e) {
                    list = g.this.n;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public final Bundle k() {
                Bundle bundle;
                synchronized (g.this.f723e) {
                    bundle = g.this.t;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent d() {
                PendingIntent pendingIntent;
                synchronized (g.this.f723e) {
                    pendingIntent = g.this.f731m;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (g.this.f723e) {
                    playbackStateCompat = g.this.f730l;
                    mediaMetadataCompat = g.this.f729k;
                }
                return MediaSessionCompat.a(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public final ParcelableVolumeInfo f() {
                int i2;
                int i3;
                int streamMaxVolume;
                int streamVolume;
                int i4;
                synchronized (g.this.f723e) {
                    i2 = g.this.u;
                    i3 = g.this.v;
                    m mVar = g.this.w;
                    if (i2 == 2) {
                        i4 = mVar.f3756a;
                        streamMaxVolume = mVar.f3757b;
                        streamVolume = mVar.f3758c;
                    } else {
                        streamMaxVolume = g.this.f721c.getStreamMaxVolume(i3);
                        streamVolume = g.this.f721c.getStreamVolume(i3);
                        i4 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i2, i3, i4, streamMaxVolume, streamVolume);
            }

            b() {
            }

            @Override // android.support.v4.media.session.b
            public final void a(int i2) {
                a(28, i2);
            }

            private void d(int i2) {
                g.this.a(i2, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public final void b(int i2) {
                a(23, i2);
            }

            @Override // android.support.v4.media.session.b
            public final void c(int i2) {
                a(30, i2);
            }

            @Override // android.support.v4.media.session.b
            public final void b(long j2) {
                a(18, Long.valueOf(j2));
            }

            @Override // android.support.v4.media.session.b
            public final void a(long j2) {
                a(11, Long.valueOf(j2));
            }

            @Override // android.support.v4.media.session.b
            public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
                a(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public final void b(a aVar) {
                g.this.f724f.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public final void a(MediaDescriptionCompat mediaDescriptionCompat) {
                a(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public final void d(String str, Bundle bundle) {
                a(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void e(String str, Bundle bundle) {
                a(20, str, bundle);
            }

            private void a(int i2, int i3) {
                g.this.a(i2, i3, 0, null, null);
            }

            private void a(int i2, Object obj) {
                g.this.a(i2, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public final void c(String str, Bundle bundle) {
                a(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void b(Uri uri, Bundle bundle) {
                a(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void a(Uri uri, Bundle bundle) {
                a(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void b(String str, Bundle bundle) {
                a(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void a(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                g.this.a(26, i2, 0, mediaDescriptionCompat, null);
            }

            @Override // android.support.v4.media.session.b
            public final void b(int i2, int i3, String str) {
                g.this.b(i2, i3);
            }

            private void a(int i2, Object obj, Bundle bundle) {
                g.this.a(i2, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public final void a(int i2, int i3, String str) {
                g.this.a(i2, i3);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a() {
            synchronized (this.f723e) {
                this.f728j = 3;
            }
            g();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat e() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f723e) {
                playbackStateCompat = this.f730l;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final i.a f() {
            i.a aVar;
            synchronized (this.f723e) {
                aVar = this.F;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void c() {
            this.f726h = false;
            this.f725g = true;
            g();
            for (int beginBroadcast = this.f724f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f724f.getBroadcastItem(beginBroadcast).a();
                } catch (RemoteException unused) {
                }
            }
            this.f724f.finishBroadcast();
            this.f724f.kill();
        }

        private boolean g() {
            if (this.f726h) {
                if (!this.D) {
                    if ((this.f728j & 1) != 0) {
                        a(this.z, this.y);
                        this.D = true;
                    }
                } else if ((this.f728j & 1) == 0) {
                    b(this.z, this.y);
                    this.D = false;
                }
                if (!this.E) {
                    if ((this.f728j & 2) != 0) {
                        this.f721c.registerRemoteControlClient(this.f722d);
                        this.E = true;
                        return true;
                    }
                } else if ((this.f728j & 2) == 0) {
                    this.f722d.setPlaybackState(0);
                    this.f721c.unregisterRemoteControlClient(this.f722d);
                    this.E = false;
                }
            } else {
                if (this.D) {
                    b(this.z, this.y);
                    this.D = false;
                }
                if (this.E) {
                    this.f722d.setPlaybackState(0);
                    this.f721c.unregisterRemoteControlClient(this.f722d);
                    this.E = false;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b(PlaybackStateCompat playbackStateCompat) {
            this.f722d.setPlaybackState(a(playbackStateCompat.f743a));
        }

        private void b(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f724f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f724f.getBroadcastItem(beginBroadcast).a(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f724f.finishBroadcast();
        }

        private void c(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f724f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f724f.getBroadcastItem(beginBroadcast).a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f724f.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        public class c extends Handler {
            static {
                Covode.recordClassIndex(163);
            }

            public final void handleMessage(Message message) {
                long j2;
                a aVar = g.this.f727i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    g.this.a(new i.a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    MediaSessionCompat.a(data.getBundle("data_extras"));
                    try {
                        switch (message.what) {
                            case 1:
                                Object obj = message.obj;
                                break;
                            case 2:
                                g.this.a(message.arg1, 0);
                                break;
                            case 4:
                                Object obj2 = message.obj;
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                Object obj3 = message.obj;
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                Object obj4 = message.obj;
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                aVar.a();
                                break;
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                Object obj5 = message.obj;
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                Object obj6 = message.obj;
                                break;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                Object obj7 = message.obj;
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                ((Long) message.obj).longValue();
                                break;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                aVar.b();
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                aVar.e();
                                break;
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                aVar.c();
                                break;
                            case 15:
                                aVar.d();
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                aVar.a(((Long) message.obj).longValue());
                                break;
                            case 19:
                                Object obj8 = message.obj;
                                break;
                            case v.U /*{ENCODED_INT: 20}*/:
                                Object obj9 = message.obj;
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.a(intent) && keyEvent != null) {
                                    if (keyEvent.getAction() == 0) {
                                        if (g.this.f730l == null) {
                                            j2 = 0;
                                        } else {
                                            j2 = g.this.f730l.f747e;
                                        }
                                        int keyCode = keyEvent.getKeyCode();
                                        if (keyCode == 126) {
                                            if ((j2 & 4) != 0) {
                                                aVar.a();
                                                break;
                                            }
                                        } else if (keyCode == 127) {
                                            if ((j2 & 2) != 0) {
                                                aVar.b();
                                                break;
                                            }
                                        } else {
                                            switch (keyCode) {
                                                case 86:
                                                    if ((j2 & 1) != 0) {
                                                        aVar.e();
                                                        break;
                                                    }
                                                    break;
                                                case 87:
                                                    if ((j2 & 32) != 0) {
                                                        aVar.c();
                                                        break;
                                                    }
                                                    break;
                                                case 88:
                                                    if ((j2 & 16) != 0) {
                                                        aVar.d();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                g.this.b(message.arg1, 0);
                                break;
                            case 23:
                                int i2 = message.arg1;
                                break;
                            case 25:
                                Object obj10 = message.obj;
                                break;
                            case 26:
                                Object obj11 = message.obj;
                                int i3 = message.arg1;
                                break;
                            case 27:
                                Object obj12 = message.obj;
                                break;
                            case 28:
                                if (g.this.n != null && message.arg1 >= 0 && message.arg1 < g.this.n.size()) {
                                    g.this.n.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                int i4 = message.arg1;
                                break;
                            case 31:
                                Object obj13 = message.obj;
                                break;
                        }
                    } finally {
                        g.this.a((i.a) null);
                    }
                }
            }

            public c(Looper looper) {
                super(looper);
            }
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor a(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f722d.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle a2;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.a(mediaMetadataCompat, MediaSessionCompat.f684b).a();
            }
            synchronized (this.f723e) {
                this.f729k = mediaMetadataCompat;
            }
            b(mediaMetadataCompat);
            if (this.f726h) {
                if (mediaMetadataCompat == null) {
                    a2 = null;
                } else {
                    a2 = mediaMetadataCompat.a();
                }
                a(a2).apply();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f721c.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public void b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f721c.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (this.u != 2) {
                this.f721c.adjustStreamVolume(this.v, i2, i3);
            } else if (this.w == null) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2, int i3) {
            if (this.u != 2) {
                this.f721c.setStreamVolume(this.v, i2, i3);
            } else if (this.w == null) {
            }
        }

        private static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                }
                return systemService;
            }
        }

        static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f733a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f734b;

            /* renamed from: c  reason: collision with root package name */
            public final ResultReceiver f735c;

            static {
                Covode.recordClassIndex(161);
            }

            public a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f733a = str;
                this.f734b = bundle;
                this.f735c = resultReceiver;
            }
        }

        public g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.x = context;
                this.f719a = context.getPackageName();
                this.f721c = (AudioManager) a(context, DataType.AUDIO);
                this.f720b = str;
                this.y = componentName;
                this.z = pendingIntent;
                b bVar = new b();
                this.A = bVar;
                this.B = new Token(bVar);
                this.p = 0;
                this.u = 1;
                this.v = 3;
                this.f722d = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.f723e) {
                c cVar = this.C;
                if (cVar != null) {
                    Message obtainMessage = cVar.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private HandlerC0010a f697a;

        /* renamed from: b  reason: collision with root package name */
        final Object f698b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<b> f699c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f700d;

        static {
            Covode.recordClassIndex(146);
        }

        public void a() {
        }

        public void a(long j2) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        class b implements d.a {
            static {
                Covode.recordClassIndex(148);
            }

            @Override // android.support.v4.media.session.d.a
            public final void a() {
                a.this.a();
            }

            @Override // android.support.v4.media.session.d.a
            public final void b() {
                a.this.b();
            }

            @Override // android.support.v4.media.session.d.a
            public final void c() {
                a.this.c();
            }

            @Override // android.support.v4.media.session.d.a
            public final void d() {
                a.this.d();
            }

            @Override // android.support.v4.media.session.d.a
            public final void e() {
                a.this.e();
            }

            @Override // android.support.v4.media.session.d.a
            public final void a(Object obj) {
                RatingCompat.a(obj);
            }

            b() {
            }

            @Override // android.support.v4.media.session.d.a
            public final void a(long j2) {
                a.this.a(j2);
            }

            @Override // android.support.v4.media.session.d.a
            public final boolean a(Intent intent) {
                return a.this.a(intent);
            }

            @Override // android.support.v4.media.session.d.a
            public final void a(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                } else {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    }
                }
            }

            @Override // android.support.v4.media.session.d.a
            public final void a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                e eVar;
                int i2;
                IBinder iBinder;
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        e eVar2 = (e) a.this.f699c.get();
                        if (eVar2 != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar2.f708b;
                            b bVar = token.f695b;
                            if (bVar == null) {
                                iBinder = null;
                            } else {
                                iBinder = bVar.asBinder();
                            }
                            androidx.core.app.c.a(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", token.f696c);
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && (eVar = (e) a.this.f699c.get()) != null && eVar.f712f != null && (i2 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i2 < eVar.f712f.size()) {
                        eVar.f712f.get(i2);
                    }
                } catch (BadParcelableException unused) {
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f698b = new f.b(new d());
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f698b = new e.b(new c());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f698b = new d.b(new b());
            } else {
                this.f698b = null;
            }
        }

        class c extends b implements e.a {
            static {
                Covode.recordClassIndex(149);
            }

            c() {
                super();
            }
        }

        class d extends c implements f.a {
            static {
                Covode.recordClassIndex(150);
            }

            d() {
                super();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        public class HandlerC0010a extends Handler {
            static {
                Covode.recordClassIndex(147);
            }

            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    a.this.a((i.a) message.obj);
                }
            }

            HandlerC0010a(Looper looper) {
                super(looper);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.media.i.a r12) {
            /*
                r11 = this;
                boolean r0 = r11.f700d
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                r8 = 0
                r11.f700d = r8
                android.support.v4.media.session.MediaSessionCompat$a$a r1 = r11.f697a
                r0 = 1
                r1.removeMessages(r0)
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$b> r0 = r11.f699c
                java.lang.Object r7 = r0.get()
                android.support.v4.media.session.MediaSessionCompat$b r7 = (android.support.v4.media.session.MediaSessionCompat.b) r7
                if (r7 != 0) goto L_0x0019
                return
            L_0x0019:
                android.support.v4.media.session.PlaybackStateCompat r0 = r7.e()
                r9 = 0
                if (r0 != 0) goto L_0x004b
                r2 = 0
            L_0x0023:
                r6 = 0
            L_0x0024:
                r4 = 516(0x204, double:2.55E-321)
                long r4 = r4 & r2
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0049
                r4 = 1
            L_0x002c:
                r0 = 514(0x202, double:2.54E-321)
                long r2 = r2 & r0
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0034
                r8 = 1
            L_0x0034:
                r7.a(r12)
                if (r6 == 0) goto L_0x0043
                if (r8 == 0) goto L_0x003e
                r11.b()
            L_0x003e:
                r0 = 0
                r7.a(r0)
                return
            L_0x0043:
                if (r4 == 0) goto L_0x003e
                r11.a()
                goto L_0x003e
            L_0x0049:
                r4 = 0
                goto L_0x002c
            L_0x004b:
                long r2 = r0.f747e
                int r1 = r0.f743a
                r0 = 3
                if (r1 != r0) goto L_0x0023
                r6 = 1
                goto L_0x0024
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.a.a(androidx.media.i$a):void");
        }

        public boolean a(Intent intent) {
            b bVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (bVar = this.f699c.get()) == null || this.f697a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            i.a f2 = bVar.f();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    a(f2);
                } else if (this.f700d) {
                    this.f697a.removeMessages(1);
                    this.f700d = false;
                    PlaybackStateCompat e2 = bVar.e();
                    if (!(e2 == null || (e2.f747e & 32) == 0)) {
                        c();
                    }
                } else {
                    this.f700d = true;
                    HandlerC0010a aVar = this.f697a;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, f2), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a(f2);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a(b bVar, Handler handler) {
            this.f699c = new WeakReference<>(bVar);
            HandlerC0010a aVar = this.f697a;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f697a = new HandlerC0010a(handler.getLooper());
        }
    }

    public final void a() {
        this.f686c.a();
    }

    public final boolean b() {
        return this.f686c.b();
    }

    public final void c() {
        this.f686c.c();
    }

    public final Token d() {
        return this.f686c.d();
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* class android.support.v4.media.session.MediaSessionCompat.QueueItem.AnonymousClass1 */

            static {
                Covode.recordClassIndex(141);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final MediaDescriptionCompat f690a;

        /* renamed from: b  reason: collision with root package name */
        public final long f691b;

        /* renamed from: c  reason: collision with root package name */
        private Object f692c;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(140);
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f690a + ", Id=" + this.f691b + " }";
        }

        QueueItem(Parcel parcel) {
            this.f690a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f691b = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            this.f690a.writeToParcel(parcel, i2);
            parcel.writeLong(this.f691b);
        }

        QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j2 != -1) {
                this.f690a = mediaDescriptionCompat;
                this.f691b = j2;
                this.f692c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* class android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(143);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f693a;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(142);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f693a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            this.f693a.writeToParcel(parcel, i2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* class android.support.v4.media.session.MediaSessionCompat.Token.AnonymousClass1 */

            static {
                Covode.recordClassIndex(145);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Token[] newArray(int i2) {
                return new Token[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Token createFromParcel(Parcel parcel) {
                Object readStrongBinder;
                if (Build.VERSION.SDK_INT >= 21) {
                    readStrongBinder = parcel.readParcelable(null);
                } else {
                    readStrongBinder = parcel.readStrongBinder();
                }
                return new Token(readStrongBinder);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final Object f694a;

        /* renamed from: b  reason: collision with root package name */
        public b f695b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f696c;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(144);
        }

        public final int hashCode() {
            Object obj = this.f694a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f694a;
            if (obj2 != null) {
                Object obj3 = token.f694a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f694a == null) {
                return true;
            } else {
                return false;
            }
        }

        private Token(Object obj, b bVar) {
            this(obj, bVar, null);
        }

        public static Token a(Object obj, b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(d.a(obj), bVar);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f694a, i2);
            } else {
                parcel.writeStrongBinder((IBinder) this.f694a);
            }
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f694a = obj;
            this.f695b = bVar;
            this.f696c = bundle;
        }
    }

    static class c extends g {
        private static boolean x = true;

        static {
            Covode.recordClassIndex(152);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public int a(long j2) {
            int a2 = super.a(j2);
            if ((j2 & 256) != 0) {
                return a2 | 256;
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public final void b(PlaybackStateCompat playbackStateCompat) {
            long j2 = playbackStateCompat.f744b;
            float f2 = playbackStateCompat.f746d;
            long j3 = playbackStateCompat.f750h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.f743a == 3) {
                long j4 = 0;
                if (j2 > 0) {
                    if (j3 > 0) {
                        j4 = elapsedRealtime - j3;
                        if (f2 > 0.0f && f2 != 1.0f) {
                            j4 = (long) (((float) j4) * f2);
                        }
                    }
                    j2 += j4;
                }
            }
            this.f722d.setPlaybackState(a(playbackStateCompat.f743a), j2, f2);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public final void b(PendingIntent pendingIntent, ComponentName componentName) {
            if (x) {
                this.f721c.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.b(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public final void a(PendingIntent pendingIntent, ComponentName componentName) {
            if (x) {
                try {
                    this.f721c.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    x = false;
                }
            }
            if (!x) {
                super.a(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b, android.support.v4.media.session.MediaSessionCompat.g
        public void a(a aVar, Handler handler) {
            super.a(aVar, handler);
            if (aVar == null) {
                this.f722d.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f722d.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() {
                /* class android.support.v4.media.session.MediaSessionCompat.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(153);
                }

                public final void onPlaybackPositionUpdate(long j2) {
                    c.this.a(18, -1, -1, Long.valueOf(j2), null);
                }
            });
        }

        c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    static class f extends e {
        static {
            Covode.recordClassIndex(158);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b, android.support.v4.media.session.MediaSessionCompat.e
        public final void a(i.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b, android.support.v4.media.session.MediaSessionCompat.e
        public final i.a f() {
            return new i.a(((MediaSession) this.f707a).getCurrentControllerInfo());
        }

        f(Context context, String str) {
            super(context, str, null);
        }
    }

    public final void a(a aVar) {
        b(aVar);
    }

    static class d extends c {
        static {
            Covode.recordClassIndex(154);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.g
        public final int a(long j2) {
            int a2 = super.a(j2);
            if ((j2 & 128) != 0) {
                return a2 | 512;
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.v4.media.session.MediaSessionCompat.g
        public final RemoteControlClient.MetadataEditor a(Bundle bundle) {
            long j2;
            RemoteControlClient.MetadataEditor a2 = super.a(bundle);
            if (this.f730l == null) {
                j2 = 0;
            } else {
                j2 = this.f730l.f747e;
            }
            if ((j2 & 128) != 0) {
                a2.addEditableKey(268435457);
            }
            if (bundle == null) {
                return a2;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                a2.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                a2.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                a2.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return a2;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b, android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.g
        public final void a(a aVar, Handler handler) {
            super.a(aVar, handler);
            if (aVar == null) {
                this.f722d.setMetadataUpdateListener(null);
                return;
            }
            this.f722d.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() {
                /* class android.support.v4.media.session.MediaSessionCompat.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(155);
                }

                public final void onMetadataUpdate(int i2, Object obj) {
                    if (i2 == 268435457 && (obj instanceof Rating)) {
                        d.this.a(19, -1, -1, RatingCompat.a(obj), null);
                    }
                }
            });
        }

        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public final void a(PendingIntent pendingIntent) {
        this.f686c.a(pendingIntent);
    }

    public final void b(a aVar) {
        if (aVar == null) {
            this.f686c.a(null, null);
        } else {
            this.f686c.a(aVar, new Handler());
        }
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        this.f686c.a(mediaMetadataCompat);
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        this.f686c.a(playbackStateCompat);
    }

    public final void a(boolean z) {
        this.f686c.a(z);
        Iterator<Object> it = this.f687d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (byte) 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2 > r5) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.v4.media.session.PlaybackStateCompat a(android.support.v4.media.session.PlaybackStateCompat r10, android.support.v4.media.MediaMetadataCompat r11) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.a(android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat):android.support.v4.media.session.PlaybackStateCompat");
    }

    public MediaSessionCompat(Context context, String str, byte b2) {
        this(context, str, (PendingIntent) null);
    }

    private MediaSessionCompat(Context context, String str, PendingIntent pendingIntent) {
        ComponentName componentName;
        this.f687d = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
                componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
            } else {
                queryBroadcastReceivers.size();
                componentName = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                f fVar = new f(context, str);
                this.f686c = fVar;
                b(new a() {
                    /* class android.support.v4.media.session.MediaSessionCompat.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(138);
                    }
                });
                fVar.a(pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 21) {
                e eVar = new e(context, str, null);
                this.f686c = eVar;
                b(new a() {
                    /* class android.support.v4.media.session.MediaSessionCompat.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(139);
                    }
                });
                eVar.a(pendingIntent);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                this.f686c = new d(context, str, componentName, pendingIntent);
            }
            this.f685a = new MediaControllerCompat(context, this);
            if (f684b == 0) {
                f684b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
