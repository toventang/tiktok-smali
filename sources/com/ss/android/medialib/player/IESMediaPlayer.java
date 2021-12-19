package com.ss.android.medialib.player;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.Point;
import com.ss.android.medialib.player.a;
import com.ss.android.ttve.nativePort.d;
import java.util.ArrayList;
import java.util.List;

public class IESMediaPlayer {
    private Context context;
    private long mHandle = nativeCreatePlayer();
    private a.AbstractC1302a mInfoListener;

    private native long nativeCreatePlayer();

    private native long nativeCurrentPosition(long j2);

    private native int nativeDeleteSeg(long j2, int i2);

    private native int nativeFillBackgroundColor(long j2, int i2);

    private native long nativeGetDuration(long j2);

    private native long[] nativeGetDurations(long j2);

    private native boolean nativeIsMultiSpeedSupported(long j2, int i2);

    private native boolean nativeIsPlaying(long j2);

    private native boolean nativeIsSeeking(long j2);

    private native int nativePause(long j2);

    private native int nativePrepare(long j2, String[] strArr, int i2, int i3);

    private native void nativeRelease(long j2);

    private native int nativeResume(long j2);

    private native int nativeSeek(long j2, long j3, int i2);

    private native int nativeSelect(long j2, int i2);

    private native void nativeSetBoundary(long j2, int i2, long j3, long j4);

    private native void nativeSetLoop(long j2, boolean z);

    private native int nativeSetSegPoints(long j2, int i2, long[] jArr);

    private native int nativeSetSegRotation(long j2, int i2, int i3);

    private native void nativeSetSpeed(long j2, int i2, double d2);

    private native void nativeSetVolume(long j2, double d2);

    private native int nativeStart(long j2, Surface surface);

    private native void nativeStop(long j2);

    public void onInfo(int i2, int i3) {
    }

    static {
        Covode.recordClassIndex(36928);
        d.c();
    }

