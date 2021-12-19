package com.bytedance.helios.nativeaudio;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.a.b;
import com.bytedance.helios.api.a.c;
import com.bytedance.helios.api.b.k;
import com.bytedance.helios.api.b.l;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.d.n;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.g;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;
import java.util.List;

public class AudioMonitorImpl extends com.bytedance.helios.api.d.a implements c {
    public final List<n> mEventList = new ArrayList();

    private static native void startMonitor(AudioMonitorCallback audioMonitorCallback, boolean z, int i2);

    public static String typeToString(int i2) {
        return i2 != 0 ? i2 != 1 ? "Unknown" : "AAudio" : "OpenSLES";
    }

    @Override // com.bytedance.helios.api.a.c
    public List<n> getHoldingResources() {
        return this.mEventList;
    }

    static {
        Covode.recordClassIndex(17852);
        ByteHook.a();
        com_bytedance_helios_nativeaudio_AudioMonitorImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("nativeaudio");
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f30715a;

        static {
            Covode.recordClassIndex(17854);
        }

        public final void run() {
            l lVar = o.f30691g;
            if (lVar != null) {
                List<k> jsbEvents = lVar.getJsbEvents();
                if (jsbEvents.size() > 0) {
                    this.f30715a.C = "jsb";
                    this.f30715a.D = jsbEvents;
                    return;
                }
                this.f30715a.C = "";
            }
        }

        public a(n nVar) {
            this.f30715a = nVar;
        }
    }

    @Override // com.bytedance.helios.api.d.a
    public void startMonitor() {
        MethodCollector.i(7263);
        f.a("Helios-Log-Monitor-Ability-Api-Call", "startMonitor: ");
        startMonitor(new Callback(), true, 32);
        b.get().addResourceChecker("nar", this);
        MethodCollector.o(7263);
    }

    class Callback implements AudioMonitorCallback {
        static {
            Covode.recordClassIndex(17853);
        }

        Callback() {
        }

        public void onOpened(long j2, int i2, String str) {
            n buildPrivacyEvent = AudioMonitorImpl.buildPrivacyEvent(j2, i2, str, true);
            f.a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=open calledTime=" + buildPrivacyEvent.f30683l + " runtimeObjHashcode=" + j2 + " eventCurrentPageHashCode=" + buildPrivacyEvent.f30681j + " type=" + i2 + " msg=" + str);
            AudioMonitorImpl.this.mEventList.add(buildPrivacyEvent);
            if (i2 == 0) {
                buildPrivacyEvent.f30673b = 100496;
            } else {
                buildPrivacyEvent.f30673b = 100498;
            }
            com.bytedance.helios.sdk.c.f.a(buildPrivacyEvent);
        }

        public void onClosed(long j2, int i2, String str) {
            n event = AudioMonitorImpl.this.getEvent(j2, i2);
            if (event != null) {
                event.d(event.f30677f + "\n" + str);
                event.t = 1;
                event.f(com.bytedance.helios.sdk.d.n.f30907d[n.a.a(!event.f30679h, true ^ com.bytedance.helios.sdk.f.f30949b.d())]);
                event.b(AudioMonitorImpl.typeToString(i2) + "Close");
                if (i2 == 0) {
                    event.f30673b = 100497;
                } else {
                    event.f30673b = 100499;
                }
                f.a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=close calledTime=" + event.f30683l + " runtimeObjHashcode=" + j2 + " eventCurrentPageHashCode=" + event.f30681j + " type=" + i2 + " msg=" + str);
                com.bytedance.helios.sdk.c.f.a(event);
                AudioMonitorImpl.this.removeEvent(j2, i2);
            }
        }
    }

    public static void com_bytedance_helios_nativeaudio_AudioMonitorImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public com.bytedance.helios.api.b.n getEvent(long j2, int i2) {
        for (com.bytedance.helios.api.b.n nVar : this.mEventList) {
            if (nVar.q == j2 && TextUtils.equals(nVar.f30675d, typeToString(i2))) {
                return nVar;
            }
        }
        return null;
    }

    public void removeEvent(long j2, int i2) {
        for (int size = this.mEventList.size() - 1; size >= 0; size--) {
            com.bytedance.helios.api.b.n nVar = this.mEventList.get(size);
            if (nVar.q == j2 && TextUtils.equals(nVar.f30675d, typeToString(i2))) {
                this.mEventList.remove(size);
            }
        }
    }

    public static com.bytedance.helios.api.b.n buildPrivacyEvent(long j2, int i2, String str, boolean z) {
        String str2;
        boolean z2 = !com.bytedance.helios.sdk.f.f30949b.d();
        com.bytedance.helios.api.b.n nVar = new com.bytedance.helios.api.b.n();
        nVar.a("nar");
        nVar.t = 0;
        nVar.i("SensitiveApiException");
        nVar.c(typeToString(i2));
        StringBuilder append = new StringBuilder().append(typeToString(i2));
        if (z) {
            str2 = "Open";
        } else {
            str2 = "Close";
        }
        nVar.b(append.append(str2).toString());
        nVar.q = j2;
        nVar.d("AudioMonitorImpl.java:\n" + a.a(str));
        nVar.f30679h = !z2;
        nVar.f(n.a.a(z2));
        nVar.j(Thread.currentThread().getName());
        nVar.g(com.bytedance.helios.sdk.f.f30949b.e());
        nVar.e(com.bytedance.helios.sdk.f.f30949b.f30950c.toString());
        nVar.f30682k = com.bytedance.helios.sdk.f.f30949b.f();
        nVar.f30683l = System.currentTimeMillis();
        nVar.A = new com.bytedance.helios.api.b.a(b.get().getAnchorTaskName());
        g.b().postDelayed(new a(nVar), HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills());
        nVar.u.add("pair_monitor");
        return nVar;
    }
}
