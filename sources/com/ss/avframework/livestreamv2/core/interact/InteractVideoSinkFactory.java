package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSink;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory;
import com.ss.avframework.utils.AVLog;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InteractVideoSinkFactory implements VideoSinkFactory {
    private InteractEngineBuilder mBuilder;
    private final InteractEngine mEngine;
    private Map<String, InteractVideoSink> mVideoSinkMap = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(100232);
    }

    public void release() {
        if (!this.mVideoSinkMap.isEmpty()) {
            String str = this.mVideoSinkMap.size() + " InteractVideoSink has not been released.";
            AVLog.iow("InteractVideoSinkFactory", str);
            AVLog.logKibana(5, "InteractVideoSinkFactory", str, null);
            Iterator<Map.Entry<String, InteractVideoSink>> it = this.mVideoSinkMap.entrySet().iterator();
            while (it.hasNext()) {
                InteractVideoSink value = it.next().getValue();
                if (value != null) {
                    value.release();
                    it.remove();
                }
            }
        }
    }

    public InteractVideoSink getVideoSink(String str) {
        return this.mVideoSinkMap.get(str);
    }

    public InteractVideoSinkFactory(InteractEngine interactEngine) {
        this.mBuilder = interactEngine.getBuilder();
        this.mEngine = interactEngine;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory
    public void destroy(VideoSink videoSink) {
        if (videoSink != null) {
            InteractVideoSink remove = this.mVideoSinkMap.remove(videoSink.getInteractId());
            if (remove != videoSink) {
                if (remove != null) {
                    remove.release();
                }
                String str = "remove " + videoSink.getInteractId() + ": expect " + videoSink + ", actual " + remove;
                AVLog.iow("InteractVideoSinkFactory", str);
                AVLog.logKibana(5, "InteractVideoSinkFactory", str, null);
            }
            ((InteractVideoSink) videoSink).release();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory
    public VideoSink create(String str, boolean z, boolean z2, boolean z3) {
        InteractVideoSink interactVideoSink = new InteractVideoSink(str, z, z2, z3, this.mEngine);
        interactVideoSink.setDumpFrameParams(this.mEngine.getBuilder().getDumpFrameParams());
        this.mVideoSinkMap.put(str, interactVideoSink);
        return interactVideoSink;
    }
}
