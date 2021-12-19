package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.List;

final class c {

    public interface a {
        static {
            Covode.recordClassIndex(178);
        }

        void a();

        void a(Object obj);

        void a(List<?> list);

        void b();

        void b(Object obj);

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(177);
    }

    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        protected final T f773a;

        static {
            Covode.recordClassIndex(179);
        }

        public final void onSessionDestroyed() {
            this.f773a.a();
        }

        public b(T t) {
            this.f773a = t;
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f773a.b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f773a.a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f773a.a(list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f773a.c();
        }

        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f773a.d();
        }

        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            T t = this.f773a;
            playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if (!((audioAttributes.getFlags() & 1) == 1 || (audioAttributes.getFlags() & 4) == 4)) {
                audioAttributes.getUsage();
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            t.e();
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f773a.b();
        }
    }
}
