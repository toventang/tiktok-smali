package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class InteractVideoClientFactory implements LiveCore.ILiveCoreTextureFrameAvailableListener, VideoClientFactory {
    private String TAG = "InteractVideoClientFactory";
    private InteractEngine mEngine;
    private ByteBuffer mSeiBuffer;
    private List<String> mSeiList = new ArrayList();
    private ArrayList<LiveCore.ILiveCoreTextureFrameAvailableListener> mVideoClients = new ArrayList<>();

    static {
        Covode.recordClassIndex(100224);
    }

    private int peekSeiSize() {
        int size;
        MethodCollector.i(13757);
        synchronized (this.mSeiList) {
            try {
                size = this.mSeiList.size();
            } finally {
                MethodCollector.o(13757);
            }
        }
        return size;
    }

    private String popSei() {
        String str;
        MethodCollector.i(13807);
        synchronized (this.mSeiList) {
            try {
                if (!this.mSeiList.isEmpty()) {
                    str = this.mSeiList.remove(0);
                } else {
                    str = null;
                }
            } finally {
                MethodCollector.o(13807);
            }
        }
        return str;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public VideoClient create() {
        InteractVideoClient interactVideoClient;
        MethodCollector.i(13564);
        AVLog.d(this.TAG, "Create video client ");
        synchronized (this.mVideoClients) {
            try {
                if (this.mVideoClients.isEmpty()) {
                    this.mEngine.addTextureFrameAvailableListener(this);
                }
                interactVideoClient = new InteractVideoClient(this.mEngine.getBuilder().isEnableRtcPushStatics());
                interactVideoClient.setDumpFrameParams(this.mEngine.getBuilder().getDumpFrameParams());
                this.mVideoClients.add(interactVideoClient);
            } finally {
                MethodCollector.o(13564);
            }
        }
        return interactVideoClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer getExtraSei() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory.getExtraSei():java.nio.ByteBuffer");
    }

    public InteractVideoClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
    }

    private void pushSei(String str) {
        MethodCollector.i(13698);
        synchronized (this.mSeiList) {
            try {
                this.mSeiList.add(str);
                if (this.mSeiList.size() > 30) {
                    AVLog.e(this.TAG, "SEI buffer overflow with drop old sei...");
                    this.mSeiList.remove(0);
                }
            } finally {
                MethodCollector.o(13698);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public void destroy(VideoClient videoClient) {
        MethodCollector.i(13629);
        AVLog.d(this.TAG, "Destroy video client ");
        synchronized (this.mVideoClients) {
            try {
                this.mVideoClients.remove((InteractVideoClient) videoClient);
                if (this.mVideoClients.isEmpty()) {
                    this.mEngine.addTextureFrameAvailableListener(this);
                    this.mEngine.removeTextureFrameAvailableListener(this);
                }
            } finally {
                MethodCollector.o(13629);
            }
        }
    }

    public void needSaveSei(String str, Object obj) {
        int size;
        MethodCollector.i(13631);
        synchronized (this.mVideoClients) {
            try {
                size = this.mVideoClients.size();
            } catch (Throwable th) {
                MethodCollector.o(13631);
                throw th;
            }
        }
        if (size > 0) {
            if (str != null && str.equals("contour_info") && (obj instanceof String)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject((String) obj);
                    jSONObject2.put("interact_id", this.mEngine.getInteractId());
                    jSONObject.put(str, jSONObject2);
                    pushSei(jSONObject.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(str, obj);
                    pushSei(jSONObject3.toString());
                    MethodCollector.o(13631);
                    return;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                    AVLog.ioe(this.TAG, "Saving sei failed. ", e3);
                    MethodCollector.o(13631);
                    return;
                }
            }
        }
        AVLog.logToIODevice2(6, this.TAG, "Ignore sei size " + size + " is json " + (obj instanceof JSONObject), null, "sei-json", 1000);
        MethodCollector.o(13631);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr) {
        onTextureFrameAvailable(GLThreadManager.getEGLContext(), i2, z, i3, i4, j2, fArr, objArr);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener
    public void onTextureFrameAvailable(android.opengl.EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr) {
        Object[] objArr2 = objArr;
        MethodCollector.i(13863);
        if (objArr2.length <= 0) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && peekSeiSize() > 0) {
            objArr2[0] = getExtraSei();
        }
        synchronized (this.mVideoClients) {
            try {
                Iterator<LiveCore.ILiveCoreTextureFrameAvailableListener> it = this.mVideoClients.iterator();
                while (it.hasNext()) {
                    it.next().onTextureFrameAvailable(eGLContext, i2, z, i3, i4, j2, fArr, objArr2);
                }
            } finally {
                MethodCollector.o(13863);
            }
        }
    }
}