    public long getCurrentPosition() {
        MethodCollector.i(4635);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4635);
            return 0;
        }
        long nativeCurrentPosition = nativeCurrentPosition(j2);
        MethodCollector.o(4635);
        return nativeCurrentPosition;
    }

    public long getDuration() {
        MethodCollector.i(4629);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4629);
            return 0;
        }
        long nativeGetDuration = nativeGetDuration(j2);
        MethodCollector.o(4629);
        return nativeGetDuration;
    }

    public boolean isPlaying() {
        MethodCollector.i(4638);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4638);
            return false;
        }
        boolean nativeIsPlaying = nativeIsPlaying(j2);
        MethodCollector.o(4638);
        return nativeIsPlaying;
    }

    public boolean isSeeking() {
        MethodCollector.i(4639);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4639);
            return false;
        }
        boolean nativeIsSeeking = nativeIsSeeking(j2);
        MethodCollector.o(4639);
        return nativeIsSeeking;
    }

    public int pause() {
        MethodCollector.i(4261);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4261);
            return -1;
        }
        int nativePause = nativePause(j2);
        MethodCollector.o(4261);
        return nativePause;
    }

    public void release() {
        MethodCollector.i(4270);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4270);
            return;
        }
        nativeRelease(j2);
        this.mHandle = 0;
        MethodCollector.o(4270);
    }

    public int resume() {
        MethodCollector.i(4217);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4217);
            return -1;
        }
        int nativeResume = nativeResume(j2);
        MethodCollector.o(4217);
        return nativeResume;
    }

    public void stop() {
        MethodCollector.i(4266);
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeStop(j2);
        }
        MethodCollector.o(4266);
    }

    public int unSelect() {
        MethodCollector.i(4278);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4278);
            return -1;
        }
        int nativeSelect = nativeSelect(j2, -1);
        MethodCollector.o(4278);
        return nativeSelect;
    }

    public List<Long> getDurations() {
        MethodCollector.i(4633);
        ArrayList arrayList = new ArrayList();
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4633);
            return arrayList;
        }
        long[] nativeGetDurations = nativeGetDurations(j2);
        if (nativeGetDurations != null) {
            for (long j3 : nativeGetDurations) {
                arrayList.add(Long.valueOf(j3));
            }
        }
        MethodCollector.o(4633);
        return arrayList;
    }

    public void setMessageListener(a.AbstractC1302a aVar) {
        this.mInfoListener = aVar;
    }

    public int seek(long j2) {
        return seek(j2, 0);
    }

    public int seekLeft(long j2) {
        return seek(j2, -1);
    }

    public int seekRight(long j2) {
        return seek(j2, 1);
    }

    public void setSpeed(double d2) {
        setSegSpeed(-1, d2);
    }

    public int prepare(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return prepare(arrayList);
    }

    public IESMediaPlayer(Context context2) {
        MethodCollector.i(4147);
        this.context = context2;
        MethodCollector.o(4147);
    }

    public int fillBackgroundColor(int i2) {
        MethodCollector.i(4510);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4510);
            return -1;
        }
        int nativeFillBackgroundColor = nativeFillBackgroundColor(j2, i2);
        MethodCollector.o(4510);
        return nativeFillBackgroundColor;
    }

    public boolean isSegMultiSpeedSupported(int i2) {
        MethodCollector.i(4586);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4586);
            return false;
        }
        boolean nativeIsMultiSpeedSupported = nativeIsMultiSpeedSupported(j2, i2);
        MethodCollector.o(4586);
        return nativeIsMultiSpeedSupported;
    }

    public void setLoop(boolean z) {
        MethodCollector.i(4273);
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeSetLoop(j2, z);
        }
        MethodCollector.o(4273);
    }

    public void setVolume(double d2) {
        MethodCollector.i(4642);
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeSetVolume(j2, d2);
        }
        MethodCollector.o(4642);
    }

    public int start(Surface surface) {
        MethodCollector.i(4214);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4214);
            return -1;
        }
        int nativeStart = nativeStart(j2, surface);
        MethodCollector.o(4214);
        return nativeStart;
    }

    public int deleteSeg(int i2) {
        MethodCollector.i(4636);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4636);
            return -1;
        } else if (i2 < 0) {
            MethodCollector.o(4636);
            return -2;
        } else {
            int nativeDeleteSeg = nativeDeleteSeg(j2, i2);
            MethodCollector.o(4636);
            return nativeDeleteSeg;
        }
    }

    public int select(int i2) {
        MethodCollector.i(4276);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4276);
            return -1;
        } else if (i2 < 0) {
            MethodCollector.o(4276);
            return -2;
        } else {
            int nativeSelect = nativeSelect(j2, i2);
            MethodCollector.o(4276);
            return nativeSelect;
        }
    }

    public int prepare(List<String> list) {
        int i2;
        int i3;
        MethodCollector.i(4211);
        if (this.mHandle == 0) {
            MethodCollector.o(4211);
            return -1;
        } else if (list == null || list.isEmpty()) {
            MethodCollector.o(4211);
            return -2;
        } else {
            Context context2 = this.context;
            if (context2 != null) {
                Pair<Integer, Integer> a2 = com.ss.android.medialib.c.a.a(context2);
                i2 = ((Integer) a2.first).intValue();
                i3 = ((Integer) a2.second).intValue();
            } else {
                i2 = 0;
                i3 = 0;
            }
            int nativePrepare = nativePrepare(this.mHandle, (String[]) list.toArray(new String[list.size()]), i2, i3);
            MethodCollector.o(4211);
            return nativePrepare;
        }
    }

    private int seek(long j2, int i2) {
        MethodCollector.i(4284);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.o(4284);
            return -1;
        }
        int nativeSeek = nativeSeek(j3, j2, i2);
        MethodCollector.o(4284);
        return nativeSeek;
    }

    public void setBoundary(long j2, long j3) {
        MethodCollector.i(4293);
        long j4 = this.mHandle;
        if (j4 != 0) {
            nativeSetBoundary(j4, -1, j2, j3);
        }
        MethodCollector.o(4293);
    }

    public void setSegRotation(int i2, int i3) {
        MethodCollector.i(4503);
        if (i2 < 0) {
            MethodCollector.o(4503);
            return;
        }
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeSetSegRotation(j2, i2, i3);
        }
        MethodCollector.o(4503);
    }

    public void setSegSpeed(int i2, double d2) {
        MethodCollector.i(4371);
        long j2 = this.mHandle;
        if (j2 != 0) {
            nativeSetSpeed(j2, i2, d2);
        }
        MethodCollector.o(4371);
    }

    public int setSegPoints(int i2, List<Point> list) {
        MethodCollector.i(4592);
        if (this.mHandle == 0) {
            MethodCollector.o(4592);
            return -1;
        } else if (list == null || list.isEmpty()) {
            MethodCollector.o(4592);
            return -2;
        } else {
            long[] jArr = new long[list.size()];
            int size = list.size();
            for (int i3 = 0; i3 < size; i3 += 2) {
                Point point = list.get(i3);
                if (point == null) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                } else {
                    jArr[i3] = point.getLeft();
                    jArr[i3 + 1] = point.getRight();
                }
            }
            int nativeSetSegPoints = nativeSetSegPoints(this.mHandle, i2, jArr);
            MethodCollector.o(4592);
            return nativeSetSegPoints;
        }
    }

    public void setSegBoundary(int i2, long j2, long j3) {
        MethodCollector.i(4298);
        if (i2 < 0) {
            MethodCollector.o(4298);
            return;
        }
        long j4 = this.mHandle;
        if (j4 != 0) {
            nativeSetBoundary(j4, i2, j2, j3);
        }
        MethodCollector.o(4298);
    }
}
