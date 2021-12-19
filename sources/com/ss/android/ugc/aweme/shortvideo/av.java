package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.i;
import com.bytedance.creativex.recorder.b.a.n;
import com.bytedance.creativex.recorder.b.a.z;
import com.google.c.a.j;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.v;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import com.ss.android.ugc.aweme.tools.h;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.runtime.d;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class av implements n {

    /* renamed from: a  reason: collision with root package name */
    ASCameraView f124971a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoContextViewModel f124972b;

    /* renamed from: c  reason: collision with root package name */
    long f124973c;

    /* renamed from: d  reason: collision with root package name */
    int f124974d;

    /* renamed from: e  reason: collision with root package name */
    int f124975e;

    /* renamed from: f  reason: collision with root package name */
    e f124976f;

    /* renamed from: g  reason: collision with root package name */
    final z f124977g;

    /* renamed from: h  reason: collision with root package name */
    final g f124978h;

    /* renamed from: i  reason: collision with root package name */
    final ShortVideoContext f124979i;

    /* renamed from: j  reason: collision with root package name */
    final c f124980j;

    /* renamed from: k  reason: collision with root package name */
    List<i> f124981k = new ArrayList();

    static {
        Covode.recordClassIndex(82100);
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(h hVar) {
        if (this.f124972b.b()) {
            q.d("VideoRecordActivity hasGoNext true return");
            return;
        }
        if (!this.f124979i.f124757b.f124714i) {
            long a2 = di.a();
            if (this.f124979i.f124757b.c()) {
                a2 = this.f124979i.f124757b.f124707b;
            }
            if (this.f124979i.c()) {
                a2 = 3000;
            }
            if (this.f124979i.f124757b.h() < a2) {
                if (!this.f124979i.f124757b.b() && !this.f124979i.f124757b.c()) {
                    new a(this.f124976f).a(R.string.haj).a();
                }
                if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(this.f124979i)) {
                    new a(this.f124976f).a(R.string.haj).a();
                }
                this.f124978h.U();
                gr.a("record_error", "3", "is short");
                return;
            }
        }
        for (int i2 = 0; i2 < this.f124981k.size(); i2++) {
            if (this.f124981k.get(i2).a(hVar)) {
                q.d("VideoRecordActivity interceptor handle return");
                this.f124978h.U();
                return;
            }
        }
        q.d("VideoRecordActivity setHasGoNext true");
        this.f124972b.b(true);
        b.a.f132249a.start("av_video_edit", "showProgressDialog");
        this.f124973c = System.currentTimeMillis();
        if (this.f124979i.f124757b.u == 1) {
            this.f124971a.c(true);
        } else if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(this.f124979i)) {
            this.f124971a.b(this.f124979i.f124757b.f124717l);
        }
        if (cr.a().f125295a == null && this.f124979i.O && bz.a(this.f124979i)) {
            this.f124971a.b(true);
        }
        if (this.f124979i.c() || this.f124979i.f124757b.c() || this.f124979i.f124757b.i()) {
            if (this.f124979i.f124757b.f124717l) {
                this.f124971a.c(false);
            } else {
                this.f124971a.c(true);
            }
        }
        b.a.f132249a.step("av_video_edit", "startConcat");
        this.f124977g.aq();
        a.C3440a aVar = new a.C3440a();
        aVar.f132972a = this.f124979i.f124757b.f124713h.a().getPath();
        aVar.f132973b = this.f124979i.f124757b.f124713h.b().getPath();
        aVar.f132976e = this.f124971a.getMediaController();
        aVar.f132975d = this.f124979i.G;
        aVar.f132978g = !this.f124979i.c();
        aVar.f132979h = d.b().a();
        aVar.f132977f = v.a();
        aVar.f132974c = com.ss.android.ugc.aweme.shortvideo.i.n.a(this.f124976f, this.f124979i);
        aVar.a(new aw(this));
        this.f124974d++;
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(i iVar) {
        this.f124981k.add(iVar);
    }

    public static t<j<d>> a(ShortVideoContext shortVideoContext) {
        return t.a(new bb(shortVideoContext));
    }

    public static void b(ShortVideoContext shortVideoContext) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = shortVideoContext.f124757b.j().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getBubbleTexts() != null) {
                linkedHashSet.addAll(timeSpeedModelExtension.getBubbleTexts());
            }
            if (timeSpeedModelExtension.getARTexts() != null) {
                linkedHashSet2.addAll(timeSpeedModelExtension.getARTexts());
                if (linkedHashSet.size() == 0) {
                    linkedHashSet.addAll(timeSpeedModelExtension.getARTexts());
                }
            }
        }
        shortVideoContext.at.addAll(linkedHashSet);
        shortVideoContext.aq.addAll(linkedHashSet2);
    }

    public static List<AVChallenge> a(ArrayList<TimeSpeedModelExtension> arrayList, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(cr.a().f125298d);
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (!k.a(next.getHashtag())) {
                for (AVChallenge aVChallenge : next.getHashtag()) {
                    if (TextUtils.isEmpty(aVChallenge.cid)) {
                        q.b("try to add challenge, but cid is null ,name:" + aVChallenge.challengeName + ",stickerId:" + aVChallenge.stickerId);
                    }
                    linkedHashSet.add(aVChallenge);
                }
            }
        }
        linkedHashSet.removeAll(Collections.singleton(null));
        if (z) {
            linkedHashSet.removeAll(cr.a().f125298d);
        }
        return new ArrayList(linkedHashSet);
    }

    private static void b(Context context, ShortVideoContext shortVideoContext) {
        Object obj;
        if (shortVideoContext.S != null && shortVideoContext.S.getSharedARMultiPlayerUserId() != null && shortVideoContext.S.getSharedARMultiPlayerUserName() != null) {
            String sharedARTelco = shortVideoContext.S.getSharedARTelco();
            if (sharedARTelco != null) {
                obj = sharedARTelco + "5G";
            } else {
                obj = "";
            }
            String sharedARMultiPlayerUserName = shortVideoContext.S.getSharedARMultiPlayerUserName();
            String string = context.getString(R.string.fve, obj, sharedARMultiPlayerUserName);
            String sharedARMultiPlayerUserId = shortVideoContext.S.getSharedARMultiPlayerUserId();
            if (string.endsWith(sharedARMultiPlayerUserName)) {
                string = string + " ";
            }
            int indexOf = string.indexOf(sharedARMultiPlayerUserName);
            ArrayList arrayList = new ArrayList();
            arrayList.add(AVTextExtraStructHelper.createAtStruct(indexOf, sharedARMultiPlayerUserName.length() + indexOf, sharedARMultiPlayerUserId, null));
            shortVideoContext.K = arrayList;
            shortVideoContext.H = string;
            shortVideoContext.I = string;
            shortVideoContext.J = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.av.a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0181, code lost:
        if (r9 != null) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12) {
        /*
        // Method dump skipped, instructions count: 604
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.av.a(android.content.Context, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public static EditPreviewInfo a(ShortVideoContext shortVideoContext, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        EditPreviewInfo a2;
        int i2;
        DuetContext duetContext;
        if (multiEditVideoStatusRecordData == null || shortVideoContext.c()) {
            a2 = new com.ss.android.ugc.aweme.shortvideo.edit.model.h().a(new EditVideoSegment(str, str2, com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(str)));
        } else {
            int i3 = shortVideoContext.f124757b.f124708c;
            if (!shortVideoContext.f124757b.b() || (duetContext = shortVideoContext.f124757b.o) == null || !l.a((Object) duetContext.o, (Object) DuetContext.y)) {
                i2 = shortVideoContext.f124757b.f124709d;
            } else {
                i2 = shortVideoContext.f124757b.f124709d / 2;
            }
            a2 = new com.ss.android.ugc.aweme.shortvideo.edit.model.d(i3, i2).a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
        }
        if (!(shortVideoContext.F.f124773a == null || shortVideoContext.F.f124773a.getVideoSegment() == null)) {
            a2.getVideoList().add(0, shortVideoContext.F.f124773a.getVideoSegment());
            shortVideoContext.F.f124773a.setConcatVideoPath(str);
            shortVideoContext.F.f124773a.setConcatAudioPath(str2);
        }
        return a2;
    }

    private static void a(Context context, ShortVideoContext shortVideoContext, User user, String str) {
        String str2 = "@" + ep.a(user);
        String string = context.getString(R.string.esc, str2);
        if (string.endsWith(str2)) {
            string = string + " ";
        }
        int indexOf = string.indexOf(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AVTextExtraStructHelper.createDuetStruct(indexOf, str2.length() + indexOf, user.getUid(), str));
        shortVideoContext.K = arrayList;
        shortVideoContext.H = string;
        shortVideoContext.I = string;
        shortVideoContext.J = true;
    }

    public av(e eVar, z zVar, g gVar, ShortVideoContext shortVideoContext, c cVar) {
        this.f124976f = eVar;
        this.f124977g = zVar;
        this.f124978h = gVar;
        this.f124971a = zVar.D();
        this.f124979i = shortVideoContext;
        this.f124980j = cVar;
        this.f124972b = (ShortVideoContextViewModel) ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class);
    }
}
