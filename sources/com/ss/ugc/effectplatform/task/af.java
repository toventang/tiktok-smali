package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import d.a.d.a.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class af extends a<InfoStickerListResponse, InfoStickerListResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153744c;

    /* renamed from: d  reason: collision with root package name */
    private final int f153745d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153746f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153747g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f153748h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f153749i;

    /* renamed from: j  reason: collision with root package name */
    private final String f153750j = null;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, String> f153751k = null;

    /* renamed from: l  reason: collision with root package name */
    private final String f153752l;

    static {
        Covode.recordClassIndex(102557);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153744c, true);
        a2.put("creation_id", this.f153746f);
        a2.put("source", String.valueOf(this.f153745d));
        a2.put("image_uri", this.f153747g);
        Integer num = this.f153748h;
        if (num != null) {
            a2.put("count", String.valueOf(num.intValue()));
        }
        Integer num2 = this.f153749i;
        if (num2 != null) {
            a2.put("cursor", String.valueOf(num2.intValue()));
        }
        String str = this.f153750j;
        if (str != null) {
            a2.put("library", str);
        }
        Map<String, String> map = this.f153751k;
        if (map != null && !map.isEmpty()) {
            a2.putAll(this.f153751k);
        }
        return new e(p.a(a2, this.f153744c.A + this.f153744c.f153401a + "/sticker/recommend"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ InfoStickerListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (InfoStickerListResponse) bVar.f153430a.convertJsonToObj(str, InfoStickerListResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, InfoStickerListResponse infoStickerListResponse) {
        List<InfoStickerEffect> list;
        String str;
        InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
        l.c(infoStickerListResponse2, "");
        String str2 = this.f153744c.f153409i;
        InfoStickerListModel data = infoStickerListResponse2.getData();
        if (data != null) {
            list = data.getSticker_list();
        } else {
            list = null;
        }
        l.c(str2, "");
        if (list != null) {
            for (T t : list) {
                Integer source = t.getSource();
                if (source != null) {
                    if (source.intValue() == 1) {
                        t.getLoki_effect().setZipPath(str2 + d.f156619a + t.getLoki_effect().getId() + ".zip");
                        t.getLoki_effect().setUnzipPath(str2 + d.f156619a + t.getLoki_effect().getId());
                        j.a(str2, t.getLoki_effect());
                    } else if (source.intValue() == 2) {
                        String a2 = j.a(t.getSticker());
                        if (a2 != null) {
                            int a3 = h.m.p.a((CharSequence) a2, "/");
                            int a4 = h.m.p.a((CharSequence) a2, ".");
                            if (a3 > 0 && a4 > a3) {
                                str = a2.substring(a4, a2.length());
                                l.a((Object) str, "");
                                t.getSticker().setPath(str2 + d.f156619a + t.getSticker().getId() + str);
                            }
                        }
                        str = "";
                        t.getSticker().setPath(str2 + d.f156619a + t.getSticker().getId() + str);
                    }
                }
            }
        }
        super.a(j2, j3, j4, infoStickerListResponse2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(a aVar, int i2, String str, String str2, Integer num, Integer num2, String str3) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str3);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f153744c = aVar;
        this.f153745d = i2;
        this.f153746f = str;
        this.f153747g = str2;
        this.f153748h = num;
        this.f153749i = num2;
        this.f153752l = str3;
    }
}
