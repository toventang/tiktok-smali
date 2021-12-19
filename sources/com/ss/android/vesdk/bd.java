package com.ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.f.e;
import com.ss.android.vesdk.g.a;
import com.ss.android.vesdk.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class bd implements e {

    /* renamed from: a  reason: collision with root package name */
    private final x f151068a;

    /* renamed from: b  reason: collision with root package name */
    private final TEInterface f151069b;

    static {
        Covode.recordClassIndex(99347);
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(bg bgVar) {
        MethodCollector.i(9389);
        an.c("VEEditor_VESequenceInvoker", "updateSceneTime... " + bgVar.toString());
        synchronized (this.f151068a) {
            try {
                this.f151069b.stop();
                int updateSenceTime = this.f151069b.updateSenceTime(bgVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", String.valueOf(updateSenceTime >= 0 ? 0 : updateSenceTime));
                    jSONObject.put("sceneTime", bgVar.toString());
                    b.a("vesdk_event_editor_update_scene_time", jSONObject, "behavior");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                if (updateSenceTime < 0) {
                    an.d("VEEditor_VESequenceInvoker", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                    return updateSenceTime;
                }
                this.f151068a.A = 0;
                this.f151068a.f151514c.b();
                this.f151069b.setTimeRange(0, updateSenceTime, 0);
                int prepareEngine = this.f151069b.prepareEngine(0);
                if (prepareEngine != 0) {
                    an.d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.o(9389);
                    return prepareEngine;
                }
                MethodCollector.o(9389);
                return 0;
            } finally {
                MethodCollector.o(9389);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(bg bgVar, int i2, int i3) {
        MethodCollector.i(9391);
        an.c("VEEditor_VESequenceInvoker", "updateSceneTime with start/end time" + bgVar.toString() + " startTime: " + i2 + " endTime: " + i3);
        synchronized (this.f151068a) {
            try {
                this.f151069b.stop();
                int updateSenceTime = this.f151069b.updateSenceTime(bgVar);
                if (updateSenceTime < 0) {
                    an.d("VEEditor_VESequenceInvoker", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                    return updateSenceTime;
                }
                this.f151068a.A = 0;
                this.f151069b.setTimeRange(i2, i3, 0);
                int prepareEngine = this.f151069b.prepareEngine(0);
                if (prepareEngine != 0) {
                    an.d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.o(9391);
                    return prepareEngine;
                }
                MethodCollector.o(9391);
                return 0;
            } finally {
                MethodCollector.o(9391);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final String a(int i2, int i3, int i4, String str) {
        String clipInfoStringWithPath;
        MethodCollector.i(9564);
        synchronized (this.f151068a) {
            try {
                an.a("VEEditor_VESequenceInvoker", "getClipFileInfoStringWithPath... " + i2 + ", " + i3 + ", " + i4);
                clipInfoStringWithPath = this.f151069b.getClipInfoStringWithPath(i2, i3, i4, str);
                an.a("VEEditor_VESequenceInvoker", "getClipInfoStringWithPath result ".concat(String.valueOf(clipInfoStringWithPath)));
            } finally {
                MethodCollector.o(9564);
            }
        }
        return clipInfoStringWithPath;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(String str, int i2, int i3, boolean z) {
        MethodCollector.i(9566);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "addAudioTrack... " + str + " In " + i2 + " Out " + i3 + " " + z);
                if (TextUtils.isEmpty(str)) {
                    return -100;
                }
                if (i3 <= i2 || i2 < 0) {
                    MethodCollector.o(9566);
                    return -100;
                }
                com.ss.android.ttve.monitor.e.a("iesve_veeditor_import_music", 1, (a) null);
                int addAudioTrack = this.f151069b.addAudioTrack(str, 0, i3 - i2, i2, i3, z);
                an.d("VEEditor_VESequenceInvoker", "trackIndexNative=".concat(String.valueOf(addAudioTrack)));
                int a2 = this.f151068a.s.a(addAudioTrack);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("path", str);
                    jSONObject.put("trimIn", i2);
                    jSONObject.put("trimOut", i3);
                    jSONObject.put("resultCode", a2 >= 0 ? 0 : -1);
                    b.a("vesdk_event_editor_audio_track", jSONObject, "behavior");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                an.c("VEEditor_VESequenceInvoker", "addAudioTrack... ".concat(String.valueOf(a2)));
                MethodCollector.o(9566);
                return a2;
            } finally {
                MethodCollector.o(9566);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(String str, int i2, int i3, int i4, int i5, boolean z) {
        Throwable th;
        MethodCollector.i(9723);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "addAudioTrack... " + str + " In " + i2 + " Out " + i3 + " SeqIn " + i4 + " seqOut " + i5 + " " + z);
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.o(9723);
                    return -100;
                } else if (i3 <= i2 || i2 < 0) {
                    MethodCollector.o(9723);
                    return -100;
                } else if (i5 <= i4 || i4 < 0) {
                    MethodCollector.o(9723);
                    return -100;
                } else {
                    try {
                        int a2 = this.f151068a.s.a(this.f151069b.addAudioTrack(str, (String) null, i4, i5, i2, i3, z, false));
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("path", str);
                            jSONObject.put("sequenceIn", i4);
                            jSONObject.put("sequenceOut", i5);
                            jSONObject.put("trimIn", i2);
                            jSONObject.put("trimOut", i3);
                            jSONObject.put("resultCode", a2 >= 0 ? 0 : a2);
                            b.a("vesdk_event_editor_audio_track", jSONObject, "behavior");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        an.c("VEEditor_VESequenceInvoker", "addAudioTrack... ".concat(String.valueOf(a2)));
                        MethodCollector.o(9723);
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        MethodCollector.o(9723);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(9723);
                throw th;
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final boolean a(int i2, int i3, float f2) {
        boolean trackVolume;
        MethodCollector.i(10225);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "setVolume... index:" + i2 + " type:" + i3 + " volume:" + f2);
                trackVolume = this.f151069b.setTrackVolume(i3, this.f151068a.s.a(1, i2), f2);
            } finally {
                MethodCollector.o(10225);
            }
        }
        return trackVolume;
    }

    public bd(x xVar) {
        this.f151068a = xVar;
        this.f151069b = xVar.B;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2) {
        an.c("VEEditor_VESequenceInvoker", "expandTimeline: ".concat(String.valueOf(i2)));
        return this.f151069b.expandTimeline(i2);
    }

    @Override // com.ss.android.vesdk.f.e
    public final float c(int i2) {
        an.c("VEEditor_VESequenceInvoker", "getVolume...");
        if (this.f151069b.getDuration() < 0) {
            return -100.0f;
        }
        return this.f151069b.getTrackVolume(1, this.f151068a.s.a(1, i2), 0);
    }

    @Override // com.ss.android.vesdk.f.e
    public final int b(int i2) {
        MethodCollector.i(10061);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "deleteAudioTrack... trackIndex:" + i2 + " needPrepare:false");
                if (i2 >= 0) {
                    int a2 = this.f151068a.s.a(1, i2);
                    this.f151068a.s.f61096c.remove(Integer.valueOf(i2));
                    return this.f151069b.deleteAudioTrack(a2, false);
                }
                MethodCollector.o(10061);
                return -100;
            } finally {
                MethodCollector.o(10061);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final List<VEClipParam> b(int i2, int i3) {
        List<VEClipParam> allClips = this.f151069b.getAllClips(i2, i3);
        for (int i4 = 0; i4 < allClips.size(); i4++) {
            an.c("VEEditor_VESequenceInvoker", "getAllClips: " + allClips.get(i4).toString());
        }
        return allClips;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3) {
        int prepareEngine;
        MethodCollector.i(9181);
        synchronized (this.f151068a) {
            try {
                a aVar = new a();
                aVar.a("iesve_veeditor_cut_duration", i3 - i2);
                com.ss.android.ttve.monitor.e.a("iesve_veeditor_cut_duration", 1, aVar);
                an.a("VEEditor_VESequenceInvoker", "setInOut... " + i2 + " " + i3);
                this.f151069b.stop();
                this.f151069b.setTimeRange(i2, i3, 0);
                prepareEngine = this.f151069b.prepareEngine(0);
            } finally {
                MethodCollector.o(9181);
            }
        }
        return prepareEngine;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, int i4) {
        return this.f151069b.setTrackDurationType(0, 0, 0);
    }

    @Override // com.ss.android.vesdk.f.e
    public final int b(int i2, int i3, x.g gVar) {
        int timeRange;
        MethodCollector.i(9387);
        synchronized (this.f151068a) {
            try {
                timeRange = this.f151069b.setTimeRange(i2, i3, gVar.getValue());
            } finally {
                MethodCollector.o(9387);
            }
        }
        return timeRange;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, ROTATE_DEGREE rotate_degree) {
        an.a("VEEditor_VESequenceInvoker", "setFileRotate...0" + " " + i3 + " " + rotate_degree);
        return this.f151069b.setClipAttr(0, 0, i3, "clip rotate", new StringBuilder().append(rotate_degree.ordinal()).toString());
    }

    @Override // com.ss.android.vesdk.f.e
    public final int b(int i2, int i3, int i4) {
        MethodCollector.i(9394);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "moveClip, trackType:0" + " from:" + i3 + " to:" + i4 + " isMoveEffect:true");
                this.f151069b.stop();
                int moveClip = this.f151069b.moveClip(0, i3, i4, true);
                if (moveClip < 0) {
                    an.d("VEEditor_VESequenceInvoker", "moveClip failed, ret = ".concat(String.valueOf(moveClip)));
                    return moveClip;
                }
                this.f151068a.A = 0;
                int g2 = this.f151068a.g();
                if (g2 != 0) {
                    an.d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g2)));
                    MethodCollector.o(9394);
                    return g2;
                }
                MethodCollector.o(9394);
                return 0;
            } finally {
                MethodCollector.o(9394);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, x.g gVar) {
        int prepareEngine;
        MethodCollector.i(9386);
        synchronized (this.f151068a) {
            try {
                a aVar = new a();
                aVar.a("iesve_veeditor_cut_duration", i3 - i2);
                com.ss.android.ttve.monitor.e.a("iesve_veeditor_cut_duration", 1, aVar);
                an.a("VEEditor_VESequenceInvoker", "setInOut... " + i2 + " " + i3 + " mode " + gVar.getValue());
                this.f151069b.stop();
                this.f151069b.setTimeRange(i2, i3, gVar.getValue());
                prepareEngine = this.f151069b.prepareEngine(0);
            } finally {
                MethodCollector.o(9386);
            }
        }
        return prepareEngine;
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, int i4, boolean z) {
        MethodCollector.i(9887);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "updateAudioTrack...  Index " + i2 + " In " + i3 + " Out " + i4 + " " + z);
                if (i2 < 0) {
                    return -100;
                }
                if (i4 <= i3 || i3 < 0) {
                    MethodCollector.o(9887);
                    return -100;
                }
                int updateAudioTrack = this.f151069b.updateAudioTrack(this.f151068a.s.a(1, i2), 0, i4 - i3, i3, i4, z, false);
                MethodCollector.o(9887);
                return updateAudioTrack;
            } finally {
                MethodCollector.o(9887);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        int i4 = i3;
        MethodCollector.i(9393);
        synchronized (this.f151068a) {
            try {
                an.c("VEEditor_VESequenceInvoker", "insertClip, trackType:0" + "clipIndex:" + i4);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    an.c("VEEditor_VESequenceInvoker", "index: " + i5 + "clipSourceParams: " + arrayList.get(i5).toString());
                }
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    an.c("VEEditor_VESequenceInvoker", "index: " + i6 + "clipTimelineParams: " + arrayList2.get(i6).toString());
                }
                this.f151069b.stop();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    int insertClip = this.f151069b.insertClip(0, 0, i4, arrayList.get(i7), arrayList2.get(i7));
                    if (insertClip < 0) {
                        an.d("VEEditor_VESequenceInvoker", "insertClip failed, ret = ".concat(String.valueOf(insertClip)));
                        return insertClip;
                    }
                    i4++;
                }
                this.f151068a.A = 0;
                TEInterface tEInterface = this.f151069b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                int g2 = this.f151068a.g();
                if (g2 != 0) {
                    an.d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g2)));
                    MethodCollector.o(9393);
                    return g2;
                }
                MethodCollector.o(9393);
                return 0;
            } finally {
                MethodCollector.o(9393);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        MethodCollector.i(9561);
        synchronized (this.f151068a) {
            try {
                x xVar = this.f151068a;
                if (xVar.f151512a.isMVInitialedInternal()) {
                    xVar.f151512a.changeMvUserVideoInfoInternal(0, iArr, vEClipTimelineParamArr, null);
                }
                an.a("VEEditor_VESequenceInvoker", "updateClipsTimelineParam, trackType:" + i2 + " trackIndex:0");
                if (iArr.length != vEClipTimelineParamArr.length || iArr.length <= 0) {
                    an.d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam failed, clipIndexes not match clipTimelineParams");
                    return -100;
                }
                for (int i4 = 0; i4 < vEClipTimelineParamArr.length; i4++) {
                    if (vEClipTimelineParamArr[i4].trimOut >= 0 && vEClipTimelineParamArr[i4].trimOut <= vEClipTimelineParamArr[i4].trimIn) {
                        an.d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam invalid param trimIn[" + i4 + "]=" + vEClipTimelineParamArr[i4].trimIn + ", trimOut[" + i4 + "]=" + vEClipTimelineParamArr[i4].trimOut);
                        MethodCollector.o(9561);
                        return -100;
                    }
                }
                this.f151069b.stop();
                if (i2 == 1) {
                    i3 = this.f151068a.s.a(1, 0);
                } else if (i2 == 0) {
                    i3 = this.f151068a.s.a(2, 0);
                }
                int updateClipsTimelineParam = this.f151069b.updateClipsTimelineParam(i2, i3, iArr, vEClipTimelineParamArr);
                if (updateClipsTimelineParam < 0) {
                    an.d("VEEditor_VESequenceInvoker", "updateClipsTimelineParam failed, ret = ".concat(String.valueOf(updateClipsTimelineParam)));
                    MethodCollector.o(9561);
                    return updateClipsTimelineParam;
                }
                this.f151068a.A = 0;
                TEInterface tEInterface = this.f151069b;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                int g2 = this.f151068a.g();
                if (g2 != 0) {
                    an.d("VEEditor_VESequenceInvoker", "Prepare Engine failed, ret = ".concat(String.valueOf(g2)));
                    MethodCollector.o(9561);
                    return g2;
                }
                MethodCollector.o(9561);
                return 0;
            } finally {
                MethodCollector.o(9561);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.e
    public final int a(int i2, int i3, int i4, int i5, int i6, boolean z) {
        MethodCollector.i(10060);
        synchronized (this.f151068a) {
            try {
                an.a("VEEditor_VESequenceInvoker", "updateAudioTrack...");
                if (i2 < 0) {
                    return -100;
                }
                if (i4 <= i3 || i3 < 0) {
                    MethodCollector.o(10060);
                    return -100;
                } else if (i6 <= i5 || i5 < 0) {
                    MethodCollector.o(10060);
                    return -100;
                } else {
                    int updateAudioTrack = this.f151069b.updateAudioTrack(this.f151068a.s.a(1, i2), i5, i6, i3, i4, z, false);
                    MethodCollector.o(10060);
                    return updateAudioTrack;
                }
            } finally {
                MethodCollector.o(10060);
            }
        }
    }
}
