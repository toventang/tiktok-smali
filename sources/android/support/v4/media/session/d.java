package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class d {

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(181);
        }

        void a();

        void a(long j2);

        void a(Object obj);

        void a(String str, Bundle bundle);

        void a(String str, Bundle bundle, ResultReceiver resultReceiver);

        boolean a(Intent intent);

        void b();

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(LiveFeedRefreshTimeSetting.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    public static class b<T extends a> extends MediaSession.Callback {

        /* renamed from: a  reason: collision with root package name */
        protected final T f774a;

        static {
            Covode.recordClassIndex(182);
        }

        public void onFastForward() {
        }

        public void onRewind() {
        }

        public void onSkipToQueueItem(long j2) {
        }

        public void onPause() {
            this.f774a.b();
        }

        public void onPlay() {
            this.f774a.a();
        }

        public void onSkipToNext() {
            this.f774a.c();
        }

        public void onSkipToPrevious() {
            this.f774a.d();
        }

        public void onStop() {
            this.f774a.e();
        }

        public b(T t) {
            this.f774a = t;
        }

        public void onSeekTo(long j2) {
            this.f774a.a(j2);
        }

        public void onSetRating(Rating rating) {
            this.f774a.a(rating);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f774a.a(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f774a.a(str, bundle);
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.a(bundle);
            this.f774a.a(str, bundle, resultReceiver);
        }
    }

    public static Object a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
