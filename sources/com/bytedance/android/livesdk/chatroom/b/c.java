package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.c.d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.android.livesdk.model.message.t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.Queue;

public enum c {
    INSTANCE;
    
    private d bigGiftPlayStateEvent;
    Runnable followGuideRunnable;
    private Handler mainHandler;
    private boolean sIsBusy;
    private boolean sIsRunning;
    private a sMessageCallback;
    private Queue<com.bytedance.android.livesdkapi.h.a> sMessageQueue;

    public interface a {
        static {
            Covode.recordClassIndex(8299);
        }

        void a(com.bytedance.android.livesdkapi.h.a aVar);
    }

    public final void onMessageFinish() {
        this.sIsBusy = false;
        a();
    }

    static {
        Covode.recordClassIndex(8298);
    }

    public final void stop() {
        this.sMessageCallback = null;
        this.sMessageQueue = null;
        this.sIsRunning = false;
        this.sIsBusy = false;
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mainHandler = null;
        this.followGuideRunnable = null;
    }

    private void a() {
        Queue<com.bytedance.android.livesdkapi.h.a> queue = this.sMessageQueue;
        if (queue != null && queue.size() > 0 && this.sMessageCallback != null && this.sIsRunning && !this.sIsBusy) {
            this.sIsBusy = true;
            this.sMessageCallback.a(this.sMessageQueue.poll());
        }
    }

    public final void start(a aVar) {
        this.sMessageCallback = aVar;
        this.sMessageQueue = new ArrayDeque();
        this.sIsRunning = true;
        this.sIsBusy = false;
    }

    static boolean a(Room room) {
        if (room == null) {
            return false;
        }
        long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return true;
        }
        return false;
    }

    public final void add(com.bytedance.android.livesdkapi.h.a aVar) {
        Queue<com.bytedance.android.livesdkapi.h.a> queue;
        if (this.sIsRunning && aVar != null && (queue = this.sMessageQueue) != null) {
            queue.offer(aVar);
            a();
        }
    }

    public final void addFollowGuideMessage(Room room, com.bytedance.android.livesdkapi.h.a aVar) {
        if (aVar instanceof t) {
            if (a(room)) {
                Handler handler = this.mainHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                this.followGuideRunnable = null;
                onMessageFinish();
                return;
            }
            t tVar = (t) aVar;
            if (this.sIsRunning && this.sMessageQueue != null) {
                if (this.mainHandler == null) {
                    this.mainHandler = new Handler(Looper.getMainLooper());
                }
                if (this.followGuideRunnable == null) {
                    this.followGuideRunnable = new d(this, room, tVar);
                }
                d dVar = this.bigGiftPlayStateEvent;
                if (dVar == null || dVar.f15114b) {
                    this.mainHandler.postDelayed(this.followGuideRunnable, 500);
                } else {
                    this.mainHandler.postDelayed(new e(this, room, aVar), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            }
        }
    }

    public final void setBigGiftPlayStateEvent(boolean z, boolean z2, r rVar) {
        if (this.bigGiftPlayStateEvent == null) {
            this.bigGiftPlayStateEvent = new d(z, z2, rVar);
        }
        this.bigGiftPlayStateEvent.f15113a = z;
        this.bigGiftPlayStateEvent.f15114b = z2;
        this.bigGiftPlayStateEvent.f15115c = rVar;
    }
}
