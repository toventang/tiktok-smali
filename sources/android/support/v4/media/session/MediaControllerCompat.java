package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionCompat.Token f663a;

    /* renamed from: b  reason: collision with root package name */
    private final b f664b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<a> f665c = new HashSet<>();

    interface b {
        static {
            Covode.recordClassIndex(132);
        }

        boolean a(KeyEvent keyEvent);
    }

    static {
        Covode.recordClassIndex(124);
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        final Object f672a;

        /* renamed from: b  reason: collision with root package name */
        HandlerC0009a f673b;

        /* renamed from: c  reason: collision with root package name */
        public a f674c;

        static {
            Covode.recordClassIndex(128);
        }

        static class c extends a.AbstractBinderC0011a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f677a;

            static {
                Covode.recordClassIndex(131);
            }

            @Override // android.support.v4.media.session.a
            public final void a(boolean z) {
            }

            @Override // android.support.v4.media.session.a
            public void a(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a() {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b() {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(13, null, null);
                }
            }

            c(a aVar) {
                this.f677a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void a(Bundle bundle) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(int i2) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i2), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b(int i2) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i2), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void b(boolean z) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                f fVar;
                a aVar = this.f677a.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        fVar = new f(parcelableVolumeInfo.f738a, parcelableVolumeInfo.f739b, parcelableVolumeInfo.f740c, parcelableVolumeInfo.f741d, parcelableVolumeInfo.f742e);
                    } else {
                        fVar = null;
                    }
                    aVar.a(4, fVar, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(CharSequence charSequence) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void a(String str, Bundle bundle) {
                a aVar = this.f677a.get();
                if (aVar != null) {
                    aVar.a(1, str, bundle);
                }
            }
        }

        static class b implements c.a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f676a;

            static {
                Covode.recordClassIndex(130);
            }

            @Override // android.support.v4.media.session.c.a
            public final void a() {
                this.f676a.get();
            }

            @Override // android.support.v4.media.session.c.a
            public final void b() {
                this.f676a.get();
            }

            @Override // android.support.v4.media.session.c.a
            public final void c() {
                this.f676a.get();
            }

            @Override // android.support.v4.media.session.c.a
            public final void d() {
                this.f676a.get();
            }

            @Override // android.support.v4.media.session.c.a
            public final void e() {
                this.f676a.get();
            }

            b(a aVar) {
                this.f676a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public final void b(Object obj) {
                if (this.f676a.get() != null && obj != null && Build.VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    ((MediaMetadata) obj).writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    obtain.recycle();
                    MediaMetadataCompat.CREATOR.createFromParcel(obtain).f656c = obj;
                }
            }

            @Override // android.support.v4.media.session.c.a
            public final void a(List<?> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (!(this.f676a.get() == null || list == null || Build.VERSION.SDK_INT < 21)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj == null || Build.VERSION.SDK_INT < 21) {
                            queueItem = null;
                        } else {
                            MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                            queueItem = new MediaSessionCompat.QueueItem(obj, MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                        }
                        arrayList.add(queueItem);
                    }
                }
            }

            @Override // android.support.v4.media.session.c.a
            public final void a(Object obj) {
                ArrayList arrayList;
                PlaybackStateCompat.CustomAction customAction;
                a aVar = this.f676a.get();
                if (aVar != null && aVar.f674c == null && obj != null && Build.VERSION.SDK_INT >= 21) {
                    PlaybackState playbackState = (PlaybackState) obj;
                    List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
                    Bundle bundle = null;
                    if (customActions != null) {
                        arrayList = new ArrayList(customActions.size());
                        for (PlaybackState.CustomAction customAction2 : customActions) {
                            if (customAction2 == null || Build.VERSION.SDK_INT < 21) {
                                customAction = null;
                            } else {
                                PlaybackState.CustomAction customAction3 = customAction2;
                                customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                                customAction.f759e = customAction2;
                            }
                            arrayList.add(customAction);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        bundle = playbackState.getExtras();
                    }
                    new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle).f754l = obj;
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f672a = new c.b(new b(this));
                return;
            }
            c cVar = new c(this);
            this.f674c = cVar;
            this.f672a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        public class HandlerC0009a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            boolean f675a;

            static {
                Covode.recordClassIndex(129);
            }

            public final void handleMessage(Message message) {
                if (this.f675a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.a(message.getData());
                            Object obj = message.obj;
                            return;
                        case 2:
                            Object obj2 = message.obj;
                            return;
                        case 3:
                            Object obj3 = message.obj;
                            return;
                        case 4:
                            Object obj4 = message.obj;
                            return;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            Object obj5 = message.obj;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            Object obj6 = message.obj;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            MediaSessionCompat.a((Bundle) message.obj);
                            return;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        default:
                            return;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            ((Integer) message.obj).intValue();
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            ((Integer) message.obj).intValue();
                            return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, Object obj, Bundle bundle) {
            HandlerC0009a aVar = this.f673b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i2, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a  reason: collision with root package name */
        protected final Object f666a;

        /* renamed from: b  reason: collision with root package name */
        final Object f667b = new Object();

        /* renamed from: c  reason: collision with root package name */
        final List<a> f668c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        HashMap<a, a> f669d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        final MediaSessionCompat.Token f670e;

        static {
            Covode.recordClassIndex(125);
        }

        static class a extends a.c {
            static {
                Covode.recordClassIndex(127);
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a() {
                throw new AssertionError();
            }

            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a, android.support.v4.media.session.MediaControllerCompat.a.c
            public final void a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a  reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f671a;

            static {
                Covode.recordClassIndex(126);
            }

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f671a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i2, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f671a.get();
                if (!(mediaControllerImplApi21 == null || bundle == null)) {
                    synchronized (mediaControllerImplApi21.f667b) {
                        mediaControllerImplApi21.f670e.f695b = b.a.a(androidx.core.app.c.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.f670e.f696c = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                        if (mediaControllerImplApi21.f670e.f695b != null) {
                            for (a aVar : mediaControllerImplApi21.f668c) {
                                a aVar2 = new a(aVar);
                                mediaControllerImplApi21.f669d.put(aVar, aVar2);
                                aVar.f674c = aVar2;
                                try {
                                    mediaControllerImplApi21.f670e.f695b.a(aVar2);
                                    aVar.a(13, null, null);
                                } catch (RemoteException unused) {
                                }
                            }
                            mediaControllerImplApi21.f668c.clear();
                        }
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final boolean a(KeyEvent keyEvent) {
            return ((MediaController) this.f666a).dispatchMediaButtonEvent(keyEvent);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f670e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f694a);
            this.f666a = mediaController;
            if (token.f695b == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }
    }

    static class e implements b {

        /* renamed from: a  reason: collision with root package name */
        private b f678a;

        static {
            Covode.recordClassIndex(135);
        }

        public e(MediaSessionCompat.Token token) {
            this.f678a = b.a.a((IBinder) token.f694a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final boolean a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f678a.a(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f664b.a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    static class c extends MediaControllerImplApi21 {
        static {
            Covode.recordClassIndex(133);
        }

        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class d extends c {
        static {
            Covode.recordClassIndex(134);
        }

        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        b bVar;
        MediaSessionCompat.Token d2 = mediaSessionCompat.d();
        this.f663a = d2;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                bVar = new d(context, d2);
            } else if (Build.VERSION.SDK_INT >= 23) {
                bVar = new c(context, d2);
            } else if (Build.VERSION.SDK_INT >= 21) {
                bVar = new MediaControllerImplApi21(context, d2);
            } else {
                bVar = new e(d2);
            }
        } catch (RemoteException unused) {
            bVar = null;
        }
        this.f664b = bVar;
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f663a = token;
            if (Build.VERSION.SDK_INT >= 24) {
                this.f664b = new d(context, token);
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f664b = new c(context, token);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f664b = new MediaControllerImplApi21(context, token);
            } else {
                this.f664b = new e(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f679a;

        /* renamed from: b  reason: collision with root package name */
        public final int f680b;

        /* renamed from: c  reason: collision with root package name */
        public final int f681c;

        /* renamed from: d  reason: collision with root package name */
        public final int f682d;

        /* renamed from: e  reason: collision with root package name */
        public final int f683e;

        static {
            Covode.recordClassIndex(136);
        }

        f(int i2, int i3, int i4, int i5, int i6) {
            this.f679a = i2;
            this.f680b = i3;
            this.f681c = i4;
            this.f682d = i5;
            this.f683e = i6;
        }
    }
}
