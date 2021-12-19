package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class a extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<com.ss.android.ugc.aweme.video.hashtag.b> {
    public static final C3320a C = new C3320a((byte) 0);

    static {
        Covode.recordClassIndex(83671);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a$a  reason: collision with other inner class name */
    public static final class C3320a {
        static {
            Covode.recordClassIndex(83672);
        }

        private C3320a() {
        }

        public /* synthetic */ C3320a(byte b2) {
            this();
        }
    }

    public static final class d extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83675);
        }

        d() {
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127635a;

        static {
            Covode.recordClassIndex(83673);
        }

        b(a aVar) {
            this.f127635a = aVar;
        }

        public final void run() {
            g gVar = this.f127635a.f127193l;
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    private static String u() {
        return "ht_start" + UUID.randomUUID().toString() + "ht_end";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final String p() {
        String p = super.p();
        l.b(p, "");
        int a2 = p.a((CharSequence) p, "/effect/hashtag_stickers", 0, false, 6);
        if (a2 <= 0) {
            return p;
        }
        String substring = p.substring(0, a2);
        l.b(substring, "");
        return substring;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f127640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f127642c;

        static {
            Covode.recordClassIndex(83674);
        }

        c(g gVar, InteractStickerStruct interactStickerStruct, a aVar) {
            this.f127640a = gVar;
            this.f127641b = interactStickerStruct;
            this.f127642c = aVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView;
            g gVar = this.f127640a;
            if (!(gVar instanceof d)) {
                gVar = null;
            }
            e eVar = (e) gVar;
            if (!(eVar == null || (mBaseView = eVar.getMBaseView()) == null)) {
                mBaseView.a(false);
            }
            this.f127642c.a(this.f127640a, this.f127641b);
            this.f127640a.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a
    public final List<String> q() {
        String str;
        HashtagStruct hashTagStruct;
        ArrayList arrayList = new ArrayList(this.f127194m.size());
        for (g gVar : this.f127194m) {
            if (!(gVar instanceof d)) {
                gVar = null;
            }
            d dVar = (d) gVar;
            if (dVar == null || (hashTagStruct = dVar.getHashTagStruct()) == null || (str = hashTagStruct.getHashtagName()) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        l.d(videoPublishEditModel, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final g a(Context context) {
        d dVar = new d(context);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(float f2) {
        for (g gVar : this.f127194m) {
            l.b(gVar, "");
            gVar.setAlpha(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a
    public final List<InteractStickerStruct> a(List<? extends StickerItemModel> list) {
        g gVar;
        l.d(list, "");
        ArrayList arrayList = new ArrayList(this.f127194m.size());
        for (g gVar2 : this.f127194m) {
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(9);
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            l.b(gVar2, "");
            normalTrackTimeStamp.setRotation(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar2.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(gVar2.getScale()));
            PointF a2 = a(gVar2.getCenterViewPoint());
            normalTrackTimeStamp.setX(a2.x);
            normalTrackTimeStamp.setY(a2.y);
            normalTrackTimeStamp.setStartTime(0.0f);
            normalTrackTimeStamp.setEndTime(0.0f);
            PointF a3 = a(new PointF((float) gVar2.getContentViewWidth(), (float) gVar2.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(a3.x);
            normalTrackTimeStamp.setHeight(a3.y);
            linkedList.add(normalTrackTimeStamp);
            com.ss.android.ugc.aweme.editSticker.f.e.a(interactStickerStruct, linkedList);
            if (!(gVar2 instanceof d)) {
                gVar = null;
            } else {
                gVar = gVar2;
            }
            d dVar = (d) gVar;
            if (dVar != null) {
                interactStickerStruct.setHashtagInfo(dVar.getHashTagStruct());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("hashtag_sticker_id", ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127582a);
            interactStickerStruct.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel.viewHash == gVar2.hashCode()) {
                    interactStickerStruct.setIndex(stickerItemModel.layerWeight);
                }
            }
            arrayList.add(interactStickerStruct);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(String str) {
        if (str != null && str.length() != 0) {
            if (!p.a((CharSequence) str, (CharSequence) "ht_start", false) || !p.a((CharSequence) str, (CharSequence) "ht_end", false)) {
                String str2 = File.separator;
                l.b(str2, "");
                if (p.c(str, str2, false)) {
                    super.a(str + u());
                } else {
                    super.a(str + u());
                }
            } else {
                super.a(new h.m.l("ht_start(.*?)ht_end").replace(str, u()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        if (interactStickerStruct != null) {
            ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127582a = (String) ((HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new d().type)).get("hashtag_sticker_id");
            HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
            a(true);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
            ((d) gVar).a(((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127583b, hashtagInfo);
            g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            g gVar3 = this.f127193l;
            l.b(gVar3, "");
            gVar3.postDelayed(new c(gVar3, interactStickerStruct, this), 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.f
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d<com.ss.android.ugc.aweme.video.hashtag.b> dVar, boolean z) {
        boolean z2;
        String str;
        AVChallenge aVChallenge;
        l.d(dVar, "");
        String content = dVar.getContent();
        if (content == null || content.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar = this.n;
            if (aVar != null) {
                aVar.f();
            }
            d();
            this.f127193l = ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).A;
            ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).A = null;
            return;
        }
        com.ss.android.ugc.aweme.video.hashtag.b curModel = dVar.getCurModel();
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (curModel == null || (aVChallenge = curModel.f143397a) == null || (str = aVChallenge.challengeName) == null) {
            str = "";
        }
        r.a("add_tag_prop", bVar.a("tag_name", str).a("auto_tag", 0).a("creation_id", this.B.creationId).f149193a);
        if (this.f127193l == null) {
            a(false, false);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            ((e) gVar).a(frameLayout, dVar);
        } else {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.a aVar2 = this.n;
            if (aVar2 != null) {
                aVar2.f();
            }
        }
        if (this.f127193l instanceof d) {
            g gVar2 = this.f127193l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
            ((e) gVar2).a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d) dVar, false);
            this.f127193l.post(new b(this));
        }
        ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).A = null;
    }
}
