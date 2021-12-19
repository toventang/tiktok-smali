package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.ISDKService;
import h.f.b.g;
import h.f.b.l;

public final class SplitParams {
    private ISDKService.SplitCallback callback;
    private Context context;
    private int minDuration;
    private String targetAudioFile;
    private String targetVideoFile;
    private boolean useSplitVideo;
    private boolean usingVEEditor;
    private String videoPath;
    private String workspace;

    static {
        Covode.recordClassIndex(79565);
    }

    public final ISDKService.SplitCallback getCallback() {
        return this.callback;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getTargetAudioFile() {
        return this.targetAudioFile;
    }

    public final String getTargetVideoFile() {
        return this.targetVideoFile;
    }

    public final boolean getUseSplitVideo() {
        return this.useSplitVideo;
    }

    public final boolean getUsingVEEditor() {
        return this.usingVEEditor;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getWorkspace() {
        return this.workspace;
    }

    public final void setMinDuration(int i2) {
        this.minDuration = i2;
    }

    public final void setUseSplitVideo(boolean z) {
        this.useSplitVideo = z;
    }

    public final void setUsingVEEditor(boolean z) {
        this.usingVEEditor = z;
    }

    public final void setCallback(ISDKService.SplitCallback splitCallback) {
        l.d(splitCallback, "");
        this.callback = splitCallback;
    }

    public final void setContext(Context context2) {
        l.d(context2, "");
        this.context = context2;
    }

    public final void setTargetAudioFile(String str) {
        l.d(str, "");
        this.targetAudioFile = str;
    }

    public final void setTargetVideoFile(String str) {
        l.d(str, "");
        this.targetVideoFile = str;
    }

    public final void setVideoPath(String str) {
        l.d(str, "");
        this.videoPath = str;
    }

    public final void setWorkspace(String str) {
        l.d(str, "");
        this.workspace = str;
    }

    public SplitParams(Context context2, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, ISDKService.SplitCallback splitCallback) {
        l.d(context2, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(splitCallback, "");
        this.context = context2;
        this.minDuration = i2;
        this.workspace = str;
        this.videoPath = str2;
        this.targetAudioFile = str3;
        this.targetVideoFile = str4;
        this.usingVEEditor = z;
        this.useSplitVideo = z2;
        this.callback = splitCallback;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitParams(Context context2, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, ISDKService.SplitCallback splitCallback, int i3, g gVar) {
        this(context2, i2, str, str2, str3, str4, z, (i3 & 128) != 0 ? true : z2, splitCallback);
    }
}
