package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.io.File;
import java.math.BigDecimal;
import org.json.JSONObject;

final /* synthetic */ class ay implements f {

    /* renamed from: a  reason: collision with root package name */
    private final av f124984a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.tools.f f124985b;

    static {
        Covode.recordClassIndex(82103);
    }

    ay(av avVar, com.ss.android.ugc.aweme.tools.f fVar) {
        this.f124984a = avVar;
        this.f124985b = fVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        String str2;
        av avVar = this.f124984a;
        com.ss.android.ugc.aweme.tools.f fVar = this.f124985b;
        au auVar = (au) obj;
        b.a.f132249a.step("av_video_edit", "fetchMusicBeanEnd");
        d a2 = auVar.a();
        MultiEditVideoStatusRecordData b2 = auVar.b();
        int i2 = fVar.f140197d;
        if (b2 == null) {
            if (!avVar.f124979i.c()) {
                avVar.f124978h.a(new x("go edit activity"));
                avVar.f124978h.U();
                avVar.f124972b.b(false);
                avVar.f124978h.b(true);
                a.C0731a a3 = new a.C0731a(avVar.f124976f).a(R.string.h_k);
                a3.E = true;
                a3.b(R.string.h_i).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.h_j, (DialogInterface.OnClickListener) new bd(avVar), false).a().c();
                com.ss.android.ugc.aweme.df.f.a("recordData is null");
                return;
            }
            str = fVar.f140194a;
            str2 = fVar.f140195b;
            k.a("goEditActivity ev.getVideoPath = ".concat(String.valueOf(str)));
        } else {
            if (!avVar.f124979i.c()) {
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
            avVar.f124979i.a(avVar.f124977g.H().e());
            avVar.f124979i.aO = new BigDecimal((double) avVar.f124979i.f124757b.A).setScale(1, 4).floatValue();
            av.a(avVar.f124976f, avVar.f124979i);
            avVar.f124978h.P();
            com.ss.android.ugc.aweme.shortvideo.ui.creationflow.a aVar = new com.ss.android.ugc.aweme.shortvideo.ui.creationflow.a(avVar.f124976f, avVar.f124978h.f132687k, avVar.f124973c, avVar.f124979i, avVar.f124977g.N(), a2, b2, str, str2);
            cr.a().n = RecordScene.containBusiSticker(avVar.f124979i.f124757b.f124711f);
            avVar.f124980j.a(new b.a(aVar));
            avVar.f124972b.b(false);
            avVar.f124977g.J();
            if (avVar.f124979i.b()) {
                ((j) ApiCenter.a.a(avVar.f124976f).a(j.class)).F().a();
                return;
            }
            return;
        }
        boolean exists = str != null ? new File(str).exists() : false;
        boolean exists2 = str2 != null ? new File(str2).exists() : false;
        File file = new File(avVar.f124979i.f124757b.f124713h.e() + "1_frag_v");
        q.a("aweme_concat_success_rate", 1, new ar().a("errorCode", Integer.valueOf(i2)).a("videoPath", str.toString()).a("audioPath", str2).a("videoFileExists", String.valueOf(exists)).a("audioFileExists", String.valueOf(exists2)).a("firstSegmentPath", String.valueOf(file.exists())).a("firstSegmentLength", String.valueOf(file.length())).a("hardEncode", String.valueOf(avVar.f124979i.f124757b.f124710e)).a("abParam", (Boolean) true).a());
        String string = avVar.f124976f.getString(R.string.ase, new Object[]{Integer.valueOf(i2)});
        if ((i2 == -10021 || i2 == -2000) && avVar.f124976f != null) {
            string = avVar.f124976f.getString(R.string.b95);
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(avVar.f124976f).a(string).a();
        avVar.f124972b.b(false);
        gr.a("record_error", "2", "concat failed , ve result = " + fVar.f140197d);
    }
}
