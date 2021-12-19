package com.bytedance.android.livesdk.chatroom.g;

import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentSubOnlyAnimationInterval;
import com.bytedance.covode.number.Covode;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f15565a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final LruCache<Long, Long> f15566b = new LruCache<>(100);

    /* renamed from: c  reason: collision with root package name */
    private static final long f15567c = (((long) LiveCommentSubOnlyAnimationInterval.INSTANCE.getValue()) * 1000);

    private p() {
    }

    static {
        Covode.recordClassIndex(8604);
    }

    public static void b(long j2) {
        f15566b.put(Long.valueOf(j2), Long.valueOf(SystemClock.uptimeMillis()));
    }

    public static boolean a(long j2) {
        Long l2 = f15566b.get(Long.valueOf(j2));
        if (l2 == null) {
            return true;
        }
        long longValue = l2.longValue();
        if (longValue == 0 || SystemClock.uptimeMillis() - longValue > f15567c) {
            return true;
        }
        return false;
    }
}
