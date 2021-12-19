package com.ss.android.ugc.playerkit.session;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Session {
    public static final Session DEFAULT = new Session(true);
    private static final Queue<Session> pool = new LinkedBlockingQueue(10);
    public int bitrate = -1;
    public int blockCnt = -1;
    public int blockTime = -1;
    public boolean bytevc1;
    public int cacheSize = -1;
    public double calcBitrate;
    public float duration;
    public boolean isCurrentPlayer;
    public boolean isOpenSuperResolution;
    private boolean isStub;
    public String key;
    public float playBitrate = -1.0f;
    public int playTime = -1;
    public m.e playerType;
    public int preSuperResolution;
    public String sourceId;
    public float speed = -1.0f;
    public b state;
    public String uri;
    public String url;
    public i urlModel;

    public boolean isStub() {
        return this.isStub;
    }

    static Session instance() {
        Session poll = pool.poll();
        if (poll == null) {
            return new Session();
        }
        return poll;
    }

    public void recycle() {
        clear();
        pool.offer(this);
    }

    static {
        Covode.recordClassIndex(98022);
    }

    private Session() {
    }

    private void clear() {
        this.sourceId = null;
        this.uri = null;
        this.url = null;
        this.bytevc1 = false;
        this.duration = 0.0f;
        this.speed = -1.0f;
        this.blockCnt = -1;
        this.blockTime = -1;
        this.bitrate = -1;
        this.playBitrate = -1.0f;
        this.playTime = -1;
        this.cacheSize = -1;
        this.playerType = null;
        this.isCurrentPlayer = false;
        this.urlModel = null;
        this.state = null;
        this.calcBitrate = 0.0d;
        this.isOpenSuperResolution = false;
        this.preSuperResolution = 0;
    }

    public String toString() {
        return "Session{key='" + this.key + '\'' + ", sourceId='" + this.sourceId + '\'' + ", uri='" + this.uri + '\'' + ", url='" + this.url + '\'' + ", bytevc1=" + this.bytevc1 + ", duration=" + this.duration + ", speed=" + this.speed + ", blockCnt=" + this.blockCnt + ", blockTime=" + this.blockTime + ", bitrate=" + this.bitrate + ", calcBitrate=" + this.calcBitrate + ", playBitrate=" + this.playBitrate + ", playTime=" + this.playTime + ", cacheSize=" + this.cacheSize + ", playerType=" + this.playerType + ", isCurrentPlayer=" + this.isCurrentPlayer + ", urlModel=" + this.urlModel + ", state=" + this.state + ", isOpenSuperResolution=" + this.isOpenSuperResolution + ", preSuperResolution=" + this.preSuperResolution + ", isStub=" + this.isStub + '}';
    }

    public Session(boolean z) {
        this.isStub = z;
    }
}
