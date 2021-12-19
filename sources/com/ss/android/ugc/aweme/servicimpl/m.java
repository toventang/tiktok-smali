package com.ss.android.ugc.aweme.servicimpl;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.au;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.utils.i;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.io.File;
import java.math.BigDecimal;
import org.json.JSONObject;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final j f121917a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.tools.f f121918b;

    static {
        Covode.recordClassIndex(79933);
    }

    m(j jVar, com.ss.android.ugc.aweme.tools.f fVar) {
        this.f121917a = jVar;
        this.f121918b = fVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        String str2;
        j jVar = this.f121917a;
        com.ss.android.ugc.aweme.tools.f fVar = this.f121918b;
        au auVar = (au) obj;
        b.a.f132249a.step("av_video_edit", "fetchMusicBeanEnd");
        d a2 = auVar.a();
        MultiEditVideoStatusRecordData b2 = auVar.b();
        int i2 = fVar.f140197d;
        if (b2 == null) {
            if (!jVar.f121910i.c()) {
                jVar.f121909h.a(new x("go edit activity"));
                jVar.f121909h.U();
                jVar.f121903b.b(false);
                jVar.f121909h.b(true);
                a.C0731a a3 = new a.C0731a(jVar.f121907f).a(R.string.h_k);
                a3.E = true;
                a3.b(R.string.h_i).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.h_j, (DialogInterface.OnClickListener) new r(jVar), false).a().c();
                com.ss.android.ugc.aweme.df.f.a("recordData is null");
                return;
            }
            str = fVar.f140194a;
            str2 = fVar.f140195b;
            k.a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        } else {
            if (!jVar.f121910i.c()) {
                str = b2.curMultiEditVideoRecordData.segmentDataList.get(0).videoPath;
                str2 = b2.curMultiEditVideoRecordData.segmentDataList.get(0).audioPath;
                k.a("goEditActivity segmentDataList.get(0) video path = ".concat(String.valueOf(str)));
            }
            str = fVar.f140194a;
            str2 = fVar.f140195b;
            k.a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        }
        e.a("onConcatFinished:".concat(String.valueOf(i2)));
        if (i2 >= 0) {
            q.a("aweme_concat_success_rate", 0, (JSONObject) null);
            jVar.f121910i.a(jVar.f121908g.H().e());
            jVar.f121910i.aO = new BigDecimal((double) jVar.f121910i.f124757b.A).setScale(1, 4).floatValue();
            j.a(jVar.f121907f, jVar.f121910i);
            jVar.f121909h.P();
            com.ss.android.ugc.aweme.shortvideo.ui.creationflow.a aVar = new com.ss.android.ugc.aweme.shortvideo.ui.creationflow.a(jVar.f121907f, jVar.f121909h.f132687k, jVar.f121904c, jVar.f121910i, jVar.f121908g.N(), a2, b2, str, str2);
            cr.a().n = RecordScene.containBusiSticker(jVar.f121910i.f124757b.f124711f);
            jVar.f121911j.a(new b.a(aVar));
            jVar.f121903b.b(false);
            jVar.f121908g.J();
            return;
        }
        boolean a4 = str != null ? i.a(str) : false;
        boolean exists = str2 != null ? new File(str2).exists() : false;
        File file = new File(jVar.f121910i.f124757b.f124713h.e() + "1_frag_v");
        q.a("aweme_concat_success_rate", 1, new ar().a("errorCode", Integer.valueOf(i2)).a("videoPath", str.toString()).a("audioPath", str2).a("videoFileExists", String.valueOf(a4)).a("audioFileExists", String.valueOf(exists)).a("firstSegmentPath", String.valueOf(file.exists())).a("firstSegmentLength", String.valueOf(file.length())).a("hardEncode", String.valueOf(jVar.f121910i.f124757b.f124710e)).a("abParam", (Boolean) true).a());
        String string = jVar.f121907f.getString(R.string.ase, new Object[]{Integer.valueOf(i2)});
        if ((i2 == -10021 || i2 == -2000) && jVar.f121907f != null) {
            string = jVar.f121907f.getString(R.string.b95);
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(jVar.f121907f).a(string).a();
        jVar.f121903b.b(false);
        gr.a("record_error", "2", "concat failed , ve result = " + fVar.f140197d);
    }
}
