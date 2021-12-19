package com.ss.android.vesdk;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.ttve.audio.c;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.e;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.au;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.g.a;
import com.ss.android.vesdk.runtime.VERuntime;

public class VEAudioRecorder implements au {

    /* renamed from: a  reason: collision with root package name */
    public long f150691a;

    /* renamed from: b  reason: collision with root package name */
    private VERuntime f150692b = VERuntime.a.INSTANCE.veRuntime;

    /* renamed from: c  reason: collision with root package name */
    private VEAudioEncodeSettings f150693c;

    /* renamed from: d  reason: collision with root package name */
    private String f150694d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f150695e;

    /* renamed from: f  reason: collision with root package name */
    private c f150696f = new c(new TEDubWriter());

    static {
        Covode.recordClassIndex(99096);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            destory();
        }
    }

    public VEAudioRecorder() {
        an.a("VEAudioRecorder", "VEAudioRecorder constructor in.");
    }

    @v(a = i.a.ON_DESTROY)
    public void destory() {
        an.a("VEAudioRecorder", "VEAudioRecorder destory in. mbRecording = " + this.f150695e);
        c cVar = this.f150696f;
        if (cVar.f61045e != null) {
            try {
                if (cVar.f61045e.getState() != 0) {
                    b.a("vesdk_event_will_stop_mic", c.a("editor uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    c.b(cVar.f61052l, cVar.f61045e);
                    c.b();
                    b.a("vesdk_event_did_stop_mic", c.a("editor uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                c.c(cVar.f61052l, cVar.f61045e);
            } catch (Exception unused) {
            }
            cVar.f61045e = null;
        }
        if (cVar.f61051k != null) {
            cVar.f61051k.b();
        }
    }

    public final String a() {
        if (!this.f150695e) {
            return this.f150694d;
        }
        throw new z(-105, "audio is recording");
    }

    public final long a(PrivacyCert privacyCert) {
        an.a("VEAudioRecorder", "VEAudioRecorder stopRecord in. mbRecording = " + this.f150695e);
        if (!this.f150695e) {
            return -105;
        }
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_RELEASE);
        this.f150691a = ((TEDubWriter) this.f150696f.f61051k).f61039b;
        this.f150696f.a(privacyCert);
        an.a("VEAudioRecorder", "Stop record ,current time is " + this.f150691a);
        this.f150695e = false;
        e.a("iesve_veaudiorecorder_audio_record", 1, (a) null);
        return this.f150691a;
    }

    public final int a(int i2, int i3) {
        if (i2 >= i3 || i2 < 0) {
            return -100;
        }
        e.a("iesve_veaudiorecorder_audio_delete", 1, (a) null);
        return TEVideoUtils.clearWavSeg(this.f150694d, i2, i3);
    }

    public final int a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.f150693c = vEAudioEncodeSettings;
        this.f150695e = false;
        this.f150694d = str;
        an.a("VEAudioRecorder", "VEAudioRecorder init in. mWavFilePath = " + this.f150694d);
        this.f150696f.a();
        return 0;
    }

    public final int a(int i2, int i3, PrivacyCert privacyCert) {
        an.a("VEAudioRecorder", "VEAudioRecorder startRecord in. mbRecording = " + this.f150695e);
        if (this.f150695e) {
            return -105;
        }
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
        this.f150696f.a(this.f150694d, 1.0d, i2, i3, privacyCert);
        this.f150695e = true;
        return 0;
    }

    public final int a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i2) {
        this.f150693c = vEAudioEncodeSettings;
        this.f150695e = false;
        if (TextUtils.isEmpty(str)) {
            an.a("VEAudioRecorder", "Empty directory use default path");
            this.f150694d = this.f150692b.f151398c.a();
        } else {
            an.a("VEAudioRecorder", "Use wav save path ".concat(String.valueOf(str)));
            this.f150694d = str;
        }
        an.a("VEAudioRecorder", "VEAudioRecorder init in. mWavFilePath = " + this.f150694d);
        this.f150696f.a();
        TEVideoUtils.generateMuteWav(this.f150694d, this.f150696f.f61046f, 2, i2);
        return 0;
    }
}
