package com.ss.android.ugc.aweme.shortvideo;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.creativex.recorder.b.a.u;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.tools.j;
import com.ss.android.ugc.tools.c;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONObject;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    private final d f124955a;

    /* renamed from: b  reason: collision with root package name */
    private final g f124956b;

    /* renamed from: c  reason: collision with root package name */
    private final CameraComponentModel f124957c;

    /* renamed from: d  reason: collision with root package name */
    private final g.b f124958d;

    static {
        Covode.recordClassIndex(82090);
    }

    public final void onEvent(x xVar) {
        boolean z;
        TimeSpeedModelExtension timeSpeedModelExtension;
        dt d2 = this.f124957c.d();
        g.b bVar = this.f124958d;
        if (bVar != null) {
            z = bVar.f132697d.invoke().booleanValue();
        } else {
            z = false;
        }
        c.f149151f.a("DeleteLastFragmentEventHandlerFactory:onEvent,is segment empty" + d2.isEmpty() + ",enableTitan:" + z);
        if (!d2.isEmpty()) {
            this.f124956b.a(u.b.f28210a);
            if (!d2.isEmpty()) {
                timeSpeedModelExtension = (TimeSpeedModelExtension) d2.remove(d2.size() - 1);
                this.f124956b.N().c();
                this.f124957c.a((long) TimeSpeedModelExtension.calculateRealTime(d2));
                this.f124957c.G.f124740a.removeLastArray();
                this.f124957c.G.f124741b.removeLastArray();
                this.f124957c.G.f124742c.removeLastArray();
                this.f124957c.G.f124743d.removeLast();
                this.f124957c.G.f124744e.removeLast();
                this.f124957c.G.f124746g.removeLast();
                this.f124957c.G.f124745f.removeLast();
                if (this.f124957c.p.f124739a != null) {
                    this.f124957c.p.f124739a.removeReactionWindowInfo();
                }
                CameraComponentModel cameraComponentModel = this.f124957c;
                if (cameraComponentModel.o.f124731l.size() > 0) {
                    cameraComponentModel.o.f124731l.remove(cameraComponentModel.o.f124731l.size() - 1);
                }
                this.f124956b.b(t.a((List<TimeSpeedModelExtension>) d2, this.f124957c.h(), true));
                this.f124955a.a(new j(4));
                this.f124956b.b(true);
                this.f124956b.d(xVar);
                if (z) {
                    this.f124956b.a(timeSpeedModelExtension);
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            try {
                c.f149151f.c("DeleteLastFragmentEventHandlerFactory:onEvent,deleteLastFrag when segments in business is empty.reason:" + xVar.f28220g + ",recordState:" + xVar.f28214a);
                this.f124956b.d(xVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", xVar.f28214a);
                    jSONObject.put("error_message", xVar.f28220g);
                    jSONObject.put("exception", Log.getStackTraceString(new Throwable("delete last segments")));
                    c.f149150e.a(com.ss.android.ugc.tools.g.c.SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL, 0, jSONObject);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            timeSpeedModelExtension = null;
        }
        if (d2.isEmpty()) {
            if (this.f124957c.c()) {
                this.f124955a.a(new j(3));
            } else if (!this.f124957c.b()) {
                this.f124956b.a(this.f124957c.t, false);
            }
            g gVar = this.f124956b;
            if (!gVar.f132679c.f124714i) {
                gVar.o.b(false);
            }
        }
        this.f124956b.K().a();
        if (!z) {
            this.f124956b.a(timeSpeedModelExtension);
        }
    }

    public an(d dVar, g gVar, CameraComponentModel cameraComponentModel, g.b bVar) {
        this.f124955a = dVar;
        this.f124956b = gVar;
        this.f124957c = cameraComponentModel;
        this.f124958d = bVar;
    }
}
