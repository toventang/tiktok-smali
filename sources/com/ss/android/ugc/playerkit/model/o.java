package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class o implements Serializable {
    private int accertSessionPrepareType;
    private boolean bytevc1;
    private int engineState = -1;
    private int hwDecErrReason;
    private String id;
    private boolean isCodecTypeChanged;
    private boolean isTextureRender;
    private long onRenderTime = -1;
    private int playJavaThreadPriority;
    private int prerenderJavaThreadPriority;
    private boolean renderDisplayed;
    private long tid = -1;

    static {
        Covode.recordClassIndex(98009);
    }

    public int getAccertSessionPrepareType() {
        return this.accertSessionPrepareType;
    }

    public int getEngineState() {
        return this.engineState;
    }

    public int getHwDecErrReason() {
        return this.hwDecErrReason;
    }

    public String getId() {
        return this.id;
    }

    public long getOnRenderTime() {
        return this.onRenderTime;
    }

    public int getPlayJavaThreadPriority() {
        return this.playJavaThreadPriority;
    }

    public int getPrerenderJavaThreadPriority() {
        return this.prerenderJavaThreadPriority;
    }

    public boolean getRenderDisplayed() {
        return this.renderDisplayed;
    }

    public long getTid() {
        return this.tid;
    }

    public boolean isBytevc1() {
        return this.bytevc1;
    }

    public boolean isCodecTypeChanged() {
        return this.isCodecTypeChanged;
    }

    public boolean isTextureRender() {
        return this.isTextureRender;
    }

    public void setAccertSessionPrepareType(int i2) {
        this.accertSessionPrepareType = i2;
    }

    public void setBytevc1(boolean z) {
        this.bytevc1 = z;
    }

    public void setCodecTypeChanged(boolean z) {
        this.isCodecTypeChanged = z;
    }

    public void setEngineState(int i2) {
        this.engineState = i2;
    }

    public void setHwDecErrReason(int i2) {
        this.hwDecErrReason = i2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOnRenderTime(long j2) {
        this.onRenderTime = j2;
    }

    public void setPlayJavaThreadPriority(int i2) {
        this.playJavaThreadPriority = i2;
    }

    public void setPrerenderJavaThreadPriority(int i2) {
        this.prerenderJavaThreadPriority = i2;
    }

    public void setRenderDisplayed(boolean z) {
        this.renderDisplayed = z;
    }

    public void setTextureRender(boolean z) {
        this.isTextureRender = z;
    }

    public void setTid(long j2) {
        this.tid = j2;
    }

    public o(String str, boolean z, boolean z2) {
        this.id = str;
        this.bytevc1 = z;
        this.renderDisplayed = z2;
    }
}
