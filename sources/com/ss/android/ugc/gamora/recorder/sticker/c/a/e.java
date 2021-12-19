package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class e implements com.ss.android.ugc.gamora.recorder.sticker.c.e {

    /* renamed from: a  reason: collision with root package name */
    public FaceStickerBean f148350a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f148351b;

    /* renamed from: c  reason: collision with root package name */
    private a f148352c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f148353d;

    /* renamed from: e  reason: collision with root package name */
    private final j f148354e;

    static {
        Covode.recordClassIndex(97764);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.e
    public final void a() {
        List<InteractStickerStruct> stickerStructsByPage;
        Map map;
        NormalTrackTimeStamp[] normalTrackTimeStampArr;
        if (this.f148352c == null) {
            a aVar = new a();
            if (this.f148353d.f124757b.b() || this.f148353d.f124757b.c() || this.f148353d.c()) {
                aVar.f127577c = false;
            }
            if (!m.a(this.f148353d.af.f124733a)) {
                String str = this.f148353d.af.f124733a;
                int i2 = (int) this.f148353d.f124757b.f124712g;
                if (aVar.f127577c) {
                    aVar.f127580f = i2;
                    d dVar = d.TRACK_PAGE_RECORD;
                    c a2 = b.a(str);
                    if (a2 == null) {
                        stickerStructsByPage = null;
                    } else {
                        stickerStructsByPage = a2.getStickerStructsByPage(dVar);
                    }
                    if (!com.bytedance.common.utility.collection.b.a((Collection) stickerStructsByPage)) {
                        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                            if (interactStickerStruct.getType() == 2 && !m.a(interactStickerStruct.getAttr()) && !m.a(interactStickerStruct.getTrackList()) && (map = (Map) com.ss.android.ugc.aweme.port.in.c.w.getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), Map.class)) != null && map.containsKey("interaction_extra")) {
                                try {
                                    RecordInteractExtra recordInteractExtra = (RecordInteractExtra) com.ss.android.ugc.aweme.port.in.c.w.getRetrofitFactoryGson().a(new JSONObject((Map) map.get("interaction_extra")).toString(), RecordInteractExtra.class);
                                    if (!(recordInteractExtra == null || m.a(recordInteractExtra.getStickerId()) || (normalTrackTimeStampArr = (NormalTrackTimeStamp[]) com.ss.android.ugc.aweme.port.in.c.w.getRetrofitFactoryGson().a(interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class)) == null || normalTrackTimeStampArr.length == 0)) {
                                        aVar.f127578d.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        aVar.f127579e.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
            this.f148352c = aVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.e
    public final void a(List<String> list) {
        this.f148351b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (h.m.p.b(r1, "http", false) == false) goto L_0x0082;
     */
    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.c.a.e.a(int):void");
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.e
    public final void a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        a aVar = this.f148352c;
        if (aVar != null && aVar.f127577c) {
            int i2 = (int) shortVideoContext.f124757b.f124712g;
            if (aVar.f127577c && i2 - aVar.f127580f < -10) {
                aVar.a(i2);
                aVar.f127580f = i2;
            }
            LinkedList linkedList = new LinkedList();
            int i3 = 0;
            for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : aVar.f127578d.entrySet()) {
                ExtraParams extraParams = aVar.f127579e.get(entry.getKey());
                List<NormalTrackTimeStamp> value = entry.getValue();
                if (!com.bytedance.common.utility.collection.b.a((Collection) value) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, entry.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(com.ss.android.ugc.aweme.port.in.c.w.getRetrofitFactoryGson().b(linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i3);
                    interactStickerStruct.setTrackList(com.ss.android.ugc.aweme.port.in.c.w.getRetrofitFactoryGson().b(value));
                    linkedList.add(interactStickerStruct);
                    i3++;
                }
            }
            shortVideoContext.af.f124733a = b.a(shortVideoContext.af.f124733a, linkedList, d.TRACK_PAGE_RECORD, aVar.f127581g);
        }
    }

    public e(ShortVideoContext shortVideoContext, j jVar) {
        l.d(shortVideoContext, "");
        l.d(jVar, "");
        this.f148353d = shortVideoContext;
        this.f148354e = jVar;
    }
}
