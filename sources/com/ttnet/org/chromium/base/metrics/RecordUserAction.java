package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;

public class RecordUserAction {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155277a = true;

    public interface UserActionCallback {
        static {
            Covode.recordClassIndex(103327);
        }

        void onActionRecorded(String str);
    }

    private static native long nativeAddActionCallbackForTesting(UserActionCallback userActionCallback);

    public static native void nativeRecordUserAction(String str);

    private static native void nativeRemoveActionCallbackForTesting(long j2);

    static {
        Covode.recordClassIndex(103326);
    }
}
