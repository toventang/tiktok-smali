package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.g;
import com.bytedance.creativex.recorder.b.a.w;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

final /* synthetic */ class dy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dw f126655a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f126656b;

    /* renamed from: c  reason: collision with root package name */
    private final w f126657c;

    static {
        Covode.recordClassIndex(83072);
    }

    dy(dw dwVar, Integer num, w wVar) {
        this.f126655a = dwVar;
        this.f126656b = num;
        this.f126657c = wVar;
    }

    public final void run() {
        dw dwVar = this.f126655a;
        Integer num = this.f126656b;
        w wVar = this.f126657c;
        c.f149151f.a("StartRecordingCommandEventHandlerFactory:startRecordWithResult:".concat(String.valueOf(num)));
        if (num.intValue() != 0) {
            int intValue = num.intValue();
            c.f149151f.a("StartRecordingCommandEventHandlerFactory:onStartRecordFailed ".concat(String.valueOf(intValue)));
            dwVar.f126648b.a(new g.b(intValue));
            j.a(dwVar.f126647a, (int) R.string.fep).a();
            x xVar = new x("start record failed, error code: ".concat(String.valueOf(intValue)));
            xVar.f28214a = 1;
            dwVar.f126648b.b(xVar);
        } else if (!dwVar.f126648b.n.f6468a.getValue().booleanValue()) {
            com.ss.android.ugc.aweme.shortvideo.w.g<?> gVar = dwVar.f126648b;
            l.d(wVar, "");
            if (!gVar.f132678b.n.invoke().booleanValue()) {
                new g.d().run();
            } else {
                gVar.S().a(gVar.J());
            }
            gVar.H().ae();
            wVar.f28213c.putInt("cameraId", gVar.R());
            wVar.f28213c.putString("cameraLensInfo", gVar.H().ad());
            c.f149151f.a("set hasStopped to false, cur Speed: " + wVar.f28211a);
            gVar.f132681e.a(wVar);
            gVar.f132679c.d().begin(wVar.f28211a, wVar.f28213c);
        }
    }
}
