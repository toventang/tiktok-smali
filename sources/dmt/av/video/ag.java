package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.dr;
import com.ss.android.ugc.gamora.editor.a.a;
import com.ss.android.ugc.gamora.editor.a.c;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156768a;

    static {
        Covode.recordClassIndex(104118);
    }

    ag(z zVar) {
        this.f156768a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156768a;
        a aVar = (a) obj;
        if (aVar.f145675b) {
            boolean z = aVar.f145674a;
            if (c.c()) {
                if (zVar.G == null) {
                    zVar.G = new VEAudioSamiFilterParam();
                    zVar.G.samiType = 2;
                    zVar.G.samiModelPath = c.a();
                    zVar.G.samiParam = "{\n    \"name\":\"denoise_v2\",\n    \"version\":\"1.0\",\n    \"config\":{\n        \"denoisemode\":" + dr.a() + ",\n        \"denoiserate\":1.0\n    }\n}";
                }
                zVar.w.a(zVar.w.a(!z ? 1 : 0, 0, zVar.G), zVar.G);
            }
        }
    }
}
