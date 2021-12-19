package com.ss.android.ugc.aweme.cs.d.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.draft.model.i;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends b {
    static {
        Covode.recordClassIndex(49039);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.d.a.a.b
    public final long a() {
        long a2 = a(this.f79007a.W.S) + 0;
        EditPreviewInfo a3 = d.a(this.f79007a, false);
        if (a3 != null) {
            String[] reverseAudioArray = a3.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str : reverseAudioArray) {
                    a2 += a(str);
                }
            }
            String[] reverseVideoArray = a3.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str2 : reverseVideoArray) {
                    a2 += a(str2);
                }
            }
            String[] tempVideoArray = a3.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str3 : tempVideoArray) {
                    a2 += a(str3);
                }
            }
            List<EditVideoSegment> videoList = a3.getVideoList();
            if (videoList != null) {
                for (T t : videoList) {
                    a2 = a2 + a(t.getAudioPath()) + a(t.getVideoPath());
                }
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.d.a.a.b
    public final long c() {
        String str;
        ArrayList<String> arrayList;
        List<String> g2;
        long a2 = a(this.f79007a.W.T) + 0;
        com.ss.android.ugc.aweme.mvtheme.d dVar = this.f79007a.W.M;
        if (!(dVar == null || (arrayList = dVar.selectMediaList) == null || (g2 = n.g((Iterable) arrayList)) == null)) {
            for (String str2 : g2) {
                a2 += a(str2);
            }
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar2 = this.f79007a.W.M;
        if (dVar2 != null) {
            str = dVar2.videoCoverImgPath;
        } else {
            str = null;
        }
        return a2 + a(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.d.a.a.b
    public final long b() {
        long j2;
        ArrayList<EffectPointModel> effectPointModels;
        List g2;
        String str = null;
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(null, null, 3);
        if (this.f79007a.f83192m != 0) {
            String filterFolder = g.a().r().c().a(this.f79007a.f83192m).getFilterFolder();
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(filterFolder);
            j2 = aVar.f79012a + 0;
        } else {
            j2 = 0;
        }
        i q = this.f79007a.q();
        if (q != null) {
            str = q.f83217d;
        }
        if (str != null) {
            aVar.f79012a = 0;
            String str2 = this.f79007a.q().f83217d;
            com.ss.android.ugc.aweme.cs.d.b.a aVar3 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar3.a(aVar);
            aVar3.a(str2);
            j2 += aVar.f79012a;
        }
        long a2 = j2 + a(this.f79007a.f83187h);
        EffectListModel effectListModel = this.f79007a.E;
        if (!(effectListModel == null || (effectPointModels = effectListModel.getEffectPointModels()) == null || (g2 = n.g((Iterable) effectPointModels)) == null)) {
            ArrayList<EffectPointModel> arrayList = new ArrayList();
            for (Object obj : g2) {
                if (((EffectPointModel) obj).getResDir() != null) {
                    arrayList.add(obj);
                }
            }
            for (EffectPointModel effectPointModel : arrayList) {
                aVar.f79012a = 0;
                com.ss.android.ugc.aweme.cs.d.b.a aVar4 = new com.ss.android.ugc.aweme.cs.d.b.a();
                aVar4.a(aVar);
                aVar4.a(effectPointModel.getResDir());
                a2 += aVar.f79012a;
            }
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar = this.f79007a.W.M;
        if (dVar == null || dVar.mvResUnzipPath == null) {
            return a2;
        }
        String str3 = this.f79007a.W.M.mvResUnzipPath;
        aVar.f79012a = 0;
        com.ss.android.ugc.aweme.cs.d.b.a aVar5 = new com.ss.android.ugc.aweme.cs.d.b.a();
        aVar5.a(aVar);
        aVar5.a(str3);
        return a2 + aVar.f79012a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }
}
