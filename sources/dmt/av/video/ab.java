package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import dmt.av.video.b.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156763a;

    static {
        Covode.recordClassIndex(104113);
    }

    ab(z zVar) {
        this.f156763a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156763a;
        AudioRecorderParam audioRecorderParam = (AudioRecorderParam) obj;
        if (audioRecorderParam != null) {
            j jVar = zVar.H;
            c.a.a();
            jVar.a(audioRecorderParam, c.a.c());
        }
    }
}
