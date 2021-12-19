package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
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

public final class b extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<User> {
    public static final a C = new a((byte) 0);

    static {
        Covode.recordClassIndex(83719);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83720);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83723);
        }

        d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b$b  reason: collision with other inner class name */
    static final class RunnableC3326b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127736a;

        static {
            Covode.recordClassIndex(83721);
        }

        RunnableC3326b(b bVar) {
            this.f127736a = bVar;
        }

        public final void run() {
            g gVar = this.f127736a.f127193l;
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    private static String u() {
        return "mtn_start" + UUID.randomUUID().toString() + "mtn_end";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final String p() {
        String p = super.p();
        l.b(p, "");
        int a2 = p.a((CharSequence) p, "/effect/mention_stickers", 0, false, 6);
        if (a2 <= 0) {
            return p;
        }
        String substring = p.substring(0, a2);
        l.b(substring, "");
        return substring;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f127751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f127753c;

        static {
            Covode.recordClassIndex(83722);
        }

        c(g gVar, InteractStickerStruct interactStickerStruct, b bVar) {
            this.f127751a = gVar;
            this.f127752b = interactStickerStruct;
            this.f127753c = bVar;
        }

        public final void run() {
            g gVar = this.f127751a;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView = ((e) gVar).getMBaseView();
            if (mBaseView != null) {
                mBaseView.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d) false);
            }
            this.f127753c.a(this.f127751a, this.f127752b);
            ((d) this.f127751a).setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a
    public final List<String> q() {
        String str;
        MentionStruct mentionStruct;
        ArrayList arrayList = new ArrayList(this.f127194m.size());
        for (g gVar : this.f127194m) {
            if (!(gVar instanceof d)) {
                gVar = null;
            }
            d dVar = (d) gVar;
            if (dVar == null || (mentionStruct = dVar.getMentionStruct()) == null || (str = mentionStruct.getUsername()) == null) {
                str = "";
            }
            l.b(str, "");
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(VideoPublishEditModel videoPublishEditModel) {
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
            interactStickerStruct.setType(8);
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
                interactStickerStruct.setMentionInfo(dVar.getMentionStruct());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mention_sticker_id", ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127582a);
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
            if (!p.a((CharSequence) str, (CharSequence) "mtn_start", false) || !p.a((CharSequence) str, (CharSequence) "mtn_end", false)) {
                String str2 = File.separator;
                l.b(str2, "");
                if (p.c(str, str2, false)) {
                    super.a(str + u());
                } else {
                    super.a(str + u());
                }
            } else {
                super.a(new h.m.l("mtn_start(.*?)mtn_end").replace(str, u()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        if (interactStickerStruct != null) {
            ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127582a = (String) ((HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new d().type)).get("mention_sticker_id");
            MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
            a(true);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            ((d) gVar).a(((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).f127583b, mentionInfo);
            g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            g gVar3 = this.f127193l;
            l.b(gVar3, "");
            gVar3.postDelayed(new c(gVar3, interactStickerStruct, this), 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.f
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d<User> dVar, boolean z) {
        boolean z2;
        String str;
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
        User curModel = dVar.getCurModel();
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (curModel == null || (str = curModel.getUid()) == null) {
            str = "";
        }
        r.a("add_at_prop", bVar.a("to_user_id", str).a("auto_at", 0).a("creation_id", this.B.creationId).f149193a);
        if (this.f127193l == null) {
            a(false);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
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
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            ((e) gVar2).a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d) dVar, false);
            dVar.post(new RunnableC3326b(this));
        }
        ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a) this).A = null;
    }
}
