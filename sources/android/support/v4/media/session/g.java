package android.support.v4.media.session;

import android.media.session.PlaybackState;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

final class g {
    static {
        Covode.recordClassIndex(189);
    }

    public static Object a(int i2, long j2, long j3, float f2, long j4, CharSequence charSequence, long j5, List<Object> list, long j6) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i2, j2, f2, j5);
        builder.setBufferedPosition(j3);
        builder.setActions(j4);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j6);
        return builder.build();
    }
}
