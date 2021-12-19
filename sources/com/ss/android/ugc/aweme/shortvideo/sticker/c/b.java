package com.ss.android.ugc.aweme.shortvideo.sticker.c;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.gson.t;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f130233b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final g f130234a;

    /* renamed from: g  reason: collision with root package name */
    private final h f130235g = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(85428);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85429);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.b$b  reason: collision with other inner class name */
    public static final class C3393b extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(85430);
        }

        C3393b() {
        }
    }

    static final class c extends m implements h.f.a.a<float[]> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ float[] invoke() {
            long j2;
            b bVar = this.this$0;
            g gVar = bVar.f130234a;
            if (gVar != null) {
                j2 = gVar.av();
            } else {
                j2 = 0;
            }
            List<NormalTrackTimeStamp> a2 = bVar.a(j2, bVar.f130389e);
            if (a2 == null || a2.isEmpty() || a2.get(0) == null) {
                return null;
            }
            NormalTrackTimeStamp normalTrackTimeStamp = a2.get(0);
            if (normalTrackTimeStamp == null) {
                l.b();
            }
            RectF a3 = bVar.a(normalTrackTimeStamp);
            float[] fArr = {a3.left, a3.top, a3.right, a3.top, a3.left, a3.bottom, a3.right, a3.bottom};
            Matrix matrix = new Matrix();
            NormalTrackTimeStamp normalTrackTimeStamp2 = a2.get(0);
            if (normalTrackTimeStamp2 == null) {
                l.b();
            }
            matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
            matrix.mapPoints(fArr);
            return fArr;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(j2, interactStickerStruct);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        com.ss.android.ugc.aweme.sticker.i iVar4;
        l.d(bVar, "");
        if (!com.ss.android.ugc.aweme.l.a.a.a(this.f130388d.a(), 1200)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.i(this.f130388d.hashCode()));
            d dVar = new d();
            j jVar = this.f130390f;
            String str6 = null;
            if (jVar == null || (iVar4 = jVar.r) == null) {
                str = null;
            } else {
                str = iVar4.f134903c;
            }
            d a2 = dVar.a("group_id", str);
            j jVar2 = this.f130390f;
            if (jVar2 == null || (iVar3 = jVar2.r) == null) {
                str2 = null;
            } else {
                str2 = iVar3.f134902b;
            }
            d a3 = a2.a("author_id", str2);
            j jVar3 = this.f130390f;
            if (jVar3 == null || (iVar2 = jVar3.r) == null) {
                str3 = null;
            } else {
                str3 = iVar2.f134904d;
            }
            d a4 = a3.a("log_pb", str3);
            j jVar4 = this.f130390f;
            if (jVar4 == null || (iVar = jVar4.r) == null) {
                str4 = null;
            } else {
                str4 = iVar.f134901a;
            }
            r.a("sticker_click", a4.a("enter_from", str4).a("sticker_type", "donation").f66730a);
            try {
                GsonProvider c2 = GsonHolder.c();
                l.b(c2, "");
                HashMap hashMap = (HashMap) c2.b().a(this.f130389e.getAttr(), new C3393b().type);
                if (hashMap != null) {
                    str5 = (String) hashMap.get("donation_url");
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    if (str5 == null) {
                        l.b();
                    }
                    IDonationService b2 = DonationServiceImpl.b();
                    Context context = this.f130387c;
                    j jVar5 = this.f130390f;
                    if (jVar5 != null) {
                        str6 = jVar5.f134923d;
                    }
                    b2.a(context, str6, str5);
                    return;
                }
                View a5 = this.f130388d.a();
                if (a5 != null) {
                    new com.bytedance.tux.g.b(a5).a(this.f130387c.getString(R.string.bb3)).b();
                }
            } catch (t e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, InteractStickerStruct interactStickerStruct, j jVar, g gVar) {
        super(context, aVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(interactStickerStruct, "");
        this.f130234a = gVar;
    }
}
